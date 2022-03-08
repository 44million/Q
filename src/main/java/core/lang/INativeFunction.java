package core.lang;

import core.lang.q.QValue;

public interface INativeFunction {

    void exec();

    String name();

    QValue ret();

}
