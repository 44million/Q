package core.lang.q;

import core.etc.Scope;
import core.lang.Function;
import core.lang.Visitor;
import core.lang.lang;

import java.util.ArrayList;
import java.util.List;

public class QClass {

    public String name;
    public Scope scope;
    public Visitor v;

    public QClass(String name, Scope scope, Visitor v) {
        this.name = name;
        this.scope = scope;
        this.v = v;
    }

    public Function getFunc(String name) {

        if (v.functions.containsKey(name)) {
            return v.functions.get(name);
        }

        return null;
    }

}
