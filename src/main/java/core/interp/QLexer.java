// Generated from /Users/harryharbuck-marlowe/Downloads/Q/src/main/java/core/etc/Q.g4 by ANTLR 4.9.2
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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, Println=15, Component=16, 
		Render=17, AddComponent=18, New=19, Var=20, AddWSText=21, Import=22, Print=23, 
		Input=24, Assert=25, Wait=26, Size=27, Def=28, ToInt=29, Create=30, WebServer=31, 
		If=32, Else=33, Return=34, For=35, While=36, To=37, Do=38, End=39, In=40, 
		Null=41, Try=42, Catch=43, Class=44, CreateClass=45, Or=46, And=47, Equals=48, 
		NEquals=49, GTEquals=50, LTEquals=51, Pow=52, Excl=53, GT=54, LT=55, Add=56, 
		Subtract=57, Multiply=58, Divide=59, Modulus=60, OBrace=61, CBrace=62, 
		OBracket=63, CBracket=64, OParen=65, CParen=66, SColon=67, Assign=68, 
		Comma=69, QMark=70, Colon=71, Bool=72, Number=73, Identifier=74, String=75, 
		Comment=76, JavaTextBlock=77, Space=78;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "Println", "Component", "Render", 
			"AddComponent", "New", "Var", "AddWSText", "Import", "Print", "Input", 
			"Assert", "Wait", "Size", "Def", "ToInt", "Create", "WebServer", "If", 
			"Else", "Return", "For", "While", "To", "Do", "End", "In", "Null", "Try", 
			"Catch", "Class", "CreateClass", "Or", "And", "Equals", "NEquals", "GTEquals", 
			"LTEquals", "Pow", "Excl", "GT", "LT", "Add", "Subtract", "Multiply", 
			"Divide", "Modulus", "OBrace", "CBrace", "OBracket", "CBracket", "OParen", 
			"CParen", "SColon", "Assign", "Comma", "QMark", "Colon", "Bool", "Number", 
			"Identifier", "String", "Comment", "JavaTextBlock", "Space", "Int", "Digit"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'const'", "'List'", "'add'", "'remove'", "'sys'", "'write'", 
			"'verify'", "'.default'", "'#'", "'github'", "'changeText'", "'func main()'", 
			"'endc'", "'std:ln'", "'Component'", "'render'", "'addComp'", "'new'", 
			"'var'", "'WebServer.changeText'", "'import'", "'std:out'", "'std:in'", 
			"'assert'", "'wait'", "'size'", "'func'", "'toInt'", "'create'", "'WebServer'", 
			"'if'", "'else'", "'return'", "'for'", "'while'", "'to'", "'do'", "'endf'", 
			"'in'", "'null'", "'try'", "'catch'", "'class'", "'createClass'", "'||'", 
			"'&&'", "'=='", "'!='", "'>='", "'<='", "'^'", "'!'", "'>'", "'<'", "'+'", 
			"'-'", "'*'", "'/'", "'%'", "'{'", "'}'", "'['", "']'", "'('", "')'", 
			"';'", "'='", "','", "'?'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "Println", "Component", "Render", "AddComponent", "New", 
			"Var", "AddWSText", "Import", "Print", "Input", "Assert", "Wait", "Size", 
			"Def", "ToInt", "Create", "WebServer", "If", "Else", "Return", "For", 
			"While", "To", "Do", "End", "In", "Null", "Try", "Catch", "Class", "CreateClass", 
			"Or", "And", "Equals", "NEquals", "GTEquals", "LTEquals", "Pow", "Excl", 
			"GT", "LT", "Add", "Subtract", "Multiply", "Divide", "Modulus", "OBrace", 
			"CBrace", "OBracket", "CBracket", "OParen", "CParen", "SColon", "Assign", 
			"Comma", "QMark", "Colon", "Bool", "Number", "Identifier", "String", 
			"Comment", "JavaTextBlock", "Space"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2P\u0261\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!"+
		"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3%\3"+
		"%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3"+
		"+\3+\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3"+
		".\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63"+
		"\3\63\3\64\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3"+
		";\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3"+
		"F\3G\3G\3H\3H\3I\3I\3I\3I\3I\3I\3I\3I\3I\5I\u0206\nI\3J\3J\3J\7J\u020b"+
		"\nJ\fJ\16J\u020e\13J\5J\u0210\nJ\3K\3K\7K\u0214\nK\fK\16K\u0217\13K\3"+
		"L\3L\3L\3L\7L\u021d\nL\fL\16L\u0220\13L\3L\3L\3L\3L\3L\7L\u0227\nL\fL"+
		"\16L\u022a\13L\3L\5L\u022d\nL\3M\3M\3M\3M\7M\u0233\nM\fM\16M\u0236\13"+
		"M\3M\3M\3M\3M\7M\u023c\nM\fM\16M\u023f\13M\3M\3M\5M\u0243\nM\3M\3M\3N"+
		"\3N\3N\3N\7N\u024b\nN\fN\16N\u024e\13N\3N\3N\3O\3O\3O\3O\3P\3P\7P\u0258"+
		"\nP\fP\16P\u025b\13P\3P\5P\u025e\nP\3Q\3Q\3\u023d\2R\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'"+
		"M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177"+
		"A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093"+
		"K\u0095L\u0097M\u0099N\u009bO\u009dP\u009f\2\u00a1\2\3\2\f\5\2C\\aac|"+
		"\6\2\62;C\\aac|\3\2$$\6\2\f\f\17\17$$^^\4\2\f\f\17\17\3\2))\6\2\f\f\17"+
		"\17))^^\5\2\13\f\16\17\"\"\3\2\63;\3\2\62;\2\u026e\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3"+
		"\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2"+
		"\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2"+
		"\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3"+
		"\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2"+
		"\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099"+
		"\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\3\u00a3\3\2\2\2\5\u00a5\3\2\2"+
		"\2\7\u00ab\3\2\2\2\t\u00b0\3\2\2\2\13\u00b4\3\2\2\2\r\u00bb\3\2\2\2\17"+
		"\u00bf\3\2\2\2\21\u00c5\3\2\2\2\23\u00cc\3\2\2\2\25\u00d5\3\2\2\2\27\u00d7"+
		"\3\2\2\2\31\u00de\3\2\2\2\33\u00e9\3\2\2\2\35\u00f5\3\2\2\2\37\u00fa\3"+
		"\2\2\2!\u0101\3\2\2\2#\u010b\3\2\2\2%\u0112\3\2\2\2\'\u011a\3\2\2\2)\u011e"+
		"\3\2\2\2+\u0122\3\2\2\2-\u0137\3\2\2\2/\u013e\3\2\2\2\61\u0146\3\2\2\2"+
		"\63\u014d\3\2\2\2\65\u0154\3\2\2\2\67\u0159\3\2\2\29\u015e\3\2\2\2;\u0163"+
		"\3\2\2\2=\u0169\3\2\2\2?\u0170\3\2\2\2A\u017a\3\2\2\2C\u017d\3\2\2\2E"+
		"\u0182\3\2\2\2G\u0189\3\2\2\2I\u018d\3\2\2\2K\u0193\3\2\2\2M\u0196\3\2"+
		"\2\2O\u0199\3\2\2\2Q\u019e\3\2\2\2S\u01a1\3\2\2\2U\u01a6\3\2\2\2W\u01aa"+
		"\3\2\2\2Y\u01b0\3\2\2\2[\u01b6\3\2\2\2]\u01c2\3\2\2\2_\u01c5\3\2\2\2a"+
		"\u01c8\3\2\2\2c\u01cb\3\2\2\2e\u01ce\3\2\2\2g\u01d1\3\2\2\2i\u01d4\3\2"+
		"\2\2k\u01d6\3\2\2\2m\u01d8\3\2\2\2o\u01da\3\2\2\2q\u01dc\3\2\2\2s\u01de"+
		"\3\2\2\2u\u01e0\3\2\2\2w\u01e2\3\2\2\2y\u01e4\3\2\2\2{\u01e6\3\2\2\2}"+
		"\u01e8\3\2\2\2\177\u01ea\3\2\2\2\u0081\u01ec\3\2\2\2\u0083\u01ee\3\2\2"+
		"\2\u0085\u01f0\3\2\2\2\u0087\u01f2\3\2\2\2\u0089\u01f4\3\2\2\2\u008b\u01f6"+
		"\3\2\2\2\u008d\u01f8\3\2\2\2\u008f\u01fa\3\2\2\2\u0091\u0205\3\2\2\2\u0093"+
		"\u0207\3\2\2\2\u0095\u0211\3\2\2\2\u0097\u022c\3\2\2\2\u0099\u0242\3\2"+
		"\2\2\u009b\u0246\3\2\2\2\u009d\u0251\3\2\2\2\u009f\u025d\3\2\2\2\u00a1"+
		"\u025f\3\2\2\2\u00a3\u00a4\7\60\2\2\u00a4\4\3\2\2\2\u00a5\u00a6\7e\2\2"+
		"\u00a6\u00a7\7q\2\2\u00a7\u00a8\7p\2\2\u00a8\u00a9\7u\2\2\u00a9\u00aa"+
		"\7v\2\2\u00aa\6\3\2\2\2\u00ab\u00ac\7N\2\2\u00ac\u00ad\7k\2\2\u00ad\u00ae"+
		"\7u\2\2\u00ae\u00af\7v\2\2\u00af\b\3\2\2\2\u00b0\u00b1\7c\2\2\u00b1\u00b2"+
		"\7f\2\2\u00b2\u00b3\7f\2\2\u00b3\n\3\2\2\2\u00b4\u00b5\7t\2\2\u00b5\u00b6"+
		"\7g\2\2\u00b6\u00b7\7o\2\2\u00b7\u00b8\7q\2\2\u00b8\u00b9\7x\2\2\u00b9"+
		"\u00ba\7g\2\2\u00ba\f\3\2\2\2\u00bb\u00bc\7u\2\2\u00bc\u00bd\7{\2\2\u00bd"+
		"\u00be\7u\2\2\u00be\16\3\2\2\2\u00bf\u00c0\7y\2\2\u00c0\u00c1\7t\2\2\u00c1"+
		"\u00c2\7k\2\2\u00c2\u00c3\7v\2\2\u00c3\u00c4\7g\2\2\u00c4\20\3\2\2\2\u00c5"+
		"\u00c6\7x\2\2\u00c6\u00c7\7g\2\2\u00c7\u00c8\7t\2\2\u00c8\u00c9\7k\2\2"+
		"\u00c9\u00ca\7h\2\2\u00ca\u00cb\7{\2\2\u00cb\22\3\2\2\2\u00cc\u00cd\7"+
		"\60\2\2\u00cd\u00ce\7f\2\2\u00ce\u00cf\7g\2\2\u00cf\u00d0\7h\2\2\u00d0"+
		"\u00d1\7c\2\2\u00d1\u00d2\7w\2\2\u00d2\u00d3\7n\2\2\u00d3\u00d4\7v\2\2"+
		"\u00d4\24\3\2\2\2\u00d5\u00d6\7%\2\2\u00d6\26\3\2\2\2\u00d7\u00d8\7i\2"+
		"\2\u00d8\u00d9\7k\2\2\u00d9\u00da\7v\2\2\u00da\u00db\7j\2\2\u00db\u00dc"+
		"\7w\2\2\u00dc\u00dd\7d\2\2\u00dd\30\3\2\2\2\u00de\u00df\7e\2\2\u00df\u00e0"+
		"\7j\2\2\u00e0\u00e1\7c\2\2\u00e1\u00e2\7p\2\2\u00e2\u00e3\7i\2\2\u00e3"+
		"\u00e4\7g\2\2\u00e4\u00e5\7V\2\2\u00e5\u00e6\7g\2\2\u00e6\u00e7\7z\2\2"+
		"\u00e7\u00e8\7v\2\2\u00e8\32\3\2\2\2\u00e9\u00ea\7h\2\2\u00ea\u00eb\7"+
		"w\2\2\u00eb\u00ec\7p\2\2\u00ec\u00ed\7e\2\2\u00ed\u00ee\7\"\2\2\u00ee"+
		"\u00ef\7o\2\2\u00ef\u00f0\7c\2\2\u00f0\u00f1\7k\2\2\u00f1\u00f2\7p\2\2"+
		"\u00f2\u00f3\7*\2\2\u00f3\u00f4\7+\2\2\u00f4\34\3\2\2\2\u00f5\u00f6\7"+
		"g\2\2\u00f6\u00f7\7p\2\2\u00f7\u00f8\7f\2\2\u00f8\u00f9\7e\2\2\u00f9\36"+
		"\3\2\2\2\u00fa\u00fb\7u\2\2\u00fb\u00fc\7v\2\2\u00fc\u00fd\7f\2\2\u00fd"+
		"\u00fe\7<\2\2\u00fe\u00ff\7n\2\2\u00ff\u0100\7p\2\2\u0100 \3\2\2\2\u0101"+
		"\u0102\7E\2\2\u0102\u0103\7q\2\2\u0103\u0104\7o\2\2\u0104\u0105\7r\2\2"+
		"\u0105\u0106\7q\2\2\u0106\u0107\7p\2\2\u0107\u0108\7g\2\2\u0108\u0109"+
		"\7p\2\2\u0109\u010a\7v\2\2\u010a\"\3\2\2\2\u010b\u010c\7t\2\2\u010c\u010d"+
		"\7g\2\2\u010d\u010e\7p\2\2\u010e\u010f\7f\2\2\u010f\u0110\7g\2\2\u0110"+
		"\u0111\7t\2\2\u0111$\3\2\2\2\u0112\u0113\7c\2\2\u0113\u0114\7f\2\2\u0114"+
		"\u0115\7f\2\2\u0115\u0116\7E\2\2\u0116\u0117\7q\2\2\u0117\u0118\7o\2\2"+
		"\u0118\u0119\7r\2\2\u0119&\3\2\2\2\u011a\u011b\7p\2\2\u011b\u011c\7g\2"+
		"\2\u011c\u011d\7y\2\2\u011d(\3\2\2\2\u011e\u011f\7x\2\2\u011f\u0120\7"+
		"c\2\2\u0120\u0121\7t\2\2\u0121*\3\2\2\2\u0122\u0123\7Y\2\2\u0123\u0124"+
		"\7g\2\2\u0124\u0125\7d\2\2\u0125\u0126\7U\2\2\u0126\u0127\7g\2\2\u0127"+
		"\u0128\7t\2\2\u0128\u0129\7x\2\2\u0129\u012a\7g\2\2\u012a\u012b\7t\2\2"+
		"\u012b\u012c\7\60\2\2\u012c\u012d\7e\2\2\u012d\u012e\7j\2\2\u012e\u012f"+
		"\7c\2\2\u012f\u0130\7p\2\2\u0130\u0131\7i\2\2\u0131\u0132\7g\2\2\u0132"+
		"\u0133\7V\2\2\u0133\u0134\7g\2\2\u0134\u0135\7z\2\2\u0135\u0136\7v\2\2"+
		"\u0136,\3\2\2\2\u0137\u0138\7k\2\2\u0138\u0139\7o\2\2\u0139\u013a\7r\2"+
		"\2\u013a\u013b\7q\2\2\u013b\u013c\7t\2\2\u013c\u013d\7v\2\2\u013d.\3\2"+
		"\2\2\u013e\u013f\7u\2\2\u013f\u0140\7v\2\2\u0140\u0141\7f\2\2\u0141\u0142"+
		"\7<\2\2\u0142\u0143\7q\2\2\u0143\u0144\7w\2\2\u0144\u0145\7v\2\2\u0145"+
		"\60\3\2\2\2\u0146\u0147\7u\2\2\u0147\u0148\7v\2\2\u0148\u0149\7f\2\2\u0149"+
		"\u014a\7<\2\2\u014a\u014b\7k\2\2\u014b\u014c\7p\2\2\u014c\62\3\2\2\2\u014d"+
		"\u014e\7c\2\2\u014e\u014f\7u\2\2\u014f\u0150\7u\2\2\u0150\u0151\7g\2\2"+
		"\u0151\u0152\7t\2\2\u0152\u0153\7v\2\2\u0153\64\3\2\2\2\u0154\u0155\7"+
		"y\2\2\u0155\u0156\7c\2\2\u0156\u0157\7k\2\2\u0157\u0158\7v\2\2\u0158\66"+
		"\3\2\2\2\u0159\u015a\7u\2\2\u015a\u015b\7k\2\2\u015b\u015c\7|\2\2\u015c"+
		"\u015d\7g\2\2\u015d8\3\2\2\2\u015e\u015f\7h\2\2\u015f\u0160\7w\2\2\u0160"+
		"\u0161\7p\2\2\u0161\u0162\7e\2\2\u0162:\3\2\2\2\u0163\u0164\7v\2\2\u0164"+
		"\u0165\7q\2\2\u0165\u0166\7K\2\2\u0166\u0167\7p\2\2\u0167\u0168\7v\2\2"+
		"\u0168<\3\2\2\2\u0169\u016a\7e\2\2\u016a\u016b\7t\2\2\u016b\u016c\7g\2"+
		"\2\u016c\u016d\7c\2\2\u016d\u016e\7v\2\2\u016e\u016f\7g\2\2\u016f>\3\2"+
		"\2\2\u0170\u0171\7Y\2\2\u0171\u0172\7g\2\2\u0172\u0173\7d\2\2\u0173\u0174"+
		"\7U\2\2\u0174\u0175\7g\2\2\u0175\u0176\7t\2\2\u0176\u0177\7x\2\2\u0177"+
		"\u0178\7g\2\2\u0178\u0179\7t\2\2\u0179@\3\2\2\2\u017a\u017b\7k\2\2\u017b"+
		"\u017c\7h\2\2\u017cB\3\2\2\2\u017d\u017e\7g\2\2\u017e\u017f\7n\2\2\u017f"+
		"\u0180\7u\2\2\u0180\u0181\7g\2\2\u0181D\3\2\2\2\u0182\u0183\7t\2\2\u0183"+
		"\u0184\7g\2\2\u0184\u0185\7v\2\2\u0185\u0186\7w\2\2\u0186\u0187\7t\2\2"+
		"\u0187\u0188\7p\2\2\u0188F\3\2\2\2\u0189\u018a\7h\2\2\u018a\u018b\7q\2"+
		"\2\u018b\u018c\7t\2\2\u018cH\3\2\2\2\u018d\u018e\7y\2\2\u018e\u018f\7"+
		"j\2\2\u018f\u0190\7k\2\2\u0190\u0191\7n\2\2\u0191\u0192\7g\2\2\u0192J"+
		"\3\2\2\2\u0193\u0194\7v\2\2\u0194\u0195\7q\2\2\u0195L\3\2\2\2\u0196\u0197"+
		"\7f\2\2\u0197\u0198\7q\2\2\u0198N\3\2\2\2\u0199\u019a\7g\2\2\u019a\u019b"+
		"\7p\2\2\u019b\u019c\7f\2\2\u019c\u019d\7h\2\2\u019dP\3\2\2\2\u019e\u019f"+
		"\7k\2\2\u019f\u01a0\7p\2\2\u01a0R\3\2\2\2\u01a1\u01a2\7p\2\2\u01a2\u01a3"+
		"\7w\2\2\u01a3\u01a4\7n\2\2\u01a4\u01a5\7n\2\2\u01a5T\3\2\2\2\u01a6\u01a7"+
		"\7v\2\2\u01a7\u01a8\7t\2\2\u01a8\u01a9\7{\2\2\u01a9V\3\2\2\2\u01aa\u01ab"+
		"\7e\2\2\u01ab\u01ac\7c\2\2\u01ac\u01ad\7v\2\2\u01ad\u01ae\7e\2\2\u01ae"+
		"\u01af\7j\2\2\u01afX\3\2\2\2\u01b0\u01b1\7e\2\2\u01b1\u01b2\7n\2\2\u01b2"+
		"\u01b3\7c\2\2\u01b3\u01b4\7u\2\2\u01b4\u01b5\7u\2\2\u01b5Z\3\2\2\2\u01b6"+
		"\u01b7\7e\2\2\u01b7\u01b8\7t\2\2\u01b8\u01b9\7g\2\2\u01b9\u01ba\7c\2\2"+
		"\u01ba\u01bb\7v\2\2\u01bb\u01bc\7g\2\2\u01bc\u01bd\7E\2\2\u01bd\u01be"+
		"\7n\2\2\u01be\u01bf\7c\2\2\u01bf\u01c0\7u\2\2\u01c0\u01c1\7u\2\2\u01c1"+
		"\\\3\2\2\2\u01c2\u01c3\7~\2\2\u01c3\u01c4\7~\2\2\u01c4^\3\2\2\2\u01c5"+
		"\u01c6\7(\2\2\u01c6\u01c7\7(\2\2\u01c7`\3\2\2\2\u01c8\u01c9\7?\2\2\u01c9"+
		"\u01ca\7?\2\2\u01cab\3\2\2\2\u01cb\u01cc\7#\2\2\u01cc\u01cd\7?\2\2\u01cd"+
		"d\3\2\2\2\u01ce\u01cf\7@\2\2\u01cf\u01d0\7?\2\2\u01d0f\3\2\2\2\u01d1\u01d2"+
		"\7>\2\2\u01d2\u01d3\7?\2\2\u01d3h\3\2\2\2\u01d4\u01d5\7`\2\2\u01d5j\3"+
		"\2\2\2\u01d6\u01d7\7#\2\2\u01d7l\3\2\2\2\u01d8\u01d9\7@\2\2\u01d9n\3\2"+
		"\2\2\u01da\u01db\7>\2\2\u01dbp\3\2\2\2\u01dc\u01dd\7-\2\2\u01ddr\3\2\2"+
		"\2\u01de\u01df\7/\2\2\u01dft\3\2\2\2\u01e0\u01e1\7,\2\2\u01e1v\3\2\2\2"+
		"\u01e2\u01e3\7\61\2\2\u01e3x\3\2\2\2\u01e4\u01e5\7\'\2\2\u01e5z\3\2\2"+
		"\2\u01e6\u01e7\7}\2\2\u01e7|\3\2\2\2\u01e8\u01e9\7\177\2\2\u01e9~\3\2"+
		"\2\2\u01ea\u01eb\7]\2\2\u01eb\u0080\3\2\2\2\u01ec\u01ed\7_\2\2\u01ed\u0082"+
		"\3\2\2\2\u01ee\u01ef\7*\2\2\u01ef\u0084\3\2\2\2\u01f0\u01f1\7+\2\2\u01f1"+
		"\u0086\3\2\2\2\u01f2\u01f3\7=\2\2\u01f3\u0088\3\2\2\2\u01f4\u01f5\7?\2"+
		"\2\u01f5\u008a\3\2\2\2\u01f6\u01f7\7.\2\2\u01f7\u008c\3\2\2\2\u01f8\u01f9"+
		"\7A\2\2\u01f9\u008e\3\2\2\2\u01fa\u01fb\7<\2\2\u01fb\u0090\3\2\2\2\u01fc"+
		"\u01fd\7v\2\2\u01fd\u01fe\7t\2\2\u01fe\u01ff\7w\2\2\u01ff\u0206\7g\2\2"+
		"\u0200\u0201\7h\2\2\u0201\u0202\7c\2\2\u0202\u0203\7n\2\2\u0203\u0204"+
		"\7u\2\2\u0204\u0206\7g\2\2\u0205\u01fc\3\2\2\2\u0205\u0200\3\2\2\2\u0206"+
		"\u0092\3\2\2\2\u0207\u020f\5\u009fP\2\u0208\u020c\7\60\2\2\u0209\u020b"+
		"\5\u00a1Q\2\u020a\u0209\3\2\2\2\u020b\u020e\3\2\2\2\u020c\u020a\3\2\2"+
		"\2\u020c\u020d\3\2\2\2\u020d\u0210\3\2\2\2\u020e\u020c\3\2\2\2\u020f\u0208"+
		"\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u0094\3\2\2\2\u0211\u0215\t\2\2\2\u0212"+
		"\u0214\t\3\2\2\u0213\u0212\3\2\2\2\u0214\u0217\3\2\2\2\u0215\u0213\3\2"+
		"\2\2\u0215\u0216\3\2\2\2\u0216\u0096\3\2\2\2\u0217\u0215\3\2\2\2\u0218"+
		"\u021e\t\4\2\2\u0219\u021d\n\5\2\2\u021a\u021b\7^\2\2\u021b\u021d\n\6"+
		"\2\2\u021c\u0219\3\2\2\2\u021c\u021a\3\2\2\2\u021d\u0220\3\2\2\2\u021e"+
		"\u021c\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u0221\3\2\2\2\u0220\u021e\3\2"+
		"\2\2\u0221\u022d\t\4\2\2\u0222\u0228\t\7\2\2\u0223\u0227\n\b\2\2\u0224"+
		"\u0225\7^\2\2\u0225\u0227\n\6\2\2\u0226\u0223\3\2\2\2\u0226\u0224\3\2"+
		"\2\2\u0227\u022a\3\2\2\2\u0228\u0226\3\2\2\2\u0228\u0229\3\2\2\2\u0229"+
		"\u022b\3\2\2\2\u022a\u0228\3\2\2\2\u022b\u022d\t\7\2\2\u022c\u0218\3\2"+
		"\2\2\u022c\u0222\3\2\2\2\u022d\u0098\3\2\2\2\u022e\u022f\7\61\2\2\u022f"+
		"\u0230\7\61\2\2\u0230\u0234\3\2\2\2\u0231\u0233\n\6\2\2\u0232\u0231\3"+
		"\2\2\2\u0233\u0236\3\2\2\2\u0234\u0232\3\2\2\2\u0234\u0235\3\2\2\2\u0235"+
		"\u0243\3\2\2\2\u0236\u0234\3\2\2\2\u0237\u0238\7\61\2\2\u0238\u0239\7"+
		",\2\2\u0239\u023d\3\2\2\2\u023a\u023c\13\2\2\2\u023b\u023a\3\2\2\2\u023c"+
		"\u023f\3\2\2\2\u023d\u023e\3\2\2\2\u023d\u023b\3\2\2\2\u023e\u0240\3\2"+
		"\2\2\u023f\u023d\3\2\2\2\u0240\u0241\7,\2\2\u0241\u0243\7\61\2\2\u0242"+
		"\u022e\3\2\2\2\u0242\u0237\3\2\2\2\u0243\u0244\3\2\2\2\u0244\u0245\bM"+
		"\2\2\u0245\u009a\3\2\2\2\u0246\u024c\t\4\2\2\u0247\u024b\n\4\2\2\u0248"+
		"\u0249\7^\2\2\u0249\u024b\n\6\2\2\u024a\u0247\3\2\2\2\u024a\u0248\3\2"+
		"\2\2\u024b\u024e\3\2\2\2\u024c\u024a\3\2\2\2\u024c\u024d\3\2\2\2\u024d"+
		"\u024f\3\2\2\2\u024e\u024c\3\2\2\2\u024f\u0250\t\4\2\2\u0250\u009c\3\2"+
		"\2\2\u0251\u0252\t\t\2\2\u0252\u0253\3\2\2\2\u0253\u0254\bO\2\2\u0254"+
		"\u009e\3\2\2\2\u0255\u0259\t\n\2\2\u0256\u0258\5\u00a1Q\2\u0257\u0256"+
		"\3\2\2\2\u0258\u025b\3\2\2\2\u0259\u0257\3\2\2\2\u0259\u025a\3\2\2\2\u025a"+
		"\u025e\3\2\2\2\u025b\u0259\3\2\2\2\u025c\u025e\7\62\2\2\u025d\u0255\3"+
		"\2\2\2\u025d\u025c\3\2\2\2\u025e\u00a0\3\2\2\2\u025f\u0260\t\13\2\2\u0260"+
		"\u00a2\3\2\2\2\23\2\u0205\u020c\u020f\u0215\u021c\u021e\u0226\u0228\u022c"+
		"\u0234\u023d\u0242\u024a\u024c\u0259\u025d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}