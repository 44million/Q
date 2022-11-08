package main;

import com.google.common.collect.Lists;
import org.jetbrains.annotations.NotNull;
import qlang.core.internal.*;
import qlang.core.lang.*;
import qlang.core.lang.Q.*;
import qlang.runtime.errors.Problem;
import qlang.runtime.libs.Files;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

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
                            e.printStackTrace();
                        }
                    }
                    Parser par = new Parser().fromText(total.toString());
                    try {
                        par.parse();
                    } catch (IOException e) {
                        e.printStackTrace();
                        //throw new Problem(e);
                    }
                } else if (args[0].equals("-v") || args[0].equals("--version")) {
                    System.out.println("""
                            Version: 1.0
                            Installation status: \u2705
                            """);
                    System.exit(0);
                } else if (args[0].equals("--update") || args[0].equals("-u")) {
                    int percent = 0;
                    String cmd = "/bin/bash -c \"$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)\" ; brew install git ; brew install mvn ; brew install node ; brew install npm ; npm install wipeclean -g ; git clone http://github.com/qRX53/Q/ ; brew install cloc ; cloc Q ; cd Q ; mvn clean compile assembly:single ; brew install trash ; sudo trash ~/.q/Q.jar ; cd target ; ls ; mv Q-1.0-jar-with-dependencies.jar ~/ ; cd ; ls ; sudo mkdir -p .q ; sudo mv Q-1.0-jar-with-dependencies.jar ~/.q/Q.jar ; cd .q ; ls ; cd ; trash Q ; wipeclean ; echo Success!";

                    String cmds[] = cmd.split(" ; ");
                    for (String x : cmds) {
                        try {

                            String result;
                            Process p = Runtime.getRuntime().exec(x);
                            InputStream inputStream = p.getInputStream();
                            Scanner s = new Scanner(inputStream).useDelimiter("\\A");
                            result = s.hasNext() ? s.next() : null;
                            p.waitFor();
                            System.out.println(result);
                            if (!(percent >= 100)) {
                                percent += 5;
                            }
                            System.out.println("Updating... " + percent + "% done.");
                        } catch (Exception e) {
                            throw new Problem(e);
                        }
                    }

                    Util.execute(cmd);
                    System.exit(0);

                } else if (args[0].startsWith("-")) {
                    System.out.println("Flag not recognized '" + args[0] + "'. Run q --help for more.");
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
