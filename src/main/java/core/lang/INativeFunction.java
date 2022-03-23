package core.lang;

import core.lang.q.Value;

import java.util.List;

public interface INativeFunction {

    void exec();

    String name();

    Value ret();

    String parent();

    void exec(List<Value> list);

    Value ret(List<Value> list);

}
