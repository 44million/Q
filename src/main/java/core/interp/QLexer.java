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
		T__17=18, T__18=19, Println=20, Render=21, AddComponent=22, New=23, Var=24, 
		Import=25, Print=26, Input=27, Assert=28, Def=29, ToInt=30, Create=31, 
		If=32, Else=33, Return=34, For=35, While=36, To=37, Do=38, End=39, In=40, 
		Null=41, Try=42, Catch=43, Class=44, Or=45, And=46, Equals=47, NEquals=48, 
		GTEquals=49, LTEquals=50, Pow=51, Excl=52, GT=53, LT=54, Add=55, Subtract=56, 
		Multiply=57, Divide=58, Modulus=59, OBrace=60, CBrace=61, OBracket=62, 
		CBracket=63, OParen=64, CParen=65, SColon=66, Assign=67, Comma=68, QMark=69, 
		Colon=70, Bool=71, Number=72, Identifier=73, String=74, Comment=75, JavaTextBlock=76, 
		Space=77;
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
			"T__17", "T__18", "Println", "Render", "AddComponent", "New", "Var", 
			"Import", "Print", "Input", "Assert", "Def", "ToInt", "Create", "If", 
			"Else", "Return", "For", "While", "To", "Do", "End", "In", "Null", "Try", 
			"Catch", "Class", "Or", "And", "Equals", "NEquals", "GTEquals", "LTEquals", 
			"Pow", "Excl", "GT", "LT", "Add", "Subtract", "Multiply", "Divide", "Modulus", 
			"OBrace", "CBrace", "OBracket", "CBracket", "OParen", "CParen", "SColon", 
			"Assign", "Comma", "QMark", "Colon", "Bool", "Number", "Identifier", 
			"String", "Comment", "JavaTextBlock", "Space", "Int", "Digit"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'@'", "'header'", "'const'", "'as'", "'List'", "'add'", 
			"'remove'", "'sys'", "'write'", "'verify'", "'noval'", "'range'", "'#'", 
			"'all'", "'onflaw'", "'changeText'", "'func main()'", "'endc'", "'std:ln'", 
			"'render'", "'addComp'", "'new'", "'var'", "'import'", "'std:out'", "'std:in'", 
			"'assert'", "'func'", "'toInt'", "'create'", "'if'", "'else'", "'return'", 
			"'for'", "'while'", "'to'", "'do'", "'end'", "'in'", "'null'", "'try'", 
			"'catch'", "'class'", "'||'", "'&&'", "'=='", "'!='", "'>='", "'<='", 
			"'^'", "'!'", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'%'", "'{'", 
			"'}'", "'['", "']'", "'('", "')'", "';'", "'='", "','", "'?'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "Println", "Render", 
			"AddComponent", "New", "Var", "Import", "Print", "Input", "Assert", "Def", 
			"ToInt", "Create", "If", "Else", "Return", "For", "While", "To", "Do", 
			"End", "In", "Null", "Try", "Catch", "Class", "Or", "And", "Equals", 
			"NEquals", "GTEquals", "LTEquals", "Pow", "Excl", "GT", "LT", "Add", 
			"Subtract", "Multiply", "Divide", "Modulus", "OBrace", "CBrace", "OBracket", 
			"CBracket", "OParen", "CParen", "SColon", "Assign", "Comma", "QMark", 
			"Colon", "Bool", "Number", "Identifier", "String", "Comment", "JavaTextBlock", 
			"Space"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2O\u0232\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3"+
		"\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3\"\3"+
		"\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3"+
		"&\3&\3\'\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\3+\3,\3"+
		",\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61"+
		"\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66"+
		"\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3"+
		"A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3H\3H\3H\3H\3H\3H\3H\5H\u01d7"+
		"\nH\3I\3I\3I\7I\u01dc\nI\fI\16I\u01df\13I\5I\u01e1\nI\3J\3J\7J\u01e5\n"+
		"J\fJ\16J\u01e8\13J\3K\3K\3K\3K\7K\u01ee\nK\fK\16K\u01f1\13K\3K\3K\3K\3"+
		"K\3K\7K\u01f8\nK\fK\16K\u01fb\13K\3K\5K\u01fe\nK\3L\3L\3L\3L\7L\u0204"+
		"\nL\fL\16L\u0207\13L\3L\3L\3L\3L\7L\u020d\nL\fL\16L\u0210\13L\3L\3L\5"+
		"L\u0214\nL\3L\3L\3M\3M\3M\3M\7M\u021c\nM\fM\16M\u021f\13M\3M\3M\3N\3N"+
		"\3N\3N\3O\3O\7O\u0229\nO\fO\16O\u022c\13O\3O\5O\u022f\nO\3P\3P\3\u020e"+
		"\2Q\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67"+
		"m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008d"+
		"H\u008fI\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009d\2\u009f\2\3\2"+
		"\f\5\2C\\aac|\6\2\62;C\\aac|\3\2$$\6\2\f\f\17\17$$^^\4\2\f\f\17\17\3\2"+
		"))\6\2\f\f\17\17))^^\5\2\13\f\16\17\"\"\3\2\63;\3\2\62;\2\u023f\2\3\3"+
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
		"\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\3\u00a1\3\2\2\2\5\u00a3\3\2\2"+
		"\2\7\u00a5\3\2\2\2\t\u00ac\3\2\2\2\13\u00b2\3\2\2\2\r\u00b5\3\2\2\2\17"+
		"\u00ba\3\2\2\2\21\u00be\3\2\2\2\23\u00c5\3\2\2\2\25\u00c9\3\2\2\2\27\u00cf"+
		"\3\2\2\2\31\u00d6\3\2\2\2\33\u00dc\3\2\2\2\35\u00e2\3\2\2\2\37\u00e4\3"+
		"\2\2\2!\u00e8\3\2\2\2#\u00ef\3\2\2\2%\u00fa\3\2\2\2\'\u0106\3\2\2\2)\u010b"+
		"\3\2\2\2+\u0112\3\2\2\2-\u0119\3\2\2\2/\u0121\3\2\2\2\61\u0125\3\2\2\2"+
		"\63\u0129\3\2\2\2\65\u0130\3\2\2\2\67\u0138\3\2\2\29\u013f\3\2\2\2;\u0146"+
		"\3\2\2\2=\u014b\3\2\2\2?\u0151\3\2\2\2A\u0158\3\2\2\2C\u015b\3\2\2\2E"+
		"\u0160\3\2\2\2G\u0167\3\2\2\2I\u016b\3\2\2\2K\u0171\3\2\2\2M\u0174\3\2"+
		"\2\2O\u0177\3\2\2\2Q\u017b\3\2\2\2S\u017e\3\2\2\2U\u0183\3\2\2\2W\u0187"+
		"\3\2\2\2Y\u018d\3\2\2\2[\u0193\3\2\2\2]\u0196\3\2\2\2_\u0199\3\2\2\2a"+
		"\u019c\3\2\2\2c\u019f\3\2\2\2e\u01a2\3\2\2\2g\u01a5\3\2\2\2i\u01a7\3\2"+
		"\2\2k\u01a9\3\2\2\2m\u01ab\3\2\2\2o\u01ad\3\2\2\2q\u01af\3\2\2\2s\u01b1"+
		"\3\2\2\2u\u01b3\3\2\2\2w\u01b5\3\2\2\2y\u01b7\3\2\2\2{\u01b9\3\2\2\2}"+
		"\u01bb\3\2\2\2\177\u01bd\3\2\2\2\u0081\u01bf\3\2\2\2\u0083\u01c1\3\2\2"+
		"\2\u0085\u01c3\3\2\2\2\u0087\u01c5\3\2\2\2\u0089\u01c7\3\2\2\2\u008b\u01c9"+
		"\3\2\2\2\u008d\u01cb\3\2\2\2\u008f\u01d6\3\2\2\2\u0091\u01d8\3\2\2\2\u0093"+
		"\u01e2\3\2\2\2\u0095\u01fd\3\2\2\2\u0097\u0213\3\2\2\2\u0099\u0217\3\2"+
		"\2\2\u009b\u0222\3\2\2\2\u009d\u022e\3\2\2\2\u009f\u0230\3\2\2\2\u00a1"+
		"\u00a2\7\60\2\2\u00a2\4\3\2\2\2\u00a3\u00a4\7B\2\2\u00a4\6\3\2\2\2\u00a5"+
		"\u00a6\7j\2\2\u00a6\u00a7\7g\2\2\u00a7\u00a8\7c\2\2\u00a8\u00a9\7f\2\2"+
		"\u00a9\u00aa\7g\2\2\u00aa\u00ab\7t\2\2\u00ab\b\3\2\2\2\u00ac\u00ad\7e"+
		"\2\2\u00ad\u00ae\7q\2\2\u00ae\u00af\7p\2\2\u00af\u00b0\7u\2\2\u00b0\u00b1"+
		"\7v\2\2\u00b1\n\3\2\2\2\u00b2\u00b3\7c\2\2\u00b3\u00b4\7u\2\2\u00b4\f"+
		"\3\2\2\2\u00b5\u00b6\7N\2\2\u00b6\u00b7\7k\2\2\u00b7\u00b8\7u\2\2\u00b8"+
		"\u00b9\7v\2\2\u00b9\16\3\2\2\2\u00ba\u00bb\7c\2\2\u00bb\u00bc\7f\2\2\u00bc"+
		"\u00bd\7f\2\2\u00bd\20\3\2\2\2\u00be\u00bf\7t\2\2\u00bf\u00c0\7g\2\2\u00c0"+
		"\u00c1\7o\2\2\u00c1\u00c2\7q\2\2\u00c2\u00c3\7x\2\2\u00c3\u00c4\7g\2\2"+
		"\u00c4\22\3\2\2\2\u00c5\u00c6\7u\2\2\u00c6\u00c7\7{\2\2\u00c7\u00c8\7"+
		"u\2\2\u00c8\24\3\2\2\2\u00c9\u00ca\7y\2\2\u00ca\u00cb\7t\2\2\u00cb\u00cc"+
		"\7k\2\2\u00cc\u00cd\7v\2\2\u00cd\u00ce\7g\2\2\u00ce\26\3\2\2\2\u00cf\u00d0"+
		"\7x\2\2\u00d0\u00d1\7g\2\2\u00d1\u00d2\7t\2\2\u00d2\u00d3\7k\2\2\u00d3"+
		"\u00d4\7h\2\2\u00d4\u00d5\7{\2\2\u00d5\30\3\2\2\2\u00d6\u00d7\7p\2\2\u00d7"+
		"\u00d8\7q\2\2\u00d8\u00d9\7x\2\2\u00d9\u00da\7c\2\2\u00da\u00db\7n\2\2"+
		"\u00db\32\3\2\2\2\u00dc\u00dd\7t\2\2\u00dd\u00de\7c\2\2\u00de\u00df\7"+
		"p\2\2\u00df\u00e0\7i\2\2\u00e0\u00e1\7g\2\2\u00e1\34\3\2\2\2\u00e2\u00e3"+
		"\7%\2\2\u00e3\36\3\2\2\2\u00e4\u00e5\7c\2\2\u00e5\u00e6\7n\2\2\u00e6\u00e7"+
		"\7n\2\2\u00e7 \3\2\2\2\u00e8\u00e9\7q\2\2\u00e9\u00ea\7p\2\2\u00ea\u00eb"+
		"\7h\2\2\u00eb\u00ec\7n\2\2\u00ec\u00ed\7c\2\2\u00ed\u00ee\7y\2\2\u00ee"+
		"\"\3\2\2\2\u00ef\u00f0\7e\2\2\u00f0\u00f1\7j\2\2\u00f1\u00f2\7c\2\2\u00f2"+
		"\u00f3\7p\2\2\u00f3\u00f4\7i\2\2\u00f4\u00f5\7g\2\2\u00f5\u00f6\7V\2\2"+
		"\u00f6\u00f7\7g\2\2\u00f7\u00f8\7z\2\2\u00f8\u00f9\7v\2\2\u00f9$\3\2\2"+
		"\2\u00fa\u00fb\7h\2\2\u00fb\u00fc\7w\2\2\u00fc\u00fd\7p\2\2\u00fd\u00fe"+
		"\7e\2\2\u00fe\u00ff\7\"\2\2\u00ff\u0100\7o\2\2\u0100\u0101\7c\2\2\u0101"+
		"\u0102\7k\2\2\u0102\u0103\7p\2\2\u0103\u0104\7*\2\2\u0104\u0105\7+\2\2"+
		"\u0105&\3\2\2\2\u0106\u0107\7g\2\2\u0107\u0108\7p\2\2\u0108\u0109\7f\2"+
		"\2\u0109\u010a\7e\2\2\u010a(\3\2\2\2\u010b\u010c\7u\2\2\u010c\u010d\7"+
		"v\2\2\u010d\u010e\7f\2\2\u010e\u010f\7<\2\2\u010f\u0110\7n\2\2\u0110\u0111"+
		"\7p\2\2\u0111*\3\2\2\2\u0112\u0113\7t\2\2\u0113\u0114\7g\2\2\u0114\u0115"+
		"\7p\2\2\u0115\u0116\7f\2\2\u0116\u0117\7g\2\2\u0117\u0118\7t\2\2\u0118"+
		",\3\2\2\2\u0119\u011a\7c\2\2\u011a\u011b\7f\2\2\u011b\u011c\7f\2\2\u011c"+
		"\u011d\7E\2\2\u011d\u011e\7q\2\2\u011e\u011f\7o\2\2\u011f\u0120\7r\2\2"+
		"\u0120.\3\2\2\2\u0121\u0122\7p\2\2\u0122\u0123\7g\2\2\u0123\u0124\7y\2"+
		"\2\u0124\60\3\2\2\2\u0125\u0126\7x\2\2\u0126\u0127\7c\2\2\u0127\u0128"+
		"\7t\2\2\u0128\62\3\2\2\2\u0129\u012a\7k\2\2\u012a\u012b\7o\2\2\u012b\u012c"+
		"\7r\2\2\u012c\u012d\7q\2\2\u012d\u012e\7t\2\2\u012e\u012f\7v\2\2\u012f"+
		"\64\3\2\2\2\u0130\u0131\7u\2\2\u0131\u0132\7v\2\2\u0132\u0133\7f\2\2\u0133"+
		"\u0134\7<\2\2\u0134\u0135\7q\2\2\u0135\u0136\7w\2\2\u0136\u0137\7v\2\2"+
		"\u0137\66\3\2\2\2\u0138\u0139\7u\2\2\u0139\u013a\7v\2\2\u013a\u013b\7"+
		"f\2\2\u013b\u013c\7<\2\2\u013c\u013d\7k\2\2\u013d\u013e\7p\2\2\u013e8"+
		"\3\2\2\2\u013f\u0140\7c\2\2\u0140\u0141\7u\2\2\u0141\u0142\7u\2\2\u0142"+
		"\u0143\7g\2\2\u0143\u0144\7t\2\2\u0144\u0145\7v\2\2\u0145:\3\2\2\2\u0146"+
		"\u0147\7h\2\2\u0147\u0148\7w\2\2\u0148\u0149\7p\2\2\u0149\u014a\7e\2\2"+
		"\u014a<\3\2\2\2\u014b\u014c\7v\2\2\u014c\u014d\7q\2\2\u014d\u014e\7K\2"+
		"\2\u014e\u014f\7p\2\2\u014f\u0150\7v\2\2\u0150>\3\2\2\2\u0151\u0152\7"+
		"e\2\2\u0152\u0153\7t\2\2\u0153\u0154\7g\2\2\u0154\u0155\7c\2\2\u0155\u0156"+
		"\7v\2\2\u0156\u0157\7g\2\2\u0157@\3\2\2\2\u0158\u0159\7k\2\2\u0159\u015a"+
		"\7h\2\2\u015aB\3\2\2\2\u015b\u015c\7g\2\2\u015c\u015d\7n\2\2\u015d\u015e"+
		"\7u\2\2\u015e\u015f\7g\2\2\u015fD\3\2\2\2\u0160\u0161\7t\2\2\u0161\u0162"+
		"\7g\2\2\u0162\u0163\7v\2\2\u0163\u0164\7w\2\2\u0164\u0165\7t\2\2\u0165"+
		"\u0166\7p\2\2\u0166F\3\2\2\2\u0167\u0168\7h\2\2\u0168\u0169\7q\2\2\u0169"+
		"\u016a\7t\2\2\u016aH\3\2\2\2\u016b\u016c\7y\2\2\u016c\u016d\7j\2\2\u016d"+
		"\u016e\7k\2\2\u016e\u016f\7n\2\2\u016f\u0170\7g\2\2\u0170J\3\2\2\2\u0171"+
		"\u0172\7v\2\2\u0172\u0173\7q\2\2\u0173L\3\2\2\2\u0174\u0175\7f\2\2\u0175"+
		"\u0176\7q\2\2\u0176N\3\2\2\2\u0177\u0178\7g\2\2\u0178\u0179\7p\2\2\u0179"+
		"\u017a\7f\2\2\u017aP\3\2\2\2\u017b\u017c\7k\2\2\u017c\u017d\7p\2\2\u017d"+
		"R\3\2\2\2\u017e\u017f\7p\2\2\u017f\u0180\7w\2\2\u0180\u0181\7n\2\2\u0181"+
		"\u0182\7n\2\2\u0182T\3\2\2\2\u0183\u0184\7v\2\2\u0184\u0185\7t\2\2\u0185"+
		"\u0186\7{\2\2\u0186V\3\2\2\2\u0187\u0188\7e\2\2\u0188\u0189\7c\2\2\u0189"+
		"\u018a\7v\2\2\u018a\u018b\7e\2\2\u018b\u018c\7j\2\2\u018cX\3\2\2\2\u018d"+
		"\u018e\7e\2\2\u018e\u018f\7n\2\2\u018f\u0190\7c\2\2\u0190\u0191\7u\2\2"+
		"\u0191\u0192\7u\2\2\u0192Z\3\2\2\2\u0193\u0194\7~\2\2\u0194\u0195\7~\2"+
		"\2\u0195\\\3\2\2\2\u0196\u0197\7(\2\2\u0197\u0198\7(\2\2\u0198^\3\2\2"+
		"\2\u0199\u019a\7?\2\2\u019a\u019b\7?\2\2\u019b`\3\2\2\2\u019c\u019d\7"+
		"#\2\2\u019d\u019e\7?\2\2\u019eb\3\2\2\2\u019f\u01a0\7@\2\2\u01a0\u01a1"+
		"\7?\2\2\u01a1d\3\2\2\2\u01a2\u01a3\7>\2\2\u01a3\u01a4\7?\2\2\u01a4f\3"+
		"\2\2\2\u01a5\u01a6\7`\2\2\u01a6h\3\2\2\2\u01a7\u01a8\7#\2\2\u01a8j\3\2"+
		"\2\2\u01a9\u01aa\7@\2\2\u01aal\3\2\2\2\u01ab\u01ac\7>\2\2\u01acn\3\2\2"+
		"\2\u01ad\u01ae\7-\2\2\u01aep\3\2\2\2\u01af\u01b0\7/\2\2\u01b0r\3\2\2\2"+
		"\u01b1\u01b2\7,\2\2\u01b2t\3\2\2\2\u01b3\u01b4\7\61\2\2\u01b4v\3\2\2\2"+
		"\u01b5\u01b6\7\'\2\2\u01b6x\3\2\2\2\u01b7\u01b8\7}\2\2\u01b8z\3\2\2\2"+
		"\u01b9\u01ba\7\177\2\2\u01ba|\3\2\2\2\u01bb\u01bc\7]\2\2\u01bc~\3\2\2"+
		"\2\u01bd\u01be\7_\2\2\u01be\u0080\3\2\2\2\u01bf\u01c0\7*\2\2\u01c0\u0082"+
		"\3\2\2\2\u01c1\u01c2\7+\2\2\u01c2\u0084\3\2\2\2\u01c3\u01c4\7=\2\2\u01c4"+
		"\u0086\3\2\2\2\u01c5\u01c6\7?\2\2\u01c6\u0088\3\2\2\2\u01c7\u01c8\7.\2"+
		"\2\u01c8\u008a\3\2\2\2\u01c9\u01ca\7A\2\2\u01ca\u008c\3\2\2\2\u01cb\u01cc"+
		"\7<\2\2\u01cc\u008e\3\2\2\2\u01cd\u01ce\7v\2\2\u01ce\u01cf\7t\2\2\u01cf"+
		"\u01d0\7w\2\2\u01d0\u01d7\7g\2\2\u01d1\u01d2\7h\2\2\u01d2\u01d3\7c\2\2"+
		"\u01d3\u01d4\7n\2\2\u01d4\u01d5\7u\2\2\u01d5\u01d7\7g\2\2\u01d6\u01cd"+
		"\3\2\2\2\u01d6\u01d1\3\2\2\2\u01d7\u0090\3\2\2\2\u01d8\u01e0\5\u009dO"+
		"\2\u01d9\u01dd\7\60\2\2\u01da\u01dc\5\u009fP\2\u01db\u01da\3\2\2\2\u01dc"+
		"\u01df\3\2\2\2\u01dd\u01db\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01e1\3\2"+
		"\2\2\u01df\u01dd\3\2\2\2\u01e0\u01d9\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1"+
		"\u0092\3\2\2\2\u01e2\u01e6\t\2\2\2\u01e3\u01e5\t\3\2\2\u01e4\u01e3\3\2"+
		"\2\2\u01e5\u01e8\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7"+
		"\u0094\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e9\u01ef\t\4\2\2\u01ea\u01ee\n\5"+
		"\2\2\u01eb\u01ec\7^\2\2\u01ec\u01ee\n\6\2\2\u01ed\u01ea\3\2\2\2\u01ed"+
		"\u01eb\3\2\2\2\u01ee\u01f1\3\2\2\2\u01ef\u01ed\3\2\2\2\u01ef\u01f0\3\2"+
		"\2\2\u01f0\u01f2\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f2\u01fe\t\4\2\2\u01f3"+
		"\u01f9\t\7\2\2\u01f4\u01f8\n\b\2\2\u01f5\u01f6\7^\2\2\u01f6\u01f8\n\6"+
		"\2\2\u01f7\u01f4\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f8\u01fb\3\2\2\2\u01f9"+
		"\u01f7\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01fc\3\2\2\2\u01fb\u01f9\3\2"+
		"\2\2\u01fc\u01fe\t\7\2\2\u01fd\u01e9\3\2\2\2\u01fd\u01f3\3\2\2\2\u01fe"+
		"\u0096\3\2\2\2\u01ff\u0200\7\61\2\2\u0200\u0201\7\61\2\2\u0201\u0205\3"+
		"\2\2\2\u0202\u0204\n\6\2\2\u0203\u0202\3\2\2\2\u0204\u0207\3\2\2\2\u0205"+
		"\u0203\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u0214\3\2\2\2\u0207\u0205\3\2"+
		"\2\2\u0208\u0209\7\61\2\2\u0209\u020a\7,\2\2\u020a\u020e\3\2\2\2\u020b"+
		"\u020d\13\2\2\2\u020c\u020b\3\2\2\2\u020d\u0210\3\2\2\2\u020e\u020f\3"+
		"\2\2\2\u020e\u020c\3\2\2\2\u020f\u0211\3\2\2\2\u0210\u020e\3\2\2\2\u0211"+
		"\u0212\7,\2\2\u0212\u0214\7\61\2\2\u0213\u01ff\3\2\2\2\u0213\u0208\3\2"+
		"\2\2\u0214\u0215\3\2\2\2\u0215\u0216\bL\2\2\u0216\u0098\3\2\2\2\u0217"+
		"\u021d\t\4\2\2\u0218\u021c\n\4\2\2\u0219\u021a\7^\2\2\u021a\u021c\n\6"+
		"\2\2\u021b\u0218\3\2\2\2\u021b\u0219\3\2\2\2\u021c\u021f\3\2\2\2\u021d"+
		"\u021b\3\2\2\2\u021d\u021e\3\2\2\2\u021e\u0220\3\2\2\2\u021f\u021d\3\2"+
		"\2\2\u0220\u0221\t\4\2\2\u0221\u009a\3\2\2\2\u0222\u0223\t\t\2\2\u0223"+
		"\u0224\3\2\2\2\u0224\u0225\bN\2\2\u0225\u009c\3\2\2\2\u0226\u022a\t\n"+
		"\2\2\u0227\u0229\5\u009fP\2\u0228\u0227\3\2\2\2\u0229\u022c\3\2\2\2\u022a"+
		"\u0228\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u022f\3\2\2\2\u022c\u022a\3\2"+
		"\2\2\u022d\u022f\7\62\2\2\u022e\u0226\3\2\2\2\u022e\u022d\3\2\2\2\u022f"+
		"\u009e\3\2\2\2\u0230\u0231\t\13\2\2\u0231\u00a0\3\2\2\2\23\2\u01d6\u01dd"+
		"\u01e0\u01e6\u01ed\u01ef\u01f7\u01f9\u01fd\u0205\u020e\u0213\u021b\u021d"+
		"\u022a\u022e\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}