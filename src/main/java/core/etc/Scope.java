package core.etc;

import core.lang.q.QValue;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("all")
public class Scope {

    public final Map<String, QValue> vars;
    private final Scope parentScope;
    private final boolean isFunction;
    public boolean lib;

    public Scope() {
        this(null, false);
    }

    public Scope(Scope parent, boolean function) {
        this.parentScope = parent;
        this.vars = new HashMap<>();
        this.isFunction = function;
    }

    public void functionParam(String var, QValue value) {
        vars.put(var, value);
    }

    public void varAssign(String var, QValue value) {

        if (value.constant) {
            System.out.println("[FATAL] Variable '" + var + "' is constant, and cannot be changed");
            System.exit(0);
        }

        if (exists(var, !isFunction) != null) {
            this.varReAssign(var, value);
        } else {
            this.vars.put(var, value);
        }
    }

    private boolean isGlobalScope() {
        return this.parentScope == null;
    }

    public Scope parent() {
        return this.parentScope;
    }

    private void varReAssign(String identifier, QValue value) {
        if (this.vars.containsKey(identifier)) {
            this.vars.put(identifier, value);
        } else if (parentScope != null) {
            this.parentScope.varReAssign(identifier, value);
        }
    }

    public QValue exists(String var) {
        return this.exists(var, true);
    }

    private QValue exists(String var, boolean checkParent) {
        QValue value = this.vars.get(var);
        if (value != null) {
            return value;
        } else if (checkParent && !isGlobalScope()) {
            return this.parentScope.exists(var, !this.parentScope.isFunction);
        } else {
            return null;
        }
    }

}
