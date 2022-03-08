package core.lang;

import core.interp.QParser;
import core.lang.q.QValue;

public interface INativeFunction {

    void exec();

    String name();

    QValue ret();

    String parent();

    void exec(QParser.ExprListContext e);

}
