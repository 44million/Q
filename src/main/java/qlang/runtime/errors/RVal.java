package qlang.runtime.errors;

import qlang.core.lang.q.Value;

public class RVal extends RuntimeException {
    public Value value;
}
