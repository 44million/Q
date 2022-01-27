package xxl.XXLang.etc;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;
import java.util.Map;

public class Function {

    private final Scope parentScope;
    private final List<TerminalNode> params;
    private final ParseTree block;

    public Function(Scope parentScope, List<TerminalNode> params, ParseTree block) {
        this.parentScope = parentScope;
        this.params = params;
        this.block = block;
    }

    public XValue call(List<XValue> args, Map<String, Function> functions) {
        if (args.size() != this.params.size()) {
            throw new RuntimeException("[FATAL] Illegal Function call");
        }
        Scope scopeNext = new Scope(parentScope, true); // create function scope

        for (int i = 0; i < this.params.size(); i++) {
            XValue value = args.get(i);
            scopeNext.assignParam(this.params.get(i).getText(), value);
        }
        EvalVisitor evalVistorNext = new EvalVisitor(scopeNext, functions);

        XValue ret = XValue.VOID;
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
