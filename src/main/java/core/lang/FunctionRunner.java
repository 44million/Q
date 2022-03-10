package core.lang;

import core.lang.q.Value;

import java.util.List;
import java.util.Map;

public class FunctionRunner implements Runnable {

    private Map<String, Function> functions;
    private Function function;
    private List<Value> args;

    public void setFunctions(Map<String, Function> functions) {
        this.functions = functions;
    }

    public void setFunction(Function f) {
        this.function = f;
    }

    public void setArgs(List<Value> args) {
        this.args = args;
    }

    @Override
    public void run() {
    }

    public Value start() {
        this.run();
        return this.function.call(this.args, this.functions);
    }

}
