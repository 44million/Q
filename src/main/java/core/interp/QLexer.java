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
		T__17=18, T__18=19, Println=20, Async=21, Var=22, Import=23, Print=24, 
		Input=25, Assert=26, Def=27, ToInt=28, If=29, Else=30, Return=31, For=32, 
		While=33, To=34, Do=35, End=36, In=37, Null=38, Try=39, Class=40, Const=41, 
		Noval=42, Self=43, Native=44, Or=45, Accessor=46, And=47, Equals=48, NEquals=49, 
		GTEquals=50, LTEquals=51, Pow=52, Excl=53, GT=54, LT=55, Add=56, Subtract=57, 
		Multiply=58, Divide=59, Modulus=60, OBrace=61, CBrace=62, OBracket=63, 
		CBracket=64, OParen=65, CParen=66, SColon=67, Assign=68, Comma=69, QMark=70, 
		Colon=71, Bool=72, Number=73, Identifier=74, String=75, Comment=76, Space=77;
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
			"T__17", "T__18", "Println", "Async", "Var", "Import", "Print", "Input", 
			"Assert", "Def", "ToInt", "If", "Else", "Return", "For", "While", "To", 
			"Do", "End", "In", "Null", "Try", "Class", "Const", "Noval", "Self", 
			"Native", "Or", "Accessor", "And", "Equals", "NEquals", "GTEquals", "LTEquals", 
			"Pow", "Excl", "GT", "LT", "Add", "Subtract", "Multiply", "Divide", "Modulus", 
			"OBrace", "CBrace", "OBracket", "CBracket", "OParen", "CParen", "SColon", 
			"Assign", "Comma", "QMark", "Colon", "Bool", "Number", "Identifier", 
			"String", "Comment", "Space", "Int", "Digit", "ESC", "UNICODE", "HEX"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'@'", "'header'", "'cn'", "'new'", "'as'", "'sys'", "'write'", 
			"'verify'", "'range'", "'#'", "'.'", "'all'", "'on'", "'err'", "'render'", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2O\u0229\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3"+
		"#\3$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3)\3)"+
		"\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3-\3-"+
		"\3-\3-\3-\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3"+
		"\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\3"+
		"8\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3"+
		"C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3I\3I\3I\3I\3I\3I\3I\5I\u01d9\n"+
		"I\3J\3J\3J\7J\u01de\nJ\fJ\16J\u01e1\13J\5J\u01e3\nJ\3K\3K\7K\u01e7\nK"+
		"\fK\16K\u01ea\13K\3L\3L\3L\6L\u01ef\nL\rL\16L\u01f0\3L\3L\3M\3M\3M\3M"+
		"\7M\u01f9\nM\fM\16M\u01fc\13M\3M\3M\3M\3M\7M\u0202\nM\fM\16M\u0205\13"+
		"M\3M\3M\5M\u0209\nM\3M\3M\3N\3N\3N\3N\3O\3O\7O\u0213\nO\fO\16O\u0216\13"+
		"O\3O\5O\u0219\nO\3P\3P\3Q\3Q\3Q\5Q\u0220\nQ\3R\3R\3R\3R\3R\3R\3S\3S\3"+
		"\u0203\2T\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65"+
		"i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008b"+
		"G\u008dH\u008fI\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009d\2\u009f"+
		"\2\u00a1\2\u00a3\2\u00a5\2\3\2\13\5\2C\\aac|\6\2\62;C\\aac|\6\2\f\f\17"+
		"\17$$^^\4\2\f\f\17\17\5\2\13\f\16\17\"\"\3\2\63;\3\2\62;\t\2$$^^ddhhp"+
		"pttvv\5\2\62;CHch\2\u022f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2"+
		"\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2"+
		"\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]"+
		"\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2"+
		"\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2"+
		"\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2"+
		"\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2"+
		"\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093"+
		"\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2"+
		"\2\3\u00a7\3\2\2\2\5\u00a9\3\2\2\2\7\u00b0\3\2\2\2\t\u00b3\3\2\2\2\13"+
		"\u00b7\3\2\2\2\r\u00ba\3\2\2\2\17\u00be\3\2\2\2\21\u00c4\3\2\2\2\23\u00cb"+
		"\3\2\2\2\25\u00d1\3\2\2\2\27\u00d3\3\2\2\2\31\u00d5\3\2\2\2\33\u00d9\3"+
		"\2\2\2\35\u00dc\3\2\2\2\37\u00e0\3\2\2\2!\u00e7\3\2\2\2#\u00ef\3\2\2\2"+
		"%\u00fa\3\2\2\2\'\u0104\3\2\2\2)\u010b\3\2\2\2+\u0113\3\2\2\2-\u0119\3"+
		"\2\2\2/\u011d\3\2\2\2\61\u0124\3\2\2\2\63\u012d\3\2\2\2\65\u0135\3\2\2"+
		"\2\67\u013c\3\2\2\29\u013f\3\2\2\2;\u0145\3\2\2\2=\u0148\3\2\2\2?\u014d"+
		"\3\2\2\2A\u0154\3\2\2\2C\u0158\3\2\2\2E\u015e\3\2\2\2G\u0161\3\2\2\2I"+
		"\u0164\3\2\2\2K\u0168\3\2\2\2M\u016b\3\2\2\2O\u0170\3\2\2\2Q\u0174\3\2"+
		"\2\2S\u017a\3\2\2\2U\u0180\3\2\2\2W\u0186\3\2\2\2Y\u018b\3\2\2\2[\u0192"+
		"\3\2\2\2]\u0195\3\2\2\2_\u0198\3\2\2\2a\u019b\3\2\2\2c\u019e\3\2\2\2e"+
		"\u01a1\3\2\2\2g\u01a4\3\2\2\2i\u01a7\3\2\2\2k\u01a9\3\2\2\2m\u01ab\3\2"+
		"\2\2o\u01ad\3\2\2\2q\u01af\3\2\2\2s\u01b1\3\2\2\2u\u01b3\3\2\2\2w\u01b5"+
		"\3\2\2\2y\u01b7\3\2\2\2{\u01b9\3\2\2\2}\u01bb\3\2\2\2\177\u01bd\3\2\2"+
		"\2\u0081\u01bf\3\2\2\2\u0083\u01c1\3\2\2\2\u0085\u01c3\3\2\2\2\u0087\u01c5"+
		"\3\2\2\2\u0089\u01c7\3\2\2\2\u008b\u01c9\3\2\2\2\u008d\u01cb\3\2\2\2\u008f"+
		"\u01cd\3\2\2\2\u0091\u01d8\3\2\2\2\u0093\u01da\3\2\2\2\u0095\u01e4\3\2"+
		"\2\2\u0097\u01eb\3\2\2\2\u0099\u0208\3\2\2\2\u009b\u020c\3\2\2\2\u009d"+
		"\u0218\3\2\2\2\u009f\u021a\3\2\2\2\u00a1\u021c\3\2\2\2\u00a3\u0221\3\2"+
		"\2\2\u00a5\u0227\3\2\2\2\u00a7\u00a8\7B\2\2\u00a8\4\3\2\2\2\u00a9\u00aa"+
		"\7j\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac\7c\2\2\u00ac\u00ad\7f\2\2\u00ad"+
		"\u00ae\7g\2\2\u00ae\u00af\7t\2\2\u00af\6\3\2\2\2\u00b0\u00b1\7e\2\2\u00b1"+
		"\u00b2\7p\2\2\u00b2\b\3\2\2\2\u00b3\u00b4\7p\2\2\u00b4\u00b5\7g\2\2\u00b5"+
		"\u00b6\7y\2\2\u00b6\n\3\2\2\2\u00b7\u00b8\7c\2\2\u00b8\u00b9\7u\2\2\u00b9"+
		"\f\3\2\2\2\u00ba\u00bb\7u\2\2\u00bb\u00bc\7{\2\2\u00bc\u00bd\7u\2\2\u00bd"+
		"\16\3\2\2\2\u00be\u00bf\7y\2\2\u00bf\u00c0\7t\2\2\u00c0\u00c1\7k\2\2\u00c1"+
		"\u00c2\7v\2\2\u00c2\u00c3\7g\2\2\u00c3\20\3\2\2\2\u00c4\u00c5\7x\2\2\u00c5"+
		"\u00c6\7g\2\2\u00c6\u00c7\7t\2\2\u00c7\u00c8\7k\2\2\u00c8\u00c9\7h\2\2"+
		"\u00c9\u00ca\7{\2\2\u00ca\22\3\2\2\2\u00cb\u00cc\7t\2\2\u00cc\u00cd\7"+
		"c\2\2\u00cd\u00ce\7p\2\2\u00ce\u00cf\7i\2\2\u00cf\u00d0\7g\2\2\u00d0\24"+
		"\3\2\2\2\u00d1\u00d2\7%\2\2\u00d2\26\3\2\2\2\u00d3\u00d4\7\60\2\2\u00d4"+
		"\30\3\2\2\2\u00d5\u00d6\7c\2\2\u00d6\u00d7\7n\2\2\u00d7\u00d8\7n\2\2\u00d8"+
		"\32\3\2\2\2\u00d9\u00da\7q\2\2\u00da\u00db\7p\2\2\u00db\34\3\2\2\2\u00dc"+
		"\u00dd\7g\2\2\u00dd\u00de\7t\2\2\u00de\u00df\7t\2\2\u00df\36\3\2\2\2\u00e0"+
		"\u00e1\7t\2\2\u00e1\u00e2\7g\2\2\u00e2\u00e3\7p\2\2\u00e3\u00e4\7f\2\2"+
		"\u00e4\u00e5\7g\2\2\u00e5\u00e6\7t\2\2\u00e6 \3\2\2\2\u00e7\u00e8\7c\2"+
		"\2\u00e8\u00e9\7f\2\2\u00e9\u00ea\7f\2\2\u00ea\u00eb\7E\2\2\u00eb\u00ec"+
		"\7q\2\2\u00ec\u00ed\7o\2\2\u00ed\u00ee\7r\2\2\u00ee\"\3\2\2\2\u00ef\u00f0"+
		"\7e\2\2\u00f0\u00f1\7j\2\2\u00f1\u00f2\7c\2\2\u00f2\u00f3\7p\2\2\u00f3"+
		"\u00f4\7i\2\2\u00f4\u00f5\7g\2\2\u00f5\u00f6\7V\2\2\u00f6\u00f7\7g\2\2"+
		"\u00f7\u00f8\7z\2\2\u00f8\u00f9\7v\2\2\u00f9$\3\2\2\2\u00fa\u00fb\7h\2"+
		"\2\u00fb\u00fc\7p\2\2\u00fc\u00fd\7\"\2\2\u00fd\u00fe\7o\2\2\u00fe\u00ff"+
		"\7c\2\2\u00ff\u0100\7k\2\2\u0100\u0101\7p\2\2\u0101\u0102\7*\2\2\u0102"+
		"\u0103\7+\2\2\u0103&\3\2\2\2\u0104\u0105\7t\2\2\u0105\u0106\7c\2\2\u0106"+
		"\u0107\7p\2\2\u0107\u0108\7f\2\2\u0108\u0109\7q\2\2\u0109\u010a\7o\2\2"+
		"\u010a(\3\2\2\2\u010b\u010c\7u\2\2\u010c\u010d\7v\2\2\u010d\u010e\7f\2"+
		"\2\u010e\u010f\3\2\2\2\u010f\u0110\5]/\2\u0110\u0111\7n\2\2\u0111\u0112"+
		"\7p\2\2\u0112*\3\2\2\2\u0113\u0114\7c\2\2\u0114\u0115\7u\2\2\u0115\u0116"+
		"\7{\2\2\u0116\u0117\7p\2\2\u0117\u0118\7e\2\2\u0118,\3\2\2\2\u0119\u011a"+
		"\7x\2\2\u011a\u011b\7c\2\2\u011b\u011c\7t\2\2\u011c.\3\2\2\2\u011d\u011e"+
		"\7k\2\2\u011e\u011f\7o\2\2\u011f\u0120\7r\2\2\u0120\u0121\7q\2\2\u0121"+
		"\u0122\7t\2\2\u0122\u0123\7v\2\2\u0123\60\3\2\2\2\u0124\u0125\7u\2\2\u0125"+
		"\u0126\7v\2\2\u0126\u0127\7f\2\2\u0127\u0128\3\2\2\2\u0128\u0129\5]/\2"+
		"\u0129\u012a\7q\2\2\u012a\u012b\7w\2\2\u012b\u012c\7v\2\2\u012c\62\3\2"+
		"\2\2\u012d\u012e\7u\2\2\u012e\u012f\7v\2\2\u012f\u0130\7f\2\2\u0130\u0131"+
		"\3\2\2\2\u0131\u0132\5]/\2\u0132\u0133\7k\2\2\u0133\u0134\7p\2\2\u0134"+
		"\64\3\2\2\2\u0135\u0136\7c\2\2\u0136\u0137\7u\2\2\u0137\u0138\7u\2\2\u0138"+
		"\u0139\7g\2\2\u0139\u013a\7t\2\2\u013a\u013b\7v\2\2\u013b\66\3\2\2\2\u013c"+
		"\u013d\7h\2\2\u013d\u013e\7p\2\2\u013e8\3\2\2\2\u013f\u0140\7v\2\2\u0140"+
		"\u0141\7q\2\2\u0141\u0142\7K\2\2\u0142\u0143\7p\2\2\u0143\u0144\7v\2\2"+
		"\u0144:\3\2\2\2\u0145\u0146\7k\2\2\u0146\u0147\7h\2\2\u0147<\3\2\2\2\u0148"+
		"\u0149\7g\2\2\u0149\u014a\7n\2\2\u014a\u014b\7u\2\2\u014b\u014c\7g\2\2"+
		"\u014c>\3\2\2\2\u014d\u014e\7t\2\2\u014e\u014f\7g\2\2\u014f\u0150\7v\2"+
		"\2\u0150\u0151\7w\2\2\u0151\u0152\7t\2\2\u0152\u0153\7p\2\2\u0153@\3\2"+
		"\2\2\u0154\u0155\7h\2\2\u0155\u0156\7q\2\2\u0156\u0157\7t\2\2\u0157B\3"+
		"\2\2\2\u0158\u0159\7y\2\2\u0159\u015a\7j\2\2\u015a\u015b\7k\2\2\u015b"+
		"\u015c\7n\2\2\u015c\u015d\7g\2\2\u015dD\3\2\2\2\u015e\u015f\7v\2\2\u015f"+
		"\u0160\7q\2\2\u0160F\3\2\2\2\u0161\u0162\7f\2\2\u0162\u0163\7q\2\2\u0163"+
		"H\3\2\2\2\u0164\u0165\7g\2\2\u0165\u0166\7p\2\2\u0166\u0167\7f\2\2\u0167"+
		"J\3\2\2\2\u0168\u0169\7k\2\2\u0169\u016a\7p\2\2\u016aL\3\2\2\2\u016b\u016c"+
		"\7p\2\2\u016c\u016d\7w\2\2\u016d\u016e\7n\2\2\u016e\u016f\7n\2\2\u016f"+
		"N\3\2\2\2\u0170\u0171\7v\2\2\u0171\u0172\7t\2\2\u0172\u0173\7{\2\2\u0173"+
		"P\3\2\2\2\u0174\u0175\7e\2\2\u0175\u0176\7n\2\2\u0176\u0177\7c\2\2\u0177"+
		"\u0178\7u\2\2\u0178\u0179\7u\2\2\u0179R\3\2\2\2\u017a\u017b\7e\2\2\u017b"+
		"\u017c\7q\2\2\u017c\u017d\7p\2\2\u017d\u017e\7u\2\2\u017e\u017f\7v\2\2"+
		"\u017fT\3\2\2\2\u0180\u0181\7p\2\2\u0181\u0182\7q\2\2\u0182\u0183\7x\2"+
		"\2\u0183\u0184\7c\2\2\u0184\u0185\7n\2\2\u0185V\3\2\2\2\u0186\u0187\7"+
		"u\2\2\u0187\u0188\7g\2\2\u0188\u0189\7n\2\2\u0189\u018a\7h\2\2\u018aX"+
		"\3\2\2\2\u018b\u018c\7p\2\2\u018c\u018d\7c\2\2\u018d\u018e\7v\2\2\u018e"+
		"\u018f\7k\2\2\u018f\u0190\7x\2\2\u0190\u0191\7g\2\2\u0191Z\3\2\2\2\u0192"+
		"\u0193\7~\2\2\u0193\u0194\7~\2\2\u0194\\\3\2\2\2\u0195\u0196\7<\2\2\u0196"+
		"\u0197\7<\2\2\u0197^\3\2\2\2\u0198\u0199\7(\2\2\u0199\u019a\7(\2\2\u019a"+
		"`\3\2\2\2\u019b\u019c\7?\2\2\u019c\u019d\7?\2\2\u019db\3\2\2\2\u019e\u019f"+
		"\7#\2\2\u019f\u01a0\7?\2\2\u01a0d\3\2\2\2\u01a1\u01a2\7@\2\2\u01a2\u01a3"+
		"\7?\2\2\u01a3f\3\2\2\2\u01a4\u01a5\7>\2\2\u01a5\u01a6\7?\2\2\u01a6h\3"+
		"\2\2\2\u01a7\u01a8\7`\2\2\u01a8j\3\2\2\2\u01a9\u01aa\7#\2\2\u01aal\3\2"+
		"\2\2\u01ab\u01ac\7@\2\2\u01acn\3\2\2\2\u01ad\u01ae\7>\2\2\u01aep\3\2\2"+
		"\2\u01af\u01b0\7-\2\2\u01b0r\3\2\2\2\u01b1\u01b2\7/\2\2\u01b2t\3\2\2\2"+
		"\u01b3\u01b4\7,\2\2\u01b4v\3\2\2\2\u01b5\u01b6\7\61\2\2\u01b6x\3\2\2\2"+
		"\u01b7\u01b8\7\'\2\2\u01b8z\3\2\2\2\u01b9\u01ba\7}\2\2\u01ba|\3\2\2\2"+
		"\u01bb\u01bc\7\177\2\2\u01bc~\3\2\2\2\u01bd\u01be\7]\2\2\u01be\u0080\3"+
		"\2\2\2\u01bf\u01c0\7_\2\2\u01c0\u0082\3\2\2\2\u01c1\u01c2\7*\2\2\u01c2"+
		"\u0084\3\2\2\2\u01c3\u01c4\7+\2\2\u01c4\u0086\3\2\2\2\u01c5\u01c6\7=\2"+
		"\2\u01c6\u0088\3\2\2\2\u01c7\u01c8\7?\2\2\u01c8\u008a\3\2\2\2\u01c9\u01ca"+
		"\7.\2\2\u01ca\u008c\3\2\2\2\u01cb\u01cc\7A\2\2\u01cc\u008e\3\2\2\2\u01cd"+
		"\u01ce\7<\2\2\u01ce\u0090\3\2\2\2\u01cf\u01d0\7v\2\2\u01d0\u01d1\7t\2"+
		"\2\u01d1\u01d2\7w\2\2\u01d2\u01d9\7g\2\2\u01d3\u01d4\7h\2\2\u01d4\u01d5"+
		"\7c\2\2\u01d5\u01d6\7n\2\2\u01d6\u01d7\7u\2\2\u01d7\u01d9\7g\2\2\u01d8"+
		"\u01cf\3\2\2\2\u01d8\u01d3\3\2\2\2\u01d9\u0092\3\2\2\2\u01da\u01e2\5\u009d"+
		"O\2\u01db\u01df\7\60\2\2\u01dc\u01de\5\u009fP\2\u01dd\u01dc\3\2\2\2\u01de"+
		"\u01e1\3\2\2\2\u01df\u01dd\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e3\3\2"+
		"\2\2\u01e1\u01df\3\2\2\2\u01e2\u01db\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3"+
		"\u0094\3\2\2\2\u01e4\u01e8\t\2\2\2\u01e5\u01e7\t\3\2\2\u01e6\u01e5\3\2"+
		"\2\2\u01e7\u01ea\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9"+
		"\u0096\3\2\2\2\u01ea\u01e8\3\2\2\2\u01eb\u01ee\7$\2\2\u01ec\u01ef\5\u00a1"+
		"Q\2\u01ed\u01ef\n\4\2\2\u01ee\u01ec\3\2\2\2\u01ee\u01ed\3\2\2\2\u01ef"+
		"\u01f0\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f2\3\2"+
		"\2\2\u01f2\u01f3\7$\2\2\u01f3\u0098\3\2\2\2\u01f4\u01f5\7\61\2\2\u01f5"+
		"\u01f6\7\61\2\2\u01f6\u01fa\3\2\2\2\u01f7\u01f9\n\5\2\2\u01f8\u01f7\3"+
		"\2\2\2\u01f9\u01fc\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb"+
		"\u0209\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fd\u01fe\7\61\2\2\u01fe\u01ff\7"+
		",\2\2\u01ff\u0203\3\2\2\2\u0200\u0202\13\2\2\2\u0201\u0200\3\2\2\2\u0202"+
		"\u0205\3\2\2\2\u0203\u0204\3\2\2\2\u0203\u0201\3\2\2\2\u0204\u0206\3\2"+
		"\2\2\u0205\u0203\3\2\2\2\u0206\u0207\7,\2\2\u0207\u0209\7\61\2\2\u0208"+
		"\u01f4\3\2\2\2\u0208\u01fd\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u020b\bM"+
		"\2\2\u020b\u009a\3\2\2\2\u020c\u020d\t\6\2\2\u020d\u020e\3\2\2\2\u020e"+
		"\u020f\bN\2\2\u020f\u009c\3\2\2\2\u0210\u0214\t\7\2\2\u0211\u0213\5\u009f"+
		"P\2\u0212\u0211\3\2\2\2\u0213\u0216\3\2\2\2\u0214\u0212\3\2\2\2\u0214"+
		"\u0215\3\2\2\2\u0215\u0219\3\2\2\2\u0216\u0214\3\2\2\2\u0217\u0219\7\62"+
		"\2\2\u0218\u0210\3\2\2\2\u0218\u0217\3\2\2\2\u0219\u009e\3\2\2\2\u021a"+
		"\u021b\t\b\2\2\u021b\u00a0\3\2\2\2\u021c\u021f\7^\2\2\u021d\u0220\t\t"+
		"\2\2\u021e\u0220\5\u00a3R\2\u021f\u021d\3\2\2\2\u021f\u021e\3\2\2\2\u0220"+
		"\u00a2\3\2\2\2\u0221\u0222\7w\2\2\u0222\u0223\5\u00a5S\2\u0223\u0224\5"+
		"\u00a5S\2\u0224\u0225\5\u00a5S\2\u0225\u0226\5\u00a5S\2\u0226\u00a4\3"+
		"\2\2\2\u0227\u0228\t\n\2\2\u0228\u00a6\3\2\2\2\17\2\u01d8\u01df\u01e2"+
		"\u01e8\u01ee\u01f0\u01fa\u0203\u0208\u0214\u0218\u021f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}