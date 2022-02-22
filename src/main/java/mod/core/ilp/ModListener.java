// Generated from /Users/harryharbuck-marlowe/Desktop/Q/src/main/java/modulesParser/core/Mod.g4 by ANTLR 4.9.2
package mod.core.ilp;

import mod.raw.ModParser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ModParser}.
 */
public interface ModListener extends ParseTreeListener {
    /**
     * Enter a parse tree produced by {@link ModParser#parse}.
     *
     * @param ctx the parse tree
     */
    void enterParse(ModParser.ParseContext ctx);

    /**
     * Exit a parse tree produced by {@link ModParser#parse}.
     *
     * @param ctx the parse tree
     */
    void exitParse(ModParser.ParseContext ctx);

    /**
     * Enter a parse tree produced by {@link ModParser#block}.
     *
     * @param ctx the parse tree
     */
    void enterBlock(ModParser.BlockContext ctx);

    /**
     * Exit a parse tree produced by {@link ModParser#block}.
     *
     * @param ctx the parse tree
     */
    void exitBlock(ModParser.BlockContext ctx);

    /**
     * Enter a parse tree produced by {@link ModParser#importStatement}.
     *
     * @param ctx the parse tree
     */
    void enterImportStatement(ModParser.ImportStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link ModParser#importStatement}.
     *
     * @param ctx the parse tree
     */
    void exitImportStatement(ModParser.ImportStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link ModParser#extensiveQStatement}.
     *
     * @param ctx the parse tree
     */
    void enterExtensiveQStatement(ModParser.ExtensiveQStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link ModParser#extensiveQStatement}.
     *
     * @param ctx the parse tree
     */
    void exitExtensiveQStatement(ModParser.ExtensiveQStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link ModParser#headerStatement}.
     *
     * @param ctx the parse tree
     */
    void enterHeaderStatement(ModParser.HeaderStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link ModParser#headerStatement}.
     *
     * @param ctx the parse tree
     */
    void exitHeaderStatement(ModParser.HeaderStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link ModParser#fromGitStatement}.
     *
     * @param ctx the parse tree
     */
    void enterFromGitStatement(ModParser.FromGitStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link ModParser#fromGitStatement}.
     *
     * @param ctx the parse tree
     */
    void exitFromGitStatement(ModParser.FromGitStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link ModParser#loadfStatement}.
     *
     * @param ctx the parse tree
     */
    void enterLoadfStatement(ModParser.LoadfStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link ModParser#loadfStatement}.
     *
     * @param ctx the parse tree
     */
    void exitLoadfStatement(ModParser.LoadfStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link ModParser#loadStatement}.
     *
     * @param ctx the parse tree
     */
    void enterLoadStatement(ModParser.LoadStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link ModParser#loadStatement}.
     *
     * @param ctx the parse tree
     */
    void exitLoadStatement(ModParser.LoadStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link ModParser#finishStatement}.
     *
     * @param ctx the parse tree
     */
    void enterFinishStatement(ModParser.FinishStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link ModParser#finishStatement}.
     *
     * @param ctx the parse tree
     */
    void exitFinishStatement(ModParser.FinishStatementContext ctx);
}