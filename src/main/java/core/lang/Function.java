package core.lang;

import core.etc.ReturnValue;
import core.etc.Scope;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;
import java.util.Map;

public class Function {

    public final List<TerminalNode> params;
    private final Scope parentScope;
    private final ParseTree block;

    public Function(Scope parentScope, List<TerminalNode> params, ParseTree block) {
        this.parentScope = parentScope;
        this.params = params;
        this.block = block;
    }

    public QValue call(List<QValue> args, Map<String, Function> functions) {
        if (args.size() != this.params.size()) {
            throw new RuntimeException("[FATAL] Illegal Function call");
        }
        Scope scopeNext = new Scope(parentScope, true); // create function scope

        for (int i = 0; i < this.params.size(); i++) {
            QValue value = args.get(i);
            scopeNext.assignParam(this.params.get(i).getText(), value);
        }
        Visitor evalVistorNext = new Visitor(scopeNext, functions);

        QValue ret = QValue.VOID;
        try {
            evalVistorNext.visit(this.block);
        } catch (ReturnValue returnValue) {
            ret = returnValue.value;
        }
        return ret;
    }

    public boolean exists() {
        return true;
    }
}
