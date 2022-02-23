// Generated from /Users/harryharbuck-marlowe/Desktop/Q/src/main/java/core/etc/Q.g4 by ANTLR 4.9.2
package core.interp;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class QParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		Println=18, Render=19, AddComponent=20, New=21, Var=22, Import=23, Print=24, 
		Input=25, Assert=26, Def=27, ToInt=28, Create=29, If=30, Else=31, Return=32, 
		For=33, While=34, To=35, Do=36, End=37, In=38, Null=39, Try=40, Catch=41, 
		Class=42, Or=43, And=44, Equals=45, NEquals=46, GTEquals=47, LTEquals=48, 
		Pow=49, Excl=50, GT=51, LT=52, Add=53, Subtract=54, Multiply=55, Divide=56, 
		Modulus=57, OBrace=58, CBrace=59, OBracket=60, CBracket=61, OParen=62, 
		CParen=63, SColon=64, Assign=65, Comma=66, QMark=67, Colon=68, Bool=69, 
		Number=70, Identifier=71, String=72, Comment=73, JavaTextBlock=74, Space=75;
	public static final int
		RULE_parse = 0, RULE_block = 1, RULE_statement = 2, RULE_assignment = 3, 
		RULE_reAssignment = 4, RULE_functionCall = 5, RULE_objFunctionCall = 6, 
		RULE_header = 7, RULE_objFunctionDecl = 8, RULE_ifStatement = 9, RULE_ifStat = 10, 
		RULE_elseIfStat = 11, RULE_constructorStatement = 12, RULE_objCreateStatement = 13, 
		RULE_listCreateStatement = 14, RULE_listAddStatement = 15, RULE_listRemoveStatement = 16, 
		RULE_osExecStatement = 17, RULE_fileWriteStatement = 18, RULE_verifyFileStatement = 19, 
		RULE_nullVarStatement = 20, RULE_elseStat = 21, RULE_functionDecl = 22, 
		RULE_forStatement = 23, RULE_forInStatement = 24, RULE_importStatement = 25, 
		RULE_anonymousFunction = 26, RULE_importFromGithubStatement = 27, RULE_tryCatchStatement = 28, 
		RULE_whileStatement = 29, RULE_windowRenderStatement = 30, RULE_windowAddCompStatement = 31, 
		RULE_addWebServerTextStatement = 32, RULE_mainFunctionStatement = 33, 
		RULE_idList = 34, RULE_classStatement = 35, RULE_exprList = 36, RULE_expression = 37, 
		RULE_list = 38, RULE_indexes = 39;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "block", "statement", "assignment", "reAssignment", "functionCall", 
			"objFunctionCall", "header", "objFunctionDecl", "ifStatement", "ifStat", 
			"elseIfStat", "constructorStatement", "objCreateStatement", "listCreateStatement", 
			"listAddStatement", "listRemoveStatement", "osExecStatement", "fileWriteStatement", 
			"verifyFileStatement", "nullVarStatement", "elseStat", "functionDecl", 
			"forStatement", "forInStatement", "importStatement", "anonymousFunction", 
			"importFromGithubStatement", "tryCatchStatement", "whileStatement", "windowRenderStatement", 
			"windowAddCompStatement", "addWebServerTextStatement", "mainFunctionStatement", 
			"idList", "classStatement", "exprList", "expression", "list", "indexes"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'@'", "'header'", "'const'", "'List'", "'add'", "'remove'", 
			"'sys'", "'write'", "'verify'", "'noval'", "'range'", "'#'", "'onflaw'", 
			"'changeText'", "'func main()'", "'endc'", "'std:ln'", "'render'", "'addComp'", 
			"'new'", "'var'", "'import'", "'std:out'", "'std:in'", "'assert'", "'func'", 
			"'toInt'", "'create'", "'if'", "'else'", "'return'", "'for'", "'while'", 
			"'to'", "'do'", "'endf'", "'in'", "'null'", "'try'", "'catch'", "'class'", 
			"'||'", "'&&'", "'=='", "'!='", "'>='", "'<='", "'^'", "'!'", "'>'", 
			"'<'", "'+'", "'-'", "'*'", "'/'", "'%'", "'{'", "'}'", "'['", "']'", 
			"'('", "')'", "';'", "'='", "','", "'?'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "Println", "Render", "AddComponent", 
			"New", "Var", "Import", "Print", "Input", "Assert", "Def", "ToInt", "Create", 
			"If", "Else", "Return", "For", "While", "To", "Do", "End", "In", "Null", 
			"Try", "Catch", "Class", "Or", "And", "Equals", "NEquals", "GTEquals", 
			"LTEquals", "Pow", "Excl", "GT", "LT", "Add", "Subtract", "Multiply", 
			"Divide", "Modulus", "OBrace", "CBrace", "OBracket", "CBracket", "OParen", 
			"CParen", "SColon", "Assign", "Comma", "QMark", "Colon", "Bool", "Number", 
			"Identifier", "String", "Comment", "JavaTextBlock", "Space"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Q.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public QParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ParseContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(QParser.EOF, 0); }
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(80);
				header();
				}
			}

			setState(83);
			block();
			setState(84);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<FunctionDeclContext> functionDecl() {
			return getRuleContexts(FunctionDeclContext.class);
		}
		public FunctionDeclContext functionDecl(int i) {
			return getRuleContext(FunctionDeclContext.class,i);
		}
		public TerminalNode Return() { return getToken(QParser.Return, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SColon() { return getToken(QParser.SColon, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__7) | (1L << T__9) | (1L << T__10) | (1L << T__12) | (1L << T__15) | (1L << Println) | (1L << Var) | (1L << Print) | (1L << Assert) | (1L << Def) | (1L << ToInt) | (1L << If) | (1L << For) | (1L << While) | (1L << Try) | (1L << Class))) != 0) || _la==Identifier) {
				{
				setState(88);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(86);
					statement();
					}
					break;
				case 2:
					{
					setState(87);
					functionDecl();
					}
					break;
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Return) {
				{
				setState(93);
				match(Return);
				setState(94);
				expression(0);
				setState(95);
				match(SColon);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode SColon() { return getToken(QParser.SColon, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public ForInStatementContext forInStatement() {
			return getRuleContext(ForInStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public TryCatchStatementContext tryCatchStatement() {
			return getRuleContext(TryCatchStatementContext.class,0);
		}
		public MainFunctionStatementContext mainFunctionStatement() {
			return getRuleContext(MainFunctionStatementContext.class,0);
		}
		public AddWebServerTextStatementContext addWebServerTextStatement() {
			return getRuleContext(AddWebServerTextStatementContext.class,0);
		}
		public ReAssignmentContext reAssignment() {
			return getRuleContext(ReAssignmentContext.class,0);
		}
		public ClassStatementContext classStatement() {
			return getRuleContext(ClassStatementContext.class,0);
		}
		public ConstructorStatementContext constructorStatement() {
			return getRuleContext(ConstructorStatementContext.class,0);
		}
		public WindowAddCompStatementContext windowAddCompStatement() {
			return getRuleContext(WindowAddCompStatementContext.class,0);
		}
		public WindowRenderStatementContext windowRenderStatement() {
			return getRuleContext(WindowRenderStatementContext.class,0);
		}
		public FileWriteStatementContext fileWriteStatement() {
			return getRuleContext(FileWriteStatementContext.class,0);
		}
		public VerifyFileStatementContext verifyFileStatement() {
			return getRuleContext(VerifyFileStatementContext.class,0);
		}
		public ObjFunctionCallContext objFunctionCall() {
			return getRuleContext(ObjFunctionCallContext.class,0);
		}
		public ObjFunctionDeclContext objFunctionDecl() {
			return getRuleContext(ObjFunctionDeclContext.class,0);
		}
		public ObjCreateStatementContext objCreateStatement() {
			return getRuleContext(ObjCreateStatementContext.class,0);
		}
		public ListCreateStatementContext listCreateStatement() {
			return getRuleContext(ListCreateStatementContext.class,0);
		}
		public ListAddStatementContext listAddStatement() {
			return getRuleContext(ListAddStatementContext.class,0);
		}
		public ListRemoveStatementContext listRemoveStatement() {
			return getRuleContext(ListRemoveStatementContext.class,0);
		}
		public OsExecStatementContext osExecStatement() {
			return getRuleContext(OsExecStatementContext.class,0);
		}
		public ImportFromGithubStatementContext importFromGithubStatement() {
			return getRuleContext(ImportFromGithubStatementContext.class,0);
		}
		public ImportStatementContext importStatement() {
			return getRuleContext(ImportStatementContext.class,0);
		}
		public AnonymousFunctionContext anonymousFunction() {
			return getRuleContext(AnonymousFunctionContext.class,0);
		}
		public NullVarStatementContext nullVarStatement() {
			return getRuleContext(NullVarStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		int _la;
		try {
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				assignment();
				setState(100);
				match(SColon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				functionCall();
				setState(103);
				match(SColon);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(105);
				ifStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(106);
				forStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(107);
				forInStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(108);
				whileStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(109);
				tryCatchStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(110);
				mainFunctionStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(111);
				addWebServerTextStatement();
				setState(112);
				match(SColon);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(114);
				reAssignment();
				setState(115);
				match(SColon);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(117);
				classStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(118);
				constructorStatement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(119);
				windowAddCompStatement();
				setState(120);
				match(SColon);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(122);
				windowRenderStatement();
				setState(123);
				match(SColon);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(125);
				fileWriteStatement();
				setState(126);
				match(SColon);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(128);
				verifyFileStatement();
				setState(129);
				match(SColon);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(131);
				objFunctionCall();
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SColon) {
					{
					setState(132);
					match(SColon);
					}
				}

				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(135);
				objFunctionDecl();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(136);
				objCreateStatement();
				setState(137);
				match(SColon);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(139);
				listCreateStatement();
				setState(140);
				match(SColon);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(142);
				listAddStatement();
				setState(143);
				match(SColon);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(145);
				listRemoveStatement();
				setState(146);
				match(SColon);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(148);
				osExecStatement();
				setState(149);
				match(SColon);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(151);
				importFromGithubStatement();
				setState(152);
				match(SColon);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(154);
				importStatement();
				setState(155);
				match(SColon);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(157);
				anonymousFunction();
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(158);
				nullVarStatement();
				setState(159);
				match(SColon);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode Var() { return getToken(QParser.Var, 0); }
		public TerminalNode Identifier() { return getToken(QParser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(QParser.Assign, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IndexesContext indexes() {
			return getRuleContext(IndexesContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(Var);
			setState(164);
			match(Identifier);
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OBracket) {
				{
				setState(165);
				indexes();
				}
			}

			setState(168);
			match(Assign);
			setState(169);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReAssignmentContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(QParser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(QParser.Assign, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IndexesContext indexes() {
			return getRuleContext(IndexesContext.class,0);
		}
		public ReAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterReAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitReAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitReAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReAssignmentContext reAssignment() throws RecognitionException {
		ReAssignmentContext _localctx = new ReAssignmentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_reAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(Identifier);
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OBracket) {
				{
				setState(172);
				indexes();
				}
			}

			setState(175);
			match(Assign);
			setState(176);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallContext extends ParserRuleContext {
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	 
		public FunctionCallContext() { }
		public void copyFrom(FunctionCallContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssertFunctionCallContext extends FunctionCallContext {
		public TerminalNode Assert() { return getToken(QParser.Assert, 0); }
		public TerminalNode OParen() { return getToken(QParser.OParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CParen() { return getToken(QParser.CParen, 0); }
		public AssertFunctionCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterAssertFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitAssertFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitAssertFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintlnFunctionCallContext extends FunctionCallContext {
		public TerminalNode Println() { return getToken(QParser.Println, 0); }
		public TerminalNode OParen() { return getToken(QParser.OParen, 0); }
		public TerminalNode CParen() { return getToken(QParser.CParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintlnFunctionCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterPrintlnFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitPrintlnFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitPrintlnFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ObjFunctionCallExpressionContext extends FunctionCallContext {
		public List<TerminalNode> Identifier() { return getTokens(QParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(QParser.Identifier, i);
		}
		public TerminalNode OParen() { return getToken(QParser.OParen, 0); }
		public TerminalNode CParen() { return getToken(QParser.CParen, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public ObjFunctionCallExpressionContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterObjFunctionCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitObjFunctionCallExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitObjFunctionCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ToIntFunctionCallContext extends FunctionCallContext {
		public TerminalNode ToInt() { return getToken(QParser.ToInt, 0); }
		public TerminalNode OParen() { return getToken(QParser.OParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CParen() { return getToken(QParser.CParen, 0); }
		public ToIntFunctionCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterToIntFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitToIntFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitToIntFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierFunctionCallContext extends FunctionCallContext {
		public TerminalNode Identifier() { return getToken(QParser.Identifier, 0); }
		public TerminalNode OParen() { return getToken(QParser.OParen, 0); }
		public TerminalNode CParen() { return getToken(QParser.CParen, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public IdentifierFunctionCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterIdentifierFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitIdentifierFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitIdentifierFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintFunctionCallContext extends FunctionCallContext {
		public TerminalNode Print() { return getToken(QParser.Print, 0); }
		public TerminalNode OParen() { return getToken(QParser.OParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CParen() { return getToken(QParser.CParen, 0); }
		public PrintFunctionCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterPrintFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitPrintFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitPrintFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functionCall);
		int _la;
		try {
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new IdentifierFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				match(Identifier);
				setState(179);
				match(OParen);
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & ((1L << (Println - 18)) | (1L << (Print - 18)) | (1L << (Input - 18)) | (1L << (Assert - 18)) | (1L << (ToInt - 18)) | (1L << (Null - 18)) | (1L << (Excl - 18)) | (1L << (Subtract - 18)) | (1L << (OBracket - 18)) | (1L << (OParen - 18)) | (1L << (Bool - 18)) | (1L << (Number - 18)) | (1L << (Identifier - 18)) | (1L << (String - 18)))) != 0)) {
					{
					setState(180);
					exprList();
					}
				}

				setState(183);
				match(CParen);
				}
				break;
			case 2:
				_localctx = new PrintlnFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				match(Println);
				setState(185);
				match(OParen);
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & ((1L << (Println - 18)) | (1L << (Print - 18)) | (1L << (Input - 18)) | (1L << (Assert - 18)) | (1L << (ToInt - 18)) | (1L << (Null - 18)) | (1L << (Excl - 18)) | (1L << (Subtract - 18)) | (1L << (OBracket - 18)) | (1L << (OParen - 18)) | (1L << (Bool - 18)) | (1L << (Number - 18)) | (1L << (Identifier - 18)) | (1L << (String - 18)))) != 0)) {
					{
					setState(186);
					expression(0);
					}
				}

				setState(189);
				match(CParen);
				}
				break;
			case 3:
				_localctx = new PrintFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(190);
				match(Print);
				setState(191);
				match(OParen);
				setState(192);
				expression(0);
				setState(193);
				match(CParen);
				}
				break;
			case 4:
				_localctx = new AssertFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(195);
				match(Assert);
				setState(196);
				match(OParen);
				setState(197);
				expression(0);
				setState(198);
				match(CParen);
				}
				break;
			case 5:
				_localctx = new ToIntFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(200);
				match(ToInt);
				setState(201);
				match(OParen);
				setState(202);
				expression(0);
				setState(203);
				match(CParen);
				}
				break;
			case 6:
				_localctx = new ObjFunctionCallExpressionContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(205);
				match(Identifier);
				setState(206);
				match(T__0);
				setState(207);
				match(Identifier);
				setState(208);
				match(OParen);
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & ((1L << (Println - 18)) | (1L << (Print - 18)) | (1L << (Input - 18)) | (1L << (Assert - 18)) | (1L << (ToInt - 18)) | (1L << (Null - 18)) | (1L << (Excl - 18)) | (1L << (Subtract - 18)) | (1L << (OBracket - 18)) | (1L << (OParen - 18)) | (1L << (Bool - 18)) | (1L << (Number - 18)) | (1L << (Identifier - 18)) | (1L << (String - 18)))) != 0)) {
					{
					setState(209);
					exprList();
					}
				}

				setState(212);
				match(CParen);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjFunctionCallContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(QParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(QParser.Identifier, i);
		}
		public TerminalNode OParen() { return getToken(QParser.OParen, 0); }
		public TerminalNode CParen() { return getToken(QParser.CParen, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public ObjFunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objFunctionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterObjFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitObjFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitObjFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjFunctionCallContext objFunctionCall() throws RecognitionException {
		ObjFunctionCallContext _localctx = new ObjFunctionCallContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_objFunctionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(Identifier);
			setState(216);
			match(T__0);
			setState(217);
			match(Identifier);
			setState(218);
			match(OParen);
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & ((1L << (Println - 18)) | (1L << (Print - 18)) | (1L << (Input - 18)) | (1L << (Assert - 18)) | (1L << (ToInt - 18)) | (1L << (Null - 18)) | (1L << (Excl - 18)) | (1L << (Subtract - 18)) | (1L << (OBracket - 18)) | (1L << (OParen - 18)) | (1L << (Bool - 18)) | (1L << (Number - 18)) | (1L << (Identifier - 18)) | (1L << (String - 18)))) != 0)) {
				{
				setState(219);
				exprList();
				}
			}

			setState(222);
			match(CParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HeaderContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(QParser.Identifier, 0); }
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(T__1);
			setState(225);
			match(T__2);
			setState(226);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjFunctionDeclContext extends ParserRuleContext {
		public TerminalNode Def() { return getToken(QParser.Def, 0); }
		public List<TerminalNode> Identifier() { return getTokens(QParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(QParser.Identifier, i);
		}
		public TerminalNode Colon() { return getToken(QParser.Colon, 0); }
		public TerminalNode OParen() { return getToken(QParser.OParen, 0); }
		public TerminalNode CParen() { return getToken(QParser.CParen, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode End() { return getToken(QParser.End, 0); }
		public IdListContext idList() {
			return getRuleContext(IdListContext.class,0);
		}
		public ObjFunctionDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objFunctionDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterObjFunctionDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitObjFunctionDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitObjFunctionDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjFunctionDeclContext objFunctionDecl() throws RecognitionException {
		ObjFunctionDeclContext _localctx = new ObjFunctionDeclContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_objFunctionDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(Def);
			setState(229);
			match(Identifier);
			setState(230);
			match(Colon);
			setState(231);
			match(Identifier);
			setState(232);
			match(OParen);
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(233);
				idList();
				}
			}

			setState(236);
			match(CParen);
			setState(237);
			block();
			setState(238);
			match(End);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public IfStatContext ifStat() {
			return getRuleContext(IfStatContext.class,0);
		}
		public TerminalNode End() { return getToken(QParser.End, 0); }
		public List<ElseIfStatContext> elseIfStat() {
			return getRuleContexts(ElseIfStatContext.class);
		}
		public ElseIfStatContext elseIfStat(int i) {
			return getRuleContext(ElseIfStatContext.class,i);
		}
		public ElseStatContext elseStat() {
			return getRuleContext(ElseStatContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ifStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			ifStat();
			setState(244);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(241);
					elseIfStat();
					}
					} 
				}
				setState(246);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Else) {
				{
				setState(247);
				elseStat();
				}
			}

			setState(250);
			match(End);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(QParser.If, 0); }
		public TerminalNode OParen() { return getToken(QParser.OParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CParen() { return getToken(QParser.CParen, 0); }
		public TerminalNode Do() { return getToken(QParser.Do, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterIfStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitIfStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitIfStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatContext ifStat() throws RecognitionException {
		IfStatContext _localctx = new IfStatContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ifStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(If);
			setState(253);
			match(OParen);
			setState(254);
			expression(0);
			setState(255);
			match(CParen);
			setState(256);
			match(Do);
			setState(257);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseIfStatContext extends ParserRuleContext {
		public TerminalNode Else() { return getToken(QParser.Else, 0); }
		public TerminalNode If() { return getToken(QParser.If, 0); }
		public TerminalNode OParen() { return getToken(QParser.OParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CParen() { return getToken(QParser.CParen, 0); }
		public TerminalNode Do() { return getToken(QParser.Do, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseIfStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterElseIfStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitElseIfStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitElseIfStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfStatContext elseIfStat() throws RecognitionException {
		ElseIfStatContext _localctx = new ElseIfStatContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_elseIfStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(Else);
			setState(260);
			match(If);
			setState(261);
			match(OParen);
			setState(262);
			expression(0);
			setState(263);
			match(CParen);
			setState(264);
			match(Do);
			setState(265);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(QParser.Identifier, 0); }
		public TerminalNode OParen() { return getToken(QParser.OParen, 0); }
		public TerminalNode CParen() { return getToken(QParser.CParen, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode End() { return getToken(QParser.End, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public ConstructorStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterConstructorStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitConstructorStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitConstructorStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorStatementContext constructorStatement() throws RecognitionException {
		ConstructorStatementContext _localctx = new ConstructorStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_constructorStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(T__3);
			setState(268);
			match(Identifier);
			setState(269);
			match(OParen);
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & ((1L << (Println - 18)) | (1L << (Print - 18)) | (1L << (Input - 18)) | (1L << (Assert - 18)) | (1L << (ToInt - 18)) | (1L << (Null - 18)) | (1L << (Excl - 18)) | (1L << (Subtract - 18)) | (1L << (OBracket - 18)) | (1L << (OParen - 18)) | (1L << (Bool - 18)) | (1L << (Number - 18)) | (1L << (Identifier - 18)) | (1L << (String - 18)))) != 0)) {
				{
				setState(270);
				exprList();
				}
			}

			setState(273);
			match(CParen);
			setState(274);
			block();
			setState(275);
			match(End);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjCreateStatementContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(QParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(QParser.Identifier, i);
		}
		public TerminalNode Assign() { return getToken(QParser.Assign, 0); }
		public TerminalNode New() { return getToken(QParser.New, 0); }
		public TerminalNode OParen() { return getToken(QParser.OParen, 0); }
		public TerminalNode CParen() { return getToken(QParser.CParen, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public ObjCreateStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objCreateStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterObjCreateStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitObjCreateStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitObjCreateStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjCreateStatementContext objCreateStatement() throws RecognitionException {
		ObjCreateStatementContext _localctx = new ObjCreateStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_objCreateStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(Identifier);
			setState(278);
			match(Identifier);
			setState(279);
			match(Assign);
			setState(280);
			match(New);
			setState(281);
			match(Identifier);
			setState(282);
			match(OParen);
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & ((1L << (Println - 18)) | (1L << (Print - 18)) | (1L << (Input - 18)) | (1L << (Assert - 18)) | (1L << (ToInt - 18)) | (1L << (Null - 18)) | (1L << (Excl - 18)) | (1L << (Subtract - 18)) | (1L << (OBracket - 18)) | (1L << (OParen - 18)) | (1L << (Bool - 18)) | (1L << (Number - 18)) | (1L << (Identifier - 18)) | (1L << (String - 18)))) != 0)) {
				{
				setState(283);
				exprList();
				}
			}

			setState(286);
			match(CParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListCreateStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(QParser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(QParser.Assign, 0); }
		public TerminalNode New() { return getToken(QParser.New, 0); }
		public TerminalNode LT() { return getToken(QParser.LT, 0); }
		public TerminalNode GT() { return getToken(QParser.GT, 0); }
		public ListCreateStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listCreateStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterListCreateStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitListCreateStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitListCreateStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListCreateStatementContext listCreateStatement() throws RecognitionException {
		ListCreateStatementContext _localctx = new ListCreateStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_listCreateStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(T__4);
			setState(289);
			match(Identifier);
			setState(290);
			match(Assign);
			setState(291);
			match(New);
			setState(292);
			match(T__4);
			setState(293);
			match(LT);
			setState(294);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListAddStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(QParser.Identifier, 0); }
		public TerminalNode OParen() { return getToken(QParser.OParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CParen() { return getToken(QParser.CParen, 0); }
		public ListAddStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listAddStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterListAddStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitListAddStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitListAddStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListAddStatementContext listAddStatement() throws RecognitionException {
		ListAddStatementContext _localctx = new ListAddStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_listAddStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(Identifier);
			setState(297);
			match(T__0);
			setState(298);
			match(T__5);
			setState(299);
			match(OParen);
			setState(300);
			expression(0);
			setState(301);
			match(CParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListRemoveStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(QParser.Identifier, 0); }
		public TerminalNode OParen() { return getToken(QParser.OParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CParen() { return getToken(QParser.CParen, 0); }
		public ListRemoveStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listRemoveStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterListRemoveStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitListRemoveStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitListRemoveStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListRemoveStatementContext listRemoveStatement() throws RecognitionException {
		ListRemoveStatementContext _localctx = new ListRemoveStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_listRemoveStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(Identifier);
			setState(304);
			match(T__0);
			setState(305);
			match(T__6);
			setState(306);
			match(OParen);
			setState(307);
			expression(0);
			setState(308);
			match(CParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OsExecStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(QParser.Identifier, 0); }
		public TerminalNode OParen() { return getToken(QParser.OParen, 0); }
		public TerminalNode CParen() { return getToken(QParser.CParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OsExecStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_osExecStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterOsExecStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitOsExecStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitOsExecStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OsExecStatementContext osExecStatement() throws RecognitionException {
		OsExecStatementContext _localctx = new OsExecStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_osExecStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(T__7);
			setState(311);
			match(T__0);
			setState(312);
			match(Identifier);
			setState(313);
			match(OParen);
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & ((1L << (Println - 18)) | (1L << (Print - 18)) | (1L << (Input - 18)) | (1L << (Assert - 18)) | (1L << (ToInt - 18)) | (1L << (Null - 18)) | (1L << (Excl - 18)) | (1L << (Subtract - 18)) | (1L << (OBracket - 18)) | (1L << (OParen - 18)) | (1L << (Bool - 18)) | (1L << (Number - 18)) | (1L << (Identifier - 18)) | (1L << (String - 18)))) != 0)) {
				{
				setState(314);
				expression(0);
				}
			}

			setState(317);
			match(CParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FileWriteStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(QParser.Identifier, 0); }
		public TerminalNode OParen() { return getToken(QParser.OParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CParen() { return getToken(QParser.CParen, 0); }
		public FileWriteStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileWriteStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterFileWriteStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitFileWriteStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitFileWriteStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileWriteStatementContext fileWriteStatement() throws RecognitionException {
		FileWriteStatementContext _localctx = new FileWriteStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_fileWriteStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(Identifier);
			setState(320);
			match(T__0);
			setState(321);
			match(T__8);
			setState(322);
			match(OParen);
			setState(323);
			expression(0);
			setState(324);
			match(CParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VerifyFileStatementContext extends ParserRuleContext {
		public TerminalNode OParen() { return getToken(QParser.OParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CParen() { return getToken(QParser.CParen, 0); }
		public VerifyFileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verifyFileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterVerifyFileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitVerifyFileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitVerifyFileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VerifyFileStatementContext verifyFileStatement() throws RecognitionException {
		VerifyFileStatementContext _localctx = new VerifyFileStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_verifyFileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(T__9);
			setState(327);
			match(OParen);
			setState(328);
			expression(0);
			setState(329);
			match(CParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NullVarStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(QParser.Identifier, 0); }
		public NullVarStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullVarStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterNullVarStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitNullVarStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitNullVarStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NullVarStatementContext nullVarStatement() throws RecognitionException {
		NullVarStatementContext _localctx = new NullVarStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_nullVarStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(T__10);
			setState(332);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseStatContext extends ParserRuleContext {
		public TerminalNode Else() { return getToken(QParser.Else, 0); }
		public TerminalNode Do() { return getToken(QParser.Do, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterElseStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitElseStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitElseStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStatContext elseStat() throws RecognitionException {
		ElseStatContext _localctx = new ElseStatContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_elseStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(Else);
			setState(335);
			match(Do);
			setState(336);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDeclContext extends ParserRuleContext {
		public TerminalNode Def() { return getToken(QParser.Def, 0); }
		public TerminalNode Identifier() { return getToken(QParser.Identifier, 0); }
		public TerminalNode OParen() { return getToken(QParser.OParen, 0); }
		public TerminalNode CParen() { return getToken(QParser.CParen, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode End() { return getToken(QParser.End, 0); }
		public IdListContext idList() {
			return getRuleContext(IdListContext.class,0);
		}
		public FunctionDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterFunctionDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitFunctionDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitFunctionDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclContext functionDecl() throws RecognitionException {
		FunctionDeclContext _localctx = new FunctionDeclContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_functionDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(Def);
			setState(339);
			match(Identifier);
			setState(340);
			match(OParen);
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(341);
				idList();
				}
			}

			setState(344);
			match(CParen);
			setState(345);
			block();
			setState(346);
			match(End);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode For() { return getToken(QParser.For, 0); }
		public TerminalNode OParen() { return getToken(QParser.OParen, 0); }
		public TerminalNode Identifier() { return getToken(QParser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(QParser.Assign, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode To() { return getToken(QParser.To, 0); }
		public TerminalNode CParen() { return getToken(QParser.CParen, 0); }
		public TerminalNode Do() { return getToken(QParser.Do, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode End() { return getToken(QParser.End, 0); }
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			match(For);
			setState(349);
			match(OParen);
			setState(350);
			match(Identifier);
			setState(351);
			match(Assign);
			setState(352);
			expression(0);
			setState(353);
			match(To);
			setState(354);
			expression(0);
			setState(355);
			match(CParen);
			setState(356);
			match(Do);
			setState(357);
			block();
			setState(358);
			match(End);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInStatementContext extends ParserRuleContext {
		public TerminalNode For() { return getToken(QParser.For, 0); }
		public List<TerminalNode> OParen() { return getTokens(QParser.OParen); }
		public TerminalNode OParen(int i) {
			return getToken(QParser.OParen, i);
		}
		public TerminalNode Identifier() { return getToken(QParser.Identifier, 0); }
		public TerminalNode In() { return getToken(QParser.In, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> CParen() { return getTokens(QParser.CParen); }
		public TerminalNode CParen(int i) {
			return getToken(QParser.CParen, i);
		}
		public TerminalNode Do() { return getToken(QParser.Do, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode End() { return getToken(QParser.End, 0); }
		public ForInStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterForInStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitForInStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitForInStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInStatementContext forInStatement() throws RecognitionException {
		ForInStatementContext _localctx = new ForInStatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_forInStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(For);
			setState(361);
			match(OParen);
			setState(362);
			match(Identifier);
			setState(363);
			match(In);
			setState(364);
			match(T__11);
			setState(365);
			match(OParen);
			setState(366);
			expression(0);
			setState(367);
			match(CParen);
			setState(368);
			match(CParen);
			setState(369);
			match(Do);
			setState(370);
			block();
			setState(371);
			match(End);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportStatementContext extends ParserRuleContext {
		public TerminalNode Import() { return getToken(QParser.Import, 0); }
		public List<TerminalNode> Identifier() { return getTokens(QParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(QParser.Identifier, i);
		}
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_importStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			match(T__12);
			setState(374);
			match(Import);
			setState(375);
			match(Identifier);
			setState(380);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(376);
					match(T__0);
					setState(377);
					match(Identifier);
					}
					} 
				}
				setState(382);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnonymousFunctionContext extends ParserRuleContext {
		public TerminalNode Def() { return getToken(QParser.Def, 0); }
		public TerminalNode Subtract() { return getToken(QParser.Subtract, 0); }
		public TerminalNode GT() { return getToken(QParser.GT, 0); }
		public TerminalNode OBrace() { return getToken(QParser.OBrace, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode CBrace() { return getToken(QParser.CBrace, 0); }
		public AnonymousFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anonymousFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterAnonymousFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitAnonymousFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitAnonymousFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnonymousFunctionContext anonymousFunction() throws RecognitionException {
		AnonymousFunctionContext _localctx = new AnonymousFunctionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_anonymousFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			match(Def);
			setState(384);
			match(Subtract);
			setState(385);
			match(GT);
			setState(386);
			match(OBrace);
			setState(387);
			block();
			setState(388);
			match(CBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportFromGithubStatementContext extends ParserRuleContext {
		public TerminalNode Import() { return getToken(QParser.Import, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ImportFromGithubStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importFromGithubStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterImportFromGithubStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitImportFromGithubStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitImportFromGithubStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportFromGithubStatementContext importFromGithubStatement() throws RecognitionException {
		ImportFromGithubStatementContext _localctx = new ImportFromGithubStatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_importFromGithubStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			match(T__12);
			setState(391);
			match(Import);
			setState(392);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryCatchStatementContext extends ParserRuleContext {
		public TerminalNode Try() { return getToken(QParser.Try, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode End() { return getToken(QParser.End, 0); }
		public TryCatchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryCatchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterTryCatchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitTryCatchStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitTryCatchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryCatchStatementContext tryCatchStatement() throws RecognitionException {
		TryCatchStatementContext _localctx = new TryCatchStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_tryCatchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			match(Try);
			setState(395);
			block();
			setState(396);
			match(T__13);
			setState(397);
			block();
			setState(398);
			match(End);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(QParser.While, 0); }
		public TerminalNode OParen() { return getToken(QParser.OParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CParen() { return getToken(QParser.CParen, 0); }
		public TerminalNode Do() { return getToken(QParser.Do, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode End() { return getToken(QParser.End, 0); }
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			match(While);
			setState(401);
			match(OParen);
			setState(402);
			expression(0);
			setState(403);
			match(CParen);
			setState(404);
			match(Do);
			setState(405);
			block();
			setState(406);
			match(End);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowRenderStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(QParser.Identifier, 0); }
		public TerminalNode Render() { return getToken(QParser.Render, 0); }
		public TerminalNode OParen() { return getToken(QParser.OParen, 0); }
		public TerminalNode CParen() { return getToken(QParser.CParen, 0); }
		public WindowRenderStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowRenderStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterWindowRenderStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitWindowRenderStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitWindowRenderStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowRenderStatementContext windowRenderStatement() throws RecognitionException {
		WindowRenderStatementContext _localctx = new WindowRenderStatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_windowRenderStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			match(Identifier);
			setState(409);
			match(T__0);
			setState(410);
			match(Render);
			setState(411);
			match(OParen);
			setState(412);
			match(CParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowAddCompStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(QParser.Identifier, 0); }
		public TerminalNode AddComponent() { return getToken(QParser.AddComponent, 0); }
		public TerminalNode OParen() { return getToken(QParser.OParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CParen() { return getToken(QParser.CParen, 0); }
		public WindowAddCompStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowAddCompStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterWindowAddCompStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitWindowAddCompStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitWindowAddCompStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowAddCompStatementContext windowAddCompStatement() throws RecognitionException {
		WindowAddCompStatementContext _localctx = new WindowAddCompStatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_windowAddCompStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			match(Identifier);
			setState(415);
			match(T__0);
			setState(416);
			match(AddComponent);
			setState(417);
			match(OParen);
			setState(418);
			expression(0);
			setState(419);
			match(CParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddWebServerTextStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(QParser.Identifier, 0); }
		public TerminalNode OParen() { return getToken(QParser.OParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CParen() { return getToken(QParser.CParen, 0); }
		public AddWebServerTextStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addWebServerTextStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterAddWebServerTextStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitAddWebServerTextStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitAddWebServerTextStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddWebServerTextStatementContext addWebServerTextStatement() throws RecognitionException {
		AddWebServerTextStatementContext _localctx = new AddWebServerTextStatementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_addWebServerTextStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			match(Identifier);
			setState(422);
			match(T__0);
			setState(423);
			match(T__14);
			setState(424);
			match(OParen);
			setState(425);
			expression(0);
			setState(426);
			match(CParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainFunctionStatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode End() { return getToken(QParser.End, 0); }
		public MainFunctionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainFunctionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterMainFunctionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitMainFunctionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitMainFunctionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainFunctionStatementContext mainFunctionStatement() throws RecognitionException {
		MainFunctionStatementContext _localctx = new MainFunctionStatementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_mainFunctionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			match(T__15);
			setState(429);
			block();
			setState(430);
			match(End);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdListContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(QParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(QParser.Identifier, i);
		}
		public List<TerminalNode> Comma() { return getTokens(QParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(QParser.Comma, i);
		}
		public IdListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterIdList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitIdList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitIdList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdListContext idList() throws RecognitionException {
		IdListContext _localctx = new IdListContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_idList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			match(Identifier);
			setState(437);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(433);
				match(Comma);
				setState(434);
				match(Identifier);
				}
				}
				setState(439);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassStatementContext extends ParserRuleContext {
		public TerminalNode Class() { return getToken(QParser.Class, 0); }
		public TerminalNode Identifier() { return getToken(QParser.Identifier, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ClassStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterClassStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitClassStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitClassStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassStatementContext classStatement() throws RecognitionException {
		ClassStatementContext _localctx = new ClassStatementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_classStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			match(Class);
			setState(441);
			match(Identifier);
			setState(442);
			block();
			setState(443);
			match(T__16);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(QParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(QParser.Comma, i);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitExprList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitExprList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			expression(0);
			setState(450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(446);
				match(Comma);
				setState(447);
				expression(0);
				}
				}
				setState(452);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BoolExpressionContext extends ExpressionContext {
		public TerminalNode Bool() { return getToken(QParser.Bool, 0); }
		public BoolExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterBoolExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitBoolExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitBoolExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberExpressionContext extends ExpressionContext {
		public TerminalNode Number() { return getToken(QParser.Number, 0); }
		public NumberExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterNumberExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitNumberExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitNumberExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierExpressionContext extends ExpressionContext {
		public TerminalNode Identifier() { return getToken(QParser.Identifier, 0); }
		public IndexesContext indexes() {
			return getRuleContext(IndexesContext.class,0);
		}
		public IdentifierExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterIdentifierExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitIdentifierExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitIdentifierExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotExpressionContext extends ExpressionContext {
		public TerminalNode Excl() { return getToken(QParser.Excl, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitNotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitNotExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Or() { return getToken(QParser.Or, 0); }
		public OrExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryMinusExpressionContext extends ExpressionContext {
		public TerminalNode Subtract() { return getToken(QParser.Subtract, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnaryMinusExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterUnaryMinusExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitUnaryMinusExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitUnaryMinusExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PowerExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Pow() { return getToken(QParser.Pow, 0); }
		public PowerExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterPowerExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitPowerExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitPowerExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Equals() { return getToken(QParser.Equals, 0); }
		public TerminalNode NEquals() { return getToken(QParser.NEquals, 0); }
		public EqExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterEqExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitEqExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitEqExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode And() { return getToken(QParser.And, 0); }
		public AndExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode In() { return getToken(QParser.In, 0); }
		public InExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterInExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitInExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitInExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringExpressionContext extends ExpressionContext {
		public TerminalNode String() { return getToken(QParser.String, 0); }
		public IndexesContext indexes() {
			return getRuleContext(IndexesContext.class,0);
		}
		public StringExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterStringExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitStringExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitStringExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionExpressionContext extends ExpressionContext {
		public TerminalNode OParen() { return getToken(QParser.OParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CParen() { return getToken(QParser.CParen, 0); }
		public IndexesContext indexes() {
			return getRuleContext(IndexesContext.class,0);
		}
		public ExpressionExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterExpressionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitExpressionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitExpressionExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Add() { return getToken(QParser.Add, 0); }
		public TerminalNode Subtract() { return getToken(QParser.Subtract, 0); }
		public AddExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterAddExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitAddExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitAddExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode GTEquals() { return getToken(QParser.GTEquals, 0); }
		public TerminalNode LTEquals() { return getToken(QParser.LTEquals, 0); }
		public TerminalNode GT() { return getToken(QParser.GT, 0); }
		public TerminalNode LT() { return getToken(QParser.LT, 0); }
		public CompExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterCompExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitCompExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitCompExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullExpressionContext extends ExpressionContext {
		public TerminalNode Null() { return getToken(QParser.Null, 0); }
		public NullExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterNullExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitNullExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitNullExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallExpressionContext extends ExpressionContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public IndexesContext indexes() {
			return getRuleContext(IndexesContext.class,0);
		}
		public FunctionCallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterFunctionCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitFunctionCallExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitFunctionCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Multiply() { return getToken(QParser.Multiply, 0); }
		public TerminalNode Divide() { return getToken(QParser.Divide, 0); }
		public TerminalNode Modulus() { return getToken(QParser.Modulus, 0); }
		public MultExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterMultExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitMultExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitMultExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListExpressionContext extends ExpressionContext {
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public IndexesContext indexes() {
			return getRuleContext(IndexesContext.class,0);
		}
		public ListExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterListExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitListExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitListExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TernaryExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode QMark() { return getToken(QParser.QMark, 0); }
		public TerminalNode Colon() { return getToken(QParser.Colon, 0); }
		public TernaryExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterTernaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitTernaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitTernaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InputExpressionContext extends ExpressionContext {
		public TerminalNode Input() { return getToken(QParser.Input, 0); }
		public TerminalNode OParen() { return getToken(QParser.OParen, 0); }
		public TerminalNode CParen() { return getToken(QParser.CParen, 0); }
		public TerminalNode String() { return getToken(QParser.String, 0); }
		public InputExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterInputExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitInputExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitInputExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 74;
		enterRecursionRule(_localctx, 74, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryMinusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(454);
				match(Subtract);
				setState(455);
				expression(20);
				}
				break;
			case 2:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(456);
				match(Excl);
				setState(457);
				expression(19);
				}
				break;
			case 3:
				{
				_localctx = new NumberExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(458);
				match(Number);
				}
				break;
			case 4:
				{
				_localctx = new BoolExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(459);
				match(Bool);
				}
				break;
			case 5:
				{
				_localctx = new NullExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(460);
				match(Null);
				}
				break;
			case 6:
				{
				_localctx = new FunctionCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(461);
				functionCall();
				setState(463);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(462);
					indexes();
					}
					break;
				}
				}
				break;
			case 7:
				{
				_localctx = new ListExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(465);
				list();
				setState(467);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(466);
					indexes();
					}
					break;
				}
				}
				break;
			case 8:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(469);
				match(Identifier);
				setState(471);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(470);
					indexes();
					}
					break;
				}
				}
				break;
			case 9:
				{
				_localctx = new StringExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(473);
				match(String);
				setState(475);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(474);
					indexes();
					}
					break;
				}
				}
				break;
			case 10:
				{
				_localctx = new ExpressionExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(477);
				match(OParen);
				setState(478);
				expression(0);
				setState(479);
				match(CParen);
				setState(481);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(480);
					indexes();
					}
					break;
				}
				}
				break;
			case 11:
				{
				_localctx = new InputExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(483);
				match(Input);
				setState(484);
				match(OParen);
				setState(486);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==String) {
					{
					setState(485);
					match(String);
					}
				}

				setState(488);
				match(CParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(523);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(521);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						_localctx = new PowerExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(491);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(492);
						match(Pow);
						setState(493);
						expression(18);
						}
						break;
					case 2:
						{
						_localctx = new MultExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(494);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(495);
						((MultExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Multiply) | (1L << Divide) | (1L << Modulus))) != 0)) ) {
							((MultExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(496);
						expression(18);
						}
						break;
					case 3:
						{
						_localctx = new AddExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(497);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(498);
						((AddExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==Add || _la==Subtract) ) {
							((AddExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(499);
						expression(17);
						}
						break;
					case 4:
						{
						_localctx = new CompExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(500);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(501);
						((CompExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GTEquals) | (1L << LTEquals) | (1L << GT) | (1L << LT))) != 0)) ) {
							((CompExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(502);
						expression(16);
						}
						break;
					case 5:
						{
						_localctx = new EqExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(503);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(504);
						((EqExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==Equals || _la==NEquals) ) {
							((EqExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(505);
						expression(15);
						}
						break;
					case 6:
						{
						_localctx = new AndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(506);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(507);
						match(And);
						setState(508);
						expression(14);
						}
						break;
					case 7:
						{
						_localctx = new OrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(509);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(510);
						match(Or);
						setState(511);
						expression(13);
						}
						break;
					case 8:
						{
						_localctx = new TernaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(512);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(513);
						match(QMark);
						setState(514);
						expression(0);
						setState(515);
						match(Colon);
						setState(516);
						expression(12);
						}
						break;
					case 9:
						{
						_localctx = new InExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(518);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(519);
						match(In);
						setState(520);
						expression(11);
						}
						break;
					}
					} 
				}
				setState(525);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ListContext extends ParserRuleContext {
		public TerminalNode OBracket() { return getToken(QParser.OBracket, 0); }
		public TerminalNode CBracket() { return getToken(QParser.CBracket, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			match(OBracket);
			setState(528);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & ((1L << (Println - 18)) | (1L << (Print - 18)) | (1L << (Input - 18)) | (1L << (Assert - 18)) | (1L << (ToInt - 18)) | (1L << (Null - 18)) | (1L << (Excl - 18)) | (1L << (Subtract - 18)) | (1L << (OBracket - 18)) | (1L << (OParen - 18)) | (1L << (Bool - 18)) | (1L << (Number - 18)) | (1L << (Identifier - 18)) | (1L << (String - 18)))) != 0)) {
				{
				setState(527);
				exprList();
				}
			}

			setState(530);
			match(CBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexesContext extends ParserRuleContext {
		public List<TerminalNode> OBracket() { return getTokens(QParser.OBracket); }
		public TerminalNode OBracket(int i) {
			return getToken(QParser.OBracket, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> CBracket() { return getTokens(QParser.CBracket); }
		public TerminalNode CBracket(int i) {
			return getToken(QParser.CBracket, i);
		}
		public IndexesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterIndexes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitIndexes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitIndexes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexesContext indexes() throws RecognitionException {
		IndexesContext _localctx = new IndexesContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_indexes);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(536); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(532);
					match(OBracket);
					setState(533);
					expression(0);
					setState(534);
					match(CBracket);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(538); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 37:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 18);
		case 1:
			return precpred(_ctx, 17);
		case 2:
			return precpred(_ctx, 16);
		case 3:
			return precpred(_ctx, 15);
		case 4:
			return precpred(_ctx, 14);
		case 5:
			return precpred(_ctx, 13);
		case 6:
			return precpred(_ctx, 12);
		case 7:
			return precpred(_ctx, 11);
		case 8:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3M\u021f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\5\2T\n\2\3"+
		"\2\3\2\3\2\3\3\3\3\7\3[\n\3\f\3\16\3^\13\3\3\3\3\3\3\3\3\3\5\3d\n\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0088"+
		"\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00a4\n\4\3\5\3\5\3\5\5\5\u00a9"+
		"\n\5\3\5\3\5\3\5\3\6\3\6\5\6\u00b0\n\6\3\6\3\6\3\6\3\7\3\7\3\7\5\7\u00b8"+
		"\n\7\3\7\3\7\3\7\3\7\5\7\u00be\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00d5\n\7\3\7\5\7"+
		"\u00d8\n\7\3\b\3\b\3\b\3\b\3\b\5\b\u00df\n\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\5\n\u00ed\n\n\3\n\3\n\3\n\3\n\3\13\3\13\7\13\u00f5"+
		"\n\13\f\13\16\13\u00f8\13\13\3\13\5\13\u00fb\n\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\5\16\u0112\n\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\5\17\u011f\n\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\5\23\u013e\n\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\5\30\u0159\n\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\7\33"+
		"\u017d\n\33\f\33\16\33\u0180\13\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\7$\u01b6\n$\f$\16$\u01b9\13$\3"+
		"%\3%\3%\3%\3%\3&\3&\3&\7&\u01c3\n&\f&\16&\u01c6\13&\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\5\'\u01d2\n\'\3\'\3\'\5\'\u01d6\n\'\3\'\3\'\5\'"+
		"\u01da\n\'\3\'\3\'\5\'\u01de\n\'\3\'\3\'\3\'\3\'\5\'\u01e4\n\'\3\'\3\'"+
		"\3\'\5\'\u01e9\n\'\3\'\5\'\u01ec\n\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\7\'\u020c\n\'\f\'\16\'\u020f\13\'\3(\3(\5(\u0213\n(\3"+
		"(\3(\3)\3)\3)\3)\6)\u021b\n)\r)\16)\u021c\3)\3\u017e\3L*\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNP\2\6\3\29;\3"+
		"\2\678\4\2\61\62\65\66\3\2/\60\2\u0245\2S\3\2\2\2\4\\\3\2\2\2\6\u00a3"+
		"\3\2\2\2\b\u00a5\3\2\2\2\n\u00ad\3\2\2\2\f\u00d7\3\2\2\2\16\u00d9\3\2"+
		"\2\2\20\u00e2\3\2\2\2\22\u00e6\3\2\2\2\24\u00f2\3\2\2\2\26\u00fe\3\2\2"+
		"\2\30\u0105\3\2\2\2\32\u010d\3\2\2\2\34\u0117\3\2\2\2\36\u0122\3\2\2\2"+
		" \u012a\3\2\2\2\"\u0131\3\2\2\2$\u0138\3\2\2\2&\u0141\3\2\2\2(\u0148\3"+
		"\2\2\2*\u014d\3\2\2\2,\u0150\3\2\2\2.\u0154\3\2\2\2\60\u015e\3\2\2\2\62"+
		"\u016a\3\2\2\2\64\u0177\3\2\2\2\66\u0181\3\2\2\28\u0188\3\2\2\2:\u018c"+
		"\3\2\2\2<\u0192\3\2\2\2>\u019a\3\2\2\2@\u01a0\3\2\2\2B\u01a7\3\2\2\2D"+
		"\u01ae\3\2\2\2F\u01b2\3\2\2\2H\u01ba\3\2\2\2J\u01bf\3\2\2\2L\u01eb\3\2"+
		"\2\2N\u0210\3\2\2\2P\u021a\3\2\2\2RT\5\20\t\2SR\3\2\2\2ST\3\2\2\2TU\3"+
		"\2\2\2UV\5\4\3\2VW\7\2\2\3W\3\3\2\2\2X[\5\6\4\2Y[\5.\30\2ZX\3\2\2\2ZY"+
		"\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]c\3\2\2\2^\\\3\2\2\2_`\7\"\2"+
		"\2`a\5L\'\2ab\7B\2\2bd\3\2\2\2c_\3\2\2\2cd\3\2\2\2d\5\3\2\2\2ef\5\b\5"+
		"\2fg\7B\2\2g\u00a4\3\2\2\2hi\5\f\7\2ij\7B\2\2j\u00a4\3\2\2\2k\u00a4\5"+
		"\24\13\2l\u00a4\5\60\31\2m\u00a4\5\62\32\2n\u00a4\5<\37\2o\u00a4\5:\36"+
		"\2p\u00a4\5D#\2qr\5B\"\2rs\7B\2\2s\u00a4\3\2\2\2tu\5\n\6\2uv\7B\2\2v\u00a4"+
		"\3\2\2\2w\u00a4\5H%\2x\u00a4\5\32\16\2yz\5@!\2z{\7B\2\2{\u00a4\3\2\2\2"+
		"|}\5> \2}~\7B\2\2~\u00a4\3\2\2\2\177\u0080\5&\24\2\u0080\u0081\7B\2\2"+
		"\u0081\u00a4\3\2\2\2\u0082\u0083\5(\25\2\u0083\u0084\7B\2\2\u0084\u00a4"+
		"\3\2\2\2\u0085\u0087\5\16\b\2\u0086\u0088\7B\2\2\u0087\u0086\3\2\2\2\u0087"+
		"\u0088\3\2\2\2\u0088\u00a4\3\2\2\2\u0089\u00a4\5\22\n\2\u008a\u008b\5"+
		"\34\17\2\u008b\u008c\7B\2\2\u008c\u00a4\3\2\2\2\u008d\u008e\5\36\20\2"+
		"\u008e\u008f\7B\2\2\u008f\u00a4\3\2\2\2\u0090\u0091\5 \21\2\u0091\u0092"+
		"\7B\2\2\u0092\u00a4\3\2\2\2\u0093\u0094\5\"\22\2\u0094\u0095\7B\2\2\u0095"+
		"\u00a4\3\2\2\2\u0096\u0097\5$\23\2\u0097\u0098\7B\2\2\u0098\u00a4\3\2"+
		"\2\2\u0099\u009a\58\35\2\u009a\u009b\7B\2\2\u009b\u00a4\3\2\2\2\u009c"+
		"\u009d\5\64\33\2\u009d\u009e\7B\2\2\u009e\u00a4\3\2\2\2\u009f\u00a4\5"+
		"\66\34\2\u00a0\u00a1\5*\26\2\u00a1\u00a2\7B\2\2\u00a2\u00a4\3\2\2\2\u00a3"+
		"e\3\2\2\2\u00a3h\3\2\2\2\u00a3k\3\2\2\2\u00a3l\3\2\2\2\u00a3m\3\2\2\2"+
		"\u00a3n\3\2\2\2\u00a3o\3\2\2\2\u00a3p\3\2\2\2\u00a3q\3\2\2\2\u00a3t\3"+
		"\2\2\2\u00a3w\3\2\2\2\u00a3x\3\2\2\2\u00a3y\3\2\2\2\u00a3|\3\2\2\2\u00a3"+
		"\177\3\2\2\2\u00a3\u0082\3\2\2\2\u00a3\u0085\3\2\2\2\u00a3\u0089\3\2\2"+
		"\2\u00a3\u008a\3\2\2\2\u00a3\u008d\3\2\2\2\u00a3\u0090\3\2\2\2\u00a3\u0093"+
		"\3\2\2\2\u00a3\u0096\3\2\2\2\u00a3\u0099\3\2\2\2\u00a3\u009c\3\2\2\2\u00a3"+
		"\u009f\3\2\2\2\u00a3\u00a0\3\2\2\2\u00a4\7\3\2\2\2\u00a5\u00a6\7\30\2"+
		"\2\u00a6\u00a8\7I\2\2\u00a7\u00a9\5P)\2\u00a8\u00a7\3\2\2\2\u00a8\u00a9"+
		"\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\7C\2\2\u00ab\u00ac\5L\'\2\u00ac"+
		"\t\3\2\2\2\u00ad\u00af\7I\2\2\u00ae\u00b0\5P)\2\u00af\u00ae\3\2\2\2\u00af"+
		"\u00b0\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\7C\2\2\u00b2\u00b3\5L\'"+
		"\2\u00b3\13\3\2\2\2\u00b4\u00b5\7I\2\2\u00b5\u00b7\7@\2\2\u00b6\u00b8"+
		"\5J&\2\u00b7\u00b6\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9"+
		"\u00d8\7A\2\2\u00ba\u00bb\7\24\2\2\u00bb\u00bd\7@\2\2\u00bc\u00be\5L\'"+
		"\2\u00bd\u00bc\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00d8"+
		"\7A\2\2\u00c0\u00c1\7\32\2\2\u00c1\u00c2\7@\2\2\u00c2\u00c3\5L\'\2\u00c3"+
		"\u00c4\7A\2\2\u00c4\u00d8\3\2\2\2\u00c5\u00c6\7\34\2\2\u00c6\u00c7\7@"+
		"\2\2\u00c7\u00c8\5L\'\2\u00c8\u00c9\7A\2\2\u00c9\u00d8\3\2\2\2\u00ca\u00cb"+
		"\7\36\2\2\u00cb\u00cc\7@\2\2\u00cc\u00cd\5L\'\2\u00cd\u00ce\7A\2\2\u00ce"+
		"\u00d8\3\2\2\2\u00cf\u00d0\7I\2\2\u00d0\u00d1\7\3\2\2\u00d1\u00d2\7I\2"+
		"\2\u00d2\u00d4\7@\2\2\u00d3\u00d5\5J&\2\u00d4\u00d3\3\2\2\2\u00d4\u00d5"+
		"\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d8\7A\2\2\u00d7\u00b4\3\2\2\2\u00d7"+
		"\u00ba\3\2\2\2\u00d7\u00c0\3\2\2\2\u00d7\u00c5\3\2\2\2\u00d7\u00ca\3\2"+
		"\2\2\u00d7\u00cf\3\2\2\2\u00d8\r\3\2\2\2\u00d9\u00da\7I\2\2\u00da\u00db"+
		"\7\3\2\2\u00db\u00dc\7I\2\2\u00dc\u00de\7@\2\2\u00dd\u00df\5J&\2\u00de"+
		"\u00dd\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\7A"+
		"\2\2\u00e1\17\3\2\2\2\u00e2\u00e3\7\4\2\2\u00e3\u00e4\7\5\2\2\u00e4\u00e5"+
		"\7I\2\2\u00e5\21\3\2\2\2\u00e6\u00e7\7\35\2\2\u00e7\u00e8\7I\2\2\u00e8"+
		"\u00e9\7F\2\2\u00e9\u00ea\7I\2\2\u00ea\u00ec\7@\2\2\u00eb\u00ed\5F$\2"+
		"\u00ec\u00eb\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef"+
		"\7A\2\2\u00ef\u00f0\5\4\3\2\u00f0\u00f1\7\'\2\2\u00f1\23\3\2\2\2\u00f2"+
		"\u00f6\5\26\f\2\u00f3\u00f5\5\30\r\2\u00f4\u00f3\3\2\2\2\u00f5\u00f8\3"+
		"\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8"+
		"\u00f6\3\2\2\2\u00f9\u00fb\5,\27\2\u00fa\u00f9\3\2\2\2\u00fa\u00fb\3\2"+
		"\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\7\'\2\2\u00fd\25\3\2\2\2\u00fe\u00ff"+
		"\7 \2\2\u00ff\u0100\7@\2\2\u0100\u0101\5L\'\2\u0101\u0102\7A\2\2\u0102"+
		"\u0103\7&\2\2\u0103\u0104\5\4\3\2\u0104\27\3\2\2\2\u0105\u0106\7!\2\2"+
		"\u0106\u0107\7 \2\2\u0107\u0108\7@\2\2\u0108\u0109\5L\'\2\u0109\u010a"+
		"\7A\2\2\u010a\u010b\7&\2\2\u010b\u010c\5\4\3\2\u010c\31\3\2\2\2\u010d"+
		"\u010e\7\6\2\2\u010e\u010f\7I\2\2\u010f\u0111\7@\2\2\u0110\u0112\5J&\2"+
		"\u0111\u0110\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0114"+
		"\7A\2\2\u0114\u0115\5\4\3\2\u0115\u0116\7\'\2\2\u0116\33\3\2\2\2\u0117"+
		"\u0118\7I\2\2\u0118\u0119\7I\2\2\u0119\u011a\7C\2\2\u011a\u011b\7\27\2"+
		"\2\u011b\u011c\7I\2\2\u011c\u011e\7@\2\2\u011d\u011f\5J&\2\u011e\u011d"+
		"\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\7A\2\2\u0121"+
		"\35\3\2\2\2\u0122\u0123\7\7\2\2\u0123\u0124\7I\2\2\u0124\u0125\7C\2\2"+
		"\u0125\u0126\7\27\2\2\u0126\u0127\7\7\2\2\u0127\u0128\7\66\2\2\u0128\u0129"+
		"\7\65\2\2\u0129\37\3\2\2\2\u012a\u012b\7I\2\2\u012b\u012c\7\3\2\2\u012c"+
		"\u012d\7\b\2\2\u012d\u012e\7@\2\2\u012e\u012f\5L\'\2\u012f\u0130\7A\2"+
		"\2\u0130!\3\2\2\2\u0131\u0132\7I\2\2\u0132\u0133\7\3\2\2\u0133\u0134\7"+
		"\t\2\2\u0134\u0135\7@\2\2\u0135\u0136\5L\'\2\u0136\u0137\7A\2\2\u0137"+
		"#\3\2\2\2\u0138\u0139\7\n\2\2\u0139\u013a\7\3\2\2\u013a\u013b\7I\2\2\u013b"+
		"\u013d\7@\2\2\u013c\u013e\5L\'\2\u013d\u013c\3\2\2\2\u013d\u013e\3\2\2"+
		"\2\u013e\u013f\3\2\2\2\u013f\u0140\7A\2\2\u0140%\3\2\2\2\u0141\u0142\7"+
		"I\2\2\u0142\u0143\7\3\2\2\u0143\u0144\7\13\2\2\u0144\u0145\7@\2\2\u0145"+
		"\u0146\5L\'\2\u0146\u0147\7A\2\2\u0147\'\3\2\2\2\u0148\u0149\7\f\2\2\u0149"+
		"\u014a\7@\2\2\u014a\u014b\5L\'\2\u014b\u014c\7A\2\2\u014c)\3\2\2\2\u014d"+
		"\u014e\7\r\2\2\u014e\u014f\7I\2\2\u014f+\3\2\2\2\u0150\u0151\7!\2\2\u0151"+
		"\u0152\7&\2\2\u0152\u0153\5\4\3\2\u0153-\3\2\2\2\u0154\u0155\7\35\2\2"+
		"\u0155\u0156\7I\2\2\u0156\u0158\7@\2\2\u0157\u0159\5F$\2\u0158\u0157\3"+
		"\2\2\2\u0158\u0159\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015b\7A\2\2\u015b"+
		"\u015c\5\4\3\2\u015c\u015d\7\'\2\2\u015d/\3\2\2\2\u015e\u015f\7#\2\2\u015f"+
		"\u0160\7@\2\2\u0160\u0161\7I\2\2\u0161\u0162\7C\2\2\u0162\u0163\5L\'\2"+
		"\u0163\u0164\7%\2\2\u0164\u0165\5L\'\2\u0165\u0166\7A\2\2\u0166\u0167"+
		"\7&\2\2\u0167\u0168\5\4\3\2\u0168\u0169\7\'\2\2\u0169\61\3\2\2\2\u016a"+
		"\u016b\7#\2\2\u016b\u016c\7@\2\2\u016c\u016d\7I\2\2\u016d\u016e\7(\2\2"+
		"\u016e\u016f\7\16\2\2\u016f\u0170\7@\2\2\u0170\u0171\5L\'\2\u0171\u0172"+
		"\7A\2\2\u0172\u0173\7A\2\2\u0173\u0174\7&\2\2\u0174\u0175\5\4\3\2\u0175"+
		"\u0176\7\'\2\2\u0176\63\3\2\2\2\u0177\u0178\7\17\2\2\u0178\u0179\7\31"+
		"\2\2\u0179\u017e\7I\2\2\u017a\u017b\7\3\2\2\u017b\u017d\7I\2\2\u017c\u017a"+
		"\3\2\2\2\u017d\u0180\3\2\2\2\u017e\u017f\3\2\2\2\u017e\u017c\3\2\2\2\u017f"+
		"\65\3\2\2\2\u0180\u017e\3\2\2\2\u0181\u0182\7\35\2\2\u0182\u0183\78\2"+
		"\2\u0183\u0184\7\65\2\2\u0184\u0185\7<\2\2\u0185\u0186\5\4\3\2\u0186\u0187"+
		"\7=\2\2\u0187\67\3\2\2\2\u0188\u0189\7\17\2\2\u0189\u018a\7\31\2\2\u018a"+
		"\u018b\5L\'\2\u018b9\3\2\2\2\u018c\u018d\7*\2\2\u018d\u018e\5\4\3\2\u018e"+
		"\u018f\7\20\2\2\u018f\u0190\5\4\3\2\u0190\u0191\7\'\2\2\u0191;\3\2\2\2"+
		"\u0192\u0193\7$\2\2\u0193\u0194\7@\2\2\u0194\u0195\5L\'\2\u0195\u0196"+
		"\7A\2\2\u0196\u0197\7&\2\2\u0197\u0198\5\4\3\2\u0198\u0199\7\'\2\2\u0199"+
		"=\3\2\2\2\u019a\u019b\7I\2\2\u019b\u019c\7\3\2\2\u019c\u019d\7\25\2\2"+
		"\u019d\u019e\7@\2\2\u019e\u019f\7A\2\2\u019f?\3\2\2\2\u01a0\u01a1\7I\2"+
		"\2\u01a1\u01a2\7\3\2\2\u01a2\u01a3\7\26\2\2\u01a3\u01a4\7@\2\2\u01a4\u01a5"+
		"\5L\'\2\u01a5\u01a6\7A\2\2\u01a6A\3\2\2\2\u01a7\u01a8\7I\2\2\u01a8\u01a9"+
		"\7\3\2\2\u01a9\u01aa\7\21\2\2\u01aa\u01ab\7@\2\2\u01ab\u01ac\5L\'\2\u01ac"+
		"\u01ad\7A\2\2\u01adC\3\2\2\2\u01ae\u01af\7\22\2\2\u01af\u01b0\5\4\3\2"+
		"\u01b0\u01b1\7\'\2\2\u01b1E\3\2\2\2\u01b2\u01b7\7I\2\2\u01b3\u01b4\7D"+
		"\2\2\u01b4\u01b6\7I\2\2\u01b5\u01b3\3\2\2\2\u01b6\u01b9\3\2\2\2\u01b7"+
		"\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8G\3\2\2\2\u01b9\u01b7\3\2\2\2"+
		"\u01ba\u01bb\7,\2\2\u01bb\u01bc\7I\2\2\u01bc\u01bd\5\4\3\2\u01bd\u01be"+
		"\7\23\2\2\u01beI\3\2\2\2\u01bf\u01c4\5L\'\2\u01c0\u01c1\7D\2\2\u01c1\u01c3"+
		"\5L\'\2\u01c2\u01c0\3\2\2\2\u01c3\u01c6\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c4"+
		"\u01c5\3\2\2\2\u01c5K\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c7\u01c8\b\'\1\2"+
		"\u01c8\u01c9\78\2\2\u01c9\u01ec\5L\'\26\u01ca\u01cb\7\64\2\2\u01cb\u01ec"+
		"\5L\'\25\u01cc\u01ec\7H\2\2\u01cd\u01ec\7G\2\2\u01ce\u01ec\7)\2\2\u01cf"+
		"\u01d1\5\f\7\2\u01d0\u01d2\5P)\2\u01d1\u01d0\3\2\2\2\u01d1\u01d2\3\2\2"+
		"\2\u01d2\u01ec\3\2\2\2\u01d3\u01d5\5N(\2\u01d4\u01d6\5P)\2\u01d5\u01d4"+
		"\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01ec\3\2\2\2\u01d7\u01d9\7I\2\2\u01d8"+
		"\u01da\5P)\2\u01d9\u01d8\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01ec\3\2\2"+
		"\2\u01db\u01dd\7J\2\2\u01dc\u01de\5P)\2\u01dd\u01dc\3\2\2\2\u01dd\u01de"+
		"\3\2\2\2\u01de\u01ec\3\2\2\2\u01df\u01e0\7@\2\2\u01e0\u01e1\5L\'\2\u01e1"+
		"\u01e3\7A\2\2\u01e2\u01e4\5P)\2\u01e3\u01e2\3\2\2\2\u01e3\u01e4\3\2\2"+
		"\2\u01e4\u01ec\3\2\2\2\u01e5\u01e6\7\33\2\2\u01e6\u01e8\7@\2\2\u01e7\u01e9"+
		"\7J\2\2\u01e8\u01e7\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea"+
		"\u01ec\7A\2\2\u01eb\u01c7\3\2\2\2\u01eb\u01ca\3\2\2\2\u01eb\u01cc\3\2"+
		"\2\2\u01eb\u01cd\3\2\2\2\u01eb\u01ce\3\2\2\2\u01eb\u01cf\3\2\2\2\u01eb"+
		"\u01d3\3\2\2\2\u01eb\u01d7\3\2\2\2\u01eb\u01db\3\2\2\2\u01eb\u01df\3\2"+
		"\2\2\u01eb\u01e5\3\2\2\2\u01ec\u020d\3\2\2\2\u01ed\u01ee\f\24\2\2\u01ee"+
		"\u01ef\7\63\2\2\u01ef\u020c\5L\'\24\u01f0\u01f1\f\23\2\2\u01f1\u01f2\t"+
		"\2\2\2\u01f2\u020c\5L\'\24\u01f3\u01f4\f\22\2\2\u01f4\u01f5\t\3\2\2\u01f5"+
		"\u020c\5L\'\23\u01f6\u01f7\f\21\2\2\u01f7\u01f8\t\4\2\2\u01f8\u020c\5"+
		"L\'\22\u01f9\u01fa\f\20\2\2\u01fa\u01fb\t\5\2\2\u01fb\u020c\5L\'\21\u01fc"+
		"\u01fd\f\17\2\2\u01fd\u01fe\7.\2\2\u01fe\u020c\5L\'\20\u01ff\u0200\f\16"+
		"\2\2\u0200\u0201\7-\2\2\u0201\u020c\5L\'\17\u0202\u0203\f\r\2\2\u0203"+
		"\u0204\7E\2\2\u0204\u0205\5L\'\2\u0205\u0206\7F\2\2\u0206\u0207\5L\'\16"+
		"\u0207\u020c\3\2\2\2\u0208\u0209\f\f\2\2\u0209\u020a\7(\2\2\u020a\u020c"+
		"\5L\'\r\u020b\u01ed\3\2\2\2\u020b\u01f0\3\2\2\2\u020b\u01f3\3\2\2\2\u020b"+
		"\u01f6\3\2\2\2\u020b\u01f9\3\2\2\2\u020b\u01fc\3\2\2\2\u020b\u01ff\3\2"+
		"\2\2\u020b\u0202\3\2\2\2\u020b\u0208\3\2\2\2\u020c\u020f\3\2\2\2\u020d"+
		"\u020b\3\2\2\2\u020d\u020e\3\2\2\2\u020eM\3\2\2\2\u020f\u020d\3\2\2\2"+
		"\u0210\u0212\7>\2\2\u0211\u0213\5J&\2\u0212\u0211\3\2\2\2\u0212\u0213"+
		"\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u0215\7?\2\2\u0215O\3\2\2\2\u0216\u0217"+
		"\7>\2\2\u0217\u0218\5L\'\2\u0218\u0219\7?\2\2\u0219\u021b\3\2\2\2\u021a"+
		"\u0216\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u021a\3\2\2\2\u021c\u021d\3\2"+
		"\2\2\u021dQ\3\2\2\2$SZ\\c\u0087\u00a3\u00a8\u00af\u00b7\u00bd\u00d4\u00d7"+
		"\u00de\u00ec\u00f6\u00fa\u0111\u011e\u013d\u0158\u017e\u01b7\u01c4\u01d1"+
		"\u01d5\u01d9\u01dd\u01e3\u01e8\u01eb\u020b\u020d\u0212\u021c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}