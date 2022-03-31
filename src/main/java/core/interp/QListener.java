// Generated from /Users/harryharbuck-marlowe/Downloads/Q/src/main/java/core/etc/Q.g4 by ANTLR 4.9.2
package core.interp;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link QParser}.
 */
public interface QListener extends ParseTreeListener {
    /**
     * Enter a parse tree produced by {@link QParser#parse}.
     *
     * @param ctx the parse tree
     */
    void enterParse(QParser.ParseContext ctx);

    /**
     * Exit a parse tree produced by {@link QParser#parse}.
     *
     * @param ctx the parse tree
     */
    void exitParse(QParser.ParseContext ctx);

    /**
     * Enter a parse tree produced by {@link QParser#block}.
     *
     * @param ctx the parse tree
     */
    void enterBlock(QParser.BlockContext ctx);

    /**
     * Exit a parse tree produced by {@link QParser#block}.
     *
     * @param ctx the parse tree
     */
    void exitBlock(QParser.BlockContext ctx);

    /**
     * Enter a parse tree produced by {@link QParser#statement}.
     *
     * @param ctx the parse tree
     */
    void enterStatement(QParser.StatementContext ctx);

    /**
     * Exit a parse tree produced by {@link QParser#statement}.
     *
     * @param ctx the parse tree
     */
    void exitStatement(QParser.StatementContext ctx);

    /**
     * Enter a parse tree produced by {@link QParser#reAssignment}.
     *
     * @param ctx the parse tree
     */
    void enterReAssignment(QParser.ReAssignmentContext ctx);

    /**
     * Exit a parse tree produced by {@link QParser#reAssignment}.
     *
     * @param ctx the parse tree
     */
    void exitReAssignment(QParser.ReAssignmentContext ctx);

    /**
     * Enter a parse tree produced by {@link QParser#assignment}.
     *
     * @param ctx the parse tree
     */
    void enterAssignment(QParser.AssignmentContext ctx);

    /**
     * Exit a parse tree produced by {@link QParser#assignment}.
     *
     * @param ctx the parse tree
     */
    void exitAssignment(QParser.AssignmentContext ctx);

    /**
     * Enter a parse tree produced by the {@code identifierFunctionCall}
     * labeled alternative in {@link QParser#functionCall}.
     *
     * @param ctx the parse tree
     */
    void enterIdentifierFunctionCall(QParser.IdentifierFunctionCallContext ctx);

    /**
     * Exit a parse tree produced by the {@code identifierFunctionCall}
     * labeled alternative in {@link QParser#functionCall}.
     *
     * @param ctx the parse tree
     */
    void exitIdentifierFunctionCall(QParser.IdentifierFunctionCallContext ctx);

    /**
     * Enter a parse tree produced by the {@code printlnFunctionCall}
     * labeled alternative in {@link QParser#functionCall}.
     *
     * @param ctx the parse tree
     */
    void enterPrintlnFunctionCall(QParser.PrintlnFunctionCallContext ctx);

    /**
     * Exit a parse tree produced by the {@code printlnFunctionCall}
     * labeled alternative in {@link QParser#functionCall}.
     *
     * @param ctx the parse tree
     */
    void exitPrintlnFunctionCall(QParser.PrintlnFunctionCallContext ctx);

    /**
     * Enter a parse tree produced by the {@code printFunctionCall}
     * labeled alternative in {@link QParser#functionCall}.
     *
     * @param ctx the parse tree
     */
    void enterPrintFunctionCall(QParser.PrintFunctionCallContext ctx);

    /**
     * Exit a parse tree produced by the {@code printFunctionCall}
     * labeled alternative in {@link QParser#functionCall}.
     *
     * @param ctx the parse tree
     */
    void exitPrintFunctionCall(QParser.PrintFunctionCallContext ctx);

    /**
     * Enter a parse tree produced by the {@code assertFunctionCall}
     * labeled alternative in {@link QParser#functionCall}.
     *
     * @param ctx the parse tree
     */
    void enterAssertFunctionCall(QParser.AssertFunctionCallContext ctx);

    /**
     * Exit a parse tree produced by the {@code assertFunctionCall}
     * labeled alternative in {@link QParser#functionCall}.
     *
     * @param ctx the parse tree
     */
    void exitAssertFunctionCall(QParser.AssertFunctionCallContext ctx);

