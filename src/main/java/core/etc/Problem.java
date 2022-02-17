package core.etc;

import org.antlr.v4.runtime.ParserRuleContext;

public class Problem extends RuntimeException {
    public Problem(ParserRuleContext ctx) {
        this("\n[ERROR] Problematic expression: " + ctx.getText() + "\n", ctx);
    }

    public Problem(String msg, ParserRuleContext ctx) {
        super(msg + " line:" + ctx.start.getLine());
    }

}
