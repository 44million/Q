// Generated from /Users/harryharbuck-marlowe/Desktop/Q/src/main/java/modulesParser/core/Mod.g4 by ANTLR 4.9.2
package mod.antlr;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ModLexer extends Lexer {
    public static final int
            T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, T__7 = 8, T__8 = 9,
            T__9 = 10, T__10 = 11, T__11 = 12, T__12 = 13, T__13 = 14, T__14 = 15, T__15 = 16, T__16 = 17,
            T__17 = 18, T__18 = 19, Bool = 20, Number = 21, Identifier = 22, String = 23, Comment = 24,
            Space = 25;
    public static final String[] ruleNames = makeRuleNames();
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\33\u00d6\b\1\4\2" +
                    "\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4" +
                    "\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22" +
                    "\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31" +
                    "\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3" +
                    "\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3" +
                    "\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17" +
                    "\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22" +
                    "\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25" +
                    "\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0086\n\25\3\26\3\26\3\26\7\26" +
                    "\u008b\n\26\f\26\16\26\u008e\13\26\5\26\u0090\n\26\3\27\3\27\7\27\u0094" +
                    "\n\27\f\27\16\27\u0097\13\27\3\30\3\30\3\30\3\30\7\30\u009d\n\30\f\30" +
                    "\16\30\u00a0\13\30\3\30\3\30\3\30\3\30\3\30\7\30\u00a7\n\30\f\30\16\30" +
                    "\u00aa\13\30\3\30\5\30\u00ad\n\30\3\31\3\31\3\31\3\31\7\31\u00b3\n\31" +
                    "\f\31\16\31\u00b6\13\31\3\31\3\31\3\31\3\31\7\31\u00bc\n\31\f\31\16\31" +
                    "\u00bf\13\31\3\31\3\31\5\31\u00c3\n\31\3\31\3\31\3\32\3\32\3\32\3\32\3" +
                    "\33\3\33\7\33\u00cd\n\33\f\33\16\33\u00d0\13\33\3\33\5\33\u00d3\n\33\3" +
                    "\34\3\34\3\u00bd\2\35\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27" +
                    "\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33" +
                    "\65\2\67\2\3\2\f\5\2C\\aac|\6\2\62;C\\aac|\3\2$$\6\2\f\f\17\17$$^^\4\2" +
                    "\f\f\17\17\3\2))\6\2\f\f\17\17))^^\5\2\13\f\16\17\"\"\3\2\63;\3\2\62;" +
                    "\2\u00e1\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2" +
                    "\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27" +
                    "\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2" +
                    "\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2" +
                    "\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\39\3\2\2\2\5;\3\2\2\2\7A\3\2\2\2" +
                    "\tC\3\2\2\2\13E\3\2\2\2\rG\3\2\2\2\17I\3\2\2\2\21M\3\2\2\2\23O\3\2\2\2" +
                    "\25Q\3\2\2\2\27S\3\2\2\2\31Z\3\2\2\2\33\\\3\2\2\2\35^\3\2\2\2\37f\3\2" +
                    "\2\2!l\3\2\2\2#n\3\2\2\2%p\3\2\2\2\'u\3\2\2\2)\u0085\3\2\2\2+\u0087\3" +
                    "\2\2\2-\u0091\3\2\2\2/\u00ac\3\2\2\2\61\u00c2\3\2\2\2\63\u00c6\3\2\2\2" +
                    "\65\u00d2\3\2\2\2\67\u00d4\3\2\2\29:\7%\2\2:\4\3\2\2\2;<\7h\2\2<=\7t\2" +
                    "\2=>\7q\2\2>?\7o\2\2?@\7s\2\2@\6\3\2\2\2AB\7}\2\2B\b\3\2\2\2CD\7\60\2" +
                    "\2D\n\3\2\2\2EF\7\177\2\2F\f\3\2\2\2GH\7]\2\2H\16\3\2\2\2IJ\7c\2\2JK\7" +
                    "n\2\2KL\7n\2\2L\20\3\2\2\2MN\7,\2\2N\22\3\2\2\2OP\7_\2\2P\24\3\2\2\2Q" +
                    "R\7B\2\2R\26\3\2\2\2ST\7o\2\2TU\7q\2\2UV\7f\2\2VW\7w\2\2WX\7n\2\2XY\7" +
                    "g\2\2Y\30\3\2\2\2Z[\7>\2\2[\32\3\2\2\2\\]\7@\2\2]\34\3\2\2\2^_\7h\2\2" +
                    "_`\7t\2\2`a\7q\2\2ab\7o\2\2bc\7i\2\2cd\7k\2\2de\7v\2\2e\36\3\2\2\2fg\7" +
                    "n\2\2gh\7q\2\2hi\7c\2\2ij\7f\2\2jk\7h\2\2k \3\2\2\2lm\7*\2\2m\"\3\2\2" +
                    "\2no\7+\2\2o$\3\2\2\2pq\7n\2\2qr\7q\2\2rs\7c\2\2st\7f\2\2t&\3\2\2\2uv" +
                    "\7h\2\2vw\7k\2\2wx\7p\2\2xy\7k\2\2yz\7u\2\2z{\7j\2\2{(\3\2\2\2|}\7v\2" +
                    "\2}~\7t\2\2~\177\7w\2\2\177\u0086\7g\2\2\u0080\u0081\7h\2\2\u0081\u0082" +
                    "\7c\2\2\u0082\u0083\7n\2\2\u0083\u0084\7u\2\2\u0084\u0086\7g\2\2\u0085" +
                    "|\3\2\2\2\u0085\u0080\3\2\2\2\u0086*\3\2\2\2\u0087\u008f\5\65\33\2\u0088" +
                    "\u008c\7\60\2\2\u0089\u008b\5\67\34\2\u008a\u0089\3\2\2\2\u008b\u008e" +
                    "\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u0090\3\2\2\2\u008e" +
                    "\u008c\3\2\2\2\u008f\u0088\3\2\2\2\u008f\u0090\3\2\2\2\u0090,\3\2\2\2" +
                    "\u0091\u0095\t\2\2\2\u0092\u0094\t\3\2\2\u0093\u0092\3\2\2\2\u0094\u0097" +
                    "\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096.\3\2\2\2\u0097" +
                    "\u0095\3\2\2\2\u0098\u009e\t\4\2\2\u0099\u009d\n\5\2\2\u009a\u009b\7^" +
                    "\2\2\u009b\u009d\n\6\2\2\u009c\u0099\3\2\2\2\u009c\u009a\3\2\2\2\u009d" +
                    "\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a1\3\2" +
                    "\2\2\u00a0\u009e\3\2\2\2\u00a1\u00ad\t\4\2\2\u00a2\u00a8\t\7\2\2\u00a3" +
                    "\u00a7\n\b\2\2\u00a4\u00a5\7^\2\2\u00a5\u00a7\n\6\2\2\u00a6\u00a3\3\2" +
                    "\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8" +
                    "\u00a9\3\2\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ad\t\7" +
                    "\2\2\u00ac\u0098\3\2\2\2\u00ac\u00a2\3\2\2\2\u00ad\60\3\2\2\2\u00ae\u00af" +
                    "\7\61\2\2\u00af\u00b0\7\61\2\2\u00b0\u00b4\3\2\2\2\u00b1\u00b3\n\6\2\2" +
                    "\u00b2\u00b1\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5" +
                    "\3\2\2\2\u00b5\u00c3\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b8\7\61\2\2" +
                    "\u00b8\u00b9\7,\2\2\u00b9\u00bd\3\2\2\2\u00ba\u00bc\13\2\2\2\u00bb\u00ba" +
                    "\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00be\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be" +
                    "\u00c0\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c1\7,\2\2\u00c1\u00c3\7\61" +
                    "\2\2\u00c2\u00ae\3\2\2\2\u00c2\u00b7\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4" +
                    "\u00c5\b\31\2\2\u00c5\62\3\2\2\2\u00c6\u00c7\t\t\2\2\u00c7\u00c8\3\2\2" +
                    "\2\u00c8\u00c9\b\32\2\2\u00c9\64\3\2\2\2\u00ca\u00ce\t\n\2\2\u00cb\u00cd" +
                    "\5\67\34\2\u00cc\u00cb\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2" +
                    "\u00ce\u00cf\3\2\2\2\u00cf\u00d3\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d3" +
                    "\7\62\2\2\u00d2\u00ca\3\2\2\2\u00d2\u00d1\3\2\2\2\u00d3\66\3\2\2\2\u00d4" +
                    "\u00d5\t\13\2\2\u00d58\3\2\2\2\21\2\u0085\u008c\u008f\u0095\u009c\u009e" +
                    "\u00a6\u00a8\u00ac\u00b4\u00bd\u00c2\u00ce\u00d2\3\b\2\2";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    private static final String[] _LITERAL_NAMES = makeLiteralNames();
    private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);
    public static String[] channelNames = {
            "DEFAULT_TOKEN_CHANNEL", "HIDDEN"
    };
    public static String[] modeNames = {
            "DEFAULT_MODE"
    };

    static {
        RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION);
    }

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

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }

    public ModLexer(CharStream input) {
        super(input);
        _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    private static String[] makeRuleNames() {
        return new String[]{
                "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8",
                "T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16",
                "T__17", "T__18", "Bool", "Number", "Identifier", "String", "Comment",
                "Space", "Int", "Digit"
        };
    }

    private static String[] makeLiteralNames() {
        return new String[]{
                null, "'#'", "'fromq'", "'{'", "'.'", "'}'", "'['", "'all'", "'*'", "']'",
                "'@'", "'module'", "'<'", "'>'", "'fromgit'", "'loadf'", "'('", "')'",
                "'load'", "'finish'"
        };
    }

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, null, null, null, null, null, null, null, null, null, null, null,
                null, null, null, null, null, null, null, null, "Bool", "Number", "Identifier",
                "String", "Comment", "Space"
        };
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
    public String getGrammarFileName() {
        return "Mod.g4";
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public String[] getChannelNames() {
        return channelNames;
    }

    @Override
    public String[] getModeNames() {
        return modeNames;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }
}