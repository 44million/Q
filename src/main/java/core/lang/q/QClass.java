package core.lang.q;

import core.etc.Scope;
import core.lang.Function;

import java.util.List;
import java.util.Map;

public class QClass {

    public String name;
    public Map<String, Function> functions;
    public Scope scope;
    public List<QValue> constArgs;
    public QClass base;

    public QClass(String name, Map<String, Function> functions, Scope scope) {
        this.name = name;
        this.functions = functions;
        this.scope = scope;
    }

    public String getName() {
        return name;
    }

    public void setConstArgs(List<QValue> constArgs) {
        this.constArgs = constArgs;
    }

    public void setBase(QClass base) {
        this.base = base;
    }

}
