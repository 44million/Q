package core.etc;

import org.antlr.v4.runtime.ParserRuleContext;

public class Problem extends RuntimeException {

    public Problem(ParserRuleContext ctx) {
        this("[ERROR " + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine() + "] Problematic expression '" + ctx.getText() + "'", ctx);
    }

    public Problem(String msg, ParserRuleContext ctx) {
        super("[ERROR " + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine() + "] " + msg);
    }

    public Problem(String msg, ParserRuleContext ctx, String c) {
        super("[ERROR " + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine() + "] in class '" + c + "' {\n\t'" + msg + "'\n}");
    }

    public Problem(String msg) {
        super("[ERROR] " + msg);
    }

}
