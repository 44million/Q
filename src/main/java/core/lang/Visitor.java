package core.lang;

import core.etc.Parser;
import core.etc.Problem;
import core.etc.RVal;
import core.etc.Scope;
import core.interp.QBaseVisitor;
import core.interp.QLexer;
import core.interp.QParser;
import core.libs.AWT.QComponent;
import core.libs.AWT.Window;
import core.libs.MediaPlayer;
import core.libs.OS;
import core.libs.puddle.Puddle;
import core.libs.WebServer;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.*;
import java.lang.String;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.*;

import static core.interp.QParser.*;

public class Visitor extends QBaseVisitor<QValue> {
    private static final RVal returnValue = new RVal();
    public final Map<String, Function> functions;
    public Scope scope;

    public Visitor(Scope scope, Map<String, Function> functions) {
        this.scope = scope;
        this.functions = new HashMap<>(functions);
    }

    @Override
    public QValue visitObjFunctionCallExpression(QParser.ObjFunctionCallExpressionContext ctx) {

        String parentClass = ctx.Identifier(0).getText();
        String method = (ctx.Identifier(1)).getText();

        if (parentClass.equals("time")) {

            if (!lang.allowedLibs.contains("time")) {
                System.out.println("[FATAL] Cannot invoke 'time' subfunctions, as the package has not been imported.\nThe library can be found at: 'q.time'");
                System.exit(0);
            }

            if (method.equals("cur")) {

                String time = "";

                LocalDateTime i = LocalDateTime.now();

                time += i.getHour();
                time += ":";
                time += i.getMinute();
                time += ":";
                time += i.getSecond();

                return new QValue(time);
            } else if (method.equals("date")) {

                String date = "";

                date += LocalDateTime
                        .now().getDayOfMonth();
                date += "/";
                date += LocalDateTime
                        .now().getMonth().getValue();
                date += "/";
                date += LocalDateTime
                        .now().getYear();

                return new QValue(date);
            }

        } else if (parentClass.equals("files")) {

            if (!lang.allowedLibs.contains("files")) {
                System.out.println("[FATAL] Cannot invoke 'Files' subfunctions, as the package has not been imported.\nThe library can be found at: 'q.Files'");
                System.exit(0);
            }

            if (method.equals("absPath")) {

                String q = ctx
                        .exprList()
                        .expression(0)
                        .getText()
                        .replace("\"", "");

                if (q == null) {
                    System.out.println("[ERROR] Method 'files.absPath(:str)' accepts one argument, the file, or directory in question.");
                    return QValue.NULL;
                }

                Path dbpath = Paths.get(q);

                if (!dbpath.toFile().exists()) {
                    System.out.println("[ERROR] Cannot find file '" + dbpath.toAbsolutePath() + "'");
                }

                return new QValue(dbpath.toAbsolutePath());
            } else if (method.equals("here")) {
                String cur = System.getProperty("user.dir");
                return new QValue(cur);
            } else if (method.equals("delete")) {

                if (ctx.exprList().expression(0) == null) {
                    System.out.println("[ERROR] Function 'paths.delete(:str)' needs a string argument.");
                    return QValue.NULL;
                }

                String path = ctx.exprList().expression(0).getText();
                try {
                    Files.delete(new File(path).toPath());
                } catch (Exception e) {

                    String err = e.getMessage();

                    if (e instanceof FileNotFoundException) {
                        err += " (File not found)";
                    }

                    System.out.println("[FATAL] " + err);
                    System.exit(0);
                }

            }

        } else if (parentClass.equals("console")) {

            if (!lang.allowedLibs.contains("console")) {
                System.out.println("[FATAL] Cannot invoke 'Console' subfunctions, as the package has not been imported.\nThe library can be found at: 'q.Console'");
                System.exit(0);
            }

            if (method.equals("flush")) {
                System.console().flush();
            }
        } else if (parentClass.equals("puddle")) {

            if (!lang.allowedLibs.contains("puddle")) {
                System.out.println("[FATAL] Cannot invoke 'puddle' subfunctions, as the package has not been imported.\nThe library can be found at: 'q.puddle'");
                System.exit(0);
            }

            if (method.equals("start")) {
                int i = Integer.parseInt(ctx.exprList().expression(1).getText());
                String ip = ctx.exprList().expression(0).getText();

                new Puddle(ip, i).init();
            }

        }

        return QValue.VOID;
    }

