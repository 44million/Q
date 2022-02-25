package core.lang.q;

import core.lang.Function;

import java.util.List;
import java.util.Map;

@SuppressWarnings("all")
public class QObject {

    public String name;
    public QClass qc;
    public List<QValue> params;
    public Map<String, Function> funcs;

    public QObject(String name, QClass instance) {
        this.name = name;
        this.qc = instance;
    }

    public QObject get() {
        return this;
    }

    public void setParams(List<QValue> n) {
        this.params = n;
    }

    public void setFuncs() {
        this.funcs = qc.functions;
    }

}
