package qlang.core.lang;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import qlang.core.internal.Scope;
import qlang.core.lang.Q.Value;
import qlang.runtime.errors.RVal;

import java.io.*;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.function.Consumer;

/**
 * This class represents a QLang function, used to create functions in Q.
 */
public class Function implements Cloneable {

    /**
     * The list of parameters for the function.
     */
    public List<TerminalNode> params;

    /**
     * Flag indicating whether the function is asynchronous.
     */
    public boolean async;

    /**
     * The visitor associated with the function.
     */
    public Visitor v;

    /**
     * The parent scope of the function.
     */
    private Scope parentScope;

    /**
     * The block of code associated with the function.
     */
    private ParseTree block;

    /**
     * List of QLang parameters for the function.
     */
    private List<Value> qParams;

    /**
     * Constructs a Function instance with a specified parent scope, parameters, and block.
     *
     * @param parentScope The parent scope of the function.
     * @param params      The list of parameters for the function.
     * @param block       The block of code associated with the function.
     */
    public Function(Scope parentScope, List<TerminalNode> params, ParseTree block) {
        this.parentScope = parentScope;
        this.params = params;
        this.block = block;
    }

    /**
     * Constructs a Function instance with a specified parent scope, QLang parameters, and block.
     *
     * @param parentScope The parent scope of the function.
     * @param params      List of QLang parameters for the function.
     * @param block       The block of code associated with the function.
     * @param s           Unused parameter (not used in the constructor).
     */
    public Function(Scope parentScope, List<Value> params, ParseTree block, String s) {
        this.parentScope = parentScope;
        this.qParams = params;
        this.block = block;
    }

    /**
     * Constructs a Function instance with a specified Java block.
     *
     * @param jblock The Java block code.
     */
    public Function(String jblock) {
        try {
            execBlock(jblock);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Executes the provided Java code block.
     *
     * @param java The Java code block.
     * @throws Exception If an error occurs during execution.
     */
    public static void execBlock(String java) throws Exception {

        // Run Java code from string
        File f = new File(System.getProperty("user.home") + "/tmp.java");
        FileWriter fw = new FileWriter(f);
        fw.write(java);
        fw.close();

        // Run Java code from file
        String command = "javac " + f.getAbsolutePath();

        printAndExec(command);

        String c2 = "java -cp " + f.getParent() + " " + f.getName().split("\\.")[0];
        printAndExec(c2);

        // Delete file
        f.delete();

    }

    /**
     * Prints and executes the provided command.
     *
     * @param cmd The command to execute.
     * @throws Exception If an error occurs during execution.
     */
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

    /**
     * Calls the function with the provided arguments.
     *
     * @param args      The arguments for the function call.
     * @param functions Map of available functions.
     * @return The result of the function call.
     */
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

    /**
     * Checks if the function exists.
     *
     * @return Always returns true.
     */
    public boolean exists() {
        return true;
    }

    /**
     * Sets the asynchronous flag for the function.
     *
     * @param flag The value to set for the asynchronous flag.
     */
    public void setAsync(boolean flag) {
        this.async = flag;
    }

    /**
     * Clones the Function instance.
     *
     * @return A cloned instance of the Function.
     */
    @Override
    public Function clone() {
        try {
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return (Function) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    /**
     * Interface for native functions.
     */
    public interface INativeFunction {

        /**
         * Executes the native function.
         */
        void exec();

        /**
         * Gets the name of the native function.
         *
         * @return The name of the function.
         */
        String name();

        /**
         * Gets the return value of the native function.
         *
         * @return The return value.
         */
        Value ret();

        /**
         * Gets the parent of the native function.
         *
         * @return The parent of the function.
         */
        String parent();

        /**
         * Executes the native function with a list of values.
         *
         * @param list The list of values.
         */
        void exec(List<Value> list);

        /**
         * Gets the return value of the native function with a list of values.
         *
         * @param list The list of values.
         * @return The return value.
         */
        Value ret(List<Value> list);

        /**
         * Checks if the native function has arguments.
         *
         * @return True if the function has arguments, false otherwise.
         */
        boolean args();

    }

    /**
     * Class for capturing and printing output from a stream.
     */
    private static class StreamGobbler implements Runnable {
        private final InputStream inputStream;
        private final Consumer<String> consumer;

        /**
         * Constructs a StreamGobbler instance with an InputStream and a consumer.
         *
         * @param inputStream The InputStream to capture output from.
         * @param consumer    The consumer to process the captured output.
         */
        public StreamGobbler(InputStream inputStream, Consumer<String> consumer) {
            this.inputStream = inputStream;
            this.consumer = consumer;
        }

        /**
         * Runs the stream gobbler, capturing and processing output.
         */
        @Override
        public void run() {
            new BufferedReader(new InputStreamReader(inputStream)).lines()
                    .forEach(consumer);
        }
    }

    /**
     * Class for running a function in a separate thread.
     */
    public static class FunctionRunner implements Runnable {

        private Map<String, Function> functions;
        private Function function;
        private List<Value> args;

        /**
         * Sets the map of functions for the runner.
         *
         * @param functions The map of functions.
         */
        public void setFunctions(Map<String, Function> functions) {
            this.functions = functions;
        }

        /**
         * Sets the function for the runner.
         *
         * @param f The function to run.
         */
        public void setFunction(Function f) {
            this.function = f;
        }

        /**
         * Sets the arguments for the function.
         *
         * @param args The arguments for the function.
         */
        public void setArgs(List<Value> args) {
            this.args = args;
        }

        /**
         * Runs the function in a separate thread.
         */
        @Override
        public void run() {
            // Empty run method, no specific implementation provided.
        }

        /**
         * Starts the function and returns the result.
         *
         * @return The result of the function.
         */
        public Value start() {
            this.run();
            return this.function.call(this.args, this.functions);
        }

    }
}