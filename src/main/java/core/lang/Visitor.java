package core.lang;

import core.etc.Environment;
import core.etc.NameSpace;
import core.etc.Parser;
import core.etc.Scope;
import core.etc.errors.Problem;
import core.etc.errors.RVal;
import core.etc.errors.Tip;
import core.interp.QBaseVisitor;
import core.interp.QLexer;
import core.interp.QParser;
import core.lang.q.QClass;
import core.lang.q.Value;
import core.libs.AWT.AWT;
import core.libs.OS;
import core.libs.QCONSOLELIBRARY;
import core.libs.WebServer;
import core.libs.util.HTTP;
import main.Main;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.lang.String;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;

import static core.interp.QParser.*;

public class Visitor extends QBaseVisitor<Value> implements Cloneable {
    private static final RVal returnValue = new RVal();
    public final Map<String, Function> functions;
    public Scope scope;
    public boolean lib;
    public String curClass;
    public Visitor parent;
    public String p = util.string();

    public Visitor(Scope scope, Map<String, Function> functions) {
        this.scope = scope;
        this.functions = new HashMap<>(functions);
    }

    public Visitor(Scope scope, Map<String, Function> functions, String cname) {
        this.scope = scope;
        this.functions = new HashMap<>(functions);
        this.curClass = cname;
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

        QClass.QObject object = Environment.global.objs.getOrDefault(obj, QClass.QObject.NULL);

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

        if (Environment.global.objs.containsKey(parentClass)) {

            QClass.QObject obj = Environment.global.objs.get(parentClass).clone();
            Visitor newVisitor;
            try {
                newVisitor = (Visitor) obj.v.clone();
            } catch (CloneNotSupportedException e) {
                throw new Problem(e.getMessage());
            }

            List<Value> vals = new ArrayList<>();

            if (ctx.exprList() != null) {
                for (ExpressionContext ex : ctx.exprList().expression()) {
                    vals.add(newVisitor.visit(ex));
                }
            }

            // get object, assign visitor value to *old* visitor, make the visitor the new one,
            // and call the function then set back the visitor (didnt change anything, just a waste of time)
            if (obj.funcs.containsKey(method + vals.size())) {
                Function function = obj.funcs.get(method + vals.size()).clone();
                Visitor oldVisitor = function.v;
                
                function.v = newVisitor;
                Value va = function.clone().call(vals, new HashMap<>());
                function.v = oldVisitor;
                return va;
            } else {
                throw new Problem(Environment.global.objs.get(parentClass).qc.name + " does not contain a definition for '" + method + "'", ctx, this.curClass);
            }

        } else if (Environment.global.natives.containsKey(method)) {

            String p;

            p = Objects.requireNonNullElse(this.parent, this).p;

            util.check(Environment.global.natives.get(method).parent(), parentClass, ctx, util.getOrDefault(false, this), this.curClass, p);

            List<Value> l = new ArrayList<>();

            if (ctx.exprList() != null) {
                for (ExpressionContext c : ctx.exprList().expression()) {
                    l.add(this.visit(c));
                }
            }

            if (Environment.global.natives.get(method) == null) {
                throw new Problem(parentClass + " does not contain a definition for '" + method + "'", ctx, this.curClass);
            }
            try {
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
            } catch (Exception e) {
                throw new Problem(e.getMessage(), ctx, this.curClass);
            }

        } else if (parentClass.equals("Files")) {

            util.check("Files", "Files", ctx, util.getOrDefault(false, this), this.curClass, this.p);

            switch (method) {
                case "absPath":

                    return core.libs.Files.absPath(ctx);

                case "here":

                    return new Value(System.getProperty("user.dir"));

                case "delete":

                    core.libs.Files.delete(ctx);

                case "canRead":

                    return new Value(Files.isReadable(new File(ctx.exprList().expression(0).getText().replaceAll("\"", "")).toPath()));

                case "size":

                    return core.libs.Files.size(ctx.exprList().expression(0).getText().replaceAll("\"", ""));

                case "exists":

                    return new Value(new File(ctx.exprList().expression(0).getText().replaceAll("\"", "")).exists());

                default:

                    throw new Problem(parentClass + " does not contain a definition for '" + method + "'", ctx, this.curClass);

            }

        } else if (parentClass.equals("http")) {

            util.check("http", "http", ctx, util.getOrDefault(false, this), this.curClass, this.p);

            switch (method) {
                case "get" -> HTTP.get(ctx);
                case "post" -> HTTP.post(ctx);
                case "put" -> HTTP.put(ctx);
                case "delete" -> HTTP.delete(ctx);
                case "head" -> HTTP.head(ctx);
                case "options" -> HTTP.options(ctx);
                case "trace" -> HTTP.trace(ctx);
            }

        } else if (util.getWinByName(parentClass) != null) {

            try {

                switch (method) {
                    case "render":

                        if (util.getWinByName(parentClass) == null) {
                            return Value.VOID;
                        } else {
                            assert util.getWinByName(parentClass) != null;
                            if (util.getWinByName(parentClass) != null) {
                                util.getWinByName(parentClass).init();
                            }
                        }
                        return Value.VOID;
                    case "add": {

                        List<Value> v = new ArrayList<>();

                        if (ctx.exprList() != null) {
                            for (ExpressionContext e : ctx.exprList().expression()) {
                                v.add(this.visit(e));
                            }
                        }

                        String compType = v.get(0).toString();

                        if (v.size() == 2) {
                            switch (compType) {
                                case "button" -> util.getWinByName(parentClass).f.add(new JButton(v.get(1).toString()));
                                case "label" -> util.getWinByName(parentClass).f.add(new JLabel(v.get(1).toString()));
                                case "textfield" -> util.getWinByName(parentClass).f.add(new JTextField(v.get(1).toString()));
                                case "textarea" -> util.getWinByName(parentClass).f.add(new JTextArea(v.get(1).toString()));
                                case "checkbox" -> util.getWinByName(parentClass).f.add(new JCheckBox(v.get(1).toString()));
                                case "combobox" -> util.getWinByName(parentClass).f.add(new JComboBox<>(v.get(1).toString().split(",")));
                                case "list" -> util.getWinByName(parentClass).f.add(new JList<>(v.get(1).toString().split(",")));
                                case "scrollpane" -> util.getWinByName(parentClass).f.add(new JScrollPane(new JList<>(v.get(1).toString().split(","))));
                                case "textpane" -> util.getWinByName(parentClass).f.add(new JTextPane());
                                case "tabbedpane" -> util.getWinByName(parentClass).f.add(new JTabbedPane());
                                case "panel" -> util.getWinByName(parentClass).f.add(new JPanel());
                                default -> throw new Problem("Unknown component type: " + compType, ctx, this.curClass);
                            }
                        } else {
                            throw new Problem("Invalid number of arguments for '" + method + "'", ctx, this.curClass);
                        }

                        break;
                    }
                    case "getComponent": {

                        List<Value> v = new ArrayList<>();

                        if (ctx.exprList() != null) {
                            for (ExpressionContext e : ctx.exprList().expression()) {
                                v.add(this.visit(e));
                            }
                        }

                        int comp = v.get(0).asDouble().intValue();

                        assert util.getWinByName(parentClass) != null;
                        return new Value(util.getWinByName(parentClass).f.getComponent(comp));

                    }
                    case "getComponentCount":
                        return new Value(util.getWinByName(parentClass).f.getComponentCount());
                    case "setTitle":
                        util.getWinByName(parentClass).f.setTitle(ctx.exprList().expression(0).getText().replaceAll("\"", ""));
                        break;
                    case "setLayout": {

                        List<Value> v = new ArrayList<>();

                        if (ctx.exprList() != null) {
                            for (ExpressionContext e : ctx.exprList().expression()) {
                                v.add(this.visit(e));
                            }
                        }

                        String layout = v.get(0).toString();

                        switch (layout) {
                            case "grid" -> util.getWinByName(parentClass).f.setLayout(new GridLayout(v.get(1).asDouble().intValue(), v.get(2).asDouble().intValue()));
                            case "flow" -> util.getWinByName(parentClass).f.setLayout(new FlowLayout());
                            case "border" -> util.getWinByName(parentClass).f.setLayout(new BorderLayout());
                        }

                        break;
                    }

                    case "setCloseOperation": {

                        String operation = this.visit(ctx.exprList().expression(0)).toString();

                        switch (operation) {
                            case "EXIT_ON_CLOSE" -> util.getWinByName(parentClass).f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            case "DISPOSE_ON_CLOSE" -> util.getWinByName(parentClass).f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                            case "HIDE_ON_CLOSE" -> util.getWinByName(parentClass).f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                            case "DO_NOTHING_ON_CLOSE" -> util.getWinByName(parentClass).f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                            default -> throw new Problem("Invalid close operation", ctx, this.curClass);
                        }

                    }

                    case "create":

                        util.getWinByName(parentClass).create();

                        break;
                    case "setLocation": {

                        List<Value> v = new ArrayList<>();

                        if (ctx.exprList() != null) {
                            for (ExpressionContext e : ctx.exprList().expression()) {
                                v.add(this.visit(e));
                            }
                        }

                        util.getWinByName(parentClass).f.setLocation(v.get(0).asDouble().intValue(), v.get(1).asDouble().intValue());

                        break;
                    }
                    default:
                        throw new Problem(parentClass + " does not contain a definition for '" + method + "'", ctx, this.curClass);
                }
            } catch (Exception e) {
                throw new Problem(e.getMessage(), ctx, this.curClass);
            }

        } else if (util.getWebByName(parentClass) != null) {

            if (method.equals("kill") && util.getWebByName(parentClass) != null) {
                util.getWebByName(parentClass).stop();
            } else if (method.equals("changeText")) {

                List<Value> l = new ArrayList<>();

                if (ctx.exprList() != null) {
                    for (ExpressionContext e : ctx.exprList().expression()) {
                        l.add(this.visit(e));
                    }
                }

                if (util.getWebByName(parentClass) != null) {
                    util.getWebByName(parentClass).setText(l.get(0).toString());
                    return Value.VOID;
                }


                throw new Problem("Object '" + parentClass + "' does not exist in the current context", ctx, this.curClass);
            } else if (method.equals("fromFile")) {
                List<Value> l = new ArrayList<>();

                if (ctx.exprList() != null) {
                    for (ExpressionContext e : ctx.exprList().expression()) {
                        l.add(this.visit(e));
                    }
                }

                AtomicBoolean ret = new AtomicBoolean(false);

                Environment.global.webs.forEach((v, w) -> {
                    if (w.id.equals(parentClass)) {
                        try {
                            w.setText(new String(Files.readAllBytes(Paths.get(l.get(0).toString()))));
                            ret.set(true);
                        } catch (IOException e) {
                            throw new Problem("Could not read file: " + l.get(0).toString(), ctx, this.curClass);
                        }
                    }
                });
                if (!ret.get()) {
                    throw new Problem("Object '" + parentClass + "' does not exist in the current context", ctx, this.curClass);
                }
            } else if (method.equals("appendText")) {
                List<Value> l = new ArrayList<>();

                if (ctx.exprList() != null) {
                    for (ExpressionContext e : ctx.exprList().expression()) {
                        l.add(this.visit(e));
                    }
                }

                Environment.global.response += l.get(0).toString();
            } else if (method.equals("update")) {

                Environment.global.webs.forEach((v, w) -> {
                    if (w.id.equals(parentClass)) {
                        w.update();
                    }
                });
            } else {
                throw new Problem("Unknown method '" + method + "'", ctx, this.curClass);
            }

        } else if (Environment.global.files.containsKey(parentClass)) {

            List<Value> v = new ArrayList<>();

            if (ctx.exprList() != null) {
                for (ExpressionContext e : ctx.exprList().expression()) {
                    v.add(this.visit(e));
                }
            }

            switch (method) {
                case "write":

                    try {

                        FileWriter fw = new FileWriter(Environment.global.files.get(parentClass));
                        fw.write("");

                        v.forEach((action) -> {
                            try {
                                fw.append(action.toString());
                            } catch (IOException e) {
                                throw new Problem(e.getMessage(), ctx, this.curClass);
                            }
                        });
                        fw.close();

                    } catch (Exception e) {
                        throw new Problem(e.getMessage(), ctx, this.curClass);
                    }
                    return Value.VOID;
                case "read":

                    try {
                        FileReader fr = new FileReader(Environment.global.files.get(parentClass));
                        BufferedReader br = new BufferedReader(fr);
                        StringBuilder sb = new StringBuilder();
                        String line;
                        while ((line = br.readLine()) != null) {
                            sb.append(line);
                        }
                        br.close();
                        fr.close();
                        return new Value(sb.toString());
                    } catch (Exception e) {
                        throw new Problem(e.getMessage(), ctx, this.curClass);
                    }
                case "verify":

                    String path = Environment.global.files.get(parentClass).getAbsolutePath();

                    if (new File(path).exists()) {
                        return new Value(true);
                    }

                    return new Value(false);
            }
        } else {
            throw new Problem("Object '" + parentClass + "' does not exist in the current context", ctx, this.curClass);
        }

        return Value.VOID;
    }

