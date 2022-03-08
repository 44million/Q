package core.etc;

import core.interp.QLexer;
import core.interp.QParser;
import core.lang.util;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Parser {

    private File file;
    private String str;
    private CharStream s;
    private boolean text;
    private String non;

    public Parser() {

    }

    public Parser(File file) {
        this.file = file;
    }

    public Parser(CharStream s) {
        this.s = s;
    }

    public Parser(String str) {
        this.str = str;
        this.file = new File(str);
    }

    public static void execBlock(String str) {

        QLexer lexer = new QLexer(CharStreams.fromString(str));
        QParser parser = new QParser(new CommonTokenStream(lexer));
        parser.setBuildParseTree(true);
        ParseTree tree = parser.parse();

        Environment.global.visitor.visit(tree);

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

        util.resolveImport("System");

        if (this.file != null) {

            lexer = new QLexer(CharStreams.fromFileName(this.file.getName()));
            QParser parser = new QParser(new CommonTokenStream(lexer));
            parser.setBuildParseTree(true);
            ParseTree tree = parser.parse();

            Environment.global.visitor.visit(tree);

        } else if (this.s != null) {

            lexer = new QLexer(this.s);
            QParser parser = new QParser(new CommonTokenStream(lexer));
            parser.setBuildParseTree(true);

            parser.removeErrorListeners();

            parser.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                    System.out.println("[FATAL " + line + ":" + charPositionInLine + "] Unexpected character '" + offendingSymbol + "'");
                    System.exit(-1);
                }
            });

            ParseTree tree = parser.parse();
            Environment.global.visitor.visit(tree);

        } else if (this.str != null) {

            lexer = new QLexer(CharStreams.fromFileName(this.str));
            QParser parser = new QParser(new CommonTokenStream(lexer));
            parser.setBuildParseTree(true);
            ParseTree tree = parser.parse();

            Environment.global.visitor.visit(tree);
        } else if (this.non != null) {

            lexer = new QLexer(CharStreams.fromString(this.non));
            QParser parser = new QParser(new CommonTokenStream(lexer));
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
        util.resolveImport("System");

        if (this.file != null) {

            QLexer lexer = new QLexer(CharStreams.fromFileName(this.file.getName()));
            QParser parser = new QParser(new CommonTokenStream(lexer));
            parser.setBuildParseTree(true);
            ParseTree tree = parser.parse();

            Environment.global.visitor.visit(tree);

        } else if (this.s != null) {

            QLexer lexer = new QLexer(this.s);
            QParser parser = new QParser(new CommonTokenStream(lexer));
            parser.setBuildParseTree(true);
            ParseTree tree = parser.parse();

            Environment.global.visitor.visit(tree);

        } else if (this.str != null) {

            QLexer lexer = new QLexer(CharStreams.fromFileName(this.str));
            QParser parser = new QParser(new CommonTokenStream(lexer));
            parser.setBuildParseTree(true);
            ParseTree tree = parser.parse();

            Environment.global.visitor.visit(tree);
        } else if (this.non != null) {

            QLexer lexer = new QLexer(CharStreams.fromString(this.non));
            QParser parser = new QParser(new CommonTokenStream(lexer));
            parser.setBuildParseTree(true);
            ParseTree tree = parser.parse();

            Environment.global.visitor.visit(tree);

        }


    }

    public Parser fromText(String text) {
        this.text = true;
        this.non = text;
        return this;
    }

}
