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
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3P\u01d6\4\2\t\2\4" +
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
                    "\n\13\f\13\16\13\u00e1\13\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\7\f\u00eb" +
                    "\n\f\f\f\16\f\u00ee\13\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3" +
                    "\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20" +
                    "\3\20\3\21\3\21\3\21\3\21\5\21\u010f\n\21\3\21\3\21\3\21\3\21\3\22\3\22" +
                    "\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\7\23" +
                    "\u0124\n\23\f\23\16\23\u0127\13\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24" +
                    "\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26" +
                    "\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30" +
                    "\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32" +
                    "\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35" +
                    "\3\35\3\35\3\36\3\36\3\36\7\36\u016d\n\36\f\36\16\36\u0170\13\36\3\37" +
                    "\3\37\3\37\3\37\3\37\3 \3 \3 \7 \u017a\n \f \16 \u017d\13 \3!\3!\3!\3" +
                    "!\3!\3!\3!\3!\3!\3!\5!\u0189\n!\3!\3!\5!\u018d\n!\3!\3!\5!\u0191\n!\3" +
                    "!\3!\5!\u0195\n!\3!\3!\3!\3!\5!\u019b\n!\3!\3!\3!\5!\u01a0\n!\3!\5!\u01a3" +
                    "\n!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!" +
                    "\3!\3!\3!\3!\3!\3!\3!\3!\7!\u01c3\n!\f!\16!\u01c6\13!\3\"\3\"\5\"\u01ca" +
                    "\n\"\3\"\3\"\3#\3#\3#\3#\6#\u01d2\n#\r#\16#\u01d3\3#\2\3@$\2\4\6\b\n\f" +
                    "\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BD\2\6\3\2=?\3\2" +
                    ";<\4\2\65\669:\3\2\63\64\2\u01f7\2F\3\2\2\2\4M\3\2\2\2\6\u008a\3\2\2\2" +
                    "\b\u008c\3\2\2\2\n\u0094\3\2\2\2\f\u00bb\3\2\2\2\16\u00bd\3\2\2\2\20\u00c9" +
                    "\3\2\2\2\22\u00d0\3\2\2\2\24\u00d8\3\2\2\2\26\u00e6\3\2\2\2\30\u00f5\3" +
                    "\2\2\2\32\u00fc\3\2\2\2\34\u0101\3\2\2\2\36\u0106\3\2\2\2 \u010a\3\2\2" +
                    "\2\"\u0114\3\2\2\2$\u011e\3\2\2\2&\u0128\3\2\2\2(\u0131\3\2\2\2*\u0139" +
                    "\3\2\2\2,\u013e\3\2\2\2.\u0146\3\2\2\2\60\u014c\3\2\2\2\62\u0153\3\2\2" +
                    "\2\64\u015b\3\2\2\2\66\u0160\3\2\2\28\u0165\3\2\2\2:\u0169\3\2\2\2<\u0171" +
                    "\3\2\2\2>\u0176\3\2\2\2@\u01a2\3\2\2\2B\u01c7\3\2\2\2D\u01d1\3\2\2\2F" +
                    "G\5\4\3\2GH\7\2\2\3H\3\3\2\2\2IL\5\6\4\2JL\5 \21\2KI\3\2\2\2KJ\3\2\2\2" +
                    "LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NT\3\2\2\2OM\3\2\2\2PQ\7%\2\2QR\5@!\2RS" +
                    "\7F\2\2SU\3\2\2\2TP\3\2\2\2TU\3\2\2\2U\5\3\2\2\2VW\5\b\5\2WX\7F\2\2X\u008b" +
                    "\3\2\2\2YZ\5\f\7\2Z[\7F\2\2[\u008b\3\2\2\2\\\u008b\5\16\b\2]\u008b\5\"" +
                    "\22\2^\u008b\5(\25\2_`\5$\23\2`a\7F\2\2a\u008b\3\2\2\2b\u008b\5&\24\2" +
                    "c\u008b\58\35\2de\5*\26\2ef\7F\2\2f\u008b\3\2\2\2gh\5\64\33\2hi\7F\2\2" +
                    "i\u008b\3\2\2\2jk\5\n\6\2kl\7F\2\2l\u008b\3\2\2\2m\u008b\5<\37\2n\u008b" +
                    "\5\24\13\2op\5\34\17\2pq\7F\2\2q\u008b\3\2\2\2rs\5\66\34\2st\7F\2\2t\u008b" +
                    "\3\2\2\2uv\5,\27\2vw\7F\2\2w\u008b\3\2\2\2xy\5\60\31\2yz\7F\2\2z\u008b" +
                    "\3\2\2\2{|\5.\30\2|}\7F\2\2}\u008b\3\2\2\2~\177\5\62\32\2\177\u0080\7" +
                    "F\2\2\u0080\u008b\3\2\2\2\u0081\u0082\5\26\f\2\u0082\u0083\7F\2\2\u0083" +
                    "\u008b\3\2\2\2\u0084\u0085\5\30\r\2\u0085\u0086\7F\2\2\u0086\u008b\3\2" +
                    "\2\2\u0087\u0088\5\32\16\2\u0088\u0089\7F\2\2\u0089\u008b\3\2\2\2\u008a" +
                    "V\3\2\2\2\u008aY\3\2\2\2\u008a\\\3\2\2\2\u008a]\3\2\2\2\u008a^\3\2\2\2" +
                    "\u008a_\3\2\2\2\u008ab\3\2\2\2\u008ac\3\2\2\2\u008ad\3\2\2\2\u008ag\3" +
                    "\2\2\2\u008aj\3\2\2\2\u008am\3\2\2\2\u008an\3\2\2\2\u008ao\3\2\2\2\u008a" +
                    "r\3\2\2\2\u008au\3\2\2\2\u008ax\3\2\2\2\u008a{\3\2\2\2\u008a~\3\2\2\2" +
                    "\u008a\u0081\3\2\2\2\u008a\u0084\3\2\2\2\u008a\u0087\3\2\2\2\u008b\7\3" +
                    "\2\2\2\u008c\u008d\7\27\2\2\u008d\u008f\7M\2\2\u008e\u0090\5D#\2\u008f" +
                    "\u008e\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\7G" +
                    "\2\2\u0092\u0093\5@!\2\u0093\t\3\2\2\2\u0094\u0096\7M\2\2\u0095\u0097" +
                    "\5D#\2\u0096\u0095\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\3\2\2\2\u0098" +
                    "\u0099\7G\2\2\u0099\u009a\5@!\2\u009a\13\3\2\2\2\u009b\u009c\7M\2\2\u009c" +
                    "\u009e\7D\2\2\u009d\u009f\5> \2\u009e\u009d\3\2\2\2\u009e\u009f\3\2\2" +
                    "\2\u009f\u00a0\3\2\2\2\u00a0\u00bc\7E\2\2\u00a1\u00a2\7\21\2\2\u00a2\u00a4" +
                    "\7D\2\2\u00a3\u00a5\5@!\2\u00a4\u00a3\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5" +
                    "\u00a6\3\2\2\2\u00a6\u00bc\7E\2\2\u00a7\u00a8\7\32\2\2\u00a8\u00a9\7D" +
                    "\2\2\u00a9\u00aa\5@!\2\u00aa\u00ab\7E\2\2\u00ab\u00bc\3\2\2\2\u00ac\u00ad" +
                    "\7\34\2\2\u00ad\u00ae\7D\2\2\u00ae\u00af\5@!\2\u00af\u00b0\7E\2\2\u00b0" +
                    "\u00bc\3\2\2\2\u00b1\u00b2\7\36\2\2\u00b2\u00b3\7D\2\2\u00b3\u00b4\5@" +
                    "!\2\u00b4\u00b5\7E\2\2\u00b5\u00bc\3\2\2\2\u00b6\u00b7\7 \2\2\u00b7\u00b8" +
                    "\7D\2\2\u00b8\u00b9\5@!\2\u00b9\u00ba\7E\2\2\u00ba\u00bc\3\2\2\2\u00bb" +
                    "\u009b\3\2\2\2\u00bb\u00a1\3\2\2\2\u00bb\u00a7\3\2\2\2\u00bb\u00ac\3\2" +
                    "\2\2\u00bb\u00b1\3\2\2\2\u00bb\u00b6\3\2\2\2\u00bc\r\3\2\2\2\u00bd\u00c1" +
                    "\5\20\t\2\u00be\u00c0\5\22\n\2\u00bf\u00be\3\2\2\2\u00c0\u00c3\3\2\2\2" +
                    "\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1" +
                    "\3\2\2\2\u00c4\u00c6\5\36\20\2\u00c5\u00c4\3\2\2\2\u00c5\u00c6\3\2\2\2" +
                    "\u00c6\u00c7\3\2\2\2\u00c7\u00c8\7*\2\2\u00c8\17\3\2\2\2\u00c9\u00ca\7" +
                    "#\2\2\u00ca\u00cb\7D\2\2\u00cb\u00cc\5@!\2\u00cc\u00cd\7E\2\2\u00cd\u00ce" +
                    "\7)\2\2\u00ce\u00cf\5\4\3\2\u00cf\21\3\2\2\2\u00d0\u00d1\7$\2\2\u00d1" +
                    "\u00d2\7#\2\2\u00d2\u00d3\7D\2\2\u00d3\u00d4\5@!\2\u00d4\u00d5\7E\2\2" +
                    "\u00d5\u00d6\7)\2\2\u00d6\u00d7\5\4\3\2\u00d7\23\3\2\2\2\u00d8\u00d9\7" +
                    "\3\2\2\u00d9\u00da\7M\2\2\u00da\u00db\7\4\2\2\u00db\u00df\7D\2\2\u00dc" +
                    "\u00de\5D#\2\u00dd\u00dc\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2" +
                    "\2\u00df\u00e0\3\2\2\2\u00e0\u00e2\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e3" +
                    "\7E\2\2\u00e3\u00e4\5\4\3\2\u00e4\u00e5\7*\2\2\u00e5\25\3\2\2\2\u00e6" +
                    "\u00e7\7\5\2\2\u00e7\u00ec\7M\2\2\u00e8\u00e9\7\6\2\2\u00e9\u00eb\7M\2" +
                    "\2\u00ea\u00e8\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed" +
                    "\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f0\7G\2\2\u00f0" +
                    "\u00f1\7\7\2\2\u00f1\u00f2\7D\2\2\u00f2\u00f3\5@!\2\u00f3\u00f4\7E\2\2" +
                    "\u00f4\27\3\2\2\2\u00f5\u00f6\7M\2\2\u00f6\u00f7\7\6\2\2\u00f7\u00f8\7" +
                    "\b\2\2\u00f8\u00f9\7D\2\2\u00f9\u00fa\5@!\2\u00fa\u00fb\7E\2\2\u00fb\31" +
                    "\3\2\2\2\u00fc\u00fd\7\t\2\2\u00fd\u00fe\7D\2\2\u00fe\u00ff\5@!\2\u00ff" +
                    "\u0100\7E\2\2\u0100\33\3\2\2\2\u0101\u0102\7M\2\2\u0102\u0103\7\n\2\2" +
                    "\u0103\u0104\7D\2\2\u0104\u0105\7E\2\2\u0105\35\3\2\2\2\u0106\u0107\7" +
                    "$\2\2\u0107\u0108\7)\2\2\u0108\u0109\5\4\3\2\u0109\37\3\2\2\2\u010a\u010b" +
                    "\7\37\2\2\u010b\u010c\7M\2\2\u010c\u010e\7D\2\2\u010d\u010f\5:\36\2\u010e" +
                    "\u010d\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111\7E" +
                    "\2\2\u0111\u0112\5\4\3\2\u0112\u0113\7*\2\2\u0113!\3\2\2\2\u0114\u0115" +
                    "\7&\2\2\u0115\u0116\7M\2\2\u0116\u0117\7G\2\2\u0117\u0118\5@!\2\u0118" +
                    "\u0119\7(\2\2\u0119\u011a\5@!\2\u011a\u011b\7)\2\2\u011b\u011c\5\4\3\2" +
                    "\u011c\u011d\7*\2\2\u011d#\3\2\2\2\u011e\u011f\7\13\2\2\u011f\u0120\7" +
                    "\31\2\2\u0120\u0125\7M\2\2\u0121\u0122\7\6\2\2\u0122\u0124\7M\2\2\u0123" +
                    "\u0121\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2" +
                    "\2\2\u0126%\3\2\2\2\u0127\u0125\3\2\2\2\u0128\u0129\7-\2\2\u0129\u012a" +
                    "\5\4\3\2\u012a\u012b\7.\2\2\u012b\u012c\7D\2\2\u012c\u012d\7M\2\2\u012d" +
                    "\u012e\7E\2\2\u012e\u012f\5\4\3\2\u012f\u0130\7*\2\2\u0130\'\3\2\2\2\u0131" +
                    "\u0132\7\'\2\2\u0132\u0133\7D\2\2\u0133\u0134\5@!\2\u0134\u0135\7E\2\2" +
                    "\u0135\u0136\7)\2\2\u0136\u0137\5\4\3\2\u0137\u0138\7*\2\2\u0138)\3\2" +
                    "\2\2\u0139\u013a\7\f\2\2\u013a\u013b\7D\2\2\u013b\u013c\5@!\2\u013c\u013d" +
                    "\7E\2\2\u013d+\3\2\2\2\u013e\u013f\7\r\2\2\u013f\u0140\7M\2\2\u0140\u0141" +
                    "\7G\2\2\u0141\u0142\7\26\2\2\u0142\u0143\7D\2\2\u0143\u0144\5> \2\u0144" +
                    "\u0145\7E\2\2\u0145-\3\2\2\2\u0146\u0147\7M\2\2\u0147\u0148\7\6\2\2\u0148" +
                    "\u0149\7\23\2\2\u0149\u014a\7D\2\2\u014a\u014b\7E\2\2\u014b/\3\2\2\2\u014c" +
                    "\u014d\7M\2\2\u014d\u014e\7\6\2\2\u014e\u014f\7\24\2\2\u014f\u0150\7D" +
                    "\2\2\u0150\u0151\5@!\2\u0151\u0152\7E\2\2\u0152\61\3\2\2\2\u0153\u0154" +
                    "\7\22\2\2\u0154\u0155\7M\2\2\u0155\u0156\7G\2\2\u0156\u0157\7\16\2\2\u0157" +
                    "\u0158\7D\2\2\u0158\u0159\5> \2\u0159\u015a\7E\2\2\u015a\63\3\2\2\2\u015b" +
                    "\u015c\7\30\2\2\u015c\u015d\7D\2\2\u015d\u015e\5@!\2\u015e\u015f\7E\2" +
                    "\2\u015f\65\3\2\2\2\u0160\u0161\7\35\2\2\u0161\u0162\7D\2\2\u0162\u0163" +
                    "\5@!\2\u0163\u0164\7E\2\2\u0164\67\3\2\2\2\u0165\u0166\7\17\2\2\u0166" +
                    "\u0167\5\4\3\2\u0167\u0168\7*\2\2\u01689\3\2\2\2\u0169\u016e\7M\2\2\u016a" +
                    "\u016b\7H\2\2\u016b\u016d\7M\2\2\u016c\u016a\3\2\2\2\u016d\u0170\3\2\2" +
                    "\2\u016e\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016f;\3\2\2\2\u0170\u016e" +
                    "\3\2\2\2\u0171\u0172\7/\2\2\u0172\u0173\7M\2\2\u0173\u0174\5\4\3\2\u0174" +
                    "\u0175\7\20\2\2\u0175=\3\2\2\2\u0176\u017b\5@!\2\u0177\u0178\7H\2\2\u0178" +
                    "\u017a\5@!\2\u0179\u0177\3\2\2\2\u017a\u017d\3\2\2\2\u017b\u0179\3\2\2" +
                    "\2\u017b\u017c\3\2\2\2\u017c?\3\2\2\2\u017d\u017b\3\2\2\2\u017e\u017f" +
                    "\b!\1\2\u017f\u0180\7<\2\2\u0180\u01a3\5@!\26\u0181\u0182\78\2\2\u0182" +
                    "\u01a3\5@!\25\u0183\u01a3\7L\2\2\u0184\u01a3\7K\2\2\u0185\u01a3\7,\2\2" +
                    "\u0186\u0188\5\f\7\2\u0187\u0189\5D#\2\u0188\u0187\3\2\2\2\u0188\u0189" +
                    "\3\2\2\2\u0189\u01a3\3\2\2\2\u018a\u018c\5B\"\2\u018b\u018d\5D#\2\u018c" +
                    "\u018b\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u01a3\3\2\2\2\u018e\u0190\7M" +
                    "\2\2\u018f\u0191\5D#\2\u0190\u018f\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u01a3" +
                    "\3\2\2\2\u0192\u0194\7N\2\2\u0193\u0195\5D#\2\u0194\u0193\3\2\2\2\u0194" +
                    "\u0195\3\2\2\2\u0195\u01a3\3\2\2\2\u0196\u0197\7D\2\2\u0197\u0198\5@!" +
                    "\2\u0198\u019a\7E\2\2\u0199\u019b\5D#\2\u019a\u0199\3\2\2\2\u019a\u019b" +
                    "\3\2\2\2\u019b\u01a3\3\2\2\2\u019c\u019d\7\33\2\2\u019d\u019f\7D\2\2\u019e" +
                    "\u01a0\7N\2\2\u019f\u019e\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a1\3\2" +
                    "\2\2\u01a1\u01a3\7E\2\2\u01a2\u017e\3\2\2\2\u01a2\u0181\3\2\2\2\u01a2" +
                    "\u0183\3\2\2\2\u01a2\u0184\3\2\2\2\u01a2\u0185\3\2\2\2\u01a2\u0186\3\2" +
                    "\2\2\u01a2\u018a\3\2\2\2\u01a2\u018e\3\2\2\2\u01a2\u0192\3\2\2\2\u01a2" +
                    "\u0196\3\2\2\2\u01a2\u019c\3\2\2\2\u01a3\u01c4\3\2\2\2\u01a4\u01a5\f\24" +
                    "\2\2\u01a5\u01a6\7\67\2\2\u01a6\u01c3\5@!\24\u01a7\u01a8\f\23\2\2\u01a8" +
                    "\u01a9\t\2\2\2\u01a9\u01c3\5@!\24\u01aa\u01ab\f\22\2\2\u01ab\u01ac\t\3" +
                    "\2\2\u01ac\u01c3\5@!\23\u01ad\u01ae\f\21\2\2\u01ae\u01af\t\4\2\2\u01af" +
                    "\u01c3\5@!\22\u01b0\u01b1\f\20\2\2\u01b1\u01b2\t\5\2\2\u01b2\u01c3\5@" +
                    "!\21\u01b3\u01b4\f\17\2\2\u01b4\u01b5\7\62\2\2\u01b5\u01c3\5@!\20\u01b6" +
                    "\u01b7\f\16\2\2\u01b7\u01b8\7\61\2\2\u01b8\u01c3\5@!\17\u01b9\u01ba\f" +
                    "\r\2\2\u01ba\u01bb\7I\2\2\u01bb\u01bc\5@!\2\u01bc\u01bd\7J\2\2\u01bd\u01be" +
                    "\5@!\16\u01be\u01c3\3\2\2\2\u01bf\u01c0\f\f\2\2\u01c0\u01c1\7+\2\2\u01c1" +
                    "\u01c3\5@!\r\u01c2\u01a4\3\2\2\2\u01c2\u01a7\3\2\2\2\u01c2\u01aa\3\2\2" +
                    "\2\u01c2\u01ad\3\2\2\2\u01c2\u01b0\3\2\2\2\u01c2\u01b3\3\2\2\2\u01c2\u01b6" +
                    "\3\2\2\2\u01c2\u01b9\3\2\2\2\u01c2\u01bf\3\2\2\2\u01c3\u01c6\3\2\2\2\u01c4" +
                    "\u01c2\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5A\3\2\2\2\u01c6\u01c4\3\2\2\2" +
                    "\u01c7\u01c9\7B\2\2\u01c8\u01ca\5> \2\u01c9\u01c8\3\2\2\2\u01c9\u01ca" +
                    "\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cc\7C\2\2\u01ccC\3\2\2\2\u01cd\u01ce" +
                    "\7B\2\2\u01ce\u01cf\5@!\2\u01cf\u01d0\7C\2\2\u01d0\u01d2\3\2\2\2\u01d1" +
                    "\u01cd\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d3\u01d4\3\2" +
                    "\2\2\u01d4E\3\2\2\2\36KMT\u008a\u008f\u0096\u009e\u00a4\u00bb\u00c1\u00c5" +
                    "\u00df\u00ec\u010e\u0125\u016e\u017b\u0188\u018c\u0190\u0194\u019a\u019f" +
                    "\u01a2\u01c2\u01c4\u01c9\u01d3";
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
                null, "'$'", "'void default'", "'File'", "'.'", "'new File'", "'append'",
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
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(228);
                match(T__2);
                setState(229);
                match(Identifier);
                setState(234);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__3) {
                    {
                        {
                            setState(230);
                            match(T__3);
                            setState(231);
                            match(Identifier);
                        }
                    }
                    setState(236);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(237);
                match(Assign);
                setState(238);
                match(T__4);
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

    public final FileWriteStatementContext fileWriteStatement() throws RecognitionException {
        FileWriteStatementContext _localctx = new FileWriteStatementContext(_ctx, getState());
        enterRule(_localctx, 22, RULE_fileWriteStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(243);
                match(Identifier);
                setState(244);
                match(T__3);
                setState(245);
                match(T__5);
                setState(246);
                match(OParen);
                setState(247);
                expression(0);
                setState(248);
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
                setState(250);
                match(T__6);
                setState(251);
                match(OParen);
                setState(252);
                expression(0);
                setState(253);
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
                setState(255);
                match(Identifier);
                setState(256);
                match(T__7);
                setState(257);
                match(OParen);
                setState(258);
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
                setState(260);
                match(Else);
                setState(261);
                match(Do);
                setState(262);
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
                setState(264);
                match(Def);
                setState(265);
                match(Identifier);
                setState(266);
                match(OParen);
                setState(268);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == Identifier) {
                    {
                        setState(267);
                        idList();
                    }
                }

                setState(270);
                match(CParen);
                setState(271);
                block();
                setState(272);
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
                setState(274);
                match(For);
                setState(275);
                match(Identifier);
                setState(276);
                match(Assign);
                setState(277);
                expression(0);
                setState(278);
                match(To);
                setState(279);
                expression(0);
                setState(280);
                match(Do);
                setState(281);
                block();
                setState(282);
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
                setState(284);
                match(T__8);
                setState(285);
                match(Import);
                setState(286);
                match(Identifier);
                setState(291);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__3) {
                    {
                        {
                            setState(287);
                            match(T__3);
                            setState(288);
                            match(Identifier);
                        }
                    }
                    setState(293);
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
                setState(294);
                match(Try);
                setState(295);
                block();
                setState(296);
                match(Catch);
                setState(297);
                match(OParen);
                setState(298);
                match(Identifier);
                setState(299);
                match(CParen);
                setState(300);
                block();
                setState(301);
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
                setState(303);
                match(While);
                setState(304);
                match(OParen);
                setState(305);
                expression(0);
                setState(306);
                match(CParen);
                setState(307);
                match(Do);
                setState(308);
                block();
                setState(309);
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
                setState(311);
                match(T__9);
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

    public final WindowCreateStatementContext windowCreateStatement() throws RecognitionException {
        WindowCreateStatementContext _localctx = new WindowCreateStatementContext(_ctx, getState());
        enterRule(_localctx, 42, RULE_windowCreateStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(316);
                match(T__10);
                setState(317);
                match(Identifier);
                setState(318);
                match(Assign);
                setState(319);
                match(Window);
                setState(320);
                match(OParen);
                setState(321);
                exprList();
                setState(322);
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
                setState(324);
                match(Identifier);
                setState(325);
                match(T__3);
                setState(326);
                match(Render);
                setState(327);
                match(OParen);
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

    public final WindowAddCompStatementContext windowAddCompStatement() throws RecognitionException {
        WindowAddCompStatementContext _localctx = new WindowAddCompStatementContext(_ctx, getState());
        enterRule(_localctx, 46, RULE_windowAddCompStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(330);
                match(Identifier);
                setState(331);
                match(T__3);
                setState(332);
                match(AddComponent);
                setState(333);
                match(OParen);
                setState(334);
                expression(0);
                setState(335);
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
                setState(337);
                match(Component);
                setState(338);
                match(Identifier);
                setState(339);
                match(Assign);
                setState(340);
                match(T__11);
                setState(341);
                match(OParen);
                setState(342);
                exprList();
                setState(343);
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
                setState(345);
                match(AddWSText);
                setState(346);
                match(OParen);
                setState(347);
                expression(0);
                setState(348);
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
                setState(350);
                match(Wait);
                setState(351);
                match(OParen);
                setState(352);
                expression(0);
                setState(353);
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
                setState(355);
                match(T__12);
                setState(356);
                block();
                setState(357);
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
                setState(359);
                match(Identifier);
                setState(364);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == Comma) {
                    {
                        {
                            setState(360);
                            match(Comma);
                            setState(361);
                            match(Identifier);
                        }
                    }
                    setState(366);
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
                setState(367);
                match(Class);
                setState(368);
                match(Identifier);
                setState(369);
                block();
                setState(370);
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
                setState(372);
                expression(0);
                setState(377);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == Comma) {
                    {
                        {
                            setState(373);
                            match(Comma);
                            setState(374);
                            expression(0);
                        }
                    }
                    setState(379);
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
                setState(416);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 23, _ctx)) {
                    case 1: {
                        _localctx = new UnaryMinusExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;

                        setState(381);
                        match(Subtract);
                        setState(382);
                        expression(20);
                    }
                    break;
                    case 2: {
                        _localctx = new NotExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(383);
                        match(Excl);
                        setState(384);
                        expression(19);
                    }
                    break;
                    case 3: {
                        _localctx = new NumberExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(385);
                        match(Number);
                    }
                    break;
                    case 4: {
                        _localctx = new BoolExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(386);
                        match(Bool);
                    }
                    break;
                    case 5: {
                        _localctx = new NullExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(387);
                        match(Null);
                    }
                    break;
                    case 6: {
                        _localctx = new FunctionCallExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(388);
                        functionCall();
                        setState(390);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 17, _ctx)) {
                            case 1: {
                                setState(389);
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
                        setState(392);
                        list();
                        setState(394);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 18, _ctx)) {
                            case 1: {
                                setState(393);
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
                        setState(396);
                        match(Identifier);
                        setState(398);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 19, _ctx)) {
                            case 1: {
                                setState(397);
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
                        setState(400);
                        match(String);
                        setState(402);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 20, _ctx)) {
                            case 1: {
                                setState(401);
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
                        setState(404);
                        match(OParen);
                        setState(405);
                        expression(0);
                        setState(406);
                        match(CParen);
                        setState(408);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 21, _ctx)) {
                            case 1: {
                                setState(407);
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
                        setState(410);
                        match(Input);
                        setState(411);
                        match(OParen);
                        setState(413);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == String) {
                            {
                                setState(412);
                                match(String);
                            }
                        }

                        setState(415);
                        match(CParen);
                    }
                    break;
                }
                _ctx.stop = _input.LT(-1);
                setState(450);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 25, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(448);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 24, _ctx)) {
                                case 1: {
                                    _localctx = new PowerExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(418);
                                    if (!(precpred(_ctx, 18)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 18)");
                                    setState(419);
                                    match(Pow);
                                    setState(420);
                                    expression(18);
                                }
                                break;
                                case 2: {
                                    _localctx = new MultExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(421);
                                    if (!(precpred(_ctx, 17)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 17)");
                                    setState(422);
                                    ((MultExpressionContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Multiply) | (1L << Divide) | (1L << Modulus))) != 0))) {
                                        ((MultExpressionContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(423);
                                    expression(18);
                                }
                                break;
                                case 3: {
                                    _localctx = new AddExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(424);
                                    if (!(precpred(_ctx, 16)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 16)");
                                    setState(425);
                                    ((AddExpressionContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!(_la == Add || _la == Subtract)) {
                                        ((AddExpressionContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(426);
                                    expression(17);
                                }
                                break;
                                case 4: {
                                    _localctx = new CompExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(427);
                                    if (!(precpred(_ctx, 15)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 15)");
                                    setState(428);
                                    ((CompExpressionContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GTEquals) | (1L << LTEquals) | (1L << GT) | (1L << LT))) != 0))) {
                                        ((CompExpressionContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(429);
                                    expression(16);
                                }
                                break;
                                case 5: {
                                    _localctx = new EqExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(430);
                                    if (!(precpred(_ctx, 14)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 14)");
                                    setState(431);
                                    ((EqExpressionContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!(_la == Equals || _la == NEquals)) {
                                        ((EqExpressionContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(432);
                                    expression(15);
                                }
                                break;
                                case 6: {
                                    _localctx = new AndExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(433);
                                    if (!(precpred(_ctx, 13)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 13)");
                                    setState(434);
                                    match(And);
                                    setState(435);
                                    expression(14);
                                }
                                break;
                                case 7: {
                                    _localctx = new OrExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(436);
                                    if (!(precpred(_ctx, 12)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 12)");
                                    setState(437);
                                    match(Or);
                                    setState(438);
                                    expression(13);
                                }
                                break;
                                case 8: {
                                    _localctx = new TernaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(439);
                                    if (!(precpred(_ctx, 11)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 11)");
                                    setState(440);
                                    match(QMark);
                                    setState(441);
                                    expression(0);
                                    setState(442);
                                    match(Colon);
                                    setState(443);
                                    expression(12);
                                }
                                break;
                                case 9: {
                                    _localctx = new InExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(445);
                                    if (!(precpred(_ctx, 10)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 10)");
                                    setState(446);
                                    match(In);
                                    setState(447);
                                    expression(11);
                                }
                                break;
                            }
                        }
                    }
                    setState(452);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 25, _ctx);
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
                setState(453);
                match(OBracket);
                setState(455);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (((((_la - 15)) & ~0x3f) == 0 && ((1L << (_la - 15)) & ((1L << (Println - 15)) | (1L << (Print - 15)) | (1L << (Input - 15)) | (1L << (Assert - 15)) | (1L << (Size - 15)) | (1L << (ToInt - 15)) | (1L << (Null - 15)) | (1L << (Excl - 15)) | (1L << (Subtract - 15)) | (1L << (OBracket - 15)) | (1L << (OParen - 15)) | (1L << (Bool - 15)) | (1L << (Number - 15)) | (1L << (Identifier - 15)) | (1L << (String - 15)))) != 0)) {
                    {
                        setState(454);
                        exprList();
                    }
                }

                setState(457);
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
                setState(463);
                _errHandler.sync(this);
                _alt = 1;
                do {
                    switch (_alt) {
                        case 1: {
                            {
                                setState(459);
                                match(OBracket);
                                setState(460);
                                expression(0);
                                setState(461);
                                match(CBracket);
                            }
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                    setState(465);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 27, _ctx);
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

    public static class FileObjectInitializeStatementContext extends ParserRuleContext {
        public FileObjectInitializeStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<TerminalNode> Identifier() {
            return getTokens(XXLParser.Identifier);
        }

        public TerminalNode Identifier(int i) {
            return getToken(XXLParser.Identifier, i);
        }

        public TerminalNode Assign() {
            return getToken(XXLParser.Assign, 0);
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
            return RULE_fileObjectInitializeStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).enterFileObjectInitializeStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).exitFileObjectInitializeStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof XXLVisitor)
                return ((XXLVisitor<? extends T>) visitor).visitFileObjectInitializeStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class FileWriteStatementContext extends ParserRuleContext {
        public FileWriteStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Identifier() {
            return getToken(XXLParser.Identifier, 0);
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
            return RULE_fileWriteStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).enterFileWriteStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).exitFileWriteStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof XXLVisitor) return ((XXLVisitor<? extends T>) visitor).visitFileWriteStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class VerifyFileStatementContext extends ParserRuleContext {
        public VerifyFileStatementContext(ParserRuleContext parent, int invokingState) {
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
            return RULE_verifyFileStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).enterVerifyFileStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XXLListener) ((XXLListener) listener).exitVerifyFileStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof XXLVisitor)
                return ((XXLVisitor<? extends T>) visitor).visitVerifyFileStatement(this);
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