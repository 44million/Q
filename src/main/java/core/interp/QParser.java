// Generated from C:/Users/Bosque/Documents/GitHub/xxl/src/main/java/core/etc\Q.g4 by ANTLR 4.9.2
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
		RULE_newAt = 8, RULE_header = 9, RULE_ifStatement = 10, RULE_ifStat = 11, 
		RULE_hereStatement = 12, RULE_varHereStatement = 13, RULE_elseIfStat = 14, 
		RULE_constructorStatement = 15, RULE_objCreateStatement = 16, RULE_osExecStatement = 17, 
		RULE_fileWriteStatement = 18, RULE_verifyFileStatement = 19, RULE_elseStat = 20, 
		RULE_functionDecl = 21, RULE_forStatement = 22, RULE_forInStatement = 23, 
		RULE_importStatement = 24, RULE_anonymousFunction = 25, RULE_importFromGithubStatement = 26, 
		RULE_importAllStatement = 27, RULE_atStatement = 28, RULE_tryCatchStatement = 29, 
		RULE_whileStatement = 30, RULE_windowRenderStatement = 31, RULE_windowAddCompStatement = 32, 
		RULE_addWebServerTextStatement = 33, RULE_mainFunctionStatement = 34, 
		RULE_idList = 35, RULE_classStatement = 36, RULE_exprList = 37, RULE_expression = 38, 
		RULE_list = 39, RULE_indexes = 40;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "block", "statement", "reAssignment", "assignment", "functionCall", 
			"allImport", "objFunctionCall", "newAt", "header", "ifStatement", "ifStat", 
			"hereStatement", "varHereStatement", "elseIfStat", "constructorStatement", 
			"objCreateStatement", "osExecStatement", "fileWriteStatement", "verifyFileStatement", 
			"elseStat", "functionDecl", "forStatement", "forInStatement", "importStatement", 
			"anonymousFunction", "importFromGithubStatement", "importAllStatement", 
			"atStatement", "tryCatchStatement", "whileStatement", "windowRenderStatement", 
			"windowAddCompStatement", "addWebServerTextStatement", "mainFunctionStatement", 
			"idList", "classStatement", "exprList", "expression", "list", "indexes"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'new'", "'@'", "'as'", "'header'", "'cn'", "'sys'", "'write'", 
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__7) | (1L << T__17) | (1L << Println) | (1L << Async) | (1L << Var) | (1L << Print) | (1L << Assert) | (1L << Def) | (1L << ToInt) | (1L << If) | (1L << For) | (1L << While) | (1L << Try) | (1L << Class) | (1L << Const) | (1L << Noval) | (1L << Self) | (1L << Native))) != 0) || _la==Identifier) {
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
		enterRule(_localctx, 6, RULE_reAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(Identifier);
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OBracket) {
				{
				setState(159);
				indexes();
				}
			}

			setState(162);
			match(Assign);
			setState(163);
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
			setState(168);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(165);
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
				setState(170);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(171);
			match(Var);
			setState(172);
			match(Identifier);
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OBracket || _la==Assign) {
				{
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OBracket) {
					{
					setState(173);
					indexes();
					}
				}

				setState(176);
				match(Assign);
				setState(177);
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
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new IdentifierFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				match(Identifier);
				setState(181);
				match(OParen);
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & ((1L << (T__18 - 19)) | (1L << (Println - 19)) | (1L << (Print - 19)) | (1L << (Input - 19)) | (1L << (Assert - 19)) | (1L << (Def - 19)) | (1L << (ToInt - 19)) | (1L << (Null - 19)) | (1L << (Self - 19)) | (1L << (Excl - 19)) | (1L << (Subtract - 19)) | (1L << (OBracket - 19)) | (1L << (OParen - 19)) | (1L << (Bool - 19)) | (1L << (Number - 19)) | (1L << (Identifier - 19)) | (1L << (String - 19)))) != 0)) {
					{
					setState(182);
					exprList();
					}
				}

				setState(185);
				match(CParen);
				}
				break;
			case 2:
				_localctx = new PrintlnFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				match(Println);
				setState(187);
				match(OParen);
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & ((1L << (T__18 - 19)) | (1L << (Println - 19)) | (1L << (Print - 19)) | (1L << (Input - 19)) | (1L << (Assert - 19)) | (1L << (Def - 19)) | (1L << (ToInt - 19)) | (1L << (Null - 19)) | (1L << (Self - 19)) | (1L << (Excl - 19)) | (1L << (Subtract - 19)) | (1L << (OBracket - 19)) | (1L << (OParen - 19)) | (1L << (Bool - 19)) | (1L << (Number - 19)) | (1L << (Identifier - 19)) | (1L << (String - 19)))) != 0)) {
					{
					setState(188);
					expression(0);
					}
				}

				setState(191);
				match(CParen);
				}
				break;
			case 3:
				_localctx = new PrintFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(192);
				match(Print);
				setState(193);
				match(OParen);
				setState(194);
				expression(0);
				setState(195);
				match(CParen);
				}
				break;
			case 4:
				_localctx = new AssertFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(197);
				match(Assert);
				setState(198);
				match(OParen);
				setState(199);
				expression(0);
				setState(200);
				match(CParen);
				}
				break;
			case 5:
				_localctx = new ToIntFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(202);
				match(ToInt);
				setState(203);
				match(OParen);
				setState(204);
				expression(0);
				setState(205);
				match(CParen);
				}
				break;
			case 6:
				_localctx = new ObjFunctionCallExpressionContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(207);
				match(Identifier);
				setState(208);
				match(Accessor);
				setState(209);
				match(Identifier);
				setState(210);
				match(OParen);
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & ((1L << (T__18 - 19)) | (1L << (Println - 19)) | (1L << (Print - 19)) | (1L << (Input - 19)) | (1L << (Assert - 19)) | (1L << (Def - 19)) | (1L << (ToInt - 19)) | (1L << (Null - 19)) | (1L << (Self - 19)) | (1L << (Excl - 19)) | (1L << (Subtract - 19)) | (1L << (OBracket - 19)) | (1L << (OParen - 19)) | (1L << (Bool - 19)) | (1L << (Number - 19)) | (1L << (Identifier - 19)) | (1L << (String - 19)))) != 0)) {
					{
					setState(211);
					exprList();
					}
				}

				setState(214);
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
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new FileSystemImportStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				importStatement();
				}
				break;
			case 2:
				_localctx = new GithubImportStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				importFromGithubStatement();
				}
				break;
			case 3:
				_localctx = new ImportAllContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(219);
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
			setState(222);
			match(Identifier);
			setState(223);
			match(Accessor);
			setState(224);
			match(Identifier);
			setState(225);
			match(OParen);
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & ((1L << (T__18 - 19)) | (1L << (Println - 19)) | (1L << (Print - 19)) | (1L << (Input - 19)) | (1L << (Assert - 19)) | (1L << (Def - 19)) | (1L << (ToInt - 19)) | (1L << (Null - 19)) | (1L << (Self - 19)) | (1L << (Excl - 19)) | (1L << (Subtract - 19)) | (1L << (OBracket - 19)) | (1L << (OParen - 19)) | (1L << (Bool - 19)) | (1L << (Number - 19)) | (1L << (Identifier - 19)) | (1L << (String - 19)))) != 0)) {
				{
				setState(226);
				exprList();
				}
			}

			setState(229);
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

	public static class NewAtContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(QParser.Identifier, 0); }
		public TerminalNode OParen() { return getToken(QParser.OParen, 0); }
		public TerminalNode CParen() { return getToken(QParser.CParen, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode End() { return getToken(QParser.End, 0); }
		public NewAtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newAt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterNewAt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitNewAt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitNewAt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewAtContext newAt() throws RecognitionException {
		NewAtContext _localctx = new NewAtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_newAt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(T__0);
			setState(232);
			match(T__1);
			setState(233);
			match(T__2);
			setState(234);
			match(Identifier);
			setState(235);
			match(OParen);
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
		enterRule(_localctx, 18, RULE_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(T__1);
			setState(241);
			match(T__3);
			setState(242);
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
		enterRule(_localctx, 20, RULE_ifStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			ifStat();
			setState(248);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(245);
					elseIfStat();
					}
					} 
				}
				setState(250);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Else) {
				{
				setState(251);
				elseStat();
				}
			}

			setState(254);
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
		enterRule(_localctx, 22, RULE_ifStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(If);
			setState(257);
			match(OParen);
			setState(258);
			expression(0);
			setState(259);
			match(CParen);
			setState(260);
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
		enterRule(_localctx, 24, RULE_hereStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(Self);
			setState(263);
			match(Accessor);
			setState(264);
			match(Identifier);
			setState(265);
			match(Assign);
			setState(266);
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
		enterRule(_localctx, 26, RULE_varHereStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(Self);
			setState(269);
			match(Accessor);
			setState(270);
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
		enterRule(_localctx, 28, RULE_elseIfStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(Else);
			setState(273);
			match(If);
			setState(274);
			match(OParen);
			setState(275);
			expression(0);
			setState(276);
			match(CParen);
			setState(277);
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
		enterRule(_localctx, 30, RULE_constructorStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(T__4);
			setState(280);
			match(Identifier);
			setState(281);
			match(OParen);
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & ((1L << (T__18 - 19)) | (1L << (Println - 19)) | (1L << (Print - 19)) | (1L << (Input - 19)) | (1L << (Assert - 19)) | (1L << (Def - 19)) | (1L << (ToInt - 19)) | (1L << (Null - 19)) | (1L << (Self - 19)) | (1L << (Excl - 19)) | (1L << (Subtract - 19)) | (1L << (OBracket - 19)) | (1L << (OParen - 19)) | (1L << (Bool - 19)) | (1L << (Number - 19)) | (1L << (Identifier - 19)) | (1L << (String - 19)))) != 0)) {
				{
				setState(282);
				exprList();
				}
			}

			setState(285);
			match(CParen);
			setState(286);
			block();
			setState(287);
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
		enterRule(_localctx, 32, RULE_objCreateStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(T__0);
			setState(290);
			match(Identifier);
			setState(291);
			match(T__2);
			setState(292);
			match(Identifier);
			setState(293);
			match(OParen);
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & ((1L << (T__18 - 19)) | (1L << (Println - 19)) | (1L << (Print - 19)) | (1L << (Input - 19)) | (1L << (Assert - 19)) | (1L << (Def - 19)) | (1L << (ToInt - 19)) | (1L << (Null - 19)) | (1L << (Self - 19)) | (1L << (Excl - 19)) | (1L << (Subtract - 19)) | (1L << (OBracket - 19)) | (1L << (OParen - 19)) | (1L << (Bool - 19)) | (1L << (Number - 19)) | (1L << (Identifier - 19)) | (1L << (String - 19)))) != 0)) {
				{
				setState(294);
				exprList();
				}
			}

			setState(297);
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
		enterRule(_localctx, 34, RULE_osExecStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(T__5);
			setState(300);
			match(Accessor);
			setState(301);
			match(Identifier);
			setState(302);
			match(OParen);
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & ((1L << (T__18 - 19)) | (1L << (Println - 19)) | (1L << (Print - 19)) | (1L << (Input - 19)) | (1L << (Assert - 19)) | (1L << (Def - 19)) | (1L << (ToInt - 19)) | (1L << (Null - 19)) | (1L << (Self - 19)) | (1L << (Excl - 19)) | (1L << (Subtract - 19)) | (1L << (OBracket - 19)) | (1L << (OParen - 19)) | (1L << (Bool - 19)) | (1L << (Number - 19)) | (1L << (Identifier - 19)) | (1L << (String - 19)))) != 0)) {
				{
				setState(303);
				expression(0);
				}
			}

			setState(306);
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
		enterRule(_localctx, 36, RULE_fileWriteStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(Identifier);
			setState(309);
			match(Accessor);
			setState(310);
			match(T__6);
			setState(311);
			match(OParen);
			setState(312);
			expression(0);
			setState(313);
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
			setState(315);
			match(T__7);
			setState(316);
			match(OParen);
			setState(317);
			expression(0);
			setState(318);
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
		enterRule(_localctx, 40, RULE_elseStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(Else);
			setState(321);
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
		enterRule(_localctx, 42, RULE_functionDecl);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(323);
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
				setState(328);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(329);
			match(Def);
			setState(330);
			match(Identifier);
			setState(331);
			match(OParen);
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(332);
				idList();
				}
			}

			setState(335);
			match(CParen);
			setState(336);
			block();
			setState(337);
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
		enterRule(_localctx, 44, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			match(For);
			setState(340);
			match(OParen);
			setState(341);
			match(Identifier);
			setState(342);
			match(Assign);
			setState(343);
			expression(0);
			setState(344);
			match(To);
			setState(345);
			expression(0);
			setState(346);
			match(CParen);
			setState(347);
			block();
			setState(348);
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
		enterRule(_localctx, 46, RULE_forInStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			match(For);
			setState(351);
			match(OParen);
			setState(352);
			match(Identifier);
			setState(353);
			match(In);
			setState(354);
			match(T__8);
			setState(355);
			match(OParen);
			setState(356);
			expression(0);
			setState(357);
			match(CParen);
			setState(358);
			match(CParen);
			setState(359);
			block();
			setState(360);
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
		enterRule(_localctx, 48, RULE_importStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			match(T__9);
			setState(363);
			match(Import);
			setState(364);
			match(Identifier);
			setState(369);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(365);
					match(T__10);
					setState(366);
					match(Identifier);
					}
					} 
				}
				setState(371);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
		enterRule(_localctx, 50, RULE_anonymousFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			match(Def);
			setState(373);
			match(OParen);
			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & ((1L << (T__18 - 19)) | (1L << (Println - 19)) | (1L << (Print - 19)) | (1L << (Input - 19)) | (1L << (Assert - 19)) | (1L << (Def - 19)) | (1L << (ToInt - 19)) | (1L << (Null - 19)) | (1L << (Self - 19)) | (1L << (Excl - 19)) | (1L << (Subtract - 19)) | (1L << (OBracket - 19)) | (1L << (OParen - 19)) | (1L << (Bool - 19)) | (1L << (Number - 19)) | (1L << (Identifier - 19)) | (1L << (String - 19)))) != 0)) {
				{
				setState(374);
				exprList();
				}
			}

			setState(377);
			match(CParen);
			setState(378);
			match(Subtract);
			setState(379);
			match(GT);
			setState(380);
			block();
			setState(381);
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
		enterRule(_localctx, 52, RULE_importFromGithubStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			match(T__9);
			setState(384);
			match(Import);
			setState(385);
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
		enterRule(_localctx, 54, RULE_importAllStatement);
		try {
			setState(397);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(387);
				match(T__9);
				setState(388);
				match(Import);
				setState(389);
				match(OBracket);
				setState(390);
				match(Multiply);
				setState(391);
				match(CBracket);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(392);
				match(T__9);
				setState(393);
				match(Import);
				setState(394);
				match(OBracket);
				setState(395);
				match(T__11);
				setState(396);
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
		enterRule(_localctx, 56, RULE_atStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			match(T__1);
			setState(400);
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
		enterRule(_localctx, 58, RULE_tryCatchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			match(Try);
			setState(403);
			block();
			setState(404);
			match(T__12);
			setState(405);
			match(OParen);
			setState(406);
			match(T__13);
			setState(407);
			match(CParen);
			setState(408);
			block();
			setState(409);
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
		enterRule(_localctx, 60, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			match(While);
			setState(412);
			match(OParen);
			setState(413);
			expression(0);
			setState(414);
			match(CParen);
			setState(415);
			block();
			setState(416);
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
		enterRule(_localctx, 62, RULE_windowRenderStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			match(Identifier);
			setState(419);
			match(Accessor);
			setState(420);
			match(T__14);
			setState(421);
			match(OParen);
			setState(422);
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
		enterRule(_localctx, 64, RULE_windowAddCompStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			match(Identifier);
			setState(425);
			match(Accessor);
			setState(426);
			match(T__15);
			setState(427);
			match(OParen);
			setState(428);
			expression(0);
			setState(429);
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
		enterRule(_localctx, 66, RULE_addWebServerTextStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			match(Identifier);
			setState(432);
			match(Accessor);
			setState(433);
			match(T__16);
			setState(434);
			match(OParen);
			setState(435);
			expression(0);
			setState(436);
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
		enterRule(_localctx, 68, RULE_mainFunctionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			match(T__17);
			setState(439);
			block();
			setState(440);
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
		enterRule(_localctx, 70, RULE_idList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			match(Identifier);
			setState(447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(443);
				match(Comma);
				setState(444);
				match(Identifier);
				}
				}
				setState(449);
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
		enterRule(_localctx, 72, RULE_classStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			match(Class);
			setState(451);
			match(Identifier);
			setState(454);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(452);
				match(Colon);
				setState(453);
				match(Identifier);
				}
			}

			setState(456);
			block();
			setState(457);
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
		enterRule(_localctx, 74, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			expression(0);
			setState(464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(460);
				match(Comma);
				setState(461);
				expression(0);
				}
				}
				setState(466);
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
		int _startState = 76;
		enterRecursionRule(_localctx, 76, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryMinusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(468);
				match(Subtract);
				setState(469);
				expression(24);
				}
				break;
			case 2:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(470);
				match(Excl);
				setState(471);
				expression(23);
				}
				break;
			case 3:
				{
				_localctx = new NumberExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(472);
				match(Number);
				}
				break;
			case 4:
				{
				_localctx = new BoolExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(473);
				match(Bool);
				}
				break;
			case 5:
				{
				_localctx = new NullExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(474);
				match(Null);
				}
				break;
			case 6:
				{
				_localctx = new FunctionCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(475);
				functionCall();
				setState(477);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(476);
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
				setState(479);
				list();
				setState(481);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(480);
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
				setState(483);
				match(Identifier);
				setState(485);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(484);
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
				setState(487);
				match(String);
				setState(489);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(488);
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
				setState(491);
				match(OParen);
				setState(492);
				expression(0);
				setState(493);
				match(CParen);
				setState(495);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(494);
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
				setState(497);
				match(Input);
				setState(498);
				match(OParen);
				setState(500);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==String) {
					{
					setState(499);
					match(String);
					}
				}

				setState(502);
				match(CParen);
				}
				break;
			case 12:
				{
				_localctx = new HereVarExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(503);
				varHereStatement();
				}
				break;
			case 13:
				{
				_localctx = new RandomExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(504);
				match(T__18);
				setState(505);
				match(OParen);
				setState(506);
				expression(0);
				setState(507);
				match(CParen);
				}
				break;
			case 14:
				{
				_localctx = new AnonymousFunctionExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(509);
				anonymousFunction();
				}
				break;
			case 15:
				{
				_localctx = new SelfExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(510);
				varHereStatement();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(545);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(543);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
					case 1:
						{
						_localctx = new PowerExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(513);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(514);
						match(Pow);
						setState(515);
						expression(22);
						}
						break;
					case 2:
						{
						_localctx = new MultExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(516);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(517);
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
						setState(518);
						expression(22);
						}
						break;
					case 3:
						{
						_localctx = new AddExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(519);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(520);
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
						setState(521);
						expression(21);
						}
						break;
					case 4:
						{
						_localctx = new CompExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(522);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(523);
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
						setState(524);
						expression(20);
						}
						break;
					case 5:
						{
						_localctx = new EqExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(525);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(526);
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
						setState(527);
						expression(19);
						}
						break;
					case 6:
						{
						_localctx = new AndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(528);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(529);
						match(And);
						setState(530);
						expression(18);
						}
						break;
					case 7:
						{
						_localctx = new OrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(531);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(532);
						match(Or);
						setState(533);
						expression(17);
						}
						break;
					case 8:
						{
						_localctx = new TernaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(534);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(535);
						match(QMark);
						setState(536);
						expression(0);
						setState(537);
						match(Colon);
						setState(538);
						expression(16);
						}
						break;
					case 9:
						{
						_localctx = new InExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(540);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(541);
						match(In);
						setState(542);
						expression(15);
						}
						break;
					}
					} 
				}
				setState(547);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
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
		enterRule(_localctx, 78, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
			match(OBracket);
			setState(550);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & ((1L << (T__18 - 19)) | (1L << (Println - 19)) | (1L << (Print - 19)) | (1L << (Input - 19)) | (1L << (Assert - 19)) | (1L << (Def - 19)) | (1L << (ToInt - 19)) | (1L << (Null - 19)) | (1L << (Self - 19)) | (1L << (Excl - 19)) | (1L << (Subtract - 19)) | (1L << (OBracket - 19)) | (1L << (OParen - 19)) | (1L << (Bool - 19)) | (1L << (Number - 19)) | (1L << (Identifier - 19)) | (1L << (String - 19)))) != 0)) {
				{
				setState(549);
				exprList();
				}
			}

			setState(552);
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
		enterRule(_localctx, 80, RULE_indexes);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(558); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(554);
					match(OBracket);
					setState(555);
					expression(0);
					setState(556);
					match(CBracket);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(560); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
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
		case 38:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 22);
		case 1:
			return precpred(_ctx, 21);
		case 2:
			return precpred(_ctx, 20);
		case 3:
			return precpred(_ctx, 19);
		case 4:
			return precpred(_ctx, 18);
		case 5:
			return precpred(_ctx, 17);
		case 6:
			return precpred(_ctx, 16);
		case 7:
			return precpred(_ctx, 15);
		case 8:
			return precpred(_ctx, 14);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3O\u0235\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\5\2"+
		"V\n\2\3\2\3\2\3\2\7\2[\n\2\f\2\16\2^\13\2\3\2\3\2\3\2\3\3\3\3\7\3e\n\3"+
		"\f\3\16\3h\13\3\3\3\3\3\3\3\3\3\5\3n\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u008f\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u009f\n\4\3\5\3\5\5\5\u00a3\n\5\3\5\3\5\3"+
		"\5\3\6\7\6\u00a9\n\6\f\6\16\6\u00ac\13\6\3\6\3\6\3\6\5\6\u00b1\n\6\3\6"+
		"\3\6\5\6\u00b5\n\6\3\7\3\7\3\7\5\7\u00ba\n\7\3\7\3\7\3\7\3\7\5\7\u00c0"+
		"\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\5\7\u00d7\n\7\3\7\5\7\u00da\n\7\3\b\3\b\3\b\5\b\u00df"+
		"\n\b\3\t\3\t\3\t\3\t\3\t\5\t\u00e6\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\7\f\u00f9\n\f\f\f\16\f\u00fc"+
		"\13\f\3\f\5\f\u00ff\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\5\21\u011e\n\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\5\22\u012a\n\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\5\23"+
		"\u0133\n\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\27\7\27\u0147\n\27\f\27\16\27\u014a\13\27"+
		"\3\27\3\27\3\27\3\27\5\27\u0150\n\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\7\32\u0172\n\32"+
		"\f\32\16\32\u0175\13\32\3\33\3\33\3\33\5\33\u017a\n\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\5\35\u0190\n\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\7%\u01c0"+
		"\n%\f%\16%\u01c3\13%\3&\3&\3&\3&\5&\u01c9\n&\3&\3&\3&\3\'\3\'\3\'\7\'"+
		"\u01d1\n\'\f\'\16\'\u01d4\13\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u01e0"+
		"\n(\3(\3(\5(\u01e4\n(\3(\3(\5(\u01e8\n(\3(\3(\5(\u01ec\n(\3(\3(\3(\3("+
		"\5(\u01f2\n(\3(\3(\3(\5(\u01f7\n(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u0202"+
		"\n(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3("+
		"\3(\3(\3(\3(\3(\3(\3(\3(\7(\u0222\n(\f(\16(\u0225\13(\3)\3)\5)\u0229\n"+
		")\3)\3)\3*\3*\3*\3*\6*\u0231\n*\r*\16*\u0232\3*\6\\\u00aa\u0148\u0173"+
		"\3N+\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@"+
		"BDFHJLNPR\2\b\3\2+,\4\2\27\27..\3\2<>\3\2:;\4\2\64\6589\3\2\62\63\2\u0261"+
		"\2U\3\2\2\2\4f\3\2\2\2\6\u009e\3\2\2\2\b\u00a0\3\2\2\2\n\u00aa\3\2\2\2"+
		"\f\u00d9\3\2\2\2\16\u00de\3\2\2\2\20\u00e0\3\2\2\2\22\u00e9\3\2\2\2\24"+
		"\u00f2\3\2\2\2\26\u00f6\3\2\2\2\30\u0102\3\2\2\2\32\u0108\3\2\2\2\34\u010e"+
		"\3\2\2\2\36\u0112\3\2\2\2 \u0119\3\2\2\2\"\u0123\3\2\2\2$\u012d\3\2\2"+
		"\2&\u0136\3\2\2\2(\u013d\3\2\2\2*\u0142\3\2\2\2,\u0148\3\2\2\2.\u0155"+
		"\3\2\2\2\60\u0160\3\2\2\2\62\u016c\3\2\2\2\64\u0176\3\2\2\2\66\u0181\3"+
		"\2\2\28\u018f\3\2\2\2:\u0191\3\2\2\2<\u0194\3\2\2\2>\u019d\3\2\2\2@\u01a4"+
		"\3\2\2\2B\u01aa\3\2\2\2D\u01b1\3\2\2\2F\u01b8\3\2\2\2H\u01bc\3\2\2\2J"+
		"\u01c4\3\2\2\2L\u01cd\3\2\2\2N\u0201\3\2\2\2P\u0226\3\2\2\2R\u0230\3\2"+
		"\2\2TV\5\24\13\2UT\3\2\2\2UV\3\2\2\2V\\\3\2\2\2WX\5\16\b\2XY\7E\2\2Y["+
		"\3\2\2\2ZW\3\2\2\2[^\3\2\2\2\\]\3\2\2\2\\Z\3\2\2\2]_\3\2\2\2^\\\3\2\2"+
		"\2_`\5\4\3\2`a\7\2\2\3a\3\3\2\2\2be\5\6\4\2ce\5,\27\2db\3\2\2\2dc\3\2"+
		"\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gm\3\2\2\2hf\3\2\2\2ij\7!\2\2jk\5N("+
		"\2kl\7E\2\2ln\3\2\2\2mi\3\2\2\2mn\3\2\2\2n\5\3\2\2\2op\5\f\7\2pq\7E\2"+
		"\2q\u009f\3\2\2\2r\u009f\5\26\f\2s\u009f\5.\30\2t\u009f\5\60\31\2u\u009f"+
		"\5> \2v\u009f\5<\37\2w\u009f\5F$\2xy\5D#\2yz\7E\2\2z\u009f\3\2\2\2{|\5"+
		"\b\5\2|}\7E\2\2}\u009f\3\2\2\2~\u009f\5J&\2\177\u009f\5 \21\2\u0080\u0081"+
		"\5B\"\2\u0081\u0082\7E\2\2\u0082\u009f\3\2\2\2\u0083\u0084\5@!\2\u0084"+
		"\u0085\7E\2\2\u0085\u009f\3\2\2\2\u0086\u0087\5&\24\2\u0087\u0088\7E\2"+
		"\2\u0088\u009f\3\2\2\2\u0089\u008a\5(\25\2\u008a\u008b\7E\2\2\u008b\u009f"+
		"\3\2\2\2\u008c\u008e\5\20\t\2\u008d\u008f\7E\2\2\u008e\u008d\3\2\2\2\u008e"+
		"\u008f\3\2\2\2\u008f\u009f\3\2\2\2\u0090\u0091\5\"\22\2\u0091\u0092\7"+
		"E\2\2\u0092\u009f\3\2\2\2\u0093\u0094\5$\23\2\u0094\u0095\7E\2\2\u0095"+
		"\u009f\3\2\2\2\u0096\u009f\5\64\33\2\u0097\u0098\5\32\16\2\u0098\u0099"+
		"\7E\2\2\u0099\u009f\3\2\2\2\u009a\u009b\5\n\6\2\u009b\u009c\7E\2\2\u009c"+
		"\u009f\3\2\2\2\u009d\u009f\5:\36\2\u009eo\3\2\2\2\u009er\3\2\2\2\u009e"+
		"s\3\2\2\2\u009et\3\2\2\2\u009eu\3\2\2\2\u009ev\3\2\2\2\u009ew\3\2\2\2"+
		"\u009ex\3\2\2\2\u009e{\3\2\2\2\u009e~\3\2\2\2\u009e\177\3\2\2\2\u009e"+
		"\u0080\3\2\2\2\u009e\u0083\3\2\2\2\u009e\u0086\3\2\2\2\u009e\u0089\3\2"+
		"\2\2\u009e\u008c\3\2\2\2\u009e\u0090\3\2\2\2\u009e\u0093\3\2\2\2\u009e"+
		"\u0096\3\2\2\2\u009e\u0097\3\2\2\2\u009e\u009a\3\2\2\2\u009e\u009d\3\2"+
		"\2\2\u009f\7\3\2\2\2\u00a0\u00a2\7L\2\2\u00a1\u00a3\5R*\2\u00a2\u00a1"+
		"\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\7F\2\2\u00a5"+
		"\u00a6\5N(\2\u00a6\t\3\2\2\2\u00a7\u00a9\t\2\2\2\u00a8\u00a7\3\2\2\2\u00a9"+
		"\u00ac\3\2\2\2\u00aa\u00ab\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ad\3\2"+
		"\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00ae\7\30\2\2\u00ae\u00b4\7L\2\2\u00af"+
		"\u00b1\5R*\2\u00b0\u00af\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\3\2\2"+
		"\2\u00b2\u00b3\7F\2\2\u00b3\u00b5\5N(\2\u00b4\u00b0\3\2\2\2\u00b4\u00b5"+
		"\3\2\2\2\u00b5\13\3\2\2\2\u00b6\u00b7\7L\2\2\u00b7\u00b9\7C\2\2\u00b8"+
		"\u00ba\5L\'\2\u00b9\u00b8\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\3\2"+
		"\2\2\u00bb\u00da\7D\2\2\u00bc\u00bd\7\26\2\2\u00bd\u00bf\7C\2\2\u00be"+
		"\u00c0\5N(\2\u00bf\u00be\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\3\2\2"+
		"\2\u00c1\u00da\7D\2\2\u00c2\u00c3\7\32\2\2\u00c3\u00c4\7C\2\2\u00c4\u00c5"+
		"\5N(\2\u00c5\u00c6\7D\2\2\u00c6\u00da\3\2\2\2\u00c7\u00c8\7\34\2\2\u00c8"+
		"\u00c9\7C\2\2\u00c9\u00ca\5N(\2\u00ca\u00cb\7D\2\2\u00cb\u00da\3\2\2\2"+
		"\u00cc\u00cd\7\36\2\2\u00cd\u00ce\7C\2\2\u00ce\u00cf\5N(\2\u00cf\u00d0"+
		"\7D\2\2\u00d0\u00da\3\2\2\2\u00d1\u00d2\7L\2\2\u00d2\u00d3\7\60\2\2\u00d3"+
		"\u00d4\7L\2\2\u00d4\u00d6\7C\2\2\u00d5\u00d7\5L\'\2\u00d6\u00d5\3\2\2"+
		"\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00da\7D\2\2\u00d9\u00b6"+
		"\3\2\2\2\u00d9\u00bc\3\2\2\2\u00d9\u00c2\3\2\2\2\u00d9\u00c7\3\2\2\2\u00d9"+
		"\u00cc\3\2\2\2\u00d9\u00d1\3\2\2\2\u00da\r\3\2\2\2\u00db\u00df\5\62\32"+
		"\2\u00dc\u00df\5\66\34\2\u00dd\u00df\58\35\2\u00de\u00db\3\2\2\2\u00de"+
		"\u00dc\3\2\2\2\u00de\u00dd\3\2\2\2\u00df\17\3\2\2\2\u00e0\u00e1\7L\2\2"+
		"\u00e1\u00e2\7\60\2\2\u00e2\u00e3\7L\2\2\u00e3\u00e5\7C\2\2\u00e4\u00e6"+
		"\5L\'\2\u00e5\u00e4\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7"+
		"\u00e8\7D\2\2\u00e8\21\3\2\2\2\u00e9\u00ea\7\3\2\2\u00ea\u00eb\7\4\2\2"+
		"\u00eb\u00ec\7\5\2\2\u00ec\u00ed\7L\2\2\u00ed\u00ee\7C\2\2\u00ee\u00ef"+
		"\7D\2\2\u00ef\u00f0\5\4\3\2\u00f0\u00f1\7&\2\2\u00f1\23\3\2\2\2\u00f2"+
		"\u00f3\7\4\2\2\u00f3\u00f4\7\6\2\2\u00f4\u00f5\7L\2\2\u00f5\25\3\2\2\2"+
		"\u00f6\u00fa\5\30\r\2\u00f7\u00f9\5\36\20\2\u00f8\u00f7\3\2\2\2\u00f9"+
		"\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fe\3\2"+
		"\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00ff\5*\26\2\u00fe\u00fd\3\2\2\2\u00fe"+
		"\u00ff\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\7&\2\2\u0101\27\3\2\2\2"+
		"\u0102\u0103\7\37\2\2\u0103\u0104\7C\2\2\u0104\u0105\5N(\2\u0105\u0106"+
		"\7D\2\2\u0106\u0107\5\4\3\2\u0107\31\3\2\2\2\u0108\u0109\7-\2\2\u0109"+
		"\u010a\7\60\2\2\u010a\u010b\7L\2\2\u010b\u010c\7F\2\2\u010c\u010d\5N("+
		"\2\u010d\33\3\2\2\2\u010e\u010f\7-\2\2\u010f\u0110\7\60\2\2\u0110\u0111"+
		"\7L\2\2\u0111\35\3\2\2\2\u0112\u0113\7 \2\2\u0113\u0114\7\37\2\2\u0114"+
		"\u0115\7C\2\2\u0115\u0116\5N(\2\u0116\u0117\7D\2\2\u0117\u0118\5\4\3\2"+
		"\u0118\37\3\2\2\2\u0119\u011a\7\7\2\2\u011a\u011b\7L\2\2\u011b\u011d\7"+
		"C\2\2\u011c\u011e\5L\'\2\u011d\u011c\3\2\2\2\u011d\u011e\3\2\2\2\u011e"+
		"\u011f\3\2\2\2\u011f\u0120\7D\2\2\u0120\u0121\5\4\3\2\u0121\u0122\7&\2"+
		"\2\u0122!\3\2\2\2\u0123\u0124\7\3\2\2\u0124\u0125\7L\2\2\u0125\u0126\7"+
		"\5\2\2\u0126\u0127\7L\2\2\u0127\u0129\7C\2\2\u0128\u012a\5L\'\2\u0129"+
		"\u0128\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\7D"+
		"\2\2\u012c#\3\2\2\2\u012d\u012e\7\b\2\2\u012e\u012f\7\60\2\2\u012f\u0130"+
		"\7L\2\2\u0130\u0132\7C\2\2\u0131\u0133\5N(\2\u0132\u0131\3\2\2\2\u0132"+
		"\u0133\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0135\7D\2\2\u0135%\3\2\2\2\u0136"+
		"\u0137\7L\2\2\u0137\u0138\7\60\2\2\u0138\u0139\7\t\2\2\u0139\u013a\7C"+
		"\2\2\u013a\u013b\5N(\2\u013b\u013c\7D\2\2\u013c\'\3\2\2\2\u013d\u013e"+
		"\7\n\2\2\u013e\u013f\7C\2\2\u013f\u0140\5N(\2\u0140\u0141\7D\2\2\u0141"+
		")\3\2\2\2\u0142\u0143\7 \2\2\u0143\u0144\5\4\3\2\u0144+\3\2\2\2\u0145"+
		"\u0147\t\3\2\2\u0146\u0145\3\2\2\2\u0147\u014a\3\2\2\2\u0148\u0149\3\2"+
		"\2\2\u0148\u0146\3\2\2\2\u0149\u014b\3\2\2\2\u014a\u0148\3\2\2\2\u014b"+
		"\u014c\7\35\2\2\u014c\u014d\7L\2\2\u014d\u014f\7C\2\2\u014e\u0150\5H%"+
		"\2\u014f\u014e\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0152"+
		"\7D\2\2\u0152\u0153\5\4\3\2\u0153\u0154\7&\2\2\u0154-\3\2\2\2\u0155\u0156"+
		"\7\"\2\2\u0156\u0157\7C\2\2\u0157\u0158\7L\2\2\u0158\u0159\7F\2\2\u0159"+
		"\u015a\5N(\2\u015a\u015b\7$\2\2\u015b\u015c\5N(\2\u015c\u015d\7D\2\2\u015d"+
		"\u015e\5\4\3\2\u015e\u015f\7&\2\2\u015f/\3\2\2\2\u0160\u0161\7\"\2\2\u0161"+
		"\u0162\7C\2\2\u0162\u0163\7L\2\2\u0163\u0164\7\'\2\2\u0164\u0165\7\13"+
		"\2\2\u0165\u0166\7C\2\2\u0166\u0167\5N(\2\u0167\u0168\7D\2\2\u0168\u0169"+
		"\7D\2\2\u0169\u016a\5\4\3\2\u016a\u016b\7&\2\2\u016b\61\3\2\2\2\u016c"+
		"\u016d\7\f\2\2\u016d\u016e\7\31\2\2\u016e\u0173\7L\2\2\u016f\u0170\7\r"+
		"\2\2\u0170\u0172\7L\2\2\u0171\u016f\3\2\2\2\u0172\u0175\3\2\2\2\u0173"+
		"\u0174\3\2\2\2\u0173\u0171\3\2\2\2\u0174\63\3\2\2\2\u0175\u0173\3\2\2"+
		"\2\u0176\u0177\7\35\2\2\u0177\u0179\7C\2\2\u0178\u017a\5L\'\2\u0179\u0178"+
		"\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017c\7D\2\2\u017c"+
		"\u017d\7;\2\2\u017d\u017e\78\2\2\u017e\u017f\5\4\3\2\u017f\u0180\7&\2"+
		"\2\u0180\65\3\2\2\2\u0181\u0182\7\f\2\2\u0182\u0183\7\31\2\2\u0183\u0184"+
		"\5N(\2\u0184\67\3\2\2\2\u0185\u0186\7\f\2\2\u0186\u0187\7\31\2\2\u0187"+
		"\u0188\7A\2\2\u0188\u0189\7<\2\2\u0189\u0190\7B\2\2\u018a\u018b\7\f\2"+
		"\2\u018b\u018c\7\31\2\2\u018c\u018d\7A\2\2\u018d\u018e\7\16\2\2\u018e"+
		"\u0190\7B\2\2\u018f\u0185\3\2\2\2\u018f\u018a\3\2\2\2\u01909\3\2\2\2\u0191"+
		"\u0192\7\4\2\2\u0192\u0193\7L\2\2\u0193;\3\2\2\2\u0194\u0195\7)\2\2\u0195"+
		"\u0196\5\4\3\2\u0196\u0197\7\17\2\2\u0197\u0198\7C\2\2\u0198\u0199\7\20"+
		"\2\2\u0199\u019a\7D\2\2\u019a\u019b\5\4\3\2\u019b\u019c\7&\2\2\u019c="+
		"\3\2\2\2\u019d\u019e\7#\2\2\u019e\u019f\7C\2\2\u019f\u01a0\5N(\2\u01a0"+
		"\u01a1\7D\2\2\u01a1\u01a2\5\4\3\2\u01a2\u01a3\7&\2\2\u01a3?\3\2\2\2\u01a4"+
		"\u01a5\7L\2\2\u01a5\u01a6\7\60\2\2\u01a6\u01a7\7\21\2\2\u01a7\u01a8\7"+
		"C\2\2\u01a8\u01a9\7D\2\2\u01a9A\3\2\2\2\u01aa\u01ab\7L\2\2\u01ab\u01ac"+
		"\7\60\2\2\u01ac\u01ad\7\22\2\2\u01ad\u01ae\7C\2\2\u01ae\u01af\5N(\2\u01af"+
		"\u01b0\7D\2\2\u01b0C\3\2\2\2\u01b1\u01b2\7L\2\2\u01b2\u01b3\7\60\2\2\u01b3"+
		"\u01b4\7\23\2\2\u01b4\u01b5\7C\2\2\u01b5\u01b6\5N(\2\u01b6\u01b7\7D\2"+
		"\2\u01b7E\3\2\2\2\u01b8\u01b9\7\24\2\2\u01b9\u01ba\5\4\3\2\u01ba\u01bb"+
		"\7&\2\2\u01bbG\3\2\2\2\u01bc\u01c1\7L\2\2\u01bd\u01be\7G\2\2\u01be\u01c0"+
		"\7L\2\2\u01bf\u01bd\3\2\2\2\u01c0\u01c3\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c1"+
		"\u01c2\3\2\2\2\u01c2I\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c4\u01c5\7*\2\2\u01c5"+
		"\u01c8\7L\2\2\u01c6\u01c7\7I\2\2\u01c7\u01c9\7L\2\2\u01c8\u01c6\3\2\2"+
		"\2\u01c8\u01c9\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01cb\5\4\3\2\u01cb\u01cc"+
		"\7&\2\2\u01ccK\3\2\2\2\u01cd\u01d2\5N(\2\u01ce\u01cf\7G\2\2\u01cf\u01d1"+
		"\5N(\2\u01d0\u01ce\3\2\2\2\u01d1\u01d4\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d2"+
		"\u01d3\3\2\2\2\u01d3M\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d5\u01d6\b(\1\2\u01d6"+
		"\u01d7\7;\2\2\u01d7\u0202\5N(\32\u01d8\u01d9\7\67\2\2\u01d9\u0202\5N("+
		"\31\u01da\u0202\7K\2\2\u01db\u0202\7J\2\2\u01dc\u0202\7(\2\2\u01dd\u01df"+
		"\5\f\7\2\u01de\u01e0\5R*\2\u01df\u01de\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0"+
		"\u0202\3\2\2\2\u01e1\u01e3\5P)\2\u01e2\u01e4\5R*\2\u01e3\u01e2\3\2\2\2"+
		"\u01e3\u01e4\3\2\2\2\u01e4\u0202\3\2\2\2\u01e5\u01e7\7L\2\2\u01e6\u01e8"+
		"\5R*\2\u01e7\u01e6\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u0202\3\2\2\2\u01e9"+
		"\u01eb\7M\2\2\u01ea\u01ec\5R*\2\u01eb\u01ea\3\2\2\2\u01eb\u01ec\3\2\2"+
		"\2\u01ec\u0202\3\2\2\2\u01ed\u01ee\7C\2\2\u01ee\u01ef\5N(\2\u01ef\u01f1"+
		"\7D\2\2\u01f0\u01f2\5R*\2\u01f1\u01f0\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2"+
		"\u0202\3\2\2\2\u01f3\u01f4\7\33\2\2\u01f4\u01f6\7C\2\2\u01f5\u01f7\7M"+
		"\2\2\u01f6\u01f5\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8"+
		"\u0202\7D\2\2\u01f9\u0202\5\34\17\2\u01fa\u01fb\7\25\2\2\u01fb\u01fc\7"+
		"C\2\2\u01fc\u01fd\5N(\2\u01fd\u01fe\7D\2\2\u01fe\u0202\3\2\2\2\u01ff\u0202"+
		"\5\64\33\2\u0200\u0202\5\34\17\2\u0201\u01d5\3\2\2\2\u0201\u01d8\3\2\2"+
		"\2\u0201\u01da\3\2\2\2\u0201\u01db\3\2\2\2\u0201\u01dc\3\2\2\2\u0201\u01dd"+
		"\3\2\2\2\u0201\u01e1\3\2\2\2\u0201\u01e5\3\2\2\2\u0201\u01e9\3\2\2\2\u0201"+
		"\u01ed\3\2\2\2\u0201\u01f3\3\2\2\2\u0201\u01f9\3\2\2\2\u0201\u01fa\3\2"+
		"\2\2\u0201\u01ff\3\2\2\2\u0201\u0200\3\2\2\2\u0202\u0223\3\2\2\2\u0203"+
		"\u0204\f\30\2\2\u0204\u0205\7\66\2\2\u0205\u0222\5N(\30\u0206\u0207\f"+
		"\27\2\2\u0207\u0208\t\4\2\2\u0208\u0222\5N(\30\u0209\u020a\f\26\2\2\u020a"+
		"\u020b\t\5\2\2\u020b\u0222\5N(\27\u020c\u020d\f\25\2\2\u020d\u020e\t\6"+
		"\2\2\u020e\u0222\5N(\26\u020f\u0210\f\24\2\2\u0210\u0211\t\7\2\2\u0211"+
		"\u0222\5N(\25\u0212\u0213\f\23\2\2\u0213\u0214\7\61\2\2\u0214\u0222\5"+
		"N(\24\u0215\u0216\f\22\2\2\u0216\u0217\7/\2\2\u0217\u0222\5N(\23\u0218"+
		"\u0219\f\21\2\2\u0219\u021a\7H\2\2\u021a\u021b\5N(\2\u021b\u021c\7I\2"+
		"\2\u021c\u021d\5N(\22\u021d\u0222\3\2\2\2\u021e\u021f\f\20\2\2\u021f\u0220"+
		"\7\'\2\2\u0220\u0222\5N(\21\u0221\u0203\3\2\2\2\u0221\u0206\3\2\2\2\u0221"+
		"\u0209\3\2\2\2\u0221\u020c\3\2\2\2\u0221\u020f\3\2\2\2\u0221\u0212\3\2"+
		"\2\2\u0221\u0215\3\2\2\2\u0221\u0218\3\2\2\2\u0221\u021e\3\2\2\2\u0222"+
		"\u0225\3\2\2\2\u0223\u0221\3\2\2\2\u0223\u0224\3\2\2\2\u0224O\3\2\2\2"+
		"\u0225\u0223\3\2\2\2\u0226\u0228\7A\2\2\u0227\u0229\5L\'\2\u0228\u0227"+
		"\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u022b\7B\2\2\u022b"+
		"Q\3\2\2\2\u022c\u022d\7A\2\2\u022d\u022e\5N(\2\u022e\u022f\7B\2\2\u022f"+
		"\u0231\3\2\2\2\u0230\u022c\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0230\3\2"+
		"\2\2\u0232\u0233\3\2\2\2\u0233S\3\2\2\2+U\\dfm\u008e\u009e\u00a2\u00aa"+
		"\u00b0\u00b4\u00b9\u00bf\u00d6\u00d9\u00de\u00e5\u00fa\u00fe\u011d\u0129"+
		"\u0132\u0148\u014f\u0173\u0179\u018f\u01c1\u01c8\u01d2\u01df\u01e3\u01e7"+
		"\u01eb\u01f1\u01f6\u0201\u0221\u0223\u0228\u0232";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}