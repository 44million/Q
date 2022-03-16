package core.lang;

import core.etc.*;
import core.interp.QBaseVisitor;
import core.interp.QLexer;
import core.interp.QParser;
import core.lang.q.QClass;
import core.lang.q.QObject;
import core.lang.q.Value;
import core.libs.AWT.Window;
import core.libs.GTP;
import core.libs.OS;
import core.libs.WebServer;
import core.libs.utils.HTTP;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import javax.swing.*;
import java.io.*;
import java.lang.String;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

import static core.interp.QParser.*;

public class Visitor extends QBaseVisitor<Value> {
    private static final RVal returnValue = new RVal();
    public final Map<String, Function> functions;
    public Scope scope;
    public boolean lib;
    public boolean sore;

    public Visitor(Scope scope, Map<String, Function> functions) {
        this.scope = scope;
        this.functions = new HashMap<>(functions);
    }

    @Override
    public Value visitSelfExpression(QParser.SelfExpressionContext ctx) {
        String id = ctx.varHereStatement().Identifier().getText();
        return this.scope.parent().parent().vars.getOrDefault(id, Value.NULL);
    }

    @Override
    public Value visitAnonymousFunctionExpression(QParser.AnonymousFunctionExpressionContext ctx) {
        Scope s = new Scope(this.scope, true);
        Visitor v = new Visitor(s, this.functions);
        v.visit(ctx.anonymousFunction().block());
        return Value.VOID;
    }

    @Override
    public Value visitObjVarExpression(QParser.ObjVarExpressionContext ctx) {
        // obj::var
        return this.visit(ctx.objVar());
    }

    @Override
    public Value visitObjVar(QParser.ObjVarContext ctx) {
        // obj::var = value;
        // challenger::hp = 707;
        String obj = ctx.Identifier(0).getText();
        String var = ctx.Identifier(1).getText();

        QObject object = Environment.global.objs.getOrDefault(obj, QObject.NULL);

        Value val = Value.NULL;
        Visitor v = object.v;

        if (object.vars.containsKey(var)) {
            val = object.vars.get(var);
        }

        if (v.scope.parent().vars.containsKey(var)) {
            return v.scope.parent().vars.get(var);
        } else if (v.scope.parent().parent().vars.containsKey(var)) {
            return v.scope.parent().parent().vars.get(var);
        }

        return val;
    }

    @Override
    public Value visitObjFunctionCallExpression(QParser.ObjFunctionCallExpressionContext ctx) {

        String parentClass = ctx.Identifier(0).getText();
        String method = ctx.Identifier(1).getText();

        if (parentClass.equals("Files")) {

            util.check("files", "Files", ctx);

            switch (method) {
                case "absPath":

                    return core.libs.Files.absPath(ctx);

                case "here":

                    return new Value(System.getProperty("user.dir"));

                case "delete":

                    core.libs.Files.delete(ctx);

                case "canRead":

                    return core.libs.Files.canRead(ctx.exprList().expression(0).getText().replaceAll("\"", ""));

                case "size":

                    return core.libs.Files.size(ctx.exprList().expression(0).getText().replaceAll("\"", ""));

                case "exists":

                    return core.libs.Files.exists(ctx.exprList().expression(0).getText().replaceAll("\"", ""));

                default:

                    throw new Problem(parentClass + " does not contain a definition for '" + method + "'", ctx);

            }

        } else if (parentClass.equals("http")) {

            util.check("http", "http", ctx);

            if (method.equals("get")) {

                HTTP.get(ctx);

            }

        } else if (parentClass.equals("GTP")) {

            util.check("gtp", "gtp", ctx);

            if (ctx.exprList() == null) {
                throw new Problem("Parameter list is wrong", ctx);
            }

            int amount = this.visit(ctx.exprList().expression(0)).asDouble().intValue();
            String prefix = this.visit(ctx.exprList().expression(1)).asString();

            switch (method) {

                case "twp":
                    return new Value(new GTP().getText(amount, prefix));
                case "text":
                    return new Value(new GTP().getText(amount));
            }

        } else if (util.getWebByName(parentClass) != null) {

            if (method.equals("stop") && util.getWebByName(parentClass) != null) {
                util.getWebByName(parentClass).stop();
            } else {
                throw new Problem("Unknown method '" + method + "'", ctx);
            }

        } else if (Environment.global.objs.containsKey(parentClass)) {

            QObject obj = Environment.global.objs.get(parentClass);
            Visitor v = obj.v;

            List<Value> vals = new ArrayList<>();

            if (ctx.exprList() != null) {
                for (ExpressionContext ex : ctx.exprList().expression()) {
                    vals.add(v.visit(ex));
                }
            }

            if (obj.funcs.containsKey(method + vals.size())) {

                return obj.funcs.get(method + vals.size()).call(vals, new HashMap<>());

            } else {
                throw new Problem(Environment.global.objs.get(parentClass).qc.name + " does not contain a definition for '" + method + "'", ctx);
            }

        } else if (Environment.global.natives.containsKey(method)) {

            List<Value> l = new ArrayList<>();

            if (ctx.exprList() != null) {
                for (ExpressionContext c : ctx.exprList().expression()) {
                    l.add(this.visit(c));
                }
            }

            util.check(parentClass.toLowerCase(), parentClass, ctx);

            if (Environment.global.natives.get(method) == null) {
                throw new Problem(parentClass + " does not contain a definition for '" + method + "'", ctx);
            }

            if (l.size() >= 1) {
                if (Environment.global.natives.get(method).ret(l) != null) {
                    return Environment.global.natives.get(method).ret(l);
                } else {
                    Environment.global.natives.get(method).exec(l);
                }
            }

            if (Environment.global.natives.get(method).ret() != null) {
                return Environment.global.natives.get(method).ret();
            } else {
                Environment.global.natives.get(method).exec();
            }

        }

        return Value.VOID;
    }

