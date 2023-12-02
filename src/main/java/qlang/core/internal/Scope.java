package qlang.core.internal;

import qlang.core.lang.Q.Value;

import java.util.HashMap;
import java.util.Map;

/**
 * This class represents the scope, controlling the organization of functions, variables, and other runtime essentials.
 */
public class Scope implements Cloneable {

    /**
     * Map to store variables and their corresponding values.
     */
    public final Map<String, Value> vars;

    /**
     * Reference to the parent scope.
     */
    private final Scope parentScope;

    /**
     * Flag indicating whether the scope is associated with a function.
     */
    private final boolean isFunction;

    /**
     * Flag indicating whether the scope is associated with a library.
     */
    public boolean lib;

    /**
     * Flag indicating whether the scope is associated with a script or expression.
     */
    public boolean sore;

    /**
     * Constructs a new scope without a parent scope.
     */
    public Scope() {
        this(null, false);
    }

    /**
     * Constructs a new scope with a specified parent scope and function flag.
     *
     * @param parent   The parent scope.
     * @param function Flag indicating whether the scope is associated with a function.
     */
    public Scope(Scope parent, boolean function) {
        this.parentScope = parent;
        this.vars = new HashMap<>();
        this.isFunction = function;
    }

    /**
     * Adds a function parameter to the scope.
     *
     * @param var   The name of the parameter.
     * @param value The value of the parameter.
     */
    public void functionParam(String var, Value value) {
        this.vars.put(var, value);
    }

    /**
     * Assigns a value to a variable in the scope, handling reassignment and constant checks.
     *
     * @param var   The name of the variable.
     * @param value The value to be assigned.
     */
    public void varAssign(String var, Value value) {
        if (this.exists(var, !this.isFunction) != null) {

            if (value.constant) {
                Log.log(Log.Severity.FATAL, "Variable '" + var + "' is constant, and cannot be changed");
                System.exit(0);
            }

            this.varReAssign(var, value);
        } else {
            this.vars.put(var, value);
        }
    }

    /**
     * Checks if the scope is the global scope.
     *
     * @return True if the scope is the global scope, false otherwise.
     */
    private boolean isGlobalScope() {
        return this.parentScope == null;
    }

    /**
     * Retrieves the parent scope.
     *
     * @return The parent scope.
     */
    public Scope parent() {
        return this.parentScope;
    }

    /**
     * Reassigns the value of an existing variable in the scope or its parent scopes.
     *
     * @param var   The name of the variable.
     * @param value The new value to be assigned.
     */
    private void varReAssign(String var, Value value) {
        if (this.vars.containsKey(var)) {
            this.vars.put(var, value);
        } else if (this.parentScope != null) {
            this.parentScope.varReAssign(var, value);
        }
    }

    /**
     * Checks if a variable exists in the scope or its parent scopes.
     *
     * @param var The name of the variable.
     * @return The value associated with the variable if found, null otherwise.
     */
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

    /**
     * Overrides the clone method to create a deep copy of the scope.
     *
     * @return A cloned instance of the scope.
     */
    @Override
    public Scope clone() {
        try {
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return (Scope) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