    /**
     * Enter a parse tree produced by the {@code toIntFunctionCall}
     * labeled alternative in {@link QParser#functionCall}.
     *
     * @param ctx the parse tree
     */
    void enterToIntFunctionCall(QParser.ToIntFunctionCallContext ctx);

    /**
     * Exit a parse tree produced by the {@code toIntFunctionCall}
     * labeled alternative in {@link QParser#functionCall}.
     *
     * @param ctx the parse tree
     */
    void exitToIntFunctionCall(QParser.ToIntFunctionCallContext ctx);

    /**
     * Enter a parse tree produced by the {@code objFunctionCallExpression}
     * labeled alternative in {@link QParser#functionCall}.
     *
     * @param ctx the parse tree
     */
    void enterObjFunctionCallExpression(QParser.ObjFunctionCallExpressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code objFunctionCallExpression}
     * labeled alternative in {@link QParser#functionCall}.
     *
     * @param ctx the parse tree
     */
    void exitObjFunctionCallExpression(QParser.ObjFunctionCallExpressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code fileSystemImportStatement}
     * labeled alternative in {@link QParser#allImport}.
     *
     * @param ctx the parse tree
     */
    void enterFileSystemImportStatement(QParser.FileSystemImportStatementContext ctx);

    /**
     * Exit a parse tree produced by the {@code fileSystemImportStatement}
     * labeled alternative in {@link QParser#allImport}.
     *
     * @param ctx the parse tree
     */
    void exitFileSystemImportStatement(QParser.FileSystemImportStatementContext ctx);

    /**
     * Enter a parse tree produced by the {@code githubImportStatement}
     * labeled alternative in {@link QParser#allImport}.
     *
     * @param ctx the parse tree
     */
    void enterGithubImportStatement(QParser.GithubImportStatementContext ctx);

    /**
     * Exit a parse tree produced by the {@code githubImportStatement}
     * labeled alternative in {@link QParser#allImport}.
     *
     * @param ctx the parse tree
     */
    void exitGithubImportStatement(QParser.GithubImportStatementContext ctx);

    /**
     * Enter a parse tree produced by the {@code importAll}
     * labeled alternative in {@link QParser#allImport}.
     *
     * @param ctx the parse tree
     */
    void enterImportAll(QParser.ImportAllContext ctx);

    /**
     * Exit a parse tree produced by the {@code importAll}
     * labeled alternative in {@link QParser#allImport}.
     *
     * @param ctx the parse tree
     */
    void exitImportAll(QParser.ImportAllContext ctx);

    /**
     * Enter a parse tree produced by {@link QParser#objFunctionCall}.
     *
     * @param ctx the parse tree
     */
    void enterObjFunctionCall(QParser.ObjFunctionCallContext ctx);

    /**
     * Exit a parse tree produced by {@link QParser#objFunctionCall}.
     *
     * @param ctx the parse tree
     */
    void exitObjFunctionCall(QParser.ObjFunctionCallContext ctx);

    /**
     * Enter a parse tree produced by {@link QParser#packageStatement}.
     *
     * @param ctx the parse tree
     */
    void enterPackageStatement(QParser.PackageStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link QParser#packageStatement}.
     *
     * @param ctx the parse tree
     */
    void exitPackageStatement(QParser.PackageStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link QParser#header}.
     *
     * @param ctx the parse tree
     */
    void enterHeader(QParser.HeaderContext ctx);

    /**
     * Exit a parse tree produced by {@link QParser#header}.
     *
     * @param ctx the parse tree
     */
    void exitHeader(QParser.HeaderContext ctx);

    /**
     * Enter a parse tree produced by {@link QParser#ifStatement}.
     *
     * @param ctx the parse tree
     */
    void enterIfStatement(QParser.IfStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link QParser#ifStatement}.
     *
     * @param ctx the parse tree
     */
    void exitIfStatement(QParser.IfStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link QParser#ifStat}.
     *
     * @param ctx the parse tree
     */
    void enterIfStat(QParser.IfStatContext ctx);

    /**
     * Exit a parse tree produced by {@link QParser#ifStat}.
     *
     * @param ctx the parse tree
     */
    void exitIfStat(QParser.IfStatContext ctx);

    /**
     * Enter a parse tree produced by {@link QParser#hereStatement}.
     *
     * @param ctx the parse tree
     */
    void enterHereStatement(QParser.HereStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link QParser#hereStatement}.
     *
     * @param ctx the parse tree
     */
    void exitHereStatement(QParser.HereStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link QParser#varHereStatement}.
     *
     * @param ctx the parse tree
     */
    void enterVarHereStatement(QParser.VarHereStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link QParser#varHereStatement}.
     *
     * @param ctx the parse tree
     */
    void exitVarHereStatement(QParser.VarHereStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link QParser#elseIfStat}.
     *
     * @param ctx the parse tree
     */
    void enterElseIfStat(QParser.ElseIfStatContext ctx);

    /**
     * Exit a parse tree produced by {@link QParser#elseIfStat}.
     *
     * @param ctx the parse tree
     */
    void exitElseIfStat(QParser.ElseIfStatContext ctx);

    /**
     * Enter a parse tree produced by {@link QParser#constructorStatement}.
     *
     * @param ctx the parse tree
     */
    void enterConstructorStatement(QParser.ConstructorStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link QParser#constructorStatement}.
     *
     * @param ctx the parse tree
     */
    void exitConstructorStatement(QParser.ConstructorStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link QParser#objCreateStatement}.
     *
     * @param ctx the parse tree
     */
    void enterObjCreateStatement(QParser.ObjCreateStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link QParser#objCreateStatement}.
     *
     * @param ctx the parse tree
     */
    void exitObjCreateStatement(QParser.ObjCreateStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link QParser#osExecStatement}.
     *
     * @param ctx the parse tree
     */
    void enterOsExecStatement(QParser.OsExecStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link QParser#osExecStatement}.
     *
     * @param ctx the parse tree
     */
    void exitOsExecStatement(QParser.OsExecStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link QParser#fileWriteStatement}.
     *
     * @param ctx the parse tree
     */
    void enterFileWriteStatement(QParser.FileWriteStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link QParser#fileWriteStatement}.
     *
     * @param ctx the parse tree
     */
    void exitFileWriteStatement(QParser.FileWriteStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link QParser#elseStat}.
     *
     * @param ctx the parse tree
     */
    void enterElseStat(QParser.ElseStatContext ctx);

    /**
     * Exit a parse tree produced by {@link QParser#elseStat}.
     *
     * @param ctx the parse tree
     */
    void exitElseStat(QParser.ElseStatContext ctx);

    /**
     * Enter a parse tree produced by {@link QParser#functionDecl}.
     *
     * @param ctx the parse tree
     */
    void enterFunctionDecl(QParser.FunctionDeclContext ctx);

    /**
     * Exit a parse tree produced by {@link QParser#functionDecl}.
     *
     * @param ctx the parse tree
     */
    void exitFunctionDecl(QParser.FunctionDeclContext ctx);

    /**
     * Enter a parse tree produced by {@link QParser#forStatement}.
     *
     * @param ctx the parse tree
     */
    void enterForStatement(QParser.ForStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link QParser#forStatement}.
     *
     * @param ctx the parse tree
     */
    void exitForStatement(QParser.ForStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link QParser#forInStatement}.
     *
     * @param ctx the parse tree
     */
    void enterForInStatement(QParser.ForInStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link QParser#forInStatement}.
     *
     * @param ctx the parse tree
     */
    void exitForInStatement(QParser.ForInStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link QParser#importStatement}.
     *
     * @param ctx the parse tree
     */
    void enterImportStatement(QParser.ImportStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link QParser#importStatement}.
     *
     * @param ctx the parse tree
     */
    void exitImportStatement(QParser.ImportStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link QParser#anonymousFunction}.
     *
     * @param ctx the parse tree
     */
    void enterAnonymousFunction(QParser.AnonymousFunctionContext ctx);

    /**
     * Exit a parse tree produced by {@link QParser#anonymousFunction}.
     *
     * @param ctx the parse tree
     */
    void exitAnonymousFunction(QParser.AnonymousFunctionContext ctx);

    /**
     * Enter a parse tree produced by {@link QParser#importFromGithubStatement}.
     *
     * @param ctx the parse tree
     */
    void enterImportFromGithubStatement(QParser.ImportFromGithubStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link QParser#importFromGithubStatement}.
     *
     * @param ctx the parse tree
     */
    void exitImportFromGithubStatement(QParser.ImportFromGithubStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link QParser#importAllStatement}.
     *
     * @param ctx the parse tree
     */
    void enterImportAllStatement(QParser.ImportAllStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link QParser#importAllStatement}.
     *
     * @param ctx the parse tree
     */
    void exitImportAllStatement(QParser.ImportAllStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link QParser#atStatement}.
     *
     * @param ctx the parse tree
     */
    void enterAtStatement(QParser.AtStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link QParser#atStatement}.
     *
     * @param ctx the parse tree
     */
    void exitAtStatement(QParser.AtStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link QParser#tryCatchStatement}.
     *
     * @param ctx the parse tree
     */
    void enterTryCatchStatement(QParser.TryCatchStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link QParser#tryCatchStatement}.
     *
     * @param ctx the parse tree
     */
    void exitTryCatchStatement(QParser.TryCatchStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link QParser#whileStatement}.
     *
     * @param ctx the parse tree
     */
    void enterWhileStatement(QParser.WhileStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link QParser#whileStatement}.
     *
     * @param ctx the parse tree
     */
    void exitWhileStatement(QParser.WhileStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link QParser#mainFunctionStatement}.
     *
     * @param ctx the parse tree
     */
    void enterMainFunctionStatement(QParser.MainFunctionStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link QParser#mainFunctionStatement}.
     *
     * @param ctx the parse tree
     */
    void exitMainFunctionStatement(QParser.MainFunctionStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link QParser#idList}.
     *
     * @param ctx the parse tree
     */
    void enterIdList(QParser.IdListContext ctx);

    /**
     * Exit a parse tree produced by {@link QParser#idList}.
     *
     * @param ctx the parse tree
     */
    void exitIdList(QParser.IdListContext ctx);

    /**
     * Enter a parse tree produced by {@link QParser#classStatement}.
     *
     * @param ctx the parse tree
     */
    void enterClassStatement(QParser.ClassStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link QParser#classStatement}.
     *
     * @param ctx the parse tree
     */
    void exitClassStatement(QParser.ClassStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link QParser#exprList}.
     *
     * @param ctx the parse tree
     */
    void enterExprList(QParser.ExprListContext ctx);

    /**
     * Exit a parse tree produced by {@link QParser#exprList}.
     *
     * @param ctx the parse tree
     */
    void exitExprList(QParser.ExprListContext ctx);

    /**
     * Enter a parse tree produced by the {@code numberExpression}
     * labeled alternative in {@link QParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterNumberExpression(QParser.NumberExpressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code numberExpression}
     * labeled alternative in {@link QParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitNumberExpression(QParser.NumberExpressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code identifierExpression}
     * labeled alternative in {@link QParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterIdentifierExpression(QParser.IdentifierExpressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code identifierExpression}
     * labeled alternative in {@link QParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitIdentifierExpression(QParser.IdentifierExpressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code notExpression}
     * labeled alternative in {@link QParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterNotExpression(QParser.NotExpressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code notExpression}
     * labeled alternative in {@link QParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitNotExpression(QParser.NotExpressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code andExpression}
     * labeled alternative in {@link QParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterAndExpression(QParser.AndExpressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code andExpression}
     * labeled alternative in {@link QParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitAndExpression(QParser.AndExpressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code stringExpression}
     * labeled alternative in {@link QParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterStringExpression(QParser.StringExpressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code stringExpression}
     * labeled alternative in {@link QParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitStringExpression(QParser.StringExpressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code anonymousFunctionExpression}
     * labeled alternative in {@link QParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterAnonymousFunctionExpression(QParser.AnonymousFunctionExpressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code anonymousFunctionExpression}
     * labeled alternative in {@link QParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitAnonymousFunctionExpression(QParser.AnonymousFunctionExpressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code expressionExpression}
     * labeled alternative in {@link QParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterExpressionExpression(QParser.ExpressionExpressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code expressionExpression}
     * labeled alternative in {@link QParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitExpressionExpression(QParser.ExpressionExpressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code compExpression}
     * labeled alternative in {@link QParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterCompExpression(QParser.CompExpressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code compExpression}
     * labeled alternative in {@link QParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitCompExpression(QParser.CompExpressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code nullExpression}
     * labeled alternative in {@link QParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterNullExpression(QParser.NullExpressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code nullExpression}
     * labeled alternative in {@link QParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitNullExpression(QParser.NullExpressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code functionCallExpression}
     * labeled alternative in {@link QParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterFunctionCallExpression(QParser.FunctionCallExpressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code functionCallExpression}
     * labeled alternative in {@link QParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitFunctionCallExpression(QParser.FunctionCallExpressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code multExpression}
     * labeled alternative in {@link QParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterMultExpression(QParser.MultExpressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code multExpression}
     * labeled alternative in {@link QParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitMultExpression(QParser.MultExpressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code listExpression}
     * labeled alternative in {@link QParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterListExpression(QParser.ListExpressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code listExpression}
     * labeled alternative in {@link QParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitListExpression(QParser.ListExpressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code boolExpression}
     * labeled alternative in {@link QParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterBoolExpression(QParser.BoolExpressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code boolExpression}
     * labeled alternative in {@link QParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitBoolExpression(QParser.BoolExpressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code objVarExpression}
     * labeled alternative in {@link QParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterObjVarExpression(QParser.ObjVarExpressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code objVarExpression}
     * labeled alternative in {@link QParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitObjVarExpression(QParser.ObjVarExpressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code orExpression}
     * labeled alternative in {@link QParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterOrExpression(QParser.OrExpressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code orExpression}
     * labeled alternative in {@link QParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitOrExpression(QParser.OrExpressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code unaryMinusExpression}
     * labeled alternative in {@link QParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterUnaryMinusExpression(QParser.UnaryMinusExpressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code unaryMinusExpression}
     * labeled alternative in {@link QParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitUnaryMinusExpression(QParser.UnaryMinusExpressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code powerExpression}
     * labeled alternative in {@link QParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterPowerExpression(QParser.PowerExpressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code powerExpression}
     * labeled alternative in {@link QParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitPowerExpression(QParser.PowerExpressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code hereVarExpression}
     * labeled alternative in {@link QParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterHereVarExpression(QParser.HereVarExpressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code hereVarExpression}
     * labeled alternative in {@link QParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitHereVarExpression(QParser.HereVarExpressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code eqExpression}
     * labeled alternative in {@link QParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterEqExpression(QParser.EqExpressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code eqExpression}
     * labeled alternative in {@link QParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitEqExpression(QParser.EqExpressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code inExpression}
     * labeled alternative in {@link QParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterInExpression(QParser.InExpressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code inExpression}
     * labeled alternative in {@link QParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitInExpression(QParser.InExpressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code addExpression}
     * labeled alternative in {@link QParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterAddExpression(QParser.AddExpressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code addExpression}
     * labeled alternative in {@link QParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitAddExpression(QParser.AddExpressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code selfExpression}
     * labeled alternative in {@link QParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterSelfExpression(QParser.SelfExpressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code selfExpression}
     * labeled alternative in {@link QParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitSelfExpression(QParser.SelfExpressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code randomExpression}
     * labeled alternative in {@link QParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterRandomExpression(QParser.RandomExpressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code randomExpression}
     * labeled alternative in {@link QParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitRandomExpression(QParser.RandomExpressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code ternaryExpression}
     * labeled alternative in {@link QParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterTernaryExpression(QParser.TernaryExpressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code ternaryExpression}
     * labeled alternative in {@link QParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitTernaryExpression(QParser.TernaryExpressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code inputExpression}
     * labeled alternative in {@link QParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterInputExpression(QParser.InputExpressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code inputExpression}
     * labeled alternative in {@link QParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitInputExpression(QParser.InputExpressionContext ctx);

    /**
     * Enter a parse tree produced by {@link QParser#list}.
     *
     * @param ctx the parse tree
     */
    void enterList(QParser.ListContext ctx);

    /**
     * Exit a parse tree produced by {@link QParser#list}.
     *
     * @param ctx the parse tree
     */
    void exitList(QParser.ListContext ctx);

    /**
     * Enter a parse tree produced by {@link QParser#objVar}.
     *
     * @param ctx the parse tree
     */
    void enterObjVar(QParser.ObjVarContext ctx);

    /**
     * Exit a parse tree produced by {@link QParser#objVar}.
     *
     * @param ctx the parse tree
     */
    void exitObjVar(QParser.ObjVarContext ctx);

    /**
     * Enter a parse tree produced by {@link QParser#indexes}.
     *
     * @param ctx the parse tree
     */
    void enterIndexes(QParser.IndexesContext ctx);

    /**
     * Exit a parse tree produced by {@link QParser#indexes}.
     *
     * @param ctx the parse tree
     */
    void exitIndexes(QParser.IndexesContext ctx);
}