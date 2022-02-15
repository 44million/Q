package core.lang;

import core.etc.ReturnValue;
import core.etc.Scope;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;
import java.util.Map;

public class CFunction {

    private final List<TerminalNode> params;
    private final QClass parentClass;
    private final Scope parentScope;
    public String name;
    private ParseTree block;

    public CFunction(String name, List<TerminalNode> params, QClass parent, ParseTree block, Scope c) {
        this.name = name;
        this.params = params;
        this.parentClass = parent;
        this.block = block;
        this.parentScope = c;

        if (this.params.get(0).getText().startsWith("<")) {
            this.params.remove(0);
        }

    }

    public void setBlock(ParseTree newBLock) {
        this.block = newBLock;
    }

    public QValue call(List<QValue> args, Map<String, Function> functions) {
        if (args.size() != this.params.size()) {
            throw new RuntimeException("[FATAL] Illegal Function call: argument lists do not match for: " + this.name);
        }
        Scope scopeNext = new Scope(parentScope, true); // create function scope

        for (int i = 0; i < this.params.size(); i++) {
            QValue value = args.get(i);
            scopeNext.assignParam(this.params.get(i).getText(), value);
        }
        EvalVisitor evalVistorNext = new EvalVisitor(scopeNext, functions);

        QValue ret = QValue.VOID;
        try {
            evalVistorNext.visit(this.block);
        } catch (ReturnValue returnValue) {
            ret = returnValue.value;
        }
        return ret;
    }

    public QClass getParent() {
        return this.parentClass;
    }

}
