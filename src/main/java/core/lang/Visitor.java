package core.lang;

import core.etc.Parser;
import core.etc.Problem;
import core.etc.RVal;
import core.etc.Scope;
import core.interp.QBaseVisitor;
import core.interp.QLexer;
import core.interp.QParser;
import core.lang.q.Constructor;
import core.lang.q.QClass;
import core.lang.q.QObject;
import core.lang.q.QValue;
import core.libs.AWT.Window;
import core.libs.*;
import core.libs.puddle.Puddle;
import core.libs.utils.HTTP;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import javax.swing.*;
import java.io.*;
import java.lang.Math;
import java.lang.String;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

import static core.interp.QParser.*;

public class Visitor extends QBaseVisitor<QValue> {
    private static final RVal returnValue = new RVal();
    public final Map<String, Function> functions;
    public Scope scope;
    public boolean lib;

    public Visitor(Scope scope, Map<String, Function> functions) {
        this.scope = scope;
        this.functions = new HashMap<>(functions);
    }

    @Override
    public QValue visitObjFunctionCallExpression(QParser.ObjFunctionCallExpressionContext ctx) {

        int line = ctx.start.getLine();
        int pos = ctx.start.getCharPositionInLine();
        String parentClass = ctx.Identifier(0).getText();
        String method = (ctx.Identifier(1)).getText();
        if (parentClass.equals("Time")) {

            lang.check("time", "Time");

            switch (method) {
                case "cur":

                    return Time.cur();

                case "date":

                    return Time.date();

                case "instant":

                    return Time.instant();

            }

        } else if (parentClass.equals("Files")) {

            lang.check("files", "Files");

            switch (method) {
                case "absPath":

                    return core.libs.Files.absPath(ctx);

                case "here":

                    return new QValue(System.getProperty("user.dir"));

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

        } else if (parentClass.equals("Console")) {

            lang.check("console", "Console");

            if (method.equals("flush")) {
                System.console().flush();
            }
        } else if (parentClass.equals("puddle")) {

            lang.check("puddle", "puddle");

            if (method.equals("start")) {

                Puddle.start(ctx);

            }

        } else if (parentClass.equals("http")) {

            lang.check("http", "http");

            if (method.equals("get")) {

                HTTP.get(ctx);

            }

        } else if (parentClass.equals("GTP")) {

            lang.check("gtp", "gtp");

            if (ctx.exprList() == null) {
                System.out.println("[FATAL:" + line + ": + pos + " + "] All methods in the 'gtp' class require parameters. ");
                System.exit(0);
            }

            int amount = this.visit(ctx.exprList().expression(0)).asDouble().intValue();
            String prefix = this.visit(ctx.exprList().expression(1)).asString();

            switch (method) {

                case "twp":
                    return new QValue(new GTP().getText(amount, prefix));
                case "text":
                    return new QValue(new GTP().getText(amount));
            }

        } else if (lang.getWebByName(parentClass) != null) {

            if (method.equals("stop") && lang.getWebByName(parentClass) != null) {
                lang.getWebByName(parentClass).stop();
            } else {
                throw new Problem("Unknown method '" + method + "'", ctx);
            }

        } else if (lang.objs.containsKey(parentClass)) {

            QObject obj = lang.objs.get(parentClass);
            Visitor v = obj.v;

            List<QValue> vals = new ArrayList<>();

            if (ctx.exprList() != null) {
                for (ExpressionContext ex : ctx.exprList().expression()) {
                    vals.add(v.visit(ex));
                }
            }

            if (obj.funcs.containsKey(method + vals.size())) {

                return obj.funcs.get(method + vals.size()).call(vals, new HashMap<>());

            } else {
                throw new Problem(lang.objs.get(parentClass).qc.name + " does not contain a definition for '" + method + "'", ctx);
            }

        }

        return QValue.VOID;
    }

    @Override
    public QValue visitFunctionDecl(FunctionDeclContext ctx) {
        List<TerminalNode> params = ctx.idList() != null ? ctx.idList().Identifier() : new ArrayList<>();
        ParseTree block = ctx.block();
        String id = ctx.Identifier().getText() + params.size();

        try {
            if (this.functions.get(id).exists()) {
                throw new Problem("Function: '" + id + "' already exists.", ctx);
            }
        } catch (Exception e) {
            String s = e.getMessage();
            if (e.getMessage().contains("Function.exists()")) {
                s = "";
            }
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

        this.functions.put(id, f);
        return QValue.VOID;
    }

    @Override
    public QValue visitFileWriteStatement(QParser.FileWriteStatementContext ctx) {
        try {

            FileWriter fw = new FileWriter(lang.files.get(ctx.Identifier().getText()));

            QValue val = this.visit(ctx.expression());

            fw.append(val.asString());
            fw.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return QValue.VOID;
    }

    @Override
    public QValue visitVerifyFileStatement(QParser.VerifyFileStatementContext ctx) {

        QValue xv = new QValue(this.visit(ctx.expression()));

        if (new File(xv.asString()).exists()) {
            return new QValue(true);
        }

        return new QValue(false);
    }

    @Override
    public QValue visitWindowRenderStatement(QParser.WindowRenderStatementContext ctx) {

        String id = ctx.Identifier().getText();

        if (lang.getWinByName(id) == null) {
            return QValue.VOID;
        } else {
            assert lang.getWinByName(id) != null;
            if (lang.getWinByName(id) != null) {
                lang.getWinByName(id).init();
            }
        }
        return QValue.VOID;
    }

    @Override
    public QValue visitWindowAddCompStatement(QParser.WindowAddCompStatementContext ctx) {

        int line = ctx.start.getLine();
        int pos = ctx.start.getCharPositionInLine();

        String component = this.visit(ctx.expression()).asString();

        if (lang.getWinByName(ctx.Identifier().getText()) == null) {
            throw new Problem("The specified window: " + ctx.Identifier().getText() + " does not exist!", ctx);
        } else {
            if (lang.getCompByName(component) != null) {
                lang.getCompByName(component).init(ctx.Identifier().getText());
            }
        }
        return QValue.VOID;
    }

    @Override
    public QValue visitOsExecStatement(QParser.OsExecStatementContext ctx) {

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

            if (lang.objs.containsKey(s)) {
                lang.objs.remove(s);
            } else {
                throw new Problem("Object: '" + s + "' does not exist.", ctx);
            }
        } else if (method.equals("parent")) {

            System.out.println(this + " instanceof " + QClass.OBJECT.name);

        } else if (method.equals("getProperty")) {

            if (ctx.expression() == null) {
                throw new Problem("'sys.getProperty' must take a :str object as a parameter", ctx);
            }

            QValue v = this.visit(ctx.expression());

            return new QValue(System.getProperty(v.asString()));

        } else {
            throw new Problem("Sys function '" + ctx.Identifier().getText() + "' not found", ctx);
        }
        return QValue.VOID;
    }

    @Override
    public QValue visitRandomExpression(QParser.RandomExpressionContext ctx) {

        int line = ctx.start.getLine();
        int pos = ctx.start.getCharPositionInLine();

        if (ctx.expression() == null) {
            throw new Problem("System call 'sys.ran' requires a :str argument", ctx);
        }

        String s = this.visit(ctx.expression()).asString();

        switch (s) {
            case "int":
                return new QValue(new Random().nextInt());
            case "str":
                return new QValue(lang.getSaltString());
            case "bool":
                int i = new Random().nextInt(2);

                if (i == 1) {
                    return new QValue(true);
                } else {
                    return new QValue(false);
                }

        }
        return QValue.NULL;
    }

    @Override
    public QValue visitMainFunctionStatement(QParser.MainFunctionStatementContext ctx) {

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

        if (!lang.main) {
            lang.main = true;
            this.visit(ctx.block());
            return QValue.VOID;
        } else {
            System.out.println("[FATAL " + line + ":" + pos + "] Main function has already been called.");
            System.exit(0);
        }
        return QValue.VOID;
    }

    @Override
    public QValue visitTryCatchStatement(QParser.TryCatchStatementContext ctx) {

        try {
            this.visit(ctx.block(0));
        } catch (Exception e) {
            this.visit(ctx.block(1));
            System.out.println("[ERROR " + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine() + "] " + e.getMessage());
        }
        return QValue.VOID;
    }

    @Override
    public QValue visitAddWebServerTextStatement(QParser.AddWebServerTextStatementContext ctx) {

        QValue resp = this.visit(ctx.expression());
        String id = ctx.Identifier().getText();

        int line = ctx.start.getLine();
        int pos = ctx.start.getCharPositionInLine();

        for (WebServer w : lang.webs) {
            if (w.id.equals(id)) {
                w.setText(resp.asString());
                return QValue.VOID;
            }
        }

        throw new Problem("'WebServer' object: " + id + " not found.", ctx);
    }

    @Override
    public QValue visitToIntFunctionCall(QParser.ToIntFunctionCallContext ctx) {

        int i = 0;
        QValue x = this.visit(ctx.expression());
        int line = ctx.start.getLine();
        int pos = ctx.start.getCharPositionInLine();

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

        return new QValue(d);
    }

    @Override
    public QValue visitList(ListContext ctx) {
        List<QValue> list = new ArrayList<>();
        if (ctx.exprList() != null) {
            for (ExpressionContext ex : ctx.exprList().expression()) {
                list.add(this.visit(ex));
            }
        }
        return new QValue(list);
    }

    @Override
    public QValue visitImportFromGithubStatement(QParser.ImportFromGithubStatementContext ctx) {

        QValue o = this.visit(ctx.expression());

        String link = o.asString();

        link = link
                .replace("https://github.com/", "https://raw.githubusercontent.com/")
                .replace("/blob", "");


        String fileContents = lang.getTextFromGithub(link);

        Parser parser = new Parser().fromText(fileContents);
        try {
            parser.parse(false);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return QValue.VOID;
    }

    @Override
    public QValue visitImportStatement(ImportStatementContext ctx) {

        StringBuilder path = new StringBuilder();
        StringBuilder text = new StringBuilder();

        for (TerminalNode o : ctx.Identifier()) {
            path.append("/").append(o.getText());
        }

        for (TerminalNode o : ctx.Identifier()) {
            text.append(".").append(o.getText());
        }

        if (lang.allLibs.contains(text.toString().replace(".q.", "").toLowerCase(Locale.ROOT))) {
            lang.parse(text.toString());
            return QValue.VOID;
        }

        for (File f : lang.parsed) {
            Path currentRelativePath = Paths.get("");
            String currentPath = currentRelativePath.toAbsolutePath().toString();

            File file = new File(currentPath + "/" + path + ".l");
            if (f.getPath().equals(file.getPath())) {
                return null;
            }
        }

        QLexer lexer = null;
        Path currentRelativePath = Paths.get("");
        String currentPath = currentRelativePath.toAbsolutePath().toString();

        File file = new File(currentPath + "/" + path + ".l");
        lang.parsed.add(file);

        try {

            lexer = new QLexer(CharStreams.fromFileName(currentPath + "/" + path + ".l"));
        } catch (IOException e) {
            throw new Problem("Library or File not found: " + path, ctx);
        }
        QParser parser = new QParser(new CommonTokenStream(lexer));
        parser.setBuildParseTree(true);
        ParseTree tree = parser.parse();

        Scope s = new Scope(lang.scope, false);
        Visitor v = new Visitor(s, new HashMap<>());

        v.visit(tree);

        return QValue.VOID;
    }

    @Override
    public QValue visitForInStatement(QParser.ForInStatementContext ctx) {

        int to = this.visit(ctx.expression()).asDouble().intValue();
        for (int i = 0; i <= to; i++) {
            scope.varAssign(ctx.Identifier().getText(), new QValue(i));
            QValue returnValue = this.visit(ctx.block());
            if (returnValue != QValue.VOID) {
                return returnValue;
            }
        }
        return QValue.VOID;
    }

    @Override
    public QValue visitObjCreateStatement(QParser.ObjCreateStatementContext ctx) {

        String parentClass = ctx.Identifier(0).getText();
        String nameO = ctx.Identifier(1).getText();

        if (ctx.Identifier(0).getText().equals("File")) {

            lang.check("files", "Files");

            QValue v = this.visit(ctx.exprList().expression(0));

            if (!v.isString()) {
                throw new Problem("The file class accepts only :str arguments", ctx);
            }

            File file = new File(v.asString());

            lang.files.put(ctx.Identifier(1).getText(), file);
        } else if (ctx.Identifier(0).getText().equals("Window")) {

            lang.check("windows", "Windows");

            List<QValue> list = new ArrayList<>();
            if (ctx.exprList() != null) {
                for (ExpressionContext ex : ctx.exprList().expression()) {
                    list.add(this.visit(ex));
                }
            }
            // Window w = new Window("Name", x, y);
            if (list.get(0).isString() && list.get(1).isString() && list.get(2).isString()) {

                int x = Integer.parseInt(ctx.exprList().expression(1).getText().replaceAll("\"", ""));
                int y = Integer.parseInt(ctx.exprList().expression(2).getText().replaceAll("\"", ""));
                String name = ctx.exprList().expression(0).getText().replaceAll("\"", "");

                Window window = new Window(name, x, y);
                window.setName(ctx.Identifier(1).getText());
                lang.wins.add(window);

            } else {
                throw new Problem("Incorrect layout, Window class accepts the following: Window(name:str, x-axis:str, y-axis:str);", ctx);
            }
        } else if (ctx.Identifier(0).getText().equals("Component")) {

            // Component c = new X("Hello World!");

            String type = ctx.Identifier(2).getText();
            String name = ctx.Identifier(1).getText();

            if (type.equals("Button")) {
                JButton button = new JButton(ctx.exprList().expression(0).getText());
            }

        } else if (ctx.Identifier(0).getText().equals("WebServer") && ctx.Identifier(2).getText().equals("WebServer")) {
            QValue x = this.visit(ctx.exprList().expression(0));

            if (!lang.allowedLibs.contains("http")) {
                throw new Problem("The HTTP library has not been imported. Please import it first.\nThe library can be found at: 'q.http'", ctx);
            }

            core.libs.WebServer w = new WebServer(Integer.parseInt(x.asString()), ctx.Identifier(1).getText());
            w.init();

            lang.webs.add(w);
        } else if (ctx.Identifier(0).getText().equals("MP3Player") && lang.allowedLibs.contains("audio")) {
            MediaPlayer player = new MediaPlayer(this.visit(ctx.exprList().expression(0)).toString(), ctx.Identifier(1).getText());
            lang.players.add(player);
        } else if (lang.classes.containsKey(parentClass)) {

            QObject obj;
            try {
                obj = new QObject(nameO, (QClass) (lang.classes.get(parentClass)).clone());
            } catch (Exception e) {
                throw new Problem("Unable to clone '" + parentClass + "'", ctx);
            }

            List<QValue> list = new ArrayList<>();
            if (ctx.exprList() != null) {
                for (ExpressionContext ex : ctx.exprList().expression()) {
                    list.add(this.visit(ex));
                }
            }

            lang.consts.get(ctx.Identifier(0).getText()).call(list, this.functions);

            obj.setParams(list);

            lang.objs.put(nameO, obj);
        } else {
            throw new Problem("Class/Object not recognized: " + parentClass, ctx);
        }

        return QValue.VOID;
    }

    @Override
    public QValue visitConstructorStatement(QParser.ConstructorStatementContext ctx) {

        List<QValue> l = new ArrayList<>();
        if (ctx.exprList() != null) {
            for (ExpressionContext e : ctx.exprList().expression()) {
                l.add(this.visit(e));
            }
        }

        Function f = new Function(this.scope, l, ctx.block(), "");

        lang.consts.put(ctx.Identifier().getText(), f);

        return QValue.VOID;
    }

    @Override
    public QValue visitClassStatement(QParser.ClassStatementContext ctx) {

        String id = ctx.Identifier(0).getText();
        Scope scope = new Scope(this.scope, true);

        Visitor v = new Visitor(scope, new HashMap<>());
        v.visit(ctx.block());

        QClass qClass = new QClass(id, v.functions, scope);
        String base = "";
        qClass.setV(v);

        if (ctx.Identifier(1) != null) {
            base = ctx.Identifier(1).getText();
        }

        if (ctx.Identifier(1) != null && lang.classes.containsKey(base)) {
            qClass.setBase(lang.classes.get(base));
        } else {
            qClass.setBase(QClass.OBJECT);
        }

        lang.classes.put(id, qClass);

        return QValue.VOID;

    }

    @Override
    public QValue visitHeader(QParser.HeaderContext ctx) {
        int line = ctx.start.getLine();
        int pos = ctx.start.getCharPositionInLine();

        if (ctx.Identifier().getText().equals("")) {
            throw new Problem("Header MUST have a name\nie: '@header FileWriterLibrary' or '@header TokenFactoryLibrary'", ctx);
        }

        this.lib = true;
        this.scope.lib = true;

        return QValue.VOID;
    }

    @Override
    public QValue visitReAssignment(QParser.ReAssignmentContext ctx) {

        QValue newVal = this.visit(ctx.expression());
        String id = ctx.Identifier().getText();

        if ((ctx.indexes() != null)) {
            QValue val = scope.exists(ctx.Identifier().getText());
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

        return QValue.VOID;
    }

    @Override
    public QValue visitAssignment(QParser.AssignmentContext ctx) {

        QValue newVal = QValue.NULL;
        String id = ctx.Identifier().getText();

        if ((ctx.Noval(0) != null) && (ctx.expression() != null)) {
            throw new Problem("Noval variable: '" + id + " must NOT have a value", ctx);
        } else if ((ctx.Noval(0) != null) && (ctx.Const(0) != null)) {
            throw new Problem("Constant variables must have a value to begin with. See variable '" + id + "'.", ctx);
        }

        if (ctx.expression() != null) {
            newVal = this.visit(ctx.expression());
        }

        if ((ctx.Noval(0) != null)) {
            scope.varAssign(id, newVal);
            return QValue.VOID;
        }

        if ((ctx.Const(0) != null)) {
            newVal.constant = true;
        }

        if ((ctx.indexes() != null)) {
            QValue val = scope.exists(ctx.Identifier().getText());
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

        return QValue.VOID;


    }

    @Override
    public QValue visitUnaryMinusExpression(UnaryMinusExpressionContext ctx) {
        QValue v = this.visit(ctx.expression());
        if (!v.isNumber()) {
            throw new Problem(ctx);
        }
        return new QValue(-1 * v.asDouble());
    }

    @Override
    public QValue visitNotExpression(NotExpressionContext ctx) {
        QValue v = this.visit(ctx.expression());
        if (!v.isBoolean()) {
            throw new Problem(ctx);
        }
        return new QValue(!v.asBoolean());
    }

    @Override
    public QValue visitPowerExpression(PowerExpressionContext ctx) {
        QValue lhs = this.visit(ctx.expression(0));
        QValue rhs = this.visit(ctx.expression(1));
        if (lhs.isNumber() && rhs.isNumber()) {
            return new QValue(Math.pow(lhs.asDouble(), rhs.asDouble()));
        }
        throw new Problem(ctx);
    }

    @Override
    public QValue visitMultExpression(MultExpressionContext ctx) {

        int line = ctx.start.getLine();
        int pos = ctx.start.getCharPositionInLine();

        return switch (ctx.op.getType()) {
            case QLexer.Multiply -> multiply(ctx);
            case QLexer.Divide -> divide(ctx);
            case QLexer.Modulus -> modulus(ctx);
            default -> throw new RuntimeException("[ERROR " + line + ":" + pos + "] Unknown operator type: " + ctx.op.getType());
        };
    }

    @Override
    public QValue visitAddExpression(AddExpressionContext ctx) {

        int line = ctx.start.getLine();
        int pos = ctx.start.getCharPositionInLine();

        return switch (ctx.op.getType()) {
            case QLexer.Add -> add(ctx);
            case QLexer.Subtract -> subtract(ctx);
            default -> throw new RuntimeException("[ERROR " + line + ":" + pos + "] Unknown operator type: " + ctx.op.getType());
        };
    }

    @Override
    public QValue visitCompExpression(CompExpressionContext ctx) {

        int line = ctx.start.getLine();
        int pos = ctx.start.getCharPositionInLine();

        return switch (ctx.op.getType()) {
            case QLexer.LT -> lt(ctx);
            case QLexer.LTEquals -> ltEq(ctx);
            case QLexer.GT -> gt(ctx);
            case QLexer.GTEquals -> gtEq(ctx);
            default -> throw new RuntimeException("[ERROR " + line + ":" + pos + "] Unknown operator type: " + ctx.op.getType());
        };
    }

    @Override
    public QValue visitEqExpression(EqExpressionContext ctx) {

        int line = ctx.start.getLine();
        int pos = ctx.start.getCharPositionInLine();

        return switch (ctx.op.getType()) {
            case QLexer.Equals -> eq(ctx);
            case QLexer.NEquals -> nEq(ctx);
            default -> throw new RuntimeException("[ERROR " + line + ":" + pos + "] Unknown operator type: " + ctx.op.getType());
        };
    }

    public QValue multiply(MultExpressionContext ctx) {
        QValue lhs = this.visit(ctx.expression(0));
        QValue rhs = this.visit(ctx.expression(1));
        int line = ctx.start.getLine();
        int pos = ctx.start.getCharPositionInLine();
        if (lhs == null || rhs == null) {
            throw new Problem(ctx);
        }

        if (lhs.isNumber() && rhs.isNumber()) {
            return new QValue(lhs.asDouble() * rhs.asDouble());
        }

        if (lhs.isString() && rhs.isNumber()) {
            StringBuilder str = new StringBuilder();
            int stop = rhs.asDouble().intValue();
            for (int i = 0; i < stop; i++) {
                str.append(lhs.asString());
            }
            return new QValue(str.toString());
        }

        if (lhs.isList() && rhs.isNumber()) {
            List<QValue> total = new ArrayList<>();
            int stop = rhs.asDouble().intValue();
            for (int i = 0; i < stop; i++) {
                total.addAll(lhs.asList());
            }
            return new QValue(total);
        }

        throw new Problem(ctx);
    }

    private QValue divide(QParser.MultExpressionContext ctx) {
        QValue lhs = this.visit(ctx.expression(0));
        QValue rhs = this.visit(ctx.expression(1));
        if (lhs.isNumber() && rhs.isNumber()) {
            return new QValue(lhs.asDouble() / rhs.asDouble());
        }
        throw new Problem(ctx);
    }

    private QValue modulus(QParser.MultExpressionContext ctx) {
        QValue lhs = this.visit(ctx.expression(0));
        QValue rhs = this.visit(ctx.expression(1));
        if (lhs.isNumber() && rhs.isNumber()) {
            return new QValue(lhs.asDouble() % rhs.asDouble());
        }
        throw new Problem(ctx);
    }

    private QValue add(AddExpressionContext ctx) {
        QValue lhs = this.visit(ctx.expression(0));
        QValue rhs = this.visit(ctx.expression(1));

        if (lhs == null || rhs == null) {
            throw new Problem(ctx);
        }

        // number + number
        if (lhs.isNumber() && rhs.isNumber()) {
            return new QValue(lhs.asDouble() + rhs.asDouble());
        }

        // list + any
        if (lhs.isList()) {
            List<QValue> list = lhs.asList();
            list.add(rhs);
            return new QValue(list);
        }

        // string + any
        if (lhs.isString()) {
            return new QValue(lhs.asString() + "" + rhs);
        }

        // any + string
        if (rhs.isString()) {
            return new QValue(lhs + "" + rhs.asString());
        }

        return new QValue(lhs.toString() + rhs);
    }

    private QValue subtract(AddExpressionContext ctx) {
        QValue lhs = this.visit(ctx.expression(0));
        QValue rhs = this.visit(ctx.expression(1));
        if (lhs.isNumber() && rhs.isNumber()) {
            return new QValue(lhs.asDouble() - rhs.asDouble());
        }
        if (lhs.isList()) {
            List<QValue> list = lhs.asList();
            list.remove(rhs);
            return new QValue(list);
        }
        throw new Problem(ctx);
    }

    private QValue gtEq(CompExpressionContext ctx) {
        QValue lhs = this.visit(ctx.expression(0));
        QValue rhs = this.visit(ctx.expression(1));
        if (lhs.isNumber() && rhs.isNumber()) {
            return new QValue(lhs.asDouble() >= rhs.asDouble());
        }
        if (lhs.isString() && rhs.isString()) {
            return new QValue(lhs.asString().compareTo(rhs.asString()) >= 0);
        }
        throw new Problem(ctx);
    }

    private QValue ltEq(CompExpressionContext ctx) {
        QValue lhs = this.visit(ctx.expression(0));
        QValue rhs = this.visit(ctx.expression(1));
        if (lhs.isNumber() && rhs.isNumber()) {
            return new QValue(lhs.asDouble() <= rhs.asDouble());
        }
        if (lhs.isString() && rhs.isString()) {
            return new QValue(lhs.asString().compareTo(rhs.asString()) <= 0);
        }
        throw new Problem(ctx);
    }

    private QValue gt(CompExpressionContext ctx) {
        QValue lhs = this.visit(ctx.expression(0));
        QValue rhs = this.visit(ctx.expression(1));
        if (lhs.isNumber() && rhs.isNumber()) {
            return new QValue(lhs.asDouble() > rhs.asDouble());
        }
        if (lhs.isString() && rhs.isString()) {
            return new QValue(lhs.asString().compareTo(rhs.asString()) > 0);
        }
        throw new Problem(ctx);
    }

    private QValue lt(CompExpressionContext ctx) {
        QValue lhs = this.visit(ctx.expression(0));
        QValue rhs = this.visit(ctx.expression(1));
        if (lhs.isNumber() && rhs.isNumber()) {
            return new QValue(lhs.asDouble() < rhs.asDouble());
        }
        if (lhs.isString() && rhs.isString()) {
            return new QValue(lhs.asString().compareTo(rhs.asString()) < 0);
        }
        throw new Problem(ctx);
    }

    private QValue eq(EqExpressionContext ctx) {
        QValue lhs = this.visit(ctx.expression(0));
        QValue rhs = this.visit(ctx.expression(1));
        if (lhs == null) {
            throw new Problem(ctx);
        }
        return new QValue(lhs.equals(rhs));
    }

    private QValue nEq(EqExpressionContext ctx) {
        QValue lhs = this.visit(ctx.expression(0));
        QValue rhs = this.visit(ctx.expression(1));
        return new QValue(!lhs.equals(rhs));
    }

    @Override
    public QValue visitAndExpression(AndExpressionContext ctx) {
        QValue lhs = this.visit(ctx.expression(0));
        QValue rhs = this.visit(ctx.expression(1));

        if (!lhs.isBoolean() || !rhs.isBoolean()) {
            throw new Problem(ctx);
        }
        return new QValue(lhs.asBoolean() && rhs.asBoolean());
    }

    @Override
    public QValue visitHereStatement(QParser.HereStatementContext ctx) {

        QValue q = this.visit(ctx.expression());
        String id = ctx.Identifier().getText();

        if (this.scope.parent().parent().vars.containsKey(id)) {
            this.scope.parent().parent().vars.replace(id, q);
        } else {
            throw new Problem("Variable '" + ctx.Identifier().getText() + "' does not exist in the current context", ctx);
        }

        return QValue.VOID;
    }

    @Override
    public QValue visitHereVarExpression(QParser.HereVarExpressionContext ctx) {

        String id = ctx.varHereStatement().Identifier().getText();

        return this.scope.parent().parent().vars.getOrDefault(id, QValue.NULL);
    }

    @Override
    public QValue visitOrExpression(OrExpressionContext ctx) {
        QValue leftSideVar = this.visit(ctx.expression(0));
        QValue rightSideVar = this.visit(ctx.expression(1));

        if (!leftSideVar.isBoolean() || !rightSideVar.isBoolean()) {
            throw new Problem(ctx);
        }
        return new QValue(leftSideVar.asBoolean() || rightSideVar.asBoolean());
    }

    @Override
    public QValue visitTernaryExpression(TernaryExpressionContext ctx) {
        QValue condition = this.visit(ctx.expression(0));
        if (condition.asBoolean()) {
            return this.visit(ctx.expression(1));
        } else {
            return this.visit(ctx.expression(2));
        }
    }

    @Override
    public QValue visitImportAllStatement(QParser.ImportAllStatementContext ctx) {

        for (String s : lang.allLibs) {
            String x = ".q.";
            String g = s.substring(0, 1).toUpperCase() + s.substring(1);

            String xyy = x + g;

            String fin = switch (xyy) {
                case ".q.Io" -> ".q.io";
                case ".q.Http" -> ".q.http";
                case ".q.Puddle" -> ".q.puddle";
                default -> x + g;
            };

            lang.parse(fin);
        }

        return QValue.VOID;
    }

    @Override
    public QValue visitInExpression(InExpressionContext ctx) {
        QValue lhs = this.visit(ctx.expression(0));
        QValue rhs = this.visit(ctx.expression(1));

        if (rhs.isList()) {
            for (QValue val : rhs.asList()) {
                if (val.equals(lhs)) {
                    return new QValue(true);
                }
            }
            return new QValue(false);
        }
        throw new Problem(rhs + " isn't a list, forin can only be applied to lists.", ctx);
    }

    @Override
    public QValue visitNumberExpression(NumberExpressionContext ctx) {
        return new QValue(Double.valueOf(ctx.getText()));
    }

    @Override
    public QValue visitBoolExpression(BoolExpressionContext ctx) {
        return new QValue(Boolean.valueOf(ctx.getText()));
    }

    @Override
    public QValue visitNullExpression(NullExpressionContext ctx) {
        return QValue.NULL;
    }

    private QValue resolveIndexes(QValue val, List<ExpressionContext> indexes) {
        for (ExpressionContext ec : indexes) {
            QValue idx = this.visit(ec);
            if (!idx.isNumber() || (!val.isList() && !val.isString())) {
                throw new Problem("Problem resolving indexes on " + val + " at " + idx, ec);
            }
            int i = idx.asDouble().intValue();
            if (val.isString()) {
                val = new QValue(val.asString().substring(i, i + 1));
            } else {
                val = val.asList().get(i);
            }
        }
        return val;
    }

    private void setAtIndex(ParserRuleContext ctx, List<ExpressionContext> indexes, QValue val, QValue newVal) {
        if (!val.isList()) {
            throw new Problem(ctx);
        }
        for (int i = 0; i < indexes.size() - 1; i++) {
            QValue idx = this.visit(indexes.get(i));
            if (!idx.isNumber()) {
                throw new Problem(ctx);
            }
            val = val.asList().get(idx.asDouble().intValue());
        }
        QValue idx = this.visit(indexes.get(indexes.size() - 1));
        if (!idx.isNumber()) {
            throw new Problem(ctx);
        }
        val.asList().set(idx.asDouble().intValue(), newVal);
    }

    @Override
    public QValue visitFunctionCallExpression(FunctionCallExpressionContext ctx) {
        QValue val = this.visit(ctx.functionCall());
        if (ctx.indexes() != null) {
            List<ExpressionContext> exps = ctx.indexes().expression();
            val = resolveIndexes(val, exps);
        }
        return val;
    }

    @Override
    public QValue visitListExpression(ListExpressionContext ctx) {
        QValue val = this.visit(ctx.list());
        if (ctx.indexes() != null) {
            List<ExpressionContext> exps = ctx.indexes().expression();
            val = resolveIndexes(val, exps);
        }
        return val;
    }

    @Override
    public QValue visitIdentifierExpression(IdentifierExpressionContext ctx) {
        String id = ctx.Identifier().getText();
        QValue val = scope.exists(id);

        if (ctx.indexes() != null) {
            List<ExpressionContext> exps = ctx.indexes().expression();
            val = resolveIndexes(val, exps);
        }
        return val;
    }

    @Override
    public QValue visitStringExpression(StringExpressionContext ctx) {
        String text = ctx.getText();
        text = text.substring(1, text.length() - 1).replaceAll("\\\\(.)", "$1");
        QValue val = new QValue(text);
        if (ctx.indexes() != null) {
            List<ExpressionContext> exps = ctx.indexes().expression();
            val = resolveIndexes(val, exps);
        }
        return val;
    }

    @Override
    public QValue visitExpressionExpression(ExpressionExpressionContext ctx) {
        QValue val = this.visit(ctx.expression());
        if (ctx.indexes() != null) {
            List<ExpressionContext> exps = ctx.indexes().expression();
            val = resolveIndexes(val, exps);
        }
        return val;
    }

    @Override
    public QValue visitInputExpression(InputExpressionContext ctx) {
        TerminalNode inputString = ctx.String();
        try {
            if (inputString != null) {
                String text = inputString.getText();
                text = text.substring(1, text.length() - 1).replaceAll("\\\\(.)", "$1");
                return new QValue(new String(Files.readAllBytes(Paths.get(text))));
            } else {
                BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
                return new QValue(buffer.readLine());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public QValue visitAnonymousFunction(QParser.AnonymousFunctionContext ctx) {

        Scope scopeNext = new Scope(this.scope, true);
        Visitor next = new Visitor(scopeNext, new HashMap<String, Function>());

        if (ctx.exprList() != null) {
            for (int i = 0; i < ctx.exprList().expression().size(); i++) {
                QValue value = this.visit(ctx.exprList().expression(i));
                scopeNext.functionParam(ctx.exprList().expression(0).getText(), value);
            }
        }

        QValue ret = QValue.VOID;
        try {
            next.visit(ctx.block());
        } catch (RVal returnValue) {
            ret = returnValue.value;
        }
        return ret;
    }

    @Override
    public QValue visitIdentifierFunctionCall(IdentifierFunctionCallContext ctx) {
        List<ExpressionContext> params = ctx.exprList() != null ? ctx.exprList().expression() : new ArrayList<>();
        String id = ctx.Identifier().getText() + params.size();
        Function function;

        if (lang.visitor.functions.containsKey(id)) {
            function = lang.visitor.functions.get(id);
        } else if ((function = this.functions.get(id)) != null) {
            function = this.functions.get(id);
        }

        if (function != null) {
            List<QValue> args = new ArrayList<>(params.size());
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
    public QValue visitPrintlnFunctionCall(PrintlnFunctionCallContext ctx) {
        if (ctx.expression() != null) {
            System.out.println(this.visit(ctx.expression()));
        } else {
            System.out.println();
        }
        return QValue.VOID;
    }

    @Override
    public QValue visitPrintFunctionCall(PrintFunctionCallContext ctx) {
        System.out.print(this.visit(ctx.expression()));
        return QValue.VOID;
    }

    @Override
    public QValue visitAssertFunctionCall(AssertFunctionCallContext ctx) {
        QValue value = this.visit(ctx.expression());

        if (!value.isBoolean()) {
            throw new Problem(ctx);
        }

        if (!value.asBoolean()) {
            throw new AssertionError("Failed Assertion " + ctx.expression().getText() + " line:" + ctx.start.getLine());
        }

        return QValue.VOID;
    }

    @Override
    public QValue visitIfStatement(IfStatementContext ctx) {

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

        return QValue.VOID;
    }

    @Override
    public QValue visitBlock(BlockContext ctx) {

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
        return QValue.VOID;
    }

    @Override
    public QValue visitForStatement(ForStatementContext ctx) {
        int start = this.visit(ctx.expression(0)).asDouble().intValue();
        int stop = this.visit(ctx.expression(1)).asDouble().intValue();
        for (int i = start; i <= stop; i++) {
            scope.varAssign(ctx.Identifier().getText(), new QValue(i));
            QValue returnValue = this.visit(ctx.block());
            if (returnValue != QValue.VOID) {
                return returnValue;
            }
        }
        return QValue.VOID;
    }

    @Override
    public QValue visitWhileStatement(WhileStatementContext ctx) {
        while (this.visit(ctx.expression()).asBoolean()) {
            QValue returnValue = this.visit(ctx.block());
            if (returnValue != QValue.VOID) {
                return returnValue;
            }
        }
        return QValue.VOID;
    }

}
