package core.lang;

import core.etc.RVal;
import core.etc.Scope;
import core.lang.q.Value;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.*;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.function.Consumer;

public class Function {

    public List<TerminalNode> params;
    public boolean async;
    public Visitor v;
    private Scope parentScope;
    private ParseTree block;
    private List<Value> qParams;

    public Function(Scope parentScope, List<TerminalNode> params, ParseTree block) {
        this.parentScope = parentScope;
        this.params = params;
        this.block = block;
    }

    public Function(Scope parentScope, List<Value> params, ParseTree block, String s) {
        this.parentScope = parentScope;
        this.qParams = params;
        this.block = block;
    }

    public Function(String jblock) {
        try {
            execBlock(jblock);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void execBlock(String java) throws Exception {

        // run java code from string
        File f = new File(System.getProperty("user.home") + "/tmp.java");
        FileWriter fw = new FileWriter(f);
        fw.write(java);
        fw.close();

        // run java code from file
        String command = "javac " + f.getAbsolutePath();

        printAndExec(command);

        String c2 = "java -cp " + f.getParent() + " " + f.getName().split("\\.")[0];
        printAndExec(c2);

        // delete file
        f.delete();

    }

    public static void printAndExec(String cmd) throws Exception {

        boolean isWindows = System.getProperty("os.name").toLowerCase().contains("windows");

        Process process;

        if (isWindows) {
            process = Runtime.getRuntime()
                    .exec(cmd);
        } else {
            process = Runtime.getRuntime()
                    .exec(cmd);
        }

        StreamGobbler streamGobbler = new StreamGobbler(process.getInputStream(), System.out::println);
        Executors.newSingleThreadExecutor().submit(streamGobbler);

        int exitCode = process.waitFor();

        assert exitCode == 0;
    }

    public Value call(List<Value> args, Map<String, Function> functions) {

        if (this.params == null) {
            if (args.size() != this.qParams.size()) {
                throw new RuntimeException("[ERROR] Illegal Function call");
            }

            Scope scopeNext = new Scope(parentScope, true);

            for (int i = 0; i < this.qParams.size(); i++) {
                Value value = args.get(i);
                scopeNext.functionParam(this.qParams.get(i).id, value);
            }

            Visitor next = new Visitor(scopeNext, functions);

            Value ret = Value.VOID;
            try {
                next.visit(this.block);
            } catch (RVal returnValue) {
                ret = returnValue.value;
            }
            return ret;

        } else if (args.size() != this.params.size()) {
            throw new RuntimeException("[ERROR] Illegal Function call");
        }

        Scope scopeNext = new Scope(parentScope, true); // create function scope

        for (int i = 0; i < this.params.size(); i++) {
            Value value = args.get(i);
            scopeNext.functionParam(this.params.get(i).getText(), value);
        }

        Visitor next = new Visitor(scopeNext, functions);

        Value ret = Value.VOID;
        try {
            next.visit(this.block);
        } catch (RVal returnValue) {
            ret = returnValue.value;
        }
        return ret;
    }

    public boolean exists() {
        return true;
    }

    public void setAsync(boolean flag) {
        this.async = flag;
    }

    public interface INativeFunction {

        void exec();

        String name();

        Value ret();

        String parent();

        void exec(List<Value> list);

        Value ret(List<Value> list);

        boolean args();

    }

    private static class StreamGobbler implements Runnable {
        private final InputStream inputStream;
        private final Consumer<String> consumer;

        public StreamGobbler(InputStream inputStream, Consumer<String> consumer) {
            this.inputStream = inputStream;
            this.consumer = consumer;
        }

        @Override
        public void run() {
            new BufferedReader(new InputStreamReader(inputStream)).lines()
                    .forEach(consumer);
        }
    }

    public static class FunctionRunner implements Runnable {

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
}
