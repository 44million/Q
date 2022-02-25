package core.lang;

import core.etc.RVal;
import core.etc.Scope;
import core.lang.q.QValue;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public class Function extends Thread {

    public final List<TerminalNode> params;
    private final Scope parentScope;
    private final ParseTree block;
    public boolean async;

    public Function(Scope parentScope, List<TerminalNode> params, ParseTree block) {
        this.parentScope = parentScope;
        this.params = params;
        this.block = block;
    }

    public QValue call(List<QValue> args, Map<String, Function> functions) {
        if (args.size() != this.params.size()) {
            throw new RuntimeException("[ERROR] Illegal Function call");
        }
        Scope scopeNext = new Scope(parentScope, true); // create function scope

        for (int i = 0; i < this.params.size(); i++) {
            QValue value = args.get(i);
            scopeNext.functionParam(this.params.get(i).getText(), value);
        }
        Visitor next = new Visitor(scopeNext, functions);

        QValue ret = QValue.VOID;
        try {
            next.visit(this.block);
        } catch (RVal returnValue) {
            ret = returnValue.value;
        }
        return ret;
    }


    public boolean exists() {
        return true;
    }

    public void setAsync(boolean flag) {
        this.async = flag;
    }

    public void run() {

    }

}
