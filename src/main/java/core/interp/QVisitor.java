// Generated from /Users/harryharbuck-marlowe/Downloads/Q/src/main/java/core/etc/Q.g4 by ANTLR 4.9.2
package core.interp;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link QParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface QVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link QParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(QParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link QParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(QParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link QParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(QParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link QParser#reAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReAssignment(QParser.ReAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link QParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(QParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifierFunctionCall}
	 * labeled alternative in {@link QParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierFunctionCall(QParser.IdentifierFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printlnFunctionCall}
	 * labeled alternative in {@link QParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintlnFunctionCall(QParser.PrintlnFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printFunctionCall}
	 * labeled alternative in {@link QParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintFunctionCall(QParser.PrintFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assertFunctionCall}
	 * labeled alternative in {@link QParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertFunctionCall(QParser.AssertFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code objFunctionCallExpression}
	 * labeled alternative in {@link QParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjFunctionCallExpression(QParser.ObjFunctionCallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fileSystemImportStatement}
	 * labeled alternative in {@link QParser#allImport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileSystemImportStatement(QParser.FileSystemImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code githubImportStatement}
	 * labeled alternative in {@link QParser#allImport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGithubImportStatement(QParser.GithubImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code importAll}
	 * labeled alternative in {@link QParser#allImport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportAll(QParser.ImportAllContext ctx);
	/**
	 * Visit a parse tree produced by {@link QParser#objFunctionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjFunctionCall(QParser.ObjFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link QParser#packageStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageStatement(QParser.PackageStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link QParser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader(QParser.HeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link QParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(QParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link QParser#ifStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStat(QParser.IfStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link QParser#hereStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHereStatement(QParser.HereStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link QParser#varHereStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarHereStatement(QParser.VarHereStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link QParser#elseIfStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIfStat(QParser.ElseIfStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link QParser#constructorStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorStatement(QParser.ConstructorStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link QParser#objCreateStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjCreateStatement(QParser.ObjCreateStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link QParser#sysFunctionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSysFunctionCall(QParser.SysFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link QParser#fileWriteStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileWriteStatement(QParser.FileWriteStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link QParser#elseStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStat(QParser.ElseStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link QParser#functionDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDecl(QParser.FunctionDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link QParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(QParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link QParser#forInStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInStatement(QParser.ForInStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link QParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatement(QParser.ImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link QParser#anonymousFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnonymousFunction(QParser.AnonymousFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link QParser#importFromGithubStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportFromGithubStatement(QParser.ImportFromGithubStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link QParser#importAllStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportAllStatement(QParser.ImportAllStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link QParser#atStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtStatement(QParser.AtStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link QParser#tryCatchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryCatchStatement(QParser.TryCatchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link QParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(QParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link QParser#mainFunctionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainFunctionStatement(QParser.MainFunctionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link QParser#idList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdList(QParser.IdListContext ctx);
	/**
	 * Visit a parse tree produced by {@link QParser#classStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassStatement(QParser.ClassStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link QParser#exprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprList(QParser.ExprListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberExpression}
	 * labeled alternative in {@link QParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberExpression(QParser.NumberExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link QParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierExpression(QParser.IdentifierExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link QParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpression(QParser.NotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExpression}
	 * labeled alternative in {@link QParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(QParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringExpression}
	 * labeled alternative in {@link QParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringExpression(QParser.StringExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code anonymousFunctionExpression}
	 * labeled alternative in {@link QParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnonymousFunctionExpression(QParser.AnonymousFunctionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionExpression}
	 * labeled alternative in {@link QParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionExpression(QParser.ExpressionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compExpression}
	 * labeled alternative in {@link QParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompExpression(QParser.CompExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nullExpression}
	 * labeled alternative in {@link QParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullExpression(QParser.NullExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCallExpression}
	 * labeled alternative in {@link QParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExpression(QParser.FunctionCallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multExpression}
	 * labeled alternative in {@link QParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultExpression(QParser.MultExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code listExpression}
	 * labeled alternative in {@link QParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListExpression(QParser.ListExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolExpression}
	 * labeled alternative in {@link QParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpression(QParser.BoolExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code objVarExpression}
	 * labeled alternative in {@link QParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjVarExpression(QParser.ObjVarExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExpression}
	 * labeled alternative in {@link QParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpression(QParser.OrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryMinusExpression}
	 * labeled alternative in {@link QParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryMinusExpression(QParser.UnaryMinusExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code powerExpression}
	 * labeled alternative in {@link QParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowerExpression(QParser.PowerExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code hereVarExpression}
	 * labeled alternative in {@link QParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHereVarExpression(QParser.HereVarExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eqExpression}
	 * labeled alternative in {@link QParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqExpression(QParser.EqExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inExpression}
	 * labeled alternative in {@link QParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInExpression(QParser.InExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addExpression}
	 * labeled alternative in {@link QParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpression(QParser.AddExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selfExpression}
	 * labeled alternative in {@link QParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfExpression(QParser.SelfExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code randomExpression}
	 * labeled alternative in {@link QParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRandomExpression(QParser.RandomExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ternaryExpression}
	 * labeled alternative in {@link QParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernaryExpression(QParser.TernaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inputExpression}
	 * labeled alternative in {@link QParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputExpression(QParser.InputExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link QParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(QParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link QParser#objVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjVar(QParser.ObjVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link QParser#indexes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexes(QParser.IndexesContext ctx);
}