// Generated from /Users/harryharbuck-marlowe/Downloads/Q/src/main/java/core/etc/Q.g4 by ANTLR 4.9.2
package core.interp;

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
public class QParser extends Parser {
    public static final int
            T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, T__7 = 8, T__8 = 9,
            T__9 = 10, T__10 = 11, T__11 = 12, T__12 = 13, T__13 = 14, T__14 = 15, T__15 = 16, Println = 17,
            Render = 18, AddComponent = 19, New = 20, Var = 21, Import = 22, Print = 23, Input = 24,
            Assert = 25, Size = 26, Def = 27, ToInt = 28, Create = 29, If = 30, Else = 31, Return = 32,
            For = 33, While = 34, To = 35, Do = 36, End = 37, In = 38, Null = 39, Try = 40, Catch = 41,
            Class = 42, Or = 43, And = 44, Equals = 45, NEquals = 46, GTEquals = 47, LTEquals = 48,
            Pow = 49, Excl = 50, GT = 51, LT = 52, Add = 53, Subtract = 54, Multiply = 55, Divide = 56,
            Modulus = 57, OBrace = 58, CBrace = 59, OBracket = 60, CBracket = 61, OParen = 62,
            CParen = 63, SColon = 64, Assign = 65, Comma = 66, QMark = 67, Colon = 68, Bool = 69,
            Number = 70, Identifier = 71, String = 72, Comment = 73, JavaTextBlock = 74, Space = 75;
    public static final int
            RULE_parse = 0, RULE_block = 1, RULE_statement = 2, RULE_assignment = 3,
            RULE_reAssignment = 4, RULE_functionCall = 5, RULE_objFunctionCall = 6,
            RULE_header = 7, RULE_objFunctionDecl = 8, RULE_ifStatement = 9, RULE_ifStat = 10,
            RULE_elseIfStat = 11, RULE_constructorStatement = 12, RULE_objCreateStatement = 13,
            RULE_listCreateStatement = 14, RULE_listAddStatement = 15, RULE_listRemoveStatement = 16,
            RULE_osExecStatement = 17, RULE_fileWriteStatement = 18, RULE_verifyFileStatement = 19,
            RULE_defaultCall = 20, RULE_elseStat = 21, RULE_functionDecl = 22, RULE_forStatement = 23,
            RULE_importStatement = 24, RULE_importFromGithubStatement = 25, RULE_tryCatchStatement = 26,
            RULE_whileStatement = 27, RULE_windowRenderStatement = 28, RULE_windowAddCompStatement = 29,
            RULE_addWebServerTextStatement = 30, RULE_mainFunctionStatement = 31,
            RULE_idList = 32, RULE_classStatement = 33, RULE_exprList = 34, RULE_expression = 35,
            RULE_list = 36, RULE_indexes = 37;
    public static final String[] ruleNames = makeRuleNames();
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3M\u0204\4\2\t\2\4" +
                    "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
                    "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
                    "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!" +
                    "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\5\2P\n\2\3\2\3\2\3\2\3" +
                    "\3\3\3\7\3W\n\3\f\3\16\3Z\13\3\3\3\3\3\3\3\3\3\5\3`\n\3\3\4\3\4\3\4\3" +
                    "\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4" +
                    "\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3" +
                    "\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4" +
                    "\3\4\3\4\3\4\5\4\u009d\n\4\3\5\3\5\3\5\5\5\u00a2\n\5\3\5\3\5\3\5\3\6\3" +
                    "\6\5\6\u00a9\n\6\3\6\3\6\3\6\3\7\3\7\3\7\5\7\u00b1\n\7\3\7\3\7\3\7\3\7" +
                    "\5\7\u00b7\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7" +
                    "\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00ce\n\7\3\b\3\b\3\b\3\b\3\b\5\b\u00d5" +
                    "\n\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00e3\n\n\3\n" +
                    "\3\n\3\n\3\n\3\13\3\13\7\13\u00eb\n\13\f\13\16\13\u00ee\13\13\3\13\5\13" +
                    "\u00f1\n\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r" +
                    "\3\r\3\r\3\r\3\16\3\16\3\16\3\16\5\16\u0108\n\16\3\16\3\16\3\16\3\16\3" +
                    "\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0115\n\17\3\17\3\17\3\20\3\20" +
                    "\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22" +
                    "\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\5\23\u0134\n\23" +
                    "\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25" +
                    "\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\5\30" +
                    "\u0151\n\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31" +
                    "\3\31\3\31\3\32\3\32\3\32\3\32\3\32\7\32\u0166\n\32\f\32\16\32\u0169\13" +
                    "\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3" +
                    "\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3" +
                    "\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3\"" +
                    "\3\"\3\"\7\"\u019b\n\"\f\"\16\"\u019e\13\"\3#\3#\3#\3#\3#\3$\3$\3$\7$" +
                    "\u01a8\n$\f$\16$\u01ab\13$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u01b7\n%\3" +
                    "%\3%\5%\u01bb\n%\3%\3%\5%\u01bf\n%\3%\3%\5%\u01c3\n%\3%\3%\3%\3%\5%\u01c9" +
                    "\n%\3%\3%\3%\5%\u01ce\n%\3%\5%\u01d1\n%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%" +
                    "\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\7%\u01f1" +
                    "\n%\f%\16%\u01f4\13%\3&\3&\5&\u01f8\n&\3&\3&\3\'\3\'\3\'\3\'\6\'\u0200" +
                    "\n\'\r\'\16\'\u0201\3\'\2\3H(\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 " +
                    "\"$&(*,.\60\62\64\668:<>@BDFHJL\2\6\3\29;\3\2\678\4\2\61\62\65\66\3\2" +
                    "/\60\2\u0228\2O\3\2\2\2\4X\3\2\2\2\6\u009c\3\2\2\2\b\u009e\3\2\2\2\n\u00a6" +
                    "\3\2\2\2\f\u00cd\3\2\2\2\16\u00cf\3\2\2\2\20\u00d8\3\2\2\2\22\u00dc\3" +
                    "\2\2\2\24\u00e8\3\2\2\2\26\u00f4\3\2\2\2\30\u00fb\3\2\2\2\32\u0103\3\2" +
                    "\2\2\34\u010d\3\2\2\2\36\u0118\3\2\2\2 \u0120\3\2\2\2\"\u0127\3\2\2\2" +
                    "$\u012e\3\2\2\2&\u0137\3\2\2\2(\u013e\3\2\2\2*\u0143\3\2\2\2,\u0148\3" +
                    "\2\2\2.\u014c\3\2\2\2\60\u0156\3\2\2\2\62\u0160\3\2\2\2\64\u016a\3\2\2" +
                    "\2\66\u016e\3\2\2\28\u0177\3\2\2\2:\u017f\3\2\2\2<\u0185\3\2\2\2>\u018c" +
                    "\3\2\2\2@\u0193\3\2\2\2B\u0197\3\2\2\2D\u019f\3\2\2\2F\u01a4\3\2\2\2H" +
                    "\u01d0\3\2\2\2J\u01f5\3\2\2\2L\u01ff\3\2\2\2NP\5\20\t\2ON\3\2\2\2OP\3" +
                    "\2\2\2PQ\3\2\2\2QR\5\4\3\2RS\7\2\2\3S\3\3\2\2\2TW\5\6\4\2UW\5.\30\2VT" +
                    "\3\2\2\2VU\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y_\3\2\2\2ZX\3\2\2\2[" +
                    "\\\7\"\2\2\\]\5H%\2]^\7B\2\2^`\3\2\2\2_[\3\2\2\2_`\3\2\2\2`\5\3\2\2\2" +
                    "ab\5\b\5\2bc\7B\2\2c\u009d\3\2\2\2de\5\f\7\2ef\7B\2\2f\u009d\3\2\2\2g" +
                    "\u009d\5\24\13\2h\u009d\5\60\31\2i\u009d\58\35\2j\u009d\5\66\34\2k\u009d" +
                    "\5@!\2lm\5> \2mn\7B\2\2n\u009d\3\2\2\2op\5\n\6\2pq\7B\2\2q\u009d\3\2\2" +
                    "\2r\u009d\5D#\2s\u009d\5\32\16\2tu\5*\26\2uv\7B\2\2v\u009d\3\2\2\2wx\5" +
                    "<\37\2xy\7B\2\2y\u009d\3\2\2\2z{\5:\36\2{|\7B\2\2|\u009d\3\2\2\2}~\5&" +
                    "\24\2~\177\7B\2\2\177\u009d\3\2\2\2\u0080\u0081\5(\25\2\u0081\u0082\7" +
                    "B\2\2\u0082\u009d\3\2\2\2\u0083\u0084\5\16\b\2\u0084\u0085\7B\2\2\u0085" +
                    "\u009d\3\2\2\2\u0086\u009d\5\22\n\2\u0087\u0088\5\34\17\2\u0088\u0089" +
                    "\7B\2\2\u0089\u009d\3\2\2\2\u008a\u008b\5\36\20\2\u008b\u008c\7B\2\2\u008c" +
                    "\u009d\3\2\2\2\u008d\u008e\5 \21\2\u008e\u008f\7B\2\2\u008f\u009d\3\2" +
                    "\2\2\u0090\u0091\5\"\22\2\u0091\u0092\7B\2\2\u0092\u009d\3\2\2\2\u0093" +
                    "\u0094\5$\23\2\u0094\u0095\7B\2\2\u0095\u009d\3\2\2\2\u0096\u0097\5\64" +
                    "\33\2\u0097\u0098\7B\2\2\u0098\u009d\3\2\2\2\u0099\u009a\5\62\32\2\u009a" +
                    "\u009b\7B\2\2\u009b\u009d\3\2\2\2\u009ca\3\2\2\2\u009cd\3\2\2\2\u009c" +
                    "g\3\2\2\2\u009ch\3\2\2\2\u009ci\3\2\2\2\u009cj\3\2\2\2\u009ck\3\2\2\2" +
                    "\u009cl\3\2\2\2\u009co\3\2\2\2\u009cr\3\2\2\2\u009cs\3\2\2\2\u009ct\3" +
                    "\2\2\2\u009cw\3\2\2\2\u009cz\3\2\2\2\u009c}\3\2\2\2\u009c\u0080\3\2\2" +
                    "\2\u009c\u0083\3\2\2\2\u009c\u0086\3\2\2\2\u009c\u0087\3\2\2\2\u009c\u008a" +
                    "\3\2\2\2\u009c\u008d\3\2\2\2\u009c\u0090\3\2\2\2\u009c\u0093\3\2\2\2\u009c" +
                    "\u0096\3\2\2\2\u009c\u0099\3\2\2\2\u009d\7\3\2\2\2\u009e\u009f\7\27\2" +
                    "\2\u009f\u00a1\7I\2\2\u00a0\u00a2\5L\'\2\u00a1\u00a0\3\2\2\2\u00a1\u00a2" +
                    "\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\7C\2\2\u00a4\u00a5\5H%\2\u00a5" +
                    "\t\3\2\2\2\u00a6\u00a8\7I\2\2\u00a7\u00a9\5L\'\2\u00a8\u00a7\3\2\2\2\u00a8" +
                    "\u00a9\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\7C\2\2\u00ab\u00ac\5H%" +
                    "\2\u00ac\13\3\2\2\2\u00ad\u00ae\7I\2\2\u00ae\u00b0\7@\2\2\u00af\u00b1" +
                    "\5F$\2\u00b0\u00af\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2" +
                    "\u00ce\7A\2\2\u00b3\u00b4\7\23\2\2\u00b4\u00b6\7@\2\2\u00b5\u00b7\5H%" +
                    "\2\u00b6\u00b5\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00ce" +
                    "\7A\2\2\u00b9\u00ba\7\31\2\2\u00ba\u00bb\7@\2\2\u00bb\u00bc\5H%\2\u00bc" +
                    "\u00bd\7A\2\2\u00bd\u00ce\3\2\2\2\u00be\u00bf\7\33\2\2\u00bf\u00c0\7@" +
                    "\2\2\u00c0\u00c1\5H%\2\u00c1\u00c2\7A\2\2\u00c2\u00ce\3\2\2\2\u00c3\u00c4" +
                    "\7\34\2\2\u00c4\u00c5\7@\2\2\u00c5\u00c6\5H%\2\u00c6\u00c7\7A\2\2\u00c7" +
                    "\u00ce\3\2\2\2\u00c8\u00c9\7\36\2\2\u00c9\u00ca\7@\2\2\u00ca\u00cb\5H" +
                    "%\2\u00cb\u00cc\7A\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00ad\3\2\2\2\u00cd\u00b3" +
                    "\3\2\2\2\u00cd\u00b9\3\2\2\2\u00cd\u00be\3\2\2\2\u00cd\u00c3\3\2\2\2\u00cd" +
                    "\u00c8\3\2\2\2\u00ce\r\3\2\2\2\u00cf\u00d0\7I\2\2\u00d0\u00d1\7\3\2\2" +
                    "\u00d1\u00d2\7I\2\2\u00d2\u00d4\7@\2\2\u00d3\u00d5\5B\"\2\u00d4\u00d3" +
                    "\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\7A\2\2\u00d7" +
                    "\17\3\2\2\2\u00d8\u00d9\7\4\2\2\u00d9\u00da\7\5\2\2\u00da\u00db\7I\2\2" +
                    "\u00db\21\3\2\2\2\u00dc\u00dd\7\35\2\2\u00dd\u00de\7I\2\2\u00de\u00df" +
                    "\7F\2\2\u00df\u00e0\7I\2\2\u00e0\u00e2\7@\2\2\u00e1\u00e3\5B\"\2\u00e2" +
                    "\u00e1\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\7A" +
                    "\2\2\u00e5\u00e6\5\4\3\2\u00e6\u00e7\7\'\2\2\u00e7\23\3\2\2\2\u00e8\u00ec" +
                    "\5\26\f\2\u00e9\u00eb\5\30\r\2\u00ea\u00e9\3\2\2\2\u00eb\u00ee\3\2\2\2" +
                    "\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec" +
                    "\3\2\2\2\u00ef\u00f1\5,\27\2\u00f0\u00ef\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1" +
                    "\u00f2\3\2\2\2\u00f2\u00f3\7\'\2\2\u00f3\25\3\2\2\2\u00f4\u00f5\7 \2\2" +
                    "\u00f5\u00f6\7@\2\2\u00f6\u00f7\5H%\2\u00f7\u00f8\7A\2\2\u00f8\u00f9\7" +
                    "&\2\2\u00f9\u00fa\5\4\3\2\u00fa\27\3\2\2\2\u00fb\u00fc\7!\2\2\u00fc\u00fd" +
                    "\7 \2\2\u00fd\u00fe\7@\2\2\u00fe\u00ff\5H%\2\u00ff\u0100\7A\2\2\u0100" +
                    "\u0101\7&\2\2\u0101\u0102\5\4\3\2\u0102\31\3\2\2\2\u0103\u0104\7\6\2\2" +
                    "\u0104\u0105\7I\2\2\u0105\u0107\7@\2\2\u0106\u0108\5F$\2\u0107\u0106\3" +
                    "\2\2\2\u0107\u0108\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a\7A\2\2\u010a" +
                    "\u010b\5\4\3\2\u010b\u010c\7\'\2\2\u010c\33\3\2\2\2\u010d\u010e\7I\2\2" +
                    "\u010e\u010f\7I\2\2\u010f\u0110\7C\2\2\u0110\u0111\7\26\2\2\u0111\u0112" +
                    "\7I\2\2\u0112\u0114\7@\2\2\u0113\u0115\5F$\2\u0114\u0113\3\2\2\2\u0114" +
                    "\u0115\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117\7A\2\2\u0117\35\3\2\2\2" +
                    "\u0118\u0119\7\7\2\2\u0119\u011a\7I\2\2\u011a\u011b\7C\2\2\u011b\u011c" +
                    "\7\26\2\2\u011c\u011d\7\7\2\2\u011d\u011e\7\66\2\2\u011e\u011f\7\65\2" +
                    "\2\u011f\37\3\2\2\2\u0120\u0121\7I\2\2\u0121\u0122\7\3\2\2\u0122\u0123" +
                    "\7\b\2\2\u0123\u0124\7@\2\2\u0124\u0125\5H%\2\u0125\u0126\7A\2\2\u0126" +
                    "!\3\2\2\2\u0127\u0128\7I\2\2\u0128\u0129\7\3\2\2\u0129\u012a\7\t\2\2\u012a" +
                    "\u012b\7@\2\2\u012b\u012c\5H%\2\u012c\u012d\7A\2\2\u012d#\3\2\2\2\u012e" +
                    "\u012f\7\n\2\2\u012f\u0130\7\3\2\2\u0130\u0131\7I\2\2\u0131\u0133\7@\2" +
                    "\2\u0132\u0134\5H%\2\u0133\u0132\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0135" +
                    "\3\2\2\2\u0135\u0136\7A\2\2\u0136%\3\2\2\2\u0137\u0138\7I\2\2\u0138\u0139" +
                    "\7\3\2\2\u0139\u013a\7\13\2\2\u013a\u013b\7@\2\2\u013b\u013c\5H%\2\u013c" +
                    "\u013d\7A\2\2\u013d\'\3\2\2\2\u013e\u013f\7\f\2\2\u013f\u0140\7@\2\2\u0140" +
                    "\u0141\5H%\2\u0141\u0142\7A\2\2\u0142)\3\2\2\2\u0143\u0144\7I\2\2\u0144" +
                    "\u0145\7\r\2\2\u0145\u0146\7@\2\2\u0146\u0147\7A\2\2\u0147+\3\2\2\2\u0148" +
                    "\u0149\7!\2\2\u0149\u014a\7&\2\2\u014a\u014b\5\4\3\2\u014b-\3\2\2\2\u014c" +
                    "\u014d\7\35\2\2\u014d\u014e\7I\2\2\u014e\u0150\7@\2\2\u014f\u0151\5B\"" +
                    "\2\u0150\u014f\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0153" +
                    "\7A\2\2\u0153\u0154\5\4\3\2\u0154\u0155\7\'\2\2\u0155/\3\2\2\2\u0156\u0157" +
                    "\7#\2\2\u0157\u0158\7I\2\2\u0158\u0159\7C\2\2\u0159\u015a\5H%\2\u015a" +
                    "\u015b\7%\2\2\u015b\u015c\5H%\2\u015c\u015d\7&\2\2\u015d\u015e\5\4\3\2" +
                    "\u015e\u015f\7\'\2\2\u015f\61\3\2\2\2\u0160\u0161\7\16\2\2\u0161\u0162" +
                    "\7\30\2\2\u0162\u0167\7I\2\2\u0163\u0164\7\3\2\2\u0164\u0166\7I\2\2\u0165" +
                    "\u0163\3\2\2\2\u0166\u0169\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0168\3\2" +
                    "\2\2\u0168\63\3\2\2\2\u0169\u0167\3\2\2\2\u016a\u016b\7\16\2\2\u016b\u016c" +
                    "\7\17\2\2\u016c\u016d\5H%\2\u016d\65\3\2\2\2\u016e\u016f\7*\2\2\u016f" +
                    "\u0170\5\4\3\2\u0170\u0171\7+\2\2\u0171\u0172\7@\2\2\u0172\u0173\7I\2" +
                    "\2\u0173\u0174\7A\2\2\u0174\u0175\5\4\3\2\u0175\u0176\7\'\2\2\u0176\67" +
                    "\3\2\2\2\u0177\u0178\7$\2\2\u0178\u0179\7@\2\2\u0179\u017a\5H%\2\u017a" +
                    "\u017b\7A\2\2\u017b\u017c\7&\2\2\u017c\u017d\5\4\3\2\u017d\u017e\7\'\2" +
                    "\2\u017e9\3\2\2\2\u017f\u0180\7I\2\2\u0180\u0181\7\3\2\2\u0181\u0182\7" +
                    "\24\2\2\u0182\u0183\7@\2\2\u0183\u0184\7A\2\2\u0184;\3\2\2\2\u0185\u0186" +
                    "\7I\2\2\u0186\u0187\7\3\2\2\u0187\u0188\7\25\2\2\u0188\u0189\7@\2\2\u0189" +
                    "\u018a\5H%\2\u018a\u018b\7A\2\2\u018b=\3\2\2\2\u018c\u018d\7I\2\2\u018d" +
                    "\u018e\7\3\2\2\u018e\u018f\7\20\2\2\u018f\u0190\7@\2\2\u0190\u0191\5H" +
                    "%\2\u0191\u0192\7A\2\2\u0192?\3\2\2\2\u0193\u0194\7\21\2\2\u0194\u0195" +
                    "\5\4\3\2\u0195\u0196\7\'\2\2\u0196A\3\2\2\2\u0197\u019c\7I\2\2\u0198\u0199" +
                    "\7D\2\2\u0199\u019b\7I\2\2\u019a\u0198\3\2\2\2\u019b\u019e\3\2\2\2\u019c" +
                    "\u019a\3\2\2\2\u019c\u019d\3\2\2\2\u019dC\3\2\2\2\u019e\u019c\3\2\2\2" +
                    "\u019f\u01a0\7,\2\2\u01a0\u01a1\7I\2\2\u01a1\u01a2\5\4\3\2\u01a2\u01a3" +
                    "\7\22\2\2\u01a3E\3\2\2\2\u01a4\u01a9\5H%\2\u01a5\u01a6\7D\2\2\u01a6\u01a8" +
                    "\5H%\2\u01a7\u01a5\3\2\2\2\u01a8\u01ab\3\2\2\2\u01a9\u01a7\3\2\2\2\u01a9" +
                    "\u01aa\3\2\2\2\u01aaG\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ac\u01ad\b%\1\2\u01ad" +
                    "\u01ae\78\2\2\u01ae\u01d1\5H%\26\u01af\u01b0\7\64\2\2\u01b0\u01d1\5H%" +
                    "\25\u01b1\u01d1\7H\2\2\u01b2\u01d1\7G\2\2\u01b3\u01d1\7)\2\2\u01b4\u01b6" +
                    "\5\f\7\2\u01b5\u01b7\5L\'\2\u01b6\u01b5\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7" +
                    "\u01d1\3\2\2\2\u01b8\u01ba\5J&\2\u01b9\u01bb\5L\'\2\u01ba\u01b9\3\2\2" +
                    "\2\u01ba\u01bb\3\2\2\2\u01bb\u01d1\3\2\2\2\u01bc\u01be\7I\2\2\u01bd\u01bf" +
                    "\5L\'\2\u01be\u01bd\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01d1\3\2\2\2\u01c0" +
                    "\u01c2\7J\2\2\u01c1\u01c3\5L\'\2\u01c2\u01c1\3\2\2\2\u01c2\u01c3\3\2\2" +
                    "\2\u01c3\u01d1\3\2\2\2\u01c4\u01c5\7@\2\2\u01c5\u01c6\5H%\2\u01c6\u01c8" +
                    "\7A\2\2\u01c7\u01c9\5L\'\2\u01c8\u01c7\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9" +
                    "\u01d1\3\2\2\2\u01ca\u01cb\7\32\2\2\u01cb\u01cd\7@\2\2\u01cc\u01ce\7J" +
                    "\2\2\u01cd\u01cc\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf" +
                    "\u01d1\7A\2\2\u01d0\u01ac\3\2\2\2\u01d0\u01af\3\2\2\2\u01d0\u01b1\3\2" +
                    "\2\2\u01d0\u01b2\3\2\2\2\u01d0\u01b3\3\2\2\2\u01d0\u01b4\3\2\2\2\u01d0" +
                    "\u01b8\3\2\2\2\u01d0\u01bc\3\2\2\2\u01d0\u01c0\3\2\2\2\u01d0\u01c4\3\2" +
                    "\2\2\u01d0\u01ca\3\2\2\2\u01d1\u01f2\3\2\2\2\u01d2\u01d3\f\24\2\2\u01d3" +
                    "\u01d4\7\63\2\2\u01d4\u01f1\5H%\24\u01d5\u01d6\f\23\2\2\u01d6\u01d7\t" +
                    "\2\2\2\u01d7\u01f1\5H%\24\u01d8\u01d9\f\22\2\2\u01d9\u01da\t\3\2\2\u01da" +
                    "\u01f1\5H%\23\u01db\u01dc\f\21\2\2\u01dc\u01dd\t\4\2\2\u01dd\u01f1\5H" +
                    "%\22\u01de\u01df\f\20\2\2\u01df\u01e0\t\5\2\2\u01e0\u01f1\5H%\21\u01e1" +
                    "\u01e2\f\17\2\2\u01e2\u01e3\7.\2\2\u01e3\u01f1\5H%\20\u01e4\u01e5\f\16" +
                    "\2\2\u01e5\u01e6\7-\2\2\u01e6\u01f1\5H%\17\u01e7\u01e8\f\r\2\2\u01e8\u01e9" +
                    "\7E\2\2\u01e9\u01ea\5H%\2\u01ea\u01eb\7F\2\2\u01eb\u01ec\5H%\16\u01ec" +
                    "\u01f1\3\2\2\2\u01ed\u01ee\f\f\2\2\u01ee\u01ef\7(\2\2\u01ef\u01f1\5H%" +
                    "\r\u01f0\u01d2\3\2\2\2\u01f0\u01d5\3\2\2\2\u01f0\u01d8\3\2\2\2\u01f0\u01db" +
                    "\3\2\2\2\u01f0\u01de\3\2\2\2\u01f0\u01e1\3\2\2\2\u01f0\u01e4\3\2\2\2\u01f0" +
                    "\u01e7\3\2\2\2\u01f0\u01ed\3\2\2\2\u01f1\u01f4\3\2\2\2\u01f2\u01f0\3\2" +
                    "\2\2\u01f2\u01f3\3\2\2\2\u01f3I\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f5\u01f7" +
                    "\7>\2\2\u01f6\u01f8\5F$\2\u01f7\u01f6\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8" +
                    "\u01f9\3\2\2\2\u01f9\u01fa\7?\2\2\u01faK\3\2\2\2\u01fb\u01fc\7>\2\2\u01fc" +
                    "\u01fd\5H%\2\u01fd\u01fe\7?\2\2\u01fe\u0200\3\2\2\2\u01ff\u01fb\3\2\2" +
                    "\2\u0200\u0201\3\2\2\2\u0201\u01ff\3\2\2\2\u0201\u0202\3\2\2\2\u0202M" +
                    "\3\2\2\2\"OVX_\u009c\u00a1\u00a8\u00b0\u00b6\u00cd\u00d4\u00e2\u00ec\u00f0" +
                    "\u0107\u0114\u0133\u0150\u0167\u019c\u01a9\u01b6\u01ba\u01be\u01c2\u01c8" +
                    "\u01cd\u01d0\u01f0\u01f2\u01f7\u0201";
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

