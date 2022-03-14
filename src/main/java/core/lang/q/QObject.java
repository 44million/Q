package core.lang.q;

import core.lang.Function;
import core.lang.Visitor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QObject {

    public static QObject NULL = new QObject();

    public String name;
    public QClass qc;
    public List<Value> params;
    public Map<String, Function> funcs;
    public Visitor v;
    public Map<String, Value> vars;

    private QObject() {
    }

    public QObject(String name, QClass instance) {
        this.name = name;
        this.qc = instance;
        this.funcs = new HashMap<>(instance.functions);
        this.vars = new HashMap<>(instance.scope.vars);
    }

    public QObject get() {
        return this;
    }

    public void setParams(List<Value> n) {
        this.params = n;
    }
}