    @Override
    public Value visitFunctionDecl(@NotNull FunctionDeclContext ctx) {
        List<TerminalNode> params = ctx.idList() != null ? ctx.idList().Identifier() : new ArrayList<>();
        ParseTree block = ctx.block();
        String id = ctx.Identifier().getText() + params.size();

        try {
            if (this.functions.get(id).exists()) {
                throw new Problem("Function: '" + id + "' already exists.", ctx, this.curClass);
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

        f.v = (this);

        if (ctx.Async(0) != null) {
            f.setAsync(true);
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
                val = Value.NULL;
            }

            fw.append(val.toString());
            fw.close();

        } catch (Exception e) {
            throw new Problem(e.getMessage(), ctx, this.curClass);
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
                throw new Problem("Could not execute text: " + this.visit(ctx.expression()).asString() + " [" + e.getMessage() + "]", ctx, this.curClass);
            }
        } else if (method.equals("quit") && ctx.expression() != null) {

            if (ctx.expression() == null) {
                throw new Problem("Function 'sys::quit(:int) requires an argument", ctx, this.curClass);
            }

            int code = (this.visit(ctx.expression()).asDouble().intValue());
            System.exit(code);

        } else if (method.equals("halt")) {

            int time = (this.visit(ctx.expression()).asDouble().intValue());

            try {
                Thread.sleep(time);
            } catch (Exception e) {
                throw new Problem(e.getMessage(), ctx, this.curClass);
            }
        } else if (method.equals("destroy")) {

            String s = ctx.expression().getText().replaceAll("\"", "");

            if (Environment.global.getObj(s)) {
                try {
                    Environment.global.destroy(s);
                } catch (RuntimeException e) {
                    throw new Problem(e.getMessage(), ctx, this.curClass);
                }
            } else {
                throw new Problem("Object: '" + s + "' does not exist.", ctx, this.curClass);
            }
        } else if (method.equals("parent")) {

            System.out.println(this + " instanceof " + QClass.OBJECT.name);

        } else if (method.equals("getProperty")) {

            if (ctx.expression() == null) {
                throw new Problem("'sys::getProperty' must take a :str object as a parameter", ctx, this.curClass);
            }

            Value v = this.visit(ctx.expression());

            return new Value(System.getProperty(v.asString()));

        } else if (method.equals("restart")) {

            if (ctx.expression() == null) {
                throw new Problem("'sys::restart' must take a :str object as a parameter", ctx, this.curClass);
            }

            Value v = this.visit(ctx.expression());

            if (v.asString().equals("")) {
                throw new Problem("'sys::restart' must take a :str object as a parameter", ctx, this.curClass);
            }

            String javaBin = System.getProperty("java.home") + File.separator + "bin" + File.separator + "java";
            File currentJar = new File("");
            try {
                currentJar = new File(Visitor.class.getProtectionDomain().getCodeSource().getLocation().toURI());
            } catch (URISyntaxException e) {
                throw new Problem(e.getMessage(), ctx, this.curClass);
            }

            /* is it a jar file? */
            if (!currentJar.getName().endsWith(".jar"))
                throw new Problem("You must restart the application from a jar file", ctx, this.curClass);

            /* Build command: java -jar application.jar */
            final ArrayList<String> command = new ArrayList<String>();
            command.add(javaBin);
            command.add("-jar");
            command.add(currentJar.getPath());

            final ProcessBuilder builder = new ProcessBuilder(command);
            try {
                builder.start();
            } catch (IOException e) {
                throw new Problem(e.getMessage(), ctx, this.curClass);
            }
            System.exit(0);

        } else {
            throw new Problem("Sys function '" + ctx.Identifier().getText() + "' not found", ctx, this.curClass);
        }
        return Value.VOID;
    }