    @Override
    public Value visitFunctionDecl(FunctionDeclContext ctx) {
        List<TerminalNode> params = ctx.idList() != null ? ctx.idList().Identifier() : new ArrayList<>();
        ParseTree block = ctx.block();
        String id = ctx.Identifier().getText() + params.size();

        try {
            if (this.functions.get(id).exists()) {
                throw new Problem("Function: '" + id + "' already exists.", ctx);
            }
        } catch (Exception e) {
            String s = e.getMessage();
            System.err.print(s);
        }

        Function f;

        if (ctx.Native(0) != null) {
            System.out.printf("Native function '%s' defined, enter Java code:\n", id);
            String jblock = new Scanner(System.in).next();
            f = new Function(jblock);
        } else {
            f = new Function(this.scope, params, block);
        }

        f.setV(this);

        if (ctx.Async(0) != null) {
            f.setAsync(true);
        }

        if (ctx.atStatement() != null) {
            this.visit(ctx.atStatement());
        }

        this.functions.put(id, f);
        return Value.VOID;
    }

    @Override
    public Value visitFileWriteStatement(QParser.FileWriteStatementContext ctx) {
        try {

            FileWriter fw = new FileWriter(Environment.global.files.get(ctx.Identifier().getText()));
            fw.write("");
            Value val;

            if (ctx.expression() != null) {
                val = this.visit(ctx.expression());
            } else {
                val = new Value("NULL");
            }

            fw.append(val.toString());
            fw.close();

        } catch (Exception e) {
            throw new Problem(e.getMessage(), ctx);
        }
        return Value.VOID;
    }

    @Override
    public Value visitVerifyFileStatement(QParser.VerifyFileStatementContext ctx) {

        Value xv = new Value(this.visit(ctx.expression()));

        if (new File(xv.asString()).exists()) {
            return new Value(true);
        }

        return new Value(false);
    }

    @Override
    public Value visitWindowRenderStatement(QParser.WindowRenderStatementContext ctx) {

        String id = ctx.Identifier().getText();

        if (util.getWinByName(id) == null) {
            return Value.VOID;
        } else {
            assert util.getWinByName(id) != null;
            if (util.getWinByName(id) != null) {
                util.getWinByName(id).init();
            }
        }
        return Value.VOID;
    }

    @Override
    public Value visitWindowAddCompStatement(QParser.WindowAddCompStatementContext ctx) {

        int line = ctx.start.getLine();
        int pos = ctx.start.getCharPositionInLine();

        String component = this.visit(ctx.expression()).asString();

        if (util.getWinByName(ctx.Identifier().getText()) == null) {
            throw new Problem("The specified window: " + ctx.Identifier().getText() + " does not exist!", ctx);
        } else {
            if (util.getCompByName(component) != null) {
                util.getCompByName(component).init(ctx.Identifier().getText());
            }
        }
        return Value.VOID;
    }

    @Override
    public Value visitOsExecStatement(QParser.OsExecStatementContext ctx) {

        String method = ctx.Identifier().getText();

        if (method.equals("exec") && ctx.expression() != null) {
            try {
                OS.execS(this.visit(ctx.expression()).asString());
            } catch (Exception e) {
                throw new Problem("Could not execute text: " + this.visit(ctx.expression()).asString() + " [" + e.getMessage() + "]", ctx);
            }
        } else if (method.equals("quit") && ctx.expression() != null) {

            if (ctx.expression() == null) {
                throw new Problem("Function 'sys.quit(:int) requires an argument", ctx);
            }

            int code = (this.visit(ctx.expression()).asDouble().intValue());
            System.exit(code);

        } else if (method.equals("halt")) {

            int time = (this.visit(ctx.expression()).asDouble().intValue());

            try {
                Thread.sleep(time);
            } catch (Exception e) {
                throw new Problem(e.getMessage(), ctx);
            }
        } else if (method.equals("destroy")) {

            String s = ctx.expression()
                    .getText()
                    .replaceAll("\"", "");

            if (Environment.global.objs.containsKey(s)) {
                Environment.global.objs.remove(s);
            } else {
                throw new Problem("Object: '" + s + "' does not exist.", ctx);
            }
        } else if (method.equals("parent")) {

            System.out.println(this + " instanceof " + QClass.OBJECT.name);

        } else if (method.equals("getProperty")) {

            if (ctx.expression() == null) {
                throw new Problem("'sys.getProperty' must take a :str object as a parameter", ctx);
            }

            Value v = this.visit(ctx.expression());

            return new Value(System.getProperty(v.asString()));

        } else {
            throw new Problem("Sys function '" + ctx.Identifier().getText() + "' not found", ctx);
        }
        return Value.VOID;
    }

    @Override
    public Value visitRandomExpression(QParser.RandomExpressionContext ctx) {

        if (ctx.expression() == null) {
            throw new Problem("System call 'sys.ran' requires a :str argument", ctx);
        }

        String s = this.visit(ctx.expression()).asString();

        switch (s) {
            case "int":
                return new Value(new Random().nextInt());
            case "str":
                return new Value(util.getSaltString());
            case "bool":
                int i = new Random().nextInt(2);

                if (i == 1) {
                    return new Value(true);
                } else {
                    return new Value(false);
                }

        }
        return Value.NULL;
    }

