package qlang.core.lang.Q;

import org.antlr.v4.runtime.CharStreams;
import qlang.core.internal.Environment;
import qlang.core.internal.Parser;
import qlang.core.lang.Visitor;

import java.io.File;
import java.io.FileNotFoundException;

@SuppressWarnings("all")
public class QFile {

    private final Visitor v;
    private final Environment env;
    private final String fileName;
    private final Parser p;

    public QFile(Visitor v, Environment env, String fileName, Parser p) {
        this.v = v;
        this.env = env;
        this.fileName = fileName;
        this.p = p;
    }

    public Visitor getV() {
        return v;
    }

    public Environment getEnv() {
        return env;
    }

    public String getFileName() {
        return fileName;
    }

    public Parser getP() {
        return p;
    }

    public QFile execute() {
        try {

            Parser parser = new Parser(CharStreams.fromFileName(new File(this.fileName).getAbsolutePath()));
            parser.parse(false);

        } catch (Exception e) {

            Exception exception = e;
            if (exception.getMessage() == null) {
                exception = new Exception("Git gud scrub");
            }

            String err = "\n\n[FATAL] " + exception.getMessage();
            if (exception.getMessage().endsWith(".x") || (exception.getMessage().endsWith(".l")) || exception instanceof FileNotFoundException) {
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

            System.err.println(err);
            // e.printStackTrace();

            System.exit(-1);
        }
        return this;
    }
}
