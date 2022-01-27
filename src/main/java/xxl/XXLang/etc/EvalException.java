package xxl.XXLang.etc;

import org.antlr.v4.runtime.ParserRuleContext;

public class EvalException extends RuntimeException {
    public EvalException(ParserRuleContext ctx) {
        this("\n[ERROR] Problematic expression: " + ctx.getText() + "\n", ctx);
    }

    public EvalException(String msg, ParserRuleContext ctx) {
        super(msg + " line:" + ctx.start.getLine());
    }

}
