// Generated from /Users/harryharbuck-marlowe/Desktop/xxl/src/main/java/xxl/XXLang/etc/Q.g4 by ANTLR 4.9.2
package QParserAndLexer.lang;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link QParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 *            operations with no return type.
 */
public interface QVisitor<T> extends ParseTreeVisitor<T> {
    /**
     * Visit a parse tree produced by {@link QParser#parse}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitParse(QParser.ParseContext ctx);

    /**
     * Visit a parse tree produced by {@link QParser#block}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBlock(QParser.BlockContext ctx);

    /**
     * Visit a parse tree produced by {@link QParser#statement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitStatement(QParser.StatementContext ctx);

    /**
     * Visit a parse tree produced by {@link QParser#assignment}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAssignment(QParser.AssignmentContext ctx);

    /**
     * Visit a parse tree produced by {@link QParser#reAssignment}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitReAssignment(QParser.ReAssignmentContext ctx);

    /**
     * Visit a parse tree produced by the {@code identifierFunctionCall}
     * labeled alternative in {@link QParser#functionCall}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIdentifierFunctionCall(QParser.IdentifierFunctionCallContext ctx);

    /**
     * Visit a parse tree produced by the {@code printlnFunctionCall}
     * labeled alternative in {@link QParser#functionCall}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPrintlnFunctionCall(QParser.PrintlnFunctionCallContext ctx);

    /**
     * Visit a parse tree produced by the {@code printFunctionCall}
     * labeled alternative in {@link QParser#functionCall}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPrintFunctionCall(QParser.PrintFunctionCallContext ctx);

    /**
     * Visit a parse tree produced by the {@code assertFunctionCall}
     * labeled alternative in {@link QParser#functionCall}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAssertFunctionCall(QParser.AssertFunctionCallContext ctx);

    /**
     * Visit a parse tree produced by the {@code sizeFunctionCall}
     * labeled alternative in {@link QParser#functionCall}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSizeFunctionCall(QParser.SizeFunctionCallContext ctx);

    /**
     * Visit a parse tree produced by the {@code toIntFunctionCall}
     * labeled alternative in {@link QParser#functionCall}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitToIntFunctionCall(QParser.ToIntFunctionCallContext ctx);

    /**
     * Visit a parse tree produced by {@link QParser#ifStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIfStatement(QParser.IfStatementContext ctx);

    /**
     * Visit a parse tree produced by {@link QParser#ifStat}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIfStat(QParser.IfStatContext ctx);

    /**
     * Visit a parse tree produced by {@link QParser#elseIfStat}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitElseIfStat(QParser.ElseIfStatContext ctx);

    /**
     * Visit a parse tree produced by {@link QParser#constructorStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitConstructorStatement(QParser.ConstructorStatementContext ctx);

    /**
     * Visit a parse tree produced by {@link QParser#fileObjectInitializeStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFileObjectInitializeStatement(QParser.FileObjectInitializeStatementContext ctx);

    /**
     * Visit a parse tree produced by {@link QParser#fileWriteStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFileWriteStatement(QParser.FileWriteStatementContext ctx);

    /**
     * Visit a parse tree produced by {@link QParser#verifyFileStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitVerifyFileStatement(QParser.VerifyFileStatementContext ctx);

    /**
     * Visit a parse tree produced by {@link QParser#defaultCall}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDefaultCall(QParser.DefaultCallContext ctx);

    /**
     * Visit a parse tree produced by {@link QParser#elseStat}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitElseStat(QParser.ElseStatContext ctx);

    /**
     * Visit a parse tree produced by {@link QParser#functionDecl}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFunctionDecl(QParser.FunctionDeclContext ctx);

    /**
     * Visit a parse tree produced by {@link QParser#forStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitForStatement(QParser.ForStatementContext ctx);

    /**
     * Visit a parse tree produced by {@link QParser#importStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitImportStatement(QParser.ImportStatementContext ctx);

    /**
     * Visit a parse tree produced by {@link QParser#tryCatchStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTryCatchStatement(QParser.TryCatchStatementContext ctx);

    /**
     * Visit a parse tree produced by {@link QParser#whileStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitWhileStatement(QParser.WhileStatementContext ctx);

    /**
     * Visit a parse tree produced by {@link QParser#webServerStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitWebServerStatement(QParser.WebServerStatementContext ctx);

    /**
     * Visit a parse tree produced by {@link QParser#windowCreateStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitWindowCreateStatement(QParser.WindowCreateStatementContext ctx);

    /**
     * Visit a parse tree produced by {@link QParser#windowRenderStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitWindowRenderStatement(QParser.WindowRenderStatementContext ctx);

    /**
     * Visit a parse tree produced by {@link QParser#windowAddCompStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitWindowAddCompStatement(QParser.WindowAddCompStatementContext ctx);

    /**
     * Visit a parse tree produced by {@link QParser#componentCreateStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitComponentCreateStatement(QParser.ComponentCreateStatementContext ctx);

    /**
     * Visit a parse tree produced by {@link QParser#addWebServerTextStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAddWebServerTextStatement(QParser.AddWebServerTextStatementContext ctx);

    /**
     * Visit a parse tree produced by {@link QParser#waitStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitWaitStatement(QParser.WaitStatementContext ctx);

    /**
     * Visit a parse tree produced by {@link QParser#mainFunctionStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMainFunctionStatement(QParser.MainFunctionStatementContext ctx);

    /**
     * Visit a parse tree produced by {@link QParser#idList}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIdList(QParser.IdListContext ctx);

    /**
     * Visit a parse tree produced by {@link QParser#classStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitClassStatement(QParser.ClassStatementContext ctx);

    /**
     * Visit a parse tree produced by {@link QParser#exprList}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitExprList(QParser.ExprListContext ctx);

    /**
     * Visit a parse tree produced by the {@code boolExpression}
     * labeled alternative in {@link QParser#expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBoolExpression(QParser.BoolExpressionContext ctx);

    /**
     * Visit a parse tree produced by the {@code numberExpression}
     * labeled alternative in {@link QParser#expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitNumberExpression(QParser.NumberExpressionContext ctx);

    /**
     * Visit a parse tree produced by the {@code identifierExpression}
     * labeled alternative in {@link QParser#expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIdentifierExpression(QParser.IdentifierExpressionContext ctx);

    /**
     * Visit a parse tree produced by the {@code notExpression}
     * labeled alternative in {@link QParser#expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitNotExpression(QParser.NotExpressionContext ctx);

    /**
     * Visit a parse tree produced by the {@code orExpression}
     * labeled alternative in {@link QParser#expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitOrExpression(QParser.OrExpressionContext ctx);

    /**
     * Visit a parse tree produced by the {@code unaryMinusExpression}
     * labeled alternative in {@link QParser#expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitUnaryMinusExpression(QParser.UnaryMinusExpressionContext ctx);

    /**
     * Visit a parse tree produced by the {@code powerExpression}
     * labeled alternative in {@link QParser#expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPowerExpression(QParser.PowerExpressionContext ctx);

    /**
     * Visit a parse tree produced by the {@code eqExpression}
     * labeled alternative in {@link QParser#expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitEqExpression(QParser.EqExpressionContext ctx);

    /**
     * Visit a parse tree produced by the {@code andExpression}
     * labeled alternative in {@link QParser#expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAndExpression(QParser.AndExpressionContext ctx);

    /**
     * Visit a parse tree produced by the {@code inExpression}
     * labeled alternative in {@link QParser#expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitInExpression(QParser.InExpressionContext ctx);

    /**
     * Visit a parse tree produced by the {@code stringExpression}
     * labeled alternative in {@link QParser#expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitStringExpression(QParser.StringExpressionContext ctx);

    /**
     * Visit a parse tree produced by the {@code expressionExpression}
     * labeled alternative in {@link QParser#expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitExpressionExpression(QParser.ExpressionExpressionContext ctx);

    /**
     * Visit a parse tree produced by the {@code addExpression}
     * labeled alternative in {@link QParser#expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAddExpression(QParser.AddExpressionContext ctx);

    /**
     * Visit a parse tree produced by the {@code compExpression}
     * labeled alternative in {@link QParser#expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCompExpression(QParser.CompExpressionContext ctx);

    /**
     * Visit a parse tree produced by the {@code nullExpression}
     * labeled alternative in {@link QParser#expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitNullExpression(QParser.NullExpressionContext ctx);

    /**
     * Visit a parse tree produced by the {@code functionCallExpression}
     * labeled alternative in {@link QParser#expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFunctionCallExpression(QParser.FunctionCallExpressionContext ctx);

    /**
     * Visit a parse tree produced by the {@code multExpression}
     * labeled alternative in {@link QParser#expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMultExpression(QParser.MultExpressionContext ctx);

    /**
     * Visit a parse tree produced by the {@code listExpression}
     * labeled alternative in {@link QParser#expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitListExpression(QParser.ListExpressionContext ctx);

    /**
     * Visit a parse tree produced by the {@code ternaryExpression}
     * labeled alternative in {@link QParser#expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTernaryExpression(QParser.TernaryExpressionContext ctx);

    /**
     * Visit a parse tree produced by the {@code inputExpression}
     * labeled alternative in {@link QParser#expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitInputExpression(QParser.InputExpressionContext ctx);

    /**
     * Visit a parse tree produced by {@link QParser#list}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitList(QParser.ListContext ctx);

    /**
     * Visit a parse tree produced by {@link QParser#indexes}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIndexes(QParser.IndexesContext ctx);
}