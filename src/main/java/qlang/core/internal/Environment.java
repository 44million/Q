package qlang.core.internal;

import org.antlr.v4.runtime.Token;
import qlang.core.lang.Function;
import qlang.core.lang.Q.QClass;
import qlang.core.lang.Visitor;
import qlang.core.lang.util;
import qlang.runtime.errors.Problem;
import qlang.runtime.libs.AWT.AWT;
import qlang.runtime.libs.WebServer;

import java.io.File;
import java.util.*;

public class Environment {

    public static Environment global = new Environment();

    public Map<String, Function> functions = Collections.emptyMap();
    public Scope scope = new Scope();
    public Visitor visitor = new Visitor(scope, functions);
    public String response = util.string();

    public List<File> parsed = new ArrayList<>();
    public List<Token> lst = new ArrayList<>();
    public List<AWT> wins = new ArrayList<>();
    public Map<String, WebServer> webs = new HashMap<>();
    public List<String> allowedLibs = new ArrayList<>();
    public List<String> allLibs = new ArrayList<>();

    public Map<String, QClass> classes = new HashMap<>();
    public Map<String, QClass.QObject> objs = new HashMap<>();
    public Map<String, File> files = new HashMap<>();
    public Map<String, Function.INativeFunction> natives = new HashMap<>();
    public Map<String, Function> consts = new HashMap<>();
    public Map<String, NameSpace> namespaces = new HashMap<>();
    public Map<String, String> nativeJava = new HashMap<>();
    public Map<String, String> nativeNames = new HashMap<>();

    public boolean hasMainExecuted = false;

    public Environment() {
    }

    public boolean getObj(String name) {
        return util.getWebByName(name) != null || util.getWinByName(name) != null || this.files.containsKey(name) || this.objs.containsKey(name);
    }

    public void destroy(String name) {

        if (util.getWebByName(name) != null) {
            this.webs.remove(util.getWebByName(name));
        } else if (util.getWinByName(name) != null) {
            this.wins.remove(util.getWinByName(name));
        } else if (this.files.containsKey(name)) {
            this.files.remove(name);
        } else if (this.objs.containsKey(name)) {
            this.objs.remove(name);
        } else {
            throw new Problem("No such object to destroy: " + name);
        }

    }

    public void defineNativeFunction(Function.INativeFunction e) {
        this.natives.put(e.name(), e);
    }

}
