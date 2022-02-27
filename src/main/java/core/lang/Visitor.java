package core.lang;

import core.etc.Parser;
import core.etc.Problem;
import core.etc.RVal;
import core.etc.Scope;
import core.interp.QBaseVisitor;
import core.interp.QLexer;
import core.interp.QParser;
import core.lang.q.QClass;
import core.lang.q.QObject;
import core.lang.q.QValue;
import core.libs.AWT.Window;
import core.libs.MediaPlayer;
import core.libs.OS;
import core.libs.Time;
import core.libs.WebServer;
import core.libs.puddle.Puddle;
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

        String parentClass = ctx.Identifier(0).getText();
        String method = (ctx.Identifier(1)).getText();

        if (parentClass.equals("time")) {

            lang.check("time", "Time");

            switch (method) {
                case "cur":

                    return Time.cur();

                case "date":

                    return Time.date();

                case "instant":

                    return Time.instant();

            }

        } else if (parentClass.equals("files")) {

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

            }

        } else if (parentClass.equals("console")) {

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

        } else if (lang.getWebByName(parentClass) != null) {

            if (method.equals("stop")) {
                lang.getWebByName(parentClass).stop();
            }

        } else if (lang.objs.containsKey(parentClass)) {

            QObject obj = lang.objs.get(parentClass);

            List<QValue> vals = new ArrayList<>();

            if (ctx.exprList() != null) {
                for (ExpressionContext ex : ctx.exprList().expression()) {
                    vals.add(this.visit(ex));
                }
            }

            if (obj.qc.functions.containsKey(method + vals.size())) {

                Function f = obj.qc.functions.get(method + vals.size());

                return lang.objs.get(parentClass).funcs.get(method + vals.size()).call(vals, new HashMap<String, Function>());

            } else {
                System.out.println("[ERROR] Function: '" + method + "' not found in parent class: '" + lang.objs.get(parentClass).qc.name + "'");
            }

        }

        return QValue.VOID;
    }

    @Override
    public QValue visitNullVarStatement(QParser.NullVarStatementContext ctx) {

        /*
            noval x;
         */

        QValue newVal = QValue.NULL;
        String id = ctx.Identifier().getText();
        scope.varAssign(id, newVal);
        return QValue.VOID;
    }

    @Override
    public QValue visitObjFunctionDecl(QParser.ObjFunctionDeclContext ctx) {

        return QValue.VOID;
    }

    @Override
    public QValue visitFunctionDecl(FunctionDeclContext ctx) {
        List<TerminalNode> params = ctx.idList() != null ? ctx.idList().Identifier() : new ArrayList<>();
        ParseTree block = ctx.block();
        String id = ctx.Identifier().getText() + params.size();

        try {
            if (functions.get(id).exists()) {
                System.out.println("[FATAL] Function: '" + id + "' already exists.");
                System.exit(0);
            }
        } catch (Exception e) {
            String s = e.getMessage();
            if (e.getMessage().contains("Function.exists()")) {
                s = "";
            }
            System.out.print(s);
        }

        Function f = new Function(scope, params, block);

        if (ctx.Async() != null) {
            f.setAsync(true);
        }

        functions.put(id, f);
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

        String component = this.visit(ctx.expression()).asString();

        if (lang.getWinByName(ctx.Identifier().getText()) == null) {
            System.out.println("[FATAL] The specified window: " + ctx.Identifier().getText() + " does not exist!");
            System.exit(0);
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
                System.out.println("[FATAL] Could not execute text: " + this.visit(ctx.expression()).asString() + " [" + e.getMessage() + "]");
            }
        } else if (method.equals("quit") && ctx.expression() != null) {
            int code = Integer.parseInt(this.visit(ctx.expression()).asString());
            System.exit(code);
        } else if (method.equals("halt")) {
            int time = Integer.parseInt(this.visit(ctx.expression()).asString());
            try {
                Thread.sleep(time);
            } catch (Exception e) {
                System.out.println("[ERROR] " + e.getMessage());
            }
        } else if (method.equals("destroy")) {

            String s = ctx.expression()
                    .getText()
                    .replaceAll("\"", "");

            if (lang.objs.containsKey(s)) {
                lang.objs.remove(s);
            } else {
                System.out.println("[ERROR] Object: '" + s + "' does not exist.");
                return QValue.VOID;
            }
        } else if (method.equals("getProperty")) {

            if (ctx.expression() == null) {
                System.out.println("[ERROR] 'sys.getProperty' must take a :str object as a parameter");
                return QValue.VOID;
            }

            QValue v = this.visit(ctx.expression());

            return new QValue(System.getProperty(v.asString()));

        } else {
            System.out.printf("[FATAL] Sys function '%s' not recognized%n", ctx.Identifier().getText());
            System.exit(0);
        }
        return QValue.VOID;
    }

    @Override
    public QValue visitMainFunctionStatement(QParser.MainFunctionStatementContext ctx) {

        if (this.lib) {
            System.out.println("[FATAL] Library files cannot contain a function 'main'.\nPlease either remove the '@header' statement, or rename the function.");
        }

        if (!lang.main) {
            lang.main = true;
            this.visit(ctx.block());
            return QValue.VOID;
        } else {
            System.out.println("[FATAL] Main function has already been called.");
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
            System.out.println("[ERROR] " + e.getMessage());
        }
        return QValue.VOID;
    }

    @Override
    public QValue visitAddWebServerTextStatement(QParser.AddWebServerTextStatementContext ctx) {

        QValue resp = this.visit(ctx.expression());
        String id = ctx.Identifier().getText();

        for (WebServer w : lang.webs) {
            if (w.id.equals(id)) {
                w.setText(resp.asString());
                return QValue.VOID;
            }
        }

        System.out.println("[FATAL] 'WebServer' object: " + id + " not found.");
        System.exit(0);
        return QValue.VOID;
    }

    @Override
    public QValue visitToIntFunctionCall(QParser.ToIntFunctionCallContext ctx) {

        int i = 0;
        QValue x = this.visit(ctx.expression());

        if (x.isString()) {

            try {
                i = Integer.parseInt(x.asString());
            } catch (Exception e) {

                String err = "Could not cast to integer " + e.getMessage().replace("F", "f");
                System.out.println("[ERROR] " + err);
                i = 0;
            }

        } else if (x.isNumber()) {
            System.out.println("'" + x + "' is already an integer value.");
        } else if (x.isList()) {
            System.out.println("Incompatible cast: List to Integer");
        } else if (x.isBoolean()) {
            System.out.println("Incompatible cast: Boolean to Integer");
        } else if (x.isNull()) {
        } else if (x.isVoid()) {
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
            System.out.println("[FATAL] Library or File not found: " + path);
            System.out.println(e.getMessage());
            System.exit(0);
        }
        QParser parser = new QParser(new CommonTokenStream(lexer));
        parser.setBuildParseTree(true);
        ParseTree tree = parser.parse();

        lang.visitor.visit(tree);

        return null;
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
                System.out.println("[FATAL] The file class accepts only :str arguments");
                System.exit(0);
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
                System.out.println("Incorrect layout, Window class accepts the following: Window(name:str, x-axis:str, y-axis:str);");
                return QValue.VOID;
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
                System.out.println("[FATAL] The HTTP library has not been imported. Please import it first.\nThe library can be found at: 'q.http'");
                System.exit(0);
            }

            core.libs.WebServer w = new WebServer(Integer.parseInt(x.asString()), ctx.Identifier(1).getText());
            w.init();

            lang.webs.add(w);
        } else if (ctx.Identifier(0).getText().equals("MP3Player") && lang.allowedLibs.contains("audio")) {
            MediaPlayer player = new MediaPlayer(this.visit(ctx.exprList().expression(0)).toString(), ctx.Identifier(1).getText());
            lang.players.add(player);
        } else if (lang.classes.containsKey(parentClass)) {

            // example: Main main = new Main();
            // example: Runner run = new Runner(8);

            QClass qc = lang.classes.get(parentClass);

            QObject obj = new QObject(nameO, qc);

            List<QValue> list = new ArrayList<>();
            if (ctx.exprList() != null) {
                for (ExpressionContext ex : ctx.exprList().expression()) {
                    list.add(this.visit(ex));
                }
            }

            obj.setParams(list);
            obj.setFuncs();

            lang.objs.put(nameO, obj);
        } else {
            System.out.println("[ERROR] Class/Object not recognized: " + parentClass);
        }

        return QValue.VOID;
    }

    @Override
    public QValue visitListAddStatement(QParser.ListAddStatementContext ctx) {

        if (lang.getListByName(ctx.Identifier().getText()) == null) {
            System.out.println("[FATAL] List: " + ctx.Identifier().getText() + " not found.");
            System.exit(0);
        }

        QValue q = this.visit(ctx.expression());
        lang.getListByName(ctx.Identifier().getText()).add(q);

        return QValue.VOID;
    }

    @Override
    public QValue visitListRemoveStatement(QParser.ListRemoveStatementContext ctx) {

        if (lang.getListByName(ctx.Identifier().getText()) == null) {
            System.out.println("[FATAL] List: " + ctx.Identifier().getText() + " not found.");
            System.exit(0);
        }

        QValue q = this.visit(ctx.expression());
        lang.getListByName(ctx.Identifier().getText()).remove(q);

        return QValue.VOID;
    }

    @Override
    public QValue visitListCreateStatement(QParser.ListCreateStatementContext ctx) {

        core.libs.utils.List<Object> list = new core.libs.utils.List<>(this.visit(ctx.Identifier()).asString());
        lang.lists.add(list);

        return QValue.VOID;
    }

    @Override
    public QValue visitConstructorStatement(QParser.ConstructorStatementContext ctx) {


        return QValue.VOID;
    }

    @Override
    public QValue visitClassStatement(QParser.ClassStatementContext ctx) {

        String id = ctx.Identifier().getText();
        Scope scope = new Scope(lang.scope, false);

        Visitor v = new Visitor(scope, new HashMap<>());
        v.visit(ctx.block());

        QClass qClass = new QClass(id, v.functions, scope);

        lang.classes.put(id, qClass);

        return QValue.VOID;

    }

    @Override
    public QValue visitHeader(QParser.HeaderContext ctx) {

        if (ctx.Identifier().getText().equals("")) {
            System.out.println("[FATAL] Header MUST have a title");
            System.exit(0);
        }

        this.lib = true;

        return QValue.VOID;
    }

    @Override
    public QValue visitReAssignment(QParser.ReAssignmentContext ctx) {
        QValue newVal = this.visit(ctx.expression());
        if (ctx.indexes() != null) {
            QValue val = scope.exists(ctx.Identifier().getText());
            List<ExpressionContext> exps = ctx.indexes().expression();
            setAtIndex(ctx, exps, val, newVal);
        } else {
            String id = ctx.Identifier().getText();
            scope.varAssign(id, newVal);
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
        switch (ctx.op.getType()) {
            case QLexer.Multiply:
                return multiply(ctx);
            case QLexer.Divide:
                return divide(ctx);
            case QLexer.Modulus:
                return modulus(ctx);
            default:
                throw new RuntimeException("unknown operator type: " + ctx.op.getType());
        }
    }

    @Override
    public QValue visitAddExpression(AddExpressionContext ctx) {
        return switch (ctx.op.getType()) {
            case QLexer.Add -> add(ctx);
            case QLexer.Subtract -> subtract(ctx);
            default -> throw new RuntimeException("unknown operator type: " + ctx.op.getType());
        };
    }

    @Override
    public QValue visitCompExpression(CompExpressionContext ctx) {
        switch (ctx.op.getType()) {
            case QLexer.LT:
                return lt(ctx);
            case QLexer.LTEquals:
                return ltEq(ctx);
            case QLexer.GT:
                return gt(ctx);
            case QLexer.GTEquals:
                return gtEq(ctx);
            default:
                throw new RuntimeException("unknown operator type: " + ctx.op.getType());
        }
    }

    @Override
    public QValue visitEqExpression(EqExpressionContext ctx) {
        switch (ctx.op.getType()) {
            case QLexer.Equals:
                return eq(ctx);
            case QLexer.NEquals:
                return nEq(ctx);
            default:
                throw new RuntimeException("unknown operator type: " + ctx.op.getType());
        }
    }

    public QValue multiply(MultExpressionContext ctx) {
        QValue lhs = this.visit(ctx.expression(0));
        QValue rhs = this.visit(ctx.expression(1));
        if (lhs == null || rhs == null) {
            System.err.println("lhs " + lhs + " rhs " + rhs);
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
            System.out.println("[ERROR] Variable '" + ctx.Identifier().getText() + "' does not exist in the current context");
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
        throw new Problem(ctx);
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

        this.visit(ctx.block());

        return QValue.VOID;
    }

    @Override
    public QValue visitIdentifierFunctionCall(IdentifierFunctionCallContext ctx) {
        List<ExpressionContext> params = ctx.exprList() != null ? ctx.exprList().expression() : new ArrayList<>();
        String id = ctx.Identifier().getText() + params.size();
        Function function;

        if (lang.visitor.functions.containsKey(id)) {
            function = lang.visitor.functions.get(id);
        } else if ((function = functions.get(id)) != null) {
            function = functions.get(id);
        }

        if (function != null) {
            List<QValue> args = new ArrayList<>(params.size());
            for (ExpressionContext param : params) {
                args.add(this.visit(param));
            }

            return function.call(args, functions);
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
