package qlang.core.lang.Q;

import java.io.File;
import java.util.List;

/**
 * This class represents the Value in QLang, holding the value of variables and linked to ANTLR's lexing processes.
 */
@SuppressWarnings("all")
public class Value implements Comparable<Value> {

    /**
     * Predefined Value instance representing null.
     */
    public static final Value NULL = new Value();

    /**
     * Predefined Value instance representing void.
     */
    public static final Value VOID = new Value();

    /**
     * The actual value stored in the Value instance.
     */
    private final Object value;

    /**
     * Flag indicating whether the Value is constant.
     */
    public boolean constant = false;

    /**
     * Flag indicating whether the Value has a value.
     */
    public boolean hasVal;

    /**
     * Identifier associated with the Value.
     */
    public String id;

    /**
     * Private constructor for the NULL and VOID instances.
     */
    private Value() {
        value = new Object();
    }

    /**
     * Constructs a Value instance with a specified value.
     *
     * @param v The value to be stored in the Value instance.
     */
    public Value(Object v) {
        if (v == null) {
            throw new RuntimeException("[ERROR] v is null.");
        }
        value = v;
        if (!(isBoolean() || isList() || isNumber() || isString() || isFile())) {
            throw new RuntimeException("invalid data type: " + v + " (" + v.getClass() + ")");
        }
    }

    /**
     * Retrieves the value as a Boolean.
     *
     * @return The value as a Boolean.
     */
    public Boolean asBoolean() {
        return (Boolean) value;
    }

    /**
     * Retrieves the value as a Double.
     *
     * @return The value as a Double.
     */
    public Double asDouble() {
        return ((Number) value).doubleValue();
    }

    /**
     * Retrieves the value as a File.
     *
     * @return The value as a File.
     */
    public File asFile() {
        return ((File) value);
    }

    /**
     * Retrieves the value as a Long.
     *
     * @return The value as a Long.
     */
    public Long asLong() {
        return ((Number) value).longValue();
    }

    /**
     * Retrieves the value as a List of Values.
     *
     * @return The value as a List of Values.
     */
    @SuppressWarnings("unchecked")
    public List<Value> asList() {
        return (List<Value>) value;
    }

    /**
     * Retrieves the value as a String.
     *
     * @return The value as a String.
     */
    public String asString() {
        return (String) value;
    }

    /**
     * Compares the current Value instance with another Value instance.
     *
     * @param that The Value to compare with.
     * @return 0 if equal, a positive value if greater, and a negative value if smaller.
     */
    @Override
    public int compareTo(Value that) {
        if (this.isNumber() && that.isNumber()) {
            if (this.equals(that)) {
                return 0;
            } else {
                return this.asDouble().compareTo(that.asDouble());
            }
        } else if (this.isString() && that.isString()) {
            return this.asString().compareTo(that.asString());
        } else {
            throw new RuntimeException("illegal expression: can't compare `" + this + "` to `" + that + "`");
        }
    }

    /**
     * Checks if the current Value instance is equal to another Object.
     *
     * @param o The Object to compare with.
     * @return True if equal, false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == VOID || o == VOID) {
            throw new RuntimeException("can't use VOID: " + this + " ==/!= " + o);
        }
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        Value that = (Value) o;
        if (this.isNumber() && that.isNumber()) {
            double diff = Math.abs(this.asDouble() - that.asDouble());
            return diff < 0.00000000001;
        } else {
            return this.value.equals(that.value);
        }
    }

    /**
     * Retrieves the current Value instance.
     *
     * @return The current Value instance.
     */
    public Value get() {
        return this;
    }

    /**
     * Computes the hash code for the current Value instance.
     *
     * @return The hash code of the value.
     */
    @Override
    public int hashCode() {
        return value.hashCode();
    }

    /**
     * Checks if the current Value instance represents a boolean.
     *
     * @return True if the value is a boolean, false otherwise.
     */
    public boolean isBoolean() {
        return value instanceof Boolean;
    }

    /**
     * Checks if the current Value instance represents a File.
     *
     * @return True if the value is a File, false otherwise.
     */
    public boolean isFile() {
        return value instanceof File;
    }

    /**
     * Checks if the current Value instance represents a number.
     *
     * @return True if the value is a number, false otherwise.
     */
    public boolean isNumber() {
        return value instanceof Number;
    }

    /**
     * Checks if the current Value instance represents a List.
     *
     * @return True if the value is a List, false otherwise.
     */
    public boolean isList() {
        return value instanceof List<?>;
    }

    /**
     * Checks if the current Value instance represents null.
     *
     * @return True if the value is null, false otherwise.
     */
    public boolean isNull() {
        return this == NULL;
    }

    /**
     * Checks if the current Value instance represents void.
     *
     * @return True if the value is void, false otherwise.
     */
    public boolean isVoid() {
        return this == VOID;
    }

    /**
     * Checks if the current Value instance represents a string.
     *
     * @return True if the value is a string, false otherwise.
     */
    public boolean isString() {
        return value instanceof String;
    }

    /**
     * Converts the current Value instance to its string representation.
     *
     * @return The string representation of the Value.
     */
    @Override
    public String toString() {
        return isNull() ? "NULL" : isVoid() ? "VOID" : String.valueOf(value);
    }
}
