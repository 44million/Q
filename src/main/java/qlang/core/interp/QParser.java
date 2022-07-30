// Generated from /Users/harryharbuck-marlowe/Downloads/Q/src/main/java/qlang/core/internal/Q.g4 by ANTLR 4.9.2
package qlang.core.interp;

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
            T__9 = 10, T__10 = 11, T__11 = 12, T__12 = 13, Println = 14, Async = 15, Var = 16, Import = 17,
            Print = 18, Input = 19, Assert = 20, Def = 21, If = 22, Else = 23, Package = 24, Return = 25,
            For = 26, While = 27, To = 28, Do = 29, End = 30, In = 31, Null = 32, Try = 33, Class = 34,
            Const = 35, Self = 36, Native = 37, Or = 38, Accessor = 39, And = 40, Equals = 41, NEquals = 42,
            GTEquals = 43, LTEquals = 44, Pow = 45, Excl = 46, GT = 47, LT = 48, Add = 49, Subtract = 50,
            Multiply = 51, Divide = 52, Modulus = 53, OBrace = 54, CBrace = 55, OBracket = 56,
            CBracket = 57, OParen = 58, CParen = 59, SColon = 60, Assign = 61, Comma = 62, QMark = 63,
            Colon = 64, Bool = 65, Number = 66, Identifier = 67, String = 68, Comment = 69, Space = 70;
    public static final int
            RULE_parse = 0, RULE_block = 1, RULE_statement = 2, RULE_reAssignment = 3,
            RULE_assignment = 4, RULE_functionCall = 5, RULE_allImport = 6, RULE_objFunctionCall = 7,
            RULE_folderImport = 8, RULE_packageStatement = 9, RULE_header = 10, RULE_ifStatement = 11,
            RULE_ifStat = 12, RULE_hereStatement = 13, RULE_varHereStatement = 14,
            RULE_elseIfStat = 15, RULE_constructorStatement = 16, RULE_objCreateStatement = 17,
            RULE_sysFunctionCall = 18, RULE_fileWriteStatement = 19, RULE_elseStat = 20,
            RULE_functionDecl = 21, RULE_forStatement = 22, RULE_forInStatement = 23,
            RULE_importStatement = 24, RULE_anonymousFunction = 25, RULE_importFromGithubStatement = 26,
            RULE_importAllStatement = 27, RULE_atStatement = 28, RULE_tryCatchStatement = 29,
            RULE_whileStatement = 30, RULE_mainFunctionStatement = 31, RULE_idList = 32,
            RULE_classStatement = 33, RULE_exprList = 34, RULE_expression = 35, RULE_list = 36,
            RULE_objVar = 37, RULE_indexes = 38;
    public static final String[] ruleNames = makeRuleNames();
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3H\u022f\4\2\t\2\4" +
                    "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
                    "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
                    "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!" +
                    "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\5\2R\n\2\3\2\5\2" +
                    "U\n\2\3\2\3\2\3\2\7\2Z\n\2\f\2\16\2]\13\2\3\2\3\2\3\2\3\3\3\3\7\3d\n\3" +
                    "\f\3\16\3g\13\3\3\3\3\3\3\3\3\3\5\3m\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3" +
                    "\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0082\n\4\3\4\3\4\3" +
                    "\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0091\n\4\3\5\3\5\5\5\u0095" +
                    "\n\5\3\5\5\5\u0098\n\5\3\5\3\5\3\5\3\6\3\6\3\6\5\6\u00a0\n\6\3\6\3\6\5" +
                    "\6\u00a4\n\6\3\7\3\7\3\7\5\7\u00a9\n\7\3\7\3\7\3\7\3\7\5\7\u00af\n\7\3" +
                    "\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00c1" +
                    "\n\7\3\7\5\7\u00c4\n\7\3\b\3\b\3\b\3\b\5\b\u00ca\n\b\3\t\3\t\3\t\3\t\3" +
                    "\t\5\t\u00d1\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00db\n\n\f\n\16" +
                    "\n\u00de\13\n\3\n\3\n\3\13\3\13\3\13\3\13\7\13\u00e6\n\13\f\13\16\13\u00e9" +
                    "\13\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\7\r\u00f3\n\r\f\r\16\r\u00f6" +
                    "\13\r\3\r\5\r\u00f9\n\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17" +
                    "\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21" +
                    "\3\21\3\21\3\21\3\22\3\22\3\22\3\22\5\22\u011a\n\22\3\22\3\22\3\22\3\22" +
                    "\3\22\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0127\n\23\3\23\5\23\u012a\n" +
                    "\23\3\24\3\24\3\24\3\24\3\24\5\24\u0131\n\24\3\24\3\24\3\25\3\25\3\25" +
                    "\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\7\27\u0141\n\27\f\27\16" +
                    "\27\u0144\13\27\3\27\3\27\3\27\3\27\5\27\u014a\n\27\3\27\3\27\3\27\3\27" +
                    "\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31" +
                    "\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32" +
                    "\3\32\3\32\3\32\7\32\u016f\n\32\f\32\16\32\u0172\13\32\3\33\3\33\3\33" +
                    "\5\33\u0177\n\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34" +
                    "\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37" +
                    "\3\37\3\37\3\37\3\37\7\37\u0196\n\37\f\37\16\37\u0199\13\37\3\37\3\37" +
                    "\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\7" +
                    "\"\u01b2\n\"\f\"\16\"\u01b5\13\"\3#\5#\u01b8\n#\3#\3#\3#\3#\5#\u01be\n" +
                    "#\3#\3#\3#\3$\3$\3$\7$\u01c6\n$\f$\16$\u01c9\13$\3%\3%\3%\3%\3%\3%\3%" +
                    "\3%\3%\3%\5%\u01d5\n%\3%\3%\5%\u01d9\n%\3%\3%\5%\u01dd\n%\3%\3%\5%\u01e1" +
                    "\n%\3%\3%\3%\3%\5%\u01e7\n%\3%\3%\3%\5%\u01ec\n%\3%\3%\3%\3%\3%\3%\3%" +
                    "\3%\3%\3%\5%\u01f8\n%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%" +
                    "\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\7%\u0218\n%\f%\16%\u021b\13" +
                    "%\3&\3&\5&\u021f\n&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\6(\u022b\n(\r(\16" +
                    "(\u022c\3(\b[\u00dc\u00e7\u0142\u0170\u0197\3H)\2\4\6\b\n\f\16\20\22\24" +
                    "\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLN\2\b\4\2\22\22%%\4\2\21" +
                    "\21\'\'\3\2\65\67\3\2\63\64\4\2-.\61\62\3\2+,\2\u025e\2Q\3\2\2\2\4e\3" +
                    "\2\2\2\6\u0090\3\2\2\2\b\u0094\3\2\2\2\n\u009c\3\2\2\2\f\u00c3\3\2\2\2" +
                    "\16\u00c9\3\2\2\2\20\u00cb\3\2\2\2\22\u00d4\3\2\2\2\24\u00e1\3\2\2\2\26" +
                    "\u00ec\3\2\2\2\30\u00f0\3\2\2\2\32\u00fc\3\2\2\2\34\u0103\3\2\2\2\36\u0109" +
                    "\3\2\2\2 \u010d\3\2\2\2\"\u0115\3\2\2\2$\u0120\3\2\2\2&\u012b\3\2\2\2" +
                    "(\u0134\3\2\2\2*\u013b\3\2\2\2,\u0142\3\2\2\2.\u0150\3\2\2\2\60\u015c" +
                    "\3\2\2\2\62\u0169\3\2\2\2\64\u0173\3\2\2\2\66\u017f\3\2\2\28\u0183\3\2" +
                    "\2\2:\u0189\3\2\2\2<\u018c\3\2\2\2>\u019d\3\2\2\2@\u01a5\3\2\2\2B\u01ae" +
                    "\3\2\2\2D\u01b7\3\2\2\2F\u01c2\3\2\2\2H\u01f7\3\2\2\2J\u021c\3\2\2\2L" +
                    "\u0222\3\2\2\2N\u022a\3\2\2\2PR\5\26\f\2QP\3\2\2\2QR\3\2\2\2RT\3\2\2\2" +
                    "SU\5\24\13\2TS\3\2\2\2TU\3\2\2\2U[\3\2\2\2VW\5\16\b\2WX\7>\2\2XZ\3\2\2" +
                    "\2YV\3\2\2\2Z]\3\2\2\2[\\\3\2\2\2[Y\3\2\2\2\\^\3\2\2\2][\3\2\2\2^_\5\4" +
                    "\3\2_`\7\2\2\3`\3\3\2\2\2ad\5\6\4\2bd\5,\27\2ca\3\2\2\2cb\3\2\2\2dg\3" +
                    "\2\2\2ec\3\2\2\2ef\3\2\2\2fl\3\2\2\2ge\3\2\2\2hi\7\33\2\2ij\5H%\2jk\7" +
                    ">\2\2km\3\2\2\2lh\3\2\2\2lm\3\2\2\2m\5\3\2\2\2no\5\f\7\2op\7>\2\2p\u0091" +
                    "\3\2\2\2q\u0091\5\30\r\2r\u0091\5.\30\2s\u0091\5\60\31\2t\u0091\5> \2" +
                    "u\u0091\5<\37\2v\u0091\5@!\2wx\5\b\5\2xy\7>\2\2y\u0091\3\2\2\2z\u0091" +
                    "\5D#\2{\u0091\5\"\22\2|}\5(\25\2}~\7>\2\2~\u0091\3\2\2\2\177\u0081\5\20" +
                    "\t\2\u0080\u0082\7>\2\2\u0081\u0080\3\2\2\2\u0081\u0082\3\2\2\2\u0082" +
                    "\u0091\3\2\2\2\u0083\u0084\5$\23\2\u0084\u0085\7>\2\2\u0085\u0091\3\2" +
                    "\2\2\u0086\u0087\5&\24\2\u0087\u0088\7>\2\2\u0088\u0091\3\2\2\2\u0089" +
                    "\u0091\5\64\33\2\u008a\u008b\5\34\17\2\u008b\u008c\7>\2\2\u008c\u0091" +
                    "\3\2\2\2\u008d\u008e\5\n\6\2\u008e\u008f\7>\2\2\u008f\u0091\3\2\2\2\u0090" +
                    "n\3\2\2\2\u0090q\3\2\2\2\u0090r\3\2\2\2\u0090s\3\2\2\2\u0090t\3\2\2\2" +
                    "\u0090u\3\2\2\2\u0090v\3\2\2\2\u0090w\3\2\2\2\u0090z\3\2\2\2\u0090{\3" +
                    "\2\2\2\u0090|\3\2\2\2\u0090\177\3\2\2\2\u0090\u0083\3\2\2\2\u0090\u0086" +
                    "\3\2\2\2\u0090\u0089\3\2\2\2\u0090\u008a\3\2\2\2\u0090\u008d\3\2\2\2\u0091" +
                    "\7\3\2\2\2\u0092\u0095\7E\2\2\u0093\u0095\5L\'\2\u0094\u0092\3\2\2\2\u0094" +
                    "\u0093\3\2\2\2\u0095\u0097\3\2\2\2\u0096\u0098\5N(\2\u0097\u0096\3\2\2" +
                    "\2\u0097\u0098\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\7?\2\2\u009a\u009b" +
                    "\5H%\2\u009b\t\3\2\2\2\u009c\u009d\t\2\2\2\u009d\u00a3\7E\2\2\u009e\u00a0" +
                    "\5N(\2\u009f\u009e\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1" +
                    "\u00a2\7?\2\2\u00a2\u00a4\5H%\2\u00a3\u009f\3\2\2\2\u00a3\u00a4\3\2\2" +
                    "\2\u00a4\13\3\2\2\2\u00a5\u00a6\7E\2\2\u00a6\u00a8\7<\2\2\u00a7\u00a9" +
                    "\5F$\2\u00a8\u00a7\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa" +
                    "\u00c4\7=\2\2\u00ab\u00ac\7\20\2\2\u00ac\u00ae\7<\2\2\u00ad\u00af\5H%" +
                    "\2\u00ae\u00ad\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00c4" +
                    "\7=\2\2\u00b1\u00b2\7\24\2\2\u00b2\u00b3\7<\2\2\u00b3\u00b4\5H%\2\u00b4" +
                    "\u00b5\7=\2\2\u00b5\u00c4\3\2\2\2\u00b6\u00b7\7\26\2\2\u00b7\u00b8\7<" +
                    "\2\2\u00b8\u00b9\5H%\2\u00b9\u00ba\7=\2\2\u00ba\u00c4\3\2\2\2\u00bb\u00bc" +
                    "\7E\2\2\u00bc\u00bd\7)\2\2\u00bd\u00be\7E\2\2\u00be\u00c0\7<\2\2\u00bf" +
                    "\u00c1\5F$\2\u00c0\u00bf\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\3\2\2" +
                    "\2\u00c2\u00c4\7=\2\2\u00c3\u00a5\3\2\2\2\u00c3\u00ab\3\2\2\2\u00c3\u00b1" +
                    "\3\2\2\2\u00c3\u00b6\3\2\2\2\u00c3\u00bb\3\2\2\2\u00c4\r\3\2\2\2\u00c5" +
                    "\u00ca\5\62\32\2\u00c6\u00ca\5\66\34\2\u00c7\u00ca\58\35\2\u00c8\u00ca" +
                    "\5\22\n\2\u00c9\u00c5\3\2\2\2\u00c9\u00c6\3\2\2\2\u00c9\u00c7\3\2\2\2" +
                    "\u00c9\u00c8\3\2\2\2\u00ca\17\3\2\2\2\u00cb\u00cc\7E\2\2\u00cc\u00cd\7" +
                    ")\2\2\u00cd\u00ce\7E\2\2\u00ce\u00d0\7<\2\2\u00cf\u00d1\5F$\2\u00d0\u00cf" +
                    "\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\7=\2\2\u00d3" +
                    "\21\3\2\2\2\u00d4\u00d5\7\3\2\2\u00d5\u00d6\7\23\2\2\u00d6\u00d7\7:\2" +
                    "\2\u00d7\u00dc\7E\2\2\u00d8\u00d9\7\4\2\2\u00d9\u00db\7E\2\2\u00da\u00d8" +
                    "\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd" +
                    "\u00df\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e0\7;\2\2\u00e0\23\3\2\2\2" +
                    "\u00e1\u00e2\7\32\2\2\u00e2\u00e7\7E\2\2\u00e3\u00e4\7\4\2\2\u00e4\u00e6" +
                    "\7E\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e7" +
                    "\u00e5\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00eb\7>" +
                    "\2\2\u00eb\25\3\2\2\2\u00ec\u00ed\7\5\2\2\u00ed\u00ee\7\6\2\2\u00ee\u00ef" +
                    "\7E\2\2\u00ef\27\3\2\2\2\u00f0\u00f4\5\32\16\2\u00f1\u00f3\5 \21\2\u00f2" +
                    "\u00f1\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2" +
                    "\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00f9\5*\26\2\u00f8" +
                    "\u00f7\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\7 " +
                    "\2\2\u00fb\31\3\2\2\2\u00fc\u00fd\7\30\2\2\u00fd\u00fe\7<\2\2\u00fe\u00ff" +
                    "\5H%\2\u00ff\u0100\7=\2\2\u0100\u0101\7B\2\2\u0101\u0102\5\4\3\2\u0102" +
                    "\33\3\2\2\2\u0103\u0104\7&\2\2\u0104\u0105\7)\2\2\u0105\u0106\7E\2\2\u0106" +
                    "\u0107\7?\2\2\u0107\u0108\5H%\2\u0108\35\3\2\2\2\u0109\u010a\7&\2\2\u010a" +
                    "\u010b\7)\2\2\u010b\u010c\7E\2\2\u010c\37\3\2\2\2\u010d\u010e\7\31\2\2" +
                    "\u010e\u010f\7\30\2\2\u010f\u0110\7<\2\2\u0110\u0111\5H%\2\u0111\u0112" +
                    "\7=\2\2\u0112\u0113\7B\2\2\u0113\u0114\5\4\3\2\u0114!\3\2\2\2\u0115\u0116" +
                    "\7\7\2\2\u0116\u0117\7E\2\2\u0117\u0119\7<\2\2\u0118\u011a\5F$\2\u0119" +
                    "\u0118\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\7=" +
                    "\2\2\u011c\u011d\7B\2\2\u011d\u011e\5\4\3\2\u011e\u011f\7 \2\2\u011f#" +
                    "\3\2\2\2\u0120\u0121\7\b\2\2\u0121\u0122\7E\2\2\u0122\u0123\7\t\2\2\u0123" +
                    "\u0129\7E\2\2\u0124\u0126\7<\2\2\u0125\u0127\5F$\2\u0126\u0125\3\2\2\2" +
                    "\u0126\u0127\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u012a\7=\2\2\u0129\u0124" +
                    "\3\2\2\2\u0129\u012a\3\2\2\2\u012a%\3\2\2\2\u012b\u012c\7\n\2\2\u012c" +
                    "\u012d\7)\2\2\u012d\u012e\7E\2\2\u012e\u0130\7<\2\2\u012f\u0131\5H%\2" +
                    "\u0130\u012f\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0133" +
                    "\7=\2\2\u0133\'\3\2\2\2\u0134\u0135\7E\2\2\u0135\u0136\7)\2\2\u0136\u0137" +
                    "\7\13\2\2\u0137\u0138\7<\2\2\u0138\u0139\5H%\2\u0139\u013a\7=\2\2\u013a" +
                    ")\3\2\2\2\u013b\u013c\7\31\2\2\u013c\u013d\7B\2\2\u013d\u013e\5\4\3\2" +
                    "\u013e+\3\2\2\2\u013f\u0141\t\3\2\2\u0140\u013f\3\2\2\2\u0141\u0144\3" +
                    "\2\2\2\u0142\u0143\3\2\2\2\u0142\u0140\3\2\2\2\u0143\u0145\3\2\2\2\u0144" +
                    "\u0142\3\2\2\2\u0145\u0146\7\27\2\2\u0146\u0147\7E\2\2\u0147\u0149\7<" +
                    "\2\2\u0148\u014a\5B\"\2\u0149\u0148\3\2\2\2\u0149\u014a\3\2\2\2\u014a" +
                    "\u014b\3\2\2\2\u014b\u014c\7=\2\2\u014c\u014d\7B\2\2\u014d\u014e\5\4\3" +
                    "\2\u014e\u014f\7 \2\2\u014f-\3\2\2\2\u0150\u0151\7\34\2\2\u0151\u0152" +
                    "\7<\2\2\u0152\u0153\7E\2\2\u0153\u0154\7?\2\2\u0154\u0155\5H%\2\u0155" +
                    "\u0156\7\36\2\2\u0156\u0157\5H%\2\u0157\u0158\7=\2\2\u0158\u0159\7B\2" +
                    "\2\u0159\u015a\5\4\3\2\u015a\u015b\7 \2\2\u015b/\3\2\2\2\u015c\u015d\7" +
                    "\34\2\2\u015d\u015e\7<\2\2\u015e\u015f\7E\2\2\u015f\u0160\7!\2\2\u0160" +
                    "\u0161\7\f\2\2\u0161\u0162\7<\2\2\u0162\u0163\5H%\2\u0163\u0164\7=\2\2" +
                    "\u0164\u0165\7=\2\2\u0165\u0166\7B\2\2\u0166\u0167\5\4\3\2\u0167\u0168" +
                    "\7 \2\2\u0168\61\3\2\2\2\u0169\u016a\7\3\2\2\u016a\u016b\7\23\2\2\u016b" +
                    "\u0170\7E\2\2\u016c\u016d\7\4\2\2\u016d\u016f\7E\2\2\u016e\u016c\3\2\2" +
                    "\2\u016f\u0172\3\2\2\2\u0170\u0171\3\2\2\2\u0170\u016e\3\2\2\2\u0171\63" +
                    "\3\2\2\2\u0172\u0170\3\2\2\2\u0173\u0174\7\27\2\2\u0174\u0176\7<\2\2\u0175" +
                    "\u0177\5F$\2\u0176\u0175\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0178\3\2\2" +
                    "\2\u0178\u0179\7=\2\2\u0179\u017a\7B\2\2\u017a\u017b\7\64\2\2\u017b\u017c" +
                    "\7\61\2\2\u017c\u017d\5\4\3\2\u017d\u017e\7 \2\2\u017e\65\3\2\2\2\u017f" +
                    "\u0180\7\3\2\2\u0180\u0181\7\23\2\2\u0181\u0182\5H%\2\u0182\67\3\2\2\2" +
                    "\u0183\u0184\7\3\2\2\u0184\u0185\7\23\2\2\u0185\u0186\7:\2\2\u0186\u0187" +
                    "\7\65\2\2\u0187\u0188\7;\2\2\u01889\3\2\2\2\u0189\u018a\7\5\2\2\u018a" +
                    "\u018b\7E\2\2\u018b;\3\2\2\2\u018c\u018d\7#\2\2\u018d\u018e\7B\2\2\u018e" +
                    "\u018f\5\4\3\2\u018f\u0190\7\r\2\2\u0190\u0197\7B\2\2\u0191\u0192\7\62" +
                    "\2\2\u0192\u0193\5H%\2\u0193\u0194\7\61\2\2\u0194\u0196\3\2\2\2\u0195" +
                    "\u0191\3\2\2\2\u0196\u0199\3\2\2\2\u0197\u0198\3\2\2\2\u0197\u0195\3\2" +
                    "\2\2\u0198\u019a\3\2\2\2\u0199\u0197\3\2\2\2\u019a\u019b\5\4\3\2\u019b" +
                    "\u019c\7 \2\2\u019c=\3\2\2\2\u019d\u019e\7\35\2\2\u019e\u019f\7<\2\2\u019f" +
                    "\u01a0\5H%\2\u01a0\u01a1\7=\2\2\u01a1\u01a2\7B\2\2\u01a2\u01a3\5\4\3\2" +
                    "\u01a3\u01a4\7 \2\2\u01a4?\3\2\2\2\u01a5\u01a6\7\27\2\2\u01a6\u01a7\7" +
                    "\16\2\2\u01a7\u01a8\7<\2\2\u01a8\u01a9\7E\2\2\u01a9\u01aa\7=\2\2\u01aa" +
                    "\u01ab\7B\2\2\u01ab\u01ac\5\4\3\2\u01ac\u01ad\7 \2\2\u01adA\3\2\2\2\u01ae" +
                    "\u01b3\7E\2\2\u01af\u01b0\7@\2\2\u01b0\u01b2\7E\2\2\u01b1\u01af\3\2\2" +
                    "\2\u01b2\u01b5\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4C" +
                    "\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b6\u01b8\5:\36\2\u01b7\u01b6\3\2\2\2\u01b7" +
                    "\u01b8\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01ba\7$\2\2\u01ba\u01bd\7E\2" +
                    "\2\u01bb\u01bc\7B\2\2\u01bc\u01be\7E\2\2\u01bd\u01bb\3\2\2\2\u01bd\u01be" +
                    "\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c0\5\4\3\2\u01c0\u01c1\7 \2\2\u01c1" +
                    "E\3\2\2\2\u01c2\u01c7\5H%\2\u01c3\u01c4\7@\2\2\u01c4\u01c6\5H%\2\u01c5" +
                    "\u01c3\3\2\2\2\u01c6\u01c9\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c7\u01c8\3\2" +
                    "\2\2\u01c8G\3\2\2\2\u01c9\u01c7\3\2\2\2\u01ca\u01cb\b%\1\2\u01cb\u01cc" +
                    "\7\64\2\2\u01cc\u01f8\5H%\33\u01cd\u01ce\7\60\2\2\u01ce\u01f8\5H%\32\u01cf" +
                    "\u01f8\7D\2\2\u01d0\u01f8\7C\2\2\u01d1\u01f8\7\"\2\2\u01d2\u01d4\5\f\7" +
                    "\2\u01d3\u01d5\5N(\2\u01d4\u01d3\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01f8" +
                    "\3\2\2\2\u01d6\u01d8\5J&\2\u01d7\u01d9\5N(\2\u01d8\u01d7\3\2\2\2\u01d8" +
                    "\u01d9\3\2\2\2\u01d9\u01f8\3\2\2\2\u01da\u01dc\7E\2\2\u01db\u01dd\5N(" +
                    "\2\u01dc\u01db\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01f8\3\2\2\2\u01de\u01e0" +
                    "\7F\2\2\u01df\u01e1\5N(\2\u01e0\u01df\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1" +
                    "\u01f8\3\2\2\2\u01e2\u01e3\7<\2\2\u01e3\u01e4\5H%\2\u01e4\u01e6\7=\2\2" +
                    "\u01e5\u01e7\5N(\2\u01e6\u01e5\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01f8" +
                    "\3\2\2\2\u01e8\u01e9\7\25\2\2\u01e9\u01eb\7<\2\2\u01ea\u01ec\7F\2\2\u01eb" +
                    "\u01ea\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01f8\7=" +
                    "\2\2\u01ee\u01f8\5\36\20\2\u01ef\u01f0\7\17\2\2\u01f0\u01f1\7<\2\2\u01f1" +
                    "\u01f2\5H%\2\u01f2\u01f3\7=\2\2\u01f3\u01f8\3\2\2\2\u01f4\u01f8\5\64\33" +
                    "\2\u01f5\u01f8\5\36\20\2\u01f6\u01f8\5L\'\2\u01f7\u01ca\3\2\2\2\u01f7" +
                    "\u01cd\3\2\2\2\u01f7\u01cf\3\2\2\2\u01f7\u01d0\3\2\2\2\u01f7\u01d1\3\2" +
                    "\2\2\u01f7\u01d2\3\2\2\2\u01f7\u01d6\3\2\2\2\u01f7\u01da\3\2\2\2\u01f7" +
                    "\u01de\3\2\2\2\u01f7\u01e2\3\2\2\2\u01f7\u01e8\3\2\2\2\u01f7\u01ee\3\2" +
                    "\2\2\u01f7\u01ef\3\2\2\2\u01f7\u01f4\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f7" +
                    "\u01f6\3\2\2\2\u01f8\u0219\3\2\2\2\u01f9\u01fa\f\31\2\2\u01fa\u01fb\7" +
                    "/\2\2\u01fb\u0218\5H%\31\u01fc\u01fd\f\30\2\2\u01fd\u01fe\t\4\2\2\u01fe" +
                    "\u0218\5H%\31\u01ff\u0200\f\27\2\2\u0200\u0201\t\5\2\2\u0201\u0218\5H" +
                    "%\30\u0202\u0203\f\26\2\2\u0203\u0204\t\6\2\2\u0204\u0218\5H%\27\u0205" +
                    "\u0206\f\25\2\2\u0206\u0207\t\7\2\2\u0207\u0218\5H%\26\u0208\u0209\f\24" +
                    "\2\2\u0209\u020a\7*\2\2\u020a\u0218\5H%\25\u020b\u020c\f\23\2\2\u020c" +
                    "\u020d\7(\2\2\u020d\u0218\5H%\24\u020e\u020f\f\22\2\2\u020f\u0210\7A\2" +
                    "\2\u0210\u0211\5H%\2\u0211\u0212\7B\2\2\u0212\u0213\5H%\23\u0213\u0218" +
                    "\3\2\2\2\u0214\u0215\f\21\2\2\u0215\u0216\7!\2\2\u0216\u0218\5H%\22\u0217" +
                    "\u01f9\3\2\2\2\u0217\u01fc\3\2\2\2\u0217\u01ff\3\2\2\2\u0217\u0202\3\2" +
                    "\2\2\u0217\u0205\3\2\2\2\u0217\u0208\3\2\2\2\u0217\u020b\3\2\2\2\u0217" +
                    "\u020e\3\2\2\2\u0217\u0214\3\2\2\2\u0218\u021b\3\2\2\2\u0219\u0217\3\2" +
                    "\2\2\u0219\u021a\3\2\2\2\u021aI\3\2\2\2\u021b\u0219\3\2\2\2\u021c\u021e" +
                    "\7:\2\2\u021d\u021f\5F$\2\u021e\u021d\3\2\2\2\u021e\u021f\3\2\2\2\u021f" +
                    "\u0220\3\2\2\2\u0220\u0221\7;\2\2\u0221K\3\2\2\2\u0222\u0223\7E\2\2\u0223" +
                    "\u0224\7)\2\2\u0224\u0225\7E\2\2\u0225M\3\2\2\2\u0226\u0227\7:\2\2\u0227" +
                    "\u0228\5H%\2\u0228\u0229\7;\2\2\u0229\u022b\3\2\2\2\u022a\u0226\3\2\2" +
                    "\2\u022b\u022c\3\2\2\2\u022c\u022a\3\2\2\2\u022c\u022d\3\2\2\2\u022dO" +
                    "\3\2\2\2\60QT[cel\u0081\u0090\u0094\u0097\u009f\u00a3\u00a8\u00ae\u00c0" +
                    "\u00c3\u00c9\u00d0\u00dc\u00e7\u00f4\u00f8\u0119\u0126\u0129\u0130\u0142" +
                    "\u0149\u0170\u0176\u0197\u01b3\u01b7\u01bd\u01c7\u01d4\u01d8\u01dc\u01e0" +
                    "\u01e6\u01eb\u01f7\u0217\u0219\u021e\u022c";
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
                "allImport", "objFunctionCall", "folderImport", "packageStatement", "header",
                "ifStatement", "ifStat", "hereStatement", "varHereStatement", "elseIfStat",
                "constructorStatement", "objCreateStatement", "sysFunctionCall", "fileWriteStatement",
                "elseStat", "functionDecl", "forStatement", "forInStatement", "importStatement",
                "anonymousFunction", "importFromGithubStatement", "importAllStatement",
                "atStatement", "tryCatchStatement", "whileStatement", "mainFunctionStatement",
                "idList", "classStatement", "exprList", "expression", "list", "objVar",
                "indexes"
        };
    }

    private static String[] makeLiteralNames() {
        return new String[]{
                null, "'#'", "'.'", "'@'", "'header'", "'cn'", "'new'", "'as'", "'sys'",
                "'i3v8wm08wxpudwty0'", "'range'", "'except'", "'main'", "'3YCMPJ8W8VVTUA48TIHR8K332PYKTXOKVDFG'",
                null, "'async'", "'var'", "'import'", null, null, "'assert'", "'fn'",
                "'if'", "'else'", "'namespace'", "'return'", "'for'", "'while'", "'to'",
                "'do'", "'end'", "'in'", "'null'", "'try'", "'class'", "'const'", "'self'",
                "'native'", "'||'", "'::'", "'&&'", "'=='", "'!='", "'>='", "'<='", "'^'",
                "'!'", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'%'", "'{'", "'}'",
                "'['", "']'", "'('", "')'", "';'", "'='", "','", "'?'", "':'"
        };
    }

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, null, null, null, null, null, null, null, null, null, null, null,
                null, null, "Println", "Async", "Var", "Import", "Print", "Input", "Assert",
                "Def", "If", "Else", "Package", "Return", "For", "While", "To", "Do",
                "End", "In", "Null", "Try", "Class", "Const", "Self", "Native", "Or",
                "Accessor", "And", "Equals", "NEquals", "GTEquals", "LTEquals", "Pow",
                "Excl", "GT", "LT", "Add", "Subtract", "Multiply", "Divide", "Modulus",
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
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(79);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 0, _ctx)) {
                    case 1: {
                        setState(78);
                        header();
                    }
                    break;
                }
                setState(82);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == Package) {
                    {
                        setState(81);
                        packageStatement();
                    }
                }

                setState(89);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 2, _ctx);
                while (_alt != 1 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1 + 1) {
                        {
                            {
                                setState(84);
                                allImport();
                                setState(85);
                                match(SColon);
                            }
                        }
                    }
                    setState(91);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 2, _ctx);
                }
                setState(92);
                block();
                setState(93);
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
                setState(99);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__7) | (1L << Println) | (1L << Async) | (1L << Var) | (1L << Print) | (1L << Assert) | (1L << Def) | (1L << If) | (1L << For) | (1L << While) | (1L << Try) | (1L << Class) | (1L << Const) | (1L << Self) | (1L << Native))) != 0) || _la == Identifier) {
                    {
                        setState(97);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 3, _ctx)) {
                            case 1: {
                                setState(95);
                                statement();
                            }
                            break;
                            case 2: {
                                setState(96);
                                functionDecl();
                            }
                            break;
                        }
                    }
                    setState(101);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(106);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == Return) {
                    {
                        setState(102);
                        match(Return);
                        setState(103);
                        expression(0);
                        setState(104);
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
            setState(142);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 7, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(108);
                    functionCall();
                    setState(109);
                    match(SColon);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(111);
                    ifStatement();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(112);
                    forStatement();
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(113);
                    forInStatement();
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(114);
                    whileStatement();
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(115);
                    tryCatchStatement();
                }
                break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(116);
                    mainFunctionStatement();
                }
                break;
                case 8:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(117);
                    reAssignment();
                    setState(118);
                    match(SColon);
                }
                break;
                case 9:
                    enterOuterAlt(_localctx, 9);
                {
                    setState(120);
                    classStatement();
                }
                break;
                case 10:
                    enterOuterAlt(_localctx, 10);
                {
                    setState(121);
                    constructorStatement();
                }
                break;
                case 11:
                    enterOuterAlt(_localctx, 11);
                {
                    setState(122);
                    fileWriteStatement();
                    setState(123);
                    match(SColon);
                }
                break;
                case 12:
                    enterOuterAlt(_localctx, 12);
                {
                    setState(125);
                    objFunctionCall();
                    setState(127);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == SColon) {
                        {
                            setState(126);
                            match(SColon);
                        }
                    }

                }
                break;
                case 13:
                    enterOuterAlt(_localctx, 13);
                {
                    setState(129);
                    objCreateStatement();
                    setState(130);
                    match(SColon);
                }
                break;
                case 14:
                    enterOuterAlt(_localctx, 14);
                {
                    setState(132);
                    sysFunctionCall();
                    setState(133);
                    match(SColon);
                }
                break;
                case 15:
                    enterOuterAlt(_localctx, 15);
                {
                    setState(135);
                    anonymousFunction();
                }
                break;
                case 16:
                    enterOuterAlt(_localctx, 16);
                {
                    setState(136);
                    hereStatement();
                    setState(137);
                    match(SColon);
                }
                break;
                case 17:
                    enterOuterAlt(_localctx, 17);
                {
                    setState(139);
                    assignment();
                    setState(140);
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
                setState(146);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 8, _ctx)) {
                    case 1: {
                        setState(144);
                        match(Identifier);
                    }
                    break;
                    case 2: {
                        setState(145);
                        objVar();
                    }
                    break;
                }
                setState(149);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == OBracket) {
                    {
                        setState(148);
                        indexes();
                    }
                }

                setState(151);
                match(Assign);
                setState(152);
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
            enterOuterAlt(_localctx, 1);
            {
                setState(154);
                _la = _input.LA(1);
                if (!(_la == Var || _la == Const)) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
                setState(155);
                match(Identifier);
                setState(161);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == OBracket || _la == Assign) {
                    {
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
            setState(193);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 15, _ctx)) {
                case 1:
                    _localctx = new IdentifierFunctionCallContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(163);
                    match(Identifier);
                    setState(164);
                    match(OParen);
                    setState(166);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (T__12 - 13)) | (1L << (Println - 13)) | (1L << (Print - 13)) | (1L << (Input - 13)) | (1L << (Assert - 13)) | (1L << (Def - 13)) | (1L << (Null - 13)) | (1L << (Self - 13)) | (1L << (Excl - 13)) | (1L << (Subtract - 13)) | (1L << (OBracket - 13)) | (1L << (OParen - 13)) | (1L << (Bool - 13)) | (1L << (Number - 13)) | (1L << (Identifier - 13)) | (1L << (String - 13)))) != 0)) {
                        {
                            setState(165);
                            exprList();
                        }
                    }

                    setState(168);
                    match(CParen);
                }
                break;
                case 2:
                    _localctx = new PrintlnFunctionCallContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(169);
                    match(Println);
                    setState(170);
                    match(OParen);
                    setState(172);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (T__12 - 13)) | (1L << (Println - 13)) | (1L << (Print - 13)) | (1L << (Input - 13)) | (1L << (Assert - 13)) | (1L << (Def - 13)) | (1L << (Null - 13)) | (1L << (Self - 13)) | (1L << (Excl - 13)) | (1L << (Subtract - 13)) | (1L << (OBracket - 13)) | (1L << (OParen - 13)) | (1L << (Bool - 13)) | (1L << (Number - 13)) | (1L << (Identifier - 13)) | (1L << (String - 13)))) != 0)) {
                        {
                            setState(171);
                            expression(0);
                        }
                    }

                    setState(174);
                    match(CParen);
                }
                break;
                case 3:
                    _localctx = new PrintFunctionCallContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(175);
                    match(Print);
                    setState(176);
                    match(OParen);
                    setState(177);
                    expression(0);
                    setState(178);
                    match(CParen);
                }
                break;
                case 4:
                    _localctx = new AssertFunctionCallContext(_localctx);
                    enterOuterAlt(_localctx, 4);
                {
                    setState(180);
                    match(Assert);
                    setState(181);
                    match(OParen);
                    setState(182);
                    expression(0);
                    setState(183);
                    match(CParen);
                }
                break;
                case 5:
                    _localctx = new ObjFunctionCallExpressionContext(_localctx);
                    enterOuterAlt(_localctx, 5);
                {
                    setState(185);
                    match(Identifier);
                    setState(186);
                    match(Accessor);
                    setState(187);
                    match(Identifier);
                    setState(188);
                    match(OParen);
                    setState(190);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (T__12 - 13)) | (1L << (Println - 13)) | (1L << (Print - 13)) | (1L << (Input - 13)) | (1L << (Assert - 13)) | (1L << (Def - 13)) | (1L << (Null - 13)) | (1L << (Self - 13)) | (1L << (Excl - 13)) | (1L << (Subtract - 13)) | (1L << (OBracket - 13)) | (1L << (OParen - 13)) | (1L << (Bool - 13)) | (1L << (Number - 13)) | (1L << (Identifier - 13)) | (1L << (String - 13)))) != 0)) {
                        {
                            setState(189);
                            exprList();
                        }
                    }

                    setState(192);
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
            setState(199);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 16, _ctx)) {
                case 1:
                    _localctx = new FileSystemImportStatementContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(195);
                    importStatement();
                }
                break;
                case 2:
                    _localctx = new GithubImportStatementContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(196);
                    importFromGithubStatement();
                }
                break;
                case 3:
                    _localctx = new ImportAllContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(197);
                    importAllStatement();
                }
                break;
                case 4:
                    _localctx = new FolderImportStatementContext(_localctx);
                    enterOuterAlt(_localctx, 4);
                {
                    setState(198);
                    folderImport();
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
                setState(201);
                match(Identifier);
                setState(202);
                match(Accessor);
                setState(203);
                match(Identifier);
                setState(204);
                match(OParen);
                setState(206);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (T__12 - 13)) | (1L << (Println - 13)) | (1L << (Print - 13)) | (1L << (Input - 13)) | (1L << (Assert - 13)) | (1L << (Def - 13)) | (1L << (Null - 13)) | (1L << (Self - 13)) | (1L << (Excl - 13)) | (1L << (Subtract - 13)) | (1L << (OBracket - 13)) | (1L << (OParen - 13)) | (1L << (Bool - 13)) | (1L << (Number - 13)) | (1L << (Identifier - 13)) | (1L << (String - 13)))) != 0)) {
                    {
                        setState(205);
                        exprList();
                    }
                }

                setState(208);
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

    public final FolderImportContext folderImport() throws RecognitionException {
        FolderImportContext _localctx = new FolderImportContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_folderImport);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(210);
                match(T__0);
                setState(211);
                match(Import);
                setState(212);
                match(OBracket);
                setState(213);
                match(Identifier);
                setState(218);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 18, _ctx);
                while (_alt != 1 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1 + 1) {
                        {
                            {
                                setState(214);
                                match(T__1);
                                setState(215);
                                match(Identifier);
                            }
                        }
                    }
                    setState(220);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 18, _ctx);
                }
                setState(221);
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

    public final PackageStatementContext packageStatement() throws RecognitionException {
        PackageStatementContext _localctx = new PackageStatementContext(_ctx, getState());
        enterRule(_localctx, 18, RULE_packageStatement);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(223);
                match(Package);
                setState(224);
                match(Identifier);
                setState(229);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 19, _ctx);
                while (_alt != 1 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1 + 1) {
                        {
                            {
                                setState(225);
                                match(T__1);
                                setState(226);
                                match(Identifier);
                            }
                        }
                    }
                    setState(231);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 19, _ctx);
                }
                setState(232);
                match(SColon);
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
        enterRule(_localctx, 20, RULE_header);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(234);
                match(T__2);
                setState(235);
                match(T__3);
                setState(236);
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
        enterRule(_localctx, 22, RULE_ifStatement);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(238);
                ifStat();
                setState(242);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 20, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(239);
                                elseIfStat();
                            }
                        }
                    }
                    setState(244);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 20, _ctx);
                }
                setState(246);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == Else) {
                    {
                        setState(245);
                        elseStat();
                    }
                }

                setState(248);
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
        enterRule(_localctx, 24, RULE_ifStat);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(250);
                match(If);
                setState(251);
                match(OParen);
                setState(252);
                expression(0);
                setState(253);
                match(CParen);
                setState(254);
                match(Colon);
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

    public final HereStatementContext hereStatement() throws RecognitionException {
        HereStatementContext _localctx = new HereStatementContext(_ctx, getState());
        enterRule(_localctx, 26, RULE_hereStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(257);
                match(Self);
                setState(258);
                match(Accessor);
                setState(259);
                match(Identifier);
                setState(260);
                match(Assign);
                setState(261);
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
        enterRule(_localctx, 28, RULE_varHereStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(263);
                match(Self);
                setState(264);
                match(Accessor);
                setState(265);
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
        enterRule(_localctx, 30, RULE_elseIfStat);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(267);
                match(Else);
                setState(268);
                match(If);
                setState(269);
                match(OParen);
                setState(270);
                expression(0);
                setState(271);
                match(CParen);
                setState(272);
                match(Colon);
                setState(273);
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
        enterRule(_localctx, 32, RULE_constructorStatement);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(275);
                match(T__4);
                setState(276);
                match(Identifier);
                setState(277);
                match(OParen);
                setState(279);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (T__12 - 13)) | (1L << (Println - 13)) | (1L << (Print - 13)) | (1L << (Input - 13)) | (1L << (Assert - 13)) | (1L << (Def - 13)) | (1L << (Null - 13)) | (1L << (Self - 13)) | (1L << (Excl - 13)) | (1L << (Subtract - 13)) | (1L << (OBracket - 13)) | (1L << (OParen - 13)) | (1L << (Bool - 13)) | (1L << (Number - 13)) | (1L << (Identifier - 13)) | (1L << (String - 13)))) != 0)) {
                    {
                        setState(278);
                        exprList();
                    }
                }

                setState(281);
                match(CParen);
                setState(282);
                match(Colon);
                setState(283);
                block();
                setState(284);
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
        enterRule(_localctx, 34, RULE_objCreateStatement);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(286);
                match(T__5);
                setState(287);
                match(Identifier);
                setState(288);
                match(T__6);
                setState(289);
                match(Identifier);
                setState(295);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == OParen) {
                    {
                        setState(290);
                        match(OParen);
                        setState(292);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (T__12 - 13)) | (1L << (Println - 13)) | (1L << (Print - 13)) | (1L << (Input - 13)) | (1L << (Assert - 13)) | (1L << (Def - 13)) | (1L << (Null - 13)) | (1L << (Self - 13)) | (1L << (Excl - 13)) | (1L << (Subtract - 13)) | (1L << (OBracket - 13)) | (1L << (OParen - 13)) | (1L << (Bool - 13)) | (1L << (Number - 13)) | (1L << (Identifier - 13)) | (1L << (String - 13)))) != 0)) {
                            {
                                setState(291);
                                exprList();
                            }
                        }

                        setState(294);
                        match(CParen);
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

    public final SysFunctionCallContext sysFunctionCall() throws RecognitionException {
        SysFunctionCallContext _localctx = new SysFunctionCallContext(_ctx, getState());
        enterRule(_localctx, 36, RULE_sysFunctionCall);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(297);
                match(T__7);
                setState(298);
                match(Accessor);
                setState(299);
                match(Identifier);
                setState(300);
                match(OParen);
                setState(302);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (T__12 - 13)) | (1L << (Println - 13)) | (1L << (Print - 13)) | (1L << (Input - 13)) | (1L << (Assert - 13)) | (1L << (Def - 13)) | (1L << (Null - 13)) | (1L << (Self - 13)) | (1L << (Excl - 13)) | (1L << (Subtract - 13)) | (1L << (OBracket - 13)) | (1L << (OParen - 13)) | (1L << (Bool - 13)) | (1L << (Number - 13)) | (1L << (Identifier - 13)) | (1L << (String - 13)))) != 0)) {
                    {
                        setState(301);
                        expression(0);
                    }
                }

                setState(304);
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
        enterRule(_localctx, 38, RULE_fileWriteStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(306);
                match(Identifier);
                setState(307);
                match(Accessor);
                setState(308);
                match(T__8);
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

    public final ElseStatContext elseStat() throws RecognitionException {
        ElseStatContext _localctx = new ElseStatContext(_ctx, getState());
        enterRule(_localctx, 40, RULE_elseStat);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(313);
                match(Else);
                setState(314);
                match(Colon);
                setState(315);
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
        enterRule(_localctx, 42, RULE_functionDecl);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(320);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 26, _ctx);
                while (_alt != 1 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1 + 1) {
                        {
                            {
                                setState(317);
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
                    setState(322);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 26, _ctx);
                }
                setState(323);
                match(Def);
                setState(324);
                match(Identifier);
                setState(325);
                match(OParen);
                setState(327);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == Identifier) {
                    {
                        setState(326);
                        idList();
                    }
                }

                setState(329);
                match(CParen);
                setState(330);
                match(Colon);
                setState(331);
                block();
                setState(332);
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
        enterRule(_localctx, 44, RULE_forStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(334);
                match(For);
                setState(335);
                match(OParen);
                setState(336);
                match(Identifier);
                setState(337);
                match(Assign);
                setState(338);
                expression(0);
                setState(339);
                match(To);
                setState(340);
                expression(0);
                setState(341);
                match(CParen);
                setState(342);
                match(Colon);
                setState(343);
                block();
                setState(344);
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
        enterRule(_localctx, 46, RULE_forInStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(346);
                match(For);
                setState(347);
                match(OParen);
                setState(348);
                match(Identifier);
                setState(349);
                match(In);
                setState(350);
                match(T__9);
                setState(351);
                match(OParen);
                setState(352);
                expression(0);
                setState(353);
                match(CParen);
                setState(354);
                match(CParen);
                setState(355);
                match(Colon);
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

    public final ImportStatementContext importStatement() throws RecognitionException {
        ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
        enterRule(_localctx, 48, RULE_importStatement);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(359);
                match(T__0);
                setState(360);
                match(Import);
                setState(361);
                match(Identifier);
                setState(366);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 28, _ctx);
                while (_alt != 1 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1 + 1) {
                        {
                            {
                                setState(362);
                                match(T__1);
                                setState(363);
                                match(Identifier);
                            }
                        }
                    }
                    setState(368);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 28, _ctx);
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
        enterRule(_localctx, 50, RULE_anonymousFunction);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(369);
                match(Def);
                setState(370);
                match(OParen);
                setState(372);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (T__12 - 13)) | (1L << (Println - 13)) | (1L << (Print - 13)) | (1L << (Input - 13)) | (1L << (Assert - 13)) | (1L << (Def - 13)) | (1L << (Null - 13)) | (1L << (Self - 13)) | (1L << (Excl - 13)) | (1L << (Subtract - 13)) | (1L << (OBracket - 13)) | (1L << (OParen - 13)) | (1L << (Bool - 13)) | (1L << (Number - 13)) | (1L << (Identifier - 13)) | (1L << (String - 13)))) != 0)) {
                    {
                        setState(371);
                        exprList();
                    }
                }

                setState(374);
                match(CParen);
                setState(375);
                match(Colon);
                setState(376);
                match(Subtract);
                setState(377);
                match(GT);
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

    public final ImportFromGithubStatementContext importFromGithubStatement() throws RecognitionException {
        ImportFromGithubStatementContext _localctx = new ImportFromGithubStatementContext(_ctx, getState());
        enterRule(_localctx, 52, RULE_importFromGithubStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(381);
                match(T__0);
                setState(382);
                match(Import);
                setState(383);
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
        enterRule(_localctx, 54, RULE_importAllStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(385);
                match(T__0);
                setState(386);
                match(Import);
                setState(387);
                match(OBracket);
                setState(388);
                match(Multiply);
                setState(389);
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

    public final AtStatementContext atStatement() throws RecognitionException {
        AtStatementContext _localctx = new AtStatementContext(_ctx, getState());
        enterRule(_localctx, 56, RULE_atStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(391);
                match(T__2);
                setState(392);
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

    public final TryCatchStatementContext tryCatchStatement() throws RecognitionException {
        TryCatchStatementContext _localctx = new TryCatchStatementContext(_ctx, getState());
        enterRule(_localctx, 58, RULE_tryCatchStatement);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(394);
                match(Try);
                setState(395);
                match(Colon);
                setState(396);
                block();
                setState(397);
                match(T__10);
                setState(398);
                match(Colon);
                setState(405);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 30, _ctx);
                while (_alt != 1 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1 + 1) {
                        {
                            {
                                setState(399);
                                match(LT);
                                setState(400);
                                expression(0);
                                setState(401);
                                match(GT);
                            }
                        }
                    }
                    setState(407);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 30, _ctx);
                }
                setState(408);
                block();
                setState(409);
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
        enterRule(_localctx, 60, RULE_whileStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(411);
                match(While);
                setState(412);
                match(OParen);
                setState(413);
                expression(0);
                setState(414);
                match(CParen);
                setState(415);
                match(Colon);
                setState(416);
                block();
                setState(417);
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

    public final MainFunctionStatementContext mainFunctionStatement() throws RecognitionException {
        MainFunctionStatementContext _localctx = new MainFunctionStatementContext(_ctx, getState());
        enterRule(_localctx, 62, RULE_mainFunctionStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(419);
                match(Def);
                setState(420);
                match(T__11);
                setState(421);
                match(OParen);
                setState(422);
                match(Identifier);
                setState(423);
                match(CParen);
                setState(424);
                match(Colon);
                setState(425);
                block();
                setState(426);
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
                setState(428);
                match(Identifier);
                setState(433);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == Comma) {
                    {
                        {
                            setState(429);
                            match(Comma);
                            setState(430);
                            match(Identifier);
                        }
                    }
                    setState(435);
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
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(437);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == T__2) {
                    {
                        setState(436);
                        atStatement();
                    }
                }

                setState(439);
                match(Class);
                setState(440);
                match(Identifier);
                setState(443);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == Colon) {
                    {
                        setState(441);
                        match(Colon);
                        setState(442);
                        match(Identifier);
                    }
                }

                setState(445);
                block();
                setState(446);
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
        enterRule(_localctx, 68, RULE_exprList);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(448);
                expression(0);
                setState(453);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == Comma) {
                    {
                        {
                            setState(449);
                            match(Comma);
                            setState(450);
                            expression(0);
                        }
                    }
                    setState(455);
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
                setState(501);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 41, _ctx)) {
                    case 1: {
                        _localctx = new UnaryMinusExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;

                        setState(457);
                        match(Subtract);
                        setState(458);
                        expression(25);
                    }
                    break;
                    case 2: {
                        _localctx = new NotExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(459);
                        match(Excl);
                        setState(460);
                        expression(24);
                    }
                    break;
                    case 3: {
                        _localctx = new NumberExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(461);
                        match(Number);
                    }
                    break;
                    case 4: {
                        _localctx = new BoolExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(462);
                        match(Bool);
                    }
                    break;
                    case 5: {
                        _localctx = new NullExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(463);
                        match(Null);
                    }
                    break;
                    case 6: {
                        _localctx = new FunctionCallExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(464);
                        functionCall();
                        setState(466);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 35, _ctx)) {
                            case 1: {
                                setState(465);
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
                        setState(468);
                        list();
                        setState(470);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 36, _ctx)) {
                            case 1: {
                                setState(469);
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
                        setState(472);
                        match(Identifier);
                        setState(474);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 37, _ctx)) {
                            case 1: {
                                setState(473);
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
                        setState(476);
                        match(String);
                        setState(478);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 38, _ctx)) {
                            case 1: {
                                setState(477);
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
                        setState(480);
                        match(OParen);
                        setState(481);
                        expression(0);
                        setState(482);
                        match(CParen);
                        setState(484);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 39, _ctx)) {
                            case 1: {
                                setState(483);
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
                        setState(486);
                        match(Input);
                        setState(487);
                        match(OParen);
                        setState(489);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == String) {
                            {
                                setState(488);
                                match(String);
                            }
                        }

                        setState(491);
                        match(CParen);
                    }
                    break;
                    case 12: {
                        _localctx = new HereVarExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(492);
                        varHereStatement();
                    }
                    break;
                    case 13: {
                        _localctx = new RandomExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(493);
                        match(T__12);
                        setState(494);
                        match(OParen);
                        setState(495);
                        expression(0);
                        setState(496);
                        match(CParen);
                    }
                    break;
                    case 14: {
                        _localctx = new AnonymousFunctionExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(498);
                        anonymousFunction();
                    }
                    break;
                    case 15: {
                        _localctx = new SelfExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(499);
                        varHereStatement();
                    }
                    break;
                    case 16: {
                        _localctx = new ObjVarExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(500);
                        objVar();
                    }
                    break;
                }
                _ctx.stop = _input.LT(-1);
                setState(535);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 43, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(533);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 42, _ctx)) {
                                case 1: {
                                    _localctx = new PowerExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(503);
                                    if (!(precpred(_ctx, 23)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 23)");
                                    setState(504);
                                    match(Pow);
                                    setState(505);
                                    expression(23);
                                }
                                break;
                                case 2: {
                                    _localctx = new MultExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(506);
                                    if (!(precpred(_ctx, 22)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 22)");
                                    setState(507);
                                    ((MultExpressionContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Multiply) | (1L << Divide) | (1L << Modulus))) != 0))) {
                                        ((MultExpressionContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(508);
                                    expression(23);
                                }
                                break;
                                case 3: {
                                    _localctx = new AddExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(509);
                                    if (!(precpred(_ctx, 21)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 21)");
                                    setState(510);
                                    ((AddExpressionContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!(_la == Add || _la == Subtract)) {
                                        ((AddExpressionContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(511);
                                    expression(22);
                                }
                                break;
                                case 4: {
                                    _localctx = new CompExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(512);
                                    if (!(precpred(_ctx, 20)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 20)");
                                    setState(513);
                                    ((CompExpressionContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GTEquals) | (1L << LTEquals) | (1L << GT) | (1L << LT))) != 0))) {
                                        ((CompExpressionContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(514);
                                    expression(21);
                                }
                                break;
                                case 5: {
                                    _localctx = new EqExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(515);
                                    if (!(precpred(_ctx, 19)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 19)");
                                    setState(516);
                                    ((EqExpressionContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!(_la == Equals || _la == NEquals)) {
                                        ((EqExpressionContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(517);
                                    expression(20);
                                }
                                break;
                                case 6: {
                                    _localctx = new AndExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(518);
                                    if (!(precpred(_ctx, 18)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 18)");
                                    setState(519);
                                    match(And);
                                    setState(520);
                                    expression(19);
                                }
                                break;
                                case 7: {
                                    _localctx = new OrExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(521);
                                    if (!(precpred(_ctx, 17)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 17)");
                                    setState(522);
                                    match(Or);
                                    setState(523);
                                    expression(18);
                                }
                                break;
                                case 8: {
                                    _localctx = new TernaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(524);
                                    if (!(precpred(_ctx, 16)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 16)");
                                    setState(525);
                                    match(QMark);
                                    setState(526);
                                    expression(0);
                                    setState(527);
                                    match(Colon);
                                    setState(528);
                                    expression(17);
                                }
                                break;
                                case 9: {
                                    _localctx = new InExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(530);
                                    if (!(precpred(_ctx, 15)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 15)");
                                    setState(531);
                                    match(In);
                                    setState(532);
                                    expression(16);
                                }
                                break;
                            }
                        }
                    }
                    setState(537);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 43, _ctx);
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
                setState(538);
                match(OBracket);
                setState(540);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (T__12 - 13)) | (1L << (Println - 13)) | (1L << (Print - 13)) | (1L << (Input - 13)) | (1L << (Assert - 13)) | (1L << (Def - 13)) | (1L << (Null - 13)) | (1L << (Self - 13)) | (1L << (Excl - 13)) | (1L << (Subtract - 13)) | (1L << (OBracket - 13)) | (1L << (OParen - 13)) | (1L << (Bool - 13)) | (1L << (Number - 13)) | (1L << (Identifier - 13)) | (1L << (String - 13)))) != 0)) {
                    {
                        setState(539);
                        exprList();
                    }
                }

                setState(542);
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

    public final ObjVarContext objVar() throws RecognitionException {
        ObjVarContext _localctx = new ObjVarContext(_ctx, getState());
        enterRule(_localctx, 74, RULE_objVar);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(544);
                match(Identifier);
                setState(545);
                match(Accessor);
                setState(546);
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

    public final IndexesContext indexes() throws RecognitionException {
        IndexesContext _localctx = new IndexesContext(_ctx, getState());
        enterRule(_localctx, 76, RULE_indexes);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(552);
                _errHandler.sync(this);
                _alt = 1;
                do {
                    switch (_alt) {
                        case 1: {
                            {
                                setState(548);
                                match(OBracket);
                                setState(549);
                                expression(0);
                                setState(550);
                                match(CBracket);
                            }
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                    setState(554);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 45, _ctx);
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
                return precpred(_ctx, 23);
            case 1:
                return precpred(_ctx, 22);
            case 2:
                return precpred(_ctx, 21);
            case 3:
                return precpred(_ctx, 20);
            case 4:
                return precpred(_ctx, 19);
            case 5:
                return precpred(_ctx, 18);
            case 6:
                return precpred(_ctx, 17);
            case 7:
                return precpred(_ctx, 16);
            case 8:
                return precpred(_ctx, 15);
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

        public PackageStatementContext packageStatement() {
            return getRuleContext(PackageStatementContext.class, 0);
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

        public ReAssignmentContext reAssignment() {
            return getRuleContext(ReAssignmentContext.class, 0);
        }

        public ClassStatementContext classStatement() {
            return getRuleContext(ClassStatementContext.class, 0);
        }

        public ConstructorStatementContext constructorStatement() {
            return getRuleContext(ConstructorStatementContext.class, 0);
        }

        public FileWriteStatementContext fileWriteStatement() {
            return getRuleContext(FileWriteStatementContext.class, 0);
        }

        public ObjFunctionCallContext objFunctionCall() {
            return getRuleContext(ObjFunctionCallContext.class, 0);
        }

        public ObjCreateStatementContext objCreateStatement() {
            return getRuleContext(ObjCreateStatementContext.class, 0);
        }

        public SysFunctionCallContext sysFunctionCall() {
            return getRuleContext(SysFunctionCallContext.class, 0);
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

        public TerminalNode Assign() {
            return getToken(QParser.Assign, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode Identifier() {
            return getToken(QParser.Identifier, 0);
        }

        public ObjVarContext objVar() {
            return getRuleContext(ObjVarContext.class, 0);
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

        public TerminalNode Identifier() {
            return getToken(QParser.Identifier, 0);
        }

        public TerminalNode Const() {
            return getToken(QParser.Const, 0);
        }

        public TerminalNode Var() {
            return getToken(QParser.Var, 0);
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

    public static class FolderImportStatementContext extends AllImportContext {
        public FolderImportStatementContext(AllImportContext ctx) {
            copyFrom(ctx);
        }

        public FolderImportContext folderImport() {
            return getRuleContext(FolderImportContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterFolderImportStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitFolderImportStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitFolderImportStatement(this);
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

    public static class FolderImportContext extends ParserRuleContext {
        public FolderImportContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Import() {
            return getToken(QParser.Import, 0);
        }

        public TerminalNode OBracket() {
            return getToken(QParser.OBracket, 0);
        }

        public List<TerminalNode> Identifier() {
            return getTokens(QParser.Identifier);
        }

        public TerminalNode Identifier(int i) {
            return getToken(QParser.Identifier, i);
        }

        public TerminalNode CBracket() {
            return getToken(QParser.CBracket, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_folderImport;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterFolderImport(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitFolderImport(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitFolderImport(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class PackageStatementContext extends ParserRuleContext {
        public PackageStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Package() {
            return getToken(QParser.Package, 0);
        }

        public List<TerminalNode> Identifier() {
            return getTokens(QParser.Identifier);
        }

        public TerminalNode Identifier(int i) {
            return getToken(QParser.Identifier, i);
        }

        public TerminalNode SColon() {
            return getToken(QParser.SColon, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_packageStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterPackageStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitPackageStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitPackageStatement(this);
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

        public TerminalNode Colon() {
            return getToken(QParser.Colon, 0);
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

        public TerminalNode Colon() {
            return getToken(QParser.Colon, 0);
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

        public TerminalNode Colon() {
            return getToken(QParser.Colon, 0);
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

    public static class SysFunctionCallContext extends ParserRuleContext {
        public SysFunctionCallContext(ParserRuleContext parent, int invokingState) {
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
            return RULE_sysFunctionCall;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterSysFunctionCall(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitSysFunctionCall(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitSysFunctionCall(this);
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

    public static class ElseStatContext extends ParserRuleContext {
        public ElseStatContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Else() {
            return getToken(QParser.Else, 0);
        }

        public TerminalNode Colon() {
            return getToken(QParser.Colon, 0);
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

        public TerminalNode Colon() {
            return getToken(QParser.Colon, 0);
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

        public TerminalNode Colon() {
            return getToken(QParser.Colon, 0);
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

        public TerminalNode Colon() {
            return getToken(QParser.Colon, 0);
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

        public TerminalNode Colon() {
            return getToken(QParser.Colon, 0);
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

    public static class AtStatementContext extends ParserRuleContext {
        public AtStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Identifier() {
            return getToken(QParser.Identifier, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_atStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterAtStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitAtStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitAtStatement(this);
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

        public List<TerminalNode> Colon() {
            return getTokens(QParser.Colon);
        }

        public TerminalNode Colon(int i) {
            return getToken(QParser.Colon, i);
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

        public List<TerminalNode> LT() {
            return getTokens(QParser.LT);
        }

        public TerminalNode LT(int i) {
            return getToken(QParser.LT, i);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public List<TerminalNode> GT() {
            return getTokens(QParser.GT);
        }

        public TerminalNode GT(int i) {
            return getToken(QParser.GT, i);
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

        public TerminalNode Colon() {
            return getToken(QParser.Colon, 0);
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

    public static class MainFunctionStatementContext extends ParserRuleContext {
        public MainFunctionStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Def() {
            return getToken(QParser.Def, 0);
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

        public TerminalNode Colon() {
            return getToken(QParser.Colon, 0);
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

        public AtStatementContext atStatement() {
            return getRuleContext(AtStatementContext.class, 0);
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

    public static class ObjVarExpressionContext extends ExpressionContext {
        public ObjVarExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        public ObjVarContext objVar() {
            return getRuleContext(ObjVarContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterObjVarExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitObjVarExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitObjVarExpression(this);
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

    public static class SelfExpressionContext extends ExpressionContext {
        public SelfExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        public VarHereStatementContext varHereStatement() {
            return getRuleContext(VarHereStatementContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterSelfExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitSelfExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitSelfExpression(this);
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

    public static class ObjVarContext extends ParserRuleContext {
        public ObjVarContext(ParserRuleContext parent, int invokingState) {
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

        @Override
        public int getRuleIndex() {
            return RULE_objVar;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).enterObjVar(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QListener) ((QListener) listener).exitObjVar(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof QVisitor) return ((QVisitor<? extends T>) visitor).visitObjVar(this);
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