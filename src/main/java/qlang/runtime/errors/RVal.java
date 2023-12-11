package qlang.runtime.errors;

import qlang.core.internal.Value;

/**
 * The RVal class represents a runtime exception specific to Q language.
 * It extends RuntimeException and includes a reference to a Q language Value.
 * This class is intended for internal use, and its details can be ignored by external users.
 */
public class RVal extends RuntimeException {

    /**
     * The Q language Value associated with the exception.
     */
    public Value value;
}