    @Override
    public QValue visitObjFunctionDecl(QParser.ObjFunctionDeclContext ctx) {

        if (lang.getClassByName(ctx.Identifier(1).getText()) == null) {
            System.out.println("[FATAL] The class you are tying to extend into: " + ctx.Identifier(0).getText() + " cannot be found. Make sure it has been parsed.");
            System.exit(0);
        }

        CFunction c = new CFunction(ctx.Identifier(0).getText() + "", ctx.idList().Identifier(), lang.getClassByName(ctx.Identifier(1).getText()), ctx.block(), scope);
        lang.funcs.add(c);

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

        functions.put(id, new Function(scope, params, block));
        return QValue.VOID;
    }

    @Override
    public QValue visitFileWriteStatement(QParser.FileWriteStatementContext ctx) {
        try {

            FileWriter fw = new FileWriter(lang.files.get(ctx.Identifier().getText()));
            fw.append(ctx.expression().getText().replace("\"", ""));
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
        if (ctx.Identifier().getText().equals("exec") && ctx.expression() != null) {
            try {
                OS.execS(this.visit(ctx.expression()).asString());
            } catch (Exception e) {
                System.out.println("[FATAL] Could not execute text: " + this.visit(ctx.expression()).asString() + " [" + e.getMessage() + "]");
            }
        } else if (ctx.Identifier().getText().equals("quit") && ctx.expression() != null) {
            int code = Integer.parseInt(this.visit(ctx.expression()).asString());
            System.exit(code);
        } else if (ctx.Identifier().getText().equals("halt")) {
            int time = Integer.parseInt(this.visit(ctx.expression()).asString());
            try {
                Thread.sleep(time);
            } catch (Exception e) {
                System.out.println("[ERROR] " + e.getMessage());
            }
        } else {
            System.out.printf("[FATAL] Sys function '%s' not recognized%n", ctx.Identifier().getText());
            System.exit(0);
        }
        return QValue.VOID;
    }

    @Override
    public QValue visitMainFunctionStatement(QParser.MainFunctionStatementContext ctx) {

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

        if (text.toString().equals(".q.Windows")) {

                if (lang.allowedLibs.contains("windows")) {
                    return QValue.VOID;
                }

            lang.allowedLibs.add("windows");
            return QValue.VOID;
        } else if (text.toString().equals(".q.http")) {

            if (lang.allowedLibs.contains("http")) {
                return QValue.VOID;
            }

            lang.allowedLibs.add("http");
            return QValue.VOID;
        } else if (text.toString().equals(".q.Files")) {

            if (lang.allowedLibs.contains("files")) {
                return QValue.VOID;
            }

            lang.allowedLibs.add("files");
            return QValue.VOID;
        } else if (text.toString().equals(".q.Math")) {

            if (lang.allowedLibs.contains("math")) {
                return QValue.VOID;
            }

            lang.allowedLibs.add("math");
            new core.libs.Math().init();
            return QValue.VOID;
        } else if (text.toString().equals(".q.Audio")) {

            if (lang.allowedLibs.contains("audio")) {
                return QValue.VOID;
            }

            lang.allowedLibs.add("audio");
            return QValue.VOID;
        } else if (text.toString().equals(".q.Random")) {

            if (lang.allowedLibs.contains("random")) {
                return QValue.VOID;
            }

            lang.allowedLibs.add("random");
            new core.libs.QRandom().init();
            return QValue.VOID;
        } else if (text.toString().equals(".q.Time")) {

            if (lang.allowedLibs.contains("time")) {
                return QValue.VOID;
            }

            lang.allowedLibs.add("time");
            new core.libs.Time().init();
            return QValue.VOID;
        } else if (text.toString().equals(".q.Console")) {

            if (lang.allowedLibs.contains("console")) {
                return QValue.VOID;
            }

            lang.allowedLibs.add("console");
            return QValue.VOID;
        } else if (text.toString().equals(".q.puddle")) {

            if (lang.allowedLibs.contains("puddle")) {
                return QValue.VOID;
            }

            lang.allowedLibs.add("puddle");
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
    public QValue visitObjCreateStatement(QParser.ObjCreateStatementContext ctx) {

        if (ctx.Identifier(0).getText().equals("File")) {
            if (!lang.allowedLibs.contains("files")) {
                System.out.println("[FATAL] The File library has not been imported. Please import it first.\nThe library can be found at: 'q.Files'");
                System.exit(0);
            }

            QValue v = this.visit(ctx.exprList().expression(0));

            if (!v.isString()) {
                System.out.println("[FATAL] The file class accepts only :str arguments");
                System.exit(0);
            }

            File file = new File(v.asString());

            lang.files.put(ctx.Identifier(1).getText(), file);
        } else if (ctx.Identifier(0).getText().equals("Window")) {
            if (!lang.allowedLibs.contains("windows")) {
                System.out.println("[FATAL] The AWT library has not been imported. Please import it first.\nThe library can be found at: 'q.Windows'");
                System.exit(0);
            }

            List<QValue> list = new ArrayList<>();
            if (ctx.exprList() != null) {
                for (ExpressionContext ex : ctx.exprList().expression()) {
                    list.add(this.visit(ex));
                }
            }
            // Window w = new Window("Name", x, y);
            if (list.get(0).isString() && list.get(1).isString() && list.get(2).isString()) {

                Window window = new Window(list.get(0).asString(), Integer.parseInt(list.get(1).asString()), Integer.parseInt(list.get(2).asString()));
                window.setName(ctx.Identifier(1).getText());
                lang.wins.add(window);

            } else {
                System.out.println("Incorrect layout, Window class accepts the following: Window(name:str, x-axis:str, y-axis:str);");
            }
        } else if (ctx.Identifier(0).getText().equals("Component")) {

            // Component c = new Component("text", "Hello World!");
            QComponent xcomp = new QComponent(ctx.exprList().expression(0).getText(), ctx.exprList().expression(1).getText(), ctx.Identifier(1).getText());
            lang.comps.add(xcomp);

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
        }

        return QValue.VOID;
    }

    @Override
    public QValue visitDefaultCall(QParser.DefaultCallContext ctx) {
        try {
            if (lang.getClassByName(ctx.Identifier().getText()) == null) {
                return QValue.VOID;
            }

            Objects.requireNonNull(Objects.requireNonNull(lang.getClassByName(ctx.Identifier().getText()))).xc.exec();

        } catch (Exception e) {
            System.out.println(e.getMessage());
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
    public QValue visitClassStatement(QParser.ClassStatementContext ctx) {

        QClass xc = new QClass();
        xc.setName(ctx.Identifier().getText());
        lang.classes.add(xc);

        this.visit(ctx.block());
        return QValue.VOID;

    }

    @Override
    public QValue visitHeader(QParser.HeaderContext ctx) {

        if (ctx.Identifier().getText().equals("")) {
            System.out.println("[FATAL] Header MUST have a title");
            System.exit(0);
        }

        return QValue.VOID;
    }

    @Override
    public QValue visitReAssignment(QParser.ReAssignmentContext ctx) {
        QValue newVal = this.visit(ctx.expression());
        if (ctx.indexes() != null) {
            QValue val = scope.resolve(ctx.Identifier().getText());
            List<ExpressionContext> exps = ctx.indexes().expression();
            setAtIndex(ctx, exps, val, newVal);
        } else {
            String id = ctx.Identifier().getText();
            scope.assign(id, newVal);
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
    public QValue visitOrExpression(OrExpressionContext ctx) {
        QValue lhs = this.visit(ctx.expression(0));
        QValue rhs = this.visit(ctx.expression(1));

        if (!lhs.isBoolean() || !rhs.isBoolean()) {
            throw new Problem(ctx);
        }
        return new QValue(lhs.asBoolean() || rhs.asBoolean());
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
    public QValue visitStopwatchStatement(QParser.StopwatchStatementContext ctx) {
        long start = System.currentTimeMillis();

        if (!lang.allowedLibs.contains("time")) {
            System.out.println("[FATAL] Cannot invoke method 'stopwatch' because the Time library has not been imported.\nThe Time library can be found at: 'q.Time'");
            System.exit(0);
        }

        QValue v = this.visit(ctx.functionCall());

        return QValue.VOID;
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
        QValue val = scope.resolve(id);

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
    public QValue visitAssignment(AssignmentContext ctx) {
        QValue newVal = this.visit(ctx.expression());
        if (ctx.indexes() != null) {
            QValue val = scope.resolve(ctx.Identifier().getText());
            List<ExpressionContext> exps = ctx.indexes().expression();
            setAtIndex(ctx, exps, val, newVal);
        } else {
            String id = ctx.Identifier().getText();
            scope.assign(id, newVal);
        }
        return QValue.VOID;
    }

    @Override
    public QValue visitIdentifierFunctionCall(IdentifierFunctionCallContext ctx) {
        List<ExpressionContext> params = ctx.exprList() != null ? ctx.exprList().expression() : new ArrayList<>();
        String id = ctx.Identifier().getText() + params.size();
        Function function;
        if ((function = functions.get(id)) != null) {
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
    public QValue visitSizeFunctionCall(SizeFunctionCallContext ctx) {
        QValue value = this.visit(ctx.expression());

        if (value.isString()) {
            return new QValue(value.asString().length());
        }

        if (value.isList()) {
            return new QValue(value.asList().size());
        }

        throw new Problem(ctx);
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
            scope.assign(ctx.Identifier().getText(), new QValue(i));
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
