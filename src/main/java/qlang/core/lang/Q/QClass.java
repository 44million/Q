package qlang.core.lang.Q;

import qlang.core.internal.Scope;
import qlang.core.internal.Utilities;
import qlang.core.interpreter.QParser;
import qlang.core.lang.Environment;
import qlang.core.lang.Function;
import qlang.core.lang.Visitor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This class represents the QClass, controlling classes and objects.
 */
public class QClass implements Cloneable {

    /**
     * Predefined QClass instance for the base Object class.
     */
    public static QClass OBJECT = new QClass();

    /**
     * Name of the class.
     */
    public String name;

    /**
     * Map of functions associated with the class.
     */
    public Map<String, Function> functions;

    /**
     * Scope of the class.
     */
    public Scope scope;

    /**
     * List of constant arguments.
     */
    public List<Value> constArgs;

    /**
     * Reference to the base class.
     */
    public QClass base;

    /**
     * Visitor for the class.
     */
    public Visitor v;

    /**
     * Reference to the QParser.BlockContext node associated with the class.
     */
    public QParser.BlockContext node;

    /**
     * Constructs a QClass instance with specified parameters.
     *
     * @param name      The name of the class.
     * @param functions Map of functions associated with the class.
     * @param scope     The scope of the class.
     * @param node      Reference to the QParser.BlockContext node associated with the class.
     */
    public QClass(String name, Map<String, Function> functions, Scope scope, QParser.BlockContext node) {
        this.name = name;
        this.functions = functions;
        this.scope = scope;
        this.node = node;
    }

    /**
     * Default constructor for the base Object class.
     */
    public QClass() {
        this.name = Utilities.string();
        this.functions = new HashMap<>();
        this.scope = Environment.global.scope;
        this.constArgs = new ArrayList<>();
    }

    /**
     * Gets the name of the class.
     *
     * @return The name of the class.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the base class for the current class.
     *
     * @param base The base class.
     */
    public void setBase(QClass base) {
        this.base = base;
    }

    /**
     * Overrides the clone method to create a deep copy of the QClass.
     *
     * @return A cloned instance of the QClass.
     */
    @Override
    public QClass clone() {
        try {
            return (QClass) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    /**
     * This class represents an instance of a QObject, used for objects created from QClasses.
     */
    public static class QObject implements Cloneable {

        /**
         * Predefined QObject instance representing null.
         */
        public static QObject NULL = new QObject();

        /**
         * Name of the object.
         */
        public String name;

        /**
         * Associated QClass instance.
         */
        public QClass qc;

        /**
         * List of parameters for the object.
         */
        public List<Value> params;

        /**
         * Map of functions associated with the object.
         */
        public Map<String, Function> funcs;

        /**
         * Visitor for the object.
         */
        public Visitor v;

        /**
         * Map of variables associated with the object.
         */
        public Map<String, Value> vars;

        /**
         * Reference to the QParser.BlockContext node associated with the object.
         */
        public QParser.BlockContext node;

        /**
         * Private constructor for the NULL QObject instance.
         */
        private QObject() {
        }

        /**
         * Constructs a QObject instance with specified parameters.
         *
         * @param name     The name of the object.
         * @param instance The associated QClass instance.
         * @param node     Reference to the QParser.BlockContext node associated with the object.
         */
        public QObject(String name, QClass instance, QParser.BlockContext node) {
            this.name = name;
            this.qc = instance;
            this.funcs = new HashMap<>(instance.functions);
            this.vars = new HashMap<>(instance.scope.vars);
            this.node = node;
        }

        /**
         * Sets the parameters for the object.
         *
         * @param n The list of parameters.
         */
        public void setParams(List<Value> n) {
            this.params = n;
        }

        /**
         * Overrides the clone method to create a deep copy of the QObject.
         *
         * @return A cloned instance of the QObject.
         */
        @Override
        public QObject clone() {
            try {
                return (QObject) super.clone();
            } catch (CloneNotSupportedException e) {
                throw new AssertionError();
            }
        }
    }
}
