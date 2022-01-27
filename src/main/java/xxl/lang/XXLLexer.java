// Generated from C:/Users/Bosque/Downloads/repo/xxl/src/main/java/xxl/XXLang/etc\XXL.g4 by ANTLR 4.9.2
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
            T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, T__7 = 8, Println = 9,
            Var = 10, AddWSText = 11, Import = 12, Print = 13, Input = 14, Assert = 15, Wait = 16,
            Size = 17, Def = 18, ToInt = 19, Create = 20, WebServer = 21, If = 22, Else = 23, Return = 24,
            For = 25, While = 26, To = 27, Do = 28, End = 29, In = 30, Null = 31, Try = 32, Catch = 33,
            Class = 34, CreateClass = 35, Or = 36, And = 37, Equals = 38, NEquals = 39, GTEquals = 40,
            LTEquals = 41, Pow = 42, Excl = 43, GT = 44, LT = 45, Add = 46, Subtract = 47, Multiply = 48,
            Divide = 49, Modulus = 50, OBrace = 51, CBrace = 52, OBracket = 53, CBracket = 54,
            OParen = 55, CParen = 56, SColon = 57, Assign = 58, Comma = 59, QMark = 60, Colon = 61,
            Bool = 62, Number = 63, Identifier = 64, String = 65, Comment = 66, Space = 67;
    public static final String[] ruleNames = makeRuleNames();
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2E\u0209\b\1\4\2\t" +
                    "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13" +
                    "\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
                    "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!" +
                    "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4" +
                    ",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t" +
                    "\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t=" +
                    "\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\3\2\3\2\3\3\3\3" +
                    "\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3" +
                    "\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7" +
                    "\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3" +
                    "\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13" +
                    "\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3" +
                    "\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3" +
                    "\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3" +
                    "\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3" +
                    "\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3" +
                    "\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3" +
                    "\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3" +
                    "\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3" +
                    "\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3" +
                    "!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3" +
                    "$\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3*\3" +
                    "+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3" +
                    "\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3" +
                    "=\3=\3>\3>\3?\3?\3?\3?\3?\3?\3?\3?\3?\5?\u01b9\n?\3@\3@\3@\7@\u01be\n" +
                    "@\f@\16@\u01c1\13@\5@\u01c3\n@\3A\3A\7A\u01c7\nA\fA\16A\u01ca\13A\3B\3" +
                    "B\3B\3B\7B\u01d0\nB\fB\16B\u01d3\13B\3B\3B\3B\3B\3B\7B\u01da\nB\fB\16" +
                    "B\u01dd\13B\3B\5B\u01e0\nB\3C\3C\3C\3C\7C\u01e6\nC\fC\16C\u01e9\13C\3" +
                    "C\3C\3C\3C\7C\u01ef\nC\fC\16C\u01f2\13C\3C\3C\5C\u01f6\nC\3C\3C\3D\3D" +
                    "\3D\3D\3E\3E\7E\u0200\nE\fE\16E\u0203\13E\3E\5E\u0206\nE\3F\3F\3\u01f0" +
                    "\2G\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35" +
                    "\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36" +
                    ";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67" +
                    "m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089\2\u008b\2\3" +
                    "\2\f\5\2C\\aac|\6\2\62;C\\aac|\3\2$$\6\2\f\f\17\17$$^^\4\2\f\f\17\17\3" +
                    "\2))\6\2\f\f\17\17))^^\5\2\13\f\16\17\"\"\3\2\63;\3\2\62;\2\u0214\2\3" +
                    "\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2" +
                    "\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31" +
                    "\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2" +
                    "\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2" +
                    "\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2" +
                    "\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2" +
                    "I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3" +
                    "\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2" +
                    "\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2" +
                    "o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3" +
                    "\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085" +
                    "\3\2\2\2\2\u0087\3\2\2\2\3\u008d\3\2\2\2\5\u008f\3\2\2\2\7\u009c\3\2\2" +
                    "\2\t\u00a5\3\2\2\2\13\u00a7\3\2\2\2\r\u00a9\3\2\2\2\17\u00ba\3\2\2\2\21" +
                    "\u00c6\3\2\2\2\23\u00cb\3\2\2\2\25\u00d2\3\2\2\2\27\u00d6\3\2\2\2\31\u00eb" +
                    "\3\2\2\2\33\u00f2\3\2\2\2\35\u00fa\3\2\2\2\37\u0100\3\2\2\2!\u0107\3\2" +
                    "\2\2#\u010c\3\2\2\2%\u0111\3\2\2\2\'\u0116\3\2\2\2)\u011c\3\2\2\2+\u0123" +
                    "\3\2\2\2-\u012d\3\2\2\2/\u0130\3\2\2\2\61\u0135\3\2\2\2\63\u013c\3\2\2" +
                    "\2\65\u0140\3\2\2\2\67\u0146\3\2\2\29\u0149\3\2\2\2;\u014c\3\2\2\2=\u0151" +
                    "\3\2\2\2?\u0154\3\2\2\2A\u0159\3\2\2\2C\u015d\3\2\2\2E\u0163\3\2\2\2G" +
                    "\u0169\3\2\2\2I\u0175\3\2\2\2K\u0178\3\2\2\2M\u017b\3\2\2\2O\u017e\3\2" +
                    "\2\2Q\u0181\3\2\2\2S\u0184\3\2\2\2U\u0187\3\2\2\2W\u0189\3\2\2\2Y\u018b" +
                    "\3\2\2\2[\u018d\3\2\2\2]\u018f\3\2\2\2_\u0191\3\2\2\2a\u0193\3\2\2\2c" +
                    "\u0195\3\2\2\2e\u0197\3\2\2\2g\u0199\3\2\2\2i\u019b\3\2\2\2k\u019d\3\2" +
                    "\2\2m\u019f\3\2\2\2o\u01a1\3\2\2\2q\u01a3\3\2\2\2s\u01a5\3\2\2\2u\u01a7" +
                    "\3\2\2\2w\u01a9\3\2\2\2y\u01ab\3\2\2\2{\u01ad\3\2\2\2}\u01b8\3\2\2\2\177" +
                    "\u01ba\3\2\2\2\u0081\u01c4\3\2\2\2\u0083\u01df\3\2\2\2\u0085\u01f5\3\2" +
                    "\2\2\u0087\u01f9\3\2\2\2\u0089\u0205\3\2\2\2\u008b\u0207\3\2\2\2\u008d" +
                    "\u008e\7&\2\2\u008e\4\3\2\2\2\u008f\u0090\7x\2\2\u0090\u0091\7q\2\2\u0091" +
                    "\u0092\7k\2\2\u0092\u0093\7f\2\2\u0093\u0094\7\"\2\2\u0094\u0095\7f\2" +
                    "\2\u0095\u0096\7g\2\2\u0096\u0097\7h\2\2\u0097\u0098\7c\2\2\u0098\u0099" +
                    "\7w\2\2\u0099\u009a\7n\2\2\u009a\u009b\7v\2\2\u009b\6\3\2\2\2\u009c\u009d" +
                    "\7\60\2\2\u009d\u009e\7f\2\2\u009e\u009f\7g\2\2\u009f\u00a0\7h\2\2\u00a0" +
                    "\u00a1\7c\2\2\u00a1\u00a2\7w\2\2\u00a2\u00a3\7n\2\2\u00a3\u00a4\7v\2\2" +
                    "\u00a4\b\3\2\2\2\u00a5\u00a6\7%\2\2\u00a6\n\3\2\2\2\u00a7\u00a8\7\60\2" +
                    "\2\u00a8\f\3\2\2\2\u00a9\u00aa\7e\2\2\u00aa\u00ab\7t\2\2\u00ab\u00ac\7" +
                    "g\2\2\u00ac\u00ad\7c\2\2\u00ad\u00ae\7v\2\2\u00ae\u00af\7g\2\2\u00af\u00b0" +
                    "\7\"\2\2\u00b0\u00b1\7Y\2\2\u00b1\u00b2\7g\2\2\u00b2\u00b3\7d\2\2\u00b3" +
                    "\u00b4\7U\2\2\u00b4\u00b5\7g\2\2\u00b5\u00b6\7t\2\2\u00b6\u00b7\7x\2\2" +
                    "\u00b7\u00b8\7g\2\2\u00b8\u00b9\7t\2\2\u00b9\16\3\2\2\2\u00ba\u00bb\7" +
                    "x\2\2\u00bb\u00bc\7q\2\2\u00bc\u00bd\7k\2\2\u00bd\u00be\7f\2\2\u00be\u00bf" +
                    "\7\"\2\2\u00bf\u00c0\7o\2\2\u00c0\u00c1\7c\2\2\u00c1\u00c2\7k\2\2\u00c2" +
                    "\u00c3\7p\2\2\u00c3\u00c4\7*\2\2\u00c4\u00c5\7+\2\2\u00c5\20\3\2\2\2\u00c6" +
                    "\u00c7\7g\2\2\u00c7\u00c8\7p\2\2\u00c8\u00c9\7f\2\2\u00c9\u00ca\7e\2\2" +
                    "\u00ca\22\3\2\2\2\u00cb\u00cc\7u\2\2\u00cc\u00cd\7v\2\2\u00cd\u00ce\7" +
                    "f\2\2\u00ce\u00cf\7<\2\2\u00cf\u00d0\7n\2\2\u00d0\u00d1\7p\2\2\u00d1\24" +
                    "\3\2\2\2\u00d2\u00d3\7x\2\2\u00d3\u00d4\7c\2\2\u00d4\u00d5\7t\2\2\u00d5" +
                    "\26\3\2\2\2\u00d6\u00d7\7Y\2\2\u00d7\u00d8\7g\2\2\u00d8\u00d9\7d\2\2\u00d9" +
                    "\u00da\7U\2\2\u00da\u00db\7g\2\2\u00db\u00dc\7t\2\2\u00dc\u00dd\7x\2\2" +
                    "\u00dd\u00de\7g\2\2\u00de\u00df\7t\2\2\u00df\u00e0\7\60\2\2\u00e0\u00e1" +
                    "\7e\2\2\u00e1\u00e2\7j\2\2\u00e2\u00e3\7c\2\2\u00e3\u00e4\7p\2\2\u00e4" +
                    "\u00e5\7i\2\2\u00e5\u00e6\7g\2\2\u00e6\u00e7\7V\2\2\u00e7\u00e8\7g\2\2" +
                    "\u00e8\u00e9\7z\2\2\u00e9\u00ea\7v\2\2\u00ea\30\3\2\2\2\u00eb\u00ec\7" +
                    "k\2\2\u00ec\u00ed\7o\2\2\u00ed\u00ee\7r\2\2\u00ee\u00ef\7q\2\2\u00ef\u00f0" +
                    "\7t\2\2\u00f0\u00f1\7v\2\2\u00f1\32\3\2\2\2\u00f2\u00f3\7u\2\2\u00f3\u00f4" +
                    "\7v\2\2\u00f4\u00f5\7f\2\2\u00f5\u00f6\7<\2\2\u00f6\u00f7\7q\2\2\u00f7" +
                    "\u00f8\7w\2\2\u00f8\u00f9\7v\2\2\u00f9\34\3\2\2\2\u00fa\u00fb\7k\2\2\u00fb" +
                    "\u00fc\7p\2\2\u00fc\u00fd\7r\2\2\u00fd\u00fe\7w\2\2\u00fe\u00ff\7v\2\2" +
                    "\u00ff\36\3\2\2\2\u0100\u0101\7c\2\2\u0101\u0102\7u\2\2\u0102\u0103\7" +
                    "u\2\2\u0103\u0104\7g\2\2\u0104\u0105\7t\2\2\u0105\u0106\7v\2\2\u0106 " +
                    "\3\2\2\2\u0107\u0108\7y\2\2\u0108\u0109\7c\2\2\u0109\u010a\7k\2\2\u010a" +
                    "\u010b\7v\2\2\u010b\"\3\2\2\2\u010c\u010d\7u\2\2\u010d\u010e\7k\2\2\u010e" +
                    "\u010f\7|\2\2\u010f\u0110\7g\2\2\u0110$\3\2\2\2\u0111\u0112\7h\2\2\u0112" +
                    "\u0113\7w\2\2\u0113\u0114\7p\2\2\u0114\u0115\7e\2\2\u0115&\3\2\2\2\u0116" +
                    "\u0117\7v\2\2\u0117\u0118\7q\2\2\u0118\u0119\7K\2\2\u0119\u011a\7p\2\2" +
                    "\u011a\u011b\7v\2\2\u011b(\3\2\2\2\u011c\u011d\7e\2\2\u011d\u011e\7t\2" +
                    "\2\u011e\u011f\7g\2\2\u011f\u0120\7c\2\2\u0120\u0121\7v\2\2\u0121\u0122" +
                    "\7g\2\2\u0122*\3\2\2\2\u0123\u0124\7Y\2\2\u0124\u0125\7g\2\2\u0125\u0126" +
                    "\7d\2\2\u0126\u0127\7U\2\2\u0127\u0128\7g\2\2\u0128\u0129\7t\2\2\u0129" +
                    "\u012a\7x\2\2\u012a\u012b\7g\2\2\u012b\u012c\7t\2\2\u012c,\3\2\2\2\u012d" +
                    "\u012e\7k\2\2\u012e\u012f\7h\2\2\u012f.\3\2\2\2\u0130\u0131\7g\2\2\u0131" +
                    "\u0132\7n\2\2\u0132\u0133\7u\2\2\u0133\u0134\7g\2\2\u0134\60\3\2\2\2\u0135" +
                    "\u0136\7t\2\2\u0136\u0137\7g\2\2\u0137\u0138\7v\2\2\u0138\u0139\7w\2\2" +
                    "\u0139\u013a\7t\2\2\u013a\u013b\7p\2\2\u013b\62\3\2\2\2\u013c\u013d\7" +
                    "h\2\2\u013d\u013e\7q\2\2\u013e\u013f\7t\2\2\u013f\64\3\2\2\2\u0140\u0141" +
                    "\7y\2\2\u0141\u0142\7j\2\2\u0142\u0143\7k\2\2\u0143\u0144\7n\2\2\u0144" +
                    "\u0145\7g\2\2\u0145\66\3\2\2\2\u0146\u0147\7v\2\2\u0147\u0148\7q\2\2\u0148" +
                    "8\3\2\2\2\u0149\u014a\7f\2\2\u014a\u014b\7q\2\2\u014b:\3\2\2\2\u014c\u014d" +
                    "\7g\2\2\u014d\u014e\7p\2\2\u014e\u014f\7f\2\2\u014f\u0150\7h\2\2\u0150" +
                    "<\3\2\2\2\u0151\u0152\7k\2\2\u0152\u0153\7p\2\2\u0153>\3\2\2\2\u0154\u0155" +
                    "\7p\2\2\u0155\u0156\7w\2\2\u0156\u0157\7n\2\2\u0157\u0158\7n\2\2\u0158" +
                    "@\3\2\2\2\u0159\u015a\7v\2\2\u015a\u015b\7t\2\2\u015b\u015c\7{\2\2\u015c" +
                    "B\3\2\2\2\u015d\u015e\7e\2\2\u015e\u015f\7c\2\2\u015f\u0160\7v\2\2\u0160" +
                    "\u0161\7e\2\2\u0161\u0162\7j\2\2\u0162D\3\2\2\2\u0163\u0164\7e\2\2\u0164" +
                    "\u0165\7n\2\2\u0165\u0166\7c\2\2\u0166\u0167\7u\2\2\u0167\u0168\7u\2\2" +
                    "\u0168F\3\2\2\2\u0169\u016a\7e\2\2\u016a\u016b\7t\2\2\u016b\u016c\7g\2" +
                    "\2\u016c\u016d\7c\2\2\u016d\u016e\7v\2\2\u016e\u016f\7g\2\2\u016f\u0170" +
                    "\7E\2\2\u0170\u0171\7n\2\2\u0171\u0172\7c\2\2\u0172\u0173\7u\2\2\u0173" +
                    "\u0174\7u\2\2\u0174H\3\2\2\2\u0175\u0176\7~\2\2\u0176\u0177\7~\2\2\u0177" +
                    "J\3\2\2\2\u0178\u0179\7(\2\2\u0179\u017a\7(\2\2\u017aL\3\2\2\2\u017b\u017c" +
                    "\7?\2\2\u017c\u017d\7?\2\2\u017dN\3\2\2\2\u017e\u017f\7#\2\2\u017f\u0180" +
                    "\7?\2\2\u0180P\3\2\2\2\u0181\u0182\7@\2\2\u0182\u0183\7?\2\2\u0183R\3" +
                    "\2\2\2\u0184\u0185\7>\2\2\u0185\u0186\7?\2\2\u0186T\3\2\2\2\u0187\u0188" +
                    "\7`\2\2\u0188V\3\2\2\2\u0189\u018a\7#\2\2\u018aX\3\2\2\2\u018b\u018c\7" +
                    "@\2\2\u018cZ\3\2\2\2\u018d\u018e\7>\2\2\u018e\\\3\2\2\2\u018f\u0190\7" +
                    "-\2\2\u0190^\3\2\2\2\u0191\u0192\7/\2\2\u0192`\3\2\2\2\u0193\u0194\7," +
                    "\2\2\u0194b\3\2\2\2\u0195\u0196\7\61\2\2\u0196d\3\2\2\2\u0197\u0198\7" +
                    "\'\2\2\u0198f\3\2\2\2\u0199\u019a\7}\2\2\u019ah\3\2\2\2\u019b\u019c\7" +
                    "\177\2\2\u019cj\3\2\2\2\u019d\u019e\7]\2\2\u019el\3\2\2\2\u019f\u01a0" +
                    "\7_\2\2\u01a0n\3\2\2\2\u01a1\u01a2\7*\2\2\u01a2p\3\2\2\2\u01a3\u01a4\7" +
                    "+\2\2\u01a4r\3\2\2\2\u01a5\u01a6\7=\2\2\u01a6t\3\2\2\2\u01a7\u01a8\7?" +
                    "\2\2\u01a8v\3\2\2\2\u01a9\u01aa\7.\2\2\u01aax\3\2\2\2\u01ab\u01ac\7A\2" +
                    "\2\u01acz\3\2\2\2\u01ad\u01ae\7<\2\2\u01ae|\3\2\2\2\u01af\u01b0\7v\2\2" +
                    "\u01b0\u01b1\7t\2\2\u01b1\u01b2\7w\2\2\u01b2\u01b9\7g\2\2\u01b3\u01b4" +
                    "\7h\2\2\u01b4\u01b5\7c\2\2\u01b5\u01b6\7n\2\2\u01b6\u01b7\7u\2\2\u01b7" +
                    "\u01b9\7g\2\2\u01b8\u01af\3\2\2\2\u01b8\u01b3\3\2\2\2\u01b9~\3\2\2\2\u01ba" +
                    "\u01c2\5\u0089E\2\u01bb\u01bf\7\60\2\2\u01bc\u01be\5\u008bF\2\u01bd\u01bc" +
                    "\3\2\2\2\u01be\u01c1\3\2\2\2\u01bf\u01bd\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0" +
                    "\u01c3\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c2\u01bb\3\2\2\2\u01c2\u01c3\3\2" +
                    "\2\2\u01c3\u0080\3\2\2\2\u01c4\u01c8\t\2\2\2\u01c5\u01c7\t\3\2\2\u01c6" +
                    "\u01c5\3\2\2\2\u01c7\u01ca\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c8\u01c9\3\2" +
                    "\2\2\u01c9\u0082\3\2\2\2\u01ca\u01c8\3\2\2\2\u01cb\u01d1\t\4\2\2\u01cc" +
                    "\u01d0\n\5\2\2\u01cd\u01ce\7^\2\2\u01ce\u01d0\n\6\2\2\u01cf\u01cc\3\2" +
                    "\2\2\u01cf\u01cd\3\2\2\2\u01d0\u01d3\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d1" +
                    "\u01d2\3\2\2\2\u01d2\u01d4\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d4\u01e0\t\4" +
                    "\2\2\u01d5\u01db\t\7\2\2\u01d6\u01da\n\b\2\2\u01d7\u01d8\7^\2\2\u01d8" +
                    "\u01da\n\6\2\2\u01d9\u01d6\3\2\2\2\u01d9\u01d7\3\2\2\2\u01da\u01dd\3\2" +
                    "\2\2\u01db\u01d9\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01de\3\2\2\2\u01dd" +
                    "\u01db\3\2\2\2\u01de\u01e0\t\7\2\2\u01df\u01cb\3\2\2\2\u01df\u01d5\3\2" +
                    "\2\2\u01e0\u0084\3\2\2\2\u01e1\u01e2\7\61\2\2\u01e2\u01e3\7\61\2\2\u01e3" +
                    "\u01e7\3\2\2\2\u01e4\u01e6\n\6\2\2\u01e5\u01e4\3\2\2\2\u01e6\u01e9\3\2" +
                    "\2\2\u01e7\u01e5\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01f6\3\2\2\2\u01e9" +
                    "\u01e7\3\2\2\2\u01ea\u01eb\7\61\2\2\u01eb\u01ec\7,\2\2\u01ec\u01f0\3\2" +
                    "\2\2\u01ed\u01ef\13\2\2\2\u01ee\u01ed\3\2\2\2\u01ef\u01f2\3\2\2\2\u01f0" +
                    "\u01f1\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f1\u01f3\3\2\2\2\u01f2\u01f0\3\2" +
                    "\2\2\u01f3\u01f4\7,\2\2\u01f4\u01f6\7\61\2\2\u01f5\u01e1\3\2\2\2\u01f5" +
                    "\u01ea\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f8\bC\2\2\u01f8\u0086\3\2" +
                    "\2\2\u01f9\u01fa\t\t\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fc\bD\2\2\u01fc" +
                    "\u0088\3\2\2\2\u01fd\u0201\t\n\2\2\u01fe\u0200\5\u008bF\2\u01ff\u01fe" +
                    "\3\2\2\2\u0200\u0203\3\2\2\2\u0201\u01ff\3\2\2\2\u0201\u0202\3\2\2\2\u0202" +
                    "\u0206\3\2\2\2\u0203\u0201\3\2\2\2\u0204\u0206\7\62\2\2\u0205\u01fd\3" +
                    "\2\2\2\u0205\u0204\3\2\2\2\u0206\u008a\3\2\2\2\u0207\u0208\t\13\2\2\u0208" +
                    "\u008c\3\2\2\2\21\2\u01b8\u01bf\u01c2\u01c8\u01cf\u01d1\u01d9\u01db\u01df" +
                    "\u01e7\u01f0\u01f5\u0201\u0205\3\b\2\2";
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
                "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "Println",
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
                "'void main()'", "'endc'", "'std:ln'", "'var'", "'WebServer.changeText'",
                "'import'", "'std:out'", "'input'", "'assert'", "'wait'", "'size'", "'func'",
                "'toInt'", "'create'", "'WebServer'", "'if'", "'else'", "'return'", "'for'",
                "'while'", "'to'", "'do'", "'endf'", "'in'", "'null'", "'try'", "'catch'",
                "'class'", "'createClass'", "'||'", "'&&'", "'=='", "'!='", "'>='", "'<='",
                "'^'", "'!'", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'%'", "'{'",
                "'}'", "'['", "']'", "'('", "')'", "';'", "'='", "','", "'?'", "':'"
        };
    }

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, null, null, null, null, null, null, null, null, "Println", "Var",
                "AddWSText", "Import", "Print", "Input", "Assert", "Wait", "Size", "Def",
                "ToInt", "Create", "WebServer", "If", "Else", "Return", "For", "While",
                "To", "Do", "End", "In", "Null", "Try", "Catch", "Class", "CreateClass",
                "Or", "And", "Equals", "NEquals", "GTEquals", "LTEquals", "Pow", "Excl",
                "GT", "LT", "Add", "Subtract", "Multiply", "Divide", "Modulus", "OBrace",
                "CBrace", "OBracket", "CBracket", "OParen", "CParen", "SColon", "Assign",
                "Comma", "QMark", "Colon", "Bool", "Number", "Identifier", "String",
                "Comment", "Space"
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