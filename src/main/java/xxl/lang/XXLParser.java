// Generated from /Users/harryharbuck-marlowe/Desktop/xxl/src/main/java/xxl/XXLang/etc/XXL.g4 by ANTLR 4.9.2
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
    public static final int
            RULE_parse = 0, RULE_block = 1, RULE_statement = 2, RULE_assignment = 3,
            RULE_reAssignment = 4, RULE_functionCall = 5, RULE_ifStatement = 6, RULE_ifStat = 7,
            RULE_elseIfStat = 8, RULE_constructorStatement = 9, RULE_defaultCall = 10,
            RULE_elseStat = 11, RULE_functionDecl = 12, RULE_forStatement = 13, RULE_importStatement = 14,
            RULE_tryCatchStatement = 15, RULE_whileStatement = 16, RULE_webServerStatement = 17,
            RULE_windowCreateStatement = 18, RULE_windowRenderStatement = 19, RULE_windowAddCompStatement = 20,
            RULE_componentCreateStatement = 21, RULE_addWebServerTextStatement = 22,
            RULE_waitStatement = 23, RULE_mainFunctionStatement = 24, RULE_idList = 25,
            RULE_classStatement = 26, RULE_exprList = 27, RULE_expression = 28, RULE_list = 29,
            RULE_indexes = 30;
    public static final String[] ruleNames = makeRuleNames();
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3L\u01ac\4\2\t\2\4" +
                    "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
                    "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
                    "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2" +
                    "\3\2\3\2\3\3\3\3\7\3F\n\3\f\3\16\3I\13\3\3\3\3\3\3\3\3\3\5\3O\n\3\3\4" +
                    "\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3" +
                    "\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4" +
                    "\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4|\n\4\3\5\3\5\3\5\5\5\u0081\n\5\3\5\3" +
                    "\5\3\5\3\6\3\6\5\6\u0088\n\6\3\6\3\6\3\6\3\7\3\7\3\7\5\7\u0090\n\7\3\7" +
                    "\3\7\3\7\3\7\5\7\u0096\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7" +
                    "\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00ad\n\7\3\b\3\b\7\b\u00b1" +
                    "\n\b\f\b\16\b\u00b4\13\b\3\b\5\b\u00b7\n\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t" +
                    "\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\7\13" +
                    "\u00cf\n\13\f\13\16\13\u00d2\13\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f" +
                    "\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\5\16\u00e5\n\16\3\16\3\16\3\16" +
                    "\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20" +
                    "\3\20\3\20\7\20\u00fa\n\20\f\20\16\20\u00fd\13\20\3\21\3\21\3\21\3\21" +
                    "\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23" +
                    "\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25" +
                    "\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27" +
                    "\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31" +
                    "\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\7\33\u0143\n\33\f\33\16\33\u0146" +
                    "\13\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\7\35\u0150\n\35\f\35\16" +
                    "\35\u0153\13\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36" +
                    "\u015f\n\36\3\36\3\36\5\36\u0163\n\36\3\36\3\36\5\36\u0167\n\36\3\36\3" +
                    "\36\5\36\u016b\n\36\3\36\3\36\3\36\3\36\5\36\u0171\n\36\3\36\3\36\3\36" +
                    "\5\36\u0176\n\36\3\36\5\36\u0179\n\36\3\36\3\36\3\36\3\36\3\36\3\36\3" +
                    "\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3" +
                    "\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u0199\n\36\f\36" +
                    "\16\36\u019c\13\36\3\37\3\37\5\37\u01a0\n\37\3\37\3\37\3 \3 \3 \3 \6 " +
                    "\u01a8\n \r \16 \u01a9\3 \2\3:!\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36" +
                    " \"$&(*,.\60\62\64\668:<>\2\6\3\29;\3\2\678\4\2\61\62\65\66\3\2/\60\2" +
                    "\u01cc\2@\3\2\2\2\4G\3\2\2\2\6{\3\2\2\2\b}\3\2\2\2\n\u0085\3\2\2\2\f\u00ac" +
                    "\3\2\2\2\16\u00ae\3\2\2\2\20\u00ba\3\2\2\2\22\u00c1\3\2\2\2\24\u00c9\3" +
                    "\2\2\2\26\u00d7\3\2\2\2\30\u00dc\3\2\2\2\32\u00e0\3\2\2\2\34\u00ea\3\2" +
                    "\2\2\36\u00f4\3\2\2\2 \u00fe\3\2\2\2\"\u0107\3\2\2\2$\u010f\3\2\2\2&\u0114" +
                    "\3\2\2\2(\u011c\3\2\2\2*\u0122\3\2\2\2,\u0129\3\2\2\2.\u0131\3\2\2\2\60" +
                    "\u0136\3\2\2\2\62\u013b\3\2\2\2\64\u013f\3\2\2\2\66\u0147\3\2\2\28\u014c" +
                    "\3\2\2\2:\u0178\3\2\2\2<\u019d\3\2\2\2>\u01a7\3\2\2\2@A\5\4\3\2AB\7\2" +
                    "\2\3B\3\3\2\2\2CF\5\6\4\2DF\5\32\16\2EC\3\2\2\2ED\3\2\2\2FI\3\2\2\2GE" +
                    "\3\2\2\2GH\3\2\2\2HN\3\2\2\2IG\3\2\2\2JK\7!\2\2KL\5:\36\2LM\7B\2\2MO\3" +
                    "\2\2\2NJ\3\2\2\2NO\3\2\2\2O\5\3\2\2\2PQ\5\b\5\2QR\7B\2\2R|\3\2\2\2ST\5" +
                    "\f\7\2TU\7B\2\2U|\3\2\2\2V|\5\16\b\2W|\5\34\17\2X|\5\"\22\2YZ\5\36\20" +
                    "\2Z[\7B\2\2[|\3\2\2\2\\|\5 \21\2]|\5\62\32\2^_\5$\23\2_`\7B\2\2`|\3\2" +
                    "\2\2ab\5.\30\2bc\7B\2\2c|\3\2\2\2de\5\n\6\2ef\7B\2\2f|\3\2\2\2g|\5\66" +
                    "\34\2h|\5\24\13\2ij\5\26\f\2jk\7B\2\2k|\3\2\2\2lm\5\60\31\2mn\7B\2\2n" +
                    "|\3\2\2\2op\5&\24\2pq\7B\2\2q|\3\2\2\2rs\5*\26\2st\7B\2\2t|\3\2\2\2uv" +
                    "\5(\25\2vw\7B\2\2w|\3\2\2\2xy\5,\27\2yz\7B\2\2z|\3\2\2\2{P\3\2\2\2{S\3" +
                    "\2\2\2{V\3\2\2\2{W\3\2\2\2{X\3\2\2\2{Y\3\2\2\2{\\\3\2\2\2{]\3\2\2\2{^" +
                    "\3\2\2\2{a\3\2\2\2{d\3\2\2\2{g\3\2\2\2{h\3\2\2\2{i\3\2\2\2{l\3\2\2\2{" +
                    "o\3\2\2\2{r\3\2\2\2{u\3\2\2\2{x\3\2\2\2|\7\3\2\2\2}~\7\23\2\2~\u0080\7" +
                    "I\2\2\177\u0081\5> \2\u0080\177\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082" +
                    "\3\2\2\2\u0082\u0083\7C\2\2\u0083\u0084\5:\36\2\u0084\t\3\2\2\2\u0085" +
                    "\u0087\7I\2\2\u0086\u0088\5> \2\u0087\u0086\3\2\2\2\u0087\u0088\3\2\2" +
                    "\2\u0088\u0089\3\2\2\2\u0089\u008a\7C\2\2\u008a\u008b\5:\36\2\u008b\13" +
                    "\3\2\2\2\u008c\u008d\7I\2\2\u008d\u008f\7@\2\2\u008e\u0090\58\35\2\u008f" +
                    "\u008e\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u00ad\7A" +
                    "\2\2\u0092\u0093\7\r\2\2\u0093\u0095\7@\2\2\u0094\u0096\5:\36\2\u0095" +
                    "\u0094\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u00ad\7A" +
                    "\2\2\u0098\u0099\7\26\2\2\u0099\u009a\7@\2\2\u009a\u009b\5:\36\2\u009b" +
                    "\u009c\7A\2\2\u009c\u00ad\3\2\2\2\u009d\u009e\7\30\2\2\u009e\u009f\7@" +
                    "\2\2\u009f\u00a0\5:\36\2\u00a0\u00a1\7A\2\2\u00a1\u00ad\3\2\2\2\u00a2" +
                    "\u00a3\7\32\2\2\u00a3\u00a4\7@\2\2\u00a4\u00a5\5:\36\2\u00a5\u00a6\7A" +
                    "\2\2\u00a6\u00ad\3\2\2\2\u00a7\u00a8\7\34\2\2\u00a8\u00a9\7@\2\2\u00a9" +
                    "\u00aa\5:\36\2\u00aa\u00ab\7A\2\2\u00ab\u00ad\3\2\2\2\u00ac\u008c\3\2" +
                    "\2\2\u00ac\u0092\3\2\2\2\u00ac\u0098\3\2\2\2\u00ac\u009d\3\2\2\2\u00ac" +
                    "\u00a2\3\2\2\2\u00ac\u00a7\3\2\2\2\u00ad\r\3\2\2\2\u00ae\u00b2\5\20\t" +
                    "\2\u00af\u00b1\5\22\n\2\u00b0\u00af\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2" +
                    "\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2" +
                    "\2\2\u00b5\u00b7\5\30\r\2\u00b6\u00b5\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7" +
                    "\u00b8\3\2\2\2\u00b8\u00b9\7&\2\2\u00b9\17\3\2\2\2\u00ba\u00bb\7\37\2" +
                    "\2\u00bb\u00bc\7@\2\2\u00bc\u00bd\5:\36\2\u00bd\u00be\7A\2\2\u00be\u00bf" +
                    "\7%\2\2\u00bf\u00c0\5\4\3\2\u00c0\21\3\2\2\2\u00c1\u00c2\7 \2\2\u00c2" +
                    "\u00c3\7\37\2\2\u00c3\u00c4\7@\2\2\u00c4\u00c5\5:\36\2\u00c5\u00c6\7A" +
                    "\2\2\u00c6\u00c7\7%\2\2\u00c7\u00c8\5\4\3\2\u00c8\23\3\2\2\2\u00c9\u00ca" +
                    "\7\3\2\2\u00ca\u00cb\7I\2\2\u00cb\u00cc\7\4\2\2\u00cc\u00d0\7@\2\2\u00cd" +
                    "\u00cf\5> \2\u00ce\u00cd\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2" +
                    "\2\u00d0\u00d1\3\2\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d4" +
                    "\7A\2\2\u00d4\u00d5\5\4\3\2\u00d5\u00d6\7&\2\2\u00d6\25\3\2\2\2\u00d7" +
                    "\u00d8\7I\2\2\u00d8\u00d9\7\5\2\2\u00d9\u00da\7@\2\2\u00da\u00db\7A\2" +
                    "\2\u00db\27\3\2\2\2\u00dc\u00dd\7 \2\2\u00dd\u00de\7%\2\2\u00de\u00df" +
                    "\5\4\3\2\u00df\31\3\2\2\2\u00e0\u00e1\7\33\2\2\u00e1\u00e2\7I\2\2\u00e2" +
                    "\u00e4\7@\2\2\u00e3\u00e5\5\64\33\2\u00e4\u00e3\3\2\2\2\u00e4\u00e5\3" +
                    "\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\7A\2\2\u00e7\u00e8\5\4\3\2\u00e8" +
                    "\u00e9\7&\2\2\u00e9\33\3\2\2\2\u00ea\u00eb\7\"\2\2\u00eb\u00ec\7I\2\2" +
                    "\u00ec\u00ed\7C\2\2\u00ed\u00ee\5:\36\2\u00ee\u00ef\7$\2\2\u00ef\u00f0" +
                    "\5:\36\2\u00f0\u00f1\7%\2\2\u00f1\u00f2\5\4\3\2\u00f2\u00f3\7&\2\2\u00f3" +
                    "\35\3\2\2\2\u00f4\u00f5\7\6\2\2\u00f5\u00f6\7\25\2\2\u00f6\u00fb\7I\2" +
                    "\2\u00f7\u00f8\7\7\2\2\u00f8\u00fa\7I\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fd" +
                    "\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\37\3\2\2\2\u00fd" +
                    "\u00fb\3\2\2\2\u00fe\u00ff\7)\2\2\u00ff\u0100\5\4\3\2\u0100\u0101\7*\2" +
                    "\2\u0101\u0102\7@\2\2\u0102\u0103\7I\2\2\u0103\u0104\7A\2\2\u0104\u0105" +
                    "\5\4\3\2\u0105\u0106\7&\2\2\u0106!\3\2\2\2\u0107\u0108\7#\2\2\u0108\u0109" +
                    "\7@\2\2\u0109\u010a\5:\36\2\u010a\u010b\7A\2\2\u010b\u010c\7%\2\2\u010c" +
                    "\u010d\5\4\3\2\u010d\u010e\7&\2\2\u010e#\3\2\2\2\u010f\u0110\7\b\2\2\u0110" +
                    "\u0111\7@\2\2\u0111\u0112\5:\36\2\u0112\u0113\7A\2\2\u0113%\3\2\2\2\u0114" +
                    "\u0115\7\t\2\2\u0115\u0116\7I\2\2\u0116\u0117\7C\2\2\u0117\u0118\7\22" +
                    "\2\2\u0118\u0119\7@\2\2\u0119\u011a\58\35\2\u011a\u011b\7A\2\2\u011b\'" +
                    "\3\2\2\2\u011c\u011d\7I\2\2\u011d\u011e\7\7\2\2\u011e\u011f\7\17\2\2\u011f" +
                    "\u0120\7@\2\2\u0120\u0121\7A\2\2\u0121)\3\2\2\2\u0122\u0123\7I\2\2\u0123" +
                    "\u0124\7\7\2\2\u0124\u0125\7\20\2\2\u0125\u0126\7@\2\2\u0126\u0127\5:" +
                    "\36\2\u0127\u0128\7A\2\2\u0128+\3\2\2\2\u0129\u012a\7\16\2\2\u012a\u012b" +
                    "\7I\2\2\u012b\u012c\7C\2\2\u012c\u012d\7\n\2\2\u012d\u012e\7@\2\2\u012e" +
                    "\u012f\58\35\2\u012f\u0130\7A\2\2\u0130-\3\2\2\2\u0131\u0132\7\24\2\2" +
                    "\u0132\u0133\7@\2\2\u0133\u0134\5:\36\2\u0134\u0135\7A\2\2\u0135/\3\2" +
                    "\2\2\u0136\u0137\7\31\2\2\u0137\u0138\7@\2\2\u0138\u0139\5:\36\2\u0139" +
                    "\u013a\7A\2\2\u013a\61\3\2\2\2\u013b\u013c\7\13\2\2\u013c\u013d\5\4\3" +
                    "\2\u013d\u013e\7&\2\2\u013e\63\3\2\2\2\u013f\u0144\7I\2\2\u0140\u0141" +
                    "\7D\2\2\u0141\u0143\7I\2\2\u0142\u0140\3\2\2\2\u0143\u0146\3\2\2\2\u0144" +
                    "\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145\65\3\2\2\2\u0146\u0144\3\2\2" +
                    "\2\u0147\u0148\7+\2\2\u0148\u0149\7I\2\2\u0149\u014a\5\4\3\2\u014a\u014b" +
                    "\7\f\2\2\u014b\67\3\2\2\2\u014c\u0151\5:\36\2\u014d\u014e\7D\2\2\u014e" +
                    "\u0150\5:\36\2\u014f\u014d\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u014f\3\2" +
                    "\2\2\u0151\u0152\3\2\2\2\u01529\3\2\2\2\u0153\u0151\3\2\2\2\u0154\u0155" +
                    "\b\36\1\2\u0155\u0156\78\2\2\u0156\u0179\5:\36\26\u0157\u0158\7\64\2\2" +
                    "\u0158\u0179\5:\36\25\u0159\u0179\7H\2\2\u015a\u0179\7G\2\2\u015b\u0179" +
                    "\7(\2\2\u015c\u015e\5\f\7\2\u015d\u015f\5> \2\u015e\u015d\3\2\2\2\u015e" +
                    "\u015f\3\2\2\2\u015f\u0179\3\2\2\2\u0160\u0162\5<\37\2\u0161\u0163\5>" +
                    " \2\u0162\u0161\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0179\3\2\2\2\u0164" +
                    "\u0166\7I\2\2\u0165\u0167\5> \2\u0166\u0165\3\2\2\2\u0166\u0167\3\2\2" +
                    "\2\u0167\u0179\3\2\2\2\u0168\u016a\7J\2\2\u0169\u016b\5> \2\u016a\u0169" +
                    "\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u0179\3\2\2\2\u016c\u016d\7@\2\2\u016d" +
                    "\u016e\5:\36\2\u016e\u0170\7A\2\2\u016f\u0171\5> \2\u0170\u016f\3\2\2" +
                    "\2\u0170\u0171\3\2\2\2\u0171\u0179\3\2\2\2\u0172\u0173\7\27\2\2\u0173" +
                    "\u0175\7@\2\2\u0174\u0176\7J\2\2\u0175\u0174\3\2\2\2\u0175\u0176\3\2\2" +
                    "\2\u0176\u0177\3\2\2\2\u0177\u0179\7A\2\2\u0178\u0154\3\2\2\2\u0178\u0157" +
                    "\3\2\2\2\u0178\u0159\3\2\2\2\u0178\u015a\3\2\2\2\u0178\u015b\3\2\2\2\u0178" +
                    "\u015c\3\2\2\2\u0178\u0160\3\2\2\2\u0178\u0164\3\2\2\2\u0178\u0168\3\2" +
                    "\2\2\u0178\u016c\3\2\2\2\u0178\u0172\3\2\2\2\u0179\u019a\3\2\2\2\u017a" +
                    "\u017b\f\24\2\2\u017b\u017c\7\63\2\2\u017c\u0199\5:\36\24\u017d\u017e" +
                    "\f\23\2\2\u017e\u017f\t\2\2\2\u017f\u0199\5:\36\24\u0180\u0181\f\22\2" +
                    "\2\u0181\u0182\t\3\2\2\u0182\u0199\5:\36\23\u0183\u0184\f\21\2\2\u0184" +
                    "\u0185\t\4\2\2\u0185\u0199\5:\36\22\u0186\u0187\f\20\2\2\u0187\u0188\t" +
                    "\5\2\2\u0188\u0199\5:\36\21\u0189\u018a\f\17\2\2\u018a\u018b\7.\2\2\u018b" +
                    "\u0199\5:\36\20\u018c\u018d\f\16\2\2\u018d\u018e\7-\2\2\u018e\u0199\5" +
                    ":\36\17\u018f\u0190\f\r\2\2\u0190\u0191\7E\2\2\u0191\u0192\5:\36\2\u0192" +
                    "\u0193\7F\2\2\u0193\u0194\5:\36\16\u0194\u0199\3\2\2\2\u0195\u0196\f\f" +
                    "\2\2\u0196\u0197\7\'\2\2\u0197\u0199\5:\36\r\u0198\u017a\3\2\2\2\u0198" +
                    "\u017d\3\2\2\2\u0198\u0180\3\2\2\2\u0198\u0183\3\2\2\2\u0198\u0186\3\2" +
                    "\2\2\u0198\u0189\3\2\2\2\u0198\u018c\3\2\2\2\u0198\u018f\3\2\2\2\u0198" +
                    "\u0195\3\2\2\2\u0199\u019c\3\2\2\2\u019a\u0198\3\2\2\2\u019a\u019b\3\2" +
                    "\2\2\u019b;\3\2\2\2\u019c\u019a\3\2\2\2\u019d\u019f\7>\2\2\u019e\u01a0" +
                    "\58\35\2\u019f\u019e\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1" +
                    "\u01a2\7?\2\2\u01a2=\3\2\2\2\u01a3\u01a4\7>\2\2\u01a4\u01a5\5:\36\2\u01a5" +
                    "\u01a6\7?\2\2\u01a6\u01a8\3\2\2\2\u01a7\u01a3\3\2\2\2\u01a8\u01a9\3\2" +
                    "\2\2\u01a9\u01a7\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa?\3\2\2\2\35EGN{\u0080" +
                    "\u0087\u008f\u0095\u00ac\u00b2\u00b6\u00d0\u00e4\u00fb\u0144\u0151\u015e" +
                    "\u0162\u0166\u016a\u0170\u0175\u0178\u0198\u019a\u019f\u01a9";
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
                "whileStatement", "webServerStatement", "windowCreateStatement", "windowRenderStatement",
                "windowAddCompStatement", "componentCreateStatement", "addWebServerTextStatement",
                "waitStatement", "mainFunctionStatement", "idList", "classStatement",
                "exprList", "expression", "list", "indexes"
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
    public ATN getATN() {
        return _ATN;
    }

    public final ParseContext parse() throws RecognitionException {
        ParseContext _localctx = new ParseContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_parse);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(62);
                block();
                setState(63);
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
                setState(69);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << Println) | (1L << Component) | (1L << Var) | (1L << AddWSText) | (1L << Print) | (1L << Assert) | (1L << Wait) | (1L << Size) | (1L << Def) | (1L << ToInt) | (1L << If) | (1L << For) | (1L << While) | (1L << Try) | (1L << Class))) != 0) || _la == Identifier) {
                    {
                        setState(67);
                        _errHandler.sync(this);
                        switch (_input.LA(1)) {
                            case T__0:
                            case T__3:
                            case T__5:
                            case T__6:
                            case T__8:
                            case Println:
                            case Component:
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
                                setState(65);
                                statement();
                            }
                            break;
                            case Def: {
                                setState(66);
                                functionDecl();
                            }
                            break;
                            default:
                                throw new NoViableAltException(this);
                        }
                    }
                    setState(71);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(76);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == Return) {
                    {
                        setState(72);
                        match(Return);
                        setState(73);
                        expression(0);
                        setState(74);
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
            setState(121);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 3, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(78);
                    assignment();
                    setState(79);
                    match(SColon);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(81);
                    functionCall();
                    setState(82);
                    match(SColon);
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(84);
                    ifStatement();
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(85);
                    forStatement();
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(86);
                    whileStatement();
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(87);
                    importStatement();
                    setState(88);
                    match(SColon);
                }
                break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(90);
                    tryCatchStatement();
                }
                break;
                case 8:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(91);
                    mainFunctionStatement();
                }
                break;
                case 9:
                    enterOuterAlt(_localctx, 9);
                {
                    setState(92);
                    webServerStatement();
                    setState(93);
                    match(SColon);
                }
                break;
                case 10:
                    enterOuterAlt(_localctx, 10);
                {
                    setState(95);
                    addWebServerTextStatement();
                    setState(96);
                    match(SColon);
                }
                break;
                case 11:
                    enterOuterAlt(_localctx, 11);
                {
                    setState(98);
                    reAssignment();
                    setState(99);
                    match(SColon);
                }
                break;
                case 12:
                    enterOuterAlt(_localctx, 12);
                {
                    setState(101);
                    classStatement();
                }
                break;
                case 13:
                    enterOuterAlt(_localctx, 13);
                {
                    setState(102);
                    constructorStatement();
                }
                break;
                case 14:
                    enterOuterAlt(_localctx, 14);
                {
                    setState(103);
                    defaultCall();
                    setState(104);
                    match(SColon);
                }
                break;
                case 15:
                    enterOuterAlt(_localctx, 15);
                {
                    setState(106);
                    waitStatement();
                    setState(107);
                    match(SColon);
                }
                break;
                case 16:
                    enterOuterAlt(_localctx, 16);
                {
                    setState(109);
                    windowCreateStatement();
                    setState(110);
                    match(SColon);
                }
                break;
                case 17:
                    enterOuterAlt(_localctx, 17);
                {
                    setState(112);
                    windowAddCompStatement();
                    setState(113);
                    match(SColon);
                }
                break;
                case 18:
                    enterOuterAlt(_localctx, 18);
                {
                    setState(115);
                    windowRenderStatement();
                    setState(116);
                    match(SColon);
                }
                break;
                case 19:
                    enterOuterAlt(_localctx, 19);
                {
                    setState(118);
                    componentCreateStatement();
                    setState(119);
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
                setState(123);
                match(Var);
                setState(124);
                match(Identifier);
                setState(126);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == OBracket) {
                    {
                        setState(125);
                        indexes();
                    }
                }

                setState(128);
                match(Assign);
                setState(129);
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
                setState(131);
                match(Identifier);
                setState(133);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == OBracket) {
                    {
                        setState(132);
                        indexes();
                    }
                }

                setState(135);
                match(Assign);
                setState(136);
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
            setState(170);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case Identifier:
                    _localctx = new IdentifierFunctionCallContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(138);
                    match(Identifier);
                    setState(139);
                    match(OParen);
                    setState(141);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (Println - 11)) | (1L << (Print - 11)) | (1L << (Input - 11)) | (1L << (Assert - 11)) | (1L << (Size - 11)) | (1L << (ToInt - 11)) | (1L << (Null - 11)) | (1L << (Excl - 11)) | (1L << (Subtract - 11)) | (1L << (OBracket - 11)) | (1L << (OParen - 11)) | (1L << (Bool - 11)) | (1L << (Number - 11)) | (1L << (Identifier - 11)) | (1L << (String - 11)))) != 0)) {
                        {
                            setState(140);
                            exprList();
                        }
                    }

                    setState(143);
                    match(CParen);
                }
                break;
                case Println:
                    _localctx = new PrintlnFunctionCallContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(144);
                    match(Println);
                    setState(145);
                    match(OParen);
                    setState(147);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (Println - 11)) | (1L << (Print - 11)) | (1L << (Input - 11)) | (1L << (Assert - 11)) | (1L << (Size - 11)) | (1L << (ToInt - 11)) | (1L << (Null - 11)) | (1L << (Excl - 11)) | (1L << (Subtract - 11)) | (1L << (OBracket - 11)) | (1L << (OParen - 11)) | (1L << (Bool - 11)) | (1L << (Number - 11)) | (1L << (Identifier - 11)) | (1L << (String - 11)))) != 0)) {
                        {
                            setState(146);
                            expression(0);
                        }
                    }

                    setState(149);
                    match(CParen);
                }
                break;
                case Print:
                    _localctx = new PrintFunctionCallContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(150);
                    match(Print);
                    setState(151);
                    match(OParen);
                    setState(152);
                    expression(0);
                    setState(153);
                    match(CParen);
                }
                break;
                case Assert:
                    _localctx = new AssertFunctionCallContext(_localctx);
                    enterOuterAlt(_localctx, 4);
                {
                    setState(155);
                    match(Assert);
                    setState(156);
                    match(OParen);
                    setState(157);
                    expression(0);
                    setState(158);
                    match(CParen);
                }
                break;
                case Size:
                    _localctx = new SizeFunctionCallContext(_localctx);
                    enterOuterAlt(_localctx, 5);
                {
                    setState(160);
                    match(Size);
                    setState(161);
                    match(OParen);
                    setState(162);
                    expression(0);
                    setState(163);
                    match(CParen);
                }
                break;
                case ToInt:
                    _localctx = new ToIntFunctionCallContext(_localctx);
                    enterOuterAlt(_localctx, 6);
                {
                    setState(165);
                    match(ToInt);
                    setState(166);
                    match(OParen);
                    setState(167);
                    expression(0);
                    setState(168);
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
                setState(172);
                ifStat();
                setState(176);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 9, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(173);
                                elseIfStat();
                            }
                        }
                    }
                    setState(178);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 9, _ctx);
                }
                setState(180);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == Else) {
                    {
                        setState(179);
                        elseStat();
                    }
                }

                setState(182);
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
                setState(184);
                match(If);
                setState(185);
                match(OParen);
                setState(186);
                expression(0);
                setState(187);
                match(CParen);
                setState(188);
                match(Do);
                setState(189);
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
                setState(191);
                match(Else);
                setState(192);
                match(If);
                setState(193);
                match(OParen);
                setState(194);
                expression(0);
                setState(195);
                match(CParen);
                setState(196);
                match(Do);
                setState(197);
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
                setState(199);
                match(T__0);
                setState(200);
                match(Identifier);
                setState(201);
                match(T__1);
                setState(202);
                match(OParen);
                setState(206);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == OBracket) {
                    {
                        {
                            setState(203);
                            indexes();
                        }
                    }
                    setState(208);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(209);
                match(CParen);
                setState(210);
                block();
                setState(211);
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
                setState(213);
                match(Identifier);
                setState(214);
                match(T__2);
                setState(215);
                match(OParen);
                setState(216);
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
                setState(218);
                match(Else);
                setState(219);
                match(Do);
                setState(220);
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
                setState(222);
                match(Def);
                setState(223);
                match(Identifier);
                setState(224);
                match(OParen);
                setState(226);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == Identifier) {
                    {
                        setState(225);
                        idList();
                    }
                }

                setState(228);
                match(CParen);
                setState(229);
                block();
                setState(230);
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
                setState(232);
                match(For);
                setState(233);
                match(Identifier);
                setState(234);
                match(Assign);
                setState(235);
                expression(0);
                setState(236);
                match(To);
                setState(237);
                expression(0);
                setState(238);
                match(Do);
                setState(239);
                block();
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

    public final ImportStatementContext importStatement() throws RecognitionException {
        ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
        enterRule(_localctx, 28, RULE_importStatement);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(242);
                match(T__3);
                setState(243);
                match(Import);
                setState(244);
                match(Identifier);
                setState(249);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__4) {
                    {
                        {
                            setState(245);
                            match(T__4);
                            setState(246);
                            match(Identifier);
                        }
                    }
                    setState(251);
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
                setState(252);
                match(Try);
                setState(253);
                block();
                setState(254);
                match(Catch);
                setState(255);
                match(OParen);
                setState(256);
                match(Identifier);
                setState(257);
                match(CParen);
                setState(258);
                block();
                setState(259);
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
                setState(261);
                match(While);
                setState(262);
                match(OParen);
                setState(263);
                expression(0);
                setState(264);
                match(CParen);
                setState(265);
                match(Do);
                setState(266);
                block();
                setState(267);
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
                setState(269);
                match(T__5);
                setState(270);
                match(OParen);
                setState(271);
                expression(0);
                setState(272);
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

    public final WindowCreateStatementContext windowCreateStatement() throws RecognitionException {
        WindowCreateStatementContext _localctx = new WindowCreateStatementContext(_ctx, getState());
        enterRule(_localctx, 36, RULE_windowCreateStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(274);
                match(T__6);
                setState(275);
                match(Identifier);
                setState(276);
                match(Assign);
                setState(277);
                match(Window);
                setState(278);
                match(OParen);
                setState(279);
                exprList();
                setState(280);
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

    public final WindowRenderStatementContext windowRenderStatement() throws RecognitionException {
        WindowRenderStatementContext _localctx = new WindowRenderStatementContext(_ctx, getState());
        enterRule(_localctx, 38, RULE_windowRenderStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(282);
                match(Identifier);
                setState(283);
                match(T__4);
                setState(284);
                match(Render);
                setState(285);
                match(OParen);
                setState(286);
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
        enterRule(_localctx, 40, RULE_windowAddCompStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(288);
                match(Identifier);
                setState(289);
                match(T__4);
                setState(290);
                match(AddComponent);
                setState(291);
                match(OParen);
                setState(292);
                expression(0);
                setState(293);
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

    public final ComponentCreateStatementContext componentCreateStatement() throws RecognitionException {
        ComponentCreateStatementContext _localctx = new ComponentCreateStatementContext(_ctx, getState());
        enterRule(_localctx, 42, RULE_componentCreateStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(295);
                match(Component);
                setState(296);
                match(Identifier);
                setState(297);
                match(Assign);
                setState(298);
                match(T__7);
                setState(299);
                match(OParen);
                setState(300);
                exprList();
                setState(301);
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
        enterRule(_localctx, 44, RULE_addWebServerTextStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(303);
                match(AddWSText);
                setState(304);
                match(OParen);
                setState(305);
                expression(0);
                setState(306);
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
        enterRule(_localctx, 46, RULE_waitStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(308);
                match(Wait);
                setState(309);
                match(OParen);
                setState(310);
                expression(0);
                setState(311);
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
        enterRule(_localctx, 48, RULE_mainFunctionStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(313);
                match(T__8);
                setState(314);
                block();
                setState(315);
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
        enterRule(_localctx, 50, RULE_idList);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(317);
                match(Identifier);
                setState(322);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == Comma) {
                    {
                        {
                            setState(318);
                            match(Comma);
                            setState(319);
                            match(Identifier);
                        }
                    }
                    setState(324);
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
        enterRule(_localctx, 52, RULE_classStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(325);
                match(Class);
                setState(326);
                match(Identifier);
                setState(327);
                block();
                setState(328);
                match(T__9);
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
        enterRule(_localctx, 54, RULE_exprList);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(330);
                expression(0);
                setState(335);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == Comma) {
                    {
                        {
                            setState(331);
                            match(Comma);
                            setState(332);
                            expression(0);
                        }
                    }
                    setState(337);
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
        int _startState = 56;
        enterRecursionRule(_localctx, 56, RULE_expression, _p);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(374);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 22, _ctx)) {
                    case 1: {
                        _localctx = new UnaryMinusExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;

                        setState(339);
                        match(Subtract);
                        setState(340);
                        expression(20);
                    }
                    break;
                    case 2: {
                        _localctx = new NotExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(341);
                        match(Excl);
                        setState(342);
                        expression(19);
                    }
                    break;
                    case 3: {
                        _localctx = new NumberExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(343);
                        match(Number);
                    }
                    break;
                    case 4: {
                        _localctx = new BoolExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(344);
                        match(Bool);
                    }
                    break;
                    case 5: {
                        _localctx = new NullExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(345);
                        match(Null);
                    }
                    break;
                    case 6: {
                        _localctx = new FunctionCallExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(346);
                        functionCall();
                        setState(348);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 16, _ctx)) {
                            case 1: {
                                setState(347);
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
                        setState(350);
                        list();
                        setState(352);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 17, _ctx)) {
                            case 1: {
                                setState(351);
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
                        setState(354);
                        match(Identifier);
                        setState(356);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 18, _ctx)) {
                            case 1: {
                                setState(355);
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
                        setState(358);
                        match(String);
                        setState(360);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 19, _ctx)) {
                            case 1: {
                                setState(359);
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
                        setState(362);
                        match(OParen);
                        setState(363);
                        expression(0);
                        setState(364);
                        match(CParen);
                        setState(366);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 20, _ctx)) {
                            case 1: {
                                setState(365);
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
                        setState(368);
                        match(Input);
                        setState(369);
                        match(OParen);
                        setState(371);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == String) {
                            {
                                setState(370);
                                match(String);
                            }
                        }

                        setState(373);
                        match(CParen);
                    }
                    break;
                }
                _ctx.stop = _input.LT(-1);
                setState(408);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 24, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(406);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 23, _ctx)) {
                                case 1: {
                                    _localctx = new PowerExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(376);
                                    if (!(precpred(_ctx, 18)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 18)");
                                    setState(377);
                                    match(Pow);
                                    setState(378);
                                    expression(18);
                                }
                                break;
                                case 2: {
                                    _localctx = new MultExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(379);
                                    if (!(precpred(_ctx, 17)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 17)");
                                    setState(380);
                                    ((MultExpressionContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Multiply) | (1L << Divide) | (1L << Modulus))) != 0))) {
                                        ((MultExpressionContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(381);
                                    expression(18);
                                }
                                break;
                                case 3: {
                                    _localctx = new AddExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(382);
                                    if (!(precpred(_ctx, 16)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 16)");
                                    setState(383);
                                    ((AddExpressionContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!(_la == Add || _la == Subtract)) {
                                        ((AddExpressionContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(384);
                                    expression(17);
                                }
                                break;
                                case 4: {
                                    _localctx = new CompExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(385);
                                    if (!(precpred(_ctx, 15)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 15)");
                                    setState(386);
                                    ((CompExpressionContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GTEquals) | (1L << LTEquals) | (1L << GT) | (1L << LT))) != 0))) {
                                        ((CompExpressionContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(387);
                                    expression(16);
                                }
                                break;
                                case 5: {
                                    _localctx = new EqExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(388);
                                    if (!(precpred(_ctx, 14)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 14)");
                                    setState(389);
                                    ((EqExpressionContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!(_la == Equals || _la == NEquals)) {
                                        ((EqExpressionContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(390);
                                    expression(15);
                                }
                                break;
                                case 6: {
                                    _localctx = new AndExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(391);
                                    if (!(precpred(_ctx, 13)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 13)");
                                    setState(392);
                                    match(And);
                                    setState(393);
                                    expression(14);
                                }
                                break;
                                case 7: {
                                    _localctx = new OrExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(394);
                                    if (!(precpred(_ctx, 12)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 12)");
                                    setState(395);
                                    match(Or);
                                    setState(396);
                                    expression(13);
                                }
                                break;
                                case 8: {
                                    _localctx = new TernaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(397);
                                    if (!(precpred(_ctx, 11)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 11)");
                                    setState(398);
                                    match(QMark);
                                    setState(399);
                                    expression(0);
                                    setState(400);
                                    match(Colon);
                                    setState(401);
                                    expression(12);
                                }
                                break;
                                case 9: {
                                    _localctx = new InExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(403);
                                    if (!(precpred(_ctx, 10)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 10)");
                                    setState(404);
                                    match(In);
                                    setState(405);
                                    expression(11);
                                }
                                break;
                            }
                        }
                    }
                    setState(410);
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
        enterRule(_localctx, 58, RULE_list);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(411);
                match(OBracket);
                setState(413);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (Println - 11)) | (1L << (Print - 11)) | (1L << (Input - 11)) | (1L << (Assert - 11)) | (1L << (Size - 11)) | (1L << (ToInt - 11)) | (1L << (Null - 11)) | (1L << (Excl - 11)) | (1L << (Subtract - 11)) | (1L << (OBracket - 11)) | (1L << (OParen - 11)) | (1L << (Bool - 11)) | (1L << (Number - 11)) | (1L << (Identifier - 11)) | (1L << (String - 11)))) != 0)) {
                    {
                        setState(412);
                        exprList();
                    }
                }

                setState(415);
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
        enterRule(_localctx, 60, RULE_indexes);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(421);
                _errHandler.sync(this);
                _alt = 1;
                do {
                    switch (_alt) {
                        case 1: {
                            {
                                setState(417);
                                match(OBracket);
                                setState(418);
                                expression(0);
                                setState(419);
                                match(CBracket);
                            }
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                    setState(423);
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
            case 28:
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

        public WindowCreateStatementContext windowCreateStatement() {
            return getRuleContext(WindowCreateStatementContext.class, 0);
        }

        public WindowAddCompStatementContext windowAddCompStatement() {
            return getRuleContext(WindowAddCompStatementContext.class, 0);
        }

        public WindowRenderStatementContext windowRenderStatement() {
            return getRuleContext(WindowRenderStatementContext.class, 0);
        }

        public ComponentCreateStatementContext componentCreateStatement() {
            return getRuleContext(ComponentCreateStatementContext.class, 0);
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

    public static class WindowCreateStatementContext extends ParserRuleContext {
        public WindowCreateStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Identifier() {
            return getToken(XXLParser.Identifier, 0);
        }

        public TerminalNode Assign() {
            return getToken(XXLParser.Assign, 0);
        }

        public TerminalNode Window() {
            return getToken(XXLParser.Window, 0);
        }

        public TerminalNode OParen() {
            return getToken(XXLParser.OParen, 0);
        }

        public ExprListContext exprList() {
            return getRuleContext(ExprListContext.class, 0);
        }

        public TerminalNode CParen() {
            return getToken(XXLParser.CParen, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_windowCreateStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).enterWindowCreateStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).exitWindowCreateStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof XXLVisitor)
                return ((XXLVisitor<? extends T>) visitor).visitWindowCreateStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class WindowRenderStatementContext extends ParserRuleContext {
        public WindowRenderStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Identifier() {
            return getToken(XXLParser.Identifier, 0);
        }

        public TerminalNode Render() {
            return getToken(XXLParser.Render, 0);
        }

        public TerminalNode OParen() {
            return getToken(XXLParser.OParen, 0);
        }

        public TerminalNode CParen() {
            return getToken(XXLParser.CParen, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_windowRenderStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).enterWindowRenderStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).exitWindowRenderStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof XXLVisitor)
                return ((XXLVisitor<? extends T>) visitor).visitWindowRenderStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class WindowAddCompStatementContext extends ParserRuleContext {
        public WindowAddCompStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Identifier() {
            return getToken(XXLParser.Identifier, 0);
        }

        public TerminalNode AddComponent() {
            return getToken(XXLParser.AddComponent, 0);
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
            return RULE_windowAddCompStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).enterWindowAddCompStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).exitWindowAddCompStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof XXLVisitor)
                return ((XXLVisitor<? extends T>) visitor).visitWindowAddCompStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ComponentCreateStatementContext extends ParserRuleContext {
        public ComponentCreateStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Component() {
            return getToken(XXLParser.Component, 0);
        }

        public TerminalNode Identifier() {
            return getToken(XXLParser.Identifier, 0);
        }

        public TerminalNode Assign() {
            return getToken(XXLParser.Assign, 0);
        }

        public TerminalNode OParen() {
            return getToken(XXLParser.OParen, 0);
        }

        public ExprListContext exprList() {
            return getRuleContext(ExprListContext.class, 0);
        }

        public TerminalNode CParen() {
            return getToken(XXLParser.CParen, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_componentCreateStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).enterComponentCreateStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).exitComponentCreateStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof XXLVisitor)
                return ((XXLVisitor<? extends T>) visitor).visitComponentCreateStatement(this);
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