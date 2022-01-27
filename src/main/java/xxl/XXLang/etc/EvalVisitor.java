package xxl.XXLang.etc;

import com.sun.net.httpserver.HttpServer;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import xxl.lang.XXLBaseVisitor;
import xxl.lang.XXLLexer;
import xxl.lang.XXLParser;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.String;
import java.net.InetSocketAddress;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static xxl.lang.XXLParser.*;

public class EvalVisitor extends XXLBaseVisitor<XValue> {
    private static final ReturnValue returnValue = new ReturnValue();
    public final Map<String, Function> functions;
    public Scope scope;

    public EvalVisitor(Scope scope, Map<String, Function> functions) {
        this.scope = scope;
        this.functions = new HashMap<>(functions);
    }

    @Override
    public XValue visitFunctionDecl(FunctionDeclContext ctx) {
        List<TerminalNode> params = ctx.idList() != null ? ctx.idList().Identifier() : new ArrayList<TerminalNode>();
        ParseTree block = ctx.block();
        String id = ctx.Identifier().getText() + params.size();

        try {
            if (functions.get(id).exists()) {
                System.out.println("[FATAL] Function: '" + id + "' already exists.");
                System.exit(0);
            }

        } catch (Exception e) {
            System.out.print("");
        }

        functions.put(id, new Function(scope, params, block));
        return XValue.VOID;
    }

