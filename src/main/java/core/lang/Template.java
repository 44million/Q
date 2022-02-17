package core.lang;

import core.etc.Parser;
import org.antlr.v4.runtime.tree.ParseTree;

public class Template {

    private String block;
    private ParseTree tree;

    public Template(String block) {
        this.block = block;
    }

    public Template(ParseTree tree) {
        this.tree = tree;
    }

    public void visit() {
        if (this.tree != null) {
            lang.visitor.visit(this.tree);
        } else {
            Parser.execBlock(this.block);
        }
    }

}
