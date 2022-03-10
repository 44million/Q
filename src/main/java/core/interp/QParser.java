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
		T__17=18, T__18=19, Println=20, Async=21, Var=22, Import=23, Print=24, 
		Input=25, Assert=26, Def=27, ToInt=28, If=29, Else=30, Return=31, For=32, 
		While=33, To=34, Do=35, End=36, In=37, Null=38, Try=39, Class=40, Const=41, 
		Noval=42, Self=43, Native=44, Or=45, Accessor=46, And=47, Equals=48, NEquals=49, 
		GTEquals=50, LTEquals=51, Pow=52, Excl=53, GT=54, LT=55, Add=56, Subtract=57, 
		Multiply=58, Divide=59, Modulus=60, OBrace=61, CBrace=62, OBracket=63, 
		CBracket=64, OParen=65, CParen=66, SColon=67, Assign=68, Comma=69, QMark=70, 
		Colon=71, Bool=72, Number=73, Identifier=74, String=75, Comment=76, Space=77;
	public static final int
		RULE_parse = 0, RULE_block = 1, RULE_statement = 2, RULE_reAssignment = 3, 
		RULE_assignment = 4, RULE_functionCall = 5, RULE_allImport = 6, RULE_objFunctionCall = 7, 
		RULE_header = 8, RULE_ifStatement = 9, RULE_ifStat = 10, RULE_hereStatement = 11, 
		RULE_varHereStatement = 12, RULE_elseIfStat = 13, RULE_constructorStatement = 14, 
		RULE_objCreateStatement = 15, RULE_osExecStatement = 16, RULE_fileWriteStatement = 17, 
		RULE_verifyFileStatement = 18, RULE_elseStat = 19, RULE_functionDecl = 20, 
		RULE_forStatement = 21, RULE_forInStatement = 22, RULE_importStatement = 23, 
		RULE_anonymousFunction = 24, RULE_importFromGithubStatement = 25, RULE_importAllStatement = 26, 
		RULE_atStatement = 27, RULE_tryCatchStatement = 28, RULE_whileStatement = 29, 
		RULE_windowRenderStatement = 30, RULE_windowAddCompStatement = 31, RULE_addWebServerTextStatement = 32, 
		RULE_mainFunctionStatement = 33, RULE_idList = 34, RULE_classStatement = 35, 
		RULE_exprList = 36, RULE_expression = 37, RULE_list = 38, RULE_objVar = 39, 
		RULE_indexes = 40;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "block", "statement", "reAssignment", "assignment", "functionCall", 
			"allImport", "objFunctionCall", "header", "ifStatement", "ifStat", "hereStatement", 
			"varHereStatement", "elseIfStat", "constructorStatement", "objCreateStatement", 
			"osExecStatement", "fileWriteStatement", "verifyFileStatement", "elseStat", 
			"functionDecl", "forStatement", "forInStatement", "importStatement", 
			"anonymousFunction", "importFromGithubStatement", "importAllStatement", 
			"atStatement", "tryCatchStatement", "whileStatement", "windowRenderStatement", 
			"windowAddCompStatement", "addWebServerTextStatement", "mainFunctionStatement", 
			"idList", "classStatement", "exprList", "expression", "list", "objVar", 
			"indexes"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'@'", "'header'", "'cn'", "'new'", "'as'", "'sys'", "'write'", 
			"'verify'", "'range'", "'#'", "'.'", "'all'", "'on'", "'flaw'", "'render'", 
			"'addComp'", "'changeText'", "'fn main()'", "'random'", null, "'async'", 
			"'var'", "'import'", null, null, "'assert'", "'fn'", "'toInt'", "'if'", 
			"'else'", "'return'", "'for'", "'while'", "'to'", "'do'", "'end'", "'in'", 
			"'null'", "'try'", "'class'", "'const'", "'noval'", "'self'", "'native'", 
			"'||'", "'::'", "'&&'", "'=='", "'!='", "'>='", "'<='", "'^'", "'!'", 
			"'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'%'", "'{'", "'}'", "'['", 
			"']'", "'('", "')'", "';'", "'='", "','", "'?'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "Println", "Async", "Var", 
			"Import", "Print", "Input", "Assert", "Def", "ToInt", "If", "Else", "Return", 
			"For", "While", "To", "Do", "End", "In", "Null", "Try", "Class", "Const", 
			"Noval", "Self", "Native", "Or", "Accessor", "And", "Equals", "NEquals", 
			"GTEquals", "LTEquals", "Pow", "Excl", "GT", "LT", "Add", "Subtract", 
			"Multiply", "Divide", "Modulus", "OBrace", "CBrace", "OBracket", "CBracket", 
			"OParen", "CParen", "SColon", "Assign", "Comma", "QMark", "Colon", "Bool", 
			"Number", "Identifier", "String", "Comment", "Space"
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
		public List<AllImportContext> allImport() {
			return getRuleContexts(AllImportContext.class);
		}
		public AllImportContext allImport(int i) {
			return getRuleContext(AllImportContext.class,i);
		}
		public List<TerminalNode> SColon() { return getTokens(QParser.SColon); }
		public TerminalNode SColon(int i) {
			return getToken(QParser.SColon, i);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(82);
				header();
				}
				break;
			}
			setState(90);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(85);
					allImport();
					setState(86);
					match(SColon);
					}
					} 
				}
				setState(92);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(93);
			block();
			setState(94);
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
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__5) | (1L << T__7) | (1L << T__17) | (1L << Println) | (1L << Async) | (1L << Var) | (1L << Print) | (1L << Assert) | (1L << Def) | (1L << ToInt) | (1L << If) | (1L << For) | (1L << While) | (1L << Try) | (1L << Class) | (1L << Const) | (1L << Noval) | (1L << Self) | (1L << Native))) != 0) || _la==Identifier) {
				{
				setState(98);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(96);
					statement();
					}
					break;
				case 2:
					{
					setState(97);
					functionDecl();
					}
					break;
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Return) {
				{
				setState(103);
				match(Return);
				setState(104);
				expression(0);
				setState(105);
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
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode SColon() { return getToken(QParser.SColon, 0); }
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
		public ObjCreateStatementContext objCreateStatement() {
			return getRuleContext(ObjCreateStatementContext.class,0);
		}
		public OsExecStatementContext osExecStatement() {
			return getRuleContext(OsExecStatementContext.class,0);
		}
		public AnonymousFunctionContext anonymousFunction() {
			return getRuleContext(AnonymousFunctionContext.class,0);
		}
		public HereStatementContext hereStatement() {
			return getRuleContext(HereStatementContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AtStatementContext atStatement() {
			return getRuleContext(AtStatementContext.class,0);
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
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				functionCall();
				setState(110);
				match(SColon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				ifStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
				forStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(114);
				forInStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(115);
				whileStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(116);
				tryCatchStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(117);
				mainFunctionStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(118);
				addWebServerTextStatement();
				setState(119);
				match(SColon);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(121);
				reAssignment();
				setState(122);
				match(SColon);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(124);
				classStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(125);
				constructorStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(126);
				windowAddCompStatement();
				setState(127);
				match(SColon);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(129);
				windowRenderStatement();
				setState(130);
				match(SColon);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(132);
				fileWriteStatement();
				setState(133);
				match(SColon);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(135);
				verifyFileStatement();
				setState(136);
				match(SColon);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(138);
				objFunctionCall();
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SColon) {
					{
					setState(139);
					match(SColon);
					}
				}

				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(142);
				objCreateStatement();
				setState(143);
				match(SColon);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(145);
				osExecStatement();
				setState(146);
				match(SColon);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(148);
				anonymousFunction();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(149);
				hereStatement();
				setState(150);
				match(SColon);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(152);
				assignment();
				setState(153);
				match(SColon);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(155);
				atStatement();
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

	public static class ReAssignmentContext extends ParserRuleContext {
		public TerminalNode Assign() { return getToken(QParser.Assign, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(QParser.Identifier, 0); }
		public ObjVarContext objVar() {
			return getRuleContext(ObjVarContext.class,0);
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
		enterRule(_localctx, 6, RULE_reAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(158);
				match(Identifier);
				}
				break;
			case 2:
				{
				setState(159);
				objVar();
				}
				break;
			}
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OBracket) {
				{
				setState(162);
				indexes();
				}
			}

			setState(165);
			match(Assign);
			setState(166);
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode Var() { return getToken(QParser.Var, 0); }
		public TerminalNode Identifier() { return getToken(QParser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(QParser.Assign, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> Const() { return getTokens(QParser.Const); }
		public TerminalNode Const(int i) {
			return getToken(QParser.Const, i);
		}
		public List<TerminalNode> Noval() { return getTokens(QParser.Noval); }
		public TerminalNode Noval(int i) {
			return getToken(QParser.Noval, i);
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
		enterRule(_localctx, 8, RULE_assignment);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(168);
					_la = _input.LA(1);
					if ( !(_la==Const || _la==Noval) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(173);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(174);
			match(Var);
			setState(175);
			match(Identifier);
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OBracket || _la==Assign) {
				{
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OBracket) {
					{
					setState(176);
					indexes();
					}
				}

				setState(179);
				match(Assign);
				setState(180);
				expression(0);
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
		public TerminalNode Accessor() { return getToken(QParser.Accessor, 0); }
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
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new IdentifierFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				match(Identifier);
				setState(184);
				match(OParen);
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & ((1L << (T__18 - 19)) | (1L << (Println - 19)) | (1L << (Print - 19)) | (1L << (Input - 19)) | (1L << (Assert - 19)) | (1L << (Def - 19)) | (1L << (ToInt - 19)) | (1L << (Null - 19)) | (1L << (Self - 19)) | (1L << (Excl - 19)) | (1L << (Subtract - 19)) | (1L << (OBracket - 19)) | (1L << (OParen - 19)) | (1L << (Bool - 19)) | (1L << (Number - 19)) | (1L << (Identifier - 19)) | (1L << (String - 19)))) != 0)) {
					{
					setState(185);
					exprList();
					}
				}

				setState(188);
				match(CParen);
				}
				break;
			case 2:
				_localctx = new PrintlnFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				match(Println);
				setState(190);
				match(OParen);
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & ((1L << (T__18 - 19)) | (1L << (Println - 19)) | (1L << (Print - 19)) | (1L << (Input - 19)) | (1L << (Assert - 19)) | (1L << (Def - 19)) | (1L << (ToInt - 19)) | (1L << (Null - 19)) | (1L << (Self - 19)) | (1L << (Excl - 19)) | (1L << (Subtract - 19)) | (1L << (OBracket - 19)) | (1L << (OParen - 19)) | (1L << (Bool - 19)) | (1L << (Number - 19)) | (1L << (Identifier - 19)) | (1L << (String - 19)))) != 0)) {
					{
					setState(191);
					expression(0);
					}
				}

				setState(194);
				match(CParen);
				}
				break;
			case 3:
				_localctx = new PrintFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(195);
				match(Print);
				setState(196);
				match(OParen);
				setState(197);
				expression(0);
				setState(198);
				match(CParen);
				}
				break;
			case 4:
				_localctx = new AssertFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(200);
				match(Assert);
				setState(201);
				match(OParen);
				setState(202);
				expression(0);
				setState(203);
				match(CParen);
				}
				break;
			case 5:
				_localctx = new ToIntFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(205);
				match(ToInt);
				setState(206);
				match(OParen);
				setState(207);
				expression(0);
				setState(208);
				match(CParen);
				}
				break;
			case 6:
				_localctx = new ObjFunctionCallExpressionContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(210);
				match(Identifier);
				setState(211);
				match(Accessor);
				setState(212);
				match(Identifier);
				setState(213);
				match(OParen);
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & ((1L << (T__18 - 19)) | (1L << (Println - 19)) | (1L << (Print - 19)) | (1L << (Input - 19)) | (1L << (Assert - 19)) | (1L << (Def - 19)) | (1L << (ToInt - 19)) | (1L << (Null - 19)) | (1L << (Self - 19)) | (1L << (Excl - 19)) | (1L << (Subtract - 19)) | (1L << (OBracket - 19)) | (1L << (OParen - 19)) | (1L << (Bool - 19)) | (1L << (Number - 19)) | (1L << (Identifier - 19)) | (1L << (String - 19)))) != 0)) {
					{
					setState(214);
					exprList();
					}
				}

				setState(217);
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

	public static class AllImportContext extends ParserRuleContext {
		public AllImportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allImport; }
	 
		public AllImportContext() { }
		public void copyFrom(AllImportContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FileSystemImportStatementContext extends AllImportContext {
		public ImportStatementContext importStatement() {
			return getRuleContext(ImportStatementContext.class,0);
		}
		public FileSystemImportStatementContext(AllImportContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterFileSystemImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitFileSystemImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitFileSystemImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GithubImportStatementContext extends AllImportContext {
		public ImportFromGithubStatementContext importFromGithubStatement() {
			return getRuleContext(ImportFromGithubStatementContext.class,0);
		}
		public GithubImportStatementContext(AllImportContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterGithubImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitGithubImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitGithubImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ImportAllContext extends AllImportContext {
		public ImportAllStatementContext importAllStatement() {
			return getRuleContext(ImportAllStatementContext.class,0);
		}
		public ImportAllContext(AllImportContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterImportAll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitImportAll(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitImportAll(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AllImportContext allImport() throws RecognitionException {
		AllImportContext _localctx = new AllImportContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_allImport);
		try {
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new FileSystemImportStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				importStatement();
				}
				break;
			case 2:
				_localctx = new GithubImportStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				importFromGithubStatement();
				}
				break;
			case 3:
				_localctx = new ImportAllContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(222);
				importAllStatement();
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
		public TerminalNode Accessor() { return getToken(QParser.Accessor, 0); }
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
		enterRule(_localctx, 14, RULE_objFunctionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(Identifier);
			setState(226);
			match(Accessor);
			setState(227);
			match(Identifier);
			setState(228);
			match(OParen);
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & ((1L << (T__18 - 19)) | (1L << (Println - 19)) | (1L << (Print - 19)) | (1L << (Input - 19)) | (1L << (Assert - 19)) | (1L << (Def - 19)) | (1L << (ToInt - 19)) | (1L << (Null - 19)) | (1L << (Self - 19)) | (1L << (Excl - 19)) | (1L << (Subtract - 19)) | (1L << (OBracket - 19)) | (1L << (OParen - 19)) | (1L << (Bool - 19)) | (1L << (Number - 19)) | (1L << (Identifier - 19)) | (1L << (String - 19)))) != 0)) {
				{
				setState(229);
				exprList();
				}
			}

			setState(232);
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
		enterRule(_localctx, 16, RULE_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(T__0);
			setState(235);
			match(T__1);
			setState(236);
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
			setState(238);
			ifStat();
			setState(242);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(239);
					elseIfStat();
					}
					} 
				}
				setState(244);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Else) {
				{
				setState(245);
				elseStat();
				}
			}

			setState(248);
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
			setState(250);
			match(If);
			setState(251);
			match(OParen);
			setState(252);
			expression(0);
			setState(253);
			match(CParen);
			setState(254);
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

	public static class HereStatementContext extends ParserRuleContext {
		public TerminalNode Self() { return getToken(QParser.Self, 0); }
		public TerminalNode Accessor() { return getToken(QParser.Accessor, 0); }
		public TerminalNode Identifier() { return getToken(QParser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(QParser.Assign, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public HereStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hereStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterHereStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitHereStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitHereStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HereStatementContext hereStatement() throws RecognitionException {
		HereStatementContext _localctx = new HereStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_hereStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(Self);
			setState(257);
			match(Accessor);
			setState(258);
			match(Identifier);
			setState(259);
			match(Assign);
			setState(260);
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

	public static class VarHereStatementContext extends ParserRuleContext {
		public TerminalNode Self() { return getToken(QParser.Self, 0); }
		public TerminalNode Accessor() { return getToken(QParser.Accessor, 0); }
		public TerminalNode Identifier() { return getToken(QParser.Identifier, 0); }
		public VarHereStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varHereStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterVarHereStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitVarHereStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitVarHereStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarHereStatementContext varHereStatement() throws RecognitionException {
		VarHereStatementContext _localctx = new VarHereStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_varHereStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(Self);
			setState(263);
			match(Accessor);
			setState(264);
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

	public static class ElseIfStatContext extends ParserRuleContext {
		public TerminalNode Else() { return getToken(QParser.Else, 0); }
		public TerminalNode If() { return getToken(QParser.If, 0); }
		public TerminalNode OParen() { return getToken(QParser.OParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CParen() { return getToken(QParser.CParen, 0); }
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
		enterRule(_localctx, 26, RULE_elseIfStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(Else);
			setState(267);
			match(If);
			setState(268);
			match(OParen);
			setState(269);
			expression(0);
			setState(270);
			match(CParen);
			setState(271);
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
		enterRule(_localctx, 28, RULE_constructorStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(T__2);
			setState(274);
			match(Identifier);
			setState(275);
			match(OParen);
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & ((1L << (T__18 - 19)) | (1L << (Println - 19)) | (1L << (Print - 19)) | (1L << (Input - 19)) | (1L << (Assert - 19)) | (1L << (Def - 19)) | (1L << (ToInt - 19)) | (1L << (Null - 19)) | (1L << (Self - 19)) | (1L << (Excl - 19)) | (1L << (Subtract - 19)) | (1L << (OBracket - 19)) | (1L << (OParen - 19)) | (1L << (Bool - 19)) | (1L << (Number - 19)) | (1L << (Identifier - 19)) | (1L << (String - 19)))) != 0)) {
				{
				setState(276);
				exprList();
				}
			}

			setState(279);
			match(CParen);
			setState(280);
			block();
			setState(281);
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
		enterRule(_localctx, 30, RULE_objCreateStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(T__3);
			setState(284);
			match(Identifier);
			setState(285);
			match(T__4);
			setState(286);
			match(Identifier);
			setState(287);
			match(OParen);
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & ((1L << (T__18 - 19)) | (1L << (Println - 19)) | (1L << (Print - 19)) | (1L << (Input - 19)) | (1L << (Assert - 19)) | (1L << (Def - 19)) | (1L << (ToInt - 19)) | (1L << (Null - 19)) | (1L << (Self - 19)) | (1L << (Excl - 19)) | (1L << (Subtract - 19)) | (1L << (OBracket - 19)) | (1L << (OParen - 19)) | (1L << (Bool - 19)) | (1L << (Number - 19)) | (1L << (Identifier - 19)) | (1L << (String - 19)))) != 0)) {
				{
				setState(288);
				exprList();
				}
			}

			setState(291);
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
		public TerminalNode Accessor() { return getToken(QParser.Accessor, 0); }
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
		enterRule(_localctx, 32, RULE_osExecStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(T__5);
			setState(294);
			match(Accessor);
			setState(295);
			match(Identifier);
			setState(296);
			match(OParen);
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & ((1L << (T__18 - 19)) | (1L << (Println - 19)) | (1L << (Print - 19)) | (1L << (Input - 19)) | (1L << (Assert - 19)) | (1L << (Def - 19)) | (1L << (ToInt - 19)) | (1L << (Null - 19)) | (1L << (Self - 19)) | (1L << (Excl - 19)) | (1L << (Subtract - 19)) | (1L << (OBracket - 19)) | (1L << (OParen - 19)) | (1L << (Bool - 19)) | (1L << (Number - 19)) | (1L << (Identifier - 19)) | (1L << (String - 19)))) != 0)) {
				{
				setState(297);
				expression(0);
				}
			}

			setState(300);
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
		public TerminalNode Accessor() { return getToken(QParser.Accessor, 0); }
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
		enterRule(_localctx, 34, RULE_fileWriteStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(Identifier);
			setState(303);
			match(Accessor);
			setState(304);
			match(T__6);
			setState(305);
			match(OParen);
			setState(306);
			expression(0);
			setState(307);
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
		enterRule(_localctx, 36, RULE_verifyFileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(T__7);
			setState(310);
			match(OParen);
			setState(311);
			expression(0);
			setState(312);
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

	public static class ElseStatContext extends ParserRuleContext {
		public TerminalNode Else() { return getToken(QParser.Else, 0); }
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
		enterRule(_localctx, 38, RULE_elseStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(Else);
			setState(315);
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
		public List<TerminalNode> Async() { return getTokens(QParser.Async); }
		public TerminalNode Async(int i) {
			return getToken(QParser.Async, i);
		}
		public List<TerminalNode> Native() { return getTokens(QParser.Native); }
		public TerminalNode Native(int i) {
			return getToken(QParser.Native, i);
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
		enterRule(_localctx, 40, RULE_functionDecl);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(317);
					_la = _input.LA(1);
					if ( !(_la==Async || _la==Native) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(322);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			setState(323);
			match(Def);
			setState(324);
			match(Identifier);
			setState(325);
			match(OParen);
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(326);
				idList();
				}
			}

			setState(329);
			match(CParen);
			setState(330);
			block();
			setState(331);
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
		enterRule(_localctx, 42, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(For);
			setState(334);
			match(OParen);
			setState(335);
			match(Identifier);
			setState(336);
			match(Assign);
			setState(337);
			expression(0);
			setState(338);
			match(To);
			setState(339);
			expression(0);
			setState(340);
			match(CParen);
			setState(341);
			block();
			setState(342);
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
		enterRule(_localctx, 44, RULE_forInStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			match(For);
			setState(345);
			match(OParen);
			setState(346);
			match(Identifier);
			setState(347);
			match(In);
			setState(348);
			match(T__8);
			setState(349);
			match(OParen);
			setState(350);
			expression(0);
			setState(351);
			match(CParen);
			setState(352);
			match(CParen);
			setState(353);
			block();
			setState(354);
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
		enterRule(_localctx, 46, RULE_importStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(T__9);
			setState(357);
			match(Import);
			setState(358);
			match(Identifier);
			setState(363);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(359);
					match(T__10);
					setState(360);
					match(Identifier);
					}
					} 
				}
				setState(365);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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
		public TerminalNode OParen() { return getToken(QParser.OParen, 0); }
		public TerminalNode CParen() { return getToken(QParser.CParen, 0); }
		public TerminalNode Subtract() { return getToken(QParser.Subtract, 0); }
		public TerminalNode GT() { return getToken(QParser.GT, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode End() { return getToken(QParser.End, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
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
		enterRule(_localctx, 48, RULE_anonymousFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(Def);
			setState(367);
			match(OParen);
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & ((1L << (T__18 - 19)) | (1L << (Println - 19)) | (1L << (Print - 19)) | (1L << (Input - 19)) | (1L << (Assert - 19)) | (1L << (Def - 19)) | (1L << (ToInt - 19)) | (1L << (Null - 19)) | (1L << (Self - 19)) | (1L << (Excl - 19)) | (1L << (Subtract - 19)) | (1L << (OBracket - 19)) | (1L << (OParen - 19)) | (1L << (Bool - 19)) | (1L << (Number - 19)) | (1L << (Identifier - 19)) | (1L << (String - 19)))) != 0)) {
				{
				setState(368);
				exprList();
				}
			}

			setState(371);
			match(CParen);
			setState(372);
			match(Subtract);
			setState(373);
			match(GT);
			setState(374);
			block();
			setState(375);
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
		enterRule(_localctx, 50, RULE_importFromGithubStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			match(T__9);
			setState(378);
			match(Import);
			setState(379);
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

	public static class ImportAllStatementContext extends ParserRuleContext {
		public TerminalNode Import() { return getToken(QParser.Import, 0); }
		public TerminalNode OBracket() { return getToken(QParser.OBracket, 0); }
		public TerminalNode Multiply() { return getToken(QParser.Multiply, 0); }
		public TerminalNode CBracket() { return getToken(QParser.CBracket, 0); }
		public ImportAllStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importAllStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterImportAllStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitImportAllStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitImportAllStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportAllStatementContext importAllStatement() throws RecognitionException {
		ImportAllStatementContext _localctx = new ImportAllStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_importAllStatement);
		try {
			setState(391);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(381);
				match(T__9);
				setState(382);
				match(Import);
				setState(383);
				match(OBracket);
				setState(384);
				match(Multiply);
				setState(385);
				match(CBracket);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(386);
				match(T__9);
				setState(387);
				match(Import);
				setState(388);
				match(OBracket);
				setState(389);
				match(T__11);
				setState(390);
				match(CBracket);
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

	public static class AtStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(QParser.Identifier, 0); }
		public AtStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterAtStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitAtStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitAtStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtStatementContext atStatement() throws RecognitionException {
		AtStatementContext _localctx = new AtStatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_atStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			match(T__0);
			setState(394);
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

	public static class TryCatchStatementContext extends ParserRuleContext {
		public TerminalNode Try() { return getToken(QParser.Try, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode OParen() { return getToken(QParser.OParen, 0); }
		public TerminalNode CParen() { return getToken(QParser.CParen, 0); }
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
			setState(396);
			match(Try);
			setState(397);
			block();
			setState(398);
			match(T__12);
			setState(399);
			match(OParen);
			setState(400);
			match(T__13);
			setState(401);
			match(CParen);
			setState(402);
			block();
			setState(403);
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
			setState(405);
			match(While);
			setState(406);
			match(OParen);
			setState(407);
			expression(0);
			setState(408);
			match(CParen);
			setState(409);
			block();
			setState(410);
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
		public TerminalNode Accessor() { return getToken(QParser.Accessor, 0); }
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
			setState(412);
			match(Identifier);
			setState(413);
			match(Accessor);
			setState(414);
			match(T__14);
			setState(415);
			match(OParen);
			setState(416);
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
		public TerminalNode Accessor() { return getToken(QParser.Accessor, 0); }
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
			setState(418);
			match(Identifier);
			setState(419);
			match(Accessor);
			setState(420);
			match(T__15);
			setState(421);
			match(OParen);
			setState(422);
			expression(0);
			setState(423);
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
		public TerminalNode Accessor() { return getToken(QParser.Accessor, 0); }
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
			setState(425);
			match(Identifier);
			setState(426);
			match(Accessor);
			setState(427);
			match(T__16);
			setState(428);
			match(OParen);
			setState(429);
			expression(0);
			setState(430);
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
			setState(432);
			match(T__17);
			setState(433);
			block();
			setState(434);
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
			setState(436);
			match(Identifier);
			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(437);
				match(Comma);
				setState(438);
				match(Identifier);
				}
				}
				setState(443);
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
		public List<TerminalNode> Identifier() { return getTokens(QParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(QParser.Identifier, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode End() { return getToken(QParser.End, 0); }
		public TerminalNode Colon() { return getToken(QParser.Colon, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			match(Class);
			setState(445);
			match(Identifier);
			setState(448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(446);
				match(Colon);
				setState(447);
				match(Identifier);
				}
			}

			setState(450);
			block();
			setState(451);
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
			setState(453);
			expression(0);
			setState(458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(454);
				match(Comma);
				setState(455);
				expression(0);
				}
				}
				setState(460);
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
	public static class AnonymousFunctionExpressionContext extends ExpressionContext {
		public AnonymousFunctionContext anonymousFunction() {
			return getRuleContext(AnonymousFunctionContext.class,0);
		}
		public AnonymousFunctionExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterAnonymousFunctionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitAnonymousFunctionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitAnonymousFunctionExpression(this);
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
	public static class ObjVarExpressionContext extends ExpressionContext {
		public ObjVarContext objVar() {
			return getRuleContext(ObjVarContext.class,0);
		}
		public ObjVarExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterObjVarExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitObjVarExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitObjVarExpression(this);
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
	public static class HereVarExpressionContext extends ExpressionContext {
		public VarHereStatementContext varHereStatement() {
			return getRuleContext(VarHereStatementContext.class,0);
		}
		public HereVarExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterHereVarExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitHereVarExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitHereVarExpression(this);
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
	public static class SelfExpressionContext extends ExpressionContext {
		public VarHereStatementContext varHereStatement() {
			return getRuleContext(VarHereStatementContext.class,0);
		}
		public SelfExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterSelfExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitSelfExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitSelfExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RandomExpressionContext extends ExpressionContext {
		public TerminalNode OParen() { return getToken(QParser.OParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CParen() { return getToken(QParser.CParen, 0); }
		public RandomExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterRandomExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitRandomExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitRandomExpression(this);
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
			setState(506);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryMinusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(462);
				match(Subtract);
				setState(463);
				expression(25);
				}
				break;
			case 2:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(464);
				match(Excl);
				setState(465);
				expression(24);
				}
				break;
			case 3:
				{
				_localctx = new NumberExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(466);
				match(Number);
				}
				break;
			case 4:
				{
				_localctx = new BoolExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(467);
				match(Bool);
				}
				break;
			case 5:
				{
				_localctx = new NullExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(468);
				match(Null);
				}
				break;
			case 6:
				{
				_localctx = new FunctionCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(469);
				functionCall();
				setState(471);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(470);
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
				setState(473);
				list();
				setState(475);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(474);
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
				setState(477);
				match(Identifier);
				setState(479);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(478);
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
				setState(481);
				match(String);
				setState(483);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(482);
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
				setState(485);
				match(OParen);
				setState(486);
				expression(0);
				setState(487);
				match(CParen);
				setState(489);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(488);
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
				setState(491);
				match(Input);
				setState(492);
				match(OParen);
				setState(494);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==String) {
					{
					setState(493);
					match(String);
					}
				}

				setState(496);
				match(CParen);
				}
				break;
			case 12:
				{
				_localctx = new HereVarExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(497);
				varHereStatement();
				}
				break;
			case 13:
				{
				_localctx = new RandomExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(498);
				match(T__18);
				setState(499);
				match(OParen);
				setState(500);
				expression(0);
				setState(501);
				match(CParen);
				}
				break;
			case 14:
				{
				_localctx = new AnonymousFunctionExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(503);
				anonymousFunction();
				}
				break;
			case 15:
				{
				_localctx = new SelfExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(504);
				varHereStatement();
				}
				break;
			case 16:
				{
				_localctx = new ObjVarExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(505);
				objVar();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(540);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(538);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
					case 1:
						{
						_localctx = new PowerExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(508);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(509);
						match(Pow);
						setState(510);
						expression(23);
						}
						break;
					case 2:
						{
						_localctx = new MultExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(511);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(512);
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
						setState(513);
						expression(23);
						}
						break;
					case 3:
						{
						_localctx = new AddExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(514);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(515);
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
						setState(516);
						expression(22);
						}
						break;
					case 4:
						{
						_localctx = new CompExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(517);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(518);
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
						setState(519);
						expression(21);
						}
						break;
					case 5:
						{
						_localctx = new EqExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(520);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(521);
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
						setState(522);
						expression(20);
						}
						break;
					case 6:
						{
						_localctx = new AndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(523);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(524);
						match(And);
						setState(525);
						expression(19);
						}
						break;
					case 7:
						{
						_localctx = new OrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(526);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(527);
						match(Or);
						setState(528);
						expression(18);
						}
						break;
					case 8:
						{
						_localctx = new TernaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(529);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(530);
						match(QMark);
						setState(531);
						expression(0);
						setState(532);
						match(Colon);
						setState(533);
						expression(17);
						}
						break;
					case 9:
						{
						_localctx = new InExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(535);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(536);
						match(In);
						setState(537);
						expression(16);
						}
						break;
					}
					} 
				}
				setState(542);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
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
			setState(543);
			match(OBracket);
			setState(545);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & ((1L << (T__18 - 19)) | (1L << (Println - 19)) | (1L << (Print - 19)) | (1L << (Input - 19)) | (1L << (Assert - 19)) | (1L << (Def - 19)) | (1L << (ToInt - 19)) | (1L << (Null - 19)) | (1L << (Self - 19)) | (1L << (Excl - 19)) | (1L << (Subtract - 19)) | (1L << (OBracket - 19)) | (1L << (OParen - 19)) | (1L << (Bool - 19)) | (1L << (Number - 19)) | (1L << (Identifier - 19)) | (1L << (String - 19)))) != 0)) {
				{
				setState(544);
				exprList();
				}
			}

			setState(547);
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

	public static class ObjVarContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(QParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(QParser.Identifier, i);
		}
		public TerminalNode Accessor() { return getToken(QParser.Accessor, 0); }
		public ObjVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterObjVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitObjVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitObjVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjVarContext objVar() throws RecognitionException {
		ObjVarContext _localctx = new ObjVarContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_objVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			match(Identifier);
			setState(550);
			match(Accessor);
			setState(551);
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
		enterRule(_localctx, 80, RULE_indexes);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(557); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(553);
					match(OBracket);
					setState(554);
					expression(0);
					setState(555);
					match(CBracket);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(559); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
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
			return precpred(_ctx, 23);
		case 1:
			return precpred(_ctx, 22);
		case 2:
			return precpred(_ctx, 21);
		case 3:
			return precpred(_ctx, 20);
		case 4:
			return precpred(_ctx, 19);
		case 5:
			return precpred(_ctx, 18);
		case 6:
			return precpred(_ctx, 17);
		case 7:
			return precpred(_ctx, 16);
		case 8:
			return precpred(_ctx, 15);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3O\u0234\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\5\2"+
		"V\n\2\3\2\3\2\3\2\7\2[\n\2\f\2\16\2^\13\2\3\2\3\2\3\2\3\3\3\3\7\3e\n\3"+
		"\f\3\16\3h\13\3\3\3\3\3\3\3\3\3\5\3n\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u008f\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u009f\n\4\3\5\3\5\5\5\u00a3\n\5\3\5\5\5\u00a6"+
		"\n\5\3\5\3\5\3\5\3\6\7\6\u00ac\n\6\f\6\16\6\u00af\13\6\3\6\3\6\3\6\5\6"+
		"\u00b4\n\6\3\6\3\6\5\6\u00b8\n\6\3\7\3\7\3\7\5\7\u00bd\n\7\3\7\3\7\3\7"+
		"\3\7\5\7\u00c3\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00da\n\7\3\7\5\7\u00dd\n\7\3\b\3"+
		"\b\3\b\5\b\u00e2\n\b\3\t\3\t\3\t\3\t\3\t\5\t\u00e9\n\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\7\13\u00f3\n\13\f\13\16\13\u00f6\13\13\3\13\5\13\u00f9"+
		"\n\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\5"+
		"\20\u0118\n\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21"+
		"\u0124\n\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\5\22\u012d\n\22\3\22\3"+
		"\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3"+
		"\25\3\25\3\26\7\26\u0141\n\26\f\26\16\26\u0144\13\26\3\26\3\26\3\26\3"+
		"\26\5\26\u014a\n\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\7\31\u016c\n\31\f\31\16\31\u016f"+
		"\13\31\3\32\3\32\3\32\5\32\u0174\n\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5"+
		"\34\u018a\n\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3"+
		"!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\7$\u01ba\n"+
		"$\f$\16$\u01bd\13$\3%\3%\3%\3%\5%\u01c3\n%\3%\3%\3%\3&\3&\3&\7&\u01cb"+
		"\n&\f&\16&\u01ce\13&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u01da"+
		"\n\'\3\'\3\'\5\'\u01de\n\'\3\'\3\'\5\'\u01e2\n\'\3\'\3\'\5\'\u01e6\n\'"+
		"\3\'\3\'\3\'\3\'\5\'\u01ec\n\'\3\'\3\'\3\'\5\'\u01f1\n\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u01fd\n\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\7\'\u021d\n\'\f\'\16\'\u0220\13\'\3(\3(\5(\u0224"+
		"\n(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3*\6*\u0230\n*\r*\16*\u0231\3*\6\\\u00ad"+
		"\u0142\u016d\3L+\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@BDFHJLNPR\2\b\3\2+,\4\2\27\27..\3\2<>\3\2:;\4\2\64\6589\3\2"+
		"\62\63\2\u0262\2U\3\2\2\2\4f\3\2\2\2\6\u009e\3\2\2\2\b\u00a2\3\2\2\2\n"+
		"\u00ad\3\2\2\2\f\u00dc\3\2\2\2\16\u00e1\3\2\2\2\20\u00e3\3\2\2\2\22\u00ec"+
		"\3\2\2\2\24\u00f0\3\2\2\2\26\u00fc\3\2\2\2\30\u0102\3\2\2\2\32\u0108\3"+
		"\2\2\2\34\u010c\3\2\2\2\36\u0113\3\2\2\2 \u011d\3\2\2\2\"\u0127\3\2\2"+
		"\2$\u0130\3\2\2\2&\u0137\3\2\2\2(\u013c\3\2\2\2*\u0142\3\2\2\2,\u014f"+
		"\3\2\2\2.\u015a\3\2\2\2\60\u0166\3\2\2\2\62\u0170\3\2\2\2\64\u017b\3\2"+
		"\2\2\66\u0189\3\2\2\28\u018b\3\2\2\2:\u018e\3\2\2\2<\u0197\3\2\2\2>\u019e"+
		"\3\2\2\2@\u01a4\3\2\2\2B\u01ab\3\2\2\2D\u01b2\3\2\2\2F\u01b6\3\2\2\2H"+
		"\u01be\3\2\2\2J\u01c7\3\2\2\2L\u01fc\3\2\2\2N\u0221\3\2\2\2P\u0227\3\2"+
		"\2\2R\u022f\3\2\2\2TV\5\22\n\2UT\3\2\2\2UV\3\2\2\2V\\\3\2\2\2WX\5\16\b"+
		"\2XY\7E\2\2Y[\3\2\2\2ZW\3\2\2\2[^\3\2\2\2\\]\3\2\2\2\\Z\3\2\2\2]_\3\2"+
		"\2\2^\\\3\2\2\2_`\5\4\3\2`a\7\2\2\3a\3\3\2\2\2be\5\6\4\2ce\5*\26\2db\3"+
		"\2\2\2dc\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gm\3\2\2\2hf\3\2\2\2ij\7"+
		"!\2\2jk\5L\'\2kl\7E\2\2ln\3\2\2\2mi\3\2\2\2mn\3\2\2\2n\5\3\2\2\2op\5\f"+
		"\7\2pq\7E\2\2q\u009f\3\2\2\2r\u009f\5\24\13\2s\u009f\5,\27\2t\u009f\5"+
		".\30\2u\u009f\5<\37\2v\u009f\5:\36\2w\u009f\5D#\2xy\5B\"\2yz\7E\2\2z\u009f"+
		"\3\2\2\2{|\5\b\5\2|}\7E\2\2}\u009f\3\2\2\2~\u009f\5H%\2\177\u009f\5\36"+
		"\20\2\u0080\u0081\5@!\2\u0081\u0082\7E\2\2\u0082\u009f\3\2\2\2\u0083\u0084"+
		"\5> \2\u0084\u0085\7E\2\2\u0085\u009f\3\2\2\2\u0086\u0087\5$\23\2\u0087"+
		"\u0088\7E\2\2\u0088\u009f\3\2\2\2\u0089\u008a\5&\24\2\u008a\u008b\7E\2"+
		"\2\u008b\u009f\3\2\2\2\u008c\u008e\5\20\t\2\u008d\u008f\7E\2\2\u008e\u008d"+
		"\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u009f\3\2\2\2\u0090\u0091\5 \21\2\u0091"+
		"\u0092\7E\2\2\u0092\u009f\3\2\2\2\u0093\u0094\5\"\22\2\u0094\u0095\7E"+
		"\2\2\u0095\u009f\3\2\2\2\u0096\u009f\5\62\32\2\u0097\u0098\5\30\r\2\u0098"+
		"\u0099\7E\2\2\u0099\u009f\3\2\2\2\u009a\u009b\5\n\6\2\u009b\u009c\7E\2"+
		"\2\u009c\u009f\3\2\2\2\u009d\u009f\58\35\2\u009eo\3\2\2\2\u009er\3\2\2"+
		"\2\u009es\3\2\2\2\u009et\3\2\2\2\u009eu\3\2\2\2\u009ev\3\2\2\2\u009ew"+
		"\3\2\2\2\u009ex\3\2\2\2\u009e{\3\2\2\2\u009e~\3\2\2\2\u009e\177\3\2\2"+
		"\2\u009e\u0080\3\2\2\2\u009e\u0083\3\2\2\2\u009e\u0086\3\2\2\2\u009e\u0089"+
		"\3\2\2\2\u009e\u008c\3\2\2\2\u009e\u0090\3\2\2\2\u009e\u0093\3\2\2\2\u009e"+
		"\u0096\3\2\2\2\u009e\u0097\3\2\2\2\u009e\u009a\3\2\2\2\u009e\u009d\3\2"+
		"\2\2\u009f\7\3\2\2\2\u00a0\u00a3\7L\2\2\u00a1\u00a3\5P)\2\u00a2\u00a0"+
		"\3\2\2\2\u00a2\u00a1\3\2\2\2\u00a3\u00a5\3\2\2\2\u00a4\u00a6\5R*\2\u00a5"+
		"\u00a4\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\7F"+
		"\2\2\u00a8\u00a9\5L\'\2\u00a9\t\3\2\2\2\u00aa\u00ac\t\2\2\2\u00ab\u00aa"+
		"\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae"+
		"\u00b0\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b1\7\30\2\2\u00b1\u00b7\7"+
		"L\2\2\u00b2\u00b4\5R*\2\u00b3\u00b2\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5\u00b6\7F\2\2\u00b6\u00b8\5L\'\2\u00b7\u00b3\3\2\2"+
		"\2\u00b7\u00b8\3\2\2\2\u00b8\13\3\2\2\2\u00b9\u00ba\7L\2\2\u00ba\u00bc"+
		"\7C\2\2\u00bb\u00bd\5J&\2\u00bc\u00bb\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd"+
		"\u00be\3\2\2\2\u00be\u00dd\7D\2\2\u00bf\u00c0\7\26\2\2\u00c0\u00c2\7C"+
		"\2\2\u00c1\u00c3\5L\'\2\u00c2\u00c1\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3"+
		"\u00c4\3\2\2\2\u00c4\u00dd\7D\2\2\u00c5\u00c6\7\32\2\2\u00c6\u00c7\7C"+
		"\2\2\u00c7\u00c8\5L\'\2\u00c8\u00c9\7D\2\2\u00c9\u00dd\3\2\2\2\u00ca\u00cb"+
		"\7\34\2\2\u00cb\u00cc\7C\2\2\u00cc\u00cd\5L\'\2\u00cd\u00ce\7D\2\2\u00ce"+
		"\u00dd\3\2\2\2\u00cf\u00d0\7\36\2\2\u00d0\u00d1\7C\2\2\u00d1\u00d2\5L"+
		"\'\2\u00d2\u00d3\7D\2\2\u00d3\u00dd\3\2\2\2\u00d4\u00d5\7L\2\2\u00d5\u00d6"+
		"\7\60\2\2\u00d6\u00d7\7L\2\2\u00d7\u00d9\7C\2\2\u00d8\u00da\5J&\2\u00d9"+
		"\u00d8\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dd\7D"+
		"\2\2\u00dc\u00b9\3\2\2\2\u00dc\u00bf\3\2\2\2\u00dc\u00c5\3\2\2\2\u00dc"+
		"\u00ca\3\2\2\2\u00dc\u00cf\3\2\2\2\u00dc\u00d4\3\2\2\2\u00dd\r\3\2\2\2"+
		"\u00de\u00e2\5\60\31\2\u00df\u00e2\5\64\33\2\u00e0\u00e2\5\66\34\2\u00e1"+
		"\u00de\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e0\3\2\2\2\u00e2\17\3\2\2"+
		"\2\u00e3\u00e4\7L\2\2\u00e4\u00e5\7\60\2\2\u00e5\u00e6\7L\2\2\u00e6\u00e8"+
		"\7C\2\2\u00e7\u00e9\5J&\2\u00e8\u00e7\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9"+
		"\u00ea\3\2\2\2\u00ea\u00eb\7D\2\2\u00eb\21\3\2\2\2\u00ec\u00ed\7\3\2\2"+
		"\u00ed\u00ee\7\4\2\2\u00ee\u00ef\7L\2\2\u00ef\23\3\2\2\2\u00f0\u00f4\5"+
		"\26\f\2\u00f1\u00f3\5\34\17\2\u00f2\u00f1\3\2\2\2\u00f3\u00f6\3\2\2\2"+
		"\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4"+
		"\3\2\2\2\u00f7\u00f9\5(\25\2\u00f8\u00f7\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9"+
		"\u00fa\3\2\2\2\u00fa\u00fb\7&\2\2\u00fb\25\3\2\2\2\u00fc\u00fd\7\37\2"+
		"\2\u00fd\u00fe\7C\2\2\u00fe\u00ff\5L\'\2\u00ff\u0100\7D\2\2\u0100\u0101"+
		"\5\4\3\2\u0101\27\3\2\2\2\u0102\u0103\7-\2\2\u0103\u0104\7\60\2\2\u0104"+
		"\u0105\7L\2\2\u0105\u0106\7F\2\2\u0106\u0107\5L\'\2\u0107\31\3\2\2\2\u0108"+
		"\u0109\7-\2\2\u0109\u010a\7\60\2\2\u010a\u010b\7L\2\2\u010b\33\3\2\2\2"+
		"\u010c\u010d\7 \2\2\u010d\u010e\7\37\2\2\u010e\u010f\7C\2\2\u010f\u0110"+
		"\5L\'\2\u0110\u0111\7D\2\2\u0111\u0112\5\4\3\2\u0112\35\3\2\2\2\u0113"+
		"\u0114\7\5\2\2\u0114\u0115\7L\2\2\u0115\u0117\7C\2\2\u0116\u0118\5J&\2"+
		"\u0117\u0116\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a"+
		"\7D\2\2\u011a\u011b\5\4\3\2\u011b\u011c\7&\2\2\u011c\37\3\2\2\2\u011d"+
		"\u011e\7\6\2\2\u011e\u011f\7L\2\2\u011f\u0120\7\7\2\2\u0120\u0121\7L\2"+
		"\2\u0121\u0123\7C\2\2\u0122\u0124\5J&\2\u0123\u0122\3\2\2\2\u0123\u0124"+
		"\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126\7D\2\2\u0126!\3\2\2\2\u0127\u0128"+
		"\7\b\2\2\u0128\u0129\7\60\2\2\u0129\u012a\7L\2\2\u012a\u012c\7C\2\2\u012b"+
		"\u012d\5L\'\2\u012c\u012b\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012e\3\2"+
		"\2\2\u012e\u012f\7D\2\2\u012f#\3\2\2\2\u0130\u0131\7L\2\2\u0131\u0132"+
		"\7\60\2\2\u0132\u0133\7\t\2\2\u0133\u0134\7C\2\2\u0134\u0135\5L\'\2\u0135"+
		"\u0136\7D\2\2\u0136%\3\2\2\2\u0137\u0138\7\n\2\2\u0138\u0139\7C\2\2\u0139"+
		"\u013a\5L\'\2\u013a\u013b\7D\2\2\u013b\'\3\2\2\2\u013c\u013d\7 \2\2\u013d"+
		"\u013e\5\4\3\2\u013e)\3\2\2\2\u013f\u0141\t\3\2\2\u0140\u013f\3\2\2\2"+
		"\u0141\u0144\3\2\2\2\u0142\u0143\3\2\2\2\u0142\u0140\3\2\2\2\u0143\u0145"+
		"\3\2\2\2\u0144\u0142\3\2\2\2\u0145\u0146\7\35\2\2\u0146\u0147\7L\2\2\u0147"+
		"\u0149\7C\2\2\u0148\u014a\5F$\2\u0149\u0148\3\2\2\2\u0149\u014a\3\2\2"+
		"\2\u014a\u014b\3\2\2\2\u014b\u014c\7D\2\2\u014c\u014d\5\4\3\2\u014d\u014e"+
		"\7&\2\2\u014e+\3\2\2\2\u014f\u0150\7\"\2\2\u0150\u0151\7C\2\2\u0151\u0152"+
		"\7L\2\2\u0152\u0153\7F\2\2\u0153\u0154\5L\'\2\u0154\u0155\7$\2\2\u0155"+
		"\u0156\5L\'\2\u0156\u0157\7D\2\2\u0157\u0158\5\4\3\2\u0158\u0159\7&\2"+
		"\2\u0159-\3\2\2\2\u015a\u015b\7\"\2\2\u015b\u015c\7C\2\2\u015c\u015d\7"+
		"L\2\2\u015d\u015e\7\'\2\2\u015e\u015f\7\13\2\2\u015f\u0160\7C\2\2\u0160"+
		"\u0161\5L\'\2\u0161\u0162\7D\2\2\u0162\u0163\7D\2\2\u0163\u0164\5\4\3"+
		"\2\u0164\u0165\7&\2\2\u0165/\3\2\2\2\u0166\u0167\7\f\2\2\u0167\u0168\7"+
		"\31\2\2\u0168\u016d\7L\2\2\u0169\u016a\7\r\2\2\u016a\u016c\7L\2\2\u016b"+
		"\u0169\3\2\2\2\u016c\u016f\3\2\2\2\u016d\u016e\3\2\2\2\u016d\u016b\3\2"+
		"\2\2\u016e\61\3\2\2\2\u016f\u016d\3\2\2\2\u0170\u0171\7\35\2\2\u0171\u0173"+
		"\7C\2\2\u0172\u0174\5J&\2\u0173\u0172\3\2\2\2\u0173\u0174\3\2\2\2\u0174"+
		"\u0175\3\2\2\2\u0175\u0176\7D\2\2\u0176\u0177\7;\2\2\u0177\u0178\78\2"+
		"\2\u0178\u0179\5\4\3\2\u0179\u017a\7&\2\2\u017a\63\3\2\2\2\u017b\u017c"+
		"\7\f\2\2\u017c\u017d\7\31\2\2\u017d\u017e\5L\'\2\u017e\65\3\2\2\2\u017f"+
		"\u0180\7\f\2\2\u0180\u0181\7\31\2\2\u0181\u0182\7A\2\2\u0182\u0183\7<"+
		"\2\2\u0183\u018a\7B\2\2\u0184\u0185\7\f\2\2\u0185\u0186\7\31\2\2\u0186"+
		"\u0187\7A\2\2\u0187\u0188\7\16\2\2\u0188\u018a\7B\2\2\u0189\u017f\3\2"+
		"\2\2\u0189\u0184\3\2\2\2\u018a\67\3\2\2\2\u018b\u018c\7\3\2\2\u018c\u018d"+
		"\7L\2\2\u018d9\3\2\2\2\u018e\u018f\7)\2\2\u018f\u0190\5\4\3\2\u0190\u0191"+
		"\7\17\2\2\u0191\u0192\7C\2\2\u0192\u0193\7\20\2\2\u0193\u0194\7D\2\2\u0194"+
		"\u0195\5\4\3\2\u0195\u0196\7&\2\2\u0196;\3\2\2\2\u0197\u0198\7#\2\2\u0198"+
		"\u0199\7C\2\2\u0199\u019a\5L\'\2\u019a\u019b\7D\2\2\u019b\u019c\5\4\3"+
		"\2\u019c\u019d\7&\2\2\u019d=\3\2\2\2\u019e\u019f\7L\2\2\u019f\u01a0\7"+
		"\60\2\2\u01a0\u01a1\7\21\2\2\u01a1\u01a2\7C\2\2\u01a2\u01a3\7D\2\2\u01a3"+
		"?\3\2\2\2\u01a4\u01a5\7L\2\2\u01a5\u01a6\7\60\2\2\u01a6\u01a7\7\22\2\2"+
		"\u01a7\u01a8\7C\2\2\u01a8\u01a9\5L\'\2\u01a9\u01aa\7D\2\2\u01aaA\3\2\2"+
		"\2\u01ab\u01ac\7L\2\2\u01ac\u01ad\7\60\2\2\u01ad\u01ae\7\23\2\2\u01ae"+
		"\u01af\7C\2\2\u01af\u01b0\5L\'\2\u01b0\u01b1\7D\2\2\u01b1C\3\2\2\2\u01b2"+
		"\u01b3\7\24\2\2\u01b3\u01b4\5\4\3\2\u01b4\u01b5\7&\2\2\u01b5E\3\2\2\2"+
		"\u01b6\u01bb\7L\2\2\u01b7\u01b8\7G\2\2\u01b8\u01ba\7L\2\2\u01b9\u01b7"+
		"\3\2\2\2\u01ba\u01bd\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc"+
		"G\3\2\2\2\u01bd\u01bb\3\2\2\2\u01be\u01bf\7*\2\2\u01bf\u01c2\7L\2\2\u01c0"+
		"\u01c1\7I\2\2\u01c1\u01c3\7L\2\2\u01c2\u01c0\3\2\2\2\u01c2\u01c3\3\2\2"+
		"\2\u01c3\u01c4\3\2\2\2\u01c4\u01c5\5\4\3\2\u01c5\u01c6\7&\2\2\u01c6I\3"+
		"\2\2\2\u01c7\u01cc\5L\'\2\u01c8\u01c9\7G\2\2\u01c9\u01cb\5L\'\2\u01ca"+
		"\u01c8\3\2\2\2\u01cb\u01ce\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cc\u01cd\3\2"+
		"\2\2\u01cdK\3\2\2\2\u01ce\u01cc\3\2\2\2\u01cf\u01d0\b\'\1\2\u01d0\u01d1"+
		"\7;\2\2\u01d1\u01fd\5L\'\33\u01d2\u01d3\7\67\2\2\u01d3\u01fd\5L\'\32\u01d4"+
		"\u01fd\7K\2\2\u01d5\u01fd\7J\2\2\u01d6\u01fd\7(\2\2\u01d7\u01d9\5\f\7"+
		"\2\u01d8\u01da\5R*\2\u01d9\u01d8\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01fd"+
		"\3\2\2\2\u01db\u01dd\5N(\2\u01dc\u01de\5R*\2\u01dd\u01dc\3\2\2\2\u01dd"+
		"\u01de\3\2\2\2\u01de\u01fd\3\2\2\2\u01df\u01e1\7L\2\2\u01e0\u01e2\5R*"+
		"\2\u01e1\u01e0\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01fd\3\2\2\2\u01e3\u01e5"+
		"\7M\2\2\u01e4\u01e6\5R*\2\u01e5\u01e4\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6"+
		"\u01fd\3\2\2\2\u01e7\u01e8\7C\2\2\u01e8\u01e9\5L\'\2\u01e9\u01eb\7D\2"+
		"\2\u01ea\u01ec\5R*\2\u01eb\u01ea\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01fd"+
		"\3\2\2\2\u01ed\u01ee\7\33\2\2\u01ee\u01f0\7C\2\2\u01ef\u01f1\7M\2\2\u01f0"+
		"\u01ef\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01fd\7D"+
		"\2\2\u01f3\u01fd\5\32\16\2\u01f4\u01f5\7\25\2\2\u01f5\u01f6\7C\2\2\u01f6"+
		"\u01f7\5L\'\2\u01f7\u01f8\7D\2\2\u01f8\u01fd\3\2\2\2\u01f9\u01fd\5\62"+
		"\32\2\u01fa\u01fd\5\32\16\2\u01fb\u01fd\5P)\2\u01fc\u01cf\3\2\2\2\u01fc"+
		"\u01d2\3\2\2\2\u01fc\u01d4\3\2\2\2\u01fc\u01d5\3\2\2\2\u01fc\u01d6\3\2"+
		"\2\2\u01fc\u01d7\3\2\2\2\u01fc\u01db\3\2\2\2\u01fc\u01df\3\2\2\2\u01fc"+
		"\u01e3\3\2\2\2\u01fc\u01e7\3\2\2\2\u01fc\u01ed\3\2\2\2\u01fc\u01f3\3\2"+
		"\2\2\u01fc\u01f4\3\2\2\2\u01fc\u01f9\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fc"+
		"\u01fb\3\2\2\2\u01fd\u021e\3\2\2\2\u01fe\u01ff\f\31\2\2\u01ff\u0200\7"+
		"\66\2\2\u0200\u021d\5L\'\31\u0201\u0202\f\30\2\2\u0202\u0203\t\4\2\2\u0203"+
		"\u021d\5L\'\31\u0204\u0205\f\27\2\2\u0205\u0206\t\5\2\2\u0206\u021d\5"+
		"L\'\30\u0207\u0208\f\26\2\2\u0208\u0209\t\6\2\2\u0209\u021d\5L\'\27\u020a"+
		"\u020b\f\25\2\2\u020b\u020c\t\7\2\2\u020c\u021d\5L\'\26\u020d\u020e\f"+
		"\24\2\2\u020e\u020f\7\61\2\2\u020f\u021d\5L\'\25\u0210\u0211\f\23\2\2"+
		"\u0211\u0212\7/\2\2\u0212\u021d\5L\'\24\u0213\u0214\f\22\2\2\u0214\u0215"+
		"\7H\2\2\u0215\u0216\5L\'\2\u0216\u0217\7I\2\2\u0217\u0218\5L\'\23\u0218"+
		"\u021d\3\2\2\2\u0219\u021a\f\21\2\2\u021a\u021b\7\'\2\2\u021b\u021d\5"+
		"L\'\22\u021c\u01fe\3\2\2\2\u021c\u0201\3\2\2\2\u021c\u0204\3\2\2\2\u021c"+
		"\u0207\3\2\2\2\u021c\u020a\3\2\2\2\u021c\u020d\3\2\2\2\u021c\u0210\3\2"+
		"\2\2\u021c\u0213\3\2\2\2\u021c\u0219\3\2\2\2\u021d\u0220\3\2\2\2\u021e"+
		"\u021c\3\2\2\2\u021e\u021f\3\2\2\2\u021fM\3\2\2\2\u0220\u021e\3\2\2\2"+
		"\u0221\u0223\7A\2\2\u0222\u0224\5J&\2\u0223\u0222\3\2\2\2\u0223\u0224"+
		"\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0226\7B\2\2\u0226O\3\2\2\2\u0227\u0228"+
		"\7L\2\2\u0228\u0229\7\60\2\2\u0229\u022a\7L\2\2\u022aQ\3\2\2\2\u022b\u022c"+
		"\7A\2\2\u022c\u022d\5L\'\2\u022d\u022e\7B\2\2\u022e\u0230\3\2\2\2\u022f"+
		"\u022b\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u022f\3\2\2\2\u0231\u0232\3\2"+
		"\2\2\u0232S\3\2\2\2,U\\dfm\u008e\u009e\u00a2\u00a5\u00ad\u00b3\u00b7\u00bc"+
		"\u00c2\u00d9\u00dc\u00e1\u00e8\u00f4\u00f8\u0117\u0123\u012c\u0142\u0149"+
		"\u016d\u0173\u0189\u01bb\u01c2\u01cc\u01d9\u01dd\u01e1\u01e5\u01eb\u01f0"+
		"\u01fc\u021c\u021e\u0223\u0231";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}