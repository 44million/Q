package main;

import org.jetbrains.annotations.NotNull;
import qlang.core.internal.Environment;
import qlang.core.internal.Parser;
import qlang.core.internal.Scope;
import qlang.core.lang.NativeFunctionLoader;
import qlang.core.lang.Q.QFile;
import qlang.core.lang.Visitor;
import qlang.core.lang.util;

import java.io.File;
import java.util.HashMap;

@SuppressWarnings("all")
public class Main {

    public static String[] args;
    public static QFile mainFile;

    public static void main(String @NotNull [] args) {

        File input;
        {
            Environment.global.allLibs.add("Console");
            Environment.global.allLibs.add("Time");
            Environment.global.allLibs.add("Random");
            Environment.global.allLibs.add("Math");
            Environment.global.allLibs.add("Files");
            Environment.global.allLibs.add("http");
            Environment.global.allLibs.add("awt");
            Environment.global.allLibs.add("Audio");
            Environment.global.allLibs.add("io");
            Environment.global.allLibs.add("Environment");
            Environment.global.allLibs.add("FileUtils");
            Environment.global.allLibs.add("std");
        }

        Main.args = args;

        NativeFunctionLoader nfl = new NativeFunctionLoader();

        nfl.registerNatives();

        if (args.length >= 103945809) {

            util.animate(args);

        } else {

            Scope scope = new Scope(null, false);
            Visitor visitor = new Visitor(scope, new HashMap<>());
            Environment env = new Environment();
            mainFile = new QFile(visitor, env, "src/main/QFiles/Main.x", new Parser());

            mainFile.execute();


        }
    }
}
