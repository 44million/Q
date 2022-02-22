// Generated from /Users/harryharbuck-marlowe/Desktop/Q/src/main/java/modulesParser/core/Mod.g4 by ANTLR 4.9.2
package mod.antlr;

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
public class ModParser extends Parser {
    public static final int
            T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, T__7 = 8, T__8 = 9,
            T__9 = 10, T__10 = 11, T__11 = 12, T__12 = 13, T__13 = 14, T__14 = 15, T__15 = 16, T__16 = 17,
            T__17 = 18, T__18 = 19, Bool = 20, Number = 21, Identifier = 22, String = 23, Comment = 24,
            Space = 25;
    public static final int
            RULE_parse = 0, RULE_block = 1, RULE_importStatement = 2, RULE_extensiveQStatement = 3,
            RULE_headerStatement = 4, RULE_fromGitStatement = 5, RULE_loadfStatement = 6,
            RULE_loadStatement = 7, RULE_finishStatement = 8;
    public static final String[] ruleNames = makeRuleNames();
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\33M\4\2\t\2\4\3\t" +
                    "\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2" +
                    "\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3\37\n\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4\'" +
                    "\n\4\f\4\16\4*\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3" +
                    "\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n" +
                    "\3\n\3\n\3\n\3\n\3(\2\13\2\4\6\b\n\f\16\20\22\2\3\3\2\t\n\2I\2\24\3\2" +
                    "\2\2\4\36\3\2\2\2\6 \3\2\2\2\b-\3\2\2\2\n\61\3\2\2\2\f\67\3\2\2\2\16=" +
                    "\3\2\2\2\20B\3\2\2\2\22G\3\2\2\2\24\25\5\n\6\2\25\26\5\4\3\2\26\27\7\2" +
                    "\2\3\27\3\3\2\2\2\30\37\5\6\4\2\31\37\5\b\5\2\32\37\5\f\7\2\33\37\5\16" +
                    "\b\2\34\37\5\20\t\2\35\37\5\22\n\2\36\30\3\2\2\2\36\31\3\2\2\2\36\32\3" +
                    "\2\2\2\36\33\3\2\2\2\36\34\3\2\2\2\36\35\3\2\2\2\37\5\3\2\2\2 !\7\3\2" +
                    "\2!\"\7\4\2\2\"#\7\5\2\2#(\7\30\2\2$%\7\6\2\2%\'\7\30\2\2&$\3\2\2\2\'" +
                    "*\3\2\2\2()\3\2\2\2(&\3\2\2\2)+\3\2\2\2*(\3\2\2\2+,\7\7\2\2,\7\3\2\2\2" +
                    "-.\7\b\2\2./\t\2\2\2/\60\7\13\2\2\60\t\3\2\2\2\61\62\7\f\2\2\62\63\7\r" +
                    "\2\2\63\64\7\16\2\2\64\65\7\30\2\2\65\66\7\17\2\2\66\13\3\2\2\2\678\7" +
                    "\3\2\289\7\20\2\29:\7\5\2\2:;\7\31\2\2;<\7\7\2\2<\r\3\2\2\2=>\7\21\2\2" +
                    ">?\7\22\2\2?@\7\30\2\2@A\7\23\2\2A\17\3\2\2\2BC\7\24\2\2CD\7\22\2\2DE" +
                    "\7\30\2\2EF\7\23\2\2F\21\3\2\2\2GH\7\25\2\2HI\7\b\2\2IJ\t\2\2\2JK\7\13" +
                    "\2\2K\23\3\2\2\2\4\36(";
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

    public ModParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    private static String[] makeRuleNames() {
        return new String[]{
                "parse", "block", "importStatement", "extensiveQStatement", "headerStatement",
                "fromGitStatement", "loadfStatement", "loadStatement", "finishStatement"
        };
    }

