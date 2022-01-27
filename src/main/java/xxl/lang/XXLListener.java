// Generated from C:/Users/Bosque/Downloads/repo/xxl/src/main/java/xxl/XXLang/etc\XXL.g4 by ANTLR 4.9.2
package xxl.lang;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link XXLParser}.
 */
public interface XXLListener extends ParseTreeListener {
    /**
     * Enter a parse tree produced by {@link XXLParser#parse}.
     *
     * @param ctx the parse tree
     */
    void enterParse(XXLParser.ParseContext ctx);

    /**
     * Exit a parse tree produced by {@link XXLParser#parse}.
     *
     * @param ctx the parse tree
     */
    void exitParse(XXLParser.ParseContext ctx);

    /**
     * Enter a parse tree produced by {@link XXLParser#block}.
     *
     * @param ctx the parse tree
     */
    void enterBlock(XXLParser.BlockContext ctx);

    /**
     * Exit a parse tree produced by {@link XXLParser#block}.
     *
     * @param ctx the parse tree
     */
    void exitBlock(XXLParser.BlockContext ctx);

    /**
     * Enter a parse tree produced by {@link XXLParser#statement}.
     *
     * @param ctx the parse tree
     */
    void enterStatement(XXLParser.StatementContext ctx);

    /**
     * Exit a parse tree produced by {@link XXLParser#statement}.
     *
     * @param ctx the parse tree
     */
    void exitStatement(XXLParser.StatementContext ctx);

    /**
     * Enter a parse tree produced by {@link XXLParser#assignment}.
     *
     * @param ctx the parse tree
     */
    void enterAssignment(XXLParser.AssignmentContext ctx);

    /**
     * Exit a parse tree produced by {@link XXLParser#assignment}.
     *
     * @param ctx the parse tree
     */
    void exitAssignment(XXLParser.AssignmentContext ctx);

    /**
     * Enter a parse tree produced by {@link XXLParser#reAssignment}.
     *
     * @param ctx the parse tree
     */
    void enterReAssignment(XXLParser.ReAssignmentContext ctx);

    /**
     * Exit a parse tree produced by {@link XXLParser#reAssignment}.
     *
     * @param ctx the parse tree
     */
    void exitReAssignment(XXLParser.ReAssignmentContext ctx);

    /**
     * Enter a parse tree produced by the {@code identifierFunctionCall}
     * labeled alternative in {@link XXLParser#functionCall}.
     *
     * @param ctx the parse tree
     */
    void enterIdentifierFunctionCall(XXLParser.IdentifierFunctionCallContext ctx);

    /**
     * Exit a parse tree produced by the {@code identifierFunctionCall}
     * labeled alternative in {@link XXLParser#functionCall}.
     *
     * @param ctx the parse tree
     */
    void exitIdentifierFunctionCall(XXLParser.IdentifierFunctionCallContext ctx);

    /**
     * Enter a parse tree produced by the {@code printlnFunctionCall}
     * labeled alternative in {@link XXLParser#functionCall}.
     *
     * @param ctx the parse tree
     */
    void enterPrintlnFunctionCall(XXLParser.PrintlnFunctionCallContext ctx);

    /**
     * Exit a parse tree produced by the {@code printlnFunctionCall}
     * labeled alternative in {@link XXLParser#functionCall}.
     *
     * @param ctx the parse tree
     */
    void exitPrintlnFunctionCall(XXLParser.PrintlnFunctionCallContext ctx);

    /**
     * Enter a parse tree produced by the {@code printFunctionCall}
     * labeled alternative in {@link XXLParser#functionCall}.
     *
     * @param ctx the parse tree
     */
    void enterPrintFunctionCall(XXLParser.PrintFunctionCallContext ctx);

    /**
     * Exit a parse tree produced by the {@code printFunctionCall}
     * labeled alternative in {@link XXLParser#functionCall}.
     *
     * @param ctx the parse tree
     */
    void exitPrintFunctionCall(XXLParser.PrintFunctionCallContext ctx);

    /**
     * Enter a parse tree produced by the {@code assertFunctionCall}
     * labeled alternative in {@link XXLParser#functionCall}.
     *
     * @param ctx the parse tree
     */
    void enterAssertFunctionCall(XXLParser.AssertFunctionCallContext ctx);

