package xxl.XXLang.etc;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import xxl.XXLang.lang.lang;
import xxl.lang.XXLLexer;
import xxl.lang.XXLParser;

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

        XXLLexer lexer = new XXLLexer(CharStreams.fromString(str));
        XXLParser parser = new XXLParser(new CommonTokenStream(lexer));
        parser.setBuildParseTree(true);
        ParseTree tree = parser.parse();

        lang.visitor.visit(tree);

    }

    public void setFile(File file) {
        this.file = file;
    }

    public void setStr(String str) {
        this.str = str;
        this.file = new File(str);
    }

    public List<Token> parse(boolean ask) throws IOException {

        XXLLexer lexer = null;

        if (ask) {
            System.out.println("Enter the path to your file now:\n");
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            this.file = new File(s);
            this.str = s;
        }

        lang.resolveImport("System");

        if (this.file != null) {

            lexer = new XXLLexer(CharStreams.fromFileName(this.file.getName()));
            XXLParser parser = new XXLParser(new CommonTokenStream(lexer));
            parser.setBuildParseTree(true);
            ParseTree tree = parser.parse();

            lang.visitor.visit(tree);

        } else if (this.s != null) {

            lexer = new XXLLexer(this.s);
            XXLParser parser = new XXLParser(new CommonTokenStream(lexer));
            parser.setBuildParseTree(true);
            ParseTree tree = parser.parse();

            lang.visitor.visit(tree);

        } else if (this.str != null) {

            lexer = new XXLLexer(CharStreams.fromFileName(this.str));
            XXLParser parser = new XXLParser(new CommonTokenStream(lexer));
            parser.setBuildParseTree(true);
            ParseTree tree = parser.parse();

            lang.visitor.visit(tree);
        } else if (this.non != null) {

            lexer = new XXLLexer(CharStreams.fromString(this.non));
            XXLParser parser = new XXLParser(new CommonTokenStream(lexer));
            parser.setBuildParseTree(true);
            ParseTree tree = parser.parse();

            lang.visitor.visit(tree);

        }

        assert lexer != null;
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        commonTokenStream.fill();
        return commonTokenStream.getTokens();

    }

    public void parse() throws IOException {
        lang.resolveImport("System");

        if (this.file != null) {

            XXLLexer lexer = new XXLLexer(CharStreams.fromFileName(this.file.getName()));
            XXLParser parser = new XXLParser(new CommonTokenStream(lexer));
            parser.setBuildParseTree(true);
            ParseTree tree = parser.parse();

            lang.visitor.visit(tree);

        } else if (this.s != null) {

            XXLLexer lexer = new XXLLexer(this.s);
            XXLParser parser = new XXLParser(new CommonTokenStream(lexer));
            parser.setBuildParseTree(true);
            ParseTree tree = parser.parse();

            lang.visitor.visit(tree);

        } else if (this.str != null) {

            XXLLexer lexer = new XXLLexer(CharStreams.fromFileName(this.str));
            XXLParser parser = new XXLParser(new CommonTokenStream(lexer));
            parser.setBuildParseTree(true);
            ParseTree tree = parser.parse();

            lang.visitor.visit(tree);
        } else if (this.non != null) {

            XXLLexer lexer = new XXLLexer(CharStreams.fromString(this.non));
            XXLParser parser = new XXLParser(new CommonTokenStream(lexer));
            parser.setBuildParseTree(true);
            ParseTree tree = parser.parse();

            lang.visitor.visit(tree);

        }


    }

    public void parseSafe() {

        if (this.file != null) {

            XXLLexer lexer = null;
            try {
                lexer = new XXLLexer(CharStreams.fromFileName(this.file.getName()));
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
            XXLParser parser = new XXLParser(new CommonTokenStream(lexer));
            parser.setBuildParseTree(true);
            ParseTree tree = parser.parse();

            lang.visitor.visit(tree);

        } else if (this.s != null) {

            XXLLexer lexer = new XXLLexer(this.s);
            XXLParser parser = new XXLParser(new CommonTokenStream(lexer));
            parser.setBuildParseTree(true);
            ParseTree tree = parser.parse();

            lang.visitor.visit(tree);

        } else if (this.str != null) {

            XXLLexer lexer = null;
            try {
                lexer = new XXLLexer(CharStreams.fromFileName(this.str));
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
            XXLParser parser = new XXLParser(new CommonTokenStream(lexer));
            parser.setBuildParseTree(true);
            ParseTree tree = parser.parse();

            lang.visitor.visit(tree);
        } else if (this.non != null) {

            XXLLexer lexer = new XXLLexer(CharStreams.fromString(this.non));
            XXLParser parser = new XXLParser(new CommonTokenStream(lexer));
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
