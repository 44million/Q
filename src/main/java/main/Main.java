package main;

import core.etc.Environment;
import core.etc.Parser;
import core.etc.Scope;
import core.lang.Visitor;
import core.lang.q.QFile;
import core.lang.util;
import org.antlr.v4.runtime.CharStreams;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;

public class Main {

    public static String[] args;
    public static QFile MAINFILE;

    public static void main(String @NotNull [] args) {

        File input;
        {
            Environment.global.allLibs.add("puddle");
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

        util.registerNatives();

        if (args.length >= 103945809) {

            util.animate(args);

        } else {

            Scope scope = new Scope(null, false);
            Visitor visitor = new Visitor(scope, new HashMap<>());
            Environment env = new Environment();
            MAINFILE = new QFile(visitor, env, "Main", new Parser());

            input = new File("src/main/QFiles/Main.x");

            try {

                Parser parser = new Parser(CharStreams.fromFileName(input.getAbsolutePath()));
                parser.parse(false);

            } catch (Exception e) {

                Exception exception = e;
                if (exception.getMessage() == null) {
                    exception = new Exception("Unknown error");
                }

                String err = "\n\n[FATAL] " + exception.getMessage();
                if (exception.getMessage().endsWith(".x") || (exception.getMessage().endsWith(".l")) || exception instanceof FileNotFoundException) {
                    err += " (File not found)";
                }

                if (exception instanceof IndexOutOfBoundsException) {
                    err += " (An array starts at index zero)";
                }

                System.err.println(err);
                // e.printStackTrace();

                System.exit(-1);
            }
        }
    }
}