    @Override
    public Value visitMainFunctionStatement(QParser.MainFunctionStatementContext ctx) {

        Scope l = this.scope;
        int line = ctx.start.getLine();
        int pos = ctx.start.getCharPositionInLine();

        while (l != null) {
            if (l.lib) {
                throw new Problem("Library files cannot contain a function 'main'.\nPlease either remove the '@header' statement, or rename the function.", ctx);
            } else {
                l = l.parent();
            }
        }

        if (!Environment.global.hasMainExecuted) {
            Environment.global.hasMainExecuted = true;
            this.visit(ctx.block());
            return Value.VOID;
        } else {
            System.out.println("[FATAL " + line + ":" + pos + "] Main function has already been called.");
            System.exit(0);
        }
        return Value.VOID;
    }

    @Override
    public Value visitTryCatchStatement(QParser.TryCatchStatementContext ctx) {

        try {
            this.visit(ctx.block(0));
        } catch (Exception e) {
            this.visit(ctx.block(1));
        }
        return Value.VOID;
    }

    @Override
    public Value visitAddWebServerTextStatement(QParser.AddWebServerTextStatementContext ctx) {

        Value resp = this.visit(ctx.expression());
        String id = ctx.Identifier().getText();

        for (WebServer w : Environment.global.webs) {
            if (w.id.equals(id)) {
                w.setText(resp.asString());
                return Value.VOID;
            }
        }

        throw new Problem("Object '" + id + "' does not exist in the current context", ctx);
    }

    @Override
    public Value visitToIntFunctionCall(QParser.ToIntFunctionCallContext ctx) {

        int i = 0;
        Value x = this.visit(ctx.expression());

        if (x.isString()) {

            try {
                i = Integer.parseInt(x.asString());
            } catch (Exception e) {

                String err = "Could not cast to integer " + e.getMessage().replace("F", "f");
                throw new Problem(err, ctx);
            }

        } else if (x.isNumber()) {
            throw new Problem("'" + x + "' is already an integer value.", ctx);
        } else if (x.isList()) {
            throw new Problem("Incompatible cast: List to Integer", ctx);
        } else if (x.isBoolean()) {
            throw new Problem("Incompatible cast: Boolean to Integer", ctx);
        } else if (x.isNull()) {
            throw new Problem("null values cannot be cast ", ctx);
        } else if (x.isVoid()) {
            throw new Problem("void values cannot be cast", ctx);
        }

        double d = i;

        return new Value(d);
    }

    @Override
    public Value visitList(ListContext ctx) {
        List<Value> list = new ArrayList<>();
        if (ctx.exprList() != null) {
            for (ExpressionContext ex : ctx.exprList().expression()) {
                list.add(this.visit(ex));
            }
        }
        return new Value(list);
    }

