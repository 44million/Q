package core.lang;

import core.etc.RVal;
import core.etc.Scope;
import core.lang.q.QValue;
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

    public Function(Scope parentScope, List<TerminalNode> params, ParseTree block) {
        this.parentScope = parentScope;
        this.params = params;
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

    public QValue call(List<QValue> args, Map<String, Function> functions) {
        if (args.size() != this.params.size()) {
            throw new RuntimeException("[ERROR] Illegal Function call");
        }
        Scope scopeNext = new Scope(parentScope, true); // create function scope

        for (int i = 0; i < this.params.size(); i++) {
            QValue value = args.get(i);
            scopeNext.functionParam(this.params.get(i).getText(), value);
        }
        Visitor next = new Visitor(scopeNext, functions);

        QValue ret = QValue.VOID;
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

    public void setV(Visitor s) {
        this.v = s;
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

}
