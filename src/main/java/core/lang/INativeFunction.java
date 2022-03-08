package core.lang;

import core.interp.QParser;
import core.lang.q.QValue;

import java.util.List;

public interface INativeFunction {

    void exec();

    String name();

    QValue ret();

    String parent();

    void exec(List<QValue> list);

    QValue ret(List<QValue> list);

}