    /**
     * Exit a parse tree produced by the {@code assertFunctionCall}
     * labeled alternative in {@link XXLParser#functionCall}.
     *
     * @param ctx the parse tree
     */
    void exitAssertFunctionCall(XXLParser.AssertFunctionCallContext ctx);

    /**
     * Enter a parse tree produced by the {@code sizeFunctionCall}
     * labeled alternative in {@link XXLParser#functionCall}.
     *
     * @param ctx the parse tree
     */
    void enterSizeFunctionCall(XXLParser.SizeFunctionCallContext ctx);

    /**
     * Exit a parse tree produced by the {@code sizeFunctionCall}
     * labeled alternative in {@link XXLParser#functionCall}.
     *
     * @param ctx the parse tree
     */
    void exitSizeFunctionCall(XXLParser.SizeFunctionCallContext ctx);

    /**
     * Enter a parse tree produced by the {@code toIntFunctionCall}
     * labeled alternative in {@link XXLParser#functionCall}.
     *
     * @param ctx the parse tree
     */
    void enterToIntFunctionCall(XXLParser.ToIntFunctionCallContext ctx);

    /**
     * Exit a parse tree produced by the {@code toIntFunctionCall}
     * labeled alternative in {@link XXLParser#functionCall}.
     *
     * @param ctx the parse tree
     */
    void exitToIntFunctionCall(XXLParser.ToIntFunctionCallContext ctx);

