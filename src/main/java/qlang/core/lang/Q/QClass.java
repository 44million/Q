package qlang.core.lang.Q;

import qlang.core.internal.Environment;
import qlang.core.internal.Scope;
import qlang.core.interp.QParser;
import qlang.core.lang.Function;
import qlang.core.lang.Visitor;
import qlang.core.lang.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QClass implements Cloneable {

    public static QClass OBJECT = new QClass();

    public String name;
    public Map<String, Function> functions;
    public Scope scope;
    public List<Value> constArgs;
    public QClass base;
    public Visitor v;
    public QParser.BlockContext node;

    public QClass(String name, Map<String, Function> functions, Scope scope, QParser.BlockContext node) {
        this.name = name;
        this.functions = functions;
        this.scope = scope;
        this.node = node;
    }

    public QClass() {
        this.name = util.string();
        this.functions = new HashMap<>();
        this.scope = Environment.global.scope;
        this.constArgs = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setBase(QClass base) {
        this.base = base;
    }

    @Override
    public QClass clone() {
        try {
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return (QClass) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public static class QObject implements Cloneable {

        public static QObject NULL = new QObject();

        public String name;
        public QClass qc;
        public List<Value> params;
        public Map<String, Function> funcs;
        public Visitor v;
        public Map<String, Value> vars;
        public QParser.BlockContext node;

        private QObject() {
        }

        public QObject(String name, QClass instance, QParser.BlockContext node) {
            this.name = name;
            this.qc = instance;
            this.funcs = new HashMap<>(instance.functions);
            this.vars = new HashMap<>(instance.scope.vars);
            this.node = node;
        }

        public void setParams(List<Value> n) {
            this.params = n;
        }

        @Override
        public QObject clone() {
            try {
                // TODO: copy mutable state here, so the clone can't change the internals of the original
                return (QObject) super.clone();
            } catch (CloneNotSupportedException e) {
                throw new AssertionError();
            }
        }
    }
}
