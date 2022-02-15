package core.etc;

import org.antlr.v4.runtime.ParserRuleContext;

public class QException extends RuntimeException {
    public QException(ParserRuleContext ctx) {
        this("\n[ERROR] Problematic expression: " + ctx.getText() + "\n", ctx);
    }

    public QException(String msg, ParserRuleContext ctx) {
        super(msg + " line:" + ctx.start.getLine());
    }

}
