package core.etc;

import core.lang.q.Value;

import java.util.HashMap;
import java.util.Map;

public class Scope {

    public final Map<String, Value> vars;
    private final Scope parentScope;
    private final boolean isFunction;
    public boolean lib;
    public boolean sore;

    protected Scope() {
        this(null, false);
    }

    public Scope(Scope parent, boolean function) {
        this.parentScope = parent;
        this.vars = new HashMap<>();
        this.isFunction = function;
    }

    public void functionParam(String var, Value value) {
        this.vars.put(var, value);
    }

    public void varAssign(String var, Value value) {
        if (this.exists(var, !this.isFunction) != null) {

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

    private void varReAssign(String var, Value value) {
        if (this.vars.containsKey(var)) {
            this.vars.put(var, value);
        } else if (this.parentScope != null) {
            this.parentScope.varReAssign(var, value);
        }
    }

    public Value exists(String var) {
        return this.exists(var, true);
    }

    private Value exists(String var, boolean checkParent) {
        Value value = this.vars.get(var);
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

    public Value getAt(int distance, String name) {
        return this.ancestor(distance).vars.get(name);
    }

    public void assignAt(int distance, String name, Value value) {
        this.ancestor(distance).vars.put(name, value);
    }

}
