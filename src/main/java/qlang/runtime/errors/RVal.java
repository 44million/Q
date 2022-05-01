package qlang.runtime.errors;

import qlang.core.lang.Q.Value;

public class RVal extends RuntimeException {
    public Value value;
}
