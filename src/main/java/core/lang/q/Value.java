package core.lang.q;

import java.io.File;
import java.util.List;

@SuppressWarnings("all")
public class Value implements Comparable<Value> {

    public static final Value NULL = new Value();
    public static final Value VOID = new Value();

    private final Object value;
    public boolean constant = false;
    public boolean hasVal;
    public String id;

    private Value() {
        value = new Object();
    }

    public Value(Object v) {
        if (v == null) {
            throw new RuntimeException("[ERROR] v is null.");
        }
        value = v;
        if (!(isBoolean() || isList() || isNumber() || isString() || isFile())) {
            throw new RuntimeException("invalid data type: " + v + " (" + v.getClass() + ")");
        }
    }

    public Boolean asBoolean() {
        return (Boolean) value;
    }

    public Double asDouble() {
        return ((Number) value).doubleValue();
    }

    public File asFile() {
        return ((File) value);
    }

    public Long asLong() {
        return ((Number) value).longValue();
    }

    @SuppressWarnings("unchecked")
    public List<Value> asList() {
        return (List<Value>) value;
    }

    public String asString() {
        return (String) value;
    }

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

    public Value get() {
        return this;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    public boolean isBoolean() {
        return value instanceof Boolean;
    }

    public boolean isFile() {
        return value instanceof File;
    }

    public boolean isNumber() {
        return value instanceof Number;
    }

    public boolean isList() {
        return value instanceof List<?>;
    }

    public boolean isNull() {
        return this == NULL;
    }

    public boolean isVoid() {
        return this == VOID;
    }

    public boolean isString() {
        return value instanceof String;
    }

    @Override
    public String toString() {
        return isNull() ? "NULL" : isVoid() ? "VOID" : String.valueOf(value);
    }
}
