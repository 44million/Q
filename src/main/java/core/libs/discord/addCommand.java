package core.libs.discord;

import core.lang.lang;
import core.libs.utils.QLibrary;
import org.antlr.v4.runtime.tree.TerminalNode;

public class addCommand extends QLibrary {

    private final TerminalNode block;
    public String event;

    public addCommand(TerminalNode block, String event) {
        this.block = block;
        this.event = event;
    }

    @Override
    public String getName() {
        return "q.Discord";
    }

    public void invoke() {
        lang.visitor.visit(block);
    }

    @Override
    public void init() {
    }
}
