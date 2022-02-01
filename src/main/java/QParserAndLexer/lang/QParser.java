// Generated from /Users/harryharbuck-marlowe/Desktop/xxl/src/main/java/xxl/XXLang/etc/Q.g4 by ANTLR 4.9.2
package QParserAndLexer.lang;

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
            T__9 = 10, T__10 = 11, T__11 = 12, T__12 = 13, T__13 = 14, Println = 15, Component = 16,
            Render = 17, AddComponent = 18, New = 19, Window = 20, Var = 21, AddWSText = 22, Import = 23,
            Print = 24, Input = 25, Assert = 26, Wait = 27, Size = 28, Def = 29, ToInt = 30, Create = 31,
            WebServer = 32, If = 33, Else = 34, Return = 35, For = 36, While = 37, To = 38, Do = 39,
            End = 40, In = 41, Null = 42, Try = 43, Catch = 44, Class = 45, CreateClass = 46, Or = 47,
            And = 48, Equals = 49, NEquals = 50, GTEquals = 51, LTEquals = 52, Pow = 53, Excl = 54,
            GT = 55, LT = 56, Add = 57, Subtract = 58, Multiply = 59, Divide = 60, Modulus = 61,
            OBrace = 62, CBrace = 63, OBracket = 64, CBracket = 65, OParen = 66, CParen = 67,
            SColon = 68, Assign = 69, Comma = 70, QMark = 71, Colon = 72, Bool = 73, Number = 74,
            Identifier = 75, String = 76, Comment = 77, Space = 78;
    public static final int
            RULE_parse = 0, RULE_block = 1, RULE_statement = 2, RULE_assignment = 3,
            RULE_reAssignment = 4, RULE_functionCall = 5, RULE_ifStatement = 6, RULE_ifStat = 7,
            RULE_elseIfStat = 8, RULE_constructorStatement = 9, RULE_fileObjectInitializeStatement = 10,
            RULE_fileWriteStatement = 11, RULE_verifyFileStatement = 12, RULE_defaultCall = 13,
            RULE_elseStat = 14, RULE_functionDecl = 15, RULE_forStatement = 16, RULE_importStatement = 17,
            RULE_tryCatchStatement = 18, RULE_whileStatement = 19, RULE_webServerStatement = 20,
            RULE_windowCreateStatement = 21, RULE_windowRenderStatement = 22, RULE_windowAddCompStatement = 23,
            RULE_componentCreateStatement = 24, RULE_addWebServerTextStatement = 25,
            RULE_waitStatement = 26, RULE_mainFunctionStatement = 27, RULE_idList = 28,
            RULE_classStatement = 29, RULE_exprList = 30, RULE_expression = 31, RULE_list = 32,
            RULE_indexes = 33;
    public static final String[] ruleNames = makeRuleNames();
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3P\u01cf\4\2\t\2\4" +
                    "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
                    "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
                    "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!" +
                    "\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\3\3\3\7\3L\n\3\f\3\16\3O\13\3\3\3\3\3" +
                    "\3\3\3\3\5\3U\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4" +
                    "\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3" +
                    "\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4" +
                    "\3\4\3\4\3\4\3\4\5\4\u008b\n\4\3\5\3\5\3\5\5\5\u0090\n\5\3\5\3\5\3\5\3" +
                    "\6\3\6\5\6\u0097\n\6\3\6\3\6\3\6\3\7\3\7\3\7\5\7\u009f\n\7\3\7\3\7\3\7" +
                    "\3\7\5\7\u00a5\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7" +
                    "\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00bc\n\7\3\b\3\b\7\b\u00c0\n\b\f" +
                    "\b\16\b\u00c3\13\b\3\b\5\b\u00c6\n\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3" +
                    "\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\7\13\u00de" +
                    "\n\13\f\13\16\13\u00e1\13\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3" +
                    "\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3" +
                    "\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\5\21\u0108" +
                    "\n\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22" +
                    "\3\22\3\23\3\23\3\23\3\23\3\23\7\23\u011d\n\23\f\23\16\23\u0120\13\23" +
                    "\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25" +
                    "\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27" +
                    "\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31" +
                    "\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33" +
                    "\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\7\36\u0166" +
                    "\n\36\f\36\16\36\u0169\13\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \7 \u0173" +
                    "\n \f \16 \u0176\13 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u0182\n!\3!\3!\5" +
                    "!\u0186\n!\3!\3!\5!\u018a\n!\3!\3!\5!\u018e\n!\3!\3!\3!\3!\5!\u0194\n" +
                    "!\3!\3!\3!\5!\u0199\n!\3!\5!\u019c\n!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3" +
                    "!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\7!\u01bc\n" +
                    "!\f!\16!\u01bf\13!\3\"\3\"\5\"\u01c3\n\"\3\"\3\"\3#\3#\3#\3#\6#\u01cb" +
                    "\n#\r#\16#\u01cc\3#\2\3@$\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&" +
                    "(*,.\60\62\64\668:<>@BD\2\6\3\2=?\3\2;<\4\2\65\669:\3\2\63\64\2\u01ef" +
                    "\2F\3\2\2\2\4M\3\2\2\2\6\u008a\3\2\2\2\b\u008c\3\2\2\2\n\u0094\3\2\2\2" +
                    "\f\u00bb\3\2\2\2\16\u00bd\3\2\2\2\20\u00c9\3\2\2\2\22\u00d0\3\2\2\2\24" +
                    "\u00d8\3\2\2\2\26\u00e6\3\2\2\2\30\u00ee\3\2\2\2\32\u00f5\3\2\2\2\34\u00fa" +
                    "\3\2\2\2\36\u00ff\3\2\2\2 \u0103\3\2\2\2\"\u010d\3\2\2\2$\u0117\3\2\2" +
                    "\2&\u0121\3\2\2\2(\u012a\3\2\2\2*\u0132\3\2\2\2,\u0137\3\2\2\2.\u013f" +
                    "\3\2\2\2\60\u0145\3\2\2\2\62\u014c\3\2\2\2\64\u0154\3\2\2\2\66\u0159\3" +
                    "\2\2\28\u015e\3\2\2\2:\u0162\3\2\2\2<\u016a\3\2\2\2>\u016f\3\2\2\2@\u019b" +
                    "\3\2\2\2B\u01c0\3\2\2\2D\u01ca\3\2\2\2FG\5\4\3\2GH\7\2\2\3H\3\3\2\2\2" +
                    "IL\5\6\4\2JL\5 \21\2KI\3\2\2\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2" +
                    "NT\3\2\2\2OM\3\2\2\2PQ\7%\2\2QR\5@!\2RS\7F\2\2SU\3\2\2\2TP\3\2\2\2TU\3" +
                    "\2\2\2U\5\3\2\2\2VW\5\b\5\2WX\7F\2\2X\u008b\3\2\2\2YZ\5\f\7\2Z[\7F\2\2" +
                    "[\u008b\3\2\2\2\\\u008b\5\16\b\2]\u008b\5\"\22\2^\u008b\5(\25\2_`\5$\23" +
                    "\2`a\7F\2\2a\u008b\3\2\2\2b\u008b\5&\24\2c\u008b\58\35\2de\5*\26\2ef\7" +
                    "F\2\2f\u008b\3\2\2\2gh\5\64\33\2hi\7F\2\2i\u008b\3\2\2\2jk\5\n\6\2kl\7" +
                    "F\2\2l\u008b\3\2\2\2m\u008b\5<\37\2n\u008b\5\24\13\2op\5\34\17\2pq\7F" +
                    "\2\2q\u008b\3\2\2\2rs\5\66\34\2st\7F\2\2t\u008b\3\2\2\2uv\5,\27\2vw\7" +
                    "F\2\2w\u008b\3\2\2\2xy\5\60\31\2yz\7F\2\2z\u008b\3\2\2\2{|\5.\30\2|}\7" +
                    "F\2\2}\u008b\3\2\2\2~\177\5\62\32\2\177\u0080\7F\2\2\u0080\u008b\3\2\2" +
                    "\2\u0081\u0082\5\26\f\2\u0082\u0083\7F\2\2\u0083\u008b\3\2\2\2\u0084\u0085" +
                    "\5\30\r\2\u0085\u0086\7F\2\2\u0086\u008b\3\2\2\2\u0087\u0088\5\32\16\2" +
                    "\u0088\u0089\7F\2\2\u0089\u008b\3\2\2\2\u008aV\3\2\2\2\u008aY\3\2\2\2" +
                    "\u008a\\\3\2\2\2\u008a]\3\2\2\2\u008a^\3\2\2\2\u008a_\3\2\2\2\u008ab\3" +
                    "\2\2\2\u008ac\3\2\2\2\u008ad\3\2\2\2\u008ag\3\2\2\2\u008aj\3\2\2\2\u008a" +
                    "m\3\2\2\2\u008an\3\2\2\2\u008ao\3\2\2\2\u008ar\3\2\2\2\u008au\3\2\2\2" +
                    "\u008ax\3\2\2\2\u008a{\3\2\2\2\u008a~\3\2\2\2\u008a\u0081\3\2\2\2\u008a" +
                    "\u0084\3\2\2\2\u008a\u0087\3\2\2\2\u008b\7\3\2\2\2\u008c\u008d\7\27\2" +
                    "\2\u008d\u008f\7M\2\2\u008e\u0090\5D#\2\u008f\u008e\3\2\2\2\u008f\u0090" +
                    "\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\7G\2\2\u0092\u0093\5@!\2\u0093" +
                    "\t\3\2\2\2\u0094\u0096\7M\2\2\u0095\u0097\5D#\2\u0096\u0095\3\2\2\2\u0096" +
                    "\u0097\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\7G\2\2\u0099\u009a\5@!" +
                    "\2\u009a\13\3\2\2\2\u009b\u009c\7M\2\2\u009c\u009e\7D\2\2\u009d\u009f" +
                    "\5> \2\u009e\u009d\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0" +
                    "\u00bc\7E\2\2\u00a1\u00a2\7\21\2\2\u00a2\u00a4\7D\2\2\u00a3\u00a5\5@!" +
                    "\2\u00a4\u00a3\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00bc" +
                    "\7E\2\2\u00a7\u00a8\7\32\2\2\u00a8\u00a9\7D\2\2\u00a9\u00aa\5@!\2\u00aa" +
                    "\u00ab\7E\2\2\u00ab\u00bc\3\2\2\2\u00ac\u00ad\7\34\2\2\u00ad\u00ae\7D" +
                    "\2\2\u00ae\u00af\5@!\2\u00af\u00b0\7E\2\2\u00b0\u00bc\3\2\2\2\u00b1\u00b2" +
                    "\7\36\2\2\u00b2\u00b3\7D\2\2\u00b3\u00b4\5@!\2\u00b4\u00b5\7E\2\2\u00b5" +
                    "\u00bc\3\2\2\2\u00b6\u00b7\7 \2\2\u00b7\u00b8\7D\2\2\u00b8\u00b9\5@!\2" +
                    "\u00b9\u00ba\7E\2\2\u00ba\u00bc\3\2\2\2\u00bb\u009b\3\2\2\2\u00bb\u00a1" +
                    "\3\2\2\2\u00bb\u00a7\3\2\2\2\u00bb\u00ac\3\2\2\2\u00bb\u00b1\3\2\2\2\u00bb" +
                    "\u00b6\3\2\2\2\u00bc\r\3\2\2\2\u00bd\u00c1\5\20\t\2\u00be\u00c0\5\22\n" +
                    "\2\u00bf\u00be\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2" +
                    "\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c6\5\36\20\2" +
                    "\u00c5\u00c4\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8" +
                    "\7*\2\2\u00c8\17\3\2\2\2\u00c9\u00ca\7#\2\2\u00ca\u00cb\7D\2\2\u00cb\u00cc" +
                    "\5@!\2\u00cc\u00cd\7E\2\2\u00cd\u00ce\7)\2\2\u00ce\u00cf\5\4\3\2\u00cf" +
                    "\21\3\2\2\2\u00d0\u00d1\7$\2\2\u00d1\u00d2\7#\2\2\u00d2\u00d3\7D\2\2\u00d3" +
                    "\u00d4\5@!\2\u00d4\u00d5\7E\2\2\u00d5\u00d6\7)\2\2\u00d6\u00d7\5\4\3\2" +
                    "\u00d7\23\3\2\2\2\u00d8\u00d9\7\3\2\2\u00d9\u00da\7M\2\2\u00da\u00db\7" +
                    "\4\2\2\u00db\u00df\7D\2\2\u00dc\u00de\5D#\2\u00dd\u00dc\3\2\2\2\u00de" +
                    "\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e2\3\2" +
                    "\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e3\7E\2\2\u00e3\u00e4\5\4\3\2\u00e4" +
                    "\u00e5\7*\2\2\u00e5\25\3\2\2\2\u00e6\u00e7\7\5\2\2\u00e7\u00e8\7M\2\2" +
                    "\u00e8\u00e9\7G\2\2\u00e9\u00ea\7\6\2\2\u00ea\u00eb\7D\2\2\u00eb\u00ec" +
                    "\5@!\2\u00ec\u00ed\7E\2\2\u00ed\27\3\2\2\2\u00ee\u00ef\7M\2\2\u00ef\u00f0" +
                    "\7\7\2\2\u00f0\u00f1\7\b\2\2\u00f1\u00f2\7D\2\2\u00f2\u00f3\5@!\2\u00f3" +
                    "\u00f4\7E\2\2\u00f4\31\3\2\2\2\u00f5\u00f6\7\t\2\2\u00f6\u00f7\7D\2\2" +
                    "\u00f7\u00f8\5@!\2\u00f8\u00f9\7E\2\2\u00f9\33\3\2\2\2\u00fa\u00fb\7M" +
                    "\2\2\u00fb\u00fc\7\n\2\2\u00fc\u00fd\7D\2\2\u00fd\u00fe\7E\2\2\u00fe\35" +
                    "\3\2\2\2\u00ff\u0100\7$\2\2\u0100\u0101\7)\2\2\u0101\u0102\5\4\3\2\u0102" +
                    "\37\3\2\2\2\u0103\u0104\7\37\2\2\u0104\u0105\7M\2\2\u0105\u0107\7D\2\2" +
                    "\u0106\u0108\5:\36\2\u0107\u0106\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0109" +
                    "\3\2\2\2\u0109\u010a\7E\2\2\u010a\u010b\5\4\3\2\u010b\u010c\7*\2\2\u010c" +
                    "!\3\2\2\2\u010d\u010e\7&\2\2\u010e\u010f\7M\2\2\u010f\u0110\7G\2\2\u0110" +
                    "\u0111\5@!\2\u0111\u0112\7(\2\2\u0112\u0113\5@!\2\u0113\u0114\7)\2\2\u0114" +
                    "\u0115\5\4\3\2\u0115\u0116\7*\2\2\u0116#\3\2\2\2\u0117\u0118\7\13\2\2" +
                    "\u0118\u0119\7\31\2\2\u0119\u011e\7M\2\2\u011a\u011b\7\7\2\2\u011b\u011d" +
                    "\7M\2\2\u011c\u011a\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e" +
                    "\u011f\3\2\2\2\u011f%\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0122\7-\2\2\u0122" +
                    "\u0123\5\4\3\2\u0123\u0124\7.\2\2\u0124\u0125\7D\2\2\u0125\u0126\7M\2" +
                    "\2\u0126\u0127\7E\2\2\u0127\u0128\5\4\3\2\u0128\u0129\7*\2\2\u0129\'\3" +
                    "\2\2\2\u012a\u012b\7\'\2\2\u012b\u012c\7D\2\2\u012c\u012d\5@!\2\u012d" +
                    "\u012e\7E\2\2\u012e\u012f\7)\2\2\u012f\u0130\5\4\3\2\u0130\u0131\7*\2" +
                    "\2\u0131)\3\2\2\2\u0132\u0133\7\f\2\2\u0133\u0134\7D\2\2\u0134\u0135\5" +
                    "@!\2\u0135\u0136\7E\2\2\u0136+\3\2\2\2\u0137\u0138\7\r\2\2\u0138\u0139" +
                    "\7M\2\2\u0139\u013a\7G\2\2\u013a\u013b\7\26\2\2\u013b\u013c\7D\2\2\u013c" +
                    "\u013d\5> \2\u013d\u013e\7E\2\2\u013e-\3\2\2\2\u013f\u0140\7M\2\2\u0140" +
                    "\u0141\7\7\2\2\u0141\u0142\7\23\2\2\u0142\u0143\7D\2\2\u0143\u0144\7E" +
                    "\2\2\u0144/\3\2\2\2\u0145\u0146\7M\2\2\u0146\u0147\7\7\2\2\u0147\u0148" +
                    "\7\24\2\2\u0148\u0149\7D\2\2\u0149\u014a\5@!\2\u014a\u014b\7E\2\2\u014b" +
                    "\61\3\2\2\2\u014c\u014d\7\22\2\2\u014d\u014e\7M\2\2\u014e\u014f\7G\2\2" +
                    "\u014f\u0150\7\16\2\2\u0150\u0151\7D\2\2\u0151\u0152\5> \2\u0152\u0153" +
                    "\7E\2\2\u0153\63\3\2\2\2\u0154\u0155\7\30\2\2\u0155\u0156\7D\2\2\u0156" +
                    "\u0157\5@!\2\u0157\u0158\7E\2\2\u0158\65\3\2\2\2\u0159\u015a\7\35\2\2" +
                    "\u015a\u015b\7D\2\2\u015b\u015c\5@!\2\u015c\u015d\7E\2\2\u015d\67\3\2" +
                    "\2\2\u015e\u015f\7\17\2\2\u015f\u0160\5\4\3\2\u0160\u0161\7*\2\2\u0161" +
                    "9\3\2\2\2\u0162\u0167\7M\2\2\u0163\u0164\7H\2\2\u0164\u0166\7M\2\2\u0165" +
                    "\u0163\3\2\2\2\u0166\u0169\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0168\3\2" +
                    "\2\2\u0168;\3\2\2\2\u0169\u0167\3\2\2\2\u016a\u016b\7/\2\2\u016b\u016c" +
                    "\7M\2\2\u016c\u016d\5\4\3\2\u016d\u016e\7\20\2\2\u016e=\3\2\2\2\u016f" +
                    "\u0174\5@!\2\u0170\u0171\7H\2\2\u0171\u0173\5@!\2\u0172\u0170\3\2\2\2" +
                    "\u0173\u0176\3\2\2\2\u0174\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175?\3" +
                    "\2\2\2\u0176\u0174\3\2\2\2\u0177\u0178\b!\1\2\u0178\u0179\7<\2\2\u0179" +
                    "\u019c\5@!\26\u017a\u017b\78\2\2\u017b\u019c\5@!\25\u017c\u019c\7L\2\2" +
                    "\u017d\u019c\7K\2\2\u017e\u019c\7,\2\2\u017f\u0181\5\f\7\2\u0180\u0182" +
                    "\5D#\2\u0181\u0180\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u019c\3\2\2\2\u0183" +
                    "\u0185\5B\"\2\u0184\u0186\5D#\2\u0185\u0184\3\2\2\2\u0185\u0186\3\2\2" +
                    "\2\u0186\u019c\3\2\2\2\u0187\u0189\7M\2\2\u0188\u018a\5D#\2\u0189\u0188" +
                    "\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u019c\3\2\2\2\u018b\u018d\7N\2\2\u018c" +
                    "\u018e\5D#\2\u018d\u018c\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u019c\3\2\2" +
                    "\2\u018f\u0190\7D\2\2\u0190\u0191\5@!\2\u0191\u0193\7E\2\2\u0192\u0194" +
                    "\5D#\2\u0193\u0192\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u019c\3\2\2\2\u0195" +
                    "\u0196\7\33\2\2\u0196\u0198\7D\2\2\u0197\u0199\7N\2\2\u0198\u0197\3\2" +
                    "\2\2\u0198\u0199\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019c\7E\2\2\u019b" +
                    "\u0177\3\2\2\2\u019b\u017a\3\2\2\2\u019b\u017c\3\2\2\2\u019b\u017d\3\2" +
                    "\2\2\u019b\u017e\3\2\2\2\u019b\u017f\3\2\2\2\u019b\u0183\3\2\2\2\u019b" +
                    "\u0187\3\2\2\2\u019b\u018b\3\2\2\2\u019b\u018f\3\2\2\2\u019b\u0195\3\2" +
                    "\2\2\u019c\u01bd\3\2\2\2\u019d\u019e\f\24\2\2\u019e\u019f\7\67\2\2\u019f" +
                    "\u01bc\5@!\24\u01a0\u01a1\f\23\2\2\u01a1\u01a2\t\2\2\2\u01a2\u01bc\5@" +
                    "!\24\u01a3\u01a4\f\22\2\2\u01a4\u01a5\t\3\2\2\u01a5\u01bc\5@!\23\u01a6" +
                    "\u01a7\f\21\2\2\u01a7\u01a8\t\4\2\2\u01a8\u01bc\5@!\22\u01a9\u01aa\f\20" +
                    "\2\2\u01aa\u01ab\t\5\2\2\u01ab\u01bc\5@!\21\u01ac\u01ad\f\17\2\2\u01ad" +
                    "\u01ae\7\62\2\2\u01ae\u01bc\5@!\20\u01af\u01b0\f\16\2\2\u01b0\u01b1\7" +
                    "\61\2\2\u01b1\u01bc\5@!\17\u01b2\u01b3\f\r\2\2\u01b3\u01b4\7I\2\2\u01b4" +
                    "\u01b5\5@!\2\u01b5\u01b6\7J\2\2\u01b6\u01b7\5@!\16\u01b7\u01bc\3\2\2\2" +
                    "\u01b8\u01b9\f\f\2\2\u01b9\u01ba\7+\2\2\u01ba\u01bc\5@!\r\u01bb\u019d" +
                    "\3\2\2\2\u01bb\u01a0\3\2\2\2\u01bb\u01a3\3\2\2\2\u01bb\u01a6\3\2\2\2\u01bb" +
                    "\u01a9\3\2\2\2\u01bb\u01ac\3\2\2\2\u01bb\u01af\3\2\2\2\u01bb\u01b2\3\2" +
                    "\2\2\u01bb\u01b8\3\2\2\2\u01bc\u01bf\3\2\2\2\u01bd\u01bb\3\2\2\2\u01bd" +
                    "\u01be\3\2\2\2\u01beA\3\2\2\2\u01bf\u01bd\3\2\2\2\u01c0\u01c2\7B\2\2\u01c1" +
                    "\u01c3\5> \2\u01c2\u01c1\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c4\3\2\2" +
                    "\2\u01c4\u01c5\7C\2\2\u01c5C\3\2\2\2\u01c6\u01c7\7B\2\2\u01c7\u01c8\5" +
                    "@!\2\u01c8\u01c9\7C\2\2\u01c9\u01cb\3\2\2\2\u01ca\u01c6\3\2\2\2\u01cb" +
                    "\u01cc\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cdE\3\2\2\2" +
                    "\35KMT\u008a\u008f\u0096\u009e\u00a4\u00bb\u00c1\u00c5\u00df\u0107\u011e" +
                    "\u0167\u0174\u0181\u0185\u0189\u018d\u0193\u0198\u019b\u01bb\u01bd\u01c2" +
                    "\u01cc";
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
                "ifStatement", "ifStat", "elseIfStat", "constructorStatement", "fileObjectInitializeStatement",
                "fileWriteStatement", "verifyFileStatement", "defaultCall", "elseStat",
                "functionDecl", "forStatement", "importStatement", "tryCatchStatement",
                "whileStatement", "webServerStatement", "windowCreateStatement", "windowRenderStatement",
                "windowAddCompStatement", "componentCreateStatement", "addWebServerTextStatement",
                "waitStatement", "mainFunctionStatement", "idList", "classStatement",
                "exprList", "expression", "list", "indexes"
        };
    }

    private static String[] makeLiteralNames() {
        return new String[]{
                null, "'$'", "'void default'", "'File'", "'new File'", "'.'", "'append'",
                "'verify'", "'.default'", "'#'", "'create WebServer'", "'Window'", "'new Component'",
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
                null, null, null, null, null, null, null, null, null, null, null, null,
                null, null, null, "Println", "Component", "Render", "AddComponent", "New",
                "Window", "Var", "AddWSText", "Import", "Print", "Input", "Assert", "Wait",
                "Size", "Def", "ToInt", "Create", "WebServer", "If", "Else", "Return",
                "For", "While", "To", "Do", "End", "In", "Null", "Try", "Catch", "Class",
                "CreateClass", "Or", "And", "Equals", "NEquals", "GTEquals", "LTEquals",
                "Pow", "Excl", "GT", "LT", "Add", "Subtract", "Multiply", "Divide", "Modulus",
                "OBrace", "CBrace", "OBracket", "CBracket", "OParen", "CParen", "SColon",
                "Assign", "Comma", "QMark", "Colon", "Bool", "Number", "Identifier",
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
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(68);
                block();
                setState(69);
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
                setState(75);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__12) | (1L << Println) | (1L << Component) | (1L << Var) | (1L << AddWSText) | (1L << Print) | (1L << Assert) | (1L << Wait) | (1L << Size) | (1L << Def) | (1L << ToInt) | (1L << If) | (1L << For) | (1L << While) | (1L << Try) | (1L << Class))) != 0) || _la == Identifier) {
                    {
                        setState(73);
                        _errHandler.sync(this);
                        switch (_input.LA(1)) {
                            case T__0:
                            case T__2:
                            case T__6:
                            case T__8:
                            case T__9:
                            case T__10:
                            case T__12:
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
                                setState(71);
                                statement();
                            }
                            break;
                            case Def: {
                                setState(72);
                                functionDecl();
                            }
                            break;
                            default:
                                throw new NoViableAltException(this);
                        }
                    }
                    setState(77);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(82);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == Return) {
                    {
                        setState(78);
                        match(Return);
                        setState(79);
                        expression(0);
                        setState(80);
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
            setState(136);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 3, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(84);
                    assignment();
                    setState(85);
                    match(SColon);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(87);
                    functionCall();
                    setState(88);
                    match(SColon);
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(90);
                    ifStatement();
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(91);
                    forStatement();
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(92);
                    whileStatement();
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(93);
                    importStatement();
                    setState(94);
                    match(SColon);
                }
                break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(96);
                    tryCatchStatement();
                }
                break;
                case 8:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(97);
                    mainFunctionStatement();
                }
                break;
                case 9:
                    enterOuterAlt(_localctx, 9);
                {
                    setState(98);
                    webServerStatement();
                    setState(99);
                    match(SColon);
                }
                break;
                case 10:
                    enterOuterAlt(_localctx, 10);
                {
                    setState(101);
                    addWebServerTextStatement();
                    setState(102);
                    match(SColon);
                }
                break;
                case 11:
                    enterOuterAlt(_localctx, 11);
                {
                    setState(104);
                    reAssignment();
                    setState(105);
                    match(SColon);
                }
                break;
                case 12:
                    enterOuterAlt(_localctx, 12);
                {
                    setState(107);
                    classStatement();
                }
                break;
                case 13:
                    enterOuterAlt(_localctx, 13);
                {
                    setState(108);
                    constructorStatement();
                }
                break;
                case 14:
                    enterOuterAlt(_localctx, 14);
                {
                    setState(109);
                    defaultCall();
                    setState(110);
                    match(SColon);
                }
                break;
                case 15:
                    enterOuterAlt(_localctx, 15);
                {
                    setState(112);
                    waitStatement();
                    setState(113);
                    match(SColon);
                }
                break;
                case 16:
                    enterOuterAlt(_localctx, 16);
                {
                    setState(115);
                    windowCreateStatement();
                    setState(116);
                    match(SColon);
                }
                break;
                case 17:
                    enterOuterAlt(_localctx, 17);
                {
                    setState(118);
                    windowAddCompStatement();
                    setState(119);
                    match(SColon);
                }
                break;
                case 18:
                    enterOuterAlt(_localctx, 18);
                {
                    setState(121);
                    windowRenderStatement();
                    setState(122);
                    match(SColon);
                }
                break;
                case 19:
                    enterOuterAlt(_localctx, 19);
                {
                    setState(124);
                    componentCreateStatement();
                    setState(125);
                    match(SColon);
                }
                break;
                case 20:
                    enterOuterAlt(_localctx, 20);
                {
                    setState(127);
                    fileObjectInitializeStatement();
                    setState(128);
                    match(SColon);
                }
                break;
                case 21:
                    enterOuterAlt(_localctx, 21);
                {
                    setState(130);
                    fileWriteStatement();
                    setState(131);
                    match(SColon);
                }
                break;
                case 22:
                    enterOuterAlt(_localctx, 22);
                {
                    setState(133);
                    verifyFileStatement();
                    setState(134);
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
                setState(138);
                match(Var);
                setState(139);
                match(Identifier);
                setState(141);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == OBracket) {
                    {
                        setState(140);
                        indexes();
                    }
                }

                setState(143);
                match(Assign);
                setState(144);
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
                setState(146);
                match(Identifier);
                setState(148);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == OBracket) {
                    {
                        setState(147);
                        indexes();
                    }
                }

                setState(150);
                match(Assign);
                setState(151);
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
            setState(185);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case Identifier:
                    _localctx = new IdentifierFunctionCallContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(153);
                    match(Identifier);
                    setState(154);
                    match(OParen);
                    setState(156);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (((((_la - 15)) & ~0x3f) == 0 && ((1L << (_la - 15)) & ((1L << (Println - 15)) | (1L << (Print - 15)) | (1L << (Input - 15)) | (1L << (Assert - 15)) | (1L << (Size - 15)) | (1L << (ToInt - 15)) | (1L << (Null - 15)) | (1L << (Excl - 15)) | (1L << (Subtract - 15)) | (1L << (OBracket - 15)) | (1L << (OParen - 15)) | (1L << (Bool - 15)) | (1L << (Number - 15)) | (1L << (Identifier - 15)) | (1L << (String - 15)))) != 0)) {
                        {
                            setState(155);
                            exprList();
                        }
                    }

                    setState(158);
                    match(CParen);
                }
                break;
                case Println:
                    _localctx = new PrintlnFunctionCallContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(159);
                    match(Println);
                    setState(160);
                    match(OParen);
                    setState(162);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (((((_la - 15)) & ~0x3f) == 0 && ((1L << (_la - 15)) & ((1L << (Println - 15)) | (1L << (Print - 15)) | (1L << (Input - 15)) | (1L << (Assert - 15)) | (1L << (Size - 15)) | (1L << (ToInt - 15)) | (1L << (Null - 15)) | (1L << (Excl - 15)) | (1L << (Subtract - 15)) | (1L << (OBracket - 15)) | (1L << (OParen - 15)) | (1L << (Bool - 15)) | (1L << (Number - 15)) | (1L << (Identifier - 15)) | (1L << (String - 15)))) != 0)) {
                        {
                            setState(161);
                            expression(0);
                        }
                    }

                    setState(164);
                    match(CParen);
                }
                break;
                case Print:
                    _localctx = new PrintFunctionCallContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(165);
                    match(Print);
                    setState(166);
                    match(OParen);
                    setState(167);
                    expression(0);
                    setState(168);
                    match(CParen);
                }
                break;
                case Assert:
                    _localctx = new AssertFunctionCallContext(_localctx);
                    enterOuterAlt(_localctx, 4);
                {
                    setState(170);
                    match(Assert);
                    setState(171);
                    match(OParen);
                    setState(172);
                    expression(0);
                    setState(173);
                    match(CParen);
                }
                break;
                case Size:
                    _localctx = new SizeFunctionCallContext(_localctx);
                    enterOuterAlt(_localctx, 5);
                {
                    setState(175);
                    match(Size);
                    setState(176);
                    match(OParen);
                    setState(177);
                    expression(0);
                    setState(178);
                    match(CParen);
                }
                break;
                case ToInt:
                    _localctx = new ToIntFunctionCallContext(_localctx);
                    enterOuterAlt(_localctx, 6);
                {
                    setState(180);
                    match(ToInt);
                    setState(181);
                    match(OParen);
                    setState(182);
                    expression(0);
                    setState(183);
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
                setState(187);
                ifStat();
                setState(191);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 9, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(188);
                                elseIfStat();
                            }
                        }
                    }
                    setState(193);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 9, _ctx);
                }
                setState(195);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == Else) {
                    {
                        setState(194);
                        elseStat();
                    }
                }

                setState(197);
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
                setState(199);
                match(If);
                setState(200);
                match(OParen);
                setState(201);
                expression(0);
                setState(202);
                match(CParen);
                setState(203);
                match(Do);
                setState(204);
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
                setState(206);
                match(Else);
                setState(207);
                match(If);
                setState(208);
                match(OParen);
                setState(209);
                expression(0);
                setState(210);
                match(CParen);
                setState(211);
                match(Do);
                setState(212);
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
                setState(214);
                match(T__0);
                setState(215);
                match(Identifier);
                setState(216);
                match(T__1);
                setState(217);
                match(OParen);
                setState(221);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == OBracket) {
                    {
                        {
                            setState(218);
                            indexes();
                        }
                    }
                    setState(223);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(224);
                match(CParen);
                setState(225);
                block();
                setState(226);
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

    public final FileObjectInitializeStatementContext fileObjectInitializeStatement() throws RecognitionException {
        FileObjectInitializeStatementContext _localctx = new FileObjectInitializeStatementContext(_ctx, getState());
        enterRule(_localctx, 20, RULE_fileObjectInitializeStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(228);
                match(T__2);
                setState(229);
                match(Identifier);
                setState(230);
                match(Assign);
                setState(231);
                match(T__3);
                setState(232);
                match(OParen);
                setState(233);
                expression(0);
                setState(234);
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
        enterRule(_localctx, 22, RULE_fileWriteStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(236);
                match(Identifier);
                setState(237);
                match(T__4);
                setState(238);
                match(T__5);
                setState(239);
                match(OParen);
                setState(240);
                expression(0);
                setState(241);
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
        enterRule(_localctx, 24, RULE_verifyFileStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(243);
                match(T__6);
                setState(244);
                match(OParen);
                setState(245);
                expression(0);
                setState(246);
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
        enterRule(_localctx, 26, RULE_defaultCall);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(248);
                match(Identifier);
                setState(249);
                match(T__7);
                setState(250);
                match(OParen);
                setState(251);
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
        enterRule(_localctx, 28, RULE_elseStat);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(253);
                match(Else);
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

    public final FunctionDeclContext functionDecl() throws RecognitionException {
        FunctionDeclContext _localctx = new FunctionDeclContext(_ctx, getState());
        enterRule(_localctx, 30, RULE_functionDecl);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(257);
                match(Def);
                setState(258);
                match(Identifier);
                setState(259);
                match(OParen);
                setState(261);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == Identifier) {
                    {
                        setState(260);
                        idList();
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

    public final ForStatementContext forStatement() throws RecognitionException {
        ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
        enterRule(_localctx, 32, RULE_forStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(267);
                match(For);
                setState(268);
                match(Identifier);
                setState(269);
                match(Assign);
                setState(270);
                expression(0);
                setState(271);
                match(To);
                setState(272);
                expression(0);
                setState(273);
                match(Do);
                setState(274);
                block();
                setState(275);
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
        enterRule(_localctx, 34, RULE_importStatement);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(277);
                match(T__8);
                setState(278);
                match(Import);
                setState(279);
                match(Identifier);
                setState(284);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__4) {
                    {
                        {
                            setState(280);
                            match(T__4);
                            setState(281);
                            match(Identifier);
                        }
                    }
                    setState(286);
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
        enterRule(_localctx, 36, RULE_tryCatchStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(287);
                match(Try);
                setState(288);
                block();
                setState(289);
                match(Catch);
                setState(290);
                match(OParen);
                setState(291);
                match(Identifier);
                setState(292);
                match(CParen);
                setState(293);
                block();
                setState(294);
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
        enterRule(_localctx, 38, RULE_whileStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(296);
                match(While);
                setState(297);
                match(OParen);
                setState(298);
                expression(0);
                setState(299);
                match(CParen);
                setState(300);
                match(Do);
                setState(301);
                block();
                setState(302);
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
        enterRule(_localctx, 40, RULE_webServerStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(304);
                match(T__9);
                setState(305);
                match(OParen);
                setState(306);
                expression(0);
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

    public final WindowCreateStatementContext windowCreateStatement() throws RecognitionException {
        WindowCreateStatementContext _localctx = new WindowCreateStatementContext(_ctx, getState());
        enterRule(_localctx, 42, RULE_windowCreateStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(309);
                match(T__10);
                setState(310);
                match(Identifier);
                setState(311);
                match(Assign);
                setState(312);
                match(Window);
                setState(313);
                match(OParen);
                setState(314);
                exprList();
                setState(315);
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
        enterRule(_localctx, 44, RULE_windowRenderStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(317);
                match(Identifier);
                setState(318);
                match(T__4);
                setState(319);
                match(Render);
                setState(320);
                match(OParen);
                setState(321);
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
        enterRule(_localctx, 46, RULE_windowAddCompStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(323);
                match(Identifier);
                setState(324);
                match(T__4);
                setState(325);
                match(AddComponent);
                setState(326);
                match(OParen);
                setState(327);
                expression(0);
                setState(328);
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
        enterRule(_localctx, 48, RULE_componentCreateStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(330);
                match(Component);
                setState(331);
                match(Identifier);
                setState(332);
                match(Assign);
                setState(333);
                match(T__11);
                setState(334);
                match(OParen);
                setState(335);
                exprList();
                setState(336);
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
        enterRule(_localctx, 50, RULE_addWebServerTextStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(338);
                match(AddWSText);
                setState(339);
                match(OParen);
                setState(340);
                expression(0);
                setState(341);
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
        enterRule(_localctx, 52, RULE_waitStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(343);
                match(Wait);
                setState(344);
                match(OParen);
                setState(345);
                expression(0);
                setState(346);
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
        enterRule(_localctx, 54, RULE_mainFunctionStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(348);
                match(T__12);
                setState(349);
                block();
                setState(350);
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
        enterRule(_localctx, 56, RULE_idList);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(352);
                match(Identifier);
                setState(357);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == Comma) {
                    {
                        {
                            setState(353);
                            match(Comma);
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

    public final ClassStatementContext classStatement() throws RecognitionException {
        ClassStatementContext _localctx = new ClassStatementContext(_ctx, getState());
        enterRule(_localctx, 58, RULE_classStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(360);
                match(Class);
                setState(361);
                match(Identifier);
                setState(362);
                block();
                setState(363);
                match(T__13);
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
        enterRule(_localctx, 60, RULE_exprList);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(365);
                expression(0);
                setState(370);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == Comma) {
                    {
                        {
                            setState(366);
                            match(Comma);
                            setState(367);
                            expression(0);
                        }
                    }
                    setState(372);
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
        int _startState = 62;
        enterRecursionRule(_localctx, 62, RULE_expression, _p);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(409);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 22, _ctx)) {
                    case 1: {
                        _localctx = new UnaryMinusExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;

                        setState(374);
                        match(Subtract);
                        setState(375);
                        expression(20);
                    }
                    break;
                    case 2: {
                        _localctx = new NotExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(376);
                        match(Excl);
                        setState(377);
                        expression(19);
                    }
                    break;
                    case 3: {
                        _localctx = new NumberExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(378);
                        match(Number);
                    }
                    break;
                    case 4: {
                        _localctx = new BoolExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(379);
                        match(Bool);
                    }
                    break;
                    case 5: {
                        _localctx = new NullExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(380);
                        match(Null);
                    }
                    break;
                    case 6: {
                        _localctx = new FunctionCallExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(381);
                        functionCall();
                        setState(383);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 16, _ctx)) {
                            case 1: {
                                setState(382);
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
                        setState(385);
                        list();
                        setState(387);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 17, _ctx)) {
                            case 1: {
                                setState(386);
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
                        setState(389);
                        match(Identifier);
                        setState(391);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 18, _ctx)) {
                            case 1: {
                                setState(390);
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
                        setState(393);
                        match(String);
                        setState(395);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 19, _ctx)) {
                            case 1: {
                                setState(394);
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
                        setState(397);
                        match(OParen);
                        setState(398);
                        expression(0);
                        setState(399);
                        match(CParen);
                        setState(401);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 20, _ctx)) {
                            case 1: {
                                setState(400);
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
                        setState(403);
                        match(Input);
                        setState(404);
                        match(OParen);
                        setState(406);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == String) {
                            {
                                setState(405);
                                match(String);
                            }
                        }

                        setState(408);
                        match(CParen);
                    }
                    break;
                }
                _ctx.stop = _input.LT(-1);
                setState(443);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 24, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(441);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 23, _ctx)) {
                                case 1: {
                                    _localctx = new PowerExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(411);
                                    if (!(precpred(_ctx, 18)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 18)");
                                    setState(412);
                                    match(Pow);
                                    setState(413);
                                    expression(18);
                                }
                                break;
                                case 2: {
                                    _localctx = new MultExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(414);
                                    if (!(precpred(_ctx, 17)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 17)");
                                    setState(415);
                                    ((MultExpressionContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Multiply) | (1L << Divide) | (1L << Modulus))) != 0))) {
                                        ((MultExpressionContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(416);
                                    expression(18);
                                }
                                break;
                                case 3: {
                                    _localctx = new AddExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(417);
                                    if (!(precpred(_ctx, 16)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 16)");
                                    setState(418);
                                    ((AddExpressionContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!(_la == Add || _la == Subtract)) {
                                        ((AddExpressionContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(419);
                                    expression(17);
                                }
                                break;
                                case 4: {
                                    _localctx = new CompExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(420);
                                    if (!(precpred(_ctx, 15)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 15)");
                                    setState(421);
                                    ((CompExpressionContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GTEquals) | (1L << LTEquals) | (1L << GT) | (1L << LT))) != 0))) {
                                        ((CompExpressionContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(422);
                                    expression(16);
                                }
                                break;
                                case 5: {
                                    _localctx = new EqExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(423);
                                    if (!(precpred(_ctx, 14)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 14)");
                                    setState(424);
                                    ((EqExpressionContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!(_la == Equals || _la == NEquals)) {
                                        ((EqExpressionContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(425);
                                    expression(15);
                                }
                                break;
                                case 6: {
                                    _localctx = new AndExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(426);
                                    if (!(precpred(_ctx, 13)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 13)");
                                    setState(427);
                                    match(And);
                                    setState(428);
                                    expression(14);
                                }
                                break;
                                case 7: {
                                    _localctx = new OrExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(429);
                                    if (!(precpred(_ctx, 12)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 12)");
                                    setState(430);
                                    match(Or);
                                    setState(431);
                                    expression(13);
                                }
                                break;
                                case 8: {
                                    _localctx = new TernaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(432);
                                    if (!(precpred(_ctx, 11)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 11)");
                                    setState(433);
                                    match(QMark);
                                    setState(434);
                                    expression(0);
                                    setState(435);
                                    match(Colon);
                                    setState(436);
                                    expression(12);
                                }
                                break;
                                case 9: {
                                    _localctx = new InExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(438);
                                    if (!(precpred(_ctx, 10)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 10)");
                                    setState(439);
                                    match(In);
                                    setState(440);
                                    expression(11);
                                }
                                break;
                            }
                        }
                    }
                    setState(445);
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
        enterRule(_localctx, 64, RULE_list);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(446);
                match(OBracket);
                setState(448);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (((((_la - 15)) & ~0x3f) == 0 && ((1L << (_la - 15)) & ((1L << (Println - 15)) | (1L << (Print - 15)) | (1L << (Input - 15)) | (1L << (Assert - 15)) | (1L << (Size - 15)) | (1L << (ToInt - 15)) | (1L << (Null - 15)) | (1L << (Excl - 15)) | (1L << (Subtract - 15)) | (1L << (OBracket - 15)) | (1L << (OParen - 15)) | (1L << (Bool - 15)) | (1L << (Number - 15)) | (1L << (Identifier - 15)) | (1L << (String - 15)))) != 0)) {
                    {
                        setState(447);
                        exprList();
                    }
                }

                setState(450);
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
        enterRule(_localctx, 66, RULE_indexes);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(456);
                _errHandler.sync(this);
                _alt = 1;
                do {
                    switch (_alt) {
                        case 1: {
                            {
                                setState(452);
                                match(OBracket);
                                setState(453);
                                expression(0);
                                setState(454);
                                match(CBracket);
                            }
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                    setState(458);
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
            case 31:
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

        public FileObjectInitializeStatementContext fileObjectInitializeStatement() {
            return getRuleContext(FileObjectInitializeStatementContext.class, 0);
        }

        public FileWriteStatementContext fileWriteStatement() {
            return getRuleContext(FileWriteStatementContext.class, 0);
        }

        public VerifyFileStatementContext verifyFileStatement() {
            return getRuleContext(VerifyFileStatementContext.class, 0);
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

    public static class FileObjectInitializeStatementContext extends ParserRuleContext {
        public FileObjectInitializeStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Identifier() {
            return getToken(QParser.Identifier, 0);
        }

        public TerminalNode Assign() {
            return getToken(QParser.Assign, 0);
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
            return RULE_fileObjectInitializeStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterFileObjectInitializeStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitFileObjectInitializeStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor)
                return ((QVisitor<? extends T>) visitor).visitFileObjectInitializeStatement(this);
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

    public static class WebServerStatementContext extends ParserRuleContext {
        public WebServerStatementContext(ParserRuleContext parent, int invokingState) {
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
            return RULE_webServerStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterWebServerStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitWebServerStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitWebServerStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class WindowCreateStatementContext extends ParserRuleContext {
        public WindowCreateStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Identifier() {
            return getToken(QParser.Identifier, 0);
        }

        public TerminalNode Assign() {
            return getToken(QParser.Assign, 0);
        }

        public TerminalNode Window() {
            return getToken(QParser.Window, 0);
        }

        public TerminalNode OParen() {
            return getToken(QParser.OParen, 0);
        }

        public ExprListContext exprList() {
            return getRuleContext(ExprListContext.class, 0);
        }

        public TerminalNode CParen() {
            return getToken(QParser.CParen, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_windowCreateStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterWindowCreateStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitWindowCreateStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitWindowCreateStatement(this);
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

    public static class ComponentCreateStatementContext extends ParserRuleContext {
        public ComponentCreateStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Component() {
            return getToken(QParser.Component, 0);
        }

        public TerminalNode Identifier() {
            return getToken(QParser.Identifier, 0);
        }

        public TerminalNode Assign() {
            return getToken(QParser.Assign, 0);
        }

        public TerminalNode OParen() {
            return getToken(QParser.OParen, 0);
        }

        public ExprListContext exprList() {
            return getRuleContext(ExprListContext.class, 0);
        }

        public TerminalNode CParen() {
            return getToken(QParser.CParen, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_componentCreateStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterComponentCreateStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitComponentCreateStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor)
                return ((QVisitor<? extends T>) visitor).visitComponentCreateStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class AddWebServerTextStatementContext extends ParserRuleContext {
        public AddWebServerTextStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode AddWSText() {
            return getToken(QParser.AddWSText, 0);
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

    public static class WaitStatementContext extends ParserRuleContext {
        public WaitStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Wait() {
            return getToken(QParser.Wait, 0);
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
            return RULE_waitStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterWaitStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitWaitStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitWaitStatement(this);
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