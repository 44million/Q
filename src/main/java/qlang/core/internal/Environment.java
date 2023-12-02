package qlang.core.internal;

import org.antlr.v4.runtime.Token;
import qlang.core.lang.Function;
import qlang.core.lang.Q.QClass;
import qlang.core.lang.Q.QModule;
import qlang.core.lang.Util;
import qlang.core.lang.Visitor;
import qlang.runtime.errors.Problem;
import qlang.runtime.libs.AWT.QWinKit;
import qlang.runtime.libs.QWebServer;

import javax.swing.*;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The environment that Q is currently running in, containing essential elements.
 */
public class Environment {

    // Static and available to use by anyone
    public static Environment global = new Environment();
    public static String[] args;

    // General language elements
    public Map<String, Function> functions = new HashMap<>();
    public Map<String, Function> globalFns = new HashMap<>();
    public Scope scope = new Scope();
    public Visitor visitor = new Visitor(scope, functions);
    public String response = Util.string();
    public boolean verbose = false;
    public String shver = "1.2.5";
    public String qversion = "2.4.2";
    public String releaseNotes = "Q Version: " + this.qversion + "\n\nShell Build: "
            + this.shver + "\n\nRelease Notes: Q version (" + this.qversion + ") fixes several issues with Q project creation, as well as adding more options to the Q help menu.";
    public String releaseNotesDetailed = this.releaseNotes + "\n\nDetailed Release Notes: Q version (" + this.qversion + ") added `-rn` and `-rnd` to the Q CLI. Changed Shell Build, and QCLI versions in the Env file; as well as updating the basic `q` command to be more helpful to new users.";
    public Parser parser = new Parser();

    // Lists<>
    public List<File> parsed = new ArrayList<>();
    public List<Token> lst = new ArrayList<>();
    public List<QWinKit> wins = new ArrayList<>();
    public Map<String, QWebServer> webs = new HashMap<>();
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

    /**
     * Default constructor for the Environment class.
     */
    public Environment() {
    }

    /**
     * Check if the given name corresponds to an object in the environment.
     *
     * @param name The name to check.
     * @return True if the object with the given name exists, false otherwise.
     */
    public boolean getObj(String name) {
        return Util.getWebByName(name) != null || Util.getWinByName(name) != null || this.files.containsKey(name) || this.objs.containsKey(name);
    }

    /**
     * Destroy an object with the given name.
     *
     * @param name The name of the object to destroy.
     */
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

    /**
     * Define a native function in the environment.
     *
     * @param e The native function to define.
     */
    public void defineNativeFunction(Function.INativeFunction e) {
        this.natives.put(e.name(), e);
    }
}
