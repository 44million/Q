package core.lang;

import core.etc.EvalException;
import core.etc.Parser;
import core.etc.ReturnValue;
import core.etc.Scope;
import core.interp.QBaseVisitor;
import core.interp.QLexer;
import core.interp.QParser;
import core.libs.WebServer;
import core.libs.Window;
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
import java.util.*;

import static core.interp.QParser.*;

public class EvalVisitor extends QBaseVisitor<QValue> {
    private static final ReturnValue returnValue = new ReturnValue();
    public final Map<String, Function> functions;
    public Scope scope;

    public EvalVisitor(Scope scope, Map<String, Function> functions) {
        this.scope = scope;
        this.functions = new HashMap<>(functions);
    }

    @Override
    public QValue visitObjFunctionCall(QParser.ObjFunctionCallContext ctx) {

        String className = ctx.Identifier(0).getText();
        System.out.println(className);

        if (lang.getClassByName(className) == null) {
            System.out.println("[FATAL] The class you are tying to extend into: '" + ctx.Identifier(1).getText() + "' cannot be found. Make sure it has been parsed.");
            System.exit(0);
        }
        try {

            List<QValue> fr;

            if (this.visit(ctx.idList()) == null || this.visit(ctx.idList()).asList() == null) {
                fr = new ArrayList<>();
            } else {
                fr = this.visit(ctx.idList()).asList();
            }

            lang.getFuncByName(ctx.Identifier(1).getText()).call(fr, functions);
        } catch (Exception e) {
            System.out.println(e.getMessage());
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
        List<TerminalNode> params = ctx.idList() != null ? ctx.idList().Identifier() : new ArrayList<TerminalNode>();
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
    public QValue visitFileObjectInitializeStatement(QParser.FileObjectInitializeStatementContext ctx) {

        QValue v = this.visit(ctx.expression());

        if (!v.isString()) {
            System.out.println("[FATAL] The file class accepts only :str arguments");
            System.exit(0);
        }

        File file = new File(v.asString());

        lang.files.put(ctx.Identifier().getText(), file);

        return QValue.VOID;
    }

    @Override
    public QValue visitFileWriteStatement(QParser.FileWriteStatementContext ctx) {
        try {
            FileWriter fw = new FileWriter(lang.files.get(ctx.Identifier().getText()));
            QValue x = new QValue(this.visit(ctx.expression()));

            fw.write(x.asString());
            fw.close();

        } catch (Exception e) {
            System.out.println(e.getMessage() + " <----");
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
            lang.getWinByName(id).instantiate();
        }
        return QValue.VOID;
    }

    @Override
    public QValue visitWindowAddCompStatement(QParser.WindowAddCompStatementContext ctx) {

        QValue v = this.visit(ctx.expression());

//        if (lang.getWinByName(ctx.Identifier().getText()) == null || lang.getCompByName(ctx.expression()))

        return QValue.VOID;
    }

    @Override
    public QValue visitComponentCreateStatement(QParser.ComponentCreateStatementContext ctx) {

        QValue newVal = this.visit(ctx.Identifier());

        QValue val = scope.resolve(ctx.Identifier().getText());
        List<ExpressionContext> exps = ctx.exprList().expression();
        setAtIndex(ctx, exps, val, newVal);

        String id = ctx.Identifier().getText();
        scope.assign(id, newVal);

        List<QValue> list = new ArrayList<>();
        if (ctx.exprList() != null) {
            for (ExpressionContext ex : ctx.exprList().expression()) {
                list.add(this.visit(ex));
            }
        }

        // Component c = new Component("text", "Hello World!");
        if (list.get(0).isString() && list.get(1).isString()) {
            core.libs.Window.XComponent xcomp = new Window.XComponent(list.get(0).asString(), list.get(1).asString(), id);
            lang.comps.add(xcomp);
        }
        return QValue.VOID;
    }

    @Override
    public QValue visitWindowCreateStatement(QParser.WindowCreateStatementContext ctx) {

        List<QValue> list = new ArrayList<>();
        if (ctx.exprList() != null) {
            for (ExpressionContext ex : ctx.exprList().expression()) {
                list.add(this.visit(ex));
            }
        }
        // Window w = new Window("Name", x, y);
        if (list.get(0).isString() && list.get(1).isString() && list.get(2).isString()) {

            core.libs.Window window = new Window(list.get(0).asString(), Integer.parseInt(list.get(1).asString()), Integer.parseInt(list.get(2).asString()));
            window.setName(ctx.Identifier().getText());
            lang.wins.add(window);

        } else {
            System.out.println("Incorrect layout, Window class accepts the following: Window(name:str, x-axis:str, y-axis:str);");
        }
        return QValue.VOID;
    }

    @Override
    public QValue visitMainFunctionStatement(QParser.MainFunctionStatementContext ctx) {

        this.visit(ctx.block());

        return new QValue("");
    }

    @Override
    public QValue visitTryCatchStatement(QParser.TryCatchStatementContext ctx) {

        QValue err;

        try {
            this.visit(ctx.block(0));
        } catch (Exception e) {
            this.visit(ctx.block(1));
            err = new QValue(e.getMessage());

            String id = ctx.Identifier().getText();
            scope.assign(id, err);
        }
        return QValue.VOID;
    }

    @Override
    public QValue visitWebServerStatement(QParser.WebServerStatementContext ctx) {

        QValue x = this.visit(ctx.expression());

        core.libs.WebServer w = new WebServer(Integer.parseInt(x.asString()), ctx.Identifier().getText());
        w.launch();

        lang.webs.add(w);

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
                System.out.println(err);
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

        for (TerminalNode o : ctx.Identifier()) {
            path.append("/").append(o.getText());
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



        return QValue.VOID;
    }

    @Override
    public QValue visitConstructorStatement(QParser.ConstructorStatementContext ctx) {

        QClass.XCon xcon = new QClass.XCon(ctx.indexes(), ctx.block().getText(), ctx.Identifier().getText());

        if (lang.getClassByName(xcon.name) != null) {
            try {
                lang.getClassByName(xcon.name).setXc(xcon);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

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
    public QValue visitWaitStatement(QParser.WaitStatementContext ctx) {

        QValue x = this.visit(ctx.expression());

        try {
            Thread.sleep(Integer.parseInt(x.asString()));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
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
            throw new EvalException(ctx);
        }
        return new QValue(-1 * v.asDouble());
    }

    @Override
    public QValue visitNotExpression(NotExpressionContext ctx) {
        QValue v = this.visit(ctx.expression());
        if (!v.isBoolean()) {
            throw new EvalException(ctx);
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
        throw new EvalException(ctx);
    }

    // expression op=( '*' | '/' | '%' ) expression         #multExpression
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

    // expression op=( '+' | '-' ) expression               #addExpression
    @Override
    public QValue visitAddExpression(AddExpressionContext ctx) {
        switch (ctx.op.getType()) {
            case QLexer.Add:
                return add(ctx);
            case QLexer.Subtract:
                return subtract(ctx);
            default:
                throw new RuntimeException("unknown operator type: " + ctx.op.getType());
        }
    }

    // expression op=( '>=' | '<=' | '>' | '<' ) expression #compExpression
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

    // expression op=( '==' | '!=' ) expression             #eqExpression
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
            throw new EvalException(ctx);
        }

        // number * number
        if (lhs.isNumber() && rhs.isNumber()) {
            return new QValue(lhs.asDouble() * rhs.asDouble());
        }

        // string * number
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

        throw new EvalException(ctx);
    }

    private QValue divide(QParser.MultExpressionContext ctx) {
        QValue lhs = this.visit(ctx.expression(0));
        QValue rhs = this.visit(ctx.expression(1));
        if (lhs.isNumber() && rhs.isNumber()) {
            return new QValue(lhs.asDouble() / rhs.asDouble());
        }
        throw new EvalException(ctx);
    }

    private QValue modulus(QParser.MultExpressionContext ctx) {
        QValue lhs = this.visit(ctx.expression(0));
        QValue rhs = this.visit(ctx.expression(1));
        if (lhs.isNumber() && rhs.isNumber()) {
            return new QValue(lhs.asDouble() % rhs.asDouble());
        }
        throw new EvalException(ctx);
    }

    private QValue add(AddExpressionContext ctx) {
        QValue lhs = this.visit(ctx.expression(0));
        QValue rhs = this.visit(ctx.expression(1));

        if (lhs == null || rhs == null) {
            throw new EvalException(ctx);
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
        throw new EvalException(ctx);
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
        throw new EvalException(ctx);
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
        throw new EvalException(ctx);
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
        throw new EvalException(ctx);
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
        throw new EvalException(ctx);
    }

    private QValue eq(EqExpressionContext ctx) {
        QValue lhs = this.visit(ctx.expression(0));
        QValue rhs = this.visit(ctx.expression(1));
        if (lhs == null) {
            throw new EvalException(ctx);
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
            throw new EvalException(ctx);
        }
        return new QValue(lhs.asBoolean() && rhs.asBoolean());
    }

    @Override
    public QValue visitOrExpression(OrExpressionContext ctx) {
        QValue lhs = this.visit(ctx.expression(0));
        QValue rhs = this.visit(ctx.expression(1));

        if (!lhs.isBoolean() || !rhs.isBoolean()) {
            throw new EvalException(ctx);
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
        throw new EvalException(ctx);
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
                throw new EvalException("Problem resolving indexes on " + val + " at " + idx, ec);
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
            throw new EvalException(ctx);
        }
        for (int i = 0; i < indexes.size() - 1; i++) {
            QValue idx = this.visit(indexes.get(i));
            if (!idx.isNumber()) {
                throw new EvalException(ctx);
            }
            val = val.asList().get(idx.asDouble().intValue());
        }
        QValue idx = this.visit(indexes.get(indexes.size() - 1));
        if (!idx.isNumber()) {
            throw new EvalException(ctx);
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

    public QValue visitImportStatementExpression() {

        return null;
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
        List<ExpressionContext> params = ctx.exprList() != null ? ctx.exprList().expression() : new ArrayList<ExpressionContext>();
        String id = ctx.Identifier().getText() + params.size();
        Function function;
        if ((function = functions.get(id)) != null) {
            List<QValue> args = new ArrayList<>(params.size());
            for (ExpressionContext param : params) {
                args.add(this.visit(param));
            }
            return function.call(args, functions);
        }
        throw new EvalException(ctx);
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
            throw new EvalException(ctx);
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

        throw new EvalException(ctx);
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
