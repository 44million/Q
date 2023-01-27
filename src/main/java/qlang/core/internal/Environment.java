package qlang.core.internal;

import org.antlr.v4.runtime.Token;
import qlang.core.lang.Function;
import qlang.core.lang.Q.QClass;
import qlang.core.lang.Q.QModule;
import qlang.core.lang.Util;
import qlang.core.lang.Visitor;
import qlang.runtime.errors.Problem;
import qlang.runtime.libs.AWT.AWT;
import qlang.runtime.libs.WebServer;

import javax.swing.*;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
    The environment that Q is currently running in, this contains everything important.
 */

public class Environment {

    // static and available to use to anyone
    public static Environment global = new Environment();
    public static String[] args;

    // General language things
    public Map<String, Function> functions = new HashMap<String, Function>();
    public Map<String, Function> globalFns = new HashMap<>();
    public Scope scope = new Scope();
    public Visitor visitor = new Visitor(scope, functions);
    public String response = Util.string();
    public boolean verbose = false;
    public double shver = 1.0;
    public String qversion = "2.1.7";
    public Parser parser = new Parser();

    // Lists<>
    public List<File> parsed = new ArrayList<>();
    public List<Token> lst = new ArrayList<>();
    public List<AWT> wins = new ArrayList<>();
    public Map<String, WebServer> webs = new HashMap<>();
    public List<String> allowedLibs = new ArrayList<>();
    public List<String> allLibs = new ArrayList<>();

    // Maps<>
    public Map<String, QClass> classes = new HashMap<>();
    public Map<String, QModule> modules = new HashMap<>();
    public Map<String, QClass.QObject> objs = new HashMap<>();
    public Map<String, File> files = new HashMap<>();
    public Map<String, Object> modValues = new HashMap<>();
    public Map<String, Function.INativeFunction> natives = new HashMap<>();
    public Map<String, Function> consts = new HashMap<>();
    public Map<String, NameSpace> namespaces = new HashMap<>();
    public Map<String, String> nativeJava = new HashMap<>();
    public Map<String, String> nativeNames = new HashMap<>();
    public Map<String, JTextArea> jTextAreaMap = new HashMap<>();

    public boolean hasMainExecuted = false;

    public Environment() {
    }

    public boolean getObj(String name) {
        return Util.getWebByName(name) != null || Util.getWinByName(name) != null || this.files.containsKey(name) || this.objs.containsKey(name);
    }

    public void destroy(String name) {

        if (Util.getWebByName(name) != null) {
            this.webs.remove(Util.getWebByName(name));
        } else if (Util.getWinByName(name) != null) {
            this.wins.remove(Util.getWinByName(name));
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
