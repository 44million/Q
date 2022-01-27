// Generated from C:/Users/Bosque/Downloads/repo/xxl/src/main/java/xxl/XXLang/etc\XXL.g4 by ANTLR 4.9.2
package xxl.lang;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link XXLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 *            operations with no return type.
 */
public interface XXLVisitor<T> extends ParseTreeVisitor<T> {
    /**
     * Visit a parse tree produced by {@link XXLParser#parse}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitParse(XXLParser.ParseContext ctx);

    /**
     * Visit a parse tree produced by {@link XXLParser#block}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBlock(XXLParser.BlockContext ctx);

    /**
     * Visit a parse tree produced by {@link XXLParser#statement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitStatement(XXLParser.StatementContext ctx);

    /**
     * Visit a parse tree produced by {@link XXLParser#assignment}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAssignment(XXLParser.AssignmentContext ctx);

    /**
     * Visit a parse tree produced by {@link XXLParser#reAssignment}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitReAssignment(XXLParser.ReAssignmentContext ctx);

    /**
     * Visit a parse tree produced by the {@code identifierFunctionCall}
     * labeled alternative in {@link XXLParser#functionCall}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIdentifierFunctionCall(XXLParser.IdentifierFunctionCallContext ctx);

    /**
     * Visit a parse tree produced by the {@code printlnFunctionCall}
     * labeled alternative in {@link XXLParser#functionCall}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPrintlnFunctionCall(XXLParser.PrintlnFunctionCallContext ctx);

    /**
     * Visit a parse tree produced by the {@code printFunctionCall}
     * labeled alternative in {@link XXLParser#functionCall}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPrintFunctionCall(XXLParser.PrintFunctionCallContext ctx);

    /**
     * Visit a parse tree produced by the {@code assertFunctionCall}
     * labeled alternative in {@link XXLParser#functionCall}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAssertFunctionCall(XXLParser.AssertFunctionCallContext ctx);

    /**
     * Visit a parse tree produced by the {@code sizeFunctionCall}
     * labeled alternative in {@link XXLParser#functionCall}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSizeFunctionCall(XXLParser.SizeFunctionCallContext ctx);

    /**
     * Visit a parse tree produced by the {@code toIntFunctionCall}
     * labeled alternative in {@link XXLParser#functionCall}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitToIntFunctionCall(XXLParser.ToIntFunctionCallContext ctx);

    /**
     * Visit a parse tree produced by {@link XXLParser#ifStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIfStatement(XXLParser.IfStatementContext ctx);

    /**
     * Visit a parse tree produced by {@link XXLParser#ifStat}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIfStat(XXLParser.IfStatContext ctx);

    /**
     * Visit a parse tree produced by {@link XXLParser#elseIfStat}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitElseIfStat(XXLParser.ElseIfStatContext ctx);

    /**
     * Visit a parse tree produced by {@link XXLParser#constructorStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitConstructorStatement(XXLParser.ConstructorStatementContext ctx);

    /**
     * Visit a parse tree produced by {@link XXLParser#defaultCall}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDefaultCall(XXLParser.DefaultCallContext ctx);

    /**
     * Visit a parse tree produced by {@link XXLParser#elseStat}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitElseStat(XXLParser.ElseStatContext ctx);

    /**
     * Visit a parse tree produced by {@link XXLParser#functionDecl}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFunctionDecl(XXLParser.FunctionDeclContext ctx);

    /**
     * Visit a parse tree produced by {@link XXLParser#forStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitForStatement(XXLParser.ForStatementContext ctx);

    /**
     * Visit a parse tree produced by {@link XXLParser#importStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitImportStatement(XXLParser.ImportStatementContext ctx);

    /**
     * Visit a parse tree produced by {@link XXLParser#tryCatchStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTryCatchStatement(XXLParser.TryCatchStatementContext ctx);

    /**
     * Visit a parse tree produced by {@link XXLParser#whileStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitWhileStatement(XXLParser.WhileStatementContext ctx);

    /**
     * Visit a parse tree produced by {@link XXLParser#webServerStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitWebServerStatement(XXLParser.WebServerStatementContext ctx);

    /**
     * Visit a parse tree produced by {@link XXLParser#addWebServerTextStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAddWebServerTextStatement(XXLParser.AddWebServerTextStatementContext ctx);

    /**
     * Visit a parse tree produced by {@link XXLParser#waitStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitWaitStatement(XXLParser.WaitStatementContext ctx);

    /**
     * Visit a parse tree produced by {@link XXLParser#mainFunctionStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMainFunctionStatement(XXLParser.MainFunctionStatementContext ctx);

    /**
     * Visit a parse tree produced by {@link XXLParser#idList}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIdList(XXLParser.IdListContext ctx);

    /**
     * Visit a parse tree produced by {@link XXLParser#classStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitClassStatement(XXLParser.ClassStatementContext ctx);

    /**
     * Visit a parse tree produced by {@link XXLParser#exprList}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitExprList(XXLParser.ExprListContext ctx);

    /**
     * Visit a parse tree produced by the {@code boolExpression}
     * labeled alternative in {@link XXLParser#expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBoolExpression(XXLParser.BoolExpressionContext ctx);

    /**
     * Visit a parse tree produced by the {@code numberExpression}
     * labeled alternative in {@link XXLParser#expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitNumberExpression(XXLParser.NumberExpressionContext ctx);

    /**
     * Visit a parse tree produced by the {@code identifierExpression}
     * labeled alternative in {@link XXLParser#expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIdentifierExpression(XXLParser.IdentifierExpressionContext ctx);

    /**
     * Visit a parse tree produced by the {@code notExpression}
     * labeled alternative in {@link XXLParser#expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitNotExpression(XXLParser.NotExpressionContext ctx);

    /**
     * Visit a parse tree produced by the {@code orExpression}
     * labeled alternative in {@link XXLParser#expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitOrExpression(XXLParser.OrExpressionContext ctx);

    /**
     * Visit a parse tree produced by the {@code unaryMinusExpression}
     * labeled alternative in {@link XXLParser#expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitUnaryMinusExpression(XXLParser.UnaryMinusExpressionContext ctx);

    /**
     * Visit a parse tree produced by the {@code powerExpression}
     * labeled alternative in {@link XXLParser#expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPowerExpression(XXLParser.PowerExpressionContext ctx);

    /**
     * Visit a parse tree produced by the {@code eqExpression}
     * labeled alternative in {@link XXLParser#expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitEqExpression(XXLParser.EqExpressionContext ctx);

    /**
     * Visit a parse tree produced by the {@code andExpression}
     * labeled alternative in {@link XXLParser#expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAndExpression(XXLParser.AndExpressionContext ctx);

    /**
     * Visit a parse tree produced by the {@code inExpression}
     * labeled alternative in {@link XXLParser#expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitInExpression(XXLParser.InExpressionContext ctx);

    /**
     * Visit a parse tree produced by the {@code stringExpression}
     * labeled alternative in {@link XXLParser#expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitStringExpression(XXLParser.StringExpressionContext ctx);

    /**
     * Visit a parse tree produced by the {@code expressionExpression}
     * labeled alternative in {@link XXLParser#expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitExpressionExpression(XXLParser.ExpressionExpressionContext ctx);

    /**
     * Visit a parse tree produced by the {@code addExpression}
     * labeled alternative in {@link XXLParser#expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAddExpression(XXLParser.AddExpressionContext ctx);

    /**
     * Visit a parse tree produced by the {@code compExpression}
     * labeled alternative in {@link XXLParser#expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCompExpression(XXLParser.CompExpressionContext ctx);

    /**
     * Visit a parse tree produced by the {@code nullExpression}
     * labeled alternative in {@link XXLParser#expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitNullExpression(XXLParser.NullExpressionContext ctx);

    /**
     * Visit a parse tree produced by the {@code functionCallExpression}
     * labeled alternative in {@link XXLParser#expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFunctionCallExpression(XXLParser.FunctionCallExpressionContext ctx);

    /**
     * Visit a parse tree produced by the {@code multExpression}
     * labeled alternative in {@link XXLParser#expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMultExpression(XXLParser.MultExpressionContext ctx);

    /**
     * Visit a parse tree produced by the {@code listExpression}
     * labeled alternative in {@link XXLParser#expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitListExpression(XXLParser.ListExpressionContext ctx);

    /**
     * Visit a parse tree produced by the {@code ternaryExpression}
     * labeled alternative in {@link XXLParser#expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTernaryExpression(XXLParser.TernaryExpressionContext ctx);

    /**
     * Visit a parse tree produced by the {@code inputExpression}
     * labeled alternative in {@link XXLParser#expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitInputExpression(XXLParser.InputExpressionContext ctx);

    /**
     * Visit a parse tree produced by {@link XXLParser#list}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitList(XXLParser.ListContext ctx);

    /**
     * Visit a parse tree produced by {@link XXLParser#indexes}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIndexes(XXLParser.IndexesContext ctx);
}