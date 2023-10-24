package qlang.core.internal;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.jetbrains.annotations.NotNull;
import qlang.core.interp.QLexer;
import qlang.core.interp.QParser;
import qlang.core.lang.Util;
import qlang.core.lang.Visitor;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/*

    Parser file, used to execute the file itself, this is what gets all of the visitors, and file paths
    and other important lexing steps together

 */

public class Parser {

    public Visitor v;
    private File file;
    private String str;
    private CharStream s;
    private String non;

    public Parser() {

    }

    public Parser(File file) {
        this.file = file;
        this.v = new Visitor(new Scope(Environment.global.scope, false), new HashMap<>());
    }

    public Parser(CharStream s) {
        this.s = s;
        this.v = new Visitor(new Scope(Environment.global.scope, false), new HashMap<>());
    }

    public static void execBlock(String str) {

        QLexer lexer = new QLexer(CharStreams.fromString(str));

        lexer.removeErrorListeners();
        lexer.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                if (msg.contains("token recognition error at: '\"\"")) {
                    return;
                }
                System.err.println("[FATAL " + line + ":" + charPositionInLine + "] Unexpected character: '" + msg + "'");
                System.exit(-1);
            }
        });

        QParser parser = new QParser(new CommonTokenStream(lexer));
        parser.removeErrorListeners();

        parser.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                System.err.println("[FATAL " + line + ":" + charPositionInLine + "] Unexpected character '" + offendingSymbol + "'");
                System.exit(-1);
            }
        });
        parser.setBuildParseTree(true);
        ParseTree tree = parser.parse();

        Environment.global.visitor.visit(tree);

    }

    @NotNull
    private static ParseTree getTree(QLexer lexer) {
        QParser parser = new QParser(new CommonTokenStream(lexer));
        parser.removeErrorListeners();

        parser.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                System.err.println("[FATAL " + line + ":" + charPositionInLine + "] Unexpected character '" + offendingSymbol + "'");
                System.exit(-1);
            }
        });
        parser.setBuildParseTree(true);
        ParseTree tree = parser.parse();
        return tree;
    }

    @NotNull
    private static ParseTree getParseTree(QLexer lexer) {
        QParser parser = new QParser(new CommonTokenStream(lexer));
        parser.removeErrorListeners();

        parser.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                System.err.println("[FATAL " + line + ":" + charPositionInLine + "] Unexpected character '" + offendingSymbol + "'");
                System.exit(-1);
            }
        });
        parser.setBuildParseTree(true);
        ParseTree tree = parser.parse();
        return tree;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public List<Token> parse(boolean ask) throws IOException {

        QLexer lexer = null;

        if (ask) {
            System.out.println("Enter the path to your file now:\n");
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            this.file = new File(s);
            this.str = s;
        }

        Util.resolveImport("System");

        if (this.file != null) {

            lexer = new QLexer(CharStreams.fromFileName(this.file.getName()));
            lexer.removeErrorListeners();
            lexer.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                    if (msg.contains("token recognition error at: '\"\"")) {
                        return;
                    }
                    System.err.println("[FATAL " + line + ":" + charPositionInLine + "] Unexpected character: '" + msg + "'");
                    System.exit(-1);
                }
            });
            QParser parser = new QParser(new CommonTokenStream(lexer));
            parser.removeErrorListeners();

            parser.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                    System.err.println("[FATAL " + line + ":" + charPositionInLine + "] Unexpected character '" + offendingSymbol + "'");
                    System.exit(-1);
                }
            });
            parser.setBuildParseTree(true);
            ParseTree tree = parser.parse();

            Environment.global.visitor.visit(tree);

        } else if (this.s != null) {

            lexer = new QLexer(this.s);
            lexer.removeErrorListeners();
            lexer.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                    if (msg.contains("token recognition error at: '\"\"")) {
                        return;
                    }
                    System.err.println("[FATAL " + line + ":" + charPositionInLine + "] Unexpected character: '" + msg + "'");
                    System.exit(-1);
                }
            });
            QParser parser = new QParser(new CommonTokenStream(lexer));

            parser.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                    System.err.println("[FATAL " + line + ":" + charPositionInLine + "] Unexpected character '" + offendingSymbol + "'");
                    System.exit(-1);
                }
            });

            parser.setBuildParseTree(true);
            parser.removeErrorListeners();
            ParseTree tree = parser.parse();
            Environment.global.visitor.visit(tree);

        } else if (this.str != null) {

            lexer = new QLexer(CharStreams.fromFileName(this.str));
            lexer.removeErrorListeners();
            lexer.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                    if (msg.contains("token recognition error at: '\"\"")) {
                        return;
                    }
                    System.err.println("[FATAL " + line + ":" + charPositionInLine + "] Unexpected character: '" + msg + "'");
                    System.exit(-1);
                }
            });
            QParser parser = new QParser(new CommonTokenStream(lexer));

            parser.removeErrorListeners();

            parser.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                    System.err.println("[FATAL " + line + ":" + charPositionInLine + "] Unexpected character '" + offendingSymbol + "'");
                    System.exit(-1);
                }
            });

            parser.setBuildParseTree(true);

            ParseTree tree = parser.parse();

            Environment.global.visitor.visit(tree);
        } else if (this.non != null) {

            lexer = new QLexer(CharStreams.fromString(this.non));
            lexer.removeErrorListeners();
            lexer.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                    if (msg.contains("token recognition error at: '\"\"")) {
                        return;
                    }
                    System.err.println("[FATAL " + line + ":" + charPositionInLine + "] Unexpected character: '" + msg + "'");
                    System.exit(-1);
                }
            });
            QParser parser = new QParser(new CommonTokenStream(lexer));
            parser.removeErrorListeners();

            parser.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                    System.err.println("[FATAL " + line + ":" + charPositionInLine + "] Unexpected character '" + offendingSymbol + "'");
                    System.exit(-1);
                }
            });
            parser.setBuildParseTree(true);
            ParseTree tree = parser.parse();

            Environment.global.visitor.visit(tree);

        }

        assert lexer != null;
        lexer.reset();
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        commonTokenStream.fill();
        return commonTokenStream.getTokens();

    }

    public void parse() throws IOException {
        Util.resolveImport("System");

        if (this.file != null) {

            QLexer lexer = new QLexer(CharStreams.fromFileName(this.file.getName()));
            lexer.removeErrorListeners();
            lexer.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                    if (msg.contains("token recognition error at: '\"\"")) {
                        return;
                    }
                    System.err.println("[FATAL " + line + ":" + charPositionInLine + "] Unexpected character: '" + msg + "'");
                    System.exit(-1);
                }
            });
            QParser parser = new QParser(new CommonTokenStream(lexer));
            parser.removeErrorListeners();

            parser.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                    System.err.println("[FATAL " + line + ":" + charPositionInLine + "] Unexpected character '" + offendingSymbol + "'");
                    System.exit(-1);
                }
            });
            parser.setBuildParseTree(true);
            ParseTree tree = parser.parse();

            Environment.global.visitor.visit(tree);

        } else if (this.s != null) {

            QLexer lexer = new QLexer(this.s);
            lexer.removeErrorListeners();
            lexer.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                    if (msg.contains("token recognition error at: '\"\"")) {
                        return;
                    }
                    System.err.println("[FATAL " + line + ":" + charPositionInLine + "] Unexpected character: '" + msg + "'");
                    System.exit(-1);
                }
            });
            QParser parser = new QParser(new CommonTokenStream(lexer));
            parser.removeErrorListeners();

            parser.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                    System.err.println("[FATAL " + line + ":" + charPositionInLine + "] Unexpected character '" + offendingSymbol + "'");
                    System.exit(-1);
                }
            });
            parser.setBuildParseTree(true);
            ParseTree tree = parser.parse();

            Environment.global.visitor.visit(tree);

        } else if (this.str != null) {

            QLexer lexer = new QLexer(CharStreams.fromFileName(this.str));
            lexer.removeErrorListeners();
            lexer.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                    if (msg.contains("token recognition error at: '\"\"")) {
                        return;
                    }
                    System.err.println("[FATAL " + line + ":" + charPositionInLine + "] Unexpected character: '" + msg + "'");
                    System.exit(-1);
                }
            });
            ParseTree tree = getTree(lexer);

            Environment.global.visitor.visit(tree);
        } else if (this.non != null) {

            QLexer lexer = new QLexer(CharStreams.fromString(this.non));
            lexer.removeErrorListeners();
            lexer.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                    if (msg.contains("token recognition error at: '\"\"")) {
                        return;
                    }
                    System.err.println("[FATAL " + line + ":" + charPositionInLine + "] Unexpected character: '" + msg + "'");
                    System.exit(-1);
                }
            });
            ParseTree tree = getParseTree(lexer);

            Environment.global.visitor.visit(tree);

        }

    }

    public Parser fromText(String text) {
        this.non = text;
        this.v = new Visitor(new Scope(Environment.global.scope, false), new HashMap<>());
        return this;
    }

}
