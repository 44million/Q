package qlang.runtime.errors;

import org.antlr.v4.runtime.ParserRuleContext;
import org.jetbrains.annotations.NotNull;

/**
 * The Problem class represents runtime exceptions that occur during the execution of Q language code.
 * It provides various constructors for different scenarios and includes information about the source context.
 */
public class Problem extends RuntimeException {

    /**
     * Constructs a Problem instance with a message describing a problematic expression.
     *
     * @param ctx The parser context associated with the problem.
     */
    public Problem(ParserRuleContext ctx) {
        this("Problematic expression '" + ctx.getText() + "'.\nThis typically means the parser, or lexer had a problem understanding what you wrote.", ctx);
    }

    /**
     * Constructs a Problem instance with a message, an exception, and the source context information.
     *
     * @param ctx The parser context associated with the problem.
     * @param e   The exception that caused the problem.
     */
    public Problem(ParserRuleContext ctx, @NotNull Exception e) {
        this("[ERROR " + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine() + " (" +
                e.getClass().getCanonicalName().replace("java.lang", "") + ")] '" + e.getMessage() + "'", ctx);
    }

    /**
     * Constructs a Problem instance with a message and the source context information.
     *
     * @param msg The message describing the problem.
     * @param ctx The parser context associated with the problem.
     */
    public Problem(String msg, @NotNull ParserRuleContext ctx) {
        super("[ERROR " + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine() + "] " + msg);
    }

    /**
     * Constructs a Problem instance with a message, source context information, and class name.
     *
     * @param msg The message describing the problem.
     * @param ctx The parser context associated with the problem.
     * @param c   The name of the class where the problem occurred.
     */
    public Problem(String msg, @NotNull ParserRuleContext ctx, String c) {
        super("[ERROR " + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine() + "] in class '" +
                c + "' {\n\t'" + msg + "'\n}");
    }

    /**
     * Constructs a Problem instance with a message, source context information, class name, and a tip.
     *
     * @param msg The message describing the problem.
     * @param ctx The parser context associated with the problem.
     * @param c   The name of the class where the problem occurred.
     * @param t   The tip associated with the problem.
     */
    public Problem(String msg, @NotNull ParserRuleContext ctx, String c, @NotNull Tip t) {
        super("[ERROR " + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine() + "] in class '" +
                c + "' {\n\t'" + msg + "'\n\n\t" + t.getTip() + "\n}");
    }

    /**
     * Constructs a Problem instance with a general error message.
     *
     * @param msg The general error message.
     */
    public Problem(String msg) {
        super("[ERROR] " + msg);
    }

    /**
     * Constructs a Problem instance with an exception.
     *
     * @param e The exception that caused the problem.
     */
    public Problem(@NotNull Exception e) {
        super("[ERROR] " + e.getMessage());
    }

    /**
     * Constructs a Problem instance with an exception and a tip.
     *
     * @param e The exception that caused the problem.
     * @param t The tip associated with the problem.
     */
    public Problem(@NotNull Exception e, @NotNull Tip t) {
        super("[ERROR] " + e.getMessage() + " {" + "'\n\n\t" + t.getTip() + "\n}");
    }
}
