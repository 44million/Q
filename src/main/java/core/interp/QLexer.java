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
		Println=18, Render=19, AddComponent=20, New=21, Var=22, Import=23, Print=24, 
		Input=25, Assert=26, Def=27, ToInt=28, Create=29, If=30, Else=31, Return=32, 
		For=33, While=34, To=35, Do=36, End=37, In=38, Null=39, Try=40, Catch=41, 
		Class=42, Or=43, And=44, Equals=45, NEquals=46, GTEquals=47, LTEquals=48, 
		Pow=49, Excl=50, GT=51, LT=52, Add=53, Subtract=54, Multiply=55, Divide=56, 
		Modulus=57, OBrace=58, CBrace=59, OBracket=60, CBracket=61, OParen=62, 
		CParen=63, SColon=64, Assign=65, Comma=66, QMark=67, Colon=68, Bool=69, 
		Number=70, Identifier=71, String=72, Comment=73, JavaTextBlock=74, Space=75;
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
			"Println", "Render", "AddComponent", "New", "Var", "Import", "Print", 
			"Input", "Assert", "Def", "ToInt", "Create", "If", "Else", "Return", 
			"For", "While", "To", "Do", "End", "In", "Null", "Try", "Catch", "Class", 
			"Or", "And", "Equals", "NEquals", "GTEquals", "LTEquals", "Pow", "Excl", 
			"GT", "LT", "Add", "Subtract", "Multiply", "Divide", "Modulus", "OBrace", 
			"CBrace", "OBracket", "CBracket", "OParen", "CParen", "SColon", "Assign", 
			"Comma", "QMark", "Colon", "Bool", "Number", "Identifier", "String", 
			"Comment", "JavaTextBlock", "Space", "Int", "Digit"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2M\u0228\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!"+
		"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3&\3&\3"+
		"\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3"+
		"+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61"+
		"\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39"+
		"\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D"+
		"\3E\3E\3F\3F\3F\3F\3F\3F\3F\3F\3F\5F\u01cd\nF\3G\3G\3G\7G\u01d2\nG\fG"+
		"\16G\u01d5\13G\5G\u01d7\nG\3H\3H\7H\u01db\nH\fH\16H\u01de\13H\3I\3I\3"+
		"I\3I\7I\u01e4\nI\fI\16I\u01e7\13I\3I\3I\3I\3I\3I\7I\u01ee\nI\fI\16I\u01f1"+
		"\13I\3I\5I\u01f4\nI\3J\3J\3J\3J\7J\u01fa\nJ\fJ\16J\u01fd\13J\3J\3J\3J"+
		"\3J\7J\u0203\nJ\fJ\16J\u0206\13J\3J\3J\5J\u020a\nJ\3J\3J\3K\3K\3K\3K\7"+
		"K\u0212\nK\fK\16K\u0215\13K\3K\3K\3L\3L\3L\3L\3M\3M\7M\u021f\nM\fM\16"+
		"M\u0222\13M\3M\5M\u0225\nM\3N\3N\3\u0204\2O\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+"+
		"U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081"+
		"B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095"+
		"L\u0097M\u0099\2\u009b\2\3\2\f\5\2C\\aac|\6\2\62;C\\aac|\3\2$$\6\2\f\f"+
		"\17\17$$^^\4\2\f\f\17\17\3\2))\6\2\f\f\17\17))^^\5\2\13\f\16\17\"\"\3"+
		"\2\63;\3\2\62;\2\u0235\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3"+
		"\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2"+
		"\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2"+
		"w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2"+
		"\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b"+
		"\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2"+
		"\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\3\u009d\3\2\2\2\5\u009f\3\2\2\2\7\u00a1"+
		"\3\2\2\2\t\u00a8\3\2\2\2\13\u00ae\3\2\2\2\r\u00b3\3\2\2\2\17\u00b7\3\2"+
		"\2\2\21\u00be\3\2\2\2\23\u00c2\3\2\2\2\25\u00c8\3\2\2\2\27\u00cf\3\2\2"+
		"\2\31\u00d5\3\2\2\2\33\u00db\3\2\2\2\35\u00dd\3\2\2\2\37\u00e4\3\2\2\2"+
		"!\u00ef\3\2\2\2#\u00fb\3\2\2\2%\u0100\3\2\2\2\'\u0107\3\2\2\2)\u010e\3"+
		"\2\2\2+\u0116\3\2\2\2-\u011a\3\2\2\2/\u011e\3\2\2\2\61\u0125\3\2\2\2\63"+
		"\u012d\3\2\2\2\65\u0134\3\2\2\2\67\u013b\3\2\2\29\u0140\3\2\2\2;\u0146"+
		"\3\2\2\2=\u014d\3\2\2\2?\u0150\3\2\2\2A\u0155\3\2\2\2C\u015c\3\2\2\2E"+
		"\u0160\3\2\2\2G\u0166\3\2\2\2I\u0169\3\2\2\2K\u016c\3\2\2\2M\u0171\3\2"+
		"\2\2O\u0174\3\2\2\2Q\u0179\3\2\2\2S\u017d\3\2\2\2U\u0183\3\2\2\2W\u0189"+
		"\3\2\2\2Y\u018c\3\2\2\2[\u018f\3\2\2\2]\u0192\3\2\2\2_\u0195\3\2\2\2a"+
		"\u0198\3\2\2\2c\u019b\3\2\2\2e\u019d\3\2\2\2g\u019f\3\2\2\2i\u01a1\3\2"+
		"\2\2k\u01a3\3\2\2\2m\u01a5\3\2\2\2o\u01a7\3\2\2\2q\u01a9\3\2\2\2s\u01ab"+
		"\3\2\2\2u\u01ad\3\2\2\2w\u01af\3\2\2\2y\u01b1\3\2\2\2{\u01b3\3\2\2\2}"+
		"\u01b5\3\2\2\2\177\u01b7\3\2\2\2\u0081\u01b9\3\2\2\2\u0083\u01bb\3\2\2"+
		"\2\u0085\u01bd\3\2\2\2\u0087\u01bf\3\2\2\2\u0089\u01c1\3\2\2\2\u008b\u01cc"+
		"\3\2\2\2\u008d\u01ce\3\2\2\2\u008f\u01d8\3\2\2\2\u0091\u01f3\3\2\2\2\u0093"+
		"\u0209\3\2\2\2\u0095\u020d\3\2\2\2\u0097\u0218\3\2\2\2\u0099\u0224\3\2"+
		"\2\2\u009b\u0226\3\2\2\2\u009d\u009e\7\60\2\2\u009e\4\3\2\2\2\u009f\u00a0"+
		"\7B\2\2\u00a0\6\3\2\2\2\u00a1\u00a2\7j\2\2\u00a2\u00a3\7g\2\2\u00a3\u00a4"+
		"\7c\2\2\u00a4\u00a5\7f\2\2\u00a5\u00a6\7g\2\2\u00a6\u00a7\7t\2\2\u00a7"+
		"\b\3\2\2\2\u00a8\u00a9\7e\2\2\u00a9\u00aa\7q\2\2\u00aa\u00ab\7p\2\2\u00ab"+
		"\u00ac\7u\2\2\u00ac\u00ad\7v\2\2\u00ad\n\3\2\2\2\u00ae\u00af\7N\2\2\u00af"+
		"\u00b0\7k\2\2\u00b0\u00b1\7u\2\2\u00b1\u00b2\7v\2\2\u00b2\f\3\2\2\2\u00b3"+
		"\u00b4\7c\2\2\u00b4\u00b5\7f\2\2\u00b5\u00b6\7f\2\2\u00b6\16\3\2\2\2\u00b7"+
		"\u00b8\7t\2\2\u00b8\u00b9\7g\2\2\u00b9\u00ba\7o\2\2\u00ba\u00bb\7q\2\2"+
		"\u00bb\u00bc\7x\2\2\u00bc\u00bd\7g\2\2\u00bd\20\3\2\2\2\u00be\u00bf\7"+
		"u\2\2\u00bf\u00c0\7{\2\2\u00c0\u00c1\7u\2\2\u00c1\22\3\2\2\2\u00c2\u00c3"+
		"\7y\2\2\u00c3\u00c4\7t\2\2\u00c4\u00c5\7k\2\2\u00c5\u00c6\7v\2\2\u00c6"+
		"\u00c7\7g\2\2\u00c7\24\3\2\2\2\u00c8\u00c9\7x\2\2\u00c9\u00ca\7g\2\2\u00ca"+
		"\u00cb\7t\2\2\u00cb\u00cc\7k\2\2\u00cc\u00cd\7h\2\2\u00cd\u00ce\7{\2\2"+
		"\u00ce\26\3\2\2\2\u00cf\u00d0\7p\2\2\u00d0\u00d1\7q\2\2\u00d1\u00d2\7"+
		"x\2\2\u00d2\u00d3\7c\2\2\u00d3\u00d4\7n\2\2\u00d4\30\3\2\2\2\u00d5\u00d6"+
		"\7t\2\2\u00d6\u00d7\7c\2\2\u00d7\u00d8\7p\2\2\u00d8\u00d9\7i\2\2\u00d9"+
		"\u00da\7g\2\2\u00da\32\3\2\2\2\u00db\u00dc\7%\2\2\u00dc\34\3\2\2\2\u00dd"+
		"\u00de\7q\2\2\u00de\u00df\7p\2\2\u00df\u00e0\7h\2\2\u00e0\u00e1\7n\2\2"+
		"\u00e1\u00e2\7c\2\2\u00e2\u00e3\7y\2\2\u00e3\36\3\2\2\2\u00e4\u00e5\7"+
		"e\2\2\u00e5\u00e6\7j\2\2\u00e6\u00e7\7c\2\2\u00e7\u00e8\7p\2\2\u00e8\u00e9"+
		"\7i\2\2\u00e9\u00ea\7g\2\2\u00ea\u00eb\7V\2\2\u00eb\u00ec\7g\2\2\u00ec"+
		"\u00ed\7z\2\2\u00ed\u00ee\7v\2\2\u00ee \3\2\2\2\u00ef\u00f0\7h\2\2\u00f0"+
		"\u00f1\7w\2\2\u00f1\u00f2\7p\2\2\u00f2\u00f3\7e\2\2\u00f3\u00f4\7\"\2"+
		"\2\u00f4\u00f5\7o\2\2\u00f5\u00f6\7c\2\2\u00f6\u00f7\7k\2\2\u00f7\u00f8"+
		"\7p\2\2\u00f8\u00f9\7*\2\2\u00f9\u00fa\7+\2\2\u00fa\"\3\2\2\2\u00fb\u00fc"+
		"\7g\2\2\u00fc\u00fd\7p\2\2\u00fd\u00fe\7f\2\2\u00fe\u00ff\7e\2\2\u00ff"+
		"$\3\2\2\2\u0100\u0101\7u\2\2\u0101\u0102\7v\2\2\u0102\u0103\7f\2\2\u0103"+
		"\u0104\7<\2\2\u0104\u0105\7n\2\2\u0105\u0106\7p\2\2\u0106&\3\2\2\2\u0107"+
		"\u0108\7t\2\2\u0108\u0109\7g\2\2\u0109\u010a\7p\2\2\u010a\u010b\7f\2\2"+
		"\u010b\u010c\7g\2\2\u010c\u010d\7t\2\2\u010d(\3\2\2\2\u010e\u010f\7c\2"+
		"\2\u010f\u0110\7f\2\2\u0110\u0111\7f\2\2\u0111\u0112\7E\2\2\u0112\u0113"+
		"\7q\2\2\u0113\u0114\7o\2\2\u0114\u0115\7r\2\2\u0115*\3\2\2\2\u0116\u0117"+
		"\7p\2\2\u0117\u0118\7g\2\2\u0118\u0119\7y\2\2\u0119,\3\2\2\2\u011a\u011b"+
		"\7x\2\2\u011b\u011c\7c\2\2\u011c\u011d\7t\2\2\u011d.\3\2\2\2\u011e\u011f"+
		"\7k\2\2\u011f\u0120\7o\2\2\u0120\u0121\7r\2\2\u0121\u0122\7q\2\2\u0122"+
		"\u0123\7t\2\2\u0123\u0124\7v\2\2\u0124\60\3\2\2\2\u0125\u0126\7u\2\2\u0126"+
		"\u0127\7v\2\2\u0127\u0128\7f\2\2\u0128\u0129\7<\2\2\u0129\u012a\7q\2\2"+
		"\u012a\u012b\7w\2\2\u012b\u012c\7v\2\2\u012c\62\3\2\2\2\u012d\u012e\7"+
		"u\2\2\u012e\u012f\7v\2\2\u012f\u0130\7f\2\2\u0130\u0131\7<\2\2\u0131\u0132"+
		"\7k\2\2\u0132\u0133\7p\2\2\u0133\64\3\2\2\2\u0134\u0135\7c\2\2\u0135\u0136"+
		"\7u\2\2\u0136\u0137\7u\2\2\u0137\u0138\7g\2\2\u0138\u0139\7t\2\2\u0139"+
		"\u013a\7v\2\2\u013a\66\3\2\2\2\u013b\u013c\7h\2\2\u013c\u013d\7w\2\2\u013d"+
		"\u013e\7p\2\2\u013e\u013f\7e\2\2\u013f8\3\2\2\2\u0140\u0141\7v\2\2\u0141"+
		"\u0142\7q\2\2\u0142\u0143\7K\2\2\u0143\u0144\7p\2\2\u0144\u0145\7v\2\2"+
		"\u0145:\3\2\2\2\u0146\u0147\7e\2\2\u0147\u0148\7t\2\2\u0148\u0149\7g\2"+
		"\2\u0149\u014a\7c\2\2\u014a\u014b\7v\2\2\u014b\u014c\7g\2\2\u014c<\3\2"+
		"\2\2\u014d\u014e\7k\2\2\u014e\u014f\7h\2\2\u014f>\3\2\2\2\u0150\u0151"+
		"\7g\2\2\u0151\u0152\7n\2\2\u0152\u0153\7u\2\2\u0153\u0154\7g\2\2\u0154"+
		"@\3\2\2\2\u0155\u0156\7t\2\2\u0156\u0157\7g\2\2\u0157\u0158\7v\2\2\u0158"+
		"\u0159\7w\2\2\u0159\u015a\7t\2\2\u015a\u015b\7p\2\2\u015bB\3\2\2\2\u015c"+
		"\u015d\7h\2\2\u015d\u015e\7q\2\2\u015e\u015f\7t\2\2\u015fD\3\2\2\2\u0160"+
		"\u0161\7y\2\2\u0161\u0162\7j\2\2\u0162\u0163\7k\2\2\u0163\u0164\7n\2\2"+
		"\u0164\u0165\7g\2\2\u0165F\3\2\2\2\u0166\u0167\7v\2\2\u0167\u0168\7q\2"+
		"\2\u0168H\3\2\2\2\u0169\u016a\7f\2\2\u016a\u016b\7q\2\2\u016bJ\3\2\2\2"+
		"\u016c\u016d\7g\2\2\u016d\u016e\7p\2\2\u016e\u016f\7f\2\2\u016f\u0170"+
		"\7h\2\2\u0170L\3\2\2\2\u0171\u0172\7k\2\2\u0172\u0173\7p\2\2\u0173N\3"+
		"\2\2\2\u0174\u0175\7p\2\2\u0175\u0176\7w\2\2\u0176\u0177\7n\2\2\u0177"+
		"\u0178\7n\2\2\u0178P\3\2\2\2\u0179\u017a\7v\2\2\u017a\u017b\7t\2\2\u017b"+
		"\u017c\7{\2\2\u017cR\3\2\2\2\u017d\u017e\7e\2\2\u017e\u017f\7c\2\2\u017f"+
		"\u0180\7v\2\2\u0180\u0181\7e\2\2\u0181\u0182\7j\2\2\u0182T\3\2\2\2\u0183"+
		"\u0184\7e\2\2\u0184\u0185\7n\2\2\u0185\u0186\7c\2\2\u0186\u0187\7u\2\2"+
		"\u0187\u0188\7u\2\2\u0188V\3\2\2\2\u0189\u018a\7~\2\2\u018a\u018b\7~\2"+
		"\2\u018bX\3\2\2\2\u018c\u018d\7(\2\2\u018d\u018e\7(\2\2\u018eZ\3\2\2\2"+
		"\u018f\u0190\7?\2\2\u0190\u0191\7?\2\2\u0191\\\3\2\2\2\u0192\u0193\7#"+
		"\2\2\u0193\u0194\7?\2\2\u0194^\3\2\2\2\u0195\u0196\7@\2\2\u0196\u0197"+
		"\7?\2\2\u0197`\3\2\2\2\u0198\u0199\7>\2\2\u0199\u019a\7?\2\2\u019ab\3"+
		"\2\2\2\u019b\u019c\7`\2\2\u019cd\3\2\2\2\u019d\u019e\7#\2\2\u019ef\3\2"+
		"\2\2\u019f\u01a0\7@\2\2\u01a0h\3\2\2\2\u01a1\u01a2\7>\2\2\u01a2j\3\2\2"+
		"\2\u01a3\u01a4\7-\2\2\u01a4l\3\2\2\2\u01a5\u01a6\7/\2\2\u01a6n\3\2\2\2"+
		"\u01a7\u01a8\7,\2\2\u01a8p\3\2\2\2\u01a9\u01aa\7\61\2\2\u01aar\3\2\2\2"+
		"\u01ab\u01ac\7\'\2\2\u01act\3\2\2\2\u01ad\u01ae\7}\2\2\u01aev\3\2\2\2"+
		"\u01af\u01b0\7\177\2\2\u01b0x\3\2\2\2\u01b1\u01b2\7]\2\2\u01b2z\3\2\2"+
		"\2\u01b3\u01b4\7_\2\2\u01b4|\3\2\2\2\u01b5\u01b6\7*\2\2\u01b6~\3\2\2\2"+
		"\u01b7\u01b8\7+\2\2\u01b8\u0080\3\2\2\2\u01b9\u01ba\7=\2\2\u01ba\u0082"+
		"\3\2\2\2\u01bb\u01bc\7?\2\2\u01bc\u0084\3\2\2\2\u01bd\u01be\7.\2\2\u01be"+
		"\u0086\3\2\2\2\u01bf\u01c0\7A\2\2\u01c0\u0088\3\2\2\2\u01c1\u01c2\7<\2"+
		"\2\u01c2\u008a\3\2\2\2\u01c3\u01c4\7v\2\2\u01c4\u01c5\7t\2\2\u01c5\u01c6"+
		"\7w\2\2\u01c6\u01cd\7g\2\2\u01c7\u01c8\7h\2\2\u01c8\u01c9\7c\2\2\u01c9"+
		"\u01ca\7n\2\2\u01ca\u01cb\7u\2\2\u01cb\u01cd\7g\2\2\u01cc\u01c3\3\2\2"+
		"\2\u01cc\u01c7\3\2\2\2\u01cd\u008c\3\2\2\2\u01ce\u01d6\5\u0099M\2\u01cf"+
		"\u01d3\7\60\2\2\u01d0\u01d2\5\u009bN\2\u01d1\u01d0\3\2\2\2\u01d2\u01d5"+
		"\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d7\3\2\2\2\u01d5"+
		"\u01d3\3\2\2\2\u01d6\u01cf\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u008e\3\2"+
		"\2\2\u01d8\u01dc\t\2\2\2\u01d9\u01db\t\3\2\2\u01da\u01d9\3\2\2\2\u01db"+
		"\u01de\3\2\2\2\u01dc\u01da\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u0090\3\2"+
		"\2\2\u01de\u01dc\3\2\2\2\u01df\u01e5\t\4\2\2\u01e0\u01e4\n\5\2\2\u01e1"+
		"\u01e2\7^\2\2\u01e2\u01e4\n\6\2\2\u01e3\u01e0\3\2\2\2\u01e3\u01e1\3\2"+
		"\2\2\u01e4\u01e7\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6"+
		"\u01e8\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e8\u01f4\t\4\2\2\u01e9\u01ef\t\7"+
		"\2\2\u01ea\u01ee\n\b\2\2\u01eb\u01ec\7^\2\2\u01ec\u01ee\n\6\2\2\u01ed"+
		"\u01ea\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ee\u01f1\3\2\2\2\u01ef\u01ed\3\2"+
		"\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01f2\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f2"+
		"\u01f4\t\7\2\2\u01f3\u01df\3\2\2\2\u01f3\u01e9\3\2\2\2\u01f4\u0092\3\2"+
		"\2\2\u01f5\u01f6\7\61\2\2\u01f6\u01f7\7\61\2\2\u01f7\u01fb\3\2\2\2\u01f8"+
		"\u01fa\n\6\2\2\u01f9\u01f8\3\2\2\2\u01fa\u01fd\3\2\2\2\u01fb\u01f9\3\2"+
		"\2\2\u01fb\u01fc\3\2\2\2\u01fc\u020a\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fe"+
		"\u01ff\7\61\2\2\u01ff\u0200\7,\2\2\u0200\u0204\3\2\2\2\u0201\u0203\13"+
		"\2\2\2\u0202\u0201\3\2\2\2\u0203\u0206\3\2\2\2\u0204\u0205\3\2\2\2\u0204"+
		"\u0202\3\2\2\2\u0205\u0207\3\2\2\2\u0206\u0204\3\2\2\2\u0207\u0208\7,"+
		"\2\2\u0208\u020a\7\61\2\2\u0209\u01f5\3\2\2\2\u0209\u01fe\3\2\2\2\u020a"+
		"\u020b\3\2\2\2\u020b\u020c\bJ\2\2\u020c\u0094\3\2\2\2\u020d\u0213\t\4"+
		"\2\2\u020e\u0212\n\4\2\2\u020f\u0210\7^\2\2\u0210\u0212\n\6\2\2\u0211"+
		"\u020e\3\2\2\2\u0211\u020f\3\2\2\2\u0212\u0215\3\2\2\2\u0213\u0211\3\2"+
		"\2\2\u0213\u0214\3\2\2\2\u0214\u0216\3\2\2\2\u0215\u0213\3\2\2\2\u0216"+
		"\u0217\t\4\2\2\u0217\u0096\3\2\2\2\u0218\u0219\t\t\2\2\u0219\u021a\3\2"+
		"\2\2\u021a\u021b\bL\2\2\u021b\u0098\3\2\2\2\u021c\u0220\t\n\2\2\u021d"+
		"\u021f\5\u009bN\2\u021e\u021d\3\2\2\2\u021f\u0222\3\2\2\2\u0220\u021e"+
		"\3\2\2\2\u0220\u0221\3\2\2\2\u0221\u0225\3\2\2\2\u0222\u0220\3\2\2\2\u0223"+
		"\u0225\7\62\2\2\u0224\u021c\3\2\2\2\u0224\u0223\3\2\2\2\u0225\u009a\3"+
		"\2\2\2\u0226\u0227\t\13\2\2\u0227\u009c\3\2\2\2\23\2\u01cc\u01d3\u01d6"+
		"\u01dc\u01e3\u01e5\u01ed\u01ef\u01f3\u01fb\u0204\u0209\u0211\u0213\u0220"+
		"\u0224\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}