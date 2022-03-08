package core.etc;

import core.lang.*;
import core.lang.q.*;
import core.libs.AWT.QComponent;
import core.libs.AWT.Window;
import core.libs.MediaPlayer;
import core.libs.WebServer;
import org.antlr.v4.runtime.Token;

import java.io.File;
import java.util.*;

@SuppressWarnings("all")
public class Environment {

    public static Environment global = new Environment();

    public Map<String, Function> functions = Collections.emptyMap();
    public Scope scope = new Scope();
    public Visitor visitor = new Visitor(scope, functions);
    public String response = "Standard";
    public List<File> parsed = new ArrayList<>();
    public Map<String, QClass> classes = new HashMap<>();
    public Map<String, QObject> objs = new HashMap<>();
    public List<Token> lst = new ArrayList<>();
    public List<Window> wins = new ArrayList<>();
    public List<QComponent> comps = new ArrayList<>();
    public List<WebServer> webs = new ArrayList<>();
    public HashMap<String, File> files = new HashMap<>();
    public Parser parser = new Parser();
    public List<String> allowedLibs = new ArrayList<>();
    public List<MediaPlayer> players = new ArrayList<>();
    public List<String> allLibs = new ArrayList<>();
    public HashMap<String, Function> consts = new HashMap<>();
    public boolean main = false;
    final Environment before;
    public HashMap<String, Function> fns;
    public HashMap<String, QValue> vars;

    public Environment() {
        this.before = null;
        this.fns = new HashMap<>();
        this.vars = new HashMap<>();
    }

    public void define(String s, QValue e) {
        this.vars.put(s, e);
    }

    public void define(String s, Function f) {
        this.fns.put(s, f);
    }

    public Environment ancestor(int history) {

        Environment environment = this;

        for (int i = 0; i < history; i++) {
            if (environment.before != null) {
                environment = environment.before;
            }
        }

        return environment;
    }

    QValue getAt(int distance, String name) {
        return this.ancestor(distance).vars.get(name);
    }

    void assignAt(int distance, String name, QValue value) {
        this.ancestor(distance).vars.put(name, value);
    }

}
