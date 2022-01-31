// Generated from C:/Users/Bosque/Documents/GitHub/xxl/src/main/java/xxl/XXLang/etc\XXL.g4 by ANTLR 4.9.2
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
            Component = 10, Render = 11, AddComponent = 12, New = 13, Window = 14, Var = 15, AddWSText = 16,
            Import = 17, Print = 18, Input = 19, Assert = 20, Wait = 21, Size = 22, Def = 23, ToInt = 24,
            Create = 25, WebServer = 26, If = 27, Else = 28, Return = 29, For = 30, While = 31,
            To = 32, Do = 33, End = 34, In = 35, Null = 36, Try = 37, Catch = 38, Class = 39, CreateClass = 40,
            Or = 41, And = 42, Equals = 43, NEquals = 44, GTEquals = 45, LTEquals = 46, Pow = 47,
            Excl = 48, GT = 49, LT = 50, Add = 51, Subtract = 52, Multiply = 53, Divide = 54, Modulus = 55,
            OBrace = 56, CBrace = 57, OBracket = 58, CBracket = 59, OParen = 60, CParen = 61,
            SColon = 62, Assign = 63, Comma = 64, QMark = 65, Colon = 66, Bool = 67, Number = 68,
            Identifier = 69, String = 70, Comment = 71, Space = 72;
    public static final String[] ruleNames = makeRuleNames();
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2J\u023b\b\1\4\2\t" +
                    "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13" +
                    "\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
                    "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!" +
                    "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4" +
                    ",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t" +
                    "\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t=" +
                    "\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I" +
                    "\tI\4J\tJ\4K\tK\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3" +
                    "\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7" +
                    "\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3" +
                    "\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n" +
                    "\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f" +
                    "\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3" +
                    "\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3" +
                    "\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3" +
                    "\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3" +
                    "\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3" +
                    "\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3" +
                    "\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3" +
                    "\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3" +
                    "\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3" +
                    "\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!" +
                    "\3!\3!\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&" +
                    "\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)" +
                    "\3)\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3" +
                    "\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3" +
                    "\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B" +
                    "\3C\3C\3D\3D\3D\3D\3D\3D\3D\3D\3D\5D\u01eb\nD\3E\3E\3E\7E\u01f0\nE\fE" +
                    "\16E\u01f3\13E\5E\u01f5\nE\3F\3F\7F\u01f9\nF\fF\16F\u01fc\13F\3G\3G\3" +
                    "G\3G\7G\u0202\nG\fG\16G\u0205\13G\3G\3G\3G\3G\3G\7G\u020c\nG\fG\16G\u020f" +
                    "\13G\3G\5G\u0212\nG\3H\3H\3H\3H\7H\u0218\nH\fH\16H\u021b\13H\3H\3H\3H" +
                    "\3H\7H\u0221\nH\fH\16H\u0224\13H\3H\3H\5H\u0228\nH\3H\3H\3I\3I\3I\3I\3" +
                    "J\3J\7J\u0232\nJ\fJ\16J\u0235\13J\3J\5J\u0238\nJ\3K\3K\3\u0222\2L\3\3" +
                    "\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21" +
                    "!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!" +
                    "A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s" +
                    ";u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008f" +
                    "I\u0091J\u0093\2\u0095\2\3\2\f\5\2C\\aac|\6\2\62;C\\aac|\3\2$$\6\2\f\f" +
                    "\17\17$$^^\4\2\f\f\17\17\3\2))\6\2\f\f\17\17))^^\5\2\13\f\16\17\"\"\3" +
                    "\2\63;\3\2\62;\2\u0246\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2" +
                    "\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25" +
                    "\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2" +
                    "\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2" +
                    "\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3" +
                    "\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2" +
                    "\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2" +
                    "Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3" +
                    "\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2" +
                    "\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2" +
                    "w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2" +
                    "\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b" +
                    "\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\3\u0097\3\2\2" +
                    "\2\5\u0099\3\2\2\2\7\u00a6\3\2\2\2\t\u00af\3\2\2\2\13\u00b1\3\2\2\2\r" +
                    "\u00b3\3\2\2\2\17\u00c4\3\2\2\2\21\u00d0\3\2\2\2\23\u00d5\3\2\2\2\25\u00dc" +
                    "\3\2\2\2\27\u00e6\3\2\2\2\31\u00ed\3\2\2\2\33\u00f5\3\2\2\2\35\u00f9\3" +
                    "\2\2\2\37\u0104\3\2\2\2!\u0108\3\2\2\2#\u011d\3\2\2\2%\u0124\3\2\2\2\'" +
                    "\u012c\3\2\2\2)\u0132\3\2\2\2+\u0139\3\2\2\2-\u013e\3\2\2\2/\u0143\3\2" +
                    "\2\2\61\u0148\3\2\2\2\63\u014e\3\2\2\2\65\u0155\3\2\2\2\67\u015f\3\2\2" +
                    "\29\u0162\3\2\2\2;\u0167\3\2\2\2=\u016e\3\2\2\2?\u0172\3\2\2\2A\u0178" +
                    "\3\2\2\2C\u017b\3\2\2\2E\u017e\3\2\2\2G\u0183\3\2\2\2I\u0186\3\2\2\2K" +
                    "\u018b\3\2\2\2M\u018f\3\2\2\2O\u0195\3\2\2\2Q\u019b\3\2\2\2S\u01a7\3\2" +
                    "\2\2U\u01aa\3\2\2\2W\u01ad\3\2\2\2Y\u01b0\3\2\2\2[\u01b3\3\2\2\2]\u01b6" +
                    "\3\2\2\2_\u01b9\3\2\2\2a\u01bb\3\2\2\2c\u01bd\3\2\2\2e\u01bf\3\2\2\2g" +
                    "\u01c1\3\2\2\2i\u01c3\3\2\2\2k\u01c5\3\2\2\2m\u01c7\3\2\2\2o\u01c9\3\2" +
                    "\2\2q\u01cb\3\2\2\2s\u01cd\3\2\2\2u\u01cf\3\2\2\2w\u01d1\3\2\2\2y\u01d3" +
                    "\3\2\2\2{\u01d5\3\2\2\2}\u01d7\3\2\2\2\177\u01d9\3\2\2\2\u0081\u01db\3" +
                    "\2\2\2\u0083\u01dd\3\2\2\2\u0085\u01df\3\2\2\2\u0087\u01ea\3\2\2\2\u0089" +
                    "\u01ec\3\2\2\2\u008b\u01f6\3\2\2\2\u008d\u0211\3\2\2\2\u008f\u0227\3\2" +
                    "\2\2\u0091\u022b\3\2\2\2\u0093\u0237\3\2\2\2\u0095\u0239\3\2\2\2\u0097" +
                    "\u0098\7&\2\2\u0098\4\3\2\2\2\u0099\u009a\7x\2\2\u009a\u009b\7q\2\2\u009b" +
                    "\u009c\7k\2\2\u009c\u009d\7f\2\2\u009d\u009e\7\"\2\2\u009e\u009f\7f\2" +
                    "\2\u009f\u00a0\7g\2\2\u00a0\u00a1\7h\2\2\u00a1\u00a2\7c\2\2\u00a2\u00a3" +
                    "\7w\2\2\u00a3\u00a4\7n\2\2\u00a4\u00a5\7v\2\2\u00a5\6\3\2\2\2\u00a6\u00a7" +
                    "\7\60\2\2\u00a7\u00a8\7f\2\2\u00a8\u00a9\7g\2\2\u00a9\u00aa\7h\2\2\u00aa" +
                    "\u00ab\7c\2\2\u00ab\u00ac\7w\2\2\u00ac\u00ad\7n\2\2\u00ad\u00ae\7v\2\2" +
                    "\u00ae\b\3\2\2\2\u00af\u00b0\7%\2\2\u00b0\n\3\2\2\2\u00b1\u00b2\7\60\2" +
                    "\2\u00b2\f\3\2\2\2\u00b3\u00b4\7e\2\2\u00b4\u00b5\7t\2\2\u00b5\u00b6\7" +
                    "g\2\2\u00b6\u00b7\7c\2\2\u00b7\u00b8\7v\2\2\u00b8\u00b9\7g\2\2\u00b9\u00ba" +
                    "\7\"\2\2\u00ba\u00bb\7Y\2\2\u00bb\u00bc\7g\2\2\u00bc\u00bd\7d\2\2\u00bd" +
                    "\u00be\7U\2\2\u00be\u00bf\7g\2\2\u00bf\u00c0\7t\2\2\u00c0\u00c1\7x\2\2" +
                    "\u00c1\u00c2\7g\2\2\u00c2\u00c3\7t\2\2\u00c3\16\3\2\2\2\u00c4\u00c5\7" +
                    "x\2\2\u00c5\u00c6\7q\2\2\u00c6\u00c7\7k\2\2\u00c7\u00c8\7f\2\2\u00c8\u00c9" +
                    "\7\"\2\2\u00c9\u00ca\7o\2\2\u00ca\u00cb\7c\2\2\u00cb\u00cc\7k\2\2\u00cc" +
                    "\u00cd\7p\2\2\u00cd\u00ce\7*\2\2\u00ce\u00cf\7+\2\2\u00cf\20\3\2\2\2\u00d0" +
                    "\u00d1\7g\2\2\u00d1\u00d2\7p\2\2\u00d2\u00d3\7f\2\2\u00d3\u00d4\7e\2\2" +
                    "\u00d4\22\3\2\2\2\u00d5\u00d6\7u\2\2\u00d6\u00d7\7v\2\2\u00d7\u00d8\7" +
                    "f\2\2\u00d8\u00d9\7<\2\2\u00d9\u00da\7n\2\2\u00da\u00db\7p\2\2\u00db\24" +
                    "\3\2\2\2\u00dc\u00dd\7E\2\2\u00dd\u00de\7q\2\2\u00de\u00df\7o\2\2\u00df" +
                    "\u00e0\7r\2\2\u00e0\u00e1\7q\2\2\u00e1\u00e2\7p\2\2\u00e2\u00e3\7g\2\2" +
                    "\u00e3\u00e4\7p\2\2\u00e4\u00e5\7v\2\2\u00e5\26\3\2\2\2\u00e6\u00e7\7" +
                    "t\2\2\u00e7\u00e8\7g\2\2\u00e8\u00e9\7p\2\2\u00e9\u00ea\7f\2\2\u00ea\u00eb" +
                    "\7g\2\2\u00eb\u00ec\7t\2\2\u00ec\30\3\2\2\2\u00ed\u00ee\7c\2\2\u00ee\u00ef" +
                    "\7f\2\2\u00ef\u00f0\7f\2\2\u00f0\u00f1\7E\2\2\u00f1\u00f2\7q\2\2\u00f2" +
                    "\u00f3\7o\2\2\u00f3\u00f4\7r\2\2\u00f4\32\3\2\2\2\u00f5\u00f6\7p\2\2\u00f6" +
                    "\u00f7\7g\2\2\u00f7\u00f8\7y\2\2\u00f8\34\3\2\2\2\u00f9\u00fa\7p\2\2\u00fa" +
                    "\u00fb\7g\2\2\u00fb\u00fc\7y\2\2\u00fc\u00fd\7\"\2\2\u00fd\u00fe\7Y\2" +
                    "\2\u00fe\u00ff\7k\2\2\u00ff\u0100\7p\2\2\u0100\u0101\7f\2\2\u0101\u0102" +
                    "\7q\2\2\u0102\u0103\7y\2\2\u0103\36\3\2\2\2\u0104\u0105\7x\2\2\u0105\u0106" +
                    "\7c\2\2\u0106\u0107\7t\2\2\u0107 \3\2\2\2\u0108\u0109\7Y\2\2\u0109\u010a" +
                    "\7g\2\2\u010a\u010b\7d\2\2\u010b\u010c\7U\2\2\u010c\u010d\7g\2\2\u010d" +
                    "\u010e\7t\2\2\u010e\u010f\7x\2\2\u010f\u0110\7g\2\2\u0110\u0111\7t\2\2" +
                    "\u0111\u0112\7\60\2\2\u0112\u0113\7e\2\2\u0113\u0114\7j\2\2\u0114\u0115" +
                    "\7c\2\2\u0115\u0116\7p\2\2\u0116\u0117\7i\2\2\u0117\u0118\7g\2\2\u0118" +
                    "\u0119\7V\2\2\u0119\u011a\7g\2\2\u011a\u011b\7z\2\2\u011b\u011c\7v\2\2" +
                    "\u011c\"\3\2\2\2\u011d\u011e\7k\2\2\u011e\u011f\7o\2\2\u011f\u0120\7r" +
                    "\2\2\u0120\u0121\7q\2\2\u0121\u0122\7t\2\2\u0122\u0123\7v\2\2\u0123$\3" +
                    "\2\2\2\u0124\u0125\7u\2\2\u0125\u0126\7v\2\2\u0126\u0127\7f\2\2\u0127" +
                    "\u0128\7<\2\2\u0128\u0129\7q\2\2\u0129\u012a\7w\2\2\u012a\u012b\7v\2\2" +
                    "\u012b&\3\2\2\2\u012c\u012d\7k\2\2\u012d\u012e\7p\2\2\u012e\u012f\7r\2" +
                    "\2\u012f\u0130\7w\2\2\u0130\u0131\7v\2\2\u0131(\3\2\2\2\u0132\u0133\7" +
                    "c\2\2\u0133\u0134\7u\2\2\u0134\u0135\7u\2\2\u0135\u0136\7g\2\2\u0136\u0137" +
                    "\7t\2\2\u0137\u0138\7v\2\2\u0138*\3\2\2\2\u0139\u013a\7y\2\2\u013a\u013b" +
                    "\7c\2\2\u013b\u013c\7k\2\2\u013c\u013d\7v\2\2\u013d,\3\2\2\2\u013e\u013f" +
                    "\7u\2\2\u013f\u0140\7k\2\2\u0140\u0141\7|\2\2\u0141\u0142\7g\2\2\u0142" +
                    ".\3\2\2\2\u0143\u0144\7h\2\2\u0144\u0145\7w\2\2\u0145\u0146\7p\2\2\u0146" +
                    "\u0147\7e\2\2\u0147\60\3\2\2\2\u0148\u0149\7v\2\2\u0149\u014a\7q\2\2\u014a" +
                    "\u014b\7K\2\2\u014b\u014c\7p\2\2\u014c\u014d\7v\2\2\u014d\62\3\2\2\2\u014e" +
                    "\u014f\7e\2\2\u014f\u0150\7t\2\2\u0150\u0151\7g\2\2\u0151\u0152\7c\2\2" +
                    "\u0152\u0153\7v\2\2\u0153\u0154\7g\2\2\u0154\64\3\2\2\2\u0155\u0156\7" +
                    "Y\2\2\u0156\u0157\7g\2\2\u0157\u0158\7d\2\2\u0158\u0159\7U\2\2\u0159\u015a" +
                    "\7g\2\2\u015a\u015b\7t\2\2\u015b\u015c\7x\2\2\u015c\u015d\7g\2\2\u015d" +
                    "\u015e\7t\2\2\u015e\66\3\2\2\2\u015f\u0160\7k\2\2\u0160\u0161\7h\2\2\u0161" +
                    "8\3\2\2\2\u0162\u0163\7g\2\2\u0163\u0164\7n\2\2\u0164\u0165\7u\2\2\u0165" +
                    "\u0166\7g\2\2\u0166:\3\2\2\2\u0167\u0168\7t\2\2\u0168\u0169\7g\2\2\u0169" +
                    "\u016a\7v\2\2\u016a\u016b\7w\2\2\u016b\u016c\7t\2\2\u016c\u016d\7p\2\2" +
                    "\u016d<\3\2\2\2\u016e\u016f\7h\2\2\u016f\u0170\7q\2\2\u0170\u0171\7t\2" +
                    "\2\u0171>\3\2\2\2\u0172\u0173\7y\2\2\u0173\u0174\7j\2\2\u0174\u0175\7" +
                    "k\2\2\u0175\u0176\7n\2\2\u0176\u0177\7g\2\2\u0177@\3\2\2\2\u0178\u0179" +
                    "\7v\2\2\u0179\u017a\7q\2\2\u017aB\3\2\2\2\u017b\u017c\7f\2\2\u017c\u017d" +
                    "\7q\2\2\u017dD\3\2\2\2\u017e\u017f\7g\2\2\u017f\u0180\7p\2\2\u0180\u0181" +
                    "\7f\2\2\u0181\u0182\7h\2\2\u0182F\3\2\2\2\u0183\u0184\7k\2\2\u0184\u0185" +
                    "\7p\2\2\u0185H\3\2\2\2\u0186\u0187\7p\2\2\u0187\u0188\7w\2\2\u0188\u0189" +
                    "\7n\2\2\u0189\u018a\7n\2\2\u018aJ\3\2\2\2\u018b\u018c\7v\2\2\u018c\u018d" +
                    "\7t\2\2\u018d\u018e\7{\2\2\u018eL\3\2\2\2\u018f\u0190\7e\2\2\u0190\u0191" +
                    "\7c\2\2\u0191\u0192\7v\2\2\u0192\u0193\7e\2\2\u0193\u0194\7j\2\2\u0194" +
                    "N\3\2\2\2\u0195\u0196\7e\2\2\u0196\u0197\7n\2\2\u0197\u0198\7c\2\2\u0198" +
                    "\u0199\7u\2\2\u0199\u019a\7u\2\2\u019aP\3\2\2\2\u019b\u019c\7e\2\2\u019c" +
                    "\u019d\7t\2\2\u019d\u019e\7g\2\2\u019e\u019f\7c\2\2\u019f\u01a0\7v\2\2" +
                    "\u01a0\u01a1\7g\2\2\u01a1\u01a2\7E\2\2\u01a2\u01a3\7n\2\2\u01a3\u01a4" +
                    "\7c\2\2\u01a4\u01a5\7u\2\2\u01a5\u01a6\7u\2\2\u01a6R\3\2\2\2\u01a7\u01a8" +
                    "\7~\2\2\u01a8\u01a9\7~\2\2\u01a9T\3\2\2\2\u01aa\u01ab\7(\2\2\u01ab\u01ac" +
                    "\7(\2\2\u01acV\3\2\2\2\u01ad\u01ae\7?\2\2\u01ae\u01af\7?\2\2\u01afX\3" +
                    "\2\2\2\u01b0\u01b1\7#\2\2\u01b1\u01b2\7?\2\2\u01b2Z\3\2\2\2\u01b3\u01b4" +
                    "\7@\2\2\u01b4\u01b5\7?\2\2\u01b5\\\3\2\2\2\u01b6\u01b7\7>\2\2\u01b7\u01b8" +
                    "\7?\2\2\u01b8^\3\2\2\2\u01b9\u01ba\7`\2\2\u01ba`\3\2\2\2\u01bb\u01bc\7" +
                    "#\2\2\u01bcb\3\2\2\2\u01bd\u01be\7@\2\2\u01bed\3\2\2\2\u01bf\u01c0\7>" +
                    "\2\2\u01c0f\3\2\2\2\u01c1\u01c2\7-\2\2\u01c2h\3\2\2\2\u01c3\u01c4\7/\2" +
                    "\2\u01c4j\3\2\2\2\u01c5\u01c6\7,\2\2\u01c6l\3\2\2\2\u01c7\u01c8\7\61\2" +
                    "\2\u01c8n\3\2\2\2\u01c9\u01ca\7\'\2\2\u01cap\3\2\2\2\u01cb\u01cc\7}\2" +
                    "\2\u01ccr\3\2\2\2\u01cd\u01ce\7\177\2\2\u01cet\3\2\2\2\u01cf\u01d0\7]" +
                    "\2\2\u01d0v\3\2\2\2\u01d1\u01d2\7_\2\2\u01d2x\3\2\2\2\u01d3\u01d4\7*\2" +
                    "\2\u01d4z\3\2\2\2\u01d5\u01d6\7+\2\2\u01d6|\3\2\2\2\u01d7\u01d8\7=\2\2" +
                    "\u01d8~\3\2\2\2\u01d9\u01da\7?\2\2\u01da\u0080\3\2\2\2\u01db\u01dc\7." +
                    "\2\2\u01dc\u0082\3\2\2\2\u01dd\u01de\7A\2\2\u01de\u0084\3\2\2\2\u01df" +
                    "\u01e0\7<\2\2\u01e0\u0086\3\2\2\2\u01e1\u01e2\7v\2\2\u01e2\u01e3\7t\2" +
                    "\2\u01e3\u01e4\7w\2\2\u01e4\u01eb\7g\2\2\u01e5\u01e6\7h\2\2\u01e6\u01e7" +
                    "\7c\2\2\u01e7\u01e8\7n\2\2\u01e8\u01e9\7u\2\2\u01e9\u01eb\7g\2\2\u01ea" +
                    "\u01e1\3\2\2\2\u01ea\u01e5\3\2\2\2\u01eb\u0088\3\2\2\2\u01ec\u01f4\5\u0093" +
                    "J\2\u01ed\u01f1\7\60\2\2\u01ee\u01f0\5\u0095K\2\u01ef\u01ee\3\2\2\2\u01f0" +
                    "\u01f3\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f5\3\2" +
                    "\2\2\u01f3\u01f1\3\2\2\2\u01f4\u01ed\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5" +
                    "\u008a\3\2\2\2\u01f6\u01fa\t\2\2\2\u01f7\u01f9\t\3\2\2\u01f8\u01f7\3\2" +
                    "\2\2\u01f9\u01fc\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb" +
                    "\u008c\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fd\u0203\t\4\2\2\u01fe\u0202\n\5" +
                    "\2\2\u01ff\u0200\7^\2\2\u0200\u0202\n\6\2\2\u0201\u01fe\3\2\2\2\u0201" +
                    "\u01ff\3\2\2\2\u0202\u0205\3\2\2\2\u0203\u0201\3\2\2\2\u0203\u0204\3\2" +
                    "\2\2\u0204\u0206\3\2\2\2\u0205\u0203\3\2\2\2\u0206\u0212\t\4\2\2\u0207" +
                    "\u020d\t\7\2\2\u0208\u020c\n\b\2\2\u0209\u020a\7^\2\2\u020a\u020c\n\6" +
                    "\2\2\u020b\u0208\3\2\2\2\u020b\u0209\3\2\2\2\u020c\u020f\3\2\2\2\u020d" +
                    "\u020b\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u0210\3\2\2\2\u020f\u020d\3\2" +
                    "\2\2\u0210\u0212\t\7\2\2\u0211\u01fd\3\2\2\2\u0211\u0207\3\2\2\2\u0212" +
                    "\u008e\3\2\2\2\u0213\u0214\7\61\2\2\u0214\u0215\7\61\2\2\u0215\u0219\3" +
                    "\2\2\2\u0216\u0218\n\6\2\2\u0217\u0216\3\2\2\2\u0218\u021b\3\2\2\2\u0219" +
                    "\u0217\3\2\2\2\u0219\u021a\3\2\2\2\u021a\u0228\3\2\2\2\u021b\u0219\3\2" +
                    "\2\2\u021c\u021d\7\61\2\2\u021d\u021e\7,\2\2\u021e\u0222\3\2\2\2\u021f" +
                    "\u0221\13\2\2\2\u0220\u021f\3\2\2\2\u0221\u0224\3\2\2\2\u0222\u0223\3" +
                    "\2\2\2\u0222\u0220\3\2\2\2\u0223\u0225\3\2\2\2\u0224\u0222\3\2\2\2\u0225" +
                    "\u0226\7,\2\2\u0226\u0228\7\61\2\2\u0227\u0213\3\2\2\2\u0227\u021c\3\2" +
                    "\2\2\u0228\u0229\3\2\2\2\u0229\u022a\bH\2\2\u022a\u0090\3\2\2\2\u022b" +
                    "\u022c\t\t\2\2\u022c\u022d\3\2\2\2\u022d\u022e\bI\2\2\u022e\u0092\3\2" +
                    "\2\2\u022f\u0233\t\n\2\2\u0230\u0232\5\u0095K\2\u0231\u0230\3\2\2\2\u0232" +
                    "\u0235\3\2\2\2\u0233\u0231\3\2\2\2\u0233\u0234\3\2\2\2\u0234\u0238\3\2" +
                    "\2\2\u0235\u0233\3\2\2\2\u0236\u0238\7\62\2\2\u0237\u022f\3\2\2\2\u0237" +
                    "\u0236\3\2\2\2\u0238\u0094\3\2\2\2\u0239\u023a\t\13\2\2\u023a\u0096\3" +
                    "\2\2\2\21\2\u01ea\u01f1\u01f4\u01fa\u0201\u0203\u020b\u020d\u0211\u0219" +
                    "\u0222\u0227\u0233\u0237\3\b\2\2";
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
                "Component", "Render", "AddComponent", "New", "Window", "Var", "AddWSText",
                "Import", "Print", "Input", "Assert", "Wait", "Size", "Def", "ToInt",
                "Create", "WebServer", "If", "Else", "Return", "For", "While", "To",
                "Do", "End", "In", "Null", "Try", "Catch", "Class", "CreateClass", "Or",
                "And", "Equals", "NEquals", "GTEquals", "LTEquals", "Pow", "Excl", "GT",
                "LT", "Add", "Subtract", "Multiply", "Divide", "Modulus", "OBrace", "CBrace",
                "OBracket", "CBracket", "OParen", "CParen", "SColon", "Assign", "Comma",
                "QMark", "Colon", "Bool", "Number", "Identifier", "String", "Comment",
                "Space", "Int", "Digit"
        };
    }

    private static String[] makeLiteralNames() {
        return new String[]{
                null, "'$'", "'void default'", "'.default'", "'#'", "'.'", "'create WebServer'",
                "'void main()'", "'endc'", "'std:ln'", "'Component'", "'render'", "'addComp'",
                "'new'", "'new Window'", "'var'", "'WebServer.changeText'", "'import'",
                "'std:out'", "'input'", "'assert'", "'wait'", "'size'", "'func'", "'toInt'",
                "'create'", "'WebServer'", "'if'", "'else'", "'return'", "'for'", "'while'",
                "'to'", "'do'", "'endf'", "'in'", "'null'", "'try'", "'catch'", "'class'",
                "'createClass'", "'||'", "'&&'", "'=='", "'!='", "'>='", "'<='", "'^'",
                "'!'", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'%'", "'{'", "'}'",
                "'['", "']'", "'('", "')'", "';'", "'='", "','", "'?'", "':'"
        };
    }

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, null, null, null, null, null, null, null, null, "Println", "Component",
                "Render", "AddComponent", "New", "Window", "Var", "AddWSText", "Import",
                "Print", "Input", "Assert", "Wait", "Size", "Def", "ToInt", "Create",
                "WebServer", "If", "Else", "Return", "For", "While", "To", "Do", "End",
                "In", "Null", "Try", "Catch", "Class", "CreateClass", "Or", "And", "Equals",
                "NEquals", "GTEquals", "LTEquals", "Pow", "Excl", "GT", "LT", "Add",
                "Subtract", "Multiply", "Divide", "Modulus", "OBrace", "CBrace", "OBracket",
                "CBracket", "OParen", "CParen", "SColon", "Assign", "Comma", "QMark",
                "Colon", "Bool", "Number", "Identifier", "String", "Comment", "Space"
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