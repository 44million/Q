package core.etc;

import core.lang.Function;
import core.lang.q.QValue;

import java.util.HashMap;

public class Environment {

    final Environment before;
    public HashMap<String, Function> fns;
    public HashMap<String, QValue> vars;

    public Environment() {
        this.before = null;
        this.fns = new HashMap<>();
        this.vars = new HashMap<>();
    }

    public Environment(Environment e) {
        this.before = e;
        this.fns = new HashMap<>();
        this.vars = new HashMap<>();
    }

    public void define(String s, QValue e) {
        this.vars.put(s, e);
    }

    public void define(String s, Function f) {
        this.fns.put(s, f);
    }

    public Environment ancestor(int history) {

        Environment environment = this;

        for (int i = 0; i < history; i++) {
            if (environment.before != null) {
                environment = environment.before;
            }
        }

        return environment;
    }

    QValue getAt(int distance, String name) {
        return this.ancestor(distance).vars.get(name);
    }

    void assignAt(int distance, String name, QValue value) {
        this.ancestor(distance).vars.put(name, value);
    }

}
