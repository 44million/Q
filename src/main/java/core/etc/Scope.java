package core.etc;

import core.lang.QValue;

import java.util.HashMap;
import java.util.Map;

public class Scope {

    public final Map<String, QValue> variables;
    private final Scope parent;
    private final boolean isFunction;

    public Scope() {
        // only for the global scope, the parent is null
        this(null, false);
    }

    public Scope(Scope p, boolean function) {
        parent = p;
        variables = new HashMap<>();
        isFunction = function;
    }

    public void assignParam(String var, QValue value) {
        variables.put(var, value);
    }

    public void assign(String var, QValue value) {
        if (resolve(var, !isFunction) != null) {
            // There is already such a variable, re-assign it
            this.reAssign(var, value);
        } else {
            // A newly declared variable
            variables.put(var, value);
        }
    }

    private boolean isGlobalScope() {
        return parent == null;
    }

    public Scope parent() {
        return parent;
    }

    private void reAssign(String identifier, QValue value) {
        if (variables.containsKey(identifier)) {
            // The variable is declared in this scope
            variables.put(identifier, value);
        } else if (parent != null) {
            // The variable was not declared in this scope, so let
            // the parent scope re-assign it
            parent.reAssign(identifier, value);
        }
    }

    public QValue resolve(String var) {
        return resolve(var, true);
    }

    private QValue resolve(String var, boolean checkParent) {
        QValue value = variables.get(var);
        if (value != null) {
            // The variable resides in this scope
            return value;
        } else if (checkParent && !isGlobalScope()) {
            // Let the parent scope look for the variable
            return parent.resolve(var, !parent.isFunction);
        } else {
            // Unknown variable
            return null;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, QValue> var : variables.entrySet()) {
            sb.append(var.getKey()).append("->").append(var.getValue()).append(",");
        }
        return sb.toString();
    }
}
