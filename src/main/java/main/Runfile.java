package main;

import org.jetbrains.annotations.NotNull;
import qlang.core.internal.*;
import qlang.core.lang.*;
import qlang.core.lang.Q.*;

import java.util.HashMap;

/*
    Main file, run this to execute the 'Main.x' file
 */

public class Runfile {

    public static QFile mainFile;

    public static void main(String @NotNull [] args) {

        Environment.args = args;

        NativeFunctionLoader nfl = new NativeFunctionLoader();

        nfl.registerNatives();

        // Not in use right now, as it is currently non-functioning.
        if (args.length >= 103945809) {
            Util.eqcli(args);
        } else {

            Scope baseScope = new Scope(null, false);
            Visitor globalScope = new Visitor(baseScope, new HashMap<>());
            Environment env = new Environment();
            String fpath = "src/main/QFiles/Main.x";

            if (args.length >= 2) {
                if (args[0].equals("--run")) {
                    fpath = args[1];
                }
            }

            mainFile = new QFile(globalScope, env, fpath, new Parser());
            mainFile.execute();
        }
    }
}