    public QParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    private static String[] makeRuleNames() {
        return new String[]{
                "parse", "block", "statement", "assignment", "reAssignment", "functionCall",
                "objFunctionCall", "header", "objFunctionDecl", "ifStatement", "ifStat",
                "elseIfStat", "constructorStatement", "objCreateStatement", "listCreateStatement",
                "listAddStatement", "listRemoveStatement", "osExecStatement", "fileWriteStatement",
                "verifyFileStatement", "defaultCall", "elseStat", "functionDecl", "forStatement",
                "importStatement", "importFromGithubStatement", "tryCatchStatement",
                "whileStatement", "windowRenderStatement", "windowAddCompStatement",
                "addWebServerTextStatement", "mainFunctionStatement", "idList", "classStatement",
                "exprList", "expression", "list", "indexes"
        };
    }

    private static String[] makeLiteralNames() {
        return new String[]{
                null, "'.'", "'@'", "'header'", "'const'", "'List'", "'add'", "'remove'",
                "'sys'", "'write'", "'verify'", "'.default'", "'#'", "'github'", "'changeText'",
                "'func main()'", "'endc'", "'std:ln'", "'render'", "'addComp'", "'new'",
                "'var'", "'import'", "'std:out'", "'std:in'", "'assert'", "'size'", "'func'",
                "'toInt'", "'create'", "'if'", "'else'", "'return'", "'for'", "'while'",
                "'to'", "'do'", "'endf'", "'in'", "'null'", "'try'", "'catch'", "'class'",
                "'||'", "'&&'", "'=='", "'!='", "'>='", "'<='", "'^'", "'!'", "'>'",
                "'<'", "'+'", "'-'", "'*'", "'/'", "'%'", "'{'", "'}'", "'['", "']'",
                "'('", "')'", "';'", "'='", "','", "'?'", "':'"
        };
    }

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, null, null, null, null, null, null, null, null, null, null, null,
                null, null, null, null, null, "Println", "Render", "AddComponent", "New",
                "Var", "Import", "Print", "Input", "Assert", "Size", "Def", "ToInt",
                "Create", "If", "Else", "Return", "For", "While", "To", "Do", "End",
                "In", "Null", "Try", "Catch", "Class", "Or", "And", "Equals", "NEquals",
                "GTEquals", "LTEquals", "Pow", "Excl", "GT", "LT", "Add", "Subtract",
                "Multiply", "Divide", "Modulus", "OBrace", "CBrace", "OBracket", "CBracket",
                "OParen", "CParen", "SColon", "Assign", "Comma", "QMark", "Colon", "Bool",
                "Number", "Identifier", "String", "Comment", "JavaTextBlock", "Space"
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
        return "Q.g4";
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
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(77);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == T__1) {
                    {
                        setState(76);
                        header();
                    }
                }

                setState(79);
                block();
                setState(80);
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
                setState(86);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__7) | (1L << T__9) | (1L << T__11) | (1L << T__14) | (1L << Println) | (1L << Var) | (1L << Print) | (1L << Assert) | (1L << Size) | (1L << Def) | (1L << ToInt) | (1L << If) | (1L << For) | (1L << While) | (1L << Try) | (1L << Class))) != 0) || _la == Identifier) {
                    {
                        setState(84);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 1, _ctx)) {
                            case 1: {
                                setState(82);
                                statement();
                            }
                            break;
                            case 2: {
                                setState(83);
                                functionDecl();
                            }
                            break;
                        }
                    }
                    setState(88);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(93);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == Return) {
                    {
                        setState(89);
                        match(Return);
                        setState(90);
                        expression(0);
                        setState(91);
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
            setState(154);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 4, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(95);
                    assignment();
                    setState(96);
                    match(SColon);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(98);
                    functionCall();
                    setState(99);
                    match(SColon);
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(101);
                    ifStatement();
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(102);
                    forStatement();
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(103);
                    whileStatement();
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(104);
                    tryCatchStatement();
                }
                break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(105);
                    mainFunctionStatement();
                }
                break;
                case 8:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(106);
                    addWebServerTextStatement();
                    setState(107);
                    match(SColon);
                }
                break;
                case 9:
                    enterOuterAlt(_localctx, 9);
                {
                    setState(109);
                    reAssignment();
                    setState(110);
                    match(SColon);
                }
                break;
                case 10:
                    enterOuterAlt(_localctx, 10);
                {
                    setState(112);
                    classStatement();
                }
                break;
                case 11:
                    enterOuterAlt(_localctx, 11);
                {
                    setState(113);
                    constructorStatement();
                }
                break;
                case 12:
                    enterOuterAlt(_localctx, 12);
                {
                    setState(114);
                    defaultCall();
                    setState(115);
                    match(SColon);
                }
                break;
                case 13:
                    enterOuterAlt(_localctx, 13);
                {
                    setState(117);
                    windowAddCompStatement();
                    setState(118);
                    match(SColon);
                }
                break;
                case 14:
                    enterOuterAlt(_localctx, 14);
                {
                    setState(120);
                    windowRenderStatement();
                    setState(121);
                    match(SColon);
                }
                break;
                case 15:
                    enterOuterAlt(_localctx, 15);
                {
                    setState(123);
                    fileWriteStatement();
                    setState(124);
                    match(SColon);
                }
                break;
                case 16:
                    enterOuterAlt(_localctx, 16);
                {
                    setState(126);
                    verifyFileStatement();
                    setState(127);
                    match(SColon);
                }
                break;
                case 17:
                    enterOuterAlt(_localctx, 17);
                {
                    setState(129);
                    objFunctionCall();
                    setState(130);
                    match(SColon);
                }
                break;
                case 18:
                    enterOuterAlt(_localctx, 18);
                {
                    setState(132);
                    objFunctionDecl();
                }
                break;
                case 19:
                    enterOuterAlt(_localctx, 19);
                {
                    setState(133);
                    objCreateStatement();
                    setState(134);
                    match(SColon);
                }
                break;
                case 20:
                    enterOuterAlt(_localctx, 20);
                {
                    setState(136);
                    listCreateStatement();
                    setState(137);
                    match(SColon);
                }
                break;
                case 21:
                    enterOuterAlt(_localctx, 21);
                {
                    setState(139);
                    listAddStatement();
                    setState(140);
                    match(SColon);
                }
                break;
                case 22:
                    enterOuterAlt(_localctx, 22);
                {
                    setState(142);
                    listRemoveStatement();
                    setState(143);
                    match(SColon);
                }
                break;
                case 23:
                    enterOuterAlt(_localctx, 23);
                {
                    setState(145);
                    osExecStatement();
                    setState(146);
                    match(SColon);
                }
                break;
                case 24:
                    enterOuterAlt(_localctx, 24);
                {
                    setState(148);
                    importFromGithubStatement();
                    setState(149);
                    match(SColon);
                }
                break;
                case 25:
                    enterOuterAlt(_localctx, 25);
                {
                    setState(151);
                    importStatement();
                    setState(152);
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
                setState(156);
                match(Var);
                setState(157);
                match(Identifier);
                setState(159);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == OBracket) {
                    {
                        setState(158);
                        indexes();
                    }
                }

                setState(161);
                match(Assign);
                setState(162);
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
                setState(164);
                match(Identifier);
                setState(166);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == OBracket) {
                    {
                        setState(165);
                        indexes();
                    }
                }

                setState(168);
                match(Assign);
                setState(169);
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
            setState(203);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case Identifier:
                    _localctx = new IdentifierFunctionCallContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(171);
                    match(Identifier);
                    setState(172);
                    match(OParen);
                    setState(174);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (Println - 17)) | (1L << (Print - 17)) | (1L << (Input - 17)) | (1L << (Assert - 17)) | (1L << (Size - 17)) | (1L << (ToInt - 17)) | (1L << (Null - 17)) | (1L << (Excl - 17)) | (1L << (Subtract - 17)) | (1L << (OBracket - 17)) | (1L << (OParen - 17)) | (1L << (Bool - 17)) | (1L << (Number - 17)) | (1L << (Identifier - 17)) | (1L << (String - 17)))) != 0)) {
                        {
                            setState(173);
                            exprList();
                        }
                    }

                    setState(176);
                    match(CParen);
                }
                break;
                case Println:
                    _localctx = new PrintlnFunctionCallContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(177);
                    match(Println);
                    setState(178);
                    match(OParen);
                    setState(180);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (Println - 17)) | (1L << (Print - 17)) | (1L << (Input - 17)) | (1L << (Assert - 17)) | (1L << (Size - 17)) | (1L << (ToInt - 17)) | (1L << (Null - 17)) | (1L << (Excl - 17)) | (1L << (Subtract - 17)) | (1L << (OBracket - 17)) | (1L << (OParen - 17)) | (1L << (Bool - 17)) | (1L << (Number - 17)) | (1L << (Identifier - 17)) | (1L << (String - 17)))) != 0)) {
                        {
                            setState(179);
                            expression(0);
                        }
                    }

                    setState(182);
                    match(CParen);
                }
                break;
                case Print:
                    _localctx = new PrintFunctionCallContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(183);
                    match(Print);
                    setState(184);
                    match(OParen);
                    setState(185);
                    expression(0);
                    setState(186);
                    match(CParen);
                }
                break;
                case Assert:
                    _localctx = new AssertFunctionCallContext(_localctx);
                    enterOuterAlt(_localctx, 4);
                {
                    setState(188);
                    match(Assert);
                    setState(189);
                    match(OParen);
                    setState(190);
                    expression(0);
                    setState(191);
                    match(CParen);
                }
                break;
                case Size:
                    _localctx = new SizeFunctionCallContext(_localctx);
                    enterOuterAlt(_localctx, 5);
                {
                    setState(193);
                    match(Size);
                    setState(194);
                    match(OParen);
                    setState(195);
                    expression(0);
                    setState(196);
                    match(CParen);
                }
                break;
                case ToInt:
                    _localctx = new ToIntFunctionCallContext(_localctx);
                    enterOuterAlt(_localctx, 6);
                {
                    setState(198);
                    match(ToInt);
                    setState(199);
                    match(OParen);
                    setState(200);
                    expression(0);
                    setState(201);
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

    public final ObjFunctionCallContext objFunctionCall() throws RecognitionException {
        ObjFunctionCallContext _localctx = new ObjFunctionCallContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_objFunctionCall);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(205);
                match(Identifier);
                setState(206);
                match(T__0);
                setState(207);
                match(Identifier);
                setState(208);
                match(OParen);
                setState(210);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == Identifier) {
                    {
                        setState(209);
                        idList();
                    }
                }

                setState(212);
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

    public final HeaderContext header() throws RecognitionException {
        HeaderContext _localctx = new HeaderContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_header);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(214);
                match(T__1);
                setState(215);
                match(T__2);
                setState(216);
                match(Identifier);
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

    public final ObjFunctionDeclContext objFunctionDecl() throws RecognitionException {
        ObjFunctionDeclContext _localctx = new ObjFunctionDeclContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_objFunctionDecl);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(218);
                match(Def);
                setState(219);
                match(Identifier);
                setState(220);
                match(Colon);
                setState(221);
                match(Identifier);
                setState(222);
                match(OParen);
                setState(224);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == Identifier) {
                    {
                        setState(223);
                        idList();
                    }
                }

                setState(226);
                match(CParen);
                setState(227);
                block();
                setState(228);
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

    public final IfStatementContext ifStatement() throws RecognitionException {
        IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
        enterRule(_localctx, 18, RULE_ifStatement);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(230);
                ifStat();
                setState(234);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 12, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(231);
                                elseIfStat();
                            }
                        }
                    }
                    setState(236);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 12, _ctx);
                }
                setState(238);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == Else) {
                    {
                        setState(237);
                        elseStat();
                    }
                }

                setState(240);
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
        enterRule(_localctx, 20, RULE_ifStat);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(242);
                match(If);
                setState(243);
                match(OParen);
                setState(244);
                expression(0);
                setState(245);
                match(CParen);
                setState(246);
                match(Do);
                setState(247);
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
        enterRule(_localctx, 22, RULE_elseIfStat);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(249);
                match(Else);
                setState(250);
                match(If);
                setState(251);
                match(OParen);
                setState(252);
                expression(0);
                setState(253);
                match(CParen);
                setState(254);
                match(Do);
                setState(255);
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
        enterRule(_localctx, 24, RULE_constructorStatement);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(257);
                match(T__3);
                setState(258);
                match(Identifier);
                setState(259);
                match(OParen);
                setState(261);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (Println - 17)) | (1L << (Print - 17)) | (1L << (Input - 17)) | (1L << (Assert - 17)) | (1L << (Size - 17)) | (1L << (ToInt - 17)) | (1L << (Null - 17)) | (1L << (Excl - 17)) | (1L << (Subtract - 17)) | (1L << (OBracket - 17)) | (1L << (OParen - 17)) | (1L << (Bool - 17)) | (1L << (Number - 17)) | (1L << (Identifier - 17)) | (1L << (String - 17)))) != 0)) {
                    {
                        setState(260);
                        exprList();
                    }
                }

                setState(263);
                match(CParen);
                setState(264);
                block();
                setState(265);
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

    public final ObjCreateStatementContext objCreateStatement() throws RecognitionException {
        ObjCreateStatementContext _localctx = new ObjCreateStatementContext(_ctx, getState());
        enterRule(_localctx, 26, RULE_objCreateStatement);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(267);
                match(Identifier);
                setState(268);
                match(Identifier);
                setState(269);
                match(Assign);
                setState(270);
                match(New);
                setState(271);
                match(Identifier);
                setState(272);
                match(OParen);
                setState(274);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (Println - 17)) | (1L << (Print - 17)) | (1L << (Input - 17)) | (1L << (Assert - 17)) | (1L << (Size - 17)) | (1L << (ToInt - 17)) | (1L << (Null - 17)) | (1L << (Excl - 17)) | (1L << (Subtract - 17)) | (1L << (OBracket - 17)) | (1L << (OParen - 17)) | (1L << (Bool - 17)) | (1L << (Number - 17)) | (1L << (Identifier - 17)) | (1L << (String - 17)))) != 0)) {
                    {
                        setState(273);
                        exprList();
                    }
                }

                setState(276);
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

    public final ListCreateStatementContext listCreateStatement() throws RecognitionException {
        ListCreateStatementContext _localctx = new ListCreateStatementContext(_ctx, getState());
        enterRule(_localctx, 28, RULE_listCreateStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(278);
                match(T__4);
                setState(279);
                match(Identifier);
                setState(280);
                match(Assign);
                setState(281);
                match(New);
                setState(282);
                match(T__4);
                setState(283);
                match(LT);
                setState(284);
                match(GT);
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

    public final ListAddStatementContext listAddStatement() throws RecognitionException {
        ListAddStatementContext _localctx = new ListAddStatementContext(_ctx, getState());
        enterRule(_localctx, 30, RULE_listAddStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(286);
                match(Identifier);
                setState(287);
                match(T__0);
                setState(288);
                match(T__5);
                setState(289);
                match(OParen);
                setState(290);
                expression(0);
                setState(291);
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

    public final ListRemoveStatementContext listRemoveStatement() throws RecognitionException {
        ListRemoveStatementContext _localctx = new ListRemoveStatementContext(_ctx, getState());
        enterRule(_localctx, 32, RULE_listRemoveStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(293);
                match(Identifier);
                setState(294);
                match(T__0);
                setState(295);
                match(T__6);
                setState(296);
                match(OParen);
                setState(297);
                expression(0);
                setState(298);
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

    public final OsExecStatementContext osExecStatement() throws RecognitionException {
        OsExecStatementContext _localctx = new OsExecStatementContext(_ctx, getState());
        enterRule(_localctx, 34, RULE_osExecStatement);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(300);
                match(T__7);
                setState(301);
                match(T__0);
                setState(302);
                match(Identifier);
                setState(303);
                match(OParen);
                setState(305);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (Println - 17)) | (1L << (Print - 17)) | (1L << (Input - 17)) | (1L << (Assert - 17)) | (1L << (Size - 17)) | (1L << (ToInt - 17)) | (1L << (Null - 17)) | (1L << (Excl - 17)) | (1L << (Subtract - 17)) | (1L << (OBracket - 17)) | (1L << (OParen - 17)) | (1L << (Bool - 17)) | (1L << (Number - 17)) | (1L << (Identifier - 17)) | (1L << (String - 17)))) != 0)) {
                    {
                        setState(304);
                        expression(0);
                    }
                }

                setState(307);
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

    public final FileWriteStatementContext fileWriteStatement() throws RecognitionException {
        FileWriteStatementContext _localctx = new FileWriteStatementContext(_ctx, getState());
        enterRule(_localctx, 36, RULE_fileWriteStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(309);
                match(Identifier);
                setState(310);
                match(T__0);
                setState(311);
                match(T__8);
                setState(312);
                match(OParen);
                setState(313);
                expression(0);
                setState(314);
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

    public final VerifyFileStatementContext verifyFileStatement() throws RecognitionException {
        VerifyFileStatementContext _localctx = new VerifyFileStatementContext(_ctx, getState());
        enterRule(_localctx, 38, RULE_verifyFileStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(316);
                match(T__9);
                setState(317);
                match(OParen);
                setState(318);
                expression(0);
                setState(319);
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

    public final DefaultCallContext defaultCall() throws RecognitionException {
        DefaultCallContext _localctx = new DefaultCallContext(_ctx, getState());
        enterRule(_localctx, 40, RULE_defaultCall);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(321);
                match(Identifier);
                setState(322);
                match(T__10);
                setState(323);
                match(OParen);
                setState(324);
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
        enterRule(_localctx, 42, RULE_elseStat);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(326);
                match(Else);
                setState(327);
                match(Do);
                setState(328);
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
        enterRule(_localctx, 44, RULE_functionDecl);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(330);
                match(Def);
                setState(331);
                match(Identifier);
                setState(332);
                match(OParen);
                setState(334);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == Identifier) {
                    {
                        setState(333);
                        idList();
                    }
                }

                setState(336);
                match(CParen);
                setState(337);
                block();
                setState(338);
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
        enterRule(_localctx, 46, RULE_forStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(340);
                match(For);
                setState(341);
                match(Identifier);
                setState(342);
                match(Assign);
                setState(343);
                expression(0);
                setState(344);
                match(To);
                setState(345);
                expression(0);
                setState(346);
                match(Do);
                setState(347);
                block();
                setState(348);
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
        enterRule(_localctx, 48, RULE_importStatement);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(350);
                match(T__11);
                setState(351);
                match(Import);
                setState(352);
                match(Identifier);
                setState(357);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__0) {
                    {
                        {
                            setState(353);
                            match(T__0);
                            setState(354);
                            match(Identifier);
                        }
                    }
                    setState(359);
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

    public final ImportFromGithubStatementContext importFromGithubStatement() throws RecognitionException {
        ImportFromGithubStatementContext _localctx = new ImportFromGithubStatementContext(_ctx, getState());
        enterRule(_localctx, 50, RULE_importFromGithubStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(360);
                match(T__11);
                setState(361);
                match(T__12);
                setState(362);
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

    public final TryCatchStatementContext tryCatchStatement() throws RecognitionException {
        TryCatchStatementContext _localctx = new TryCatchStatementContext(_ctx, getState());
        enterRule(_localctx, 52, RULE_tryCatchStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(364);
                match(Try);
                setState(365);
                block();
                setState(366);
                match(Catch);
                setState(367);
                match(OParen);
                setState(368);
                match(Identifier);
                setState(369);
                match(CParen);
                setState(370);
                block();
                setState(371);
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
        enterRule(_localctx, 54, RULE_whileStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(373);
                match(While);
                setState(374);
                match(OParen);
                setState(375);
                expression(0);
                setState(376);
                match(CParen);
                setState(377);
                match(Do);
                setState(378);
                block();
                setState(379);
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

    public final WindowRenderStatementContext windowRenderStatement() throws RecognitionException {
        WindowRenderStatementContext _localctx = new WindowRenderStatementContext(_ctx, getState());
        enterRule(_localctx, 56, RULE_windowRenderStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(381);
                match(Identifier);
                setState(382);
                match(T__0);
                setState(383);
                match(Render);
                setState(384);
                match(OParen);
                setState(385);
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

    public final WindowAddCompStatementContext windowAddCompStatement() throws RecognitionException {
        WindowAddCompStatementContext _localctx = new WindowAddCompStatementContext(_ctx, getState());
        enterRule(_localctx, 58, RULE_windowAddCompStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(387);
                match(Identifier);
                setState(388);
                match(T__0);
                setState(389);
                match(AddComponent);
                setState(390);
                match(OParen);
                setState(391);
                expression(0);
                setState(392);
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
        enterRule(_localctx, 60, RULE_addWebServerTextStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(394);
                match(Identifier);
                setState(395);
                match(T__0);
                setState(396);
                match(T__13);
                setState(397);
                match(OParen);
                setState(398);
                expression(0);
                setState(399);
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
        enterRule(_localctx, 62, RULE_mainFunctionStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(401);
                match(T__14);
                setState(402);
                block();
                setState(403);
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
        enterRule(_localctx, 64, RULE_idList);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(405);
                match(Identifier);
                setState(410);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == Comma) {
                    {
                        {
                            setState(406);
                            match(Comma);
                            setState(407);
                            match(Identifier);
                        }
                    }
                    setState(412);
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
        enterRule(_localctx, 66, RULE_classStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(413);
                match(Class);
                setState(414);
                match(Identifier);
                setState(415);
                block();
                setState(416);
                match(T__15);
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
        enterRule(_localctx, 68, RULE_exprList);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(418);
                expression(0);
                setState(423);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == Comma) {
                    {
                        {
                            setState(419);
                            match(Comma);
                            setState(420);
                            expression(0);
                        }
                    }
                    setState(425);
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
        int _startState = 70;
        enterRecursionRule(_localctx, 70, RULE_expression, _p);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(462);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 27, _ctx)) {
                    case 1: {
                        _localctx = new UnaryMinusExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;

                        setState(427);
                        match(Subtract);
                        setState(428);
                        expression(20);
                    }
                    break;
                    case 2: {
                        _localctx = new NotExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(429);
                        match(Excl);
                        setState(430);
                        expression(19);
                    }
                    break;
                    case 3: {
                        _localctx = new NumberExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(431);
                        match(Number);
                    }
                    break;
                    case 4: {
                        _localctx = new BoolExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(432);
                        match(Bool);
                    }
                    break;
                    case 5: {
                        _localctx = new NullExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(433);
                        match(Null);
                    }
                    break;
                    case 6: {
                        _localctx = new FunctionCallExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(434);
                        functionCall();
                        setState(436);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 21, _ctx)) {
                            case 1: {
                                setState(435);
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
                        setState(438);
                        list();
                        setState(440);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 22, _ctx)) {
                            case 1: {
                                setState(439);
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
                        setState(442);
                        match(Identifier);
                        setState(444);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 23, _ctx)) {
                            case 1: {
                                setState(443);
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
                        setState(446);
                        match(String);
                        setState(448);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 24, _ctx)) {
                            case 1: {
                                setState(447);
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
                        setState(450);
                        match(OParen);
                        setState(451);
                        expression(0);
                        setState(452);
                        match(CParen);
                        setState(454);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 25, _ctx)) {
                            case 1: {
                                setState(453);
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
                        setState(456);
                        match(Input);
                        setState(457);
                        match(OParen);
                        setState(459);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == String) {
                            {
                                setState(458);
                                match(String);
                            }
                        }

                        setState(461);
                        match(CParen);
                    }
                    break;
                }
                _ctx.stop = _input.LT(-1);
                setState(496);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 29, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(494);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 28, _ctx)) {
                                case 1: {
                                    _localctx = new PowerExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(464);
                                    if (!(precpred(_ctx, 18)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 18)");
                                    setState(465);
                                    match(Pow);
                                    setState(466);
                                    expression(18);
                                }
                                break;
                                case 2: {
                                    _localctx = new MultExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(467);
                                    if (!(precpred(_ctx, 17)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 17)");
                                    setState(468);
                                    ((MultExpressionContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Multiply) | (1L << Divide) | (1L << Modulus))) != 0))) {
                                        ((MultExpressionContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(469);
                                    expression(18);
                                }
                                break;
                                case 3: {
                                    _localctx = new AddExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(470);
                                    if (!(precpred(_ctx, 16)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 16)");
                                    setState(471);
                                    ((AddExpressionContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!(_la == Add || _la == Subtract)) {
                                        ((AddExpressionContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(472);
                                    expression(17);
                                }
                                break;
                                case 4: {
                                    _localctx = new CompExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(473);
                                    if (!(precpred(_ctx, 15)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 15)");
                                    setState(474);
                                    ((CompExpressionContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GTEquals) | (1L << LTEquals) | (1L << GT) | (1L << LT))) != 0))) {
                                        ((CompExpressionContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(475);
                                    expression(16);
                                }
                                break;
                                case 5: {
                                    _localctx = new EqExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(476);
                                    if (!(precpred(_ctx, 14)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 14)");
                                    setState(477);
                                    ((EqExpressionContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!(_la == Equals || _la == NEquals)) {
                                        ((EqExpressionContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(478);
                                    expression(15);
                                }
                                break;
                                case 6: {
                                    _localctx = new AndExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(479);
                                    if (!(precpred(_ctx, 13)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 13)");
                                    setState(480);
                                    match(And);
                                    setState(481);
                                    expression(14);
                                }
                                break;
                                case 7: {
                                    _localctx = new OrExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(482);
                                    if (!(precpred(_ctx, 12)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 12)");
                                    setState(483);
                                    match(Or);
                                    setState(484);
                                    expression(13);
                                }
                                break;
                                case 8: {
                                    _localctx = new TernaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(485);
                                    if (!(precpred(_ctx, 11)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 11)");
                                    setState(486);
                                    match(QMark);
                                    setState(487);
                                    expression(0);
                                    setState(488);
                                    match(Colon);
                                    setState(489);
                                    expression(12);
                                }
                                break;
                                case 9: {
                                    _localctx = new InExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(491);
                                    if (!(precpred(_ctx, 10)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 10)");
                                    setState(492);
                                    match(In);
                                    setState(493);
                                    expression(11);
                                }
                                break;
                            }
                        }
                    }
                    setState(498);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 29, _ctx);
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
        enterRule(_localctx, 72, RULE_list);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(499);
                match(OBracket);
                setState(501);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (Println - 17)) | (1L << (Print - 17)) | (1L << (Input - 17)) | (1L << (Assert - 17)) | (1L << (Size - 17)) | (1L << (ToInt - 17)) | (1L << (Null - 17)) | (1L << (Excl - 17)) | (1L << (Subtract - 17)) | (1L << (OBracket - 17)) | (1L << (OParen - 17)) | (1L << (Bool - 17)) | (1L << (Number - 17)) | (1L << (Identifier - 17)) | (1L << (String - 17)))) != 0)) {
                    {
                        setState(500);
                        exprList();
                    }
                }

                setState(503);
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
        enterRule(_localctx, 74, RULE_indexes);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(509);
                _errHandler.sync(this);
                _alt = 1;
                do {
                    switch (_alt) {
                        case 1: {
                            {
                                setState(505);
                                match(OBracket);
                                setState(506);
                                expression(0);
                                setState(507);
                                match(CBracket);
                            }
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                    setState(511);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 31, _ctx);
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
            case 35:
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
            return getToken(QParser.EOF, 0);
        }

        public HeaderContext header() {
            return getRuleContext(HeaderContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_parse;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterParse(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitParse(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitParse(this);
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
            return getToken(QParser.Return, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode SColon() {
            return getToken(QParser.SColon, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_block;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterBlock(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitBlock(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitBlock(this);
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
            return getToken(QParser.SColon, 0);
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

        public TryCatchStatementContext tryCatchStatement() {
            return getRuleContext(TryCatchStatementContext.class, 0);
        }

        public MainFunctionStatementContext mainFunctionStatement() {
            return getRuleContext(MainFunctionStatementContext.class, 0);
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

        public WindowAddCompStatementContext windowAddCompStatement() {
            return getRuleContext(WindowAddCompStatementContext.class, 0);
        }

        public WindowRenderStatementContext windowRenderStatement() {
            return getRuleContext(WindowRenderStatementContext.class, 0);
        }

        public FileWriteStatementContext fileWriteStatement() {
            return getRuleContext(FileWriteStatementContext.class, 0);
        }

        public VerifyFileStatementContext verifyFileStatement() {
            return getRuleContext(VerifyFileStatementContext.class, 0);
        }

        public ObjFunctionCallContext objFunctionCall() {
            return getRuleContext(ObjFunctionCallContext.class, 0);
        }

        public ObjFunctionDeclContext objFunctionDecl() {
            return getRuleContext(ObjFunctionDeclContext.class, 0);
        }

        public ObjCreateStatementContext objCreateStatement() {
            return getRuleContext(ObjCreateStatementContext.class, 0);
        }

        public ListCreateStatementContext listCreateStatement() {
            return getRuleContext(ListCreateStatementContext.class, 0);
        }

        public ListAddStatementContext listAddStatement() {
            return getRuleContext(ListAddStatementContext.class, 0);
        }

        public ListRemoveStatementContext listRemoveStatement() {
            return getRuleContext(ListRemoveStatementContext.class, 0);
        }

        public OsExecStatementContext osExecStatement() {
            return getRuleContext(OsExecStatementContext.class, 0);
        }

        public ImportFromGithubStatementContext importFromGithubStatement() {
            return getRuleContext(ImportFromGithubStatementContext.class, 0);
        }

        public ImportStatementContext importStatement() {
            return getRuleContext(ImportStatementContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_statement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class AssignmentContext extends ParserRuleContext {
        public AssignmentContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Var() {
            return getToken(QParser.Var, 0);
        }

        public TerminalNode Identifier() {
            return getToken(QParser.Identifier, 0);
        }

        public TerminalNode Assign() {
            return getToken(QParser.Assign, 0);
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
            if (listener instanceof QListener) ((QListener) listener).enterAssignment(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitAssignment(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitAssignment(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ReAssignmentContext extends ParserRuleContext {
        public ReAssignmentContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Identifier() {
            return getToken(QParser.Identifier, 0);
        }

        public TerminalNode Assign() {
            return getToken(QParser.Assign, 0);
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
            if (listener instanceof QListener) ((QListener) listener).enterReAssignment(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitReAssignment(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitReAssignment(this);
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
            return getToken(QParser.Assert, 0);
        }

        public TerminalNode OParen() {
            return getToken(QParser.OParen, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode CParen() {
            return getToken(QParser.CParen, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterAssertFunctionCall(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitAssertFunctionCall(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitAssertFunctionCall(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class SizeFunctionCallContext extends FunctionCallContext {
        public SizeFunctionCallContext(FunctionCallContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode Size() {
            return getToken(QParser.Size, 0);
        }

        public TerminalNode OParen() {
            return getToken(QParser.OParen, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode CParen() {
            return getToken(QParser.CParen, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterSizeFunctionCall(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitSizeFunctionCall(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitSizeFunctionCall(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class PrintlnFunctionCallContext extends FunctionCallContext {
        public PrintlnFunctionCallContext(FunctionCallContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode Println() {
            return getToken(QParser.Println, 0);
        }

        public TerminalNode OParen() {
            return getToken(QParser.OParen, 0);
        }

        public TerminalNode CParen() {
            return getToken(QParser.CParen, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterPrintlnFunctionCall(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitPrintlnFunctionCall(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitPrintlnFunctionCall(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ToIntFunctionCallContext extends FunctionCallContext {
        public ToIntFunctionCallContext(FunctionCallContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode ToInt() {
            return getToken(QParser.ToInt, 0);
        }

        public TerminalNode OParen() {
            return getToken(QParser.OParen, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode CParen() {
            return getToken(QParser.CParen, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterToIntFunctionCall(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitToIntFunctionCall(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitToIntFunctionCall(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class IdentifierFunctionCallContext extends FunctionCallContext {
        public IdentifierFunctionCallContext(FunctionCallContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode Identifier() {
            return getToken(QParser.Identifier, 0);
        }

        public TerminalNode OParen() {
            return getToken(QParser.OParen, 0);
        }

        public TerminalNode CParen() {
            return getToken(QParser.CParen, 0);
        }

        public ExprListContext exprList() {
            return getRuleContext(ExprListContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterIdentifierFunctionCall(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitIdentifierFunctionCall(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitIdentifierFunctionCall(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class PrintFunctionCallContext extends FunctionCallContext {
        public PrintFunctionCallContext(FunctionCallContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode Print() {
            return getToken(QParser.Print, 0);
        }

        public TerminalNode OParen() {
            return getToken(QParser.OParen, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode CParen() {
            return getToken(QParser.CParen, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterPrintFunctionCall(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitPrintFunctionCall(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitPrintFunctionCall(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ObjFunctionCallContext extends ParserRuleContext {
        public ObjFunctionCallContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<TerminalNode> Identifier() {
            return getTokens(QParser.Identifier);
        }

        public TerminalNode Identifier(int i) {
            return getToken(QParser.Identifier, i);
        }

        public TerminalNode OParen() {
            return getToken(QParser.OParen, 0);
        }

        public TerminalNode CParen() {
            return getToken(QParser.CParen, 0);
        }

        public IdListContext idList() {
            return getRuleContext(IdListContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_objFunctionCall;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterObjFunctionCall(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitObjFunctionCall(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitObjFunctionCall(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class HeaderContext extends ParserRuleContext {
        public HeaderContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Identifier() {
            return getToken(QParser.Identifier, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_header;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterHeader(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitHeader(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitHeader(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ObjFunctionDeclContext extends ParserRuleContext {
        public ObjFunctionDeclContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Def() {
            return getToken(QParser.Def, 0);
        }

        public List<TerminalNode> Identifier() {
            return getTokens(QParser.Identifier);
        }

        public TerminalNode Identifier(int i) {
            return getToken(QParser.Identifier, i);
        }

        public TerminalNode Colon() {
            return getToken(QParser.Colon, 0);
        }

        public TerminalNode OParen() {
            return getToken(QParser.OParen, 0);
        }

        public TerminalNode CParen() {
            return getToken(QParser.CParen, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public TerminalNode End() {
            return getToken(QParser.End, 0);
        }

        public IdListContext idList() {
            return getRuleContext(IdListContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_objFunctionDecl;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterObjFunctionDecl(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitObjFunctionDecl(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitObjFunctionDecl(this);
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
            return getToken(QParser.End, 0);
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
            if (listener instanceof QListener) ((QListener) listener).enterIfStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitIfStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitIfStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class IfStatContext extends ParserRuleContext {
        public IfStatContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode If() {
            return getToken(QParser.If, 0);
        }

        public TerminalNode OParen() {
            return getToken(QParser.OParen, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode CParen() {
            return getToken(QParser.CParen, 0);
        }

        public TerminalNode Do() {
            return getToken(QParser.Do, 0);
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
            if (listener instanceof QListener) ((QListener) listener).enterIfStat(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitIfStat(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitIfStat(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ElseIfStatContext extends ParserRuleContext {
        public ElseIfStatContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Else() {
            return getToken(QParser.Else, 0);
        }

        public TerminalNode If() {
            return getToken(QParser.If, 0);
        }

        public TerminalNode OParen() {
            return getToken(QParser.OParen, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode CParen() {
            return getToken(QParser.CParen, 0);
        }

        public TerminalNode Do() {
            return getToken(QParser.Do, 0);
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
            if (listener instanceof QListener) ((QListener) listener).enterElseIfStat(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitElseIfStat(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitElseIfStat(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ConstructorStatementContext extends ParserRuleContext {
        public ConstructorStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Identifier() {
            return getToken(QParser.Identifier, 0);
        }

        public TerminalNode OParen() {
            return getToken(QParser.OParen, 0);
        }

        public TerminalNode CParen() {
            return getToken(QParser.CParen, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public TerminalNode End() {
            return getToken(QParser.End, 0);
        }

        public ExprListContext exprList() {
            return getRuleContext(ExprListContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_constructorStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterConstructorStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitConstructorStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitConstructorStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ObjCreateStatementContext extends ParserRuleContext {
        public ObjCreateStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<TerminalNode> Identifier() {
            return getTokens(QParser.Identifier);
        }

        public TerminalNode Identifier(int i) {
            return getToken(QParser.Identifier, i);
        }

        public TerminalNode Assign() {
            return getToken(QParser.Assign, 0);
        }

        public TerminalNode New() {
            return getToken(QParser.New, 0);
        }

        public TerminalNode OParen() {
            return getToken(QParser.OParen, 0);
        }

        public TerminalNode CParen() {
            return getToken(QParser.CParen, 0);
        }

        public ExprListContext exprList() {
            return getRuleContext(ExprListContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_objCreateStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterObjCreateStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitObjCreateStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitObjCreateStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ListCreateStatementContext extends ParserRuleContext {
        public ListCreateStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Identifier() {
            return getToken(QParser.Identifier, 0);
        }

        public TerminalNode Assign() {
            return getToken(QParser.Assign, 0);
        }

        public TerminalNode New() {
            return getToken(QParser.New, 0);
        }

        public TerminalNode LT() {
            return getToken(QParser.LT, 0);
        }

        public TerminalNode GT() {
            return getToken(QParser.GT, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_listCreateStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterListCreateStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitListCreateStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitListCreateStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ListAddStatementContext extends ParserRuleContext {
        public ListAddStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Identifier() {
            return getToken(QParser.Identifier, 0);
        }

        public TerminalNode OParen() {
            return getToken(QParser.OParen, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode CParen() {
            return getToken(QParser.CParen, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_listAddStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterListAddStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitListAddStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitListAddStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ListRemoveStatementContext extends ParserRuleContext {
        public ListRemoveStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Identifier() {
            return getToken(QParser.Identifier, 0);
        }

        public TerminalNode OParen() {
            return getToken(QParser.OParen, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode CParen() {
            return getToken(QParser.CParen, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_listRemoveStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterListRemoveStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitListRemoveStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitListRemoveStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class OsExecStatementContext extends ParserRuleContext {
        public OsExecStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Identifier() {
            return getToken(QParser.Identifier, 0);
        }

        public TerminalNode OParen() {
            return getToken(QParser.OParen, 0);
        }

        public TerminalNode CParen() {
            return getToken(QParser.CParen, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_osExecStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterOsExecStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitOsExecStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitOsExecStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class FileWriteStatementContext extends ParserRuleContext {
        public FileWriteStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Identifier() {
            return getToken(QParser.Identifier, 0);
        }

        public TerminalNode OParen() {
            return getToken(QParser.OParen, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode CParen() {
            return getToken(QParser.CParen, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_fileWriteStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterFileWriteStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitFileWriteStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitFileWriteStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class VerifyFileStatementContext extends ParserRuleContext {
        public VerifyFileStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode OParen() {
            return getToken(QParser.OParen, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode CParen() {
            return getToken(QParser.CParen, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_verifyFileStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterVerifyFileStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitVerifyFileStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitVerifyFileStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class DefaultCallContext extends ParserRuleContext {
        public DefaultCallContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Identifier() {
            return getToken(QParser.Identifier, 0);
        }

        public TerminalNode OParen() {
            return getToken(QParser.OParen, 0);
        }

        public TerminalNode CParen() {
            return getToken(QParser.CParen, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_defaultCall;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterDefaultCall(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitDefaultCall(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitDefaultCall(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ElseStatContext extends ParserRuleContext {
        public ElseStatContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Else() {
            return getToken(QParser.Else, 0);
        }

        public TerminalNode Do() {
            return getToken(QParser.Do, 0);
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
            if (listener instanceof QListener) ((QListener) listener).enterElseStat(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitElseStat(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitElseStat(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class FunctionDeclContext extends ParserRuleContext {
        public FunctionDeclContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Def() {
            return getToken(QParser.Def, 0);
        }

        public TerminalNode Identifier() {
            return getToken(QParser.Identifier, 0);
        }

        public TerminalNode OParen() {
            return getToken(QParser.OParen, 0);
        }

        public TerminalNode CParen() {
            return getToken(QParser.CParen, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public TerminalNode End() {
            return getToken(QParser.End, 0);
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
            if (listener instanceof QListener) ((QListener) listener).enterFunctionDecl(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitFunctionDecl(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitFunctionDecl(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ForStatementContext extends ParserRuleContext {
        public ForStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode For() {
            return getToken(QParser.For, 0);
        }

        public TerminalNode Identifier() {
            return getToken(QParser.Identifier, 0);
        }

        public TerminalNode Assign() {
            return getToken(QParser.Assign, 0);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public TerminalNode To() {
            return getToken(QParser.To, 0);
        }

        public TerminalNode Do() {
            return getToken(QParser.Do, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public TerminalNode End() {
            return getToken(QParser.End, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_forStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterForStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitForStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitForStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ImportStatementContext extends ParserRuleContext {
        public ImportStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Import() {
            return getToken(QParser.Import, 0);
        }

        public List<TerminalNode> Identifier() {
            return getTokens(QParser.Identifier);
        }

        public TerminalNode Identifier(int i) {
            return getToken(QParser.Identifier, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_importStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterImportStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitImportStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitImportStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ImportFromGithubStatementContext extends ParserRuleContext {
        public ImportFromGithubStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_importFromGithubStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterImportFromGithubStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitImportFromGithubStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor)
                return ((QVisitor<? extends T>) visitor).visitImportFromGithubStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class TryCatchStatementContext extends ParserRuleContext {
        public TryCatchStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Try() {
            return getToken(QParser.Try, 0);
        }

        public List<BlockContext> block() {
            return getRuleContexts(BlockContext.class);
        }

        public BlockContext block(int i) {
            return getRuleContext(BlockContext.class, i);
        }

        public TerminalNode Catch() {
            return getToken(QParser.Catch, 0);
        }

        public TerminalNode OParen() {
            return getToken(QParser.OParen, 0);
        }

        public TerminalNode Identifier() {
            return getToken(QParser.Identifier, 0);
        }

        public TerminalNode CParen() {
            return getToken(QParser.CParen, 0);
        }

        public TerminalNode End() {
            return getToken(QParser.End, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_tryCatchStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterTryCatchStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitTryCatchStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitTryCatchStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class WhileStatementContext extends ParserRuleContext {
        public WhileStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode While() {
            return getToken(QParser.While, 0);
        }

        public TerminalNode OParen() {
            return getToken(QParser.OParen, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode CParen() {
            return getToken(QParser.CParen, 0);
        }

        public TerminalNode Do() {
            return getToken(QParser.Do, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public TerminalNode End() {
            return getToken(QParser.End, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_whileStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterWhileStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitWhileStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitWhileStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class WindowRenderStatementContext extends ParserRuleContext {
        public WindowRenderStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Identifier() {
            return getToken(QParser.Identifier, 0);
        }

        public TerminalNode Render() {
            return getToken(QParser.Render, 0);
        }

        public TerminalNode OParen() {
            return getToken(QParser.OParen, 0);
        }

        public TerminalNode CParen() {
            return getToken(QParser.CParen, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_windowRenderStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterWindowRenderStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitWindowRenderStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitWindowRenderStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class WindowAddCompStatementContext extends ParserRuleContext {
        public WindowAddCompStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Identifier() {
            return getToken(QParser.Identifier, 0);
        }

        public TerminalNode AddComponent() {
            return getToken(QParser.AddComponent, 0);
        }

        public TerminalNode OParen() {
            return getToken(QParser.OParen, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode CParen() {
            return getToken(QParser.CParen, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_windowAddCompStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterWindowAddCompStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitWindowAddCompStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitWindowAddCompStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class AddWebServerTextStatementContext extends ParserRuleContext {
        public AddWebServerTextStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Identifier() {
            return getToken(QParser.Identifier, 0);
        }

        public TerminalNode OParen() {
            return getToken(QParser.OParen, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode CParen() {
            return getToken(QParser.CParen, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_addWebServerTextStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterAddWebServerTextStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitAddWebServerTextStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor)
                return ((QVisitor<? extends T>) visitor).visitAddWebServerTextStatement(this);
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
            return getToken(QParser.End, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_mainFunctionStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterMainFunctionStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitMainFunctionStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitMainFunctionStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class IdListContext extends ParserRuleContext {
        public IdListContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<TerminalNode> Identifier() {
            return getTokens(QParser.Identifier);
        }

        public TerminalNode Identifier(int i) {
            return getToken(QParser.Identifier, i);
        }

        public List<TerminalNode> Comma() {
            return getTokens(QParser.Comma);
        }

        public TerminalNode Comma(int i) {
            return getToken(QParser.Comma, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_idList;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterIdList(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitIdList(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitIdList(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ClassStatementContext extends ParserRuleContext {
        public ClassStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Class() {
            return getToken(QParser.Class, 0);
        }

        public TerminalNode Identifier() {
            return getToken(QParser.Identifier, 0);
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
            if (listener instanceof QListener) ((QListener) listener).enterClassStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitClassStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitClassStatement(this);
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
            return getTokens(QParser.Comma);
        }

        public TerminalNode Comma(int i) {
            return getToken(QParser.Comma, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_exprList;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterExprList(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitExprList(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitExprList(this);
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
            return getToken(QParser.Bool, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterBoolExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitBoolExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitBoolExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class NumberExpressionContext extends ExpressionContext {
        public NumberExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode Number() {
            return getToken(QParser.Number, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterNumberExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitNumberExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitNumberExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class IdentifierExpressionContext extends ExpressionContext {
        public IdentifierExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode Identifier() {
            return getToken(QParser.Identifier, 0);
        }

        public IndexesContext indexes() {
            return getRuleContext(IndexesContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterIdentifierExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitIdentifierExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitIdentifierExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class NotExpressionContext extends ExpressionContext {
        public NotExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode Excl() {
            return getToken(QParser.Excl, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterNotExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitNotExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitNotExpression(this);
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
            return getToken(QParser.Or, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterOrExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitOrExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitOrExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class UnaryMinusExpressionContext extends ExpressionContext {
        public UnaryMinusExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode Subtract() {
            return getToken(QParser.Subtract, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterUnaryMinusExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitUnaryMinusExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitUnaryMinusExpression(this);
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
            return getToken(QParser.Pow, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterPowerExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitPowerExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitPowerExpression(this);
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
            return getToken(QParser.Equals, 0);
        }

        public TerminalNode NEquals() {
            return getToken(QParser.NEquals, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterEqExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitEqExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitEqExpression(this);
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
            return getToken(QParser.And, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterAndExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitAndExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitAndExpression(this);
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
            return getToken(QParser.In, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterInExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitInExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitInExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class StringExpressionContext extends ExpressionContext {
        public StringExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode String() {
            return getToken(QParser.String, 0);
        }

        public IndexesContext indexes() {
            return getRuleContext(IndexesContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterStringExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitStringExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitStringExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ExpressionExpressionContext extends ExpressionContext {
        public ExpressionExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode OParen() {
            return getToken(QParser.OParen, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode CParen() {
            return getToken(QParser.CParen, 0);
        }

        public IndexesContext indexes() {
            return getRuleContext(IndexesContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterExpressionExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitExpressionExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitExpressionExpression(this);
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
            return getToken(QParser.Add, 0);
        }

        public TerminalNode Subtract() {
            return getToken(QParser.Subtract, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterAddExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitAddExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitAddExpression(this);
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
            return getToken(QParser.GTEquals, 0);
        }

        public TerminalNode LTEquals() {
            return getToken(QParser.LTEquals, 0);
        }

        public TerminalNode GT() {
            return getToken(QParser.GT, 0);
        }

        public TerminalNode LT() {
            return getToken(QParser.LT, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterCompExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitCompExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitCompExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class NullExpressionContext extends ExpressionContext {
        public NullExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode Null() {
            return getToken(QParser.Null, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterNullExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitNullExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitNullExpression(this);
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
            if (listener instanceof QListener) ((QListener) listener).enterFunctionCallExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitFunctionCallExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitFunctionCallExpression(this);
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
            return getToken(QParser.Multiply, 0);
        }

        public TerminalNode Divide() {
            return getToken(QParser.Divide, 0);
        }

        public TerminalNode Modulus() {
            return getToken(QParser.Modulus, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterMultExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitMultExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitMultExpression(this);
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
            if (listener instanceof QListener) ((QListener) listener).enterListExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitListExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitListExpression(this);
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
            return getToken(QParser.QMark, 0);
        }

        public TerminalNode Colon() {
            return getToken(QParser.Colon, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterTernaryExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitTernaryExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitTernaryExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class InputExpressionContext extends ExpressionContext {
        public InputExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode Input() {
            return getToken(QParser.Input, 0);
        }

        public TerminalNode OParen() {
            return getToken(QParser.OParen, 0);
        }

        public TerminalNode CParen() {
            return getToken(QParser.CParen, 0);
        }

        public TerminalNode String() {
            return getToken(QParser.String, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterInputExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitInputExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitInputExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ListContext extends ParserRuleContext {
        public ListContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode OBracket() {
            return getToken(QParser.OBracket, 0);
        }

        public TerminalNode CBracket() {
            return getToken(QParser.CBracket, 0);
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
            if (listener instanceof QListener) ((QListener) listener).enterList(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitList(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitList(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class IndexesContext extends ParserRuleContext {
        public IndexesContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<TerminalNode> OBracket() {
            return getTokens(QParser.OBracket);
        }

        public TerminalNode OBracket(int i) {
            return getToken(QParser.OBracket, i);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public List<TerminalNode> CBracket() {
            return getTokens(QParser.CBracket);
        }

        public TerminalNode CBracket(int i) {
            return getToken(QParser.CBracket, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_indexes;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterIndexes(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitIndexes(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitIndexes(this);
            else return visitor.visitChildren(this);
        }
    }
}