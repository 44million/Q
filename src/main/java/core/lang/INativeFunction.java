package core.lang;

import core.lang.q.QValue;

import java.util.List;

public interface INativeFunction {

    void exec();

    String name();

    QValue ret();

    default String parent() {
        return null;
    }

    void exec(List<QValue> list);

    QValue ret(List<QValue> list);

}
