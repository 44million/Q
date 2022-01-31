// Generated from /Users/harryharbuck-marlowe/Desktop/xxl/src/main/java/xxl/XXLang/etc/XXL.g4 by ANTLR 4.9.2
package xxl.lang;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XXLLexer extends Lexer {
    public static final int
            T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, T__7 = 8, T__8 = 9,
            T__9 = 10, Println = 11, Component = 12, Render = 13, AddComponent = 14, New = 15,
            Window = 16, Var = 17, AddWSText = 18, Import = 19, Print = 20, Input = 21, Assert = 22,
            Wait = 23, Size = 24, Def = 25, ToInt = 26, Create = 27, WebServer = 28, If = 29, Else = 30,
            Return = 31, For = 32, While = 33, To = 34, Do = 35, End = 36, In = 37, Null = 38, Try = 39,
            Catch = 40, Class = 41, CreateClass = 42, Or = 43, And = 44, Equals = 45, NEquals = 46,
            GTEquals = 47, LTEquals = 48, Pow = 49, Excl = 50, GT = 51, LT = 52, Add = 53, Subtract = 54,
            Multiply = 55, Divide = 56, Modulus = 57, OBrace = 58, CBrace = 59, OBracket = 60,
            CBracket = 61, OParen = 62, CParen = 63, SColon = 64, Assign = 65, Comma = 66, QMark = 67,
            Colon = 68, Bool = 69, Number = 70, Identifier = 71, String = 72, Comment = 73, Space = 74;
    public static final String[] ruleNames = makeRuleNames();
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2L\u0254\b\1\4\2\t" +
                    "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13" +
                    "\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
                    "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!" +
                    "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4" +
                    ",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t" +
                    "\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t=" +
                    "\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I" +
                    "\tI\4J\tJ\4K\tK\4L\tL\4M\tM\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3" +
                    "\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6" +
                    "\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3" +
                    "\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t" +
                    "\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13" +
                    "\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3" +
                    "\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17" +
                    "\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21" +
                    "\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23" +
                    "\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23" +
                    "\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25" +
                    "\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27" +
                    "\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32" +
                    "\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34" +
                    "\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36" +
                    "\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3\"\3" +
                    "\"\3\"\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3\'\3\'\3" +
                    "\'\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3+\3+\3+\3" +
                    "+\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60" +
                    "\3\60\3\61\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66" +
                    "\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3" +
                    "A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3F\3F\3F\3F\3F\3F\3F\5F\u0204\nF\3G\3" +
                    "G\3G\7G\u0209\nG\fG\16G\u020c\13G\5G\u020e\nG\3H\3H\7H\u0212\nH\fH\16" +
                    "H\u0215\13H\3I\3I\3I\3I\7I\u021b\nI\fI\16I\u021e\13I\3I\3I\3I\3I\3I\7" +
                    "I\u0225\nI\fI\16I\u0228\13I\3I\5I\u022b\nI\3J\3J\3J\3J\7J\u0231\nJ\fJ" +
                    "\16J\u0234\13J\3J\3J\3J\3J\7J\u023a\nJ\fJ\16J\u023d\13J\3J\3J\5J\u0241" +
                    "\nJ\3J\3J\3K\3K\3K\3K\3L\3L\7L\u024b\nL\fL\16L\u024e\13L\3L\5L\u0251\n" +
                    "L\3M\3M\3\u023b\2N\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r" +
                    "\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33" +
                    "\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63" +
                    "e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089" +
                    "F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095L\u0097\2\u0099\2\3\2\f\5\2" +
                    "C\\aac|\6\2\62;C\\aac|\3\2$$\6\2\f\f\17\17$$^^\4\2\f\f\17\17\3\2))\6\2" +
                    "\f\f\17\17))^^\5\2\13\f\16\17\"\"\3\2\63;\3\2\62;\2\u025f\2\3\3\2\2\2" +
                    "\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2" +
                    "\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2" +
                    "\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2" +
                    "\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2" +
                    "\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2" +
                    "\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2" +
                    "\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W" +
                    "\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2" +
                    "\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2" +
                    "\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}" +
                    "\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2" +
                    "\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f" +
                    "\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\3\u009b\3\2\2" +
                    "\2\5\u009d\3\2\2\2\7\u00aa\3\2\2\2\t\u00b3\3\2\2\2\13\u00b5\3\2\2\2\r" +
                    "\u00b7\3\2\2\2\17\u00c8\3\2\2\2\21\u00cf\3\2\2\2\23\u00dd\3\2\2\2\25\u00e9" +
                    "\3\2\2\2\27\u00ee\3\2\2\2\31\u00f5\3\2\2\2\33\u00ff\3\2\2\2\35\u0106\3" +
                    "\2\2\2\37\u010e\3\2\2\2!\u0112\3\2\2\2#\u011d\3\2\2\2%\u0121\3\2\2\2\'" +
                    "\u0136\3\2\2\2)\u013d\3\2\2\2+\u0145\3\2\2\2-\u014b\3\2\2\2/\u0152\3\2" +
                    "\2\2\61\u0157\3\2\2\2\63\u015c\3\2\2\2\65\u0161\3\2\2\2\67\u0167\3\2\2" +
                    "\29\u016e\3\2\2\2;\u0178\3\2\2\2=\u017b\3\2\2\2?\u0180\3\2\2\2A\u0187" +
                    "\3\2\2\2C\u018b\3\2\2\2E\u0191\3\2\2\2G\u0194\3\2\2\2I\u0197\3\2\2\2K" +
                    "\u019c\3\2\2\2M\u019f\3\2\2\2O\u01a4\3\2\2\2Q\u01a8\3\2\2\2S\u01ae\3\2" +
                    "\2\2U\u01b4\3\2\2\2W\u01c0\3\2\2\2Y\u01c3\3\2\2\2[\u01c6\3\2\2\2]\u01c9" +
                    "\3\2\2\2_\u01cc\3\2\2\2a\u01cf\3\2\2\2c\u01d2\3\2\2\2e\u01d4\3\2\2\2g" +
                    "\u01d6\3\2\2\2i\u01d8\3\2\2\2k\u01da\3\2\2\2m\u01dc\3\2\2\2o\u01de\3\2" +
                    "\2\2q\u01e0\3\2\2\2s\u01e2\3\2\2\2u\u01e4\3\2\2\2w\u01e6\3\2\2\2y\u01e8" +
                    "\3\2\2\2{\u01ea\3\2\2\2}\u01ec\3\2\2\2\177\u01ee\3\2\2\2\u0081\u01f0\3" +
                    "\2\2\2\u0083\u01f2\3\2\2\2\u0085\u01f4\3\2\2\2\u0087\u01f6\3\2\2\2\u0089" +
                    "\u01f8\3\2\2\2\u008b\u0203\3\2\2\2\u008d\u0205\3\2\2\2\u008f\u020f\3\2" +
                    "\2\2\u0091\u022a\3\2\2\2\u0093\u0240\3\2\2\2\u0095\u0244\3\2\2\2\u0097" +
                    "\u0250\3\2\2\2\u0099\u0252\3\2\2\2\u009b\u009c\7&\2\2\u009c\4\3\2\2\2" +
                    "\u009d\u009e\7x\2\2\u009e\u009f\7q\2\2\u009f\u00a0\7k\2\2\u00a0\u00a1" +
                    "\7f\2\2\u00a1\u00a2\7\"\2\2\u00a2\u00a3\7f\2\2\u00a3\u00a4\7g\2\2\u00a4" +
                    "\u00a5\7h\2\2\u00a5\u00a6\7c\2\2\u00a6\u00a7\7w\2\2\u00a7\u00a8\7n\2\2" +
                    "\u00a8\u00a9\7v\2\2\u00a9\6\3\2\2\2\u00aa\u00ab\7\60\2\2\u00ab\u00ac\7" +
                    "f\2\2\u00ac\u00ad\7g\2\2\u00ad\u00ae\7h\2\2\u00ae\u00af\7c\2\2\u00af\u00b0" +
                    "\7w\2\2\u00b0\u00b1\7n\2\2\u00b1\u00b2\7v\2\2\u00b2\b\3\2\2\2\u00b3\u00b4" +
                    "\7%\2\2\u00b4\n\3\2\2\2\u00b5\u00b6\7\60\2\2\u00b6\f\3\2\2\2\u00b7\u00b8" +
                    "\7e\2\2\u00b8\u00b9\7t\2\2\u00b9\u00ba\7g\2\2\u00ba\u00bb\7c\2\2\u00bb" +
                    "\u00bc\7v\2\2\u00bc\u00bd\7g\2\2\u00bd\u00be\7\"\2\2\u00be\u00bf\7Y\2" +
                    "\2\u00bf\u00c0\7g\2\2\u00c0\u00c1\7d\2\2\u00c1\u00c2\7U\2\2\u00c2\u00c3" +
                    "\7g\2\2\u00c3\u00c4\7t\2\2\u00c4\u00c5\7x\2\2\u00c5\u00c6\7g\2\2\u00c6" +
                    "\u00c7\7t\2\2\u00c7\16\3\2\2\2\u00c8\u00c9\7Y\2\2\u00c9\u00ca\7k\2\2\u00ca" +
                    "\u00cb\7p\2\2\u00cb\u00cc\7f\2\2\u00cc\u00cd\7q\2\2\u00cd\u00ce\7y\2\2" +
                    "\u00ce\20\3\2\2\2\u00cf\u00d0\7p\2\2\u00d0\u00d1\7g\2\2\u00d1\u00d2\7" +
                    "y\2\2\u00d2\u00d3\7\"\2\2\u00d3\u00d4\7E\2\2\u00d4\u00d5\7q\2\2\u00d5" +
                    "\u00d6\7o\2\2\u00d6\u00d7\7r\2\2\u00d7\u00d8\7q\2\2\u00d8\u00d9\7p\2\2" +
                    "\u00d9\u00da\7g\2\2\u00da\u00db\7p\2\2\u00db\u00dc\7v\2\2\u00dc\22\3\2" +
                    "\2\2\u00dd\u00de\7x\2\2\u00de\u00df\7q\2\2\u00df\u00e0\7k\2\2\u00e0\u00e1" +
                    "\7f\2\2\u00e1\u00e2\7\"\2\2\u00e2\u00e3\7o\2\2\u00e3\u00e4\7c\2\2\u00e4" +
                    "\u00e5\7k\2\2\u00e5\u00e6\7p\2\2\u00e6\u00e7\7*\2\2\u00e7\u00e8\7+\2\2" +
                    "\u00e8\24\3\2\2\2\u00e9\u00ea\7g\2\2\u00ea\u00eb\7p\2\2\u00eb\u00ec\7" +
                    "f\2\2\u00ec\u00ed\7e\2\2\u00ed\26\3\2\2\2\u00ee\u00ef\7u\2\2\u00ef\u00f0" +
                    "\7v\2\2\u00f0\u00f1\7f\2\2\u00f1\u00f2\7<\2\2\u00f2\u00f3\7n\2\2\u00f3" +
                    "\u00f4\7p\2\2\u00f4\30\3\2\2\2\u00f5\u00f6\7E\2\2\u00f6\u00f7\7q\2\2\u00f7" +
                    "\u00f8\7o\2\2\u00f8\u00f9\7r\2\2\u00f9\u00fa\7q\2\2\u00fa\u00fb\7p\2\2" +
                    "\u00fb\u00fc\7g\2\2\u00fc\u00fd\7p\2\2\u00fd\u00fe\7v\2\2\u00fe\32\3\2" +
                    "\2\2\u00ff\u0100\7t\2\2\u0100\u0101\7g\2\2\u0101\u0102\7p\2\2\u0102\u0103" +
                    "\7f\2\2\u0103\u0104\7g\2\2\u0104\u0105\7t\2\2\u0105\34\3\2\2\2\u0106\u0107" +
                    "\7c\2\2\u0107\u0108\7f\2\2\u0108\u0109\7f\2\2\u0109\u010a\7E\2\2\u010a" +
                    "\u010b\7q\2\2\u010b\u010c\7o\2\2\u010c\u010d\7r\2\2\u010d\36\3\2\2\2\u010e" +
                    "\u010f\7p\2\2\u010f\u0110\7g\2\2\u0110\u0111\7y\2\2\u0111 \3\2\2\2\u0112" +
                    "\u0113\7p\2\2\u0113\u0114\7g\2\2\u0114\u0115\7y\2\2\u0115\u0116\7\"\2" +
                    "\2\u0116\u0117\7Y\2\2\u0117\u0118\7k\2\2\u0118\u0119\7p\2\2\u0119\u011a" +
                    "\7f\2\2\u011a\u011b\7q\2\2\u011b\u011c\7y\2\2\u011c\"\3\2\2\2\u011d\u011e" +
                    "\7x\2\2\u011e\u011f\7c\2\2\u011f\u0120\7t\2\2\u0120$\3\2\2\2\u0121\u0122" +
                    "\7Y\2\2\u0122\u0123\7g\2\2\u0123\u0124\7d\2\2\u0124\u0125\7U\2\2\u0125" +
                    "\u0126\7g\2\2\u0126\u0127\7t\2\2\u0127\u0128\7x\2\2\u0128\u0129\7g\2\2" +
                    "\u0129\u012a\7t\2\2\u012a\u012b\7\60\2\2\u012b\u012c\7e\2\2\u012c\u012d" +
                    "\7j\2\2\u012d\u012e\7c\2\2\u012e\u012f\7p\2\2\u012f\u0130\7i\2\2\u0130" +
                    "\u0131\7g\2\2\u0131\u0132\7V\2\2\u0132\u0133\7g\2\2\u0133\u0134\7z\2\2" +
                    "\u0134\u0135\7v\2\2\u0135&\3\2\2\2\u0136\u0137\7k\2\2\u0137\u0138\7o\2" +
                    "\2\u0138\u0139\7r\2\2\u0139\u013a\7q\2\2\u013a\u013b\7t\2\2\u013b\u013c" +
                    "\7v\2\2\u013c(\3\2\2\2\u013d\u013e\7u\2\2\u013e\u013f\7v\2\2\u013f\u0140" +
                    "\7f\2\2\u0140\u0141\7<\2\2\u0141\u0142\7q\2\2\u0142\u0143\7w\2\2\u0143" +
                    "\u0144\7v\2\2\u0144*\3\2\2\2\u0145\u0146\7k\2\2\u0146\u0147\7p\2\2\u0147" +
                    "\u0148\7r\2\2\u0148\u0149\7w\2\2\u0149\u014a\7v\2\2\u014a,\3\2\2\2\u014b" +
                    "\u014c\7c\2\2\u014c\u014d\7u\2\2\u014d\u014e\7u\2\2\u014e\u014f\7g\2\2" +
                    "\u014f\u0150\7t\2\2\u0150\u0151\7v\2\2\u0151.\3\2\2\2\u0152\u0153\7y\2" +
                    "\2\u0153\u0154\7c\2\2\u0154\u0155\7k\2\2\u0155\u0156\7v\2\2\u0156\60\3" +
                    "\2\2\2\u0157\u0158\7u\2\2\u0158\u0159\7k\2\2\u0159\u015a\7|\2\2\u015a" +
                    "\u015b\7g\2\2\u015b\62\3\2\2\2\u015c\u015d\7h\2\2\u015d\u015e\7w\2\2\u015e" +
                    "\u015f\7p\2\2\u015f\u0160\7e\2\2\u0160\64\3\2\2\2\u0161\u0162\7v\2\2\u0162" +
                    "\u0163\7q\2\2\u0163\u0164\7K\2\2\u0164\u0165\7p\2\2\u0165\u0166\7v\2\2" +
                    "\u0166\66\3\2\2\2\u0167\u0168\7e\2\2\u0168\u0169\7t\2\2\u0169\u016a\7" +
                    "g\2\2\u016a\u016b\7c\2\2\u016b\u016c\7v\2\2\u016c\u016d\7g\2\2\u016d8" +
                    "\3\2\2\2\u016e\u016f\7Y\2\2\u016f\u0170\7g\2\2\u0170\u0171\7d\2\2\u0171" +
                    "\u0172\7U\2\2\u0172\u0173\7g\2\2\u0173\u0174\7t\2\2\u0174\u0175\7x\2\2" +
                    "\u0175\u0176\7g\2\2\u0176\u0177\7t\2\2\u0177:\3\2\2\2\u0178\u0179\7k\2" +
                    "\2\u0179\u017a\7h\2\2\u017a<\3\2\2\2\u017b\u017c\7g\2\2\u017c\u017d\7" +
                    "n\2\2\u017d\u017e\7u\2\2\u017e\u017f\7g\2\2\u017f>\3\2\2\2\u0180\u0181" +
                    "\7t\2\2\u0181\u0182\7g\2\2\u0182\u0183\7v\2\2\u0183\u0184\7w\2\2\u0184" +
                    "\u0185\7t\2\2\u0185\u0186\7p\2\2\u0186@\3\2\2\2\u0187\u0188\7h\2\2\u0188" +
                    "\u0189\7q\2\2\u0189\u018a\7t\2\2\u018aB\3\2\2\2\u018b\u018c\7y\2\2\u018c" +
                    "\u018d\7j\2\2\u018d\u018e\7k\2\2\u018e\u018f\7n\2\2\u018f\u0190\7g\2\2" +
                    "\u0190D\3\2\2\2\u0191\u0192\7v\2\2\u0192\u0193\7q\2\2\u0193F\3\2\2\2\u0194" +
                    "\u0195\7f\2\2\u0195\u0196\7q\2\2\u0196H\3\2\2\2\u0197\u0198\7g\2\2\u0198" +
                    "\u0199\7p\2\2\u0199\u019a\7f\2\2\u019a\u019b\7h\2\2\u019bJ\3\2\2\2\u019c" +
                    "\u019d\7k\2\2\u019d\u019e\7p\2\2\u019eL\3\2\2\2\u019f\u01a0\7p\2\2\u01a0" +
                    "\u01a1\7w\2\2\u01a1\u01a2\7n\2\2\u01a2\u01a3\7n\2\2\u01a3N\3\2\2\2\u01a4" +
                    "\u01a5\7v\2\2\u01a5\u01a6\7t\2\2\u01a6\u01a7\7{\2\2\u01a7P\3\2\2\2\u01a8" +
                    "\u01a9\7e\2\2\u01a9\u01aa\7c\2\2\u01aa\u01ab\7v\2\2\u01ab\u01ac\7e\2\2" +
                    "\u01ac\u01ad\7j\2\2\u01adR\3\2\2\2\u01ae\u01af\7e\2\2\u01af\u01b0\7n\2" +
                    "\2\u01b0\u01b1\7c\2\2\u01b1\u01b2\7u\2\2\u01b2\u01b3\7u\2\2\u01b3T\3\2" +
                    "\2\2\u01b4\u01b5\7e\2\2\u01b5\u01b6\7t\2\2\u01b6\u01b7\7g\2\2\u01b7\u01b8" +
                    "\7c\2\2\u01b8\u01b9\7v\2\2\u01b9\u01ba\7g\2\2\u01ba\u01bb\7E\2\2\u01bb" +
                    "\u01bc\7n\2\2\u01bc\u01bd\7c\2\2\u01bd\u01be\7u\2\2\u01be\u01bf\7u\2\2" +
                    "\u01bfV\3\2\2\2\u01c0\u01c1\7~\2\2\u01c1\u01c2\7~\2\2\u01c2X\3\2\2\2\u01c3" +
                    "\u01c4\7(\2\2\u01c4\u01c5\7(\2\2\u01c5Z\3\2\2\2\u01c6\u01c7\7?\2\2\u01c7" +
                    "\u01c8\7?\2\2\u01c8\\\3\2\2\2\u01c9\u01ca\7#\2\2\u01ca\u01cb\7?\2\2\u01cb" +
                    "^\3\2\2\2\u01cc\u01cd\7@\2\2\u01cd\u01ce\7?\2\2\u01ce`\3\2\2\2\u01cf\u01d0" +
                    "\7>\2\2\u01d0\u01d1\7?\2\2\u01d1b\3\2\2\2\u01d2\u01d3\7`\2\2\u01d3d\3" +
                    "\2\2\2\u01d4\u01d5\7#\2\2\u01d5f\3\2\2\2\u01d6\u01d7\7@\2\2\u01d7h\3\2" +
                    "\2\2\u01d8\u01d9\7>\2\2\u01d9j\3\2\2\2\u01da\u01db\7-\2\2\u01dbl\3\2\2" +
                    "\2\u01dc\u01dd\7/\2\2\u01ddn\3\2\2\2\u01de\u01df\7,\2\2\u01dfp\3\2\2\2" +
                    "\u01e0\u01e1\7\61\2\2\u01e1r\3\2\2\2\u01e2\u01e3\7\'\2\2\u01e3t\3\2\2" +
                    "\2\u01e4\u01e5\7}\2\2\u01e5v\3\2\2\2\u01e6\u01e7\7\177\2\2\u01e7x\3\2" +
                    "\2\2\u01e8\u01e9\7]\2\2\u01e9z\3\2\2\2\u01ea\u01eb\7_\2\2\u01eb|\3\2\2" +
                    "\2\u01ec\u01ed\7*\2\2\u01ed~\3\2\2\2\u01ee\u01ef\7+\2\2\u01ef\u0080\3" +
                    "\2\2\2\u01f0\u01f1\7=\2\2\u01f1\u0082\3\2\2\2\u01f2\u01f3\7?\2\2\u01f3" +
                    "\u0084\3\2\2\2\u01f4\u01f5\7.\2\2\u01f5\u0086\3\2\2\2\u01f6\u01f7\7A\2" +
                    "\2\u01f7\u0088\3\2\2\2\u01f8\u01f9\7<\2\2\u01f9\u008a\3\2\2\2\u01fa\u01fb" +
                    "\7v\2\2\u01fb\u01fc\7t\2\2\u01fc\u01fd\7w\2\2\u01fd\u0204\7g\2\2\u01fe" +
                    "\u01ff\7h\2\2\u01ff\u0200\7c\2\2\u0200\u0201\7n\2\2\u0201\u0202\7u\2\2" +
                    "\u0202\u0204\7g\2\2\u0203\u01fa\3\2\2\2\u0203\u01fe\3\2\2\2\u0204\u008c" +
                    "\3\2\2\2\u0205\u020d\5\u0097L\2\u0206\u020a\7\60\2\2\u0207\u0209\5\u0099" +
                    "M\2\u0208\u0207\3\2\2\2\u0209\u020c\3\2\2\2\u020a\u0208\3\2\2\2\u020a" +
                    "\u020b\3\2\2\2\u020b\u020e\3\2\2\2\u020c\u020a\3\2\2\2\u020d\u0206\3\2" +
                    "\2\2\u020d\u020e\3\2\2\2\u020e\u008e\3\2\2\2\u020f\u0213\t\2\2\2\u0210" +
                    "\u0212\t\3\2\2\u0211\u0210\3\2\2\2\u0212\u0215\3\2\2\2\u0213\u0211\3\2" +
                    "\2\2\u0213\u0214\3\2\2\2\u0214\u0090\3\2\2\2\u0215\u0213\3\2\2\2\u0216" +
                    "\u021c\t\4\2\2\u0217\u021b\n\5\2\2\u0218\u0219\7^\2\2\u0219\u021b\n\6" +
                    "\2\2\u021a\u0217\3\2\2\2\u021a\u0218\3\2\2\2\u021b\u021e\3\2\2\2\u021c" +
                    "\u021a\3\2\2\2\u021c\u021d\3\2\2\2\u021d\u021f\3\2\2\2\u021e\u021c\3\2" +
                    "\2\2\u021f\u022b\t\4\2\2\u0220\u0226\t\7\2\2\u0221\u0225\n\b\2\2\u0222" +
                    "\u0223\7^\2\2\u0223\u0225\n\6\2\2\u0224\u0221\3\2\2\2\u0224\u0222\3\2" +
                    "\2\2\u0225\u0228\3\2\2\2\u0226\u0224\3\2\2\2\u0226\u0227\3\2\2\2\u0227" +
                    "\u0229\3\2\2\2\u0228\u0226\3\2\2\2\u0229\u022b\t\7\2\2\u022a\u0216\3\2" +
                    "\2\2\u022a\u0220\3\2\2\2\u022b\u0092\3\2\2\2\u022c\u022d\7\61\2\2\u022d" +
                    "\u022e\7\61\2\2\u022e\u0232\3\2\2\2\u022f\u0231\n\6\2\2\u0230\u022f\3" +
                    "\2\2\2\u0231\u0234\3\2\2\2\u0232\u0230\3\2\2\2\u0232\u0233\3\2\2\2\u0233" +
                    "\u0241\3\2\2\2\u0234\u0232\3\2\2\2\u0235\u0236\7\61\2\2\u0236\u0237\7" +
                    ",\2\2\u0237\u023b\3\2\2\2\u0238\u023a\13\2\2\2\u0239\u0238\3\2\2\2\u023a" +
                    "\u023d\3\2\2\2\u023b\u023c\3\2\2\2\u023b\u0239\3\2\2\2\u023c\u023e\3\2" +
                    "\2\2\u023d\u023b\3\2\2\2\u023e\u023f\7,\2\2\u023f\u0241\7\61\2\2\u0240" +
                    "\u022c\3\2\2\2\u0240\u0235\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0243\bJ" +
                    "\2\2\u0243\u0094\3\2\2\2\u0244\u0245\t\t\2\2\u0245\u0246\3\2\2\2\u0246" +
                    "\u0247\bK\2\2\u0247\u0096\3\2\2\2\u0248\u024c\t\n\2\2\u0249\u024b\5\u0099" +
                    "M\2\u024a\u0249\3\2\2\2\u024b\u024e\3\2\2\2\u024c\u024a\3\2\2\2\u024c" +
                    "\u024d\3\2\2\2\u024d\u0251\3\2\2\2\u024e\u024c\3\2\2\2\u024f\u0251\7\62" +
                    "\2\2\u0250\u0248\3\2\2\2\u0250\u024f\3\2\2\2\u0251\u0098\3\2\2\2\u0252" +
                    "\u0253\t\13\2\2\u0253\u009a\3\2\2\2\21\2\u0203\u020a\u020d\u0213\u021a" +
                    "\u021c\u0224\u0226\u022a\u0232\u023b\u0240\u024c\u0250\3\b\2\2";
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

    public XXLLexer(CharStream input) {
        super(input);
        _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    private static String[] makeRuleNames() {
        return new String[]{
                "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8",
                "T__9", "Println", "Component", "Render", "AddComponent", "New", "Window",
                "Var", "AddWSText", "Import", "Print", "Input", "Assert", "Wait", "Size",
                "Def", "ToInt", "Create", "WebServer", "If", "Else", "Return", "For",
                "While", "To", "Do", "End", "In", "Null", "Try", "Catch", "Class", "CreateClass",
                "Or", "And", "Equals", "NEquals", "GTEquals", "LTEquals", "Pow", "Excl",
                "GT", "LT", "Add", "Subtract", "Multiply", "Divide", "Modulus", "OBrace",
                "CBrace", "OBracket", "CBracket", "OParen", "CParen", "SColon", "Assign",
                "Comma", "QMark", "Colon", "Bool", "Number", "Identifier", "String",
                "Comment", "Space", "Int", "Digit"
        };
    }

    private static String[] makeLiteralNames() {
        return new String[]{
                null, "'$'", "'void default'", "'.default'", "'#'", "'.'", "'create WebServer'",
                "'Window'", "'new Component'", "'void main()'", "'endc'", "'std:ln'",
                "'Component'", "'render'", "'addComp'", "'new'", "'new Window'", "'var'",
                "'WebServer.changeText'", "'import'", "'std:out'", "'input'", "'assert'",
                "'wait'", "'size'", "'func'", "'toInt'", "'create'", "'WebServer'", "'if'",
                "'else'", "'return'", "'for'", "'while'", "'to'", "'do'", "'endf'", "'in'",
                "'null'", "'try'", "'catch'", "'class'", "'createClass'", "'||'", "'&&'",
                "'=='", "'!='", "'>='", "'<='", "'^'", "'!'", "'>'", "'<'", "'+'", "'-'",
                "'*'", "'/'", "'%'", "'{'", "'}'", "'['", "']'", "'('", "')'", "';'",
                "'='", "','", "'?'", "':'"
        };
    }

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, null, null, null, null, null, null, null, null, null, null, "Println",
                "Component", "Render", "AddComponent", "New", "Window", "Var", "AddWSText",
                "Import", "Print", "Input", "Assert", "Wait", "Size", "Def", "ToInt",
                "Create", "WebServer", "If", "Else", "Return", "For", "While", "To",
                "Do", "End", "In", "Null", "Try", "Catch", "Class", "CreateClass", "Or",
                "And", "Equals", "NEquals", "GTEquals", "LTEquals", "Pow", "Excl", "GT",
                "LT", "Add", "Subtract", "Multiply", "Divide", "Modulus", "OBrace", "CBrace",
                "OBracket", "CBracket", "OParen", "CParen", "SColon", "Assign", "Comma",
                "QMark", "Colon", "Bool", "Number", "Identifier", "String", "Comment",
                "Space"
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
        return "XXL.g4";
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