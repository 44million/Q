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

    protected Scope() {
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
        if (exists(var, !isFunction) != null) {

            if (value.constant) {
                System.out.println("[FATAL] Variable '" + var + "' is constant, and cannot be changed");
                System.exit(0);
            }

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

    private void varReAssign(String var, QValue value) {
        if (this.vars.containsKey(var)) {
            this.vars.put(var, value);
        } else if (parentScope != null) {
            this.parentScope.varReAssign(var, value);
        }
    }

    public QValue exists(String var) {
        return this.exists(var, true);
    }

    private QValue exists(String var, boolean checkParent) {
        QValue value = this.vars.get(var);
        if (value != null) {
            return value;
        } else if (checkParent && !this.isGlobalScope()) {
            return this.parentScope.exists(var, !this.parentScope.isFunction);
        } else {
            return null;
        }
    }

    public Scope ancestor(int history) {

        Scope environment = this;

        for (int i = 0; i < history; i++) {
            if (environment.parentScope != null) {
                environment = environment.parentScope;
            }
        }

        return environment;
    }

    public QValue getAt(int distance, String name) {
        return this.ancestor(distance).vars.get(name);
    }

    public void assignAt(int distance, String name, QValue value) {
        this.ancestor(distance).vars.put(name, value);
    }

}
