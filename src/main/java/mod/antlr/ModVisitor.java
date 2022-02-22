// Generated from /Users/harryharbuck-marlowe/Desktop/Q/src/main/java/modulesParser/core/Mod.g4 by ANTLR 4.9.2
package mod.antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ModParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 *            operations with no return type.
 */
public interface ModVisitor<T> extends ParseTreeVisitor<T> {
    /**
     * Visit a parse tree produced by {@link ModParser#parse}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitParse(ModParser.ParseContext ctx);

    /**
     * Visit a parse tree produced by {@link ModParser#block}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBlock(ModParser.BlockContext ctx);

    /**
     * Visit a parse tree produced by {@link ModParser#importStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitImportStatement(ModParser.ImportStatementContext ctx);

    /**
     * Visit a parse tree produced by {@link ModParser#extensiveQStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitExtensiveQStatement(ModParser.ExtensiveQStatementContext ctx);

    /**
     * Visit a parse tree produced by {@link ModParser#headerStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitHeaderStatement(ModParser.HeaderStatementContext ctx);

    /**
     * Visit a parse tree produced by {@link ModParser#fromGitStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFromGitStatement(ModParser.FromGitStatementContext ctx);

    /**
     * Visit a parse tree produced by {@link ModParser#loadfStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitLoadfStatement(ModParser.LoadfStatementContext ctx);

    /**
     * Visit a parse tree produced by {@link ModParser#loadStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitLoadStatement(ModParser.LoadStatementContext ctx);

    /**
     * Visit a parse tree produced by {@link ModParser#finishStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFinishStatement(ModParser.FinishStatementContext ctx);
}