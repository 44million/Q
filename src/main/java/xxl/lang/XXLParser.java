// Generated from C:/Users/Bosque/Downloads/repo/xxl/src/main/java/xxl/XXLang/etc\XXL.g4 by ANTLR 4.9.2
package xxl.lang;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XXLParser extends Parser {
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
    public static final int
            RULE_parse = 0, RULE_block = 1, RULE_statement = 2, RULE_assignment = 3,
            RULE_reAssignment = 4, RULE_functionCall = 5, RULE_ifStatement = 6, RULE_ifStat = 7,
            RULE_elseIfStat = 8, RULE_constructorStatement = 9, RULE_defaultCall = 10,
            RULE_elseStat = 11, RULE_functionDecl = 12, RULE_forStatement = 13, RULE_importStatement = 14,
            RULE_tryCatchStatement = 15, RULE_whileStatement = 16, RULE_webServerStatement = 17,
            RULE_addWebServerTextStatement = 18, RULE_waitStatement = 19, RULE_mainFunctionStatement = 20,
            RULE_idList = 21, RULE_classStatement = 22, RULE_exprList = 23, RULE_expression = 24,
            RULE_list = 25, RULE_indexes = 26;
    public static final String[] ruleNames = makeRuleNames();
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3E\u017b\4\2\t\2\4" +
                    "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
                    "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
                    "\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\3\3\3\7\3>\n\3\f\3\16\3A" +
                    "\13\3\3\3\3\3\3\3\3\3\5\3G\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4" +
                    "\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3" +
                    "\4\3\4\3\4\3\4\5\4h\n\4\3\5\3\5\3\5\5\5m\n\5\3\5\3\5\3\5\3\6\3\6\5\6t" +
                    "\n\6\3\6\3\6\3\6\3\7\3\7\3\7\5\7|\n\7\3\7\3\7\3\7\3\7\5\7\u0082\n\7\3" +
                    "\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7" +
                    "\3\7\3\7\3\7\5\7\u0099\n\7\3\b\3\b\7\b\u009d\n\b\f\b\16\b\u00a0\13\b\3" +
                    "\b\5\b\u00a3\n\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3" +
                    "\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\7\13\u00bb\n\13\f\13\16\13\u00be" +
                    "\13\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3" +
                    "\16\3\16\3\16\5\16\u00d1\n\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17" +
                    "\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\7\20\u00e6\n\20" +
                    "\f\20\16\20\u00e9\13\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3" +
                    "\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3" +
                    "\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3" +
                    "\27\3\27\7\27\u0112\n\27\f\27\16\27\u0115\13\27\3\30\3\30\3\30\3\30\3" +
                    "\30\3\31\3\31\3\31\7\31\u011f\n\31\f\31\16\31\u0122\13\31\3\32\3\32\3" +
                    "\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u012e\n\32\3\32\3\32\5\32" +
                    "\u0132\n\32\3\32\3\32\5\32\u0136\n\32\3\32\3\32\5\32\u013a\n\32\3\32\3" +
                    "\32\3\32\3\32\5\32\u0140\n\32\3\32\3\32\3\32\5\32\u0145\n\32\3\32\5\32" +
                    "\u0148\n\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32" +
                    "\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32" +
                    "\3\32\3\32\3\32\3\32\7\32\u0168\n\32\f\32\16\32\u016b\13\32\3\33\3\33" +
                    "\5\33\u016f\n\33\3\33\3\33\3\34\3\34\3\34\3\34\6\34\u0177\n\34\r\34\16" +
                    "\34\u0178\3\34\2\3\62\35\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(" +
                    "*,.\60\62\64\66\2\6\3\2\62\64\3\2\60\61\4\2*+./\3\2()\2\u019b\28\3\2\2" +
                    "\2\4?\3\2\2\2\6g\3\2\2\2\bi\3\2\2\2\nq\3\2\2\2\f\u0098\3\2\2\2\16\u009a" +
                    "\3\2\2\2\20\u00a6\3\2\2\2\22\u00ad\3\2\2\2\24\u00b5\3\2\2\2\26\u00c3\3" +
                    "\2\2\2\30\u00c8\3\2\2\2\32\u00cc\3\2\2\2\34\u00d6\3\2\2\2\36\u00e0\3\2" +
                    "\2\2 \u00ea\3\2\2\2\"\u00f3\3\2\2\2$\u00fb\3\2\2\2&\u0100\3\2\2\2(\u0105" +
                    "\3\2\2\2*\u010a\3\2\2\2,\u010e\3\2\2\2.\u0116\3\2\2\2\60\u011b\3\2\2\2" +
                    "\62\u0147\3\2\2\2\64\u016c\3\2\2\2\66\u0176\3\2\2\289\5\4\3\29:\7\2\2" +
                    "\3:\3\3\2\2\2;>\5\6\4\2<>\5\32\16\2=;\3\2\2\2=<\3\2\2\2>A\3\2\2\2?=\3" +
                    "\2\2\2?@\3\2\2\2@F\3\2\2\2A?\3\2\2\2BC\7\32\2\2CD\5\62\32\2DE\7;\2\2E" +
                    "G\3\2\2\2FB\3\2\2\2FG\3\2\2\2G\5\3\2\2\2HI\5\b\5\2IJ\7;\2\2Jh\3\2\2\2" +
                    "KL\5\f\7\2LM\7;\2\2Mh\3\2\2\2Nh\5\16\b\2Oh\5\34\17\2Ph\5\"\22\2QR\5\36" +
                    "\20\2RS\7;\2\2Sh\3\2\2\2Th\5 \21\2Uh\5*\26\2VW\5$\23\2WX\7;\2\2Xh\3\2" +
                    "\2\2YZ\5&\24\2Z[\7;\2\2[h\3\2\2\2\\]\5\n\6\2]^\7;\2\2^h\3\2\2\2_h\5.\30" +
                    "\2`h\5\24\13\2ab\5\26\f\2bc\7;\2\2ch\3\2\2\2de\5(\25\2ef\7;\2\2fh\3\2" +
                    "\2\2gH\3\2\2\2gK\3\2\2\2gN\3\2\2\2gO\3\2\2\2gP\3\2\2\2gQ\3\2\2\2gT\3\2" +
                    "\2\2gU\3\2\2\2gV\3\2\2\2gY\3\2\2\2g\\\3\2\2\2g_\3\2\2\2g`\3\2\2\2ga\3" +
                    "\2\2\2gd\3\2\2\2h\7\3\2\2\2ij\7\f\2\2jl\7B\2\2km\5\66\34\2lk\3\2\2\2l" +
                    "m\3\2\2\2mn\3\2\2\2no\7<\2\2op\5\62\32\2p\t\3\2\2\2qs\7B\2\2rt\5\66\34" +
                    "\2sr\3\2\2\2st\3\2\2\2tu\3\2\2\2uv\7<\2\2vw\5\62\32\2w\13\3\2\2\2xy\7" +
                    "B\2\2y{\79\2\2z|\5\60\31\2{z\3\2\2\2{|\3\2\2\2|}\3\2\2\2}\u0099\7:\2\2" +
                    "~\177\7\13\2\2\177\u0081\79\2\2\u0080\u0082\5\62\32\2\u0081\u0080\3\2" +
                    "\2\2\u0081\u0082\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0099\7:\2\2\u0084" +
                    "\u0085\7\17\2\2\u0085\u0086\79\2\2\u0086\u0087\5\62\32\2\u0087\u0088\7" +
                    ":\2\2\u0088\u0099\3\2\2\2\u0089\u008a\7\21\2\2\u008a\u008b\79\2\2\u008b" +
                    "\u008c\5\62\32\2\u008c\u008d\7:\2\2\u008d\u0099\3\2\2\2\u008e\u008f\7" +
                    "\23\2\2\u008f\u0090\79\2\2\u0090\u0091\5\62\32\2\u0091\u0092\7:\2\2\u0092" +
                    "\u0099\3\2\2\2\u0093\u0094\7\25\2\2\u0094\u0095\79\2\2\u0095\u0096\5\62" +
                    "\32\2\u0096\u0097\7:\2\2\u0097\u0099\3\2\2\2\u0098x\3\2\2\2\u0098~\3\2" +
                    "\2\2\u0098\u0084\3\2\2\2\u0098\u0089\3\2\2\2\u0098\u008e\3\2\2\2\u0098" +
                    "\u0093\3\2\2\2\u0099\r\3\2\2\2\u009a\u009e\5\20\t\2\u009b\u009d\5\22\n" +
                    "\2\u009c\u009b\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f" +
                    "\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a3\5\30\r\2" +
                    "\u00a2\u00a1\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5" +
                    "\7\37\2\2\u00a5\17\3\2\2\2\u00a6\u00a7\7\30\2\2\u00a7\u00a8\79\2\2\u00a8" +
                    "\u00a9\5\62\32\2\u00a9\u00aa\7:\2\2\u00aa\u00ab\7\36\2\2\u00ab\u00ac\5" +
                    "\4\3\2\u00ac\21\3\2\2\2\u00ad\u00ae\7\31\2\2\u00ae\u00af\7\30\2\2\u00af" +
                    "\u00b0\79\2\2\u00b0\u00b1\5\62\32\2\u00b1\u00b2\7:\2\2\u00b2\u00b3\7\36" +
                    "\2\2\u00b3\u00b4\5\4\3\2\u00b4\23\3\2\2\2\u00b5\u00b6\7\3\2\2\u00b6\u00b7" +
                    "\7B\2\2\u00b7\u00b8\7\4\2\2\u00b8\u00bc\79\2\2\u00b9\u00bb\5\66\34\2\u00ba" +
                    "\u00b9\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2" +
                    "\2\2\u00bd\u00bf\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c0\7:\2\2\u00c0" +
                    "\u00c1\5\4\3\2\u00c1\u00c2\7\37\2\2\u00c2\25\3\2\2\2\u00c3\u00c4\7B\2" +
                    "\2\u00c4\u00c5\7\5\2\2\u00c5\u00c6\79\2\2\u00c6\u00c7\7:\2\2\u00c7\27" +
                    "\3\2\2\2\u00c8\u00c9\7\31\2\2\u00c9\u00ca\7\36\2\2\u00ca\u00cb\5\4\3\2" +
                    "\u00cb\31\3\2\2\2\u00cc\u00cd\7\24\2\2\u00cd\u00ce\7B\2\2\u00ce\u00d0" +
                    "\79\2\2\u00cf\u00d1\5,\27\2\u00d0\u00cf\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1" +
                    "\u00d2\3\2\2\2\u00d2\u00d3\7:\2\2\u00d3\u00d4\5\4\3\2\u00d4\u00d5\7\37" +
                    "\2\2\u00d5\33\3\2\2\2\u00d6\u00d7\7\33\2\2\u00d7\u00d8\7B\2\2\u00d8\u00d9" +
                    "\7<\2\2\u00d9\u00da\5\62\32\2\u00da\u00db\7\35\2\2\u00db\u00dc\5\62\32" +
                    "\2\u00dc\u00dd\7\36\2\2\u00dd\u00de\5\4\3\2\u00de\u00df\7\37\2\2\u00df" +
                    "\35\3\2\2\2\u00e0\u00e1\7\6\2\2\u00e1\u00e2\7\16\2\2\u00e2\u00e7\7B\2" +
                    "\2\u00e3\u00e4\7\7\2\2\u00e4\u00e6\7B\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e9" +
                    "\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\37\3\2\2\2\u00e9" +
                    "\u00e7\3\2\2\2\u00ea\u00eb\7\"\2\2\u00eb\u00ec\5\4\3\2\u00ec\u00ed\7#" +
                    "\2\2\u00ed\u00ee\79\2\2\u00ee\u00ef\7B\2\2\u00ef\u00f0\7:\2\2\u00f0\u00f1" +
                    "\5\4\3\2\u00f1\u00f2\7\37\2\2\u00f2!\3\2\2\2\u00f3\u00f4\7\34\2\2\u00f4" +
                    "\u00f5\79\2\2\u00f5\u00f6\5\62\32\2\u00f6\u00f7\7:\2\2\u00f7\u00f8\7\36" +
                    "\2\2\u00f8\u00f9\5\4\3\2\u00f9\u00fa\7\37\2\2\u00fa#\3\2\2\2\u00fb\u00fc" +
                    "\7\b\2\2\u00fc\u00fd\79\2\2\u00fd\u00fe\5\62\32\2\u00fe\u00ff\7:\2\2\u00ff" +
                    "%\3\2\2\2\u0100\u0101\7\r\2\2\u0101\u0102\79\2\2\u0102\u0103\5\62\32\2" +
                    "\u0103\u0104\7:\2\2\u0104\'\3\2\2\2\u0105\u0106\7\22\2\2\u0106\u0107\7" +
                    "9\2\2\u0107\u0108\5\62\32\2\u0108\u0109\7:\2\2\u0109)\3\2\2\2\u010a\u010b" +
                    "\7\t\2\2\u010b\u010c\5\4\3\2\u010c\u010d\7\37\2\2\u010d+\3\2\2\2\u010e" +
                    "\u0113\7B\2\2\u010f\u0110\7=\2\2\u0110\u0112\7B\2\2\u0111\u010f\3\2\2" +
                    "\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114-" +
                    "\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u0117\7$\2\2\u0117\u0118\7B\2\2\u0118" +
                    "\u0119\5\4\3\2\u0119\u011a\7\n\2\2\u011a/\3\2\2\2\u011b\u0120\5\62\32" +
                    "\2\u011c\u011d\7=\2\2\u011d\u011f\5\62\32\2\u011e\u011c\3\2\2\2\u011f" +
                    "\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\61\3\2\2" +
                    "\2\u0122\u0120\3\2\2\2\u0123\u0124\b\32\1\2\u0124\u0125\7\61\2\2\u0125" +
                    "\u0148\5\62\32\26\u0126\u0127\7-\2\2\u0127\u0148\5\62\32\25\u0128\u0148" +
                    "\7A\2\2\u0129\u0148\7@\2\2\u012a\u0148\7!\2\2\u012b\u012d\5\f\7\2\u012c" +
                    "\u012e\5\66\34\2\u012d\u012c\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u0148\3" +
                    "\2\2\2\u012f\u0131\5\64\33\2\u0130\u0132\5\66\34\2\u0131\u0130\3\2\2\2" +
                    "\u0131\u0132\3\2\2\2\u0132\u0148\3\2\2\2\u0133\u0135\7B\2\2\u0134\u0136" +
                    "\5\66\34\2\u0135\u0134\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0148\3\2\2\2" +
                    "\u0137\u0139\7C\2\2\u0138\u013a\5\66\34\2\u0139\u0138\3\2\2\2\u0139\u013a" +
                    "\3\2\2\2\u013a\u0148\3\2\2\2\u013b\u013c\79\2\2\u013c\u013d\5\62\32\2" +
                    "\u013d\u013f\7:\2\2\u013e\u0140\5\66\34\2\u013f\u013e\3\2\2\2\u013f\u0140" +
                    "\3\2\2\2\u0140\u0148\3\2\2\2\u0141\u0142\7\20\2\2\u0142\u0144\79\2\2\u0143" +
                    "\u0145\7C\2\2\u0144\u0143\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0146\3\2" +
                    "\2\2\u0146\u0148\7:\2\2\u0147\u0123\3\2\2\2\u0147\u0126\3\2\2\2\u0147" +
                    "\u0128\3\2\2\2\u0147\u0129\3\2\2\2\u0147\u012a\3\2\2\2\u0147\u012b\3\2" +
                    "\2\2\u0147\u012f\3\2\2\2\u0147\u0133\3\2\2\2\u0147\u0137\3\2\2\2\u0147" +
                    "\u013b\3\2\2\2\u0147\u0141\3\2\2\2\u0148\u0169\3\2\2\2\u0149\u014a\f\24" +
                    "\2\2\u014a\u014b\7,\2\2\u014b\u0168\5\62\32\24\u014c\u014d\f\23\2\2\u014d" +
                    "\u014e\t\2\2\2\u014e\u0168\5\62\32\24\u014f\u0150\f\22\2\2\u0150\u0151" +
                    "\t\3\2\2\u0151\u0168\5\62\32\23\u0152\u0153\f\21\2\2\u0153\u0154\t\4\2" +
                    "\2\u0154\u0168\5\62\32\22\u0155\u0156\f\20\2\2\u0156\u0157\t\5\2\2\u0157" +
                    "\u0168\5\62\32\21\u0158\u0159\f\17\2\2\u0159\u015a\7\'\2\2\u015a\u0168" +
                    "\5\62\32\20\u015b\u015c\f\16\2\2\u015c\u015d\7&\2\2\u015d\u0168\5\62\32" +
                    "\17\u015e\u015f\f\r\2\2\u015f\u0160\7>\2\2\u0160\u0161\5\62\32\2\u0161" +
                    "\u0162\7?\2\2\u0162\u0163\5\62\32\16\u0163\u0168\3\2\2\2\u0164\u0165\f" +
                    "\f\2\2\u0165\u0166\7 \2\2\u0166\u0168\5\62\32\r\u0167\u0149\3\2\2\2\u0167" +
                    "\u014c\3\2\2\2\u0167\u014f\3\2\2\2\u0167\u0152\3\2\2\2\u0167\u0155\3\2" +
                    "\2\2\u0167\u0158\3\2\2\2\u0167\u015b\3\2\2\2\u0167\u015e\3\2\2\2\u0167" +
                    "\u0164\3\2\2\2\u0168\u016b\3\2\2\2\u0169\u0167\3\2\2\2\u0169\u016a\3\2" +
                    "\2\2\u016a\63\3\2\2\2\u016b\u0169\3\2\2\2\u016c\u016e\7\67\2\2\u016d\u016f" +
                    "\5\60\31\2\u016e\u016d\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0170\3\2\2\2" +
                    "\u0170\u0171\78\2\2\u0171\65\3\2\2\2\u0172\u0173\7\67\2\2\u0173\u0174" +
                    "\5\62\32\2\u0174\u0175\78\2\2\u0175\u0177\3\2\2\2\u0176\u0172\3\2\2\2" +
                    "\u0177\u0178\3\2\2\2\u0178\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179\67" +
                    "\3\2\2\2\35=?Fgls{\u0081\u0098\u009e\u00a2\u00bc\u00d0\u00e7\u0113\u0120" +
                    "\u012d\u0131\u0135\u0139\u013f\u0144\u0147\u0167\u0169\u016e\u0178";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    private static final String[] _LITERAL_NAMES = makeLiteralNames();
    private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

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

    public XXLParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    private static String[] makeRuleNames() {
        return new String[]{
                "parse", "block", "statement", "assignment", "reAssignment", "functionCall",
                "ifStatement", "ifStat", "elseIfStat", "constructorStatement", "defaultCall",
                "elseStat", "functionDecl", "forStatement", "importStatement", "tryCatchStatement",
                "whileStatement", "webServerStatement", "addWebServerTextStatement",
                "waitStatement", "mainFunctionStatement", "idList", "classStatement",
                "exprList", "expression", "list", "indexes"
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
    public ATN getATN() {
        return _ATN;
    }

    public final ParseContext parse() throws RecognitionException {
        ParseContext _localctx = new ParseContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_parse);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(54);
                block();
                setState(55);
                match(EOF);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final BlockContext block() throws RecognitionException {
        BlockContext _localctx = new BlockContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_block);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(61);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (T__0 - 1)) | (1L << (T__3 - 1)) | (1L << (T__5 - 1)) | (1L << (T__6 - 1)) | (1L << (Println - 1)) | (1L << (Var - 1)) | (1L << (AddWSText - 1)) | (1L << (Print - 1)) | (1L << (Assert - 1)) | (1L << (Wait - 1)) | (1L << (Size - 1)) | (1L << (Def - 1)) | (1L << (ToInt - 1)) | (1L << (If - 1)) | (1L << (For - 1)) | (1L << (While - 1)) | (1L << (Try - 1)) | (1L << (Class - 1)) | (1L << (Identifier - 1)))) != 0)) {
                    {
                        setState(59);
                        _errHandler.sync(this);
                        switch (_input.LA(1)) {
                            case T__0:
                            case T__3:
                            case T__5:
                            case T__6:
                            case Println:
                            case Var:
                            case AddWSText:
                            case Print:
                            case Assert:
                            case Wait:
                            case Size:
                            case ToInt:
                            case If:
                            case For:
                            case While:
                            case Try:
                            case Class:
                            case Identifier: {
                                setState(57);
                                statement();
                            }
                            break;
                            case Def: {
                                setState(58);
                                functionDecl();
                            }
                            break;
                            default:
                                throw new NoViableAltException(this);
                        }
                    }
                    setState(63);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(68);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == Return) {
                    {
                        setState(64);
                        match(Return);
                        setState(65);
                        expression(0);
                        setState(66);
                        match(SColon);
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final StatementContext statement() throws RecognitionException {
        StatementContext _localctx = new StatementContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_statement);
        try {
            setState(101);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 3, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(70);
                    assignment();
                    setState(71);
                    match(SColon);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(73);
                    functionCall();
                    setState(74);
                    match(SColon);
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(76);
                    ifStatement();
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(77);
                    forStatement();
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(78);
                    whileStatement();
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(79);
                    importStatement();
                    setState(80);
                    match(SColon);
                }
                break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(82);
                    tryCatchStatement();
                }
                break;
                case 8:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(83);
                    mainFunctionStatement();
                }
                break;
                case 9:
                    enterOuterAlt(_localctx, 9);
                {
                    setState(84);
                    webServerStatement();
                    setState(85);
                    match(SColon);
                }
                break;
                case 10:
                    enterOuterAlt(_localctx, 10);
                {
                    setState(87);
                    addWebServerTextStatement();
                    setState(88);
                    match(SColon);
                }
                break;
                case 11:
                    enterOuterAlt(_localctx, 11);
                {
                    setState(90);
                    reAssignment();
                    setState(91);
                    match(SColon);
                }
                break;
                case 12:
                    enterOuterAlt(_localctx, 12);
                {
                    setState(93);
                    classStatement();
                }
                break;
                case 13:
                    enterOuterAlt(_localctx, 13);
                {
                    setState(94);
                    constructorStatement();
                }
                break;
                case 14:
                    enterOuterAlt(_localctx, 14);
                {
                    setState(95);
                    defaultCall();
                    setState(96);
                    match(SColon);
                }
                break;
                case 15:
                    enterOuterAlt(_localctx, 15);
                {
                    setState(98);
                    waitStatement();
                    setState(99);
                    match(SColon);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final AssignmentContext assignment() throws RecognitionException {
        AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_assignment);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(103);
                match(Var);
                setState(104);
                match(Identifier);
                setState(106);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == OBracket) {
                    {
                        setState(105);
                        indexes();
                    }
                }

                setState(108);
                match(Assign);
                setState(109);
                expression(0);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ReAssignmentContext reAssignment() throws RecognitionException {
        ReAssignmentContext _localctx = new ReAssignmentContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_reAssignment);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(111);
                match(Identifier);
                setState(113);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == OBracket) {
                    {
                        setState(112);
                        indexes();
                    }
                }

                setState(115);
                match(Assign);
                setState(116);
                expression(0);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final FunctionCallContext functionCall() throws RecognitionException {
        FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_functionCall);
        int _la;
        try {
            setState(150);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case Identifier:
                    _localctx = new IdentifierFunctionCallContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(118);
                    match(Identifier);
                    setState(119);
                    match(OParen);
                    setState(121);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & ((1L << (Println - 9)) | (1L << (Print - 9)) | (1L << (Input - 9)) | (1L << (Assert - 9)) | (1L << (Size - 9)) | (1L << (ToInt - 9)) | (1L << (Null - 9)) | (1L << (Excl - 9)) | (1L << (Subtract - 9)) | (1L << (OBracket - 9)) | (1L << (OParen - 9)) | (1L << (Bool - 9)) | (1L << (Number - 9)) | (1L << (Identifier - 9)) | (1L << (String - 9)))) != 0)) {
                        {
                            setState(120);
                            exprList();
                        }
                    }

                    setState(123);
                    match(CParen);
                }
                break;
                case Println:
                    _localctx = new PrintlnFunctionCallContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(124);
                    match(Println);
                    setState(125);
                    match(OParen);
                    setState(127);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & ((1L << (Println - 9)) | (1L << (Print - 9)) | (1L << (Input - 9)) | (1L << (Assert - 9)) | (1L << (Size - 9)) | (1L << (ToInt - 9)) | (1L << (Null - 9)) | (1L << (Excl - 9)) | (1L << (Subtract - 9)) | (1L << (OBracket - 9)) | (1L << (OParen - 9)) | (1L << (Bool - 9)) | (1L << (Number - 9)) | (1L << (Identifier - 9)) | (1L << (String - 9)))) != 0)) {
                        {
                            setState(126);
                            expression(0);
                        }
                    }

                    setState(129);
                    match(CParen);
                }
                break;
                case Print:
                    _localctx = new PrintFunctionCallContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(130);
                    match(Print);
                    setState(131);
                    match(OParen);
                    setState(132);
                    expression(0);
                    setState(133);
                    match(CParen);
                }
                break;
                case Assert:
                    _localctx = new AssertFunctionCallContext(_localctx);
                    enterOuterAlt(_localctx, 4);
                {
                    setState(135);
                    match(Assert);
                    setState(136);
                    match(OParen);
                    setState(137);
                    expression(0);
                    setState(138);
                    match(CParen);
                }
                break;
                case Size:
                    _localctx = new SizeFunctionCallContext(_localctx);
                    enterOuterAlt(_localctx, 5);
                {
                    setState(140);
                    match(Size);
                    setState(141);
                    match(OParen);
                    setState(142);
                    expression(0);
                    setState(143);
                    match(CParen);
                }
                break;
                case ToInt:
                    _localctx = new ToIntFunctionCallContext(_localctx);
                    enterOuterAlt(_localctx, 6);
                {
                    setState(145);
                    match(ToInt);
                    setState(146);
                    match(OParen);
                    setState(147);
                    expression(0);
                    setState(148);
                    match(CParen);
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final IfStatementContext ifStatement() throws RecognitionException {
        IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_ifStatement);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(152);
                ifStat();
                setState(156);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 9, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(153);
                                elseIfStat();
                            }
                        }
                    }
                    setState(158);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 9, _ctx);
                }
                setState(160);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == Else) {
                    {
                        setState(159);
                        elseStat();
                    }
                }

                setState(162);
                match(End);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final IfStatContext ifStat() throws RecognitionException {
        IfStatContext _localctx = new IfStatContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_ifStat);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(164);
                match(If);
                setState(165);
                match(OParen);
                setState(166);
                expression(0);
                setState(167);
                match(CParen);
                setState(168);
                match(Do);
                setState(169);
                block();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ElseIfStatContext elseIfStat() throws RecognitionException {
        ElseIfStatContext _localctx = new ElseIfStatContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_elseIfStat);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(171);
                match(Else);
                setState(172);
                match(If);
                setState(173);
                match(OParen);
                setState(174);
                expression(0);
                setState(175);
                match(CParen);
                setState(176);
                match(Do);
                setState(177);
                block();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ConstructorStatementContext constructorStatement() throws RecognitionException {
        ConstructorStatementContext _localctx = new ConstructorStatementContext(_ctx, getState());
        enterRule(_localctx, 18, RULE_constructorStatement);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(179);
                match(T__0);
                setState(180);
                match(Identifier);
                setState(181);
                match(T__1);
                setState(182);
                match(OParen);
                setState(186);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == OBracket) {
                    {
                        {
                            setState(183);
                            indexes();
                        }
                    }
                    setState(188);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(189);
                match(CParen);
                setState(190);
                block();
                setState(191);
                match(End);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final DefaultCallContext defaultCall() throws RecognitionException {
        DefaultCallContext _localctx = new DefaultCallContext(_ctx, getState());
        enterRule(_localctx, 20, RULE_defaultCall);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(193);
                match(Identifier);
                setState(194);
                match(T__2);
                setState(195);
                match(OParen);
                setState(196);
                match(CParen);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ElseStatContext elseStat() throws RecognitionException {
        ElseStatContext _localctx = new ElseStatContext(_ctx, getState());
        enterRule(_localctx, 22, RULE_elseStat);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(198);
                match(Else);
                setState(199);
                match(Do);
                setState(200);
                block();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final FunctionDeclContext functionDecl() throws RecognitionException {
        FunctionDeclContext _localctx = new FunctionDeclContext(_ctx, getState());
        enterRule(_localctx, 24, RULE_functionDecl);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(202);
                match(Def);
                setState(203);
                match(Identifier);
                setState(204);
                match(OParen);
                setState(206);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == Identifier) {
                    {
                        setState(205);
                        idList();
                    }
                }

                setState(208);
                match(CParen);
                setState(209);
                block();
                setState(210);
                match(End);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ForStatementContext forStatement() throws RecognitionException {
        ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
        enterRule(_localctx, 26, RULE_forStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(212);
                match(For);
                setState(213);
                match(Identifier);
                setState(214);
                match(Assign);
                setState(215);
                expression(0);
                setState(216);
                match(To);
                setState(217);
                expression(0);
                setState(218);
                match(Do);
                setState(219);
                block();
                setState(220);
                match(End);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ImportStatementContext importStatement() throws RecognitionException {
        ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
        enterRule(_localctx, 28, RULE_importStatement);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(222);
                match(T__3);
                setState(223);
                match(Import);
                setState(224);
                match(Identifier);
                setState(229);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__4) {
                    {
                        {
                            setState(225);
                            match(T__4);
                            setState(226);
                            match(Identifier);
                        }
                    }
                    setState(231);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final TryCatchStatementContext tryCatchStatement() throws RecognitionException {
        TryCatchStatementContext _localctx = new TryCatchStatementContext(_ctx, getState());
        enterRule(_localctx, 30, RULE_tryCatchStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(232);
                match(Try);
                setState(233);
                block();
                setState(234);
                match(Catch);
                setState(235);
                match(OParen);
                setState(236);
                match(Identifier);
                setState(237);
                match(CParen);
                setState(238);
                block();
                setState(239);
                match(End);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final WhileStatementContext whileStatement() throws RecognitionException {
        WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
        enterRule(_localctx, 32, RULE_whileStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(241);
                match(While);
                setState(242);
                match(OParen);
                setState(243);
                expression(0);
                setState(244);
                match(CParen);
                setState(245);
                match(Do);
                setState(246);
                block();
                setState(247);
                match(End);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final WebServerStatementContext webServerStatement() throws RecognitionException {
        WebServerStatementContext _localctx = new WebServerStatementContext(_ctx, getState());
        enterRule(_localctx, 34, RULE_webServerStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(249);
                match(T__5);
                setState(250);
                match(OParen);
                setState(251);
                expression(0);
                setState(252);
                match(CParen);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final AddWebServerTextStatementContext addWebServerTextStatement() throws RecognitionException {
        AddWebServerTextStatementContext _localctx = new AddWebServerTextStatementContext(_ctx, getState());
        enterRule(_localctx, 36, RULE_addWebServerTextStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(254);
                match(AddWSText);
                setState(255);
                match(OParen);
                setState(256);
                expression(0);
                setState(257);
                match(CParen);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final WaitStatementContext waitStatement() throws RecognitionException {
        WaitStatementContext _localctx = new WaitStatementContext(_ctx, getState());
        enterRule(_localctx, 38, RULE_waitStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(259);
                match(Wait);
                setState(260);
                match(OParen);
                setState(261);
                expression(0);
                setState(262);
                match(CParen);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final MainFunctionStatementContext mainFunctionStatement() throws RecognitionException {
        MainFunctionStatementContext _localctx = new MainFunctionStatementContext(_ctx, getState());
        enterRule(_localctx, 40, RULE_mainFunctionStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(264);
                match(T__6);
                setState(265);
                block();
                setState(266);
                match(End);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final IdListContext idList() throws RecognitionException {
        IdListContext _localctx = new IdListContext(_ctx, getState());
        enterRule(_localctx, 42, RULE_idList);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(268);
                match(Identifier);
                setState(273);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == Comma) {
                    {
                        {
                            setState(269);
                            match(Comma);
                            setState(270);
                            match(Identifier);
                        }
                    }
                    setState(275);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ClassStatementContext classStatement() throws RecognitionException {
        ClassStatementContext _localctx = new ClassStatementContext(_ctx, getState());
        enterRule(_localctx, 44, RULE_classStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(276);
                match(Class);
                setState(277);
                match(Identifier);
                setState(278);
                block();
                setState(279);
                match(T__7);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ExprListContext exprList() throws RecognitionException {
        ExprListContext _localctx = new ExprListContext(_ctx, getState());
        enterRule(_localctx, 46, RULE_exprList);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(281);
                expression(0);
                setState(286);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == Comma) {
                    {
                        {
                            setState(282);
                            match(Comma);
                            setState(283);
                            expression(0);
                        }
                    }
                    setState(288);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ExpressionContext expression() throws RecognitionException {
        return expression(0);
    }

    private ExpressionContext expression(int _p) throws RecognitionException {
        ParserRuleContext _parentctx = _ctx;
        int _parentState = getState();
        ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
        ExpressionContext _prevctx = _localctx;
        int _startState = 48;
        enterRecursionRule(_localctx, 48, RULE_expression, _p);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(325);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 22, _ctx)) {
                    case 1: {
                        _localctx = new UnaryMinusExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;

                        setState(290);
                        match(Subtract);
                        setState(291);
                        expression(20);
                    }
                    break;
                    case 2: {
                        _localctx = new NotExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(292);
                        match(Excl);
                        setState(293);
                        expression(19);
                    }
                    break;
                    case 3: {
                        _localctx = new NumberExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(294);
                        match(Number);
                    }
                    break;
                    case 4: {
                        _localctx = new BoolExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(295);
                        match(Bool);
                    }
                    break;
                    case 5: {
                        _localctx = new NullExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(296);
                        match(Null);
                    }
                    break;
                    case 6: {
                        _localctx = new FunctionCallExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(297);
                        functionCall();
                        setState(299);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 16, _ctx)) {
                            case 1: {
                                setState(298);
                                indexes();
                            }
                            break;
                        }
                    }
                    break;
                    case 7: {
                        _localctx = new ListExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(301);
                        list();
                        setState(303);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 17, _ctx)) {
                            case 1: {
                                setState(302);
                                indexes();
                            }
                            break;
                        }
                    }
                    break;
                    case 8: {
                        _localctx = new IdentifierExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(305);
                        match(Identifier);
                        setState(307);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 18, _ctx)) {
                            case 1: {
                                setState(306);
                                indexes();
                            }
                            break;
                        }
                    }
                    break;
                    case 9: {
                        _localctx = new StringExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(309);
                        match(String);
                        setState(311);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 19, _ctx)) {
                            case 1: {
                                setState(310);
                                indexes();
                            }
                            break;
                        }
                    }
                    break;
                    case 10: {
                        _localctx = new ExpressionExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(313);
                        match(OParen);
                        setState(314);
                        expression(0);
                        setState(315);
                        match(CParen);
                        setState(317);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 20, _ctx)) {
                            case 1: {
                                setState(316);
                                indexes();
                            }
                            break;
                        }
                    }
                    break;
                    case 11: {
                        _localctx = new InputExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(319);
                        match(Input);
                        setState(320);
                        match(OParen);
                        setState(322);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == String) {
                            {
                                setState(321);
                                match(String);
                            }
                        }

                        setState(324);
                        match(CParen);
                    }
                    break;
                }
                _ctx.stop = _input.LT(-1);
                setState(359);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 24, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(357);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 23, _ctx)) {
                                case 1: {
                                    _localctx = new PowerExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(327);
                                    if (!(precpred(_ctx, 18)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 18)");
                                    setState(328);
                                    match(Pow);
                                    setState(329);
                                    expression(18);
                                }
                                break;
                                case 2: {
                                    _localctx = new MultExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(330);
                                    if (!(precpred(_ctx, 17)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 17)");
                                    setState(331);
                                    ((MultExpressionContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Multiply) | (1L << Divide) | (1L << Modulus))) != 0))) {
                                        ((MultExpressionContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(332);
                                    expression(18);
                                }
                                break;
                                case 3: {
                                    _localctx = new AddExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(333);
                                    if (!(precpred(_ctx, 16)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 16)");
                                    setState(334);
                                    ((AddExpressionContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!(_la == Add || _la == Subtract)) {
                                        ((AddExpressionContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(335);
                                    expression(17);
                                }
                                break;
                                case 4: {
                                    _localctx = new CompExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(336);
                                    if (!(precpred(_ctx, 15)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 15)");
                                    setState(337);
                                    ((CompExpressionContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GTEquals) | (1L << LTEquals) | (1L << GT) | (1L << LT))) != 0))) {
                                        ((CompExpressionContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(338);
                                    expression(16);
                                }
                                break;
                                case 5: {
                                    _localctx = new EqExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(339);
                                    if (!(precpred(_ctx, 14)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 14)");
                                    setState(340);
                                    ((EqExpressionContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!(_la == Equals || _la == NEquals)) {
                                        ((EqExpressionContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(341);
                                    expression(15);
                                }
                                break;
                                case 6: {
                                    _localctx = new AndExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(342);
                                    if (!(precpred(_ctx, 13)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 13)");
                                    setState(343);
                                    match(And);
                                    setState(344);
                                    expression(14);
                                }
                                break;
                                case 7: {
                                    _localctx = new OrExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(345);
                                    if (!(precpred(_ctx, 12)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 12)");
                                    setState(346);
                                    match(Or);
                                    setState(347);
                                    expression(13);
                                }
                                break;
                                case 8: {
                                    _localctx = new TernaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(348);
                                    if (!(precpred(_ctx, 11)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 11)");
                                    setState(349);
                                    match(QMark);
                                    setState(350);
                                    expression(0);
                                    setState(351);
                                    match(Colon);
                                    setState(352);
                                    expression(12);
                                }
                                break;
                                case 9: {
                                    _localctx = new InExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(354);
                                    if (!(precpred(_ctx, 10)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 10)");
                                    setState(355);
                                    match(In);
                                    setState(356);
                                    expression(11);
                                }
                                break;
                            }
                        }
                    }
                    setState(361);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 24, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            unrollRecursionContexts(_parentctx);
        }
        return _localctx;
    }

    public final ListContext list() throws RecognitionException {
        ListContext _localctx = new ListContext(_ctx, getState());
        enterRule(_localctx, 50, RULE_list);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(362);
                match(OBracket);
                setState(364);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & ((1L << (Println - 9)) | (1L << (Print - 9)) | (1L << (Input - 9)) | (1L << (Assert - 9)) | (1L << (Size - 9)) | (1L << (ToInt - 9)) | (1L << (Null - 9)) | (1L << (Excl - 9)) | (1L << (Subtract - 9)) | (1L << (OBracket - 9)) | (1L << (OParen - 9)) | (1L << (Bool - 9)) | (1L << (Number - 9)) | (1L << (Identifier - 9)) | (1L << (String - 9)))) != 0)) {
                    {
                        setState(363);
                        exprList();
                    }
                }

                setState(366);
                match(CBracket);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final IndexesContext indexes() throws RecognitionException {
        IndexesContext _localctx = new IndexesContext(_ctx, getState());
        enterRule(_localctx, 52, RULE_indexes);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(372);
                _errHandler.sync(this);
                _alt = 1;
                do {
                    switch (_alt) {
                        case 1: {
                            {
                                setState(368);
                                match(OBracket);
                                setState(369);
                                expression(0);
                                setState(370);
                                match(CBracket);
                            }
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                    setState(374);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 26, _ctx);
                } while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
        switch (ruleIndex) {
            case 24:
                return expression_sempred((ExpressionContext) _localctx, predIndex);
        }
        return true;
    }

    private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
        switch (predIndex) {
            case 0:
                return precpred(_ctx, 18);
            case 1:
                return precpred(_ctx, 17);
            case 2:
                return precpred(_ctx, 16);
            case 3:
                return precpred(_ctx, 15);
            case 4:
                return precpred(_ctx, 14);
            case 5:
                return precpred(_ctx, 13);
            case 6:
                return precpred(_ctx, 12);
            case 7:
                return precpred(_ctx, 11);
            case 8:
                return precpred(_ctx, 10);
        }
        return true;
    }

    public static class ParseContext extends ParserRuleContext {
        public ParseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public TerminalNode EOF() {
            return getToken(XXLParser.EOF, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_parse;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).enterParse(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).exitParse(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof XXLVisitor) return ((XXLVisitor<? extends T>) visitor).visitParse(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class BlockContext extends ParserRuleContext {
        public BlockContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<StatementContext> statement() {
            return getRuleContexts(StatementContext.class);
        }

        public StatementContext statement(int i) {
            return getRuleContext(StatementContext.class, i);
        }

        public List<FunctionDeclContext> functionDecl() {
            return getRuleContexts(FunctionDeclContext.class);
        }

        public FunctionDeclContext functionDecl(int i) {
            return getRuleContext(FunctionDeclContext.class, i);
        }

        public TerminalNode Return() {
            return getToken(XXLParser.Return, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode SColon() {
            return getToken(XXLParser.SColon, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_block;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).enterBlock(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).exitBlock(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof XXLVisitor) return ((XXLVisitor<? extends T>) visitor).visitBlock(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class StatementContext extends ParserRuleContext {
        public StatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public AssignmentContext assignment() {
            return getRuleContext(AssignmentContext.class, 0);
        }

        public TerminalNode SColon() {
            return getToken(XXLParser.SColon, 0);
        }

        public FunctionCallContext functionCall() {
            return getRuleContext(FunctionCallContext.class, 0);
        }

        public IfStatementContext ifStatement() {
            return getRuleContext(IfStatementContext.class, 0);
        }

        public ForStatementContext forStatement() {
            return getRuleContext(ForStatementContext.class, 0);
        }

        public WhileStatementContext whileStatement() {
            return getRuleContext(WhileStatementContext.class, 0);
        }

        public ImportStatementContext importStatement() {
            return getRuleContext(ImportStatementContext.class, 0);
        }

        public TryCatchStatementContext tryCatchStatement() {
            return getRuleContext(TryCatchStatementContext.class, 0);
        }

        public MainFunctionStatementContext mainFunctionStatement() {
            return getRuleContext(MainFunctionStatementContext.class, 0);
        }

        public WebServerStatementContext webServerStatement() {
            return getRuleContext(WebServerStatementContext.class, 0);
        }

        public AddWebServerTextStatementContext addWebServerTextStatement() {
            return getRuleContext(AddWebServerTextStatementContext.class, 0);
        }

        public ReAssignmentContext reAssignment() {
            return getRuleContext(ReAssignmentContext.class, 0);
        }

        public ClassStatementContext classStatement() {
            return getRuleContext(ClassStatementContext.class, 0);
        }

        public ConstructorStatementContext constructorStatement() {
            return getRuleContext(ConstructorStatementContext.class, 0);
        }

        public DefaultCallContext defaultCall() {
            return getRuleContext(DefaultCallContext.class, 0);
        }

        public WaitStatementContext waitStatement() {
            return getRuleContext(WaitStatementContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_statement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).enterStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).exitStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof XXLVisitor) return ((XXLVisitor<? extends T>) visitor).visitStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class AssignmentContext extends ParserRuleContext {
        public AssignmentContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Var() {
            return getToken(XXLParser.Var, 0);
        }

        public TerminalNode Identifier() {
            return getToken(XXLParser.Identifier, 0);
        }

        public TerminalNode Assign() {
            return getToken(XXLParser.Assign, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public IndexesContext indexes() {
            return getRuleContext(IndexesContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_assignment;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).enterAssignment(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).exitAssignment(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof XXLVisitor) return ((XXLVisitor<? extends T>) visitor).visitAssignment(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ReAssignmentContext extends ParserRuleContext {
        public ReAssignmentContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Identifier() {
            return getToken(XXLParser.Identifier, 0);
        }

        public TerminalNode Assign() {
            return getToken(XXLParser.Assign, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public IndexesContext indexes() {
            return getRuleContext(IndexesContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_reAssignment;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).enterReAssignment(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).exitReAssignment(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof XXLVisitor) return ((XXLVisitor<? extends T>) visitor).visitReAssignment(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class FunctionCallContext extends ParserRuleContext {
        public FunctionCallContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public FunctionCallContext() {
        }

        @Override
        public int getRuleIndex() {
            return RULE_functionCall;
        }

        public void copyFrom(FunctionCallContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class AssertFunctionCallContext extends FunctionCallContext {
        public AssertFunctionCallContext(FunctionCallContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode Assert() {
            return getToken(XXLParser.Assert, 0);
        }

        public TerminalNode OParen() {
            return getToken(XXLParser.OParen, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode CParen() {
            return getToken(XXLParser.CParen, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).enterAssertFunctionCall(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).exitAssertFunctionCall(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof XXLVisitor) return ((XXLVisitor<? extends T>) visitor).visitAssertFunctionCall(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class SizeFunctionCallContext extends FunctionCallContext {
        public SizeFunctionCallContext(FunctionCallContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode Size() {
            return getToken(XXLParser.Size, 0);
        }

        public TerminalNode OParen() {
            return getToken(XXLParser.OParen, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode CParen() {
            return getToken(XXLParser.CParen, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).enterSizeFunctionCall(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).exitSizeFunctionCall(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof XXLVisitor) return ((XXLVisitor<? extends T>) visitor).visitSizeFunctionCall(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class PrintlnFunctionCallContext extends FunctionCallContext {
        public PrintlnFunctionCallContext(FunctionCallContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode Println() {
            return getToken(XXLParser.Println, 0);
        }

        public TerminalNode OParen() {
            return getToken(XXLParser.OParen, 0);
        }

        public TerminalNode CParen() {
            return getToken(XXLParser.CParen, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).enterPrintlnFunctionCall(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).exitPrintlnFunctionCall(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof XXLVisitor)
                return ((XXLVisitor<? extends T>) visitor).visitPrintlnFunctionCall(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ToIntFunctionCallContext extends FunctionCallContext {
        public ToIntFunctionCallContext(FunctionCallContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode ToInt() {
            return getToken(XXLParser.ToInt, 0);
        }

        public TerminalNode OParen() {
            return getToken(XXLParser.OParen, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode CParen() {
            return getToken(XXLParser.CParen, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).enterToIntFunctionCall(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).exitToIntFunctionCall(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof XXLVisitor) return ((XXLVisitor<? extends T>) visitor).visitToIntFunctionCall(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class IdentifierFunctionCallContext extends FunctionCallContext {
        public IdentifierFunctionCallContext(FunctionCallContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode Identifier() {
            return getToken(XXLParser.Identifier, 0);
        }

        public TerminalNode OParen() {
            return getToken(XXLParser.OParen, 0);
        }

        public TerminalNode CParen() {
            return getToken(XXLParser.CParen, 0);
        }

        public ExprListContext exprList() {
            return getRuleContext(ExprListContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).enterIdentifierFunctionCall(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).exitIdentifierFunctionCall(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof XXLVisitor)
                return ((XXLVisitor<? extends T>) visitor).visitIdentifierFunctionCall(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class PrintFunctionCallContext extends FunctionCallContext {
        public PrintFunctionCallContext(FunctionCallContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode Print() {
            return getToken(XXLParser.Print, 0);
        }

        public TerminalNode OParen() {
            return getToken(XXLParser.OParen, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode CParen() {
            return getToken(XXLParser.CParen, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).enterPrintFunctionCall(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).exitPrintFunctionCall(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof XXLVisitor) return ((XXLVisitor<? extends T>) visitor).visitPrintFunctionCall(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class IfStatementContext extends ParserRuleContext {
        public IfStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public IfStatContext ifStat() {
            return getRuleContext(IfStatContext.class, 0);
        }

        public TerminalNode End() {
            return getToken(XXLParser.End, 0);
        }

        public List<ElseIfStatContext> elseIfStat() {
            return getRuleContexts(ElseIfStatContext.class);
        }

        public ElseIfStatContext elseIfStat(int i) {
            return getRuleContext(ElseIfStatContext.class, i);
        }

        public ElseStatContext elseStat() {
            return getRuleContext(ElseStatContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_ifStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).enterIfStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).exitIfStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof XXLVisitor) return ((XXLVisitor<? extends T>) visitor).visitIfStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class IfStatContext extends ParserRuleContext {
        public IfStatContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode If() {
            return getToken(XXLParser.If, 0);
        }

        public TerminalNode OParen() {
            return getToken(XXLParser.OParen, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode CParen() {
            return getToken(XXLParser.CParen, 0);
        }

        public TerminalNode Do() {
            return getToken(XXLParser.Do, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_ifStat;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).enterIfStat(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).exitIfStat(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof XXLVisitor) return ((XXLVisitor<? extends T>) visitor).visitIfStat(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ElseIfStatContext extends ParserRuleContext {
        public ElseIfStatContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Else() {
            return getToken(XXLParser.Else, 0);
        }

        public TerminalNode If() {
            return getToken(XXLParser.If, 0);
        }

        public TerminalNode OParen() {
            return getToken(XXLParser.OParen, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode CParen() {
            return getToken(XXLParser.CParen, 0);
        }

        public TerminalNode Do() {
            return getToken(XXLParser.Do, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_elseIfStat;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).enterElseIfStat(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).exitElseIfStat(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof XXLVisitor) return ((XXLVisitor<? extends T>) visitor).visitElseIfStat(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ConstructorStatementContext extends ParserRuleContext {
        public ConstructorStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Identifier() {
            return getToken(XXLParser.Identifier, 0);
        }

        public TerminalNode OParen() {
            return getToken(XXLParser.OParen, 0);
        }

        public TerminalNode CParen() {
            return getToken(XXLParser.CParen, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public TerminalNode End() {
            return getToken(XXLParser.End, 0);
        }

        public List<IndexesContext> indexes() {
            return getRuleContexts(IndexesContext.class);
        }

        public IndexesContext indexes(int i) {
            return getRuleContext(IndexesContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_constructorStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).enterConstructorStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).exitConstructorStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof XXLVisitor)
                return ((XXLVisitor<? extends T>) visitor).visitConstructorStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class DefaultCallContext extends ParserRuleContext {
        public DefaultCallContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Identifier() {
            return getToken(XXLParser.Identifier, 0);
        }

        public TerminalNode OParen() {
            return getToken(XXLParser.OParen, 0);
        }

        public TerminalNode CParen() {
            return getToken(XXLParser.CParen, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_defaultCall;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).enterDefaultCall(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).exitDefaultCall(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof XXLVisitor) return ((XXLVisitor<? extends T>) visitor).visitDefaultCall(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ElseStatContext extends ParserRuleContext {
        public ElseStatContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Else() {
            return getToken(XXLParser.Else, 0);
        }

        public TerminalNode Do() {
            return getToken(XXLParser.Do, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_elseStat;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).enterElseStat(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).exitElseStat(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof XXLVisitor) return ((XXLVisitor<? extends T>) visitor).visitElseStat(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class FunctionDeclContext extends ParserRuleContext {
        public FunctionDeclContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Def() {
            return getToken(XXLParser.Def, 0);
        }

        public TerminalNode Identifier() {
            return getToken(XXLParser.Identifier, 0);
        }

        public TerminalNode OParen() {
            return getToken(XXLParser.OParen, 0);
        }

        public TerminalNode CParen() {
            return getToken(XXLParser.CParen, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public TerminalNode End() {
            return getToken(XXLParser.End, 0);
        }

        public IdListContext idList() {
            return getRuleContext(IdListContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_functionDecl;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).enterFunctionDecl(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).exitFunctionDecl(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof XXLVisitor) return ((XXLVisitor<? extends T>) visitor).visitFunctionDecl(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ForStatementContext extends ParserRuleContext {
        public ForStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode For() {
            return getToken(XXLParser.For, 0);
        }

        public TerminalNode Identifier() {
            return getToken(XXLParser.Identifier, 0);
        }

        public TerminalNode Assign() {
            return getToken(XXLParser.Assign, 0);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public TerminalNode To() {
            return getToken(XXLParser.To, 0);
        }

        public TerminalNode Do() {
            return getToken(XXLParser.Do, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public TerminalNode End() {
            return getToken(XXLParser.End, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_forStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).enterForStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).exitForStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof XXLVisitor) return ((XXLVisitor<? extends T>) visitor).visitForStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ImportStatementContext extends ParserRuleContext {
        public ImportStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Import() {
            return getToken(XXLParser.Import, 0);
        }

        public List<TerminalNode> Identifier() {
            return getTokens(XXLParser.Identifier);
        }

        public TerminalNode Identifier(int i) {
            return getToken(XXLParser.Identifier, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_importStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).enterImportStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).exitImportStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof XXLVisitor) return ((XXLVisitor<? extends T>) visitor).visitImportStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class TryCatchStatementContext extends ParserRuleContext {
        public TryCatchStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Try() {
            return getToken(XXLParser.Try, 0);
        }

        public List<BlockContext> block() {
            return getRuleContexts(BlockContext.class);
        }

        public BlockContext block(int i) {
            return getRuleContext(BlockContext.class, i);
        }

        public TerminalNode Catch() {
            return getToken(XXLParser.Catch, 0);
        }

        public TerminalNode OParen() {
            return getToken(XXLParser.OParen, 0);
        }

        public TerminalNode Identifier() {
            return getToken(XXLParser.Identifier, 0);
        }

        public TerminalNode CParen() {
            return getToken(XXLParser.CParen, 0);
        }

        public TerminalNode End() {
            return getToken(XXLParser.End, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_tryCatchStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).enterTryCatchStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).exitTryCatchStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof XXLVisitor) return ((XXLVisitor<? extends T>) visitor).visitTryCatchStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class WhileStatementContext extends ParserRuleContext {
        public WhileStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode While() {
            return getToken(XXLParser.While, 0);
        }

        public TerminalNode OParen() {
            return getToken(XXLParser.OParen, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode CParen() {
            return getToken(XXLParser.CParen, 0);
        }

        public TerminalNode Do() {
            return getToken(XXLParser.Do, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public TerminalNode End() {
            return getToken(XXLParser.End, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_whileStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).enterWhileStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).exitWhileStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof XXLVisitor) return ((XXLVisitor<? extends T>) visitor).visitWhileStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class WebServerStatementContext extends ParserRuleContext {
        public WebServerStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode OParen() {
            return getToken(XXLParser.OParen, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode CParen() {
            return getToken(XXLParser.CParen, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_webServerStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).enterWebServerStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).exitWebServerStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof XXLVisitor) return ((XXLVisitor<? extends T>) visitor).visitWebServerStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class AddWebServerTextStatementContext extends ParserRuleContext {
        public AddWebServerTextStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode AddWSText() {
            return getToken(XXLParser.AddWSText, 0);
        }

        public TerminalNode OParen() {
            return getToken(XXLParser.OParen, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode CParen() {
            return getToken(XXLParser.CParen, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_addWebServerTextStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).enterAddWebServerTextStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).exitAddWebServerTextStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof XXLVisitor)
                return ((XXLVisitor<? extends T>) visitor).visitAddWebServerTextStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class WaitStatementContext extends ParserRuleContext {
        public WaitStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Wait() {
            return getToken(XXLParser.Wait, 0);
        }

        public TerminalNode OParen() {
            return getToken(XXLParser.OParen, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode CParen() {
            return getToken(XXLParser.CParen, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_waitStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).enterWaitStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).exitWaitStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof XXLVisitor) return ((XXLVisitor<? extends T>) visitor).visitWaitStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class MainFunctionStatementContext extends ParserRuleContext {
        public MainFunctionStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public TerminalNode End() {
            return getToken(XXLParser.End, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_mainFunctionStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).enterMainFunctionStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).exitMainFunctionStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof XXLVisitor)
                return ((XXLVisitor<? extends T>) visitor).visitMainFunctionStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class IdListContext extends ParserRuleContext {
        public IdListContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<TerminalNode> Identifier() {
            return getTokens(XXLParser.Identifier);
        }

        public TerminalNode Identifier(int i) {
            return getToken(XXLParser.Identifier, i);
        }

        public List<TerminalNode> Comma() {
            return getTokens(XXLParser.Comma);
        }

        public TerminalNode Comma(int i) {
            return getToken(XXLParser.Comma, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_idList;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).enterIdList(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).exitIdList(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof XXLVisitor) return ((XXLVisitor<? extends T>) visitor).visitIdList(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ClassStatementContext extends ParserRuleContext {
        public ClassStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Class() {
            return getToken(XXLParser.Class, 0);
        }

        public TerminalNode Identifier() {
            return getToken(XXLParser.Identifier, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_classStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).enterClassStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).exitClassStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof XXLVisitor) return ((XXLVisitor<? extends T>) visitor).visitClassStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ExprListContext extends ParserRuleContext {
        public ExprListContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public List<TerminalNode> Comma() {
            return getTokens(XXLParser.Comma);
        }

        public TerminalNode Comma(int i) {
            return getToken(XXLParser.Comma, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_exprList;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).enterExprList(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).exitExprList(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof XXLVisitor) return ((XXLVisitor<? extends T>) visitor).visitExprList(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ExpressionContext extends ParserRuleContext {
        public ExpressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public ExpressionContext() {
        }

        @Override
        public int getRuleIndex() {
            return RULE_expression;
        }

        public void copyFrom(ExpressionContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class BoolExpressionContext extends ExpressionContext {
        public BoolExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode Bool() {
            return getToken(XXLParser.Bool, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).enterBoolExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).exitBoolExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof XXLVisitor) return ((XXLVisitor<? extends T>) visitor).visitBoolExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class NumberExpressionContext extends ExpressionContext {
        public NumberExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode Number() {
            return getToken(XXLParser.Number, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).enterNumberExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).exitNumberExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof XXLVisitor) return ((XXLVisitor<? extends T>) visitor).visitNumberExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class IdentifierExpressionContext extends ExpressionContext {
        public IdentifierExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode Identifier() {
            return getToken(XXLParser.Identifier, 0);
        }

        public IndexesContext indexes() {
            return getRuleContext(IndexesContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).enterIdentifierExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).exitIdentifierExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof XXLVisitor)
                return ((XXLVisitor<? extends T>) visitor).visitIdentifierExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class NotExpressionContext extends ExpressionContext {
        public NotExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode Excl() {
            return getToken(XXLParser.Excl, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).enterNotExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).exitNotExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof XXLVisitor) return ((XXLVisitor<? extends T>) visitor).visitNotExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class OrExpressionContext extends ExpressionContext {
        public OrExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public TerminalNode Or() {
            return getToken(XXLParser.Or, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).enterOrExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).exitOrExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof XXLVisitor) return ((XXLVisitor<? extends T>) visitor).visitOrExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class UnaryMinusExpressionContext extends ExpressionContext {
        public UnaryMinusExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode Subtract() {
            return getToken(XXLParser.Subtract, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).enterUnaryMinusExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).exitUnaryMinusExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof XXLVisitor)
                return ((XXLVisitor<? extends T>) visitor).visitUnaryMinusExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class PowerExpressionContext extends ExpressionContext {
        public PowerExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public TerminalNode Pow() {
            return getToken(XXLParser.Pow, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).enterPowerExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).exitPowerExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof XXLVisitor) return ((XXLVisitor<? extends T>) visitor).visitPowerExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class EqExpressionContext extends ExpressionContext {
        public Token op;

        public EqExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public TerminalNode Equals() {
            return getToken(XXLParser.Equals, 0);
        }

        public TerminalNode NEquals() {
            return getToken(XXLParser.NEquals, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).enterEqExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).exitEqExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof XXLVisitor) return ((XXLVisitor<? extends T>) visitor).visitEqExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class AndExpressionContext extends ExpressionContext {
        public AndExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public TerminalNode And() {
            return getToken(XXLParser.And, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).enterAndExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).exitAndExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof XXLVisitor) return ((XXLVisitor<? extends T>) visitor).visitAndExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class InExpressionContext extends ExpressionContext {
        public InExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public TerminalNode In() {
            return getToken(XXLParser.In, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).enterInExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).exitInExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof XXLVisitor) return ((XXLVisitor<? extends T>) visitor).visitInExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class StringExpressionContext extends ExpressionContext {
        public StringExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode String() {
            return getToken(XXLParser.String, 0);
        }

        public IndexesContext indexes() {
            return getRuleContext(IndexesContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).enterStringExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).exitStringExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof XXLVisitor) return ((XXLVisitor<? extends T>) visitor).visitStringExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ExpressionExpressionContext extends ExpressionContext {
        public ExpressionExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode OParen() {
            return getToken(XXLParser.OParen, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode CParen() {
            return getToken(XXLParser.CParen, 0);
        }

        public IndexesContext indexes() {
            return getRuleContext(IndexesContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).enterExpressionExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).exitExpressionExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof XXLVisitor)
                return ((XXLVisitor<? extends T>) visitor).visitExpressionExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class AddExpressionContext extends ExpressionContext {
        public Token op;

        public AddExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public TerminalNode Add() {
            return getToken(XXLParser.Add, 0);
        }

        public TerminalNode Subtract() {
            return getToken(XXLParser.Subtract, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).enterAddExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).exitAddExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof XXLVisitor) return ((XXLVisitor<? extends T>) visitor).visitAddExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class CompExpressionContext extends ExpressionContext {
        public Token op;

        public CompExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public TerminalNode GTEquals() {
            return getToken(XXLParser.GTEquals, 0);
        }

        public TerminalNode LTEquals() {
            return getToken(XXLParser.LTEquals, 0);
        }

        public TerminalNode GT() {
            return getToken(XXLParser.GT, 0);
        }

        public TerminalNode LT() {
            return getToken(XXLParser.LT, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).enterCompExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).exitCompExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof XXLVisitor) return ((XXLVisitor<? extends T>) visitor).visitCompExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class NullExpressionContext extends ExpressionContext {
        public NullExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode Null() {
            return getToken(XXLParser.Null, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).enterNullExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).exitNullExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof XXLVisitor) return ((XXLVisitor<? extends T>) visitor).visitNullExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class FunctionCallExpressionContext extends ExpressionContext {
        public FunctionCallExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        public FunctionCallContext functionCall() {
            return getRuleContext(FunctionCallContext.class, 0);
        }

        public IndexesContext indexes() {
            return getRuleContext(IndexesContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).enterFunctionCallExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).exitFunctionCallExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof XXLVisitor)
                return ((XXLVisitor<? extends T>) visitor).visitFunctionCallExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class MultExpressionContext extends ExpressionContext {
        public Token op;

        public MultExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public TerminalNode Multiply() {
            return getToken(XXLParser.Multiply, 0);
        }

        public TerminalNode Divide() {
            return getToken(XXLParser.Divide, 0);
        }

        public TerminalNode Modulus() {
            return getToken(XXLParser.Modulus, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).enterMultExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).exitMultExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof XXLVisitor) return ((XXLVisitor<? extends T>) visitor).visitMultExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ListExpressionContext extends ExpressionContext {
        public ListExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        public ListContext list() {
            return getRuleContext(ListContext.class, 0);
        }

        public IndexesContext indexes() {
            return getRuleContext(IndexesContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).enterListExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).exitListExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof XXLVisitor) return ((XXLVisitor<? extends T>) visitor).visitListExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class TernaryExpressionContext extends ExpressionContext {
        public TernaryExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public TerminalNode QMark() {
            return getToken(XXLParser.QMark, 0);
        }

        public TerminalNode Colon() {
            return getToken(XXLParser.Colon, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).enterTernaryExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).exitTernaryExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof XXLVisitor) return ((XXLVisitor<? extends T>) visitor).visitTernaryExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class InputExpressionContext extends ExpressionContext {
        public InputExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode Input() {
            return getToken(XXLParser.Input, 0);
        }

        public TerminalNode OParen() {
            return getToken(XXLParser.OParen, 0);
        }

        public TerminalNode CParen() {
            return getToken(XXLParser.CParen, 0);
        }

        public TerminalNode String() {
            return getToken(XXLParser.String, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).enterInputExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).exitInputExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof XXLVisitor) return ((XXLVisitor<? extends T>) visitor).visitInputExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ListContext extends ParserRuleContext {
        public ListContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode OBracket() {
            return getToken(XXLParser.OBracket, 0);
        }

        public TerminalNode CBracket() {
            return getToken(XXLParser.CBracket, 0);
        }

        public ExprListContext exprList() {
            return getRuleContext(ExprListContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_list;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).enterList(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).exitList(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof XXLVisitor) return ((XXLVisitor<? extends T>) visitor).visitList(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class IndexesContext extends ParserRuleContext {
        public IndexesContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<TerminalNode> OBracket() {
            return getTokens(XXLParser.OBracket);
        }

        public TerminalNode OBracket(int i) {
            return getToken(XXLParser.OBracket, i);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public List<TerminalNode> CBracket() {
            return getTokens(XXLParser.CBracket);
        }

        public TerminalNode CBracket(int i) {
            return getToken(XXLParser.CBracket, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_indexes;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).enterIndexes(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).exitIndexes(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof XXLVisitor) return ((XXLVisitor<? extends T>) visitor).visitIndexes(this);
            else return visitor.visitChildren(this);
        }
    }
}