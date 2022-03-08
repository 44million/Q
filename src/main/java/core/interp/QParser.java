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
            T__9 = 10, T__10 = 11, T__11 = 12, T__12 = 13, T__13 = 14, T__14 = 15, T__15 = 16, T__16 = 17,
            T__17 = 18, T__18 = 19, T__19 = 20, Println = 21, Async = 22, AddComponent = 23, Var = 24,
            Import = 25, Print = 26, Input = 27, Assert = 28, Def = 29, ToInt = 30, If = 31, Else = 32,
            Return = 33, For = 34, While = 35, To = 36, Do = 37, End = 38, In = 39, Null = 40, Try = 41,
            Class = 42, Const = 43, Noval = 44, Self = 45, Native = 46, Or = 47, Accessor = 48,
            And = 49, Equals = 50, NEquals = 51, GTEquals = 52, LTEquals = 53, Pow = 54, Excl = 55,
            GT = 56, LT = 57, Add = 58, Subtract = 59, Multiply = 60, Divide = 61, Modulus = 62,
            OBrace = 63, CBrace = 64, OBracket = 65, CBracket = 66, OParen = 67, CParen = 68,
            SColon = 69, Assign = 70, Comma = 71, QMark = 72, Colon = 73, Bool = 74, Number = 75,
            Identifier = 76, String = 77, Comment = 78, Space = 79;
    public static final int
            RULE_parse = 0, RULE_block = 1, RULE_statement = 2, RULE_reAssignment = 3,
            RULE_assignment = 4, RULE_functionCall = 5, RULE_allImport = 6, RULE_objFunctionCall = 7,
            RULE_header = 8, RULE_ifStatement = 9, RULE_ifStat = 10, RULE_hereStatement = 11,
            RULE_varHereStatement = 12, RULE_elseIfStat = 13, RULE_constructorStatement = 14,
            RULE_objCreateStatement = 15, RULE_osExecStatement = 16, RULE_fileWriteStatement = 17,
            RULE_verifyFileStatement = 18, RULE_elseStat = 19, RULE_functionDecl = 20,
            RULE_forStatement = 21, RULE_forInStatement = 22, RULE_importStatement = 23,
            RULE_anonymousFunction = 24, RULE_importFromGithubStatement = 25, RULE_importAllStatement = 26,
            RULE_customClass = 27, RULE_tryCatchStatement = 28, RULE_whileStatement = 29,
            RULE_windowRenderStatement = 30, RULE_windowAddCompStatement = 31, RULE_addWebServerTextStatement = 32,
            RULE_mainFunctionStatement = 33, RULE_idList = 34, RULE_classStatement = 35,
            RULE_exprList = 36, RULE_expression = 37, RULE_list = 38, RULE_indexes = 39;
    public static final String[] ruleNames = makeRuleNames();
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3Q\u0236\4\2\t\2\4" +
                    "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
                    "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
                    "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!" +
                    "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\5\2T\n\2\3" +
                    "\2\3\2\3\2\7\2Y\n\2\f\2\16\2\\\13\2\3\2\3\2\3\2\3\3\3\3\7\3c\n\3\f\3\16" +
                    "\3f\13\3\3\3\3\3\3\3\3\3\5\3l\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4" +
                    "\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3" +
                    "\4\3\4\3\4\3\4\3\4\5\4\u008d\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3" +
                    "\4\3\4\3\4\3\4\5\4\u009c\n\4\3\5\3\5\5\5\u00a0\n\5\3\5\3\5\3\5\3\6\7\6" +
                    "\u00a6\n\6\f\6\16\6\u00a9\13\6\3\6\3\6\3\6\5\6\u00ae\n\6\3\6\3\6\5\6\u00b2" +
                    "\n\6\3\7\3\7\3\7\5\7\u00b7\n\7\3\7\3\7\3\7\3\7\5\7\u00bd\n\7\3\7\3\7\3" +
                    "\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7" +
                    "\3\7\5\7\u00d4\n\7\3\7\5\7\u00d7\n\7\3\b\3\b\3\b\5\b\u00dc\n\b\3\t\3\t" +
                    "\3\t\3\t\3\t\5\t\u00e3\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\7\13\u00ed" +
                    "\n\13\f\13\16\13\u00f0\13\13\3\13\5\13\u00f3\n\13\3\13\3\13\3\f\3\f\3" +
                    "\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3" +
                    "\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\5\20\u0112\n\20\3\20\3\20" +
                    "\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u011e\n\21\3\21\3\21\3\22" +
                    "\3\22\3\22\3\22\3\22\5\22\u0127\n\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23" +
                    "\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\7\26\u013b\n\26" +
                    "\f\26\16\26\u013e\13\26\3\26\3\26\3\26\3\26\5\26\u0144\n\26\3\26\3\26" +
                    "\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30" +
                    "\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31" +
                    "\3\31\3\31\7\31\u0166\n\31\f\31\16\31\u0169\13\31\3\32\3\32\3\32\5\32" +
                    "\u016e\n\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34" +
                    "\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0184\n\34\3\35\3\35\3\35" +
                    "\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u0192\n\35\f\35\16" +
                    "\35\u0195\13\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37" +
                    "\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3" +
                    "\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\7$\u01c2\n$\f$\16$\u01c5\13" +
                    "$\3%\3%\3%\3%\5%\u01cb\n%\3%\3%\3%\3&\3&\3&\7&\u01d3\n&\f&\16&\u01d6\13" +
                    "&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u01e2\n\'\3\'\3\'\5\'\u01e6" +
                    "\n\'\3\'\3\'\5\'\u01ea\n\'\3\'\3\'\5\'\u01ee\n\'\3\'\3\'\3\'\3\'\5\'\u01f4" +
                    "\n\'\3\'\3\'\3\'\5\'\u01f9\n\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0203" +
                    "\n\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3" +
                    "\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\7\'\u0223\n\'\f" +
                    "\'\16\'\u0226\13\'\3(\3(\5(\u022a\n(\3(\3(\3)\3)\3)\3)\6)\u0232\n)\r)" +
                    "\16)\u0233\3)\7Z\u00a7\u013c\u0167\u0193\3L*\2\4\6\b\n\f\16\20\22\24\26" +
                    "\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNP\2\b\3\2-.\4\2\30\30\60" +
                    "\60\3\2>@\3\2<=\4\2\66\67:;\3\2\64\65\2\u0262\2S\3\2\2\2\4d\3\2\2\2\6" +
                    "\u009b\3\2\2\2\b\u009d\3\2\2\2\n\u00a7\3\2\2\2\f\u00d6\3\2\2\2\16\u00db" +
                    "\3\2\2\2\20\u00dd\3\2\2\2\22\u00e6\3\2\2\2\24\u00ea\3\2\2\2\26\u00f6\3" +
                    "\2\2\2\30\u00fc\3\2\2\2\32\u0102\3\2\2\2\34\u0106\3\2\2\2\36\u010d\3\2" +
                    "\2\2 \u0117\3\2\2\2\"\u0121\3\2\2\2$\u012a\3\2\2\2&\u0131\3\2\2\2(\u0136" +
                    "\3\2\2\2*\u013c\3\2\2\2,\u0149\3\2\2\2.\u0154\3\2\2\2\60\u0160\3\2\2\2" +
                    "\62\u016a\3\2\2\2\64\u0175\3\2\2\2\66\u0183\3\2\2\28\u0185\3\2\2\2:\u0199" +
                    "\3\2\2\2<\u019f\3\2\2\2>\u01a6\3\2\2\2@\u01ac\3\2\2\2B\u01b3\3\2\2\2D" +
                    "\u01ba\3\2\2\2F\u01be\3\2\2\2H\u01c6\3\2\2\2J\u01cf\3\2\2\2L\u0202\3\2" +
                    "\2\2N\u0227\3\2\2\2P\u0231\3\2\2\2RT\5\22\n\2SR\3\2\2\2ST\3\2\2\2TZ\3" +
                    "\2\2\2UV\5\16\b\2VW\7G\2\2WY\3\2\2\2XU\3\2\2\2Y\\\3\2\2\2Z[\3\2\2\2ZX" +
                    "\3\2\2\2[]\3\2\2\2\\Z\3\2\2\2]^\5\4\3\2^_\7\2\2\3_\3\3\2\2\2`c\5\6\4\2" +
                    "ac\5*\26\2b`\3\2\2\2ba\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2ek\3\2\2\2" +
                    "fd\3\2\2\2gh\7#\2\2hi\5L\'\2ij\7G\2\2jl\3\2\2\2kg\3\2\2\2kl\3\2\2\2l\5" +
                    "\3\2\2\2mn\5\f\7\2no\7G\2\2o\u009c\3\2\2\2p\u009c\5\24\13\2q\u009c\5," +
                    "\27\2r\u009c\5.\30\2s\u009c\5<\37\2t\u009c\5:\36\2u\u009c\5D#\2vw\5B\"" +
                    "\2wx\7G\2\2x\u009c\3\2\2\2yz\5\b\5\2z{\7G\2\2{\u009c\3\2\2\2|\u009c\5" +
                    "H%\2}\u009c\5\36\20\2~\177\5@!\2\177\u0080\7G\2\2\u0080\u009c\3\2\2\2" +
                    "\u0081\u0082\5> \2\u0082\u0083\7G\2\2\u0083\u009c\3\2\2\2\u0084\u0085" +
                    "\5$\23\2\u0085\u0086\7G\2\2\u0086\u009c\3\2\2\2\u0087\u0088\5&\24\2\u0088" +
                    "\u0089\7G\2\2\u0089\u009c\3\2\2\2\u008a\u008c\5\20\t\2\u008b\u008d\7G" +
                    "\2\2\u008c\u008b\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u009c\3\2\2\2\u008e" +
                    "\u008f\5 \21\2\u008f\u0090\7G\2\2\u0090\u009c\3\2\2\2\u0091\u0092\5\"" +
                    "\22\2\u0092\u0093\7G\2\2\u0093\u009c\3\2\2\2\u0094\u009c\5\62\32\2\u0095" +
                    "\u0096\5\30\r\2\u0096\u0097\7G\2\2\u0097\u009c\3\2\2\2\u0098\u0099\5\n" +
                    "\6\2\u0099\u009a\7G\2\2\u009a\u009c\3\2\2\2\u009bm\3\2\2\2\u009bp\3\2" +
                    "\2\2\u009bq\3\2\2\2\u009br\3\2\2\2\u009bs\3\2\2\2\u009bt\3\2\2\2\u009b" +
                    "u\3\2\2\2\u009bv\3\2\2\2\u009by\3\2\2\2\u009b|\3\2\2\2\u009b}\3\2\2\2" +
                    "\u009b~\3\2\2\2\u009b\u0081\3\2\2\2\u009b\u0084\3\2\2\2\u009b\u0087\3" +
                    "\2\2\2\u009b\u008a\3\2\2\2\u009b\u008e\3\2\2\2\u009b\u0091\3\2\2\2\u009b" +
                    "\u0094\3\2\2\2\u009b\u0095\3\2\2\2\u009b\u0098\3\2\2\2\u009c\7\3\2\2\2" +
                    "\u009d\u009f\7N\2\2\u009e\u00a0\5P)\2\u009f\u009e\3\2\2\2\u009f\u00a0" +
                    "\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\7H\2\2\u00a2\u00a3\5L\'\2\u00a3" +
                    "\t\3\2\2\2\u00a4\u00a6\t\2\2\2\u00a5\u00a4\3\2\2\2\u00a6\u00a9\3\2\2\2" +
                    "\u00a7\u00a8\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00aa\3\2\2\2\u00a9\u00a7" +
                    "\3\2\2\2\u00aa\u00ab\7\32\2\2\u00ab\u00b1\7N\2\2\u00ac\u00ae\5P)\2\u00ad" +
                    "\u00ac\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\7H" +
                    "\2\2\u00b0\u00b2\5L\'\2\u00b1\u00ad\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2" +
                    "\13\3\2\2\2\u00b3\u00b4\7N\2\2\u00b4\u00b6\7E\2\2\u00b5\u00b7\5J&\2\u00b6" +
                    "\u00b5\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00d7\7F" +
                    "\2\2\u00b9\u00ba\7\27\2\2\u00ba\u00bc\7E\2\2\u00bb\u00bd\5L\'\2\u00bc" +
                    "\u00bb\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00d7\7F" +
                    "\2\2\u00bf\u00c0\7\34\2\2\u00c0\u00c1\7E\2\2\u00c1\u00c2\5L\'\2\u00c2" +
                    "\u00c3\7F\2\2\u00c3\u00d7\3\2\2\2\u00c4\u00c5\7\36\2\2\u00c5\u00c6\7E" +
                    "\2\2\u00c6\u00c7\5L\'\2\u00c7\u00c8\7F\2\2\u00c8\u00d7\3\2\2\2\u00c9\u00ca" +
                    "\7 \2\2\u00ca\u00cb\7E\2\2\u00cb\u00cc\5L\'\2\u00cc\u00cd\7F\2\2\u00cd" +
                    "\u00d7\3\2\2\2\u00ce\u00cf\7N\2\2\u00cf\u00d0\7\62\2\2\u00d0\u00d1\7N" +
                    "\2\2\u00d1\u00d3\7E\2\2\u00d2\u00d4\5J&\2\u00d3\u00d2\3\2\2\2\u00d3\u00d4" +
                    "\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d7\7F\2\2\u00d6\u00b3\3\2\2\2\u00d6" +
                    "\u00b9\3\2\2\2\u00d6\u00bf\3\2\2\2\u00d6\u00c4\3\2\2\2\u00d6\u00c9\3\2" +
                    "\2\2\u00d6\u00ce\3\2\2\2\u00d7\r\3\2\2\2\u00d8\u00dc\5\60\31\2\u00d9\u00dc" +
                    "\5\64\33\2\u00da\u00dc\5\66\34\2\u00db\u00d8\3\2\2\2\u00db\u00d9\3\2\2" +
                    "\2\u00db\u00da\3\2\2\2\u00dc\17\3\2\2\2\u00dd\u00de\7N\2\2\u00de\u00df" +
                    "\7\62\2\2\u00df\u00e0\7N\2\2\u00e0\u00e2\7E\2\2\u00e1\u00e3\5J&\2\u00e2" +
                    "\u00e1\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\7F" +
                    "\2\2\u00e5\21\3\2\2\2\u00e6\u00e7\7\3\2\2\u00e7\u00e8\7\4\2\2\u00e8\u00e9" +
                    "\7N\2\2\u00e9\23\3\2\2\2\u00ea\u00ee\5\26\f\2\u00eb\u00ed\5\34\17\2\u00ec" +
                    "\u00eb\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2" +
                    "\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f3\5(\25\2\u00f2" +
                    "\u00f1\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\7(" +
                    "\2\2\u00f5\25\3\2\2\2\u00f6\u00f7\7!\2\2\u00f7\u00f8\7E\2\2\u00f8\u00f9" +
                    "\5L\'\2\u00f9\u00fa\7F\2\2\u00fa\u00fb\5\4\3\2\u00fb\27\3\2\2\2\u00fc" +
                    "\u00fd\7/\2\2\u00fd\u00fe\7\62\2\2\u00fe\u00ff\7N\2\2\u00ff\u0100\7H\2" +
                    "\2\u0100\u0101\5L\'\2\u0101\31\3\2\2\2\u0102\u0103\7/\2\2\u0103\u0104" +
                    "\7\62\2\2\u0104\u0105\7N\2\2\u0105\33\3\2\2\2\u0106\u0107\7\"\2\2\u0107" +
                    "\u0108\7!\2\2\u0108\u0109\7E\2\2\u0109\u010a\5L\'\2\u010a\u010b\7F\2\2" +
                    "\u010b\u010c\5\4\3\2\u010c\35\3\2\2\2\u010d\u010e\7\5\2\2\u010e\u010f" +
                    "\7N\2\2\u010f\u0111\7E\2\2\u0110\u0112\5J&\2\u0111\u0110\3\2\2\2\u0111" +
                    "\u0112\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0114\7F\2\2\u0114\u0115\5\4" +
                    "\3\2\u0115\u0116\7(\2\2\u0116\37\3\2\2\2\u0117\u0118\7\6\2\2\u0118\u0119" +
                    "\7N\2\2\u0119\u011a\7\7\2\2\u011a\u011b\7N\2\2\u011b\u011d\7E\2\2\u011c" +
                    "\u011e\5J&\2\u011d\u011c\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011f\3\2\2" +
                    "\2\u011f\u0120\7F\2\2\u0120!\3\2\2\2\u0121\u0122\7\b\2\2\u0122\u0123\7" +
                    "\62\2\2\u0123\u0124\7N\2\2\u0124\u0126\7E\2\2\u0125\u0127\5L\'\2\u0126" +
                    "\u0125\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\7F" +
                    "\2\2\u0129#\3\2\2\2\u012a\u012b\7N\2\2\u012b\u012c\7\62\2\2\u012c\u012d" +
                    "\7\t\2\2\u012d\u012e\7E\2\2\u012e\u012f\5L\'\2\u012f\u0130\7F\2\2\u0130" +
                    "%\3\2\2\2\u0131\u0132\7\n\2\2\u0132\u0133\7E\2\2\u0133\u0134\5L\'\2\u0134" +
                    "\u0135\7F\2\2\u0135\'\3\2\2\2\u0136\u0137\7\"\2\2\u0137\u0138\5\4\3\2" +
                    "\u0138)\3\2\2\2\u0139\u013b\t\3\2\2\u013a\u0139\3\2\2\2\u013b\u013e\3" +
                    "\2\2\2\u013c\u013d\3\2\2\2\u013c\u013a\3\2\2\2\u013d\u013f\3\2\2\2\u013e" +
                    "\u013c\3\2\2\2\u013f\u0140\7\37\2\2\u0140\u0141\7N\2\2\u0141\u0143\7E" +
                    "\2\2\u0142\u0144\5F$\2\u0143\u0142\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0145" +
                    "\3\2\2\2\u0145\u0146\7F\2\2\u0146\u0147\5\4\3\2\u0147\u0148\7(\2\2\u0148" +
                    "+\3\2\2\2\u0149\u014a\7$\2\2\u014a\u014b\7E\2\2\u014b\u014c\7N\2\2\u014c" +
                    "\u014d\7H\2\2\u014d\u014e\5L\'\2\u014e\u014f\7&\2\2\u014f\u0150\5L\'\2" +
                    "\u0150\u0151\7F\2\2\u0151\u0152\5\4\3\2\u0152\u0153\7(\2\2\u0153-\3\2" +
                    "\2\2\u0154\u0155\7$\2\2\u0155\u0156\7E\2\2\u0156\u0157\7N\2\2\u0157\u0158" +
                    "\7)\2\2\u0158\u0159\7\13\2\2\u0159\u015a\7E\2\2\u015a\u015b\5L\'\2\u015b" +
                    "\u015c\7F\2\2\u015c\u015d\7F\2\2\u015d\u015e\5\4\3\2\u015e\u015f\7(\2" +
                    "\2\u015f/\3\2\2\2\u0160\u0161\7\f\2\2\u0161\u0162\7\33\2\2\u0162\u0167" +
                    "\7N\2\2\u0163\u0164\7\r\2\2\u0164\u0166\7N\2\2\u0165\u0163\3\2\2\2\u0166" +
                    "\u0169\3\2\2\2\u0167\u0168\3\2\2\2\u0167\u0165\3\2\2\2\u0168\61\3\2\2" +
                    "\2\u0169\u0167\3\2\2\2\u016a\u016b\7\37\2\2\u016b\u016d\7E\2\2\u016c\u016e" +
                    "\5J&\2\u016d\u016c\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u016f\3\2\2\2\u016f" +
                    "\u0170\7F\2\2\u0170\u0171\7=\2\2\u0171\u0172\7:\2\2\u0172\u0173\5\4\3" +
                    "\2\u0173\u0174\7(\2\2\u0174\63\3\2\2\2\u0175\u0176\7\f\2\2\u0176\u0177" +
                    "\7\33\2\2\u0177\u0178\5L\'\2\u0178\65\3\2\2\2\u0179\u017a\7\f\2\2\u017a" +
                    "\u017b\7\33\2\2\u017b\u017c\7C\2\2\u017c\u017d\7>\2\2\u017d\u0184\7D\2" +
                    "\2\u017e\u017f\7\f\2\2\u017f\u0180\7\33\2\2\u0180\u0181\7C\2\2\u0181\u0182" +
                    "\7\16\2\2\u0182\u0184\7D\2\2\u0183\u0179\3\2\2\2\u0183\u017e\3\2\2\2\u0184" +
                    "\67\3\2\2\2\u0185\u0186\7\17\2\2\u0186\u0187\7,\2\2\u0187\u0193\7N\2\2" +
                    "\u0188\u0189\7C\2\2\u0189\u018a\7\20\2\2\u018a\u018b\7D\2\2\u018b\u018c" +
                    "\7\21\2\2\u018c\u018d\7N\2\2\u018d\u018e\7\21\2\2\u018e\u018f\7K\2\2\u018f" +
                    "\u0190\7N\2\2\u0190\u0192\7G\2\2\u0191\u0188\3\2\2\2\u0192\u0195\3\2\2" +
                    "\2\u0193\u0194\3\2\2\2\u0193\u0191\3\2\2\2\u0194\u0196\3\2\2\2\u0195\u0193" +
                    "\3\2\2\2\u0196\u0197\5\4\3\2\u0197\u0198\7(\2\2\u01989\3\2\2\2\u0199\u019a" +
                    "\7+\2\2\u019a\u019b\5\4\3\2\u019b\u019c\7\22\2\2\u019c\u019d\5\4\3\2\u019d" +
                    "\u019e\7(\2\2\u019e;\3\2\2\2\u019f\u01a0\7%\2\2\u01a0\u01a1\7E\2\2\u01a1" +
                    "\u01a2\5L\'\2\u01a2\u01a3\7F\2\2\u01a3\u01a4\5\4\3\2\u01a4\u01a5\7(\2" +
                    "\2\u01a5=\3\2\2\2\u01a6\u01a7\7N\2\2\u01a7\u01a8\7\62\2\2\u01a8\u01a9" +
                    "\7\23\2\2\u01a9\u01aa\7E\2\2\u01aa\u01ab\7F\2\2\u01ab?\3\2\2\2\u01ac\u01ad" +
                    "\7N\2\2\u01ad\u01ae\7\62\2\2\u01ae\u01af\7\31\2\2\u01af\u01b0\7E\2\2\u01b0" +
                    "\u01b1\5L\'\2\u01b1\u01b2\7F\2\2\u01b2A\3\2\2\2\u01b3\u01b4\7N\2\2\u01b4" +
                    "\u01b5\7\62\2\2\u01b5\u01b6\7\24\2\2\u01b6\u01b7\7E\2\2\u01b7\u01b8\5" +
                    "L\'\2\u01b8\u01b9\7F\2\2\u01b9C\3\2\2\2\u01ba\u01bb\7\25\2\2\u01bb\u01bc" +
                    "\5\4\3\2\u01bc\u01bd\7(\2\2\u01bdE\3\2\2\2\u01be\u01c3\7N\2\2\u01bf\u01c0" +
                    "\7I\2\2\u01c0\u01c2\7N\2\2\u01c1\u01bf\3\2\2\2\u01c2\u01c5\3\2\2\2\u01c3" +
                    "\u01c1\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4G\3\2\2\2\u01c5\u01c3\3\2\2\2" +
                    "\u01c6\u01c7\7,\2\2\u01c7\u01ca\7N\2\2\u01c8\u01c9\7K\2\2\u01c9\u01cb" +
                    "\7N\2\2\u01ca\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc" +
                    "\u01cd\5\4\3\2\u01cd\u01ce\7(\2\2\u01ceI\3\2\2\2\u01cf\u01d4\5L\'\2\u01d0" +
                    "\u01d1\7I\2\2\u01d1\u01d3\5L\'\2\u01d2\u01d0\3\2\2\2\u01d3\u01d6\3\2\2" +
                    "\2\u01d4\u01d2\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5K\3\2\2\2\u01d6\u01d4" +
                    "\3\2\2\2\u01d7\u01d8\b\'\1\2\u01d8\u01d9\7=\2\2\u01d9\u0203\5L\'\31\u01da" +
                    "\u01db\79\2\2\u01db\u0203\5L\'\30\u01dc\u0203\7M\2\2\u01dd\u0203\7L\2" +
                    "\2\u01de\u0203\7*\2\2\u01df\u01e1\5\f\7\2\u01e0\u01e2\5P)\2\u01e1\u01e0" +
                    "\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u0203\3\2\2\2\u01e3\u01e5\5N(\2\u01e4" +
                    "\u01e6\5P)\2\u01e5\u01e4\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u0203\3\2\2" +
                    "\2\u01e7\u01e9\7N\2\2\u01e8\u01ea\5P)\2\u01e9\u01e8\3\2\2\2\u01e9\u01ea" +
                    "\3\2\2\2\u01ea\u0203\3\2\2\2\u01eb\u01ed\7O\2\2\u01ec\u01ee\5P)\2\u01ed" +
                    "\u01ec\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u0203\3\2\2\2\u01ef\u01f0\7E" +
                    "\2\2\u01f0\u01f1\5L\'\2\u01f1\u01f3\7F\2\2\u01f2\u01f4\5P)\2\u01f3\u01f2" +
                    "\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u0203\3\2\2\2\u01f5\u01f6\7\35\2\2" +
                    "\u01f6\u01f8\7E\2\2\u01f7\u01f9\7O\2\2\u01f8\u01f7\3\2\2\2\u01f8\u01f9" +
                    "\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u0203\7F\2\2\u01fb\u0203\5\32\16\2" +
                    "\u01fc\u01fd\7\26\2\2\u01fd\u01fe\7E\2\2\u01fe\u01ff\5L\'\2\u01ff\u0200" +
                    "\7F\2\2\u0200\u0203\3\2\2\2\u0201\u0203\5\62\32\2\u0202\u01d7\3\2\2\2" +
                    "\u0202\u01da\3\2\2\2\u0202\u01dc\3\2\2\2\u0202\u01dd\3\2\2\2\u0202\u01de" +
                    "\3\2\2\2\u0202\u01df\3\2\2\2\u0202\u01e3\3\2\2\2\u0202\u01e7\3\2\2\2\u0202" +
                    "\u01eb\3\2\2\2\u0202\u01ef\3\2\2\2\u0202\u01f5\3\2\2\2\u0202\u01fb\3\2" +
                    "\2\2\u0202\u01fc\3\2\2\2\u0202\u0201\3\2\2\2\u0203\u0224\3\2\2\2\u0204" +
                    "\u0205\f\27\2\2\u0205\u0206\78\2\2\u0206\u0223\5L\'\27\u0207\u0208\f\26" +
                    "\2\2\u0208\u0209\t\4\2\2\u0209\u0223\5L\'\27\u020a\u020b\f\25\2\2\u020b" +
                    "\u020c\t\5\2\2\u020c\u0223\5L\'\26\u020d\u020e\f\24\2\2\u020e\u020f\t" +
                    "\6\2\2\u020f\u0223\5L\'\25\u0210\u0211\f\23\2\2\u0211\u0212\t\7\2\2\u0212" +
                    "\u0223\5L\'\24\u0213\u0214\f\22\2\2\u0214\u0215\7\63\2\2\u0215\u0223\5" +
                    "L\'\23\u0216\u0217\f\21\2\2\u0217\u0218\7\61\2\2\u0218\u0223\5L\'\22\u0219" +
                    "\u021a\f\20\2\2\u021a\u021b\7J\2\2\u021b\u021c\5L\'\2\u021c\u021d\7K\2" +
                    "\2\u021d\u021e\5L\'\21\u021e\u0223\3\2\2\2\u021f\u0220\f\17\2\2\u0220" +
                    "\u0221\7)\2\2\u0221\u0223\5L\'\20\u0222\u0204\3\2\2\2\u0222\u0207\3\2" +
                    "\2\2\u0222\u020a\3\2\2\2\u0222\u020d\3\2\2\2\u0222\u0210\3\2\2\2\u0222" +
                    "\u0213\3\2\2\2\u0222\u0216\3\2\2\2\u0222\u0219\3\2\2\2\u0222\u021f\3\2" +
                    "\2\2\u0223\u0226\3\2\2\2\u0224\u0222\3\2\2\2\u0224\u0225\3\2\2\2\u0225" +
                    "M\3\2\2\2\u0226\u0224\3\2\2\2\u0227\u0229\7C\2\2\u0228\u022a\5J&\2\u0229" +
                    "\u0228\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u022c\7D" +
                    "\2\2\u022cO\3\2\2\2\u022d\u022e\7C\2\2\u022e\u022f\5L\'\2\u022f\u0230" +
                    "\7D\2\2\u0230\u0232\3\2\2\2\u0231\u022d\3\2\2\2\u0232\u0233\3\2\2\2\u0233" +
                    "\u0231\3\2\2\2\u0233\u0234\3\2\2\2\u0234Q\3\2\2\2,SZbdk\u008c\u009b\u009f" +
                    "\u00a7\u00ad\u00b1\u00b6\u00bc\u00d3\u00d6\u00db\u00e2\u00ee\u00f2\u0111" +
                    "\u011d\u0126\u013c\u0143\u0167\u016d\u0183\u0193\u01c3\u01ca\u01d4\u01e1" +
                    "\u01e5\u01e9\u01ed\u01f3\u01f8\u0202\u0222\u0224\u0229\u0233";
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
                "parse", "block", "statement", "reAssignment", "assignment", "functionCall",
                "allImport", "objFunctionCall", "header", "ifStatement", "ifStat", "hereStatement",
                "varHereStatement", "elseIfStat", "constructorStatement", "objCreateStatement",
                "osExecStatement", "fileWriteStatement", "verifyFileStatement", "elseStat",
                "functionDecl", "forStatement", "forInStatement", "importStatement",
                "anonymousFunction", "importFromGithubStatement", "importAllStatement",
                "customClass", "tryCatchStatement", "whileStatement", "windowRenderStatement",
                "windowAddCompStatement", "addWebServerTextStatement", "mainFunctionStatement",
                "idList", "classStatement", "exprList", "expression", "list", "indexes"
        };
    }

    private static String[] makeLiteralNames() {
        return new String[]{
                null, "'@'", "'header'", "'cn'", "'new'", "'as'", "'sys'", "'write'",
                "'verify'", "'range'", "'#'", "'.'", "'all'", "'custom'", "'define'",
                "'\"'", "'onerr'", "'render'", "'changeText'", "'fn main()'", "'random'",
                null, "'async'", "'addComp'", "'var'", "'import'", null, null, "'assert'",
                "'fn'", "'toInt'", "'if'", "'else'", "'return'", "'for'", "'while'",
                "'to'", "'do'", "'end'", "'in'", "'null'", "'try'", "'class'", "'const'",
                "'noval'", "'self'", "'native'", "'||'", "'::'", "'&&'", "'=='", "'!='",
                "'>='", "'<='", "'^'", "'!'", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'",
                "'%'", "'{'", "'}'", "'['", "']'", "'('", "')'", "';'", "'='", "','",
                "'?'", "':'"
        };
    }

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, null, null, null, null, null, null, null, null, null, null, null,
                null, null, null, null, null, null, null, null, null, "Println", "Async",
                "AddComponent", "Var", "Import", "Print", "Input", "Assert", "Def", "ToInt",
                "If", "Else", "Return", "For", "While", "To", "Do", "End", "In", "Null",
                "Try", "Class", "Const", "Noval", "Self", "Native", "Or", "Accessor",
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
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(81);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == T__0) {
                    {
                        setState(80);
                        header();
                    }
                }

                setState(88);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 1, _ctx);
                while (_alt != 1 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1 + 1) {
                        {
                            {
                                setState(83);
                                allImport();
                                setState(84);
                                match(SColon);
                            }
                        }
                    }
                    setState(90);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 1, _ctx);
                }
                setState(91);
                block();
                setState(92);
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
                setState(98);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__5) | (1L << T__7) | (1L << T__18) | (1L << Println) | (1L << Async) | (1L << Var) | (1L << Print) | (1L << Assert) | (1L << Def) | (1L << ToInt) | (1L << If) | (1L << For) | (1L << While) | (1L << Try) | (1L << Class) | (1L << Const) | (1L << Noval) | (1L << Self) | (1L << Native))) != 0) || _la == Identifier) {
                    {
                        setState(96);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 2, _ctx)) {
                            case 1: {
                                setState(94);
                                statement();
                            }
                            break;
                            case 2: {
                                setState(95);
                                functionDecl();
                            }
                            break;
                        }
                    }
                    setState(100);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(105);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == Return) {
                    {
                        setState(101);
                        match(Return);
                        setState(102);
                        expression(0);
                        setState(103);
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
        int _la;
        try {
            setState(153);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 6, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(107);
                    functionCall();
                    setState(108);
                    match(SColon);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(110);
                    ifStatement();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(111);
                    forStatement();
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(112);
                    forInStatement();
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(113);
                    whileStatement();
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(114);
                    tryCatchStatement();
                }
                break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(115);
                    mainFunctionStatement();
                }
                break;
                case 8:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(116);
                    addWebServerTextStatement();
                    setState(117);
                    match(SColon);
                }
                break;
                case 9:
                    enterOuterAlt(_localctx, 9);
                {
                    setState(119);
                    reAssignment();
                    setState(120);
                    match(SColon);
                }
                break;
                case 10:
                    enterOuterAlt(_localctx, 10);
                {
                    setState(122);
                    classStatement();
                }
                break;
                case 11:
                    enterOuterAlt(_localctx, 11);
                {
                    setState(123);
                    constructorStatement();
                }
                break;
                case 12:
                    enterOuterAlt(_localctx, 12);
                {
                    setState(124);
                    windowAddCompStatement();
                    setState(125);
                    match(SColon);
                }
                break;
                case 13:
                    enterOuterAlt(_localctx, 13);
                {
                    setState(127);
                    windowRenderStatement();
                    setState(128);
                    match(SColon);
                }
                break;
                case 14:
                    enterOuterAlt(_localctx, 14);
                {
                    setState(130);
                    fileWriteStatement();
                    setState(131);
                    match(SColon);
                }
                break;
                case 15:
                    enterOuterAlt(_localctx, 15);
                {
                    setState(133);
                    verifyFileStatement();
                    setState(134);
                    match(SColon);
                }
                break;
                case 16:
                    enterOuterAlt(_localctx, 16);
                {
                    setState(136);
                    objFunctionCall();
                    setState(138);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == SColon) {
                        {
                            setState(137);
                            match(SColon);
                        }
                    }

                }
                break;
                case 17:
                    enterOuterAlt(_localctx, 17);
                {
                    setState(140);
                    objCreateStatement();
                    setState(141);
                    match(SColon);
                }
                break;
                case 18:
                    enterOuterAlt(_localctx, 18);
                {
                    setState(143);
                    osExecStatement();
                    setState(144);
                    match(SColon);
                }
                break;
                case 19:
                    enterOuterAlt(_localctx, 19);
                {
                    setState(146);
                    anonymousFunction();
                }
                break;
                case 20:
                    enterOuterAlt(_localctx, 20);
                {
                    setState(147);
                    hereStatement();
                    setState(148);
                    match(SColon);
                }
                break;
                case 21:
                    enterOuterAlt(_localctx, 21);
                {
                    setState(150);
                    assignment();
                    setState(151);
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

    public final ReAssignmentContext reAssignment() throws RecognitionException {
        ReAssignmentContext _localctx = new ReAssignmentContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_reAssignment);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(155);
                match(Identifier);
                setState(157);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == OBracket) {
                    {
                        setState(156);
                        indexes();
                    }
                }

                setState(159);
                match(Assign);
                setState(160);
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

    public final AssignmentContext assignment() throws RecognitionException {
        AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_assignment);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(165);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 8, _ctx);
                while (_alt != 1 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1 + 1) {
                        {
                            {
                                setState(162);
                                _la = _input.LA(1);
                                if (!(_la == Const || _la == Noval)) {
                                    _errHandler.recoverInline(this);
                                } else {
                                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                    _errHandler.reportMatch(this);
                                    consume();
                                }
                            }
                        }
                    }
                    setState(167);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 8, _ctx);
                }
                setState(168);
                match(Var);
                setState(169);
                match(Identifier);
                setState(175);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == OBracket || _la == Assign) {
                    {
                        setState(171);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == OBracket) {
                            {
                                setState(170);
                                indexes();
                            }
                        }

                        setState(173);
                        match(Assign);
                        setState(174);
                        expression(0);
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

    public final FunctionCallContext functionCall() throws RecognitionException {
        FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_functionCall);
        int _la;
        try {
            setState(212);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 14, _ctx)) {
                case 1:
                    _localctx = new IdentifierFunctionCallContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(177);
                    match(Identifier);
                    setState(178);
                    match(OParen);
                    setState(180);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & ((1L << (T__19 - 20)) | (1L << (Println - 20)) | (1L << (Print - 20)) | (1L << (Input - 20)) | (1L << (Assert - 20)) | (1L << (Def - 20)) | (1L << (ToInt - 20)) | (1L << (Null - 20)) | (1L << (Self - 20)) | (1L << (Excl - 20)) | (1L << (Subtract - 20)) | (1L << (OBracket - 20)) | (1L << (OParen - 20)) | (1L << (Bool - 20)) | (1L << (Number - 20)) | (1L << (Identifier - 20)) | (1L << (String - 20)))) != 0)) {
                        {
                            setState(179);
                            exprList();
                        }
                    }

                    setState(182);
                    match(CParen);
                }
                break;
                case 2:
                    _localctx = new PrintlnFunctionCallContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(183);
                    match(Println);
                    setState(184);
                    match(OParen);
                    setState(186);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & ((1L << (T__19 - 20)) | (1L << (Println - 20)) | (1L << (Print - 20)) | (1L << (Input - 20)) | (1L << (Assert - 20)) | (1L << (Def - 20)) | (1L << (ToInt - 20)) | (1L << (Null - 20)) | (1L << (Self - 20)) | (1L << (Excl - 20)) | (1L << (Subtract - 20)) | (1L << (OBracket - 20)) | (1L << (OParen - 20)) | (1L << (Bool - 20)) | (1L << (Number - 20)) | (1L << (Identifier - 20)) | (1L << (String - 20)))) != 0)) {
                        {
                            setState(185);
                            expression(0);
                        }
                    }

                    setState(188);
                    match(CParen);
                }
                break;
                case 3:
                    _localctx = new PrintFunctionCallContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(189);
                    match(Print);
                    setState(190);
                    match(OParen);
                    setState(191);
                    expression(0);
                    setState(192);
                    match(CParen);
                }
                break;
                case 4:
                    _localctx = new AssertFunctionCallContext(_localctx);
                    enterOuterAlt(_localctx, 4);
                {
                    setState(194);
                    match(Assert);
                    setState(195);
                    match(OParen);
                    setState(196);
                    expression(0);
                    setState(197);
                    match(CParen);
                }
                break;
                case 5:
                    _localctx = new ToIntFunctionCallContext(_localctx);
                    enterOuterAlt(_localctx, 5);
                {
                    setState(199);
                    match(ToInt);
                    setState(200);
                    match(OParen);
                    setState(201);
                    expression(0);
                    setState(202);
                    match(CParen);
                }
                break;
                case 6:
                    _localctx = new ObjFunctionCallExpressionContext(_localctx);
                    enterOuterAlt(_localctx, 6);
                {
                    setState(204);
                    match(Identifier);
                    setState(205);
                    match(Accessor);
                    setState(206);
                    match(Identifier);
                    setState(207);
                    match(OParen);
                    setState(209);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & ((1L << (T__19 - 20)) | (1L << (Println - 20)) | (1L << (Print - 20)) | (1L << (Input - 20)) | (1L << (Assert - 20)) | (1L << (Def - 20)) | (1L << (ToInt - 20)) | (1L << (Null - 20)) | (1L << (Self - 20)) | (1L << (Excl - 20)) | (1L << (Subtract - 20)) | (1L << (OBracket - 20)) | (1L << (OParen - 20)) | (1L << (Bool - 20)) | (1L << (Number - 20)) | (1L << (Identifier - 20)) | (1L << (String - 20)))) != 0)) {
                        {
                            setState(208);
                            exprList();
                        }
                    }

                    setState(211);
                    match(CParen);
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

    public final AllImportContext allImport() throws RecognitionException {
        AllImportContext _localctx = new AllImportContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_allImport);
        try {
            setState(217);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 15, _ctx)) {
                case 1:
                    _localctx = new FileSystemImportStatementContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(214);
                    importStatement();
                }
                break;
                case 2:
                    _localctx = new GithubImportStatementContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(215);
                    importFromGithubStatement();
                }
                break;
                case 3:
                    _localctx = new ImportAllContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(216);
                    importAllStatement();
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

    public final ObjFunctionCallContext objFunctionCall() throws RecognitionException {
        ObjFunctionCallContext _localctx = new ObjFunctionCallContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_objFunctionCall);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(219);
                match(Identifier);
                setState(220);
                match(Accessor);
                setState(221);
                match(Identifier);
                setState(222);
                match(OParen);
                setState(224);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & ((1L << (T__19 - 20)) | (1L << (Println - 20)) | (1L << (Print - 20)) | (1L << (Input - 20)) | (1L << (Assert - 20)) | (1L << (Def - 20)) | (1L << (ToInt - 20)) | (1L << (Null - 20)) | (1L << (Self - 20)) | (1L << (Excl - 20)) | (1L << (Subtract - 20)) | (1L << (OBracket - 20)) | (1L << (OParen - 20)) | (1L << (Bool - 20)) | (1L << (Number - 20)) | (1L << (Identifier - 20)) | (1L << (String - 20)))) != 0)) {
                    {
                        setState(223);
                        exprList();
                    }
                }

                setState(226);
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
        enterRule(_localctx, 16, RULE_header);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(228);
                match(T__0);
                setState(229);
                match(T__1);
                setState(230);
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

    public final IfStatementContext ifStatement() throws RecognitionException {
        IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
        enterRule(_localctx, 18, RULE_ifStatement);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(232);
                ifStat();
                setState(236);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 17, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(233);
                                elseIfStat();
                            }
                        }
                    }
                    setState(238);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 17, _ctx);
                }
                setState(240);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == Else) {
                    {
                        setState(239);
                        elseStat();
                    }
                }

                setState(242);
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
                setState(244);
                match(If);
                setState(245);
                match(OParen);
                setState(246);
                expression(0);
                setState(247);
                match(CParen);
                setState(248);
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

    public final HereStatementContext hereStatement() throws RecognitionException {
        HereStatementContext _localctx = new HereStatementContext(_ctx, getState());
        enterRule(_localctx, 22, RULE_hereStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(250);
                match(Self);
                setState(251);
                match(Accessor);
                setState(252);
                match(Identifier);
                setState(253);
                match(Assign);
                setState(254);
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

    public final VarHereStatementContext varHereStatement() throws RecognitionException {
        VarHereStatementContext _localctx = new VarHereStatementContext(_ctx, getState());
        enterRule(_localctx, 24, RULE_varHereStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(256);
                match(Self);
                setState(257);
                match(Accessor);
                setState(258);
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

    public final ElseIfStatContext elseIfStat() throws RecognitionException {
        ElseIfStatContext _localctx = new ElseIfStatContext(_ctx, getState());
        enterRule(_localctx, 26, RULE_elseIfStat);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(260);
                match(Else);
                setState(261);
                match(If);
                setState(262);
                match(OParen);
                setState(263);
                expression(0);
                setState(264);
                match(CParen);
                setState(265);
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
        enterRule(_localctx, 28, RULE_constructorStatement);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(267);
                match(T__2);
                setState(268);
                match(Identifier);
                setState(269);
                match(OParen);
                setState(271);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & ((1L << (T__19 - 20)) | (1L << (Println - 20)) | (1L << (Print - 20)) | (1L << (Input - 20)) | (1L << (Assert - 20)) | (1L << (Def - 20)) | (1L << (ToInt - 20)) | (1L << (Null - 20)) | (1L << (Self - 20)) | (1L << (Excl - 20)) | (1L << (Subtract - 20)) | (1L << (OBracket - 20)) | (1L << (OParen - 20)) | (1L << (Bool - 20)) | (1L << (Number - 20)) | (1L << (Identifier - 20)) | (1L << (String - 20)))) != 0)) {
                    {
                        setState(270);
                        exprList();
                    }
                }

                setState(273);
                match(CParen);
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

    public final ObjCreateStatementContext objCreateStatement() throws RecognitionException {
        ObjCreateStatementContext _localctx = new ObjCreateStatementContext(_ctx, getState());
        enterRule(_localctx, 30, RULE_objCreateStatement);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(277);
                match(T__3);
                setState(278);
                match(Identifier);
                setState(279);
                match(T__4);
                setState(280);
                match(Identifier);
                setState(281);
                match(OParen);
                setState(283);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & ((1L << (T__19 - 20)) | (1L << (Println - 20)) | (1L << (Print - 20)) | (1L << (Input - 20)) | (1L << (Assert - 20)) | (1L << (Def - 20)) | (1L << (ToInt - 20)) | (1L << (Null - 20)) | (1L << (Self - 20)) | (1L << (Excl - 20)) | (1L << (Subtract - 20)) | (1L << (OBracket - 20)) | (1L << (OParen - 20)) | (1L << (Bool - 20)) | (1L << (Number - 20)) | (1L << (Identifier - 20)) | (1L << (String - 20)))) != 0)) {
                    {
                        setState(282);
                        exprList();
                    }
                }

                setState(285);
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
        enterRule(_localctx, 32, RULE_osExecStatement);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(287);
                match(T__5);
                setState(288);
                match(Accessor);
                setState(289);
                match(Identifier);
                setState(290);
                match(OParen);
                setState(292);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & ((1L << (T__19 - 20)) | (1L << (Println - 20)) | (1L << (Print - 20)) | (1L << (Input - 20)) | (1L << (Assert - 20)) | (1L << (Def - 20)) | (1L << (ToInt - 20)) | (1L << (Null - 20)) | (1L << (Self - 20)) | (1L << (Excl - 20)) | (1L << (Subtract - 20)) | (1L << (OBracket - 20)) | (1L << (OParen - 20)) | (1L << (Bool - 20)) | (1L << (Number - 20)) | (1L << (Identifier - 20)) | (1L << (String - 20)))) != 0)) {
                    {
                        setState(291);
                        expression(0);
                    }
                }

                setState(294);
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
        enterRule(_localctx, 34, RULE_fileWriteStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(296);
                match(Identifier);
                setState(297);
                match(Accessor);
                setState(298);
                match(T__6);
                setState(299);
                match(OParen);
                setState(300);
                expression(0);
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

    public final VerifyFileStatementContext verifyFileStatement() throws RecognitionException {
        VerifyFileStatementContext _localctx = new VerifyFileStatementContext(_ctx, getState());
        enterRule(_localctx, 36, RULE_verifyFileStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(303);
                match(T__7);
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

    public final ElseStatContext elseStat() throws RecognitionException {
        ElseStatContext _localctx = new ElseStatContext(_ctx, getState());
        enterRule(_localctx, 38, RULE_elseStat);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(308);
                match(Else);
                setState(309);
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
        enterRule(_localctx, 40, RULE_functionDecl);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(314);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 22, _ctx);
                while (_alt != 1 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1 + 1) {
                        {
                            {
                                setState(311);
                                _la = _input.LA(1);
                                if (!(_la == Async || _la == Native)) {
                                    _errHandler.recoverInline(this);
                                } else {
                                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                    _errHandler.reportMatch(this);
                                    consume();
                                }
                            }
                        }
                    }
                    setState(316);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 22, _ctx);
                }
                setState(317);
                match(Def);
                setState(318);
                match(Identifier);
                setState(319);
                match(OParen);
                setState(321);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == Identifier) {
                    {
                        setState(320);
                        idList();
                    }
                }

                setState(323);
                match(CParen);
                setState(324);
                block();
                setState(325);
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
        enterRule(_localctx, 42, RULE_forStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(327);
                match(For);
                setState(328);
                match(OParen);
                setState(329);
                match(Identifier);
                setState(330);
                match(Assign);
                setState(331);
                expression(0);
                setState(332);
                match(To);
                setState(333);
                expression(0);
                setState(334);
                match(CParen);
                setState(335);
                block();
                setState(336);
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

    public final ForInStatementContext forInStatement() throws RecognitionException {
        ForInStatementContext _localctx = new ForInStatementContext(_ctx, getState());
        enterRule(_localctx, 44, RULE_forInStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(338);
                match(For);
                setState(339);
                match(OParen);
                setState(340);
                match(Identifier);
                setState(341);
                match(In);
                setState(342);
                match(T__8);
                setState(343);
                match(OParen);
                setState(344);
                expression(0);
                setState(345);
                match(CParen);
                setState(346);
                match(CParen);
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
        enterRule(_localctx, 46, RULE_importStatement);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(350);
                match(T__9);
                setState(351);
                match(Import);
                setState(352);
                match(Identifier);
                setState(357);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 24, _ctx);
                while (_alt != 1 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1 + 1) {
                        {
                            {
                                setState(353);
                                match(T__10);
                                setState(354);
                                match(Identifier);
                            }
                        }
                    }
                    setState(359);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 24, _ctx);
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

    public final AnonymousFunctionContext anonymousFunction() throws RecognitionException {
        AnonymousFunctionContext _localctx = new AnonymousFunctionContext(_ctx, getState());
        enterRule(_localctx, 48, RULE_anonymousFunction);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(360);
                match(Def);
                setState(361);
                match(OParen);
                setState(363);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & ((1L << (T__19 - 20)) | (1L << (Println - 20)) | (1L << (Print - 20)) | (1L << (Input - 20)) | (1L << (Assert - 20)) | (1L << (Def - 20)) | (1L << (ToInt - 20)) | (1L << (Null - 20)) | (1L << (Self - 20)) | (1L << (Excl - 20)) | (1L << (Subtract - 20)) | (1L << (OBracket - 20)) | (1L << (OParen - 20)) | (1L << (Bool - 20)) | (1L << (Number - 20)) | (1L << (Identifier - 20)) | (1L << (String - 20)))) != 0)) {
                    {
                        setState(362);
                        exprList();
                    }
                }

                setState(365);
                match(CParen);
                setState(366);
                match(Subtract);
                setState(367);
                match(GT);
                setState(368);
                block();
                setState(369);
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

    public final ImportFromGithubStatementContext importFromGithubStatement() throws RecognitionException {
        ImportFromGithubStatementContext _localctx = new ImportFromGithubStatementContext(_ctx, getState());
        enterRule(_localctx, 50, RULE_importFromGithubStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(371);
                match(T__9);
                setState(372);
                match(Import);
                setState(373);
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

    public final ImportAllStatementContext importAllStatement() throws RecognitionException {
        ImportAllStatementContext _localctx = new ImportAllStatementContext(_ctx, getState());
        enterRule(_localctx, 52, RULE_importAllStatement);
        try {
            setState(385);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 26, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(375);
                    match(T__9);
                    setState(376);
                    match(Import);
                    setState(377);
                    match(OBracket);
                    setState(378);
                    match(Multiply);
                    setState(379);
                    match(CBracket);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(380);
                    match(T__9);
                    setState(381);
                    match(Import);
                    setState(382);
                    match(OBracket);
                    setState(383);
                    match(T__11);
                    setState(384);
                    match(CBracket);
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

    public final CustomClassContext customClass() throws RecognitionException {
        CustomClassContext _localctx = new CustomClassContext(_ctx, getState());
        enterRule(_localctx, 54, RULE_customClass);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(387);
                match(T__12);
                setState(388);
                match(Class);
                setState(389);
                match(Identifier);
                setState(401);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 27, _ctx);
                while (_alt != 1 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1 + 1) {
                        {
                            {
                                setState(390);
                                match(OBracket);
                                setState(391);
                                match(T__13);
                                setState(392);
                                match(CBracket);
                                setState(393);
                                match(T__14);
                                setState(394);
                                match(Identifier);
                                setState(395);
                                match(T__14);
                                setState(396);
                                match(Colon);
                                setState(397);
                                match(Identifier);
                                setState(398);
                                match(SColon);
                            }
                        }
                    }
                    setState(403);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 27, _ctx);
                }
                setState(404);
                block();
                setState(405);
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

    public final TryCatchStatementContext tryCatchStatement() throws RecognitionException {
        TryCatchStatementContext _localctx = new TryCatchStatementContext(_ctx, getState());
        enterRule(_localctx, 56, RULE_tryCatchStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(407);
                match(Try);
                setState(408);
                block();
                setState(409);
                match(T__15);
                setState(410);
                block();
                setState(411);
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
        enterRule(_localctx, 58, RULE_whileStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(413);
                match(While);
                setState(414);
                match(OParen);
                setState(415);
                expression(0);
                setState(416);
                match(CParen);
                setState(417);
                block();
                setState(418);
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
        enterRule(_localctx, 60, RULE_windowRenderStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(420);
                match(Identifier);
                setState(421);
                match(Accessor);
                setState(422);
                match(T__16);
                setState(423);
                match(OParen);
                setState(424);
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
        enterRule(_localctx, 62, RULE_windowAddCompStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(426);
                match(Identifier);
                setState(427);
                match(Accessor);
                setState(428);
                match(AddComponent);
                setState(429);
                match(OParen);
                setState(430);
                expression(0);
                setState(431);
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
        enterRule(_localctx, 64, RULE_addWebServerTextStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(433);
                match(Identifier);
                setState(434);
                match(Accessor);
                setState(435);
                match(T__17);
                setState(436);
                match(OParen);
                setState(437);
                expression(0);
                setState(438);
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
        enterRule(_localctx, 66, RULE_mainFunctionStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(440);
                match(T__18);
                setState(441);
                block();
                setState(442);
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
        enterRule(_localctx, 68, RULE_idList);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(444);
                match(Identifier);
                setState(449);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == Comma) {
                    {
                        {
                            setState(445);
                            match(Comma);
                            setState(446);
                            match(Identifier);
                        }
                    }
                    setState(451);
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
        enterRule(_localctx, 70, RULE_classStatement);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(452);
                match(Class);
                setState(453);
                match(Identifier);
                setState(456);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == Colon) {
                    {
                        setState(454);
                        match(Colon);
                        setState(455);
                        match(Identifier);
                    }
                }

                setState(458);
                block();
                setState(459);
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

    public final ExprListContext exprList() throws RecognitionException {
        ExprListContext _localctx = new ExprListContext(_ctx, getState());
        enterRule(_localctx, 72, RULE_exprList);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(461);
                expression(0);
                setState(466);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == Comma) {
                    {
                        {
                            setState(462);
                            match(Comma);
                            setState(463);
                            expression(0);
                        }
                    }
                    setState(468);
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
        int _startState = 74;
        enterRecursionRule(_localctx, 74, RULE_expression, _p);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(512);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 37, _ctx)) {
                    case 1: {
                        _localctx = new UnaryMinusExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;

                        setState(470);
                        match(Subtract);
                        setState(471);
                        expression(23);
                    }
                    break;
                    case 2: {
                        _localctx = new NotExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(472);
                        match(Excl);
                        setState(473);
                        expression(22);
                    }
                    break;
                    case 3: {
                        _localctx = new NumberExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(474);
                        match(Number);
                    }
                    break;
                    case 4: {
                        _localctx = new BoolExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(475);
                        match(Bool);
                    }
                    break;
                    case 5: {
                        _localctx = new NullExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(476);
                        match(Null);
                    }
                    break;
                    case 6: {
                        _localctx = new FunctionCallExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(477);
                        functionCall();
                        setState(479);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 31, _ctx)) {
                            case 1: {
                                setState(478);
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
                        setState(481);
                        list();
                        setState(483);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 32, _ctx)) {
                            case 1: {
                                setState(482);
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
                        setState(485);
                        match(Identifier);
                        setState(487);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 33, _ctx)) {
                            case 1: {
                                setState(486);
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
                        setState(489);
                        match(String);
                        setState(491);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 34, _ctx)) {
                            case 1: {
                                setState(490);
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
                        setState(493);
                        match(OParen);
                        setState(494);
                        expression(0);
                        setState(495);
                        match(CParen);
                        setState(497);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 35, _ctx)) {
                            case 1: {
                                setState(496);
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
                        setState(499);
                        match(Input);
                        setState(500);
                        match(OParen);
                        setState(502);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == String) {
                            {
                                setState(501);
                                match(String);
                            }
                        }

                        setState(504);
                        match(CParen);
                    }
                    break;
                    case 12: {
                        _localctx = new HereVarExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(505);
                        varHereStatement();
                    }
                    break;
                    case 13: {
                        _localctx = new RandomExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(506);
                        match(T__19);
                        setState(507);
                        match(OParen);
                        setState(508);
                        expression(0);
                        setState(509);
                        match(CParen);
                    }
                    break;
                    case 14: {
                        _localctx = new AnonymousFunctionExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(511);
                        anonymousFunction();
                    }
                    break;
                }
                _ctx.stop = _input.LT(-1);
                setState(546);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 39, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(544);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 38, _ctx)) {
                                case 1: {
                                    _localctx = new PowerExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(514);
                                    if (!(precpred(_ctx, 21)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 21)");
                                    setState(515);
                                    match(Pow);
                                    setState(516);
                                    expression(21);
                                }
                                break;
                                case 2: {
                                    _localctx = new MultExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(517);
                                    if (!(precpred(_ctx, 20)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 20)");
                                    setState(518);
                                    ((MultExpressionContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Multiply) | (1L << Divide) | (1L << Modulus))) != 0))) {
                                        ((MultExpressionContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(519);
                                    expression(21);
                                }
                                break;
                                case 3: {
                                    _localctx = new AddExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(520);
                                    if (!(precpred(_ctx, 19)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 19)");
                                    setState(521);
                                    ((AddExpressionContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!(_la == Add || _la == Subtract)) {
                                        ((AddExpressionContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(522);
                                    expression(20);
                                }
                                break;
                                case 4: {
                                    _localctx = new CompExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(523);
                                    if (!(precpred(_ctx, 18)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 18)");
                                    setState(524);
                                    ((CompExpressionContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GTEquals) | (1L << LTEquals) | (1L << GT) | (1L << LT))) != 0))) {
                                        ((CompExpressionContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(525);
                                    expression(19);
                                }
                                break;
                                case 5: {
                                    _localctx = new EqExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(526);
                                    if (!(precpred(_ctx, 17)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 17)");
                                    setState(527);
                                    ((EqExpressionContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!(_la == Equals || _la == NEquals)) {
                                        ((EqExpressionContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(528);
                                    expression(18);
                                }
                                break;
                                case 6: {
                                    _localctx = new AndExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(529);
                                    if (!(precpred(_ctx, 16)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 16)");
                                    setState(530);
                                    match(And);
                                    setState(531);
                                    expression(17);
                                }
                                break;
                                case 7: {
                                    _localctx = new OrExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(532);
                                    if (!(precpred(_ctx, 15)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 15)");
                                    setState(533);
                                    match(Or);
                                    setState(534);
                                    expression(16);
                                }
                                break;
                                case 8: {
                                    _localctx = new TernaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(535);
                                    if (!(precpred(_ctx, 14)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 14)");
                                    setState(536);
                                    match(QMark);
                                    setState(537);
                                    expression(0);
                                    setState(538);
                                    match(Colon);
                                    setState(539);
                                    expression(15);
                                }
                                break;
                                case 9: {
                                    _localctx = new InExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(541);
                                    if (!(precpred(_ctx, 13)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 13)");
                                    setState(542);
                                    match(In);
                                    setState(543);
                                    expression(14);
                                }
                                break;
                            }
                        }
                    }
                    setState(548);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 39, _ctx);
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
        enterRule(_localctx, 76, RULE_list);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(549);
                match(OBracket);
                setState(551);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & ((1L << (T__19 - 20)) | (1L << (Println - 20)) | (1L << (Print - 20)) | (1L << (Input - 20)) | (1L << (Assert - 20)) | (1L << (Def - 20)) | (1L << (ToInt - 20)) | (1L << (Null - 20)) | (1L << (Self - 20)) | (1L << (Excl - 20)) | (1L << (Subtract - 20)) | (1L << (OBracket - 20)) | (1L << (OParen - 20)) | (1L << (Bool - 20)) | (1L << (Number - 20)) | (1L << (Identifier - 20)) | (1L << (String - 20)))) != 0)) {
                    {
                        setState(550);
                        exprList();
                    }
                }

                setState(553);
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
        enterRule(_localctx, 78, RULE_indexes);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(559);
                _errHandler.sync(this);
                _alt = 1;
                do {
                    switch (_alt) {
                        case 1: {
                            {
                                setState(555);
                                match(OBracket);
                                setState(556);
                                expression(0);
                                setState(557);
                                match(CBracket);
                            }
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                    setState(561);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 41, _ctx);
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
            case 37:
                return expression_sempred((ExpressionContext) _localctx, predIndex);
        }
        return true;
    }

    private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
        switch (predIndex) {
            case 0:
                return precpred(_ctx, 21);
            case 1:
                return precpred(_ctx, 20);
            case 2:
                return precpred(_ctx, 19);
            case 3:
                return precpred(_ctx, 18);
            case 4:
                return precpred(_ctx, 17);
            case 5:
                return precpred(_ctx, 16);
            case 6:
                return precpred(_ctx, 15);
            case 7:
                return precpred(_ctx, 14);
            case 8:
                return precpred(_ctx, 13);
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

        public List<AllImportContext> allImport() {
            return getRuleContexts(AllImportContext.class);
        }

        public AllImportContext allImport(int i) {
            return getRuleContext(AllImportContext.class, i);
        }

        public List<TerminalNode> SColon() {
            return getTokens(QParser.SColon);
        }

        public TerminalNode SColon(int i) {
            return getToken(QParser.SColon, i);
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

        public FunctionCallContext functionCall() {
            return getRuleContext(FunctionCallContext.class, 0);
        }

        public TerminalNode SColon() {
            return getToken(QParser.SColon, 0);
        }

        public IfStatementContext ifStatement() {
            return getRuleContext(IfStatementContext.class, 0);
        }

        public ForStatementContext forStatement() {
            return getRuleContext(ForStatementContext.class, 0);
        }

        public ForInStatementContext forInStatement() {
            return getRuleContext(ForInStatementContext.class, 0);
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

        public ObjCreateStatementContext objCreateStatement() {
            return getRuleContext(ObjCreateStatementContext.class, 0);
        }

        public OsExecStatementContext osExecStatement() {
            return getRuleContext(OsExecStatementContext.class, 0);
        }

        public AnonymousFunctionContext anonymousFunction() {
            return getRuleContext(AnonymousFunctionContext.class, 0);
        }

        public HereStatementContext hereStatement() {
            return getRuleContext(HereStatementContext.class, 0);
        }

        public AssignmentContext assignment() {
            return getRuleContext(AssignmentContext.class, 0);
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

        public List<TerminalNode> Const() {
            return getTokens(QParser.Const);
        }

        public TerminalNode Const(int i) {
            return getToken(QParser.Const, i);
        }

        public List<TerminalNode> Noval() {
            return getTokens(QParser.Noval);
        }

        public TerminalNode Noval(int i) {
            return getToken(QParser.Noval, i);
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

    public static class ObjFunctionCallExpressionContext extends FunctionCallContext {
        public ObjFunctionCallExpressionContext(FunctionCallContext ctx) {
            copyFrom(ctx);
        }

        public List<TerminalNode> Identifier() {
            return getTokens(QParser.Identifier);
        }

        public TerminalNode Identifier(int i) {
            return getToken(QParser.Identifier, i);
        }

        public TerminalNode Accessor() {
            return getToken(QParser.Accessor, 0);
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
            if (listener instanceof QListener) ((QListener) listener).enterObjFunctionCallExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitObjFunctionCallExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor)
                return ((QVisitor<? extends T>) visitor).visitObjFunctionCallExpression(this);
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

    public static class AllImportContext extends ParserRuleContext {
        public AllImportContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public AllImportContext() {
        }

        @Override
        public int getRuleIndex() {
            return RULE_allImport;
        }

        public void copyFrom(AllImportContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class FileSystemImportStatementContext extends AllImportContext {
        public FileSystemImportStatementContext(AllImportContext ctx) {
            copyFrom(ctx);
        }

        public ImportStatementContext importStatement() {
            return getRuleContext(ImportStatementContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterFileSystemImportStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitFileSystemImportStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor)
                return ((QVisitor<? extends T>) visitor).visitFileSystemImportStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class GithubImportStatementContext extends AllImportContext {
        public GithubImportStatementContext(AllImportContext ctx) {
            copyFrom(ctx);
        }

        public ImportFromGithubStatementContext importFromGithubStatement() {
            return getRuleContext(ImportFromGithubStatementContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterGithubImportStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitGithubImportStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitGithubImportStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ImportAllContext extends AllImportContext {
        public ImportAllContext(AllImportContext ctx) {
            copyFrom(ctx);
        }

        public ImportAllStatementContext importAllStatement() {
            return getRuleContext(ImportAllStatementContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterImportAll(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitImportAll(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitImportAll(this);
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

        public TerminalNode Accessor() {
            return getToken(QParser.Accessor, 0);
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

    public static class HereStatementContext extends ParserRuleContext {
        public HereStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Self() {
            return getToken(QParser.Self, 0);
        }

        public TerminalNode Accessor() {
            return getToken(QParser.Accessor, 0);
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

        @Override
        public int getRuleIndex() {
            return RULE_hereStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterHereStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitHereStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitHereStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class VarHereStatementContext extends ParserRuleContext {
        public VarHereStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Self() {
            return getToken(QParser.Self, 0);
        }

        public TerminalNode Accessor() {
            return getToken(QParser.Accessor, 0);
        }

        public TerminalNode Identifier() {
            return getToken(QParser.Identifier, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_varHereStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterVarHereStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitVarHereStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitVarHereStatement(this);
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

    public static class OsExecStatementContext extends ParserRuleContext {
        public OsExecStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Accessor() {
            return getToken(QParser.Accessor, 0);
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

        public TerminalNode Accessor() {
            return getToken(QParser.Accessor, 0);
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

    public static class ElseStatContext extends ParserRuleContext {
        public ElseStatContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Else() {
            return getToken(QParser.Else, 0);
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

        public List<TerminalNode> Async() {
            return getTokens(QParser.Async);
        }

        public TerminalNode Async(int i) {
            return getToken(QParser.Async, i);
        }

        public List<TerminalNode> Native() {
            return getTokens(QParser.Native);
        }

        public TerminalNode Native(int i) {
            return getToken(QParser.Native, i);
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

        public TerminalNode OParen() {
            return getToken(QParser.OParen, 0);
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

        public TerminalNode CParen() {
            return getToken(QParser.CParen, 0);
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

    public static class ForInStatementContext extends ParserRuleContext {
        public ForInStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode For() {
            return getToken(QParser.For, 0);
        }

        public List<TerminalNode> OParen() {
            return getTokens(QParser.OParen);
        }

        public TerminalNode OParen(int i) {
            return getToken(QParser.OParen, i);
        }

        public TerminalNode Identifier() {
            return getToken(QParser.Identifier, 0);
        }

        public TerminalNode In() {
            return getToken(QParser.In, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public List<TerminalNode> CParen() {
            return getTokens(QParser.CParen);
        }

        public TerminalNode CParen(int i) {
            return getToken(QParser.CParen, i);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public TerminalNode End() {
            return getToken(QParser.End, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_forInStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterForInStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitForInStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitForInStatement(this);
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

    public static class AnonymousFunctionContext extends ParserRuleContext {
        public AnonymousFunctionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Def() {
            return getToken(QParser.Def, 0);
        }

        public TerminalNode OParen() {
            return getToken(QParser.OParen, 0);
        }

        public TerminalNode CParen() {
            return getToken(QParser.CParen, 0);
        }

        public TerminalNode Subtract() {
            return getToken(QParser.Subtract, 0);
        }

        public TerminalNode GT() {
            return getToken(QParser.GT, 0);
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
            return RULE_anonymousFunction;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterAnonymousFunction(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitAnonymousFunction(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitAnonymousFunction(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ImportFromGithubStatementContext extends ParserRuleContext {
        public ImportFromGithubStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Import() {
            return getToken(QParser.Import, 0);
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

    public static class ImportAllStatementContext extends ParserRuleContext {
        public ImportAllStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Import() {
            return getToken(QParser.Import, 0);
        }

        public TerminalNode OBracket() {
            return getToken(QParser.OBracket, 0);
        }

        public TerminalNode Multiply() {
            return getToken(QParser.Multiply, 0);
        }

        public TerminalNode CBracket() {
            return getToken(QParser.CBracket, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_importAllStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterImportAllStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitImportAllStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitImportAllStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class CustomClassContext extends ParserRuleContext {
        public CustomClassContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Class() {
            return getToken(QParser.Class, 0);
        }

        public List<TerminalNode> Identifier() {
            return getTokens(QParser.Identifier);
        }

        public TerminalNode Identifier(int i) {
            return getToken(QParser.Identifier, i);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public TerminalNode End() {
            return getToken(QParser.End, 0);
        }

        public List<TerminalNode> OBracket() {
            return getTokens(QParser.OBracket);
        }

        public TerminalNode OBracket(int i) {
            return getToken(QParser.OBracket, i);
        }

        public List<TerminalNode> CBracket() {
            return getTokens(QParser.CBracket);
        }

        public TerminalNode CBracket(int i) {
            return getToken(QParser.CBracket, i);
        }

        public List<TerminalNode> Colon() {
            return getTokens(QParser.Colon);
        }

        public TerminalNode Colon(int i) {
            return getToken(QParser.Colon, i);
        }

        public List<TerminalNode> SColon() {
            return getTokens(QParser.SColon);
        }

        public TerminalNode SColon(int i) {
            return getToken(QParser.SColon, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_customClass;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterCustomClass(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitCustomClass(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitCustomClass(this);
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

        public TerminalNode Accessor() {
            return getToken(QParser.Accessor, 0);
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

        public TerminalNode Accessor() {
            return getToken(QParser.Accessor, 0);
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

        public TerminalNode Accessor() {
            return getToken(QParser.Accessor, 0);
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

        public List<TerminalNode> Identifier() {
            return getTokens(QParser.Identifier);
        }

        public TerminalNode Identifier(int i) {
            return getToken(QParser.Identifier, i);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public TerminalNode End() {
            return getToken(QParser.End, 0);
        }

        public TerminalNode Colon() {
            return getToken(QParser.Colon, 0);
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

    public static class HereVarExpressionContext extends ExpressionContext {
        public HereVarExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        public VarHereStatementContext varHereStatement() {
            return getRuleContext(VarHereStatementContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterHereVarExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitHereVarExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitHereVarExpression(this);
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

    public static class AnonymousFunctionExpressionContext extends ExpressionContext {
        public AnonymousFunctionExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        public AnonymousFunctionContext anonymousFunction() {
            return getRuleContext(AnonymousFunctionContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterAnonymousFunctionExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitAnonymousFunctionExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor)
                return ((QVisitor<? extends T>) visitor).visitAnonymousFunctionExpression(this);
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

    public static class RandomExpressionContext extends ExpressionContext {
        public RandomExpressionContext(ExpressionContext ctx) {
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

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterRandomExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitRandomExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitRandomExpression(this);
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