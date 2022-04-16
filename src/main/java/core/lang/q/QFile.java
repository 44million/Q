package core.lang.q;

import core.etc.Environment;
import core.etc.Parser;
import core.lang.Visitor;

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
}