    private static String[] makeLiteralNames() {
        return new String[]{
                null, "'#'", "'fromq'", "'{'", "'.'", "'}'", "'['", "'all'", "'*'", "']'",
                "'@'", "'module'", "'<'", "'>'", "'fromgit'", "'loadf'", "'('", "')'",
                "'load'", "'finish'"
        };
    }

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, null, null, null, null, null, null, null, null, null, null, null,
                null, null, null, null, null, null, null, null, "Bool", "Number", "Identifier",
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
        return "Mod.g4";
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
                setState(18);
                headerStatement();
                setState(19);
                block();
                setState(20);
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
        try {
            setState(28);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 0, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(22);
                    importStatement();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(23);
                    extensiveQStatement();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(24);
                    fromGitStatement();
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(25);
                    loadfStatement();
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(26);
                    loadStatement();
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(27);
                    finishStatement();
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

    public final ImportStatementContext importStatement() throws RecognitionException {
        ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_importStatement);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(30);
                match(T__0);
                setState(31);
                match(T__1);
                setState(32);
                match(T__2);
                setState(33);
                match(Identifier);
                setState(38);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 1, _ctx);
                while (_alt != 1 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1 + 1) {
                        {
                            {
                                setState(34);
                                match(T__3);
                                setState(35);
                                match(Identifier);
                            }
                        }
                    }
                    setState(40);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 1, _ctx);
                }
                setState(41);
                match(T__4);
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

    public final ExtensiveQStatementContext extensiveQStatement() throws RecognitionException {
        ExtensiveQStatementContext _localctx = new ExtensiveQStatementContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_extensiveQStatement);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(43);
                match(T__5);
                setState(44);
                _la = _input.LA(1);
                if (!(_la == T__6 || _la == T__7)) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
                setState(45);
                match(T__8);
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

    public final HeaderStatementContext headerStatement() throws RecognitionException {
        HeaderStatementContext _localctx = new HeaderStatementContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_headerStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(47);
                match(T__9);
                setState(48);
                match(T__10);
                setState(49);
                match(T__11);
                setState(50);
                match(Identifier);
                setState(51);
                match(T__12);
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

    public final FromGitStatementContext fromGitStatement() throws RecognitionException {
        FromGitStatementContext _localctx = new FromGitStatementContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_fromGitStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(53);
                match(T__0);
                setState(54);
                match(T__13);
                setState(55);
                match(T__2);
                setState(56);
                match(String);
                setState(57);
                match(T__4);
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

    public final LoadfStatementContext loadfStatement() throws RecognitionException {
        LoadfStatementContext _localctx = new LoadfStatementContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_loadfStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(59);
                match(T__14);
                setState(60);
                match(T__15);
                setState(61);
                match(Identifier);
                setState(62);
                match(T__16);
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

    public final LoadStatementContext loadStatement() throws RecognitionException {
        LoadStatementContext _localctx = new LoadStatementContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_loadStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(64);
                match(T__17);
                setState(65);
                match(T__15);
                setState(66);
                match(Identifier);
                setState(67);
                match(T__16);
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

    public final FinishStatementContext finishStatement() throws RecognitionException {
        FinishStatementContext _localctx = new FinishStatementContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_finishStatement);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(69);
                match(T__18);
                setState(70);
                match(T__5);
                setState(71);
                _la = _input.LA(1);
                if (!(_la == T__6 || _la == T__7)) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
                setState(72);
                match(T__8);
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

    public static class ParseContext extends ParserRuleContext {
        public ParseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public HeaderStatementContext headerStatement() {
            return getRuleContext(HeaderStatementContext.class, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public TerminalNode EOF() {
            return getToken(ModParser.EOF, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_parse;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ModListener) ((ModListener) listener).enterParse(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ModListener) ((ModListener) listener).exitParse(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ModVisitor) return ((ModVisitor<? extends T>) visitor).visitParse(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class BlockContext extends ParserRuleContext {
        public BlockContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public ImportStatementContext importStatement() {
            return getRuleContext(ImportStatementContext.class, 0);
        }

        public ExtensiveQStatementContext extensiveQStatement() {
            return getRuleContext(ExtensiveQStatementContext.class, 0);
        }

        public FromGitStatementContext fromGitStatement() {
            return getRuleContext(FromGitStatementContext.class, 0);
        }

        public LoadfStatementContext loadfStatement() {
            return getRuleContext(LoadfStatementContext.class, 0);
        }

        public LoadStatementContext loadStatement() {
            return getRuleContext(LoadStatementContext.class, 0);
        }

        public FinishStatementContext finishStatement() {
            return getRuleContext(FinishStatementContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_block;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ModListener) ((ModListener) listener).enterBlock(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ModListener) ((ModListener) listener).exitBlock(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ModVisitor) return ((ModVisitor<? extends T>) visitor).visitBlock(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ImportStatementContext extends ParserRuleContext {
        public ImportStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<TerminalNode> Identifier() {
            return getTokens(ModParser.Identifier);
        }

        public TerminalNode Identifier(int i) {
            return getToken(ModParser.Identifier, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_importStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ModListener) ((ModListener) listener).enterImportStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ModListener) ((ModListener) listener).exitImportStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ModVisitor) return ((ModVisitor<? extends T>) visitor).visitImportStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ExtensiveQStatementContext extends ParserRuleContext {
        public ExtensiveQStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_extensiveQStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ModListener) ((ModListener) listener).enterExtensiveQStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ModListener) ((ModListener) listener).exitExtensiveQStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ModVisitor)
                return ((ModVisitor<? extends T>) visitor).visitExtensiveQStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class HeaderStatementContext extends ParserRuleContext {
        public HeaderStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Identifier() {
            return getToken(ModParser.Identifier, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_headerStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ModListener) ((ModListener) listener).enterHeaderStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ModListener) ((ModListener) listener).exitHeaderStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ModVisitor) return ((ModVisitor<? extends T>) visitor).visitHeaderStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class FromGitStatementContext extends ParserRuleContext {
        public FromGitStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode String() {
            return getToken(ModParser.String, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_fromGitStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ModListener) ((ModListener) listener).enterFromGitStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ModListener) ((ModListener) listener).exitFromGitStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ModVisitor) return ((ModVisitor<? extends T>) visitor).visitFromGitStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class LoadfStatementContext extends ParserRuleContext {
        public LoadfStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Identifier() {
            return getToken(ModParser.Identifier, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_loadfStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ModListener) ((ModListener) listener).enterLoadfStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ModListener) ((ModListener) listener).exitLoadfStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ModVisitor) return ((ModVisitor<? extends T>) visitor).visitLoadfStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class LoadStatementContext extends ParserRuleContext {
        public LoadStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Identifier() {
            return getToken(ModParser.Identifier, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_loadStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ModListener) ((ModListener) listener).enterLoadStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ModListener) ((ModListener) listener).exitLoadStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ModVisitor) return ((ModVisitor<? extends T>) visitor).visitLoadStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class FinishStatementContext extends ParserRuleContext {
        public FinishStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_finishStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ModListener) ((ModListener) listener).enterFinishStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ModListener) ((ModListener) listener).exitFinishStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ModVisitor) return ((ModVisitor<? extends T>) visitor).visitFinishStatement(this);
            else return visitor.visitChildren(this);
        }
    }
}