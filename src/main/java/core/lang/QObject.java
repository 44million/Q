package core.lang;

import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

public class QObject {

    public String name;
    public QClass qc;
    public List<TerminalNode> params;

    public QObject(String name, QClass instance) {
        this.name = name;
        this.qc = instance;
    }

    public QObject get() {
        return this;
    }


}
