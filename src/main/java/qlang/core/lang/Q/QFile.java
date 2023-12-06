package qlang.core.lang.Q;

import org.antlr.v4.runtime.CharStreams;
import org.jetbrains.annotations.NotNull;
import qlang.core.internal.Environment;
import qlang.core.internal.Parser;
import qlang.core.lang.Visitor;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;

/**
 * This class serves as the base file loader for Q, responsible for loading files and creating instances in Runtime.java.
 */
public class QFile {

    /**
     * The visitor associated with the file loader.
     */
    private final Visitor v;

    /**
     * The environment associated with the file loader.
     */
    private final Environment env;

    /**
     * The name of the file to be loaded.
     */
    private final String fileName;

    /**
     * The parser used for file parsing.
     */
    private final Parser p;

    /**
     * Constructs a QFile instance with specified parameters.
     *
     * @param v        The visitor associated with the file loader.
     * @param env      The environment associated with the file loader.
     * @param fileName The name of the file to be loaded.
     * @param p        The parser used for file parsing.
     */
    public QFile(Visitor v, Environment env, String fileName, Parser p) {
        this.v = v;
        this.env = env;
        this.fileName = fileName;
        this.p = p;
    }

    /**
     * Gets the visitor associated with the file loader.
     *
     * @return The visitor instance.
     */
    public Visitor getV() {
        return v;
    }

    /**
     * Gets the environment associated with the file loader.
     *
     * @return The environment instance.
     */
    public Environment getEnv() {
        return env;
    }

    /**
     * Gets the name of the file to be loaded.
     *
     * @return The name of the file.
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Gets the parser used for file parsing.
     *
     * @return The parser instance.
     */
    public Parser getP() {
        return p;
    }

    /**
     * Executes the file loader, loading the specified file and handling exceptions.
     *
     * @return The current instance of QFile.
     */
    public QFile execute() {

        // Preloading standard libraries
        {
            Environment.global.allLibs.add("Console");
            Environment.global.allLibs.add("Time");
            Environment.global.allLibs.add("Random");
            Environment.global.allLibs.add("Math");
            Environment.global.allLibs.add("Files");
            Environment.global.allLibs.add("http");
            Environment.global.allLibs.add("awt");
            Environment.global.allLibs.add("io");
            Environment.global.allLibs.add("Environment");
            Environment.global.allLibs.add("FileUtils");
            Environment.global.allLibs.add("std");
        }

        try {
            // Parsing the file
            Parser parser = new Parser(CharStreams.fromFileName(new File(this.fileName).getAbsolutePath()));
            parser.parse(false);

        } catch (Exception e) {

            // Exception handling and error reporting
            String err = getString(e);

            System.err.println(err);
            if (Environment.global.verbose) {
                StackTraceElement[] s = e.getStackTrace();

                for (StackTraceElement s1 : s) {
                    System.err.println(s1.toString());
                }

            }

            if (err.contains("FATAL")) {
                System.exit(-1);
            } else {
                return this;
            }
        }
        return this;
    }

    @NotNull
    private static String getString(Exception e) {
        Exception exception = e;
        if (exception.getMessage() == null) {
            exception = new Exception("An unknown error occurred, here is the java source problems: " + Arrays.toString(e.getStackTrace()));
        }

        String err = "\n\n[FATAL] " + exception.getMessage();

        if (exception.getMessage().contains("/src/main/QFiles/Main.q")) {
            err = "";
        }

        if (exception.getMessage().endsWith(".q") || (exception.getMessage().endsWith(".u")) || exception instanceof FileNotFoundException) {
            err += " (File not found)";
        }

        if (exception.getMessage().contains("Cannot read field \"sore\"")) {
            err += " (Check to see that all libraries in use have been imported)";
        }

        if (exception instanceof IndexOutOfBoundsException) {
            err += " (An array starts at index zero)";
        }

        if (exception.getMessage().contains("Could not read file")) {
            err = err.replaceFirst("\n", "");
            err = err.replaceFirst("\n", "");
            err += "\n{\n\tDoes it exist, and do you have access to it?\n}";
        }
        return err;
    }
}
