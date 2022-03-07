package core.etc;

import core.interp.QLexer;
import core.interp.QParser;
import core.lang.lang;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
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

        lang.visitor.visit(tree);

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

        lang.resolveImport("System");

        if (this.file != null) {

            lexer = new QLexer(CharStreams.fromFileName(this.file.getName()));
            QParser parser = new QParser(new CommonTokenStream(lexer));
            parser.setBuildParseTree(true);
            ParseTree tree = parser.parse();

            lang.visitor.visit(tree);

        } else if (this.s != null) {

            lexer = new QLexer(this.s);
            QParser parser = new QParser(new CommonTokenStream(lexer));
            parser.setBuildParseTree(true);
            ParseTree tree = parser.parse();
            lang.visitor.visit(tree);

        } else if (this.str != null) {

            lexer = new QLexer(CharStreams.fromFileName(this.str));
            QParser parser = new QParser(new CommonTokenStream(lexer));
            parser.setBuildParseTree(true);
            ParseTree tree = parser.parse();

            lang.visitor.visit(tree);
        } else if (this.non != null) {

            lexer = new QLexer(CharStreams.fromString(this.non));
            QParser parser = new QParser(new CommonTokenStream(lexer));
            parser.setBuildParseTree(true);
            ParseTree tree = parser.parse();

            lang.visitor.visit(tree);

        }

        assert lexer != null;
        lexer.reset();
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        commonTokenStream.fill();
        return commonTokenStream.getTokens();

    }

    public void parse() throws IOException {
        lang.resolveImport("System");

        if (this.file != null) {

            QLexer lexer = new QLexer(CharStreams.fromFileName(this.file.getName()));
            QParser parser = new QParser(new CommonTokenStream(lexer));
            parser.setBuildParseTree(true);
            ParseTree tree = parser.parse();

            lang.visitor.visit(tree);

        } else if (this.s != null) {

            QLexer lexer = new QLexer(this.s);
            QParser parser = new QParser(new CommonTokenStream(lexer));
            parser.setBuildParseTree(true);
            ParseTree tree = parser.parse();

            lang.visitor.visit(tree);

        } else if (this.str != null) {

            QLexer lexer = new QLexer(CharStreams.fromFileName(this.str));
            QParser parser = new QParser(new CommonTokenStream(lexer));
            parser.setBuildParseTree(true);
            ParseTree tree = parser.parse();

            lang.visitor.visit(tree);
        } else if (this.non != null) {

            QLexer lexer = new QLexer(CharStreams.fromString(this.non));
            QParser parser = new QParser(new CommonTokenStream(lexer));
            parser.setBuildParseTree(true);
            ParseTree tree = parser.parse();

            lang.visitor.visit(tree);

        }


    }

    public Parser fromText(String text) {
        this.text = true;
        this.non = text;
        return this;
    }

}