    @Override
    public XValue visitMainFunctionStatement(XXLParser.MainFunctionStatementContext ctx) {

        Parser parser = new Parser().fromText(ctx.block().getText());
        try {
            parser.parse();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return new XValue("");
    }

    @Override
    public XValue visitTryCatchStatement(XXLParser.TryCatchStatementContext ctx) {

        XValue err = this.visit(ctx.Identifier());
        Parser parser = new Parser().fromText(ctx.block(0).getText());

        try {
            parser.parse();
        } catch (Exception e) {
            parser = new Parser().fromText(ctx.block(1).getText());
            parser.parseSafe();
            err = new XValue(e.getMessage());

            String id = ctx.Identifier().getText();
            scope.assign(id, err);
        }
        return XValue.VOID;
    }

    @Override
    public XValue visitWebServerStatement(XXLParser.WebServerStatementContext ctx) {

        XValue x = this.visit(ctx.expression());

        try {

            int port = Integer.parseInt(x.asString());

            HttpServer server = HttpServer.create(new InetSocketAddress(port), 0);
            server.createContext("/", new BasicHTTPHandler());
            server.setExecutor(null);
            server.start();

        } catch (Exception e) {
            System.out.println("[ERROR] " + e.getMessage());
        }
        return new XValue("");
    }

    @Override
    public XValue visitAddWebServerTextStatement(XXLParser.AddWebServerTextStatementContext ctx) {

        XValue resp = this.visit(ctx.expression());
        lang.response = resp.asString();

        return visitChildren(ctx);
    }

    @Override
    public XValue visitToIntFunctionCall(XXLParser.ToIntFunctionCallContext ctx) {

        int i = 0;
        XValue x = this.visit(ctx.expression());

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

        return new XValue(d);
    }

    @Override
    public XValue visitList(ListContext ctx) {
        List<XValue> list = new ArrayList<>();
        if (ctx.exprList() != null) {
            for (ExpressionContext ex : ctx.exprList().expression()) {
                list.add(this.visit(ex));
            }
        }
        return new XValue(list);
    }

    @Override
    public XValue visitImportStatement(ImportStatementContext ctx) {

        StringBuilder path = new StringBuilder();

        for (TerminalNode o : ctx.Identifier()) {
            path.append("/").append(o.getText());
        }

        for (File f : lang.parsed) {
            String currentPath = System.getProperty("user.dir");

            File file = new File(currentPath + "/" + path + ".l");
            if (f.getPath().equals(file.getPath())) {
                return null;
            }
        }

        XXLLexer lexer = null;
        String currentPath = System.getProperty("user.dir");

        File file = new File(currentPath + "/" + path + ".l");
        lang.parsed.add(file);

        try {

            if (currentPath.contains("xxl")) {
                lexer = new XXLLexer(CharStreams.fromFileName(currentPath + "/" + path + ".l"));
            } else {
                lexer = new XXLLexer(CharStreams.fromFileName(currentPath + "/xxl/" + path + ".l"));
            }
        } catch (IOException e) {
            System.out.println("[FATAL] Library or File not found: " + path);
            System.exit(0);
        }
        XXLParser parser = new XXLParser(new CommonTokenStream(lexer));
        parser.setBuildParseTree(true);
        ParseTree tree = parser.parse();

        lang.visitor.visit(tree);

        return null;

    }

    @Override
    public XValue visitConstructorStatement(XXLParser.ConstructorStatementContext ctx) {

        XClass.XCon xcon = new XClass.XCon(ctx.indexes(), ctx.block().getText(), ctx.Identifier().getText());

        if (lang.getClassByName(xcon.name) != null) {
            try {
                lang.getClassByName(xcon.name).setXc(xcon);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
        return XValue.VOID;
    }

    @Override
    public XValue visitDefaultCall(XXLParser.DefaultCallContext ctx) {
        try {
            if (lang.getClassByName(ctx.Identifier().getText()) == null) {
                return XValue.VOID;
            }

            lang.getClassByName(ctx.Identifier().getText()).xc.exec();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return XValue.VOID;
    }

    @Override
    public XValue visitWaitStatement(XXLParser.WaitStatementContext ctx) {

        XValue x = this.visit(ctx.expression());

        try {
            Thread.sleep(Integer.parseInt(x.asString()));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return XValue.VOID;
    }

    @Override
    public XValue visitClassStatement(XXLParser.ClassStatementContext ctx) {

        Parser.execBlock(ctx.block().getText());

        return XValue.VOID;
/*

        XClass xc = new XClass();

        xc.setName(ctx.Identifier().getText());

        lang.classes.add(xc);

        Parser parser = new Parser().fromText(ctx.block().getText());

            try {
                parser.parse();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        return XValue.VOID;
*/

    }

    @Override
    public XValue visitReAssignment(XXLParser.ReAssignmentContext ctx) {
        XValue newVal = this.visit(ctx.expression());
        if (ctx.indexes() != null) {
            XValue val = scope.resolve(ctx.Identifier().getText());
            List<ExpressionContext> exps = ctx.indexes().expression();
            setAtIndex(ctx, exps, val, newVal);
        } else {
            String id = ctx.Identifier().getText();
            scope.assign(id, newVal);
        }
        return XValue.VOID;
    }

    @Override
    public XValue visitUnaryMinusExpression(UnaryMinusExpressionContext ctx) {
        XValue v = this.visit(ctx.expression());
        if (!v.isNumber()) {
            throw new EvalException(ctx);
        }
        return new XValue(-1 * v.asDouble());
    }

    @Override
    public XValue visitNotExpression(NotExpressionContext ctx) {
        XValue v = this.visit(ctx.expression());
        if (!v.isBoolean()) {
            throw new EvalException(ctx);
        }
        return new XValue(!v.asBoolean());
    }

    @Override
    public XValue visitPowerExpression(PowerExpressionContext ctx) {
        XValue lhs = this.visit(ctx.expression(0));
        XValue rhs = this.visit(ctx.expression(1));
        if (lhs.isNumber() && rhs.isNumber()) {
            return new XValue(Math.pow(lhs.asDouble(), rhs.asDouble()));
        }
        throw new EvalException(ctx);
    }

    // expression op=( '*' | '/' | '%' ) expression         #multExpression
    @Override
    public XValue visitMultExpression(MultExpressionContext ctx) {
        switch (ctx.op.getType()) {
            case XXLLexer.Multiply:
                return multiply(ctx);
            case XXLLexer.Divide:
                return divide(ctx);
            case XXLLexer.Modulus:
                return modulus(ctx);
            default:
                throw new RuntimeException("unknown operator type: " + ctx.op.getType());
        }
    }

    // expression op=( '+' | '-' ) expression               #addExpression
    @Override
    public XValue visitAddExpression(AddExpressionContext ctx) {
        switch (ctx.op.getType()) {
            case XXLLexer.Add:
                return add(ctx);
            case XXLLexer.Subtract:
                return subtract(ctx);
            default:
                throw new RuntimeException("unknown operator type: " + ctx.op.getType());
        }
    }

    // expression op=( '>=' | '<=' | '>' | '<' ) expression #compExpression
    @Override
    public XValue visitCompExpression(CompExpressionContext ctx) {
        switch (ctx.op.getType()) {
            case XXLLexer.LT:
                return lt(ctx);
            case XXLLexer.LTEquals:
                return ltEq(ctx);
            case XXLLexer.GT:
                return gt(ctx);
            case XXLLexer.GTEquals:
                return gtEq(ctx);
            default:
                throw new RuntimeException("unknown operator type: " + ctx.op.getType());
        }
    }

    // expression op=( '==' | '!=' ) expression             #eqExpression
    @Override
    public XValue visitEqExpression(EqExpressionContext ctx) {
        switch (ctx.op.getType()) {
            case XXLLexer.Equals:
                return eq(ctx);
            case XXLLexer.NEquals:
                return nEq(ctx);
            default:
                throw new RuntimeException("unknown operator type: " + ctx.op.getType());
        }
    }

    public XValue multiply(MultExpressionContext ctx) {
        XValue lhs = this.visit(ctx.expression(0));
        XValue rhs = this.visit(ctx.expression(1));
        if (lhs == null || rhs == null) {
            System.err.println("lhs " + lhs + " rhs " + rhs);
            throw new EvalException(ctx);
        }

        // number * number
        if (lhs.isNumber() && rhs.isNumber()) {
            return new XValue(lhs.asDouble() * rhs.asDouble());
        }

        // string * number
        if (lhs.isString() && rhs.isNumber()) {
            StringBuilder str = new StringBuilder();
            int stop = rhs.asDouble().intValue();
            for (int i = 0; i < stop; i++) {
                str.append(lhs.asString());
            }
            return new XValue(str.toString());
        }

        if (lhs.isList() && rhs.isNumber()) {
            List<XValue> total = new ArrayList<>();
            int stop = rhs.asDouble().intValue();
            for (int i = 0; i < stop; i++) {
                total.addAll(lhs.asList());
            }
            return new XValue(total);
        }

        throw new EvalException(ctx);
    }

    private XValue divide(XXLParser.MultExpressionContext ctx) {
        XValue lhs = this.visit(ctx.expression(0));
        XValue rhs = this.visit(ctx.expression(1));
        if (lhs.isNumber() && rhs.isNumber()) {
            return new XValue(lhs.asDouble() / rhs.asDouble());
        }
        throw new EvalException(ctx);
    }

    private XValue modulus(XXLParser.MultExpressionContext ctx) {
        XValue lhs = this.visit(ctx.expression(0));
        XValue rhs = this.visit(ctx.expression(1));
        if (lhs.isNumber() && rhs.isNumber()) {
            return new XValue(lhs.asDouble() % rhs.asDouble());
        }
        throw new EvalException(ctx);
    }

    private XValue add(AddExpressionContext ctx) {
        XValue lhs = this.visit(ctx.expression(0));
        XValue rhs = this.visit(ctx.expression(1));

        if (lhs == null || rhs == null) {
            throw new EvalException(ctx);
        }

        // number + number
        if (lhs.isNumber() && rhs.isNumber()) {
            return new XValue(lhs.asDouble() + rhs.asDouble());
        }

        // list + any
        if (lhs.isList()) {
            List<XValue> list = lhs.asList();
            list.add(rhs);
            return new XValue(list);
        }

        // string + any
        if (lhs.isString()) {
            return new XValue(lhs.asString() + "" + rhs);
        }

        // any + string
        if (rhs.isString()) {
            return new XValue(lhs + "" + rhs.asString());
        }

        return new XValue(lhs.toString() + rhs);
    }

    private XValue subtract(AddExpressionContext ctx) {
        XValue lhs = this.visit(ctx.expression(0));
        XValue rhs = this.visit(ctx.expression(1));
        if (lhs.isNumber() && rhs.isNumber()) {
            return new XValue(lhs.asDouble() - rhs.asDouble());
        }
        if (lhs.isList()) {
            List<XValue> list = lhs.asList();
            list.remove(rhs);
            return new XValue(list);
        }
        throw new EvalException(ctx);
    }

    private XValue gtEq(CompExpressionContext ctx) {
        XValue lhs = this.visit(ctx.expression(0));
        XValue rhs = this.visit(ctx.expression(1));
        if (lhs.isNumber() && rhs.isNumber()) {
            return new XValue(lhs.asDouble() >= rhs.asDouble());
        }
        if (lhs.isString() && rhs.isString()) {
            return new XValue(lhs.asString().compareTo(rhs.asString()) >= 0);
        }
        throw new EvalException(ctx);
    }

    private XValue ltEq(CompExpressionContext ctx) {
        XValue lhs = this.visit(ctx.expression(0));
        XValue rhs = this.visit(ctx.expression(1));
        if (lhs.isNumber() && rhs.isNumber()) {
            return new XValue(lhs.asDouble() <= rhs.asDouble());
        }
        if (lhs.isString() && rhs.isString()) {
            return new XValue(lhs.asString().compareTo(rhs.asString()) <= 0);
        }
        throw new EvalException(ctx);
    }

    private XValue gt(CompExpressionContext ctx) {
        XValue lhs = this.visit(ctx.expression(0));
        XValue rhs = this.visit(ctx.expression(1));
        if (lhs.isNumber() && rhs.isNumber()) {
            return new XValue(lhs.asDouble() > rhs.asDouble());
        }
        if (lhs.isString() && rhs.isString()) {
            return new XValue(lhs.asString().compareTo(rhs.asString()) > 0);
        }
        throw new EvalException(ctx);
    }

    private XValue lt(CompExpressionContext ctx) {
        XValue lhs = this.visit(ctx.expression(0));
        XValue rhs = this.visit(ctx.expression(1));
        if (lhs.isNumber() && rhs.isNumber()) {
            return new XValue(lhs.asDouble() < rhs.asDouble());
        }
        if (lhs.isString() && rhs.isString()) {
            return new XValue(lhs.asString().compareTo(rhs.asString()) < 0);
        }
        throw new EvalException(ctx);
    }

    private XValue eq(EqExpressionContext ctx) {
        XValue lhs = this.visit(ctx.expression(0));
        XValue rhs = this.visit(ctx.expression(1));
        if (lhs == null) {
            throw new EvalException(ctx);
        }
        return new XValue(lhs.equals(rhs));
    }

    private XValue nEq(EqExpressionContext ctx) {
        XValue lhs = this.visit(ctx.expression(0));
        XValue rhs = this.visit(ctx.expression(1));
        return new XValue(!lhs.equals(rhs));
    }

    @Override
    public XValue visitAndExpression(AndExpressionContext ctx) {
        XValue lhs = this.visit(ctx.expression(0));
        XValue rhs = this.visit(ctx.expression(1));

        if (!lhs.isBoolean() || !rhs.isBoolean()) {
            throw new EvalException(ctx);
        }
        return new XValue(lhs.asBoolean() && rhs.asBoolean());
    }

    @Override
    public XValue visitOrExpression(OrExpressionContext ctx) {
        XValue lhs = this.visit(ctx.expression(0));
        XValue rhs = this.visit(ctx.expression(1));

        if (!lhs.isBoolean() || !rhs.isBoolean()) {
            throw new EvalException(ctx);
        }
        return new XValue(lhs.asBoolean() || rhs.asBoolean());
    }

    @Override
    public XValue visitTernaryExpression(TernaryExpressionContext ctx) {
        XValue condition = this.visit(ctx.expression(0));
        if (condition.asBoolean()) {
            return this.visit(ctx.expression(1));
        } else {
            return this.visit(ctx.expression(2));
        }
    }

    @Override
    public XValue visitInExpression(InExpressionContext ctx) {
        XValue lhs = this.visit(ctx.expression(0));
        XValue rhs = this.visit(ctx.expression(1));

        if (rhs.isList()) {
            for (XValue val : rhs.asList()) {
                if (val.equals(lhs)) {
                    return new XValue(true);
                }
            }
            return new XValue(false);
        }
        throw new EvalException(ctx);
    }

    @Override
    public XValue visitNumberExpression(NumberExpressionContext ctx) {
        return new XValue(Double.valueOf(ctx.getText()));
    }

    @Override
    public XValue visitBoolExpression(BoolExpressionContext ctx) {
        return new XValue(Boolean.valueOf(ctx.getText()));
    }

    @Override
    public XValue visitNullExpression(NullExpressionContext ctx) {
        return XValue.NULL;
    }

    private XValue resolveIndexes(XValue val, List<ExpressionContext> indexes) {
        for (ExpressionContext ec : indexes) {
            XValue idx = this.visit(ec);
            if (!idx.isNumber() || (!val.isList() && !val.isString())) {
                throw new EvalException("Problem resolving indexes on " + val + " at " + idx, ec);
            }
            int i = idx.asDouble().intValue();
            if (val.isString()) {
                val = new XValue(val.asString().substring(i, i + 1));
            } else {
                val = val.asList().get(i);
            }
        }
        return val;
    }

    private void setAtIndex(ParserRuleContext ctx, List<ExpressionContext> indexes, XValue val, XValue newVal) {
        if (!val.isList()) {
            throw new EvalException(ctx);
        }
        for (int i = 0; i < indexes.size() - 1; i++) {
            XValue idx = this.visit(indexes.get(i));
            if (!idx.isNumber()) {
                throw new EvalException(ctx);
            }
            val = val.asList().get(idx.asDouble().intValue());
        }
        XValue idx = this.visit(indexes.get(indexes.size() - 1));
        if (!idx.isNumber()) {
            throw new EvalException(ctx);
        }
        val.asList().set(idx.asDouble().intValue(), newVal);
    }

    @Override
    public XValue visitFunctionCallExpression(FunctionCallExpressionContext ctx) {
        XValue val = this.visit(ctx.functionCall());
        if (ctx.indexes() != null) {
            List<ExpressionContext> exps = ctx.indexes().expression();
            val = resolveIndexes(val, exps);
        }
        return val;
    }

    public XValue visitImportStatementExpression() {

        return null;
    }

    @Override
    public XValue visitListExpression(ListExpressionContext ctx) {
        XValue val = this.visit(ctx.list());
        if (ctx.indexes() != null) {
            List<ExpressionContext> exps = ctx.indexes().expression();
            val = resolveIndexes(val, exps);
        }
        return val;
    }

    @Override
    public XValue visitIdentifierExpression(IdentifierExpressionContext ctx) {
        String id = ctx.Identifier().getText();
        XValue val = scope.resolve(id);

        if (ctx.indexes() != null) {
            List<ExpressionContext> exps = ctx.indexes().expression();
            val = resolveIndexes(val, exps);
        }
        return val;
    }

    @Override
    public XValue visitStringExpression(StringExpressionContext ctx) {
        String text = ctx.getText();
        text = text.substring(1, text.length() - 1).replaceAll("\\\\(.)", "$1");
        XValue val = new XValue(text);
        if (ctx.indexes() != null) {
            List<ExpressionContext> exps = ctx.indexes().expression();
            val = resolveIndexes(val, exps);
        }
        return val;
    }

    @Override
    public XValue visitExpressionExpression(ExpressionExpressionContext ctx) {
        XValue val = this.visit(ctx.expression());
        if (ctx.indexes() != null) {
            List<ExpressionContext> exps = ctx.indexes().expression();
            val = resolveIndexes(val, exps);
        }
        return val;
    }

    @Override
    public XValue visitInputExpression(InputExpressionContext ctx) {
        TerminalNode inputString = ctx.String();
        try {
            if (inputString != null) {
                String text = inputString.getText();
                text = text.substring(1, text.length() - 1).replaceAll("\\\\(.)", "$1");
                return new XValue(new String(Files.readAllBytes(Paths.get(text))));
            } else {
                BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
                return new XValue(buffer.readLine());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public XValue visitAssignment(AssignmentContext ctx) {
        XValue newVal = this.visit(ctx.expression());
        if (ctx.indexes() != null) {
            XValue val = scope.resolve(ctx.Identifier().getText());
            List<ExpressionContext> exps = ctx.indexes().expression();
            setAtIndex(ctx, exps, val, newVal);
        } else {
            String id = ctx.Identifier().getText();
            scope.assign(id, newVal);
        }
        return XValue.VOID;
    }

    @Override
    public XValue visitIdentifierFunctionCall(IdentifierFunctionCallContext ctx) {
        List<ExpressionContext> params = ctx.exprList() != null ? ctx.exprList().expression() : new ArrayList<ExpressionContext>();
        String id = ctx.Identifier().getText() + params.size();
        Function function;
        if ((function = functions.get(id)) != null) {
            List<XValue> args = new ArrayList<>(params.size());
            for (ExpressionContext param : params) {
                args.add(this.visit(param));
            }
            return function.call(args, functions);
        }
        throw new EvalException(ctx);
    }

    @Override
    public XValue visitPrintlnFunctionCall(PrintlnFunctionCallContext ctx) {
        if (ctx.expression() != null) {
            System.out.println(this.visit(ctx.expression()));
        } else {
            System.out.println();
        }
        return XValue.VOID;
    }

    @Override
    public XValue visitPrintFunctionCall(PrintFunctionCallContext ctx) {
        System.out.print(this.visit(ctx.expression()));
        return XValue.VOID;
    }

    @Override
    public XValue visitAssertFunctionCall(AssertFunctionCallContext ctx) {
        XValue value = this.visit(ctx.expression());

        if (!value.isBoolean()) {
            throw new EvalException(ctx);
        }

        if (!value.asBoolean()) {
            throw new AssertionError("Failed Assertion " + ctx.expression().getText() + " line:" + ctx.start.getLine());
        }

        return XValue.VOID;
    }

    @Override
    public XValue visitSizeFunctionCall(SizeFunctionCallContext ctx) {
        XValue value = this.visit(ctx.expression());

        if (value.isString()) {
            return new XValue(value.asString().length());
        }

        if (value.isList()) {
            return new XValue(value.asList().size());
        }

        throw new EvalException(ctx);
    }

    @Override
    public XValue visitIfStatement(IfStatementContext ctx) {

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

        return XValue.VOID;
    }

    @Override
    public XValue visitBlock(BlockContext ctx) {

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
        return XValue.VOID;
    }

    @Override
    public XValue visitForStatement(ForStatementContext ctx) {
        int start = this.visit(ctx.expression(0)).asDouble().intValue();
        int stop = this.visit(ctx.expression(1)).asDouble().intValue();
        for (int i = start; i <= stop; i++) {
            scope.assign(ctx.Identifier().getText(), new XValue(i));
            XValue returnValue = this.visit(ctx.block());
            if (returnValue != XValue.VOID) {
                return returnValue;
            }
        }
        return XValue.VOID;
    }

    @Override
    public XValue visitWhileStatement(WhileStatementContext ctx) {
        while (this.visit(ctx.expression()).asBoolean()) {
            XValue returnValue = this.visit(ctx.block());
            if (returnValue != XValue.VOID) {
                return returnValue;
            }
        }
        return XValue.VOID;
    }

}