    @Override
    public Value visitRandomExpression(QParser.RandomExpressionContext ctx) {

        if (ctx.expression() == null) {
            throw new Problem("System call 'sys.ran' requires a :str argument", ctx, this.curClass);
        }

        String s = this.visit(ctx.expression()).asString();

        switch (s) {
            case "int":
                return new Value(new Random().nextInt());
            case "str":
                return new Value(util.string());
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

        Scope v = new Scope(this.scope, true);
        Visitor vis = new Visitor(v, new HashMap<>());

        while (l != null) {
            if (l.lib) {
                throw new Problem("Library files cannot contain a function 'main'.\nPlease either remove the '@header' statement, or rename the function.", ctx, this.curClass);
            } else {
                l = l.parent();
            }
        }

        if (!Environment.global.hasMainExecuted) {
            Environment.global.hasMainExecuted = true;

            List<Value> args = new ArrayList<>();

            for (String s : Main.args) {
                args.add(new Value(s));
            }
            vis.scope.varAssign(ctx.Identifier().getText(), new Value(args));
            vis.visit(ctx.block());
            return Value.VOID;
        } else {
            System.err.println("[FATAL " + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine() + "] Main function has already been called.");
            System.exit(0);
        }
        return Value.VOID;
    }

    @Override
    public Value visitTryCatchStatement(QParser.TryCatchStatementContext ctx) {

        Value v;
        boolean print = true;
        int num = 0;
        boolean before = true;
        boolean after = false;

        String ops = """
                \t\t<"default">
                \t\t\tApplies the default actions to the try-except loop
                \t\t<"suppress">
                \t\t\tDisables automatic error printing.
                \t\t<"dontprint">
                \t\t\tDisables automatic error printing.
                \t\t<"printbefore">
                \t\t\tPrints the error message BEFORE executing the code within the except block
                \t\t<"printafter">
                \t\t\tPrints the error message AFTER executing the code within the except block
                """;

        if (ctx.expression(0) == null) {
            throw new Problem("try-except statement MUST have a specification tag, or the default tag. The options are:\n" + ops, ctx, this.curClass);
        }

        while (ctx.expression(num) != null) {
            v = this.visit(ctx.expression(num));
            num++;

            if (v.toString().equals("suppress") || v.toString().equals("dontprint")) {
                print = false;
            } else if (v.toString().equals("printbefore")) {

                if (!print) {
                    throw new Problem("Cannot attach tag '" + v + "' to try-except, as the 'suppress' tag has already been attached", ctx, this.curClass);
                }

                before = true;
                after = false;
            } else if (v.toString().equals("printafter")) {
                if (!print) {
                    throw new Problem("Cannot attach tag '" + v + "' to try-except, as the 'suppress' tag has already been attached", ctx, this.curClass);
                }
                after = true;
                before = false;
            } else if (v.toString().equals("default")) {
                after = false;
                before = true;
            } else {
                throw new Problem("Tag '" + v + "' is not a valid tag.", ctx, this.curClass);
            }
        }

        try {
            this.visit(ctx.block(0));
        } catch (Exception e) {

            if (print && before) {
                System.err.println(e.getMessage());
                this.visit(ctx.block(1));
            } else if (print) {
                this.visit(ctx.block(1));
                System.err.println(e.getMessage());
            } else {
                this.visit(ctx.block(1));
            }
        }
        return Value.VOID;
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

        link = link.replace("https://github.com/", "https://raw.githubusercontent.com/").replace("/blob", "");

        String fileContents = util.getTextFromGithub(link);

        Parser parser = new Parser().fromText(fileContents);
        try {
            parser.parse(false);
        } catch (Exception e) {
            throw new Problem(e.getMessage(), ctx, this.curClass, new Tip("GitHub takes some time to update the 'https://raw.githubusercontent.com/' domain, so allow up to an hour for the file to be downloaded.\n"));
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

        if (Environment.global.allLibs.contains(text.toString().replace(".q.", ""))) {
            util.register(text.toString(), false);
            if (text.toString().replace(".q.", "").equals("Console")) {
                new QCONSOLELIBRARY().init();
            }
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
            throw new Problem("Library or File not found: " + path, ctx, this.curClass);
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

        if (Environment.global.getObj(nameO) || this.scope.vars.containsKey(nameO)) {
            Tip t = new Tip("Objects cannot be named the same as a variable or a class");
            throw new Problem("Variable '" + nameO + "' already exists", ctx, this.curClass, t);
        }

        if (parentClass.equals("WebServer")) {
            Value x = Value.NULL;
            if (ctx.exprList() != null) {
                x = this.visit(ctx.exprList().expression(0));
            }
            util.check("http", "http", ctx, this.scope.parent().parent().parent().parent().sore, this.curClass, this.p);
            WebServer w = new WebServer(x.asDouble().intValue(), ctx.Identifier(1).getText());
            w.init();

            Environment.global.webs.put(w.id, w);
        } else if (Environment.global.classes.containsKey(parentClass)) {

            QClass.QObject obj;
            try {
                obj = new QClass.QObject(nameO, (QClass) Environment.global.classes.get(parentClass).clone());
            } catch (Exception e) {
                throw new Problem("Unable to clone '" + parentClass + "'", ctx, this.curClass);
            }

            List<Value> list = new ArrayList<>();
            if (ctx.exprList() != null) {
                for (ExpressionContext ex : ctx.exprList().expression()) {
                    list.add(this.visit(ex));
                }
            }

            Environment.global.consts.get(ctx.Identifier(0).getText()).call(list, this.functions);

            obj.setParams(list);

            Scope sc = new Scope(this.scope, false);

            obj.v = new Visitor(sc, new HashMap<>());

            Environment.global.objs.put(nameO, obj);

        } else if (ctx.Identifier(0).getText().equals("File")) {

            util.check("Files", "Files", ctx, this.scope.parent().parent().parent().parent().sore, this.curClass, this.p);
            String id = ctx.Identifier(0).getText();

            if (ctx.exprList().expression() == null) {
                throw new Problem("File constructor MUST have an :str argument: the path", ctx, this.curClass);
            }

            Value v = this.visit(ctx.exprList().expression(0));

            if (v == null) {
                throw new Problem("File :str argument is null", ctx, this.curClass);
            }

            File file = new File(v.toString());

            Environment.global.files.put(id, file);
        } else if (ctx.Identifier(0).getText().equals("Window")) {

            util.check("awt", "awt", ctx, this.scope.parent().parent().parent().parent().sore, this.curClass, this.p);

            List<Value> list = new ArrayList<>();
            if (ctx.exprList() != null) {
                for (ExpressionContext ex : ctx.exprList().expression()) {
                    list.add(this.visit(ex));
                }
            }
            // Window w = new Window("Name", x, y);
            if (list.size() == 5) {

                // new Window as w("name", x, y, width, height);

                int x = this.visit(ctx.exprList().expression(1)).asDouble().intValue();
                int y = this.visit(ctx.exprList().expression(2)).asDouble().intValue();
                int width = this.visit(ctx.exprList().expression(3)).asDouble().intValue();
                int height = this.visit(ctx.exprList().expression(4)).asDouble().intValue();
                String name = this.visit(ctx.exprList().expression(0)).toString();

                AWT window = new AWT(name, x, y, width, height);
                window.setName(ctx.Identifier(1).getText());
                Environment.global.wins.add(window);

            } else if (list.size() == 3) {

                int x = this.visit(ctx.exprList().expression(1)).asDouble().intValue();
                int y = this.visit(ctx.exprList().expression(2)).asDouble().intValue();
                String name = this.visit(ctx.exprList().expression(0)).toString();

                AWT window = new AWT(name, x, y);
                window.setName(ctx.Identifier(1).getText());
                Environment.global.wins.add(window);

            } else {
                throw new Problem("Incorrect layout, Window class accepts the following: Window(name:str, x-axis, y-axis);", ctx, this.curClass);
            }
        } else {
            throw new Problem("Class:Object not recognized: " + parentClass + ".", ctx, this.curClass, new Tip("If the class is from a native Q library, try importing it at: 'q." + parentClass + "'."));
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

        Visitor v = new Visitor(new Scope(this.scope, true), new HashMap<>(), id);
        v.parent = Environment.global.visitor;
        v.p = this.p;

        if (ctx.atStatement() != null) {
            v.visit(ctx.atStatement());
        }

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
            throw new Problem("Header MUST have a name\nie: '@header FileWriterLibrary' or '@header TokenFactoryLibrary'", ctx, this.curClass);
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
                throw new Problem("Variable '" + ctx.Identifier() + "' is constant, and cannot be changed", ctx, this.curClass);
            } else {
                throw new Problem("Variable '" + ctx.Identifier() + "' not found", ctx, this.curClass);
            }
        }

        return Value.VOID;
    }

    @Override
    public Value visitAssignment(QParser.AssignmentContext ctx) {

        Value newVal = Value.NULL;
        String id = ctx.Identifier().getText();

        if (Environment.global.getObj(id)) {
            throw new Problem("Variable '" + id + "' already exists", ctx);
        }

        if ((ctx.expression() == null) && (ctx.Const() != null)) {
            throw new Problem("Constant variables must have a value to begin with. See variable '" + id + "'.", ctx, this.curClass);
        }

        if (ctx.expression() != null) {
            newVal = this.visit(ctx.expression());
            newVal.id = id;
        }

        if (ctx.expression() == null) {
            scope.varAssign(id, newVal);
            return Value.VOID;
        }

        if ((ctx.Const() != null)) {
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

        return switch (ctx.op.getType()) {
            case QLexer.Multiply -> multiply(ctx);
            case QLexer.Divide -> divide(ctx);
            case QLexer.Modulus -> modulus(ctx);
            default -> throw new Problem("Unknown operator type: " + ctx.op.getType(), ctx, this.curClass);
        };
    }

    @Override
    public Value visitAddExpression(AddExpressionContext ctx) {

        int line = ctx.start.getLine();
        int pos = ctx.start.getCharPositionInLine();

        return switch (ctx.op.getType()) {
            case QLexer.Add -> add(ctx);
            case QLexer.Subtract -> subtract(ctx);
            default -> throw new Problem("Unknown operator type: " + ctx.op.getType(), ctx, this.curClass);
        };
    }

    @Override
    public Value visitCompExpression(CompExpressionContext ctx) {

        return switch (ctx.op.getType()) {
            case QLexer.LT -> lt(ctx);
            case QLexer.LTEquals -> ltEq(ctx);
            case QLexer.GT -> gt(ctx);
            case QLexer.GTEquals -> gtEq(ctx);
            default -> throw new Problem("Unknown operator type: " + ctx.op.getType(), ctx, this.curClass);
        };
    }

    @Override
    public Value visitEqExpression(EqExpressionContext ctx) {

        int line = ctx.start.getLine();
        int pos = ctx.start.getCharPositionInLine();

        return switch (ctx.op.getType()) {
            case QLexer.Equals -> eq(ctx);
            case QLexer.NEquals -> nEq(ctx);
            default -> throw new Problem("Unknown operator type: " + ctx.op.getType(), ctx, this.curClass);
        };
    }

    public Value multiply(MultExpressionContext ctx) {
        Value lhs = this.visit(ctx.expression(0));
        Value rhs = this.visit(ctx.expression(1));
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
            throw new Problem("Variable '" + ctx.Identifier().getText() + "' does not exist in the current context", ctx, this.curClass);
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
            String g = s.substring(0, 1).toUpperCase() + s.substring(1);

            String xyy = ".q." + g;

            String fin = switch (xyy) {
                case ".q.Io" -> ".q.io";
                case ".q.Http" -> ".q.http";
                case ".q.Puddle" -> ".q.puddle";
                case ".q.Awt" -> ".q.awt";
                case ".q.Gtp" -> ".q.gtp";
                case ".q.FileUtils" -> ".q.FileUtils";
                case ".q.Std" -> ".q.std";
                default -> ".q." + g;
            };

            util.register(fin, false);
        }

        return Value.VOID;
    }

    @Override
    public Value visitAtStatement(QParser.AtStatementContext ctx) {

        String id = ctx.Identifier().getText();

        if (id.equals("autoimport")) {
            // @autoimport
            this.scope.parent().sore = true;
        } else {
            throw new Problem(id + " is not a valid @", ctx, this.curClass);
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
        throw new Problem(rhs + " isn't a list, forin can only be applied to lists.", ctx, this.curClass);
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
                throw new Problem("Problem resolving indexes on " + val + " at " + idx, ec, this.curClass);
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
            throw new Problem("Can't set index on " + val, ctx, this.curClass);
        }
        for (int i = 0; i < indexes.size() - 1; i++) {
            Value idx = this.visit(indexes.get(i));
            if (!idx.isNumber()) {
                throw new Problem("Can't set index on " + val, ctx, this.curClass);
            }
            val = val.asList().get(idx.asDouble().intValue());
        }
        Value idx = this.visit(indexes.get(indexes.size() - 1));
        if (!idx.isNumber()) {
            throw new Problem("Can't set index on " + val, ctx, this.curClass);
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

        util.check("std", "std", ctx, util.getOrDefault(false, this), this.curClass, this.p);

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
    public Value visitPackageStatement(QParser.PackageStatementContext ctx) {

        StringBuilder text = new StringBuilder();

        for (TerminalNode o : ctx.Identifier()) {
            text.append(".").append(o.getText());
        }

        this.p = text.toString();

        String packageName = text.toString();

        NameSpace ns = new NameSpace(packageName, Environment.global.classes.get(this.curClass));
        Environment.global.namespaces.put(packageName, ns);

        return Value.VOID;
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
                Function.FunctionRunner r = new Function.FunctionRunner();
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

            String s = this.visit(ctx.expression()).toString();
            char[] chars = s.toCharArray();

            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == '\n') {
                    System.out.println();
                } else {
                    System.out.print(chars[i]);
                }
            }
        } else {
            System.out.println();
        }
        return Value.VOID;
    }

    @Override
    public Value visitPrintFunctionCall(PrintFunctionCallContext ctx) {

        String s = this.visit(ctx.expression()).toString();
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '\n') {
                System.out.println();
            } else {
                System.out.print(chars[i]);
            }
        }
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
