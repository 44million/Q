package mod.core.modvals;

import core.etc.Parser;
import core.lang.lang;
import mod.core.ilp.ModBaseVisitor;
import mod.raw.ModLexer;
import mod.raw.ModParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.File;
import java.io.IOException;

public class Visitor extends ModBaseVisitor<Val> {

    public static Module mod;

    public Visitor() {
    }

    @Override
    public Val visitBlock(ModParser.BlockContext ctx) {
        return visitChildren(ctx);
    }

    public void visit(String context, boolean isFile) {

        ModLexer lexer = null;

        if (isFile) {
            try {
                lexer = new ModLexer(CharStreams.fromFileName(context));
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        } else {
            lexer = new ModLexer(CharStreams.fromString(context));
        }

        assert lexer != null;
        ModParser parser = new ModParser(new CommonTokenStream(lexer));
        parser.setBuildParseTree(true);
        ParseTree tree = parser.parse();

        this.visit(tree);

    }

    @Override
    public Val visitHeaderStatement(ModParser.HeaderStatementContext ctx) {
        mod.setId(ctx.Identifier().getText());
        return new Val(0);
    }

    @Override
    public Val visitImportStatement(ModParser.ImportStatementContext ctx) {

        StringBuilder path = new StringBuilder();

        for (TerminalNode o : ctx.Identifier()) {
            path.append("/").append(o.getText());
        }

        Parser parser = new Parser(new File(path.toString()));
        try {
            parser.parse(false);
            lang.parsed.add(new File(path.toString()));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return new Val(0);
    }

    @Override
    public Val visitLoadfStatement(ModParser.LoadfStatementContext ctx) {

        lang.mod = mod;

        return new Val(0);
    }

    @Override
    public Val visitExtensiveQStatement(ModParser.ExtensiveQStatementContext ctx) {

        mod.imports.add("q.Time");
        mod.imports.add("q.Windows");
        mod.imports.add("q.Math");
        mod.imports.add("q.Audio");
        mod.imports.add("q.http");
        mod.imports.add("q.Random");
        mod.imports.add("q.Console");
        mod.imports.add("q.puddle");

        return new Val(0);
    }

    @Override
    public Val visitFromGitStatement(ModParser.FromGitStatementContext ctx) {

        String link = (ctx.String().getText().replace("\"", ""));

        link = link
                .replace("https://github.com/", "https://raw.githubusercontent.com/")
                .replace("/blob", "");


        String fileContents = lang.getTextFromGithub(link);

        Parser parser = new Parser().fromText(fileContents);
        try {
            parser.parse(false);

            mod.gits.add(link);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return new Val(0);
    }

    @Override
    public Val visitLoadStatement(ModParser.LoadStatementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Val visitFinishStatement(ModParser.FinishStatementContext ctx) {
        lang.mod = mod;

        return new Val(0);
    }

}