    @Override
    public Value visitImportFromGithubStatement(QParser.ImportFromGithubStatementContext ctx) {

        Value o = this.visit(ctx.expression());

        String link = o.asString();

        link = link
                .replace("https://github.com/", "https://raw.githubusercontent.com/")
                .replace("/blob", "");


        String fileContents = util.getTextFromGithub(link);

        Parser parser = new Parser().fromText(fileContents);
        try {
            parser.parse(false);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return Value.VOID;
    }

    @Override
    public Value visitImportStatement(ImportStatementContext ctx) {

        StringBuilder path = new StringBuilder();
        StringBuilder text = new StringBuilder();

        for (TerminalNode o : ctx.Identifier()) {
            path.append("/").append(o.getText());
        }

        for (TerminalNode o : ctx.Identifier()) {
            text.append(".").append(o.getText());
        }

        if (Environment.global.allLibs.contains(text.toString().replace(".q.", "").toLowerCase(Locale.ROOT))) {
            util.parse(text.toString());
            return Value.VOID;
        }

        for (File f : Environment.global.parsed) {
            Path currentRelativePath = Paths.get("");
            String currentPath = currentRelativePath.toAbsolutePath().toString();

            File file = new File(currentPath + "/" + path + ".l");
            if (f.getPath().equals(file.getPath())) {
                return null;
            }
        }

        QLexer lexer;
        Path currentRelativePath = Paths.get("");
        String currentPath = currentRelativePath.toAbsolutePath().toString();

        File file = new File(currentPath + "/" + path + ".l");
        Environment.global.parsed.add(file);

        try {

            lexer = new QLexer(CharStreams.fromFileName(currentPath + "/" + path + ".l"));
        } catch (IOException e) {
            throw new Problem("Library or File not found: " + path, ctx);
        }

        QParser parser = new QParser(new CommonTokenStream(lexer));
        parser.setBuildParseTree(true);
        ParseTree tree = parser.parse();

        Scope s = new Scope(Environment.global.scope, false);
        Visitor v = new Visitor(s, new HashMap<>());

        v.visit(tree);

        return Value.VOID;
    }

    @Override
    public Value visitForInStatement(QParser.ForInStatementContext ctx) {

        int to = this.visit(ctx.expression()).asDouble().intValue();
        for (int i = 0; i <= to; i++) {
            scope.varAssign(ctx.Identifier().getText(), new Value(i));
            Value returnValue = this.visit(ctx.block());
            if (returnValue != Value.VOID) {
                return returnValue;
            }
        }
        return Value.VOID;
    }

    @Override
    public Value visitObjCreateStatement(QParser.ObjCreateStatementContext ctx) {

        String parentClass = ctx.Identifier(0).getText();
        String nameO = ctx.Identifier(1).getText();

        if (ctx.Identifier(0).getText().equals("File")) {

            util.check("files", "Files", ctx);
            String id = ctx.Identifier(0).getText();

            if (ctx.exprList().expression() == null) {
                throw new Problem("File constructor MUST have an :str argument: the path", ctx);
            }

            Value v = this.visit(ctx.exprList().expression(0));

            if (v == null) {
                throw new Problem("File :str argument is null", ctx);
            }

            File file = new File(v.toString());

            Environment.global.files.put(id, file);
        } else if (ctx.Identifier(0).getText().equals("Window")) {

            util.check("windows", "Windows", ctx);

            List<Value> list = new ArrayList<>();
            if (ctx.exprList() != null) {
                for (ExpressionContext ex : ctx.exprList().expression()) {
                    list.add(this.visit(ex));
                }
            }
            // Window w = new Window("Name", x, y);
            if (list.size() == 3) {

                int x = this.visit(ctx.exprList().expression(1)).asDouble().intValue();
                int y = this.visit(ctx.exprList().expression(2)).asDouble().intValue();
                String name = this.visit(ctx.exprList().expression(0)).toString();

                Window window = new Window(name, x, y);
                window.setName(ctx.Identifier(1).getText());
                Environment.global.wins.add(window);

            } else {
                throw new Problem("Incorrect layout, Window class accepts the following: Window(name:str, x-axis, y-axis);", ctx);
            }
        } else if (ctx.Identifier(0).getText().equals("Component")) {

            // Component c = new X("Hello World!");

            String type = ctx.Identifier(2).getText();
            String name = ctx.Identifier(1).getText();

            if (type.equals("Button")) {
                JButton button = new JButton(ctx.exprList().expression(0).getText());
            }

        } else if (ctx.Identifier(0).getText().equals("WebServer") && ctx.Identifier(2).getText().equals("WebServer")) {
            Value x = this.visit(ctx.exprList().expression(0));

            if (!Environment.global.allowedLibs.contains("http")) {
                throw new Problem("The HTTP library has not been imported. Please import it first.\nThe library can be found at: 'q.http'", ctx);
            }

            core.libs.WebServer w = new WebServer(Integer.parseInt(x.asString()), ctx.Identifier(1).getText());
            w.init();

            Environment.global.webs.add(w);
        } else if (Environment.global.classes.containsKey(parentClass)) {

            QObject obj;
            try {
                obj = new QObject(nameO, (QClass) Environment.global.classes.get(parentClass).clone());
            } catch (Exception e) {
                throw new Problem("Unable to clone '" + parentClass + "'", ctx);
            }

            List<Value> list = new ArrayList<>();
            if (ctx.exprList() != null) {
                for (ExpressionContext ex : ctx.exprList().expression()) {
                    list.add(this.visit(ex));
                }
            }

            Environment.global.consts.get(ctx.Identifier(0).getText()).call(list, this.functions);

            obj.setParams(list);
            obj.v = this;

            Environment.global.objs.put(nameO, obj);
        } else {
            throw new Problem("Class:Object not recognized: " + parentClass, ctx);
        }

        return Value.VOID;
    }

    @Override
    public Value visitConstructorStatement(QParser.ConstructorStatementContext ctx) {

        List<Value> l = new ArrayList<>();
        if (ctx.exprList() != null) {
            for (ExpressionContext e : ctx.exprList().expression()) {
                l.add(this.visit(e));
            }
        }

        Function f = new Function(this.scope, l, ctx.block(), "");

        Environment.global.consts.put(ctx.Identifier().getText(), f);

        return Value.VOID;
    }

    @Override
    public Value visitClassStatement(QParser.ClassStatementContext ctx) {

        String id = ctx.Identifier(0).getText();

        Visitor v = new Visitor(new Scope(Environment.global.scope, true), new HashMap<>());
        v.visit(ctx.block());

        QClass qClass = new QClass(id, v.functions, v.scope);
        String base = "";
        qClass.setV(v);

        if (ctx.Identifier(1) != null) {
            base = ctx.Identifier(1).getText();
        }

        if (ctx.Identifier(1) != null && Environment.global.classes.containsKey(base)) {
            qClass.setBase(Environment.global.classes.get(base));
        } else {
            qClass.setBase(QClass.OBJECT);
        }

        Environment.global.classes.put(id, qClass);

        return Value.VOID;

    }

    @Override
    public Value visitHeader(QParser.HeaderContext ctx) {

        if (ctx.Identifier().getText().equals("")) {
            throw new Problem("Header MUST have a name\nie: '@header FileWriterLibrary' or '@header TokenFactoryLibrary'", ctx);
        }

        this.lib = true;
        this.scope.lib = true;

        return Value.VOID;
    }

    @Override
    public Value visitReAssignment(QParser.ReAssignmentContext ctx) {

        Value newVal = this.visit(ctx.expression());
        String id;

        if (ctx.Identifier() == null) {
            id = this.visit(ctx.objVar()).id;
        } else {
            id = ctx.Identifier().getText();
        }

        newVal.id = id;

        if ((ctx.indexes() != null)) {
            Value val = scope.exists(ctx.Identifier().getText());
            List<ExpressionContext> exps = ctx.indexes().expression();
            setAtIndex(ctx, exps, val, newVal);
        } else {

            if (this.scope.vars.containsKey(id) && !this.scope.vars.get(id).constant) {
                scope.varAssign(id, newVal);
                newVal.hasVal = true;
            } else if (this.scope.vars.containsKey(id) && this.scope.vars.get(id).constant) {
                throw new Problem("Variable '" + ctx.Identifier() + "' is constant, and cannot be changed", ctx);
            } else {
                throw new Problem("Variable '" + ctx.Identifier() + "' not found", ctx);
            }
        }

        return Value.VOID;
    }

    @Override
    public Value visitAssignment(QParser.AssignmentContext ctx) {

        Value newVal = Value.NULL;
        String id = ctx.Identifier().getText();

        if ((ctx.Noval(0) != null) && (ctx.expression() != null)) {
            throw new Problem("Noval variable: '" + id + " must NOT have a value", ctx);
        } else if ((ctx.Noval(0) != null) && (ctx.Const(0) != null)) {
            throw new Problem("Constant variables must have a value to begin with. See variable '" + id + "'.", ctx);
        }

        if (ctx.expression() != null) {
            newVal = this.visit(ctx.expression());
            newVal.id = id;
        }

        if (ctx.Noval(0) != null) {
            scope.varAssign(id, newVal);
            return Value.VOID;
        }

        if ((ctx.Const(0) != null)) {
            newVal.constant = true;
        }

        if ((ctx.indexes() != null)) {
            Value val = scope.exists(ctx.Identifier().getText());
            List<ExpressionContext> exps = ctx.indexes().expression();
            setAtIndex(ctx, exps, val, newVal);
        } else {

            if (this.scope.vars.containsKey(id)) {
                if (this.scope.vars.get(id).constant) {
                    newVal.constant = true;
                }
            }

            scope.varAssign(id, newVal);
            newVal.hasVal = true;
        }

        return Value.VOID;


    }

    @Override
    public Value visitUnaryMinusExpression(UnaryMinusExpressionContext ctx) {
        Value v = this.visit(ctx.expression());
        if (!v.isNumber()) {
            throw new Problem(ctx);
        }
        return new Value(-1 * v.asDouble());
    }

    @Override
    public Value visitNotExpression(NotExpressionContext ctx) {
        Value v = this.visit(ctx.expression());
        if (!v.isBoolean()) {
            throw new Problem(ctx);
        }
        return new Value(!v.asBoolean());
    }

    @Override
    public Value visitPowerExpression(PowerExpressionContext ctx) {
        Value lhs = this.visit(ctx.expression(0));
        Value rhs = this.visit(ctx.expression(1));
        if (lhs.isNumber() && rhs.isNumber()) {
            return new Value(Math.pow(lhs.asDouble(), rhs.asDouble()));
        }
        throw new Problem(ctx);
    }

    @Override
    public Value visitMultExpression(MultExpressionContext ctx) {

        int line = ctx.start.getLine();
        int pos = ctx.start.getCharPositionInLine();

        return switch (ctx.op.getType()) {
            case QLexer.Multiply -> multiply(ctx);
            case QLexer.Divide -> divide(ctx);
            case QLexer.Modulus -> modulus(ctx);
            default -> throw new Problem("Unknown operator type: " + ctx.op.getType(), ctx);
        };
    }

    @Override
    public Value visitAddExpression(AddExpressionContext ctx) {

        int line = ctx.start.getLine();
        int pos = ctx.start.getCharPositionInLine();

        return switch (ctx.op.getType()) {
            case QLexer.Add -> add(ctx);
            case QLexer.Subtract -> subtract(ctx);
            default -> throw new Problem("Unknown operator type: " + ctx.op.getType(), ctx);
        };
    }

    @Override
    public Value visitCompExpression(CompExpressionContext ctx) {

        int line = ctx.start.getLine();
        int pos = ctx.start.getCharPositionInLine();

        return switch (ctx.op.getType()) {
            case QLexer.LT -> lt(ctx);
            case QLexer.LTEquals -> ltEq(ctx);
            case QLexer.GT -> gt(ctx);
            case QLexer.GTEquals -> gtEq(ctx);
            default -> throw new Problem("Unknown operator type: " + ctx.op.getType(), ctx);
        };
    }

    @Override
    public Value visitEqExpression(EqExpressionContext ctx) {

        int line = ctx.start.getLine();
        int pos = ctx.start.getCharPositionInLine();

        return switch (ctx.op.getType()) {
            case QLexer.Equals -> eq(ctx);
            case QLexer.NEquals -> nEq(ctx);
            default -> throw new Problem("Unknown operator type: " + ctx.op.getType(), ctx);
        };
    }

    public Value multiply(MultExpressionContext ctx) {
        Value lhs = this.visit(ctx.expression(0));
        Value rhs = this.visit(ctx.expression(1));
        int line = ctx.start.getLine();
        int pos = ctx.start.getCharPositionInLine();
        if (lhs == null || rhs == null) {
            throw new Problem(ctx);
        }

        if (lhs.isNumber() && rhs.isNumber()) {
            return new Value(lhs.asDouble() * rhs.asDouble());
        }

        if (lhs.isString() && rhs.isNumber()) {
            StringBuilder str = new StringBuilder();
            int stop = rhs.asDouble().intValue();
            for (int i = 0; i < stop; i++) {
                str.append(lhs.asString());
            }
            return new Value(str.toString());
        }

        if (lhs.isList() && rhs.isNumber()) {
            List<Value> total = new ArrayList<>();
            int stop = rhs.asDouble().intValue();
            for (int i = 0; i < stop; i++) {
                total.addAll(lhs.asList());
            }
            return new Value(total);
        }

        throw new Problem(ctx);
    }

    private Value divide(QParser.MultExpressionContext ctx) {
        Value lhs = this.visit(ctx.expression(0));
        Value rhs = this.visit(ctx.expression(1));
        if (lhs.isNumber() && rhs.isNumber()) {
            return new Value(lhs.asDouble() / rhs.asDouble());
        }
        throw new Problem(ctx);
    }

    private Value modulus(QParser.MultExpressionContext ctx) {
        Value lhs = this.visit(ctx.expression(0));
        Value rhs = this.visit(ctx.expression(1));
        if (lhs.isNumber() && rhs.isNumber()) {
            return new Value(lhs.asDouble() % rhs.asDouble());
        }
        throw new Problem(ctx);
    }

    private Value add(AddExpressionContext ctx) {
        Value lhs = this.visit(ctx.expression(0));
        Value rhs = this.visit(ctx.expression(1));

        if (lhs == null || rhs == null) {
            throw new Problem(ctx);
        }

        // number + number
        if (lhs.isNumber() && rhs.isNumber()) {
            return new Value(lhs.asDouble() + rhs.asDouble());
        }

        // list + any
        if (lhs.isList()) {
            List<Value> list = lhs.asList();
            list.add(rhs);
            return new Value(list);
        }

        // string + any
        if (lhs.isString()) {
            return new Value(lhs.asString() + "" + rhs);
        }

        // any + string
        if (rhs.isString()) {
            return new Value(lhs + "" + rhs.asString());
        }

        return new Value(lhs.toString() + rhs);
    }

    private Value subtract(AddExpressionContext ctx) {
        Value lhs = this.visit(ctx.expression(0));
        Value rhs = this.visit(ctx.expression(1));
        if (lhs.isNumber() && rhs.isNumber()) {
            return new Value(lhs.asDouble() - rhs.asDouble());
        }
        if (lhs.isList()) {
            List<Value> list = lhs.asList();
            list.remove(rhs);
            return new Value(list);
        }
        throw new Problem(ctx);
    }

    private Value gtEq(CompExpressionContext ctx) {
        Value lhs = this.visit(ctx.expression(0));
        Value rhs = this.visit(ctx.expression(1));
        if (lhs.isNumber() && rhs.isNumber()) {
            return new Value(lhs.asDouble() >= rhs.asDouble());
        }
        if (lhs.isString() && rhs.isString()) {
            return new Value(lhs.asString().compareTo(rhs.asString()) >= 0);
        }
        throw new Problem(ctx);
    }

    private Value ltEq(CompExpressionContext ctx) {
        Value lhs = this.visit(ctx.expression(0));
        Value rhs = this.visit(ctx.expression(1));
        if (lhs.isNumber() && rhs.isNumber()) {
            return new Value(lhs.asDouble() <= rhs.asDouble());
        }
        if (lhs.isString() && rhs.isString()) {
            return new Value(lhs.asString().compareTo(rhs.asString()) <= 0);
        }
        throw new Problem(ctx);
    }

    private Value gt(CompExpressionContext ctx) {
        Value lhs = this.visit(ctx.expression(0));
        Value rhs = this.visit(ctx.expression(1));
        if (lhs.isNumber() && rhs.isNumber()) {
            return new Value(lhs.asDouble() > rhs.asDouble());
        }
        if (lhs.isString() && rhs.isString()) {
            return new Value(lhs.asString().compareTo(rhs.asString()) > 0);
        }
        throw new Problem(ctx);
    }

    private Value lt(CompExpressionContext ctx) {
        Value lhs = this.visit(ctx.expression(0));
        Value rhs = this.visit(ctx.expression(1));
        if (lhs.isNumber() && rhs.isNumber()) {
            return new Value(lhs.asDouble() < rhs.asDouble());
        }
        if (lhs.isString() && rhs.isString()) {
            return new Value(lhs.asString().compareTo(rhs.asString()) < 0);
        }
        throw new Problem(ctx);
    }

    private Value eq(EqExpressionContext ctx) {
        Value lhs = this.visit(ctx.expression(0));
        Value rhs = this.visit(ctx.expression(1));
        if (lhs == null) {
            throw new Problem(ctx);
        }
        return new Value(lhs.equals(rhs));
    }

    private Value nEq(EqExpressionContext ctx) {
        Value lhs = this.visit(ctx.expression(0));
        Value rhs = this.visit(ctx.expression(1));
        return new Value(!lhs.equals(rhs));
    }

    @Override
    public Value visitAndExpression(AndExpressionContext ctx) {
        Value lhs = this.visit(ctx.expression(0));
        Value rhs = this.visit(ctx.expression(1));

        if (!lhs.isBoolean() || !rhs.isBoolean()) {
            throw new Problem(ctx);
        }
        return new Value(lhs.asBoolean() && rhs.asBoolean());
    }

    @Override
    public Value visitHereStatement(QParser.HereStatementContext ctx) {

        Value q = this.visit(ctx.expression());
        String id = ctx.Identifier().getText();

        if (this.scope.parent().parent().vars.containsKey(id)) {
            this.scope.parent().parent().vars.replace(id, q);
        } else {
            throw new Problem("Variable '" + ctx.Identifier().getText() + "' does not exist in the current context", ctx);
        }

        return Value.VOID;
    }

    @Override
    public Value visitHereVarExpression(QParser.HereVarExpressionContext ctx) {
        String id = ctx.varHereStatement().Identifier().getText();

        if (this.scope.parent().vars.containsKey(id)) {
            return this.scope.parent().vars.get(id);
        } else if (this.scope.parent().parent().vars.containsKey(id)) {
            return this.scope.parent().parent().vars.get(id);
        }

        return this.scope.parent().parent().vars.getOrDefault(id, Value.NULL);
    }

    @Override
    public Value visitOrExpression(OrExpressionContext ctx) {
        Value leftSideVar = this.visit(ctx.expression(0));
        Value rightSideVar = this.visit(ctx.expression(1));

        if (!leftSideVar.isBoolean() || !rightSideVar.isBoolean()) {
            throw new Problem(ctx);
        }
        return new Value(leftSideVar.asBoolean() || rightSideVar.asBoolean());
    }

    @Override
    public Value visitTernaryExpression(TernaryExpressionContext ctx) {
        Value condition = this.visit(ctx.expression(0));
        if (condition.asBoolean()) {
            return this.visit(ctx.expression(1));
        } else {
            return this.visit(ctx.expression(2));
        }
    }

    @Override
    public Value visitImportAllStatement(QParser.ImportAllStatementContext ctx) {

        for (String s : Environment.global.allLibs) {
            String x = ".q.";
            String g = s.substring(0, 1).toUpperCase() + s.substring(1);

            String xyy = x + g;

            String fin = switch (xyy) {
                case ".q.Io" -> ".q.io";
                case ".q.Http" -> ".q.http";
                case ".q.Puddle" -> ".q.puddle";
                default -> x + g;
            };

            util.parse(fin);
        }

        return Value.VOID;
    }

    @Override
    public Value visitAtStatement(QParser.AtStatementContext ctx) {

        String id = ctx.Identifier().getText();

        if (id.equals("notips")) {
            // @notips
            Environment.global.tips = false;
        } else if (id.equals("autoimport")) {
            // @autoimport
            this.sore = true;
        } else {
            throw new Problem(id + " is not a valid @", ctx);
        }
        return Value.VOID;
    }

    @Override
    public Value visitInExpression(InExpressionContext ctx) {
        Value lhs = this.visit(ctx.expression(0));
        Value rhs = this.visit(ctx.expression(1));

        if (rhs.isList()) {
            for (Value val : rhs.asList()) {
                if (val.equals(lhs)) {
                    return new Value(true);
                }
            }
            return new Value(false);
        }
        throw new Problem(rhs + " isn't a list, forin can only be applied to lists.", ctx);
    }

    @Override
    public Value visitNumberExpression(NumberExpressionContext ctx) {
        return new Value(Double.valueOf(ctx.getText()));
    }

    @Override
    public Value visitBoolExpression(BoolExpressionContext ctx) {
        return new Value(Boolean.valueOf(ctx.getText()));
    }

    @Override
    public Value visitNullExpression(NullExpressionContext ctx) {
        return Value.NULL;
    }

    private Value resolveIndexes(Value val, List<ExpressionContext> indexes) {
        for (ExpressionContext ec : indexes) {
            Value idx = this.visit(ec);
            if (!idx.isNumber() || (!val.isList() && !val.isString())) {
                throw new Problem("Problem resolving indexes on " + val + " at " + idx, ec);
            }
            int i = idx.asDouble().intValue();
            if (val.isString()) {
                val = new Value(val.asString().substring(i, i + 1));
            } else {
                val = val.asList().get(i);
            }
        }
        return val;
    }

    private void setAtIndex(ParserRuleContext ctx, List<ExpressionContext> indexes, Value val, Value newVal) {
        if (!val.isList()) {
            throw new Problem(ctx);
        }
        for (int i = 0; i < indexes.size() - 1; i++) {
            Value idx = this.visit(indexes.get(i));
            if (!idx.isNumber()) {
                throw new Problem(ctx);
            }
            val = val.asList().get(idx.asDouble().intValue());
        }
        Value idx = this.visit(indexes.get(indexes.size() - 1));
        if (!idx.isNumber()) {
            throw new Problem(ctx);
        }
        val.asList().set(idx.asDouble().intValue(), newVal);
    }

    @Override
    public Value visitFunctionCallExpression(FunctionCallExpressionContext ctx) {
        Value val = this.visit(ctx.functionCall());
        if (ctx.indexes() != null) {
            List<ExpressionContext> exps = ctx.indexes().expression();
            val = resolveIndexes(val, exps);
        }
        return val;
    }

    @Override
    public Value visitListExpression(ListExpressionContext ctx) {
        Value val = this.visit(ctx.list());
        if (ctx.indexes() != null) {
            List<ExpressionContext> exps = ctx.indexes().expression();
            val = resolveIndexes(val, exps);
        }
        return val;
    }

    @Override
    public Value visitIdentifierExpression(IdentifierExpressionContext ctx) {
        String id = ctx.Identifier().getText();
        Value val = scope.exists(id);

        if (ctx.indexes() != null) {
            List<ExpressionContext> exps = ctx.indexes().expression();
            val = resolveIndexes(val, exps);
        }
        return val;
    }

    @Override
    public Value visitStringExpression(StringExpressionContext ctx) {
        String text = ctx.getText();
        text = text.substring(1, text.length() - 1).replaceAll("\\\\(.)", "$1");
        Value val = new Value(text);
        if (ctx.indexes() != null) {
            List<ExpressionContext> exps = ctx.indexes().expression();
            val = resolveIndexes(val, exps);
        }
        return val;
    }

    @Override
    public Value visitExpressionExpression(ExpressionExpressionContext ctx) {
        Value val = this.visit(ctx.expression());
        if (ctx.indexes() != null) {
            List<ExpressionContext> exps = ctx.indexes().expression();
            val = resolveIndexes(val, exps);
        }
        return val;
    }

    @Override
    public Value visitInputExpression(InputExpressionContext ctx) {

        util.check("std", "std", ctx);

        TerminalNode inputString = ctx.String();
        try {
            if (inputString != null) {
                String text = inputString.getText();
                text = text.substring(1, text.length() - 1).replaceAll("\\\\(.)", "$1");
                return new Value(new String(Files.readAllBytes(Paths.get(text))));
            } else {
                BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
                return new Value(buffer.readLine());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Value visitAnonymousFunction(QParser.AnonymousFunctionContext ctx) {

        Scope scopeNext = new Scope(this.scope, true);
        Visitor next = new Visitor(scopeNext, new HashMap<>());

        if (ctx.exprList() != null) {
            for (int i = 0; i < ctx.exprList().expression().size(); i++) {
                Value value = this.visit(ctx.exprList().expression(i));
                scopeNext.functionParam(ctx.exprList().expression(0).getText(), value);
            }
        }

        Value ret = Value.VOID;
        try {
            next.visit(ctx.block());
        } catch (RVal returnValue) {
            ret = returnValue.value;
        }
        return ret;
    }

    @Override
    public Value visitIdentifierFunctionCall(IdentifierFunctionCallContext ctx) {
        List<ExpressionContext> params = ctx.exprList() != null ? ctx.exprList().expression() : new ArrayList<>();
        String id = ctx.Identifier().getText() + params.size();
        Function function;

        if (Environment.global.visitor.functions.containsKey(id)) {
            function = Environment.global.visitor.functions.get(id);
        } else if ((function = this.functions.get(id)) != null) {
            function = this.functions.get(id);
        }

        if (function != null) {
            List<Value> args = new ArrayList<>(params.size());
            for (ExpressionContext param : params) {
                args.add(this.visit(param));
            }

            if (function.async) {
                FunctionRunner r = new FunctionRunner();
                r.setFunction(function);
                r.setArgs(args);
                r.setFunctions(this.functions);
                return r.start();
            }

            return function.call(args, this.functions);
        }
        throw new Problem(ctx);
    }

    @Override
    public Value visitPrintlnFunctionCall(PrintlnFunctionCallContext ctx) {
        if (ctx.expression() != null) {
            System.out.println(this.visit(ctx.expression()));
        } else {
            System.out.println();
        }
        return Value.VOID;
    }

    @Override
    public Value visitPrintFunctionCall(PrintFunctionCallContext ctx) {
        System.out.print(this.visit(ctx.expression()));
        return Value.VOID;
    }

    @Override
    public Value visitAssertFunctionCall(AssertFunctionCallContext ctx) {
        Value value = this.visit(ctx.expression());

        if (!value.isBoolean()) {
            throw new Problem(ctx);
        }

        if (!value.asBoolean()) {
            throw new AssertionError("Failed Assertion " + ctx.expression().getText() + " line:" + ctx.start.getLine());
        }

        return Value.VOID;
    }

    @Override
    public Value visitIfStatement(IfStatementContext ctx) {

        if (this.visit(ctx.ifStat().expression()).asBoolean()) {
            return this.visit(ctx.ifStat().block());
        }

        for (int i = 0; i < ctx.elseIfStat().size(); i++) {
            if (this.visit(ctx.elseIfStat(i).expression()).asBoolean()) {
                return this.visit(ctx.elseIfStat(i).block());
            }
        }

        if (ctx.elseStat() != null) {
            return this.visit(ctx.elseStat().block());
        }

        return Value.VOID;
    }

    @Override
    public Value visitBlock(BlockContext ctx) {

        scope = new Scope(scope, false);
        for (FunctionDeclContext fdx : ctx.functionDecl()) {
            this.visit(fdx);
        }
        for (StatementContext sx : ctx.statement()) {
            this.visit(sx);
        }
        ExpressionContext ex;
        if ((ex = ctx.expression()) != null) {
            returnValue.value = this.visit(ex);
            scope = scope.parent();
            throw returnValue;
        }
        scope = scope.parent();
        return Value.VOID;
    }

    @Override
    public Value visitForStatement(ForStatementContext ctx) {
        int start = this.visit(ctx.expression(0)).asDouble().intValue();
        int stop = this.visit(ctx.expression(1)).asDouble().intValue();
        for (int i = start; i <= stop; i++) {
            scope.varAssign(ctx.Identifier().getText(), new Value(i));
            Value returnValue = this.visit(ctx.block());
            if (returnValue != Value.VOID) {
                return returnValue;
            }
        }
        return Value.VOID;
    }

    @Override
    public Value visitWhileStatement(WhileStatementContext ctx) {
        while (this.visit(ctx.expression()).asBoolean()) {
            Value returnValue = this.visit(ctx.block());
            if (returnValue != Value.VOID) {
                return returnValue;
            }
        }
        return Value.VOID;
    }

}
