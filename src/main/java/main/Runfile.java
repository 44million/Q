package main;

import org.jetbrains.annotations.NotNull;
import qlang.core.internal.*;
import qlang.core.lang.*;
import qlang.core.lang.Q.*;
import qlang.runtime.errors.Problem;

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
                if (args.length == 1) {
                    fpath = args[0];
                } else if (args[0].equals("--env") || args[0].equals("-e")) {
                    System.out.println(Environment.global);
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
                } else if (args[0].equals("help") || args[0].equals("-h")) {
                    System.out.println("""
                            Flags:
                            --env | Print the environment
                            --runblind <file> | Run the file given with no security checks
                            --run <file> | Run a file. Same as `q Main.x`
                            """);
                } else if (args[0].equals("-v") || args[0].equals("--version")) {
                    System.out.printf("""
                            Version: 1.0
                            Build: %s
                            Host: %s
                            %n""", Environment.global, System.getProperty("user.dir"));
                } else if (args[0].equals("--killall") || args[0].equals("-ka")) {
                    System.out.println("System permission: denied. Run `killall -9 java` to kill all processes.");
                    System.exit(0);
                } else if (args[0].equals("--terminal") || args[0].equals("-t")) {
                    StringBuilder total = new StringBuilder();
                    String input = "";

                    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

                    while (!Objects.equals(input, ";")) {
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
                }
            }

            mainFile = new QFile(globalScope, env, fpath, new Parser());
            mainFile.execute();
        }
    }
}
