// Generated from /Users/harryharbuck-marlowe/Desktop/Q/src/main/java/core/etc/Q.g4 by ANTLR 4.9.2
package core.interp;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class QLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, Println=24, 
		Async=25, Render=26, AddComponent=27, Var=28, Import=29, Print=30, Input=31, 
		Assert=32, Def=33, ToInt=34, If=35, Else=36, Return=37, For=38, While=39, 
		To=40, Do=41, End=42, In=43, Null=44, Try=45, Catch=46, Class=47, Or=48, 
		And=49, Equals=50, NEquals=51, GTEquals=52, LTEquals=53, Pow=54, Excl=55, 
		GT=56, LT=57, Add=58, Subtract=59, Multiply=60, Divide=61, Modulus=62, 
		OBrace=63, CBrace=64, OBracket=65, CBracket=66, OParen=67, CParen=68, 
		SColon=69, Assign=70, Comma=71, QMark=72, Colon=73, Bool=74, Number=75, 
		Identifier=76, String=77, Comment=78, JavaTextBlock=79, Space=80;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "Println", "Async", 
			"Render", "AddComponent", "Var", "Import", "Print", "Input", "Assert", 
			"Def", "ToInt", "If", "Else", "Return", "For", "While", "To", "Do", "End", 
			"In", "Null", "Try", "Catch", "Class", "Or", "And", "Equals", "NEquals", 
			"GTEquals", "LTEquals", "Pow", "Excl", "GT", "LT", "Add", "Subtract", 
			"Multiply", "Divide", "Modulus", "OBrace", "CBrace", "OBracket", "CBracket", 
			"OParen", "CParen", "SColon", "Assign", "Comma", "QMark", "Colon", "Bool", 
			"Number", "Identifier", "String", "Comment", "JavaTextBlock", "Space", 
			"Int", "Digit"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'@'", "'header'", "'here'", "'cn'", "'new'", "'as'", "'List'", 
			"'add'", "'remove'", "'sys'", "'write'", "'verify'", "'noval'", "'range'", 
			"'#'", "'all'", "'custom'", "'define'", "'\"'", "'onflaw'", "'changeText'", 
			"'fn main()'", "'std:ln'", "'async'", "'render'", "'addComp'", "'var'", 
			"'import'", "'std:out'", "'std:in'", "'assert'", "'fn'", "'toInt'", "'if'", 
			"'else'", "'return'", "'for'", "'while'", "'to'", "'do'", "'end'", "'in'", 
			"'null'", "'try'", "'catch'", "'class'", "'||'", "'&&'", "'=='", "'!='", 
			"'>='", "'<='", "'^'", "'!'", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", 
			"'%'", "'{'", "'}'", "'['", "']'", "'('", "')'", "';'", "'='", "','", 
			"'?'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"Println", "Async", "Render", "AddComponent", "Var", "Import", "Print", 
			"Input", "Assert", "Def", "ToInt", "If", "Else", "Return", "For", "While", 
			"To", "Do", "End", "In", "Null", "Try", "Catch", "Class", "Or", "And", 
			"Equals", "NEquals", "GTEquals", "LTEquals", "Pow", "Excl", "GT", "LT", 
			"Add", "Subtract", "Multiply", "Divide", "Modulus", "OBrace", "CBrace", 
			"OBracket", "CBracket", "OParen", "CParen", "SColon", "Assign", "Comma", 
			"QMark", "Colon", "Bool", "Number", "Identifier", "String", "Comment", 
			"JavaTextBlock", "Space"
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


	public QLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Q.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2R\u0240\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\3\2\3"+
		"\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\""+
		"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3"+
		"\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3+\3+\3,\3,\3"+
		",\3-\3-\3-\3-\3-\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\65"+
		"\3\65\3\65\3\66\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3"+
		"=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3"+
		"I\3I\3J\3J\3K\3K\3K\3K\3K\3K\3K\3K\3K\5K\u01e5\nK\3L\3L\3L\7L\u01ea\n"+
		"L\fL\16L\u01ed\13L\5L\u01ef\nL\3M\3M\7M\u01f3\nM\fM\16M\u01f6\13M\3N\3"+
		"N\3N\3N\7N\u01fc\nN\fN\16N\u01ff\13N\3N\3N\3N\3N\3N\7N\u0206\nN\fN\16"+
		"N\u0209\13N\3N\5N\u020c\nN\3O\3O\3O\3O\7O\u0212\nO\fO\16O\u0215\13O\3"+
		"O\3O\3O\3O\7O\u021b\nO\fO\16O\u021e\13O\3O\3O\5O\u0222\nO\3O\3O\3P\3P"+
		"\3P\3P\7P\u022a\nP\fP\16P\u022d\13P\3P\3P\3Q\3Q\3Q\3Q\3R\3R\7R\u0237\n"+
		"R\fR\16R\u023a\13R\3R\5R\u023d\nR\3S\3S\3\u021c\2T\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'"+
		"M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177"+
		"A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093"+
		"K\u0095L\u0097M\u0099N\u009bO\u009dP\u009fQ\u00a1R\u00a3\2\u00a5\2\3\2"+
		"\f\5\2C\\aac|\6\2\62;C\\aac|\3\2$$\6\2\f\f\17\17$$^^\4\2\f\f\17\17\3\2"+
		"))\6\2\f\f\17\17))^^\5\2\13\f\16\17\"\"\3\2\63;\3\2\62;\2\u024d\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2"+
		"\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I"+
		"\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2"+
		"\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2"+
		"\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o"+
		"\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2"+
		"\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
		"\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2"+
		"\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097"+
		"\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2"+
		"\2\2\u00a1\3\2\2\2\3\u00a7\3\2\2\2\5\u00a9\3\2\2\2\7\u00ab\3\2\2\2\t\u00b2"+
		"\3\2\2\2\13\u00b7\3\2\2\2\r\u00ba\3\2\2\2\17\u00be\3\2\2\2\21\u00c1\3"+
		"\2\2\2\23\u00c6\3\2\2\2\25\u00ca\3\2\2\2\27\u00d1\3\2\2\2\31\u00d5\3\2"+
		"\2\2\33\u00db\3\2\2\2\35\u00e2\3\2\2\2\37\u00e8\3\2\2\2!\u00ee\3\2\2\2"+
		"#\u00f0\3\2\2\2%\u00f4\3\2\2\2\'\u00fb\3\2\2\2)\u0102\3\2\2\2+\u0104\3"+
		"\2\2\2-\u010b\3\2\2\2/\u0116\3\2\2\2\61\u0120\3\2\2\2\63\u0127\3\2\2\2"+
		"\65\u012d\3\2\2\2\67\u0134\3\2\2\29\u013c\3\2\2\2;\u0140\3\2\2\2=\u0147"+
		"\3\2\2\2?\u014f\3\2\2\2A\u0156\3\2\2\2C\u015d\3\2\2\2E\u0160\3\2\2\2G"+
		"\u0166\3\2\2\2I\u0169\3\2\2\2K\u016e\3\2\2\2M\u0175\3\2\2\2O\u0179\3\2"+
		"\2\2Q\u017f\3\2\2\2S\u0182\3\2\2\2U\u0185\3\2\2\2W\u0189\3\2\2\2Y\u018c"+
		"\3\2\2\2[\u0191\3\2\2\2]\u0195\3\2\2\2_\u019b\3\2\2\2a\u01a1\3\2\2\2c"+
		"\u01a4\3\2\2\2e\u01a7\3\2\2\2g\u01aa\3\2\2\2i\u01ad\3\2\2\2k\u01b0\3\2"+
		"\2\2m\u01b3\3\2\2\2o\u01b5\3\2\2\2q\u01b7\3\2\2\2s\u01b9\3\2\2\2u\u01bb"+
		"\3\2\2\2w\u01bd\3\2\2\2y\u01bf\3\2\2\2{\u01c1\3\2\2\2}\u01c3\3\2\2\2\177"+
		"\u01c5\3\2\2\2\u0081\u01c7\3\2\2\2\u0083\u01c9\3\2\2\2\u0085\u01cb\3\2"+
		"\2\2\u0087\u01cd\3\2\2\2\u0089\u01cf\3\2\2\2\u008b\u01d1\3\2\2\2\u008d"+
		"\u01d3\3\2\2\2\u008f\u01d5\3\2\2\2\u0091\u01d7\3\2\2\2\u0093\u01d9\3\2"+
		"\2\2\u0095\u01e4\3\2\2\2\u0097\u01e6\3\2\2\2\u0099\u01f0\3\2\2\2\u009b"+
		"\u020b\3\2\2\2\u009d\u0221\3\2\2\2\u009f\u0225\3\2\2\2\u00a1\u0230\3\2"+
		"\2\2\u00a3\u023c\3\2\2\2\u00a5\u023e\3\2\2\2\u00a7\u00a8\7\60\2\2\u00a8"+
		"\4\3\2\2\2\u00a9\u00aa\7B\2\2\u00aa\6\3\2\2\2\u00ab\u00ac\7j\2\2\u00ac"+
		"\u00ad\7g\2\2\u00ad\u00ae\7c\2\2\u00ae\u00af\7f\2\2\u00af\u00b0\7g\2\2"+
		"\u00b0\u00b1\7t\2\2\u00b1\b\3\2\2\2\u00b2\u00b3\7j\2\2\u00b3\u00b4\7g"+
		"\2\2\u00b4\u00b5\7t\2\2\u00b5\u00b6\7g\2\2\u00b6\n\3\2\2\2\u00b7\u00b8"+
		"\7e\2\2\u00b8\u00b9\7p\2\2\u00b9\f\3\2\2\2\u00ba\u00bb\7p\2\2\u00bb\u00bc"+
		"\7g\2\2\u00bc\u00bd\7y\2\2\u00bd\16\3\2\2\2\u00be\u00bf\7c\2\2\u00bf\u00c0"+
		"\7u\2\2\u00c0\20\3\2\2\2\u00c1\u00c2\7N\2\2\u00c2\u00c3\7k\2\2\u00c3\u00c4"+
		"\7u\2\2\u00c4\u00c5\7v\2\2\u00c5\22\3\2\2\2\u00c6\u00c7\7c\2\2\u00c7\u00c8"+
		"\7f\2\2\u00c8\u00c9\7f\2\2\u00c9\24\3\2\2\2\u00ca\u00cb\7t\2\2\u00cb\u00cc"+
		"\7g\2\2\u00cc\u00cd\7o\2\2\u00cd\u00ce\7q\2\2\u00ce\u00cf\7x\2\2\u00cf"+
		"\u00d0\7g\2\2\u00d0\26\3\2\2\2\u00d1\u00d2\7u\2\2\u00d2\u00d3\7{\2\2\u00d3"+
		"\u00d4\7u\2\2\u00d4\30\3\2\2\2\u00d5\u00d6\7y\2\2\u00d6\u00d7\7t\2\2\u00d7"+
		"\u00d8\7k\2\2\u00d8\u00d9\7v\2\2\u00d9\u00da\7g\2\2\u00da\32\3\2\2\2\u00db"+
		"\u00dc\7x\2\2\u00dc\u00dd\7g\2\2\u00dd\u00de\7t\2\2\u00de\u00df\7k\2\2"+
		"\u00df\u00e0\7h\2\2\u00e0\u00e1\7{\2\2\u00e1\34\3\2\2\2\u00e2\u00e3\7"+
		"p\2\2\u00e3\u00e4\7q\2\2\u00e4\u00e5\7x\2\2\u00e5\u00e6\7c\2\2\u00e6\u00e7"+
		"\7n\2\2\u00e7\36\3\2\2\2\u00e8\u00e9\7t\2\2\u00e9\u00ea\7c\2\2\u00ea\u00eb"+
		"\7p\2\2\u00eb\u00ec\7i\2\2\u00ec\u00ed\7g\2\2\u00ed \3\2\2\2\u00ee\u00ef"+
		"\7%\2\2\u00ef\"\3\2\2\2\u00f0\u00f1\7c\2\2\u00f1\u00f2\7n\2\2\u00f2\u00f3"+
		"\7n\2\2\u00f3$\3\2\2\2\u00f4\u00f5\7e\2\2\u00f5\u00f6\7w\2\2\u00f6\u00f7"+
		"\7u\2\2\u00f7\u00f8\7v\2\2\u00f8\u00f9\7q\2\2\u00f9\u00fa\7o\2\2\u00fa"+
		"&\3\2\2\2\u00fb\u00fc\7f\2\2\u00fc\u00fd\7g\2\2\u00fd\u00fe\7h\2\2\u00fe"+
		"\u00ff\7k\2\2\u00ff\u0100\7p\2\2\u0100\u0101\7g\2\2\u0101(\3\2\2\2\u0102"+
		"\u0103\7$\2\2\u0103*\3\2\2\2\u0104\u0105\7q\2\2\u0105\u0106\7p\2\2\u0106"+
		"\u0107\7h\2\2\u0107\u0108\7n\2\2\u0108\u0109\7c\2\2\u0109\u010a\7y\2\2"+
		"\u010a,\3\2\2\2\u010b\u010c\7e\2\2\u010c\u010d\7j\2\2\u010d\u010e\7c\2"+
		"\2\u010e\u010f\7p\2\2\u010f\u0110\7i\2\2\u0110\u0111\7g\2\2\u0111\u0112"+
		"\7V\2\2\u0112\u0113\7g\2\2\u0113\u0114\7z\2\2\u0114\u0115\7v\2\2\u0115"+
		".\3\2\2\2\u0116\u0117\7h\2\2\u0117\u0118\7p\2\2\u0118\u0119\7\"\2\2\u0119"+
		"\u011a\7o\2\2\u011a\u011b\7c\2\2\u011b\u011c\7k\2\2\u011c\u011d\7p\2\2"+
		"\u011d\u011e\7*\2\2\u011e\u011f\7+\2\2\u011f\60\3\2\2\2\u0120\u0121\7"+
		"u\2\2\u0121\u0122\7v\2\2\u0122\u0123\7f\2\2\u0123\u0124\7<\2\2\u0124\u0125"+
		"\7n\2\2\u0125\u0126\7p\2\2\u0126\62\3\2\2\2\u0127\u0128\7c\2\2\u0128\u0129"+
		"\7u\2\2\u0129\u012a\7{\2\2\u012a\u012b\7p\2\2\u012b\u012c\7e\2\2\u012c"+
		"\64\3\2\2\2\u012d\u012e\7t\2\2\u012e\u012f\7g\2\2\u012f\u0130\7p\2\2\u0130"+
		"\u0131\7f\2\2\u0131\u0132\7g\2\2\u0132\u0133\7t\2\2\u0133\66\3\2\2\2\u0134"+
		"\u0135\7c\2\2\u0135\u0136\7f\2\2\u0136\u0137\7f\2\2\u0137\u0138\7E\2\2"+
		"\u0138\u0139\7q\2\2\u0139\u013a\7o\2\2\u013a\u013b\7r\2\2\u013b8\3\2\2"+
		"\2\u013c\u013d\7x\2\2\u013d\u013e\7c\2\2\u013e\u013f\7t\2\2\u013f:\3\2"+
		"\2\2\u0140\u0141\7k\2\2\u0141\u0142\7o\2\2\u0142\u0143\7r\2\2\u0143\u0144"+
		"\7q\2\2\u0144\u0145\7t\2\2\u0145\u0146\7v\2\2\u0146<\3\2\2\2\u0147\u0148"+
		"\7u\2\2\u0148\u0149\7v\2\2\u0149\u014a\7f\2\2\u014a\u014b\7<\2\2\u014b"+
		"\u014c\7q\2\2\u014c\u014d\7w\2\2\u014d\u014e\7v\2\2\u014e>\3\2\2\2\u014f"+
		"\u0150\7u\2\2\u0150\u0151\7v\2\2\u0151\u0152\7f\2\2\u0152\u0153\7<\2\2"+
		"\u0153\u0154\7k\2\2\u0154\u0155\7p\2\2\u0155@\3\2\2\2\u0156\u0157\7c\2"+
		"\2\u0157\u0158\7u\2\2\u0158\u0159\7u\2\2\u0159\u015a\7g\2\2\u015a\u015b"+
		"\7t\2\2\u015b\u015c\7v\2\2\u015cB\3\2\2\2\u015d\u015e\7h\2\2\u015e\u015f"+
		"\7p\2\2\u015fD\3\2\2\2\u0160\u0161\7v\2\2\u0161\u0162\7q\2\2\u0162\u0163"+
		"\7K\2\2\u0163\u0164\7p\2\2\u0164\u0165\7v\2\2\u0165F\3\2\2\2\u0166\u0167"+
		"\7k\2\2\u0167\u0168\7h\2\2\u0168H\3\2\2\2\u0169\u016a\7g\2\2\u016a\u016b"+
		"\7n\2\2\u016b\u016c\7u\2\2\u016c\u016d\7g\2\2\u016dJ\3\2\2\2\u016e\u016f"+
		"\7t\2\2\u016f\u0170\7g\2\2\u0170\u0171\7v\2\2\u0171\u0172\7w\2\2\u0172"+
		"\u0173\7t\2\2\u0173\u0174\7p\2\2\u0174L\3\2\2\2\u0175\u0176\7h\2\2\u0176"+
		"\u0177\7q\2\2\u0177\u0178\7t\2\2\u0178N\3\2\2\2\u0179\u017a\7y\2\2\u017a"+
		"\u017b\7j\2\2\u017b\u017c\7k\2\2\u017c\u017d\7n\2\2\u017d\u017e\7g\2\2"+
		"\u017eP\3\2\2\2\u017f\u0180\7v\2\2\u0180\u0181\7q\2\2\u0181R\3\2\2\2\u0182"+
		"\u0183\7f\2\2\u0183\u0184\7q\2\2\u0184T\3\2\2\2\u0185\u0186\7g\2\2\u0186"+
		"\u0187\7p\2\2\u0187\u0188\7f\2\2\u0188V\3\2\2\2\u0189\u018a\7k\2\2\u018a"+
		"\u018b\7p\2\2\u018bX\3\2\2\2\u018c\u018d\7p\2\2\u018d\u018e\7w\2\2\u018e"+
		"\u018f\7n\2\2\u018f\u0190\7n\2\2\u0190Z\3\2\2\2\u0191\u0192\7v\2\2\u0192"+
		"\u0193\7t\2\2\u0193\u0194\7{\2\2\u0194\\\3\2\2\2\u0195\u0196\7e\2\2\u0196"+
		"\u0197\7c\2\2\u0197\u0198\7v\2\2\u0198\u0199\7e\2\2\u0199\u019a\7j\2\2"+
		"\u019a^\3\2\2\2\u019b\u019c\7e\2\2\u019c\u019d\7n\2\2\u019d\u019e\7c\2"+
		"\2\u019e\u019f\7u\2\2\u019f\u01a0\7u\2\2\u01a0`\3\2\2\2\u01a1\u01a2\7"+
		"~\2\2\u01a2\u01a3\7~\2\2\u01a3b\3\2\2\2\u01a4\u01a5\7(\2\2\u01a5\u01a6"+
		"\7(\2\2\u01a6d\3\2\2\2\u01a7\u01a8\7?\2\2\u01a8\u01a9\7?\2\2\u01a9f\3"+
		"\2\2\2\u01aa\u01ab\7#\2\2\u01ab\u01ac\7?\2\2\u01ach\3\2\2\2\u01ad\u01ae"+
		"\7@\2\2\u01ae\u01af\7?\2\2\u01afj\3\2\2\2\u01b0\u01b1\7>\2\2\u01b1\u01b2"+
		"\7?\2\2\u01b2l\3\2\2\2\u01b3\u01b4\7`\2\2\u01b4n\3\2\2\2\u01b5\u01b6\7"+
		"#\2\2\u01b6p\3\2\2\2\u01b7\u01b8\7@\2\2\u01b8r\3\2\2\2\u01b9\u01ba\7>"+
		"\2\2\u01bat\3\2\2\2\u01bb\u01bc\7-\2\2\u01bcv\3\2\2\2\u01bd\u01be\7/\2"+
		"\2\u01bex\3\2\2\2\u01bf\u01c0\7,\2\2\u01c0z\3\2\2\2\u01c1\u01c2\7\61\2"+
		"\2\u01c2|\3\2\2\2\u01c3\u01c4\7\'\2\2\u01c4~\3\2\2\2\u01c5\u01c6\7}\2"+
		"\2\u01c6\u0080\3\2\2\2\u01c7\u01c8\7\177\2\2\u01c8\u0082\3\2\2\2\u01c9"+
		"\u01ca\7]\2\2\u01ca\u0084\3\2\2\2\u01cb\u01cc\7_\2\2\u01cc\u0086\3\2\2"+
		"\2\u01cd\u01ce\7*\2\2\u01ce\u0088\3\2\2\2\u01cf\u01d0\7+\2\2\u01d0\u008a"+
		"\3\2\2\2\u01d1\u01d2\7=\2\2\u01d2\u008c\3\2\2\2\u01d3\u01d4\7?\2\2\u01d4"+
		"\u008e\3\2\2\2\u01d5\u01d6\7.\2\2\u01d6\u0090\3\2\2\2\u01d7\u01d8\7A\2"+
		"\2\u01d8\u0092\3\2\2\2\u01d9\u01da\7<\2\2\u01da\u0094\3\2\2\2\u01db\u01dc"+
		"\7v\2\2\u01dc\u01dd\7t\2\2\u01dd\u01de\7w\2\2\u01de\u01e5\7g\2\2\u01df"+
		"\u01e0\7h\2\2\u01e0\u01e1\7c\2\2\u01e1\u01e2\7n\2\2\u01e2\u01e3\7u\2\2"+
		"\u01e3\u01e5\7g\2\2\u01e4\u01db\3\2\2\2\u01e4\u01df\3\2\2\2\u01e5\u0096"+
		"\3\2\2\2\u01e6\u01ee\5\u00a3R\2\u01e7\u01eb\7\60\2\2\u01e8\u01ea\5\u00a5"+
		"S\2\u01e9\u01e8\3\2\2\2\u01ea\u01ed\3\2\2\2\u01eb\u01e9\3\2\2\2\u01eb"+
		"\u01ec\3\2\2\2\u01ec\u01ef\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ee\u01e7\3\2"+
		"\2\2\u01ee\u01ef\3\2\2\2\u01ef\u0098\3\2\2\2\u01f0\u01f4\t\2\2\2\u01f1"+
		"\u01f3\t\3\2\2\u01f2\u01f1\3\2\2\2\u01f3\u01f6\3\2\2\2\u01f4\u01f2\3\2"+
		"\2\2\u01f4\u01f5\3\2\2\2\u01f5\u009a\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f7"+
		"\u01fd\t\4\2\2\u01f8\u01fc\n\5\2\2\u01f9\u01fa\7^\2\2\u01fa\u01fc\n\6"+
		"\2\2\u01fb\u01f8\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fc\u01ff\3\2\2\2\u01fd"+
		"\u01fb\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u0200\3\2\2\2\u01ff\u01fd\3\2"+
		"\2\2\u0200\u020c\t\4\2\2\u0201\u0207\t\7\2\2\u0202\u0206\n\b\2\2\u0203"+
		"\u0204\7^\2\2\u0204\u0206\n\6\2\2\u0205\u0202\3\2\2\2\u0205\u0203\3\2"+
		"\2\2\u0206\u0209\3\2\2\2\u0207\u0205\3\2\2\2\u0207\u0208\3\2\2\2\u0208"+
		"\u020a\3\2\2\2\u0209\u0207\3\2\2\2\u020a\u020c\t\7\2\2\u020b\u01f7\3\2"+
		"\2\2\u020b\u0201\3\2\2\2\u020c\u009c\3\2\2\2\u020d\u020e\7\61\2\2\u020e"+
		"\u020f\7\61\2\2\u020f\u0213\3\2\2\2\u0210\u0212\n\6\2\2\u0211\u0210\3"+
		"\2\2\2\u0212\u0215\3\2\2\2\u0213\u0211\3\2\2\2\u0213\u0214\3\2\2\2\u0214"+
		"\u0222\3\2\2\2\u0215\u0213\3\2\2\2\u0216\u0217\7\61\2\2\u0217\u0218\7"+
		",\2\2\u0218\u021c\3\2\2\2\u0219\u021b\13\2\2\2\u021a\u0219\3\2\2\2\u021b"+
		"\u021e\3\2\2\2\u021c\u021d\3\2\2\2\u021c\u021a\3\2\2\2\u021d\u021f\3\2"+
		"\2\2\u021e\u021c\3\2\2\2\u021f\u0220\7,\2\2\u0220\u0222\7\61\2\2\u0221"+
		"\u020d\3\2\2\2\u0221\u0216\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0224\bO"+
		"\2\2\u0224\u009e\3\2\2\2\u0225\u022b\t\4\2\2\u0226\u022a\n\4\2\2\u0227"+
		"\u0228\7^\2\2\u0228\u022a\n\6\2\2\u0229\u0226\3\2\2\2\u0229\u0227\3\2"+
		"\2\2\u022a\u022d\3\2\2\2\u022b\u0229\3\2\2\2\u022b\u022c\3\2\2\2\u022c"+
		"\u022e\3\2\2\2\u022d\u022b\3\2\2\2\u022e\u022f\t\4\2\2\u022f\u00a0\3\2"+
		"\2\2\u0230\u0231\t\t\2\2\u0231\u0232\3\2\2\2\u0232\u0233\bQ\2\2\u0233"+
		"\u00a2\3\2\2\2\u0234\u0238\t\n\2\2\u0235\u0237\5\u00a5S\2\u0236\u0235"+
		"\3\2\2\2\u0237\u023a\3\2\2\2\u0238\u0236\3\2\2\2\u0238\u0239\3\2\2\2\u0239"+
		"\u023d\3\2\2\2\u023a\u0238\3\2\2\2\u023b\u023d\7\62\2\2\u023c\u0234\3"+
		"\2\2\2\u023c\u023b\3\2\2\2\u023d\u00a4\3\2\2\2\u023e\u023f\t\13\2\2\u023f"+
		"\u00a6\3\2\2\2\23\2\u01e4\u01eb\u01ee\u01f4\u01fb\u01fd\u0205\u0207\u020b"+
		"\u0213\u021c\u0221\u0229\u022b\u0238\u023c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}