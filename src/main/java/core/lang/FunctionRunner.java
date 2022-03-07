package core.lang;

import core.lang.q.QValue;

import java.util.List;
import java.util.Map;

public class FunctionRunner implements Runnable {

    private Map<String, Function> functions;
    private Function function;
    private List<QValue> args;

    public void setFunctions(Map<String, Function> functions) {
        this.functions = functions;
    }

    public void setFunction(Function f) {
        this.function = f;
    }

    public void setArgs(List<QValue> args) {
        this.args = args;
    }

    @Override
    public void run() {
    }

    public QValue start() {
        this.run();
        return this.function.call(this.args, this.functions);
    }

}
