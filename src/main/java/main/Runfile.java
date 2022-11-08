package main;

import org.jetbrains.annotations.NotNull;
import qlang.core.internal.*;
import qlang.core.lang.*;
import qlang.core.lang.Q.*;
import qlang.runtime.errors.Problem;
import qlang.runtime.libs.Files;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Objects;

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

            if (args.length >= 1) {
                if (args.length == 1 && !args[0].startsWith("-")) {
                    fpath = args[0];
                } else if (args[0].equals("--env") || args[0].equals("-e")) {
                    System.out.println(Environment.global);
                    System.exit(0);
                } else if (args[0].equals("--run") || args[0].equals("-r")) {
                    fpath = args[1];
                } else if (args[0].equals("--runblind") || args[0].equals("-rb")) {
                    Parser p = new Parser();
                    p.setFile(new File(args[1]));
                    try {
                        p.parse();
                    } catch (IOException e) {
                        throw new Problem(e);
                    }
                    System.exit(0);
                } else if (args[0].equals("--help") || args[0].equals("-h")) {
                    System.out.println("""
                            Flags:
                            --env (-e) | Print the environment
                            --runblind <file> (-rb <file>) | Run the file given with no security checks
                            --run <file> (-r <file>) | Run a file. Same as `q Main.x`
                            --info (-i) | Returns Q version, host, build, dir, and more.
                            --killall (-ka) | Kills Q processes.
                            --terminal (-t) | Allows you to enter your code in the terminal directly, rather than a file.
                            --help (-h) | Returns this menu.
                            --version (-v) | Get the Q version. Good for checking installation status.
                            """);
                    System.exit(0);
                } else if (args[0].equals("-i") || args[0].equals("--info")) {
                    try {
                        System.out.printf("""
                                Version: 1.0
                                Build: %s
                                Host: %s
                                QJar Directory: %s
                                Running: %s
                                Size: %s
                                %n""", Environment.global, System.getProperty("user.dir"), System.getProperty("user.home") + "/.q/", false, (java.nio.file.Files.size(new File(System.getProperty("user.home") + "/.q/" + "Q.jar").toPath()) / 1000000) + "mb");
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    System.exit(0);
                } else if (args[0].equals("--killall") || args[0].equals("-ka")) {
                    System.out.println("System permission: denied. Run `killall -9 java` to kill all processes.");
                    System.exit(0);
                } else if (args[0].equals("--terminal") || args[0].equals("-t")) {
                    StringBuilder total = new StringBuilder();
                    String input = "";

                    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

                    while (!Objects.equals(input, "\n")) {
                        try {
                            input = reader.readLine();
                            total.append(input);
                        } catch (IOException e) {
                            throw new Problem(e);
                        }
                    }
                    Parser par = new Parser().fromText(total.toString());
                    try {
                        par.parse();
                    } catch (IOException e) {
                        throw new Problem(e);
                    }
                } else if (args[0].equals("-v") || args[0].equals("--version")) {
                    System.out.println("""
                            Version: 1.0
                            Installation status: \u2705
                            """);
                    System.exit(0);
                }
            } else {
                System.out.println("Q version 1.0: \u2705");
                System.out.println("\n\nTo run a file, execute: `q <file>.x`, or enter `q --help` for assistance.");
                System.exit(0);
            }

            mainFile = new QFile(globalScope, env, fpath, new Parser());
            mainFile.execute();
        }
    }
}
