package core.etc;

import core.lang.Function;
import core.lang.INativeFunction;
import core.lang.Visitor;
import core.lang.q.QClass;
import core.lang.q.QObject;
import core.lang.q.QValue;
import core.libs.AWT.QComponent;
import core.libs.AWT.Window;
import core.libs.WebServer;
import org.antlr.v4.runtime.Token;

import java.io.File;
import java.util.*;

public class Environment {

    public static Environment global = new Environment();

    final Environment before;
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
    public HashMap<String, INativeFunction> natives = new HashMap<>();
    public List<String> allowedLibs = new ArrayList<>();
    public List<String> allLibs = new ArrayList<>();
    public HashMap<String, Function> consts = new HashMap<>();
    public boolean hasMainExecuted = false;

    public HashMap<String, Function> fns;
    public HashMap<String, QValue> vars;

    public Environment() {
        this.before = null;
        this.fns = new HashMap<>();
        this.vars = new HashMap<>();
    }

    public void defineNativeFunction(INativeFunction e) {
        this.natives.put(e.name(), e);
    }

}
