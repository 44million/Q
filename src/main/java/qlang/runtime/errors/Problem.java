package qlang.runtime.errors;

import org.antlr.v4.runtime.ParserRuleContext;
import org.jetbrains.annotations.NotNull;

/*
    This is akin to an Exception file, (thats actually exactly what it is)
    except this was written specifically for Q, essentially this is just boilerplate code.
 */

public class Problem extends RuntimeException {

    public Problem(ParserRuleContext ctx) {
        this("Problematic expression '" + ctx.getText() + "'.\nThis typically means the parser, or lexer had a problem understanding what you wrote.", ctx);
    }

    public Problem(ParserRuleContext ctx, @NotNull Exception e) {
        this("[ERROR " + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine() + " (" + e.getClass().getCanonicalName().replace("java.lang", "") + ")] '" + e.getMessage() + "'", ctx);
    }

    public Problem(String msg, @NotNull ParserRuleContext ctx) {
        super("[ERROR " + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine() + "] " + msg);
    }

    public Problem(String msg, @NotNull ParserRuleContext ctx, String c) {
        super("[ERROR " + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine() + "] in class '" + c + "' {\n\t'" + msg + "'\n}");
    }

    public Problem(String msg, @NotNull ParserRuleContext ctx, String c, @NotNull Tip t) {
        super("[ERROR " + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine() + "] in class '" + c + "' {\n\t'" + msg + "'\n\n\t" + t.getTip() + "\n}");
    }

    public Problem(String msg) {
        super("[ERROR] " + msg);
    }

    public Problem(@NotNull Exception e) {
        super("[ERROR] " + e.getMessage());
    }

    public Problem(@NotNull Exception e, @NotNull Tip t) {
        super("[ERROR] " + e.getMessage() + " {" + "'\n\n\t" + t.getTip() + "\n}");
    }

}