    /**
     * Enter a parse tree produced by {@link XXLParser#ifStatement}.
     *
     * @param ctx the parse tree
     */
    void enterIfStatement(XXLParser.IfStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link XXLParser#ifStatement}.
     *
     * @param ctx the parse tree
     */
    void exitIfStatement(XXLParser.IfStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link XXLParser#ifStat}.
     *
     * @param ctx the parse tree
     */
    void enterIfStat(XXLParser.IfStatContext ctx);

    /**
     * Exit a parse tree produced by {@link XXLParser#ifStat}.
     *
     * @param ctx the parse tree
     */
    void exitIfStat(XXLParser.IfStatContext ctx);

    /**
     * Enter a parse tree produced by {@link XXLParser#elseIfStat}.
     *
     * @param ctx the parse tree
     */
    void enterElseIfStat(XXLParser.ElseIfStatContext ctx);

    /**
     * Exit a parse tree produced by {@link XXLParser#elseIfStat}.
     *
     * @param ctx the parse tree
     */
    void exitElseIfStat(XXLParser.ElseIfStatContext ctx);

    /**
     * Enter a parse tree produced by {@link XXLParser#constructorStatement}.
     *
     * @param ctx the parse tree
     */
    void enterConstructorStatement(XXLParser.ConstructorStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link XXLParser#constructorStatement}.
     *
     * @param ctx the parse tree
     */
    void exitConstructorStatement(XXLParser.ConstructorStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link XXLParser#defaultCall}.
     *
     * @param ctx the parse tree
     */
    void enterDefaultCall(XXLParser.DefaultCallContext ctx);

    /**
     * Exit a parse tree produced by {@link XXLParser#defaultCall}.
     *
     * @param ctx the parse tree
     */
    void exitDefaultCall(XXLParser.DefaultCallContext ctx);

    /**
     * Enter a parse tree produced by {@link XXLParser#elseStat}.
     *
     * @param ctx the parse tree
     */
    void enterElseStat(XXLParser.ElseStatContext ctx);

    /**
     * Exit a parse tree produced by {@link XXLParser#elseStat}.
     *
     * @param ctx the parse tree
     */
    void exitElseStat(XXLParser.ElseStatContext ctx);

    /**
     * Enter a parse tree produced by {@link XXLParser#functionDecl}.
     *
     * @param ctx the parse tree
     */
    void enterFunctionDecl(XXLParser.FunctionDeclContext ctx);

    /**
     * Exit a parse tree produced by {@link XXLParser#functionDecl}.
     *
     * @param ctx the parse tree
     */
    void exitFunctionDecl(XXLParser.FunctionDeclContext ctx);

    /**
     * Enter a parse tree produced by {@link XXLParser#forStatement}.
     *
     * @param ctx the parse tree
     */
    void enterForStatement(XXLParser.ForStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link XXLParser#forStatement}.
     *
     * @param ctx the parse tree
     */
    void exitForStatement(XXLParser.ForStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link XXLParser#importStatement}.
     *
     * @param ctx the parse tree
     */
    void enterImportStatement(XXLParser.ImportStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link XXLParser#importStatement}.
     *
     * @param ctx the parse tree
     */
    void exitImportStatement(XXLParser.ImportStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link XXLParser#tryCatchStatement}.
     *
     * @param ctx the parse tree
     */
    void enterTryCatchStatement(XXLParser.TryCatchStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link XXLParser#tryCatchStatement}.
     *
     * @param ctx the parse tree
     */
    void exitTryCatchStatement(XXLParser.TryCatchStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link XXLParser#whileStatement}.
     *
     * @param ctx the parse tree
     */
    void enterWhileStatement(XXLParser.WhileStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link XXLParser#whileStatement}.
     *
     * @param ctx the parse tree
     */
    void exitWhileStatement(XXLParser.WhileStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link XXLParser#webServerStatement}.
     *
     * @param ctx the parse tree
     */
    void enterWebServerStatement(XXLParser.WebServerStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link XXLParser#webServerStatement}.
     *
     * @param ctx the parse tree
     */
    void exitWebServerStatement(XXLParser.WebServerStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link XXLParser#addWebServerTextStatement}.
     *
     * @param ctx the parse tree
     */
    void enterAddWebServerTextStatement(XXLParser.AddWebServerTextStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link XXLParser#addWebServerTextStatement}.
     *
     * @param ctx the parse tree
     */
    void exitAddWebServerTextStatement(XXLParser.AddWebServerTextStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link XXLParser#waitStatement}.
     *
     * @param ctx the parse tree
     */
    void enterWaitStatement(XXLParser.WaitStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link XXLParser#waitStatement}.
     *
     * @param ctx the parse tree
     */
    void exitWaitStatement(XXLParser.WaitStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link XXLParser#mainFunctionStatement}.
     *
     * @param ctx the parse tree
     */
    void enterMainFunctionStatement(XXLParser.MainFunctionStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link XXLParser#mainFunctionStatement}.
     *
     * @param ctx the parse tree
     */
    void exitMainFunctionStatement(XXLParser.MainFunctionStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link XXLParser#idList}.
     *
     * @param ctx the parse tree
     */
    void enterIdList(XXLParser.IdListContext ctx);

    /**
     * Exit a parse tree produced by {@link XXLParser#idList}.
     *
     * @param ctx the parse tree
     */
    void exitIdList(XXLParser.IdListContext ctx);

    /**
     * Enter a parse tree produced by {@link XXLParser#classStatement}.
     *
     * @param ctx the parse tree
     */
    void enterClassStatement(XXLParser.ClassStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link XXLParser#classStatement}.
     *
     * @param ctx the parse tree
     */
    void exitClassStatement(XXLParser.ClassStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link XXLParser#exprList}.
     *
     * @param ctx the parse tree
     */
    void enterExprList(XXLParser.ExprListContext ctx);

    /**
     * Exit a parse tree produced by {@link XXLParser#exprList}.
     *
     * @param ctx the parse tree
     */
    void exitExprList(XXLParser.ExprListContext ctx);

    /**
     * Enter a parse tree produced by the {@code boolExpression}
     * labeled alternative in {@link XXLParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterBoolExpression(XXLParser.BoolExpressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code boolExpression}
     * labeled alternative in {@link XXLParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitBoolExpression(XXLParser.BoolExpressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code numberExpression}
     * labeled alternative in {@link XXLParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterNumberExpression(XXLParser.NumberExpressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code numberExpression}
     * labeled alternative in {@link XXLParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitNumberExpression(XXLParser.NumberExpressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code identifierExpression}
     * labeled alternative in {@link XXLParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterIdentifierExpression(XXLParser.IdentifierExpressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code identifierExpression}
     * labeled alternative in {@link XXLParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitIdentifierExpression(XXLParser.IdentifierExpressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code notExpression}
     * labeled alternative in {@link XXLParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterNotExpression(XXLParser.NotExpressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code notExpression}
     * labeled alternative in {@link XXLParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitNotExpression(XXLParser.NotExpressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code orExpression}
     * labeled alternative in {@link XXLParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterOrExpression(XXLParser.OrExpressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code orExpression}
     * labeled alternative in {@link XXLParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitOrExpression(XXLParser.OrExpressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code unaryMinusExpression}
     * labeled alternative in {@link XXLParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterUnaryMinusExpression(XXLParser.UnaryMinusExpressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code unaryMinusExpression}
     * labeled alternative in {@link XXLParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitUnaryMinusExpression(XXLParser.UnaryMinusExpressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code powerExpression}
     * labeled alternative in {@link XXLParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterPowerExpression(XXLParser.PowerExpressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code powerExpression}
     * labeled alternative in {@link XXLParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitPowerExpression(XXLParser.PowerExpressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code eqExpression}
     * labeled alternative in {@link XXLParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterEqExpression(XXLParser.EqExpressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code eqExpression}
     * labeled alternative in {@link XXLParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitEqExpression(XXLParser.EqExpressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code andExpression}
     * labeled alternative in {@link XXLParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterAndExpression(XXLParser.AndExpressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code andExpression}
     * labeled alternative in {@link XXLParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitAndExpression(XXLParser.AndExpressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code inExpression}
     * labeled alternative in {@link XXLParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterInExpression(XXLParser.InExpressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code inExpression}
     * labeled alternative in {@link XXLParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitInExpression(XXLParser.InExpressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code stringExpression}
     * labeled alternative in {@link XXLParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterStringExpression(XXLParser.StringExpressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code stringExpression}
     * labeled alternative in {@link XXLParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitStringExpression(XXLParser.StringExpressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code expressionExpression}
     * labeled alternative in {@link XXLParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterExpressionExpression(XXLParser.ExpressionExpressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code expressionExpression}
     * labeled alternative in {@link XXLParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitExpressionExpression(XXLParser.ExpressionExpressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code addExpression}
     * labeled alternative in {@link XXLParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterAddExpression(XXLParser.AddExpressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code addExpression}
     * labeled alternative in {@link XXLParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitAddExpression(XXLParser.AddExpressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code compExpression}
     * labeled alternative in {@link XXLParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterCompExpression(XXLParser.CompExpressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code compExpression}
     * labeled alternative in {@link XXLParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitCompExpression(XXLParser.CompExpressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code nullExpression}
     * labeled alternative in {@link XXLParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterNullExpression(XXLParser.NullExpressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code nullExpression}
     * labeled alternative in {@link XXLParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitNullExpression(XXLParser.NullExpressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code functionCallExpression}
     * labeled alternative in {@link XXLParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterFunctionCallExpression(XXLParser.FunctionCallExpressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code functionCallExpression}
     * labeled alternative in {@link XXLParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitFunctionCallExpression(XXLParser.FunctionCallExpressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code multExpression}
     * labeled alternative in {@link XXLParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterMultExpression(XXLParser.MultExpressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code multExpression}
     * labeled alternative in {@link XXLParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitMultExpression(XXLParser.MultExpressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code listExpression}
     * labeled alternative in {@link XXLParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterListExpression(XXLParser.ListExpressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code listExpression}
     * labeled alternative in {@link XXLParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitListExpression(XXLParser.ListExpressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code ternaryExpression}
     * labeled alternative in {@link XXLParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterTernaryExpression(XXLParser.TernaryExpressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code ternaryExpression}
     * labeled alternative in {@link XXLParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitTernaryExpression(XXLParser.TernaryExpressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code inputExpression}
     * labeled alternative in {@link XXLParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterInputExpression(XXLParser.InputExpressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code inputExpression}
     * labeled alternative in {@link XXLParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitInputExpression(XXLParser.InputExpressionContext ctx);

    /**
     * Enter a parse tree produced by {@link XXLParser#list}.
     *
     * @param ctx the parse tree
     */
    void enterList(XXLParser.ListContext ctx);

    /**
     * Exit a parse tree produced by {@link XXLParser#list}.
     *
     * @param ctx the parse tree
     */
    void exitList(XXLParser.ListContext ctx);

    /**
     * Enter a parse tree produced by {@link XXLParser#indexes}.
     *
     * @param ctx the parse tree
     */
    void enterIndexes(XXLParser.IndexesContext ctx);

    /**
     * Exit a parse tree produced by {@link XXLParser#indexes}.
     *
     * @param ctx the parse tree
     */
    void exitIndexes(XXLParser.IndexesContext ctx);
}