package main;

import com.github.tomaslanger.chalk.Chalk;
import org.jetbrains.annotations.NotNull;
import qlang.core.internal.CompilerFileTree;
import qlang.core.internal.Environment;
import qlang.core.internal.Parser;
import qlang.core.internal.Scope;
import qlang.core.interp.QBaseListener;
import qlang.core.interp.QBaseVisitor;
import qlang.core.interp.QLexer;
import qlang.core.interp.QParser;
import qlang.core.lang.NativeFunctionLoader;
import qlang.core.lang.Q.QFile;
import qlang.core.lang.Util;
import qlang.core.lang.Visitor;
import qlang.runtime.errors.Problem;

import java.io.*;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

/*
    Main file, run this to execute the 'Main.q' file
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
            String fpath = "src/main/QFiles/Main.q";

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
                            --run <file> (-r <file>) | Run a file. Same as `q <file>.q`
                            --info (-i) | Returns Q version, host, build, dir, and more.
                            --killall (-ka) | Kills Q processes.
                            --terminal (-t) | Allows you to enter your code in the terminal directly, rather than a file.
                            --help (-h) | Returns this menu.
                            --version (-v) | Get the Q version. Good for checking installation status.
                            --interact (-in) | interact with the Q CLI
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
                } else if (args[0].equals("--interact") || args[0].equals("-in")) {
                    System.out.println("Interactive entered. 'h' for help, 'q' to quit");
                    while (true) {
                        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                        try {
                            System.out.print("\n>> ");
                            String total = reader.readLine();
                            System.out.println();

                            String ary[] = new String[1];

                            if (total.contains(" ")) {
                                ary = total.split(" ");
                            } else {
                                ary[0] = total;
                            }

                            for (int i = 0; i < ary.length; i++) {
                                int nint = i++;
                                String next;
                                try {
                                    next = ary[nint];
                                } catch (Exception e) {
                                    next = "";
                                }
                                switch (ary[i]) {

                                    case "q", "quit" -> System.exit(0);
                                    case "env" -> System.out.println("Env: " + Environment.global);
                                    case "h" -> {
                                        System.out.println("Q Help Menu:\n");
                                        System.out.println("""
                                                q/quit: quit q interactive
                                                env: Q Environment
                                                diag: Sys Diag
                                                sinfo: System Info
                                                sysloc: System location
                                                github: Github Repo return value
                                                uscript: update script permanent
                                                readme: GH README permalink
                                                """);
                                    }
                                    case "diag" -> {
                                        System.out.println(Environment.global.hasMainExecuted + " < Has Main Executed?");
                                        System.out.println(Environment.global.allLibs + " < All Libraries");
                                        System.out.println(Environment.global.allowedLibs + " < Allowed Libs");
                                        System.out.println(Environment.global.lst + " < Lst");
                                        System.out.println(Environment.global.objs + " < Objs");
                                        System.out.println(Environment.global.natives + " < Natives");
                                        System.out.println(Environment.global.response + " < Resp");
                                        System.out.println(Environment.global.classes + " < Classes");
                                        System.out.println(Environment.global.consts + " < Consts");
                                        System.out.println(Environment.global.files + " < Files");
                                        System.out.println(Environment.global.functions + " < Funcs");
                                        System.out.println(Environment.global.jTextAreaMap + " < JTAMap");
                                        System.out.println(Environment.global.namespaces + " < Namespaces");
                                        System.out.println(Environment.global.nativeJava + " < NativeJava");
                                        System.out.println(Environment.global.nativeNames + " < NativeNames");
                                        System.out.println(Environment.global.parsed + " < Parsed");
                                        System.out.println(Environment.global.scope + " < Global Scope");
                                        System.out.println(Environment.global.visitor + " < Global Visitor");
                                        System.out.println(Environment.global.webs + " < Webs");
                                        System.out.println(Environment.global.wins + " < Wins");
                                        System.out.println(Environment.global + " < Global value");
                                    }
                                    case "sinfo" -> {
                                        System.out.println(QBaseListener.class + " < QBLClass");
                                        System.out.println(QBaseVisitor.class + " < QBVClass");
                                        System.out.println(QLexer.class + " < QLClass");
                                        System.out.println(QParser.class + " < QPClass");
                                    }
                                    case "filetree" ->
                                            System.out.println(new CompilerFileTree().tree(new File("src/main/java/").toPath()).get());
                                    case "sysloc" -> System.out.println(System.getProperty("user.home") + "/.q/");
                                    case "github" -> {
                                        if (next.equals("-p") || next.equals("--public")) {
                                            System.out.println("https://github.com/QRX53/Q-public");
                                        } else {
                                            System.out.println("https://github.com/QRX53/Q");
                                        }
                                    }
                                    case "uscript" -> {
                                        if (next.equals("--makefile") || next.equals("-m")) {
                                            File newf = new File("install.sh");
                                            if (!newf.exists()) {
                                                newf.createNewFile();
                                            }

                                            FileWriter fw = new FileWriter(newf);
                                            fw.write("""
                                                    #!/bin/bash
                                                                                                        
                                                    # define silly colors for figlet
                                                    GREEN='\\033[0;32m'
                                                    NC='\\033[0m'
                                                                                                        
                                                    # set color to green
                                                    echo -e "\\n\\n\\n\\n\\n\\n\\n\\n\\n\\n${GREEN}"
                                                                                                        
                                                    echo -e "Beginning install process. This will take a while, and will require sudo access. Please allow up to 5 minutes"
                                                                                                        
                                                    # leave green coloration.
                                                    echo -e "${NC}"
                                                                                                        
                                                    sleep 35 ;
                                                                                                        
                                                    # install brew, just in case user doesnt have it already
                                                    # shellcheck disable=SC2164
                                                    cd ; /bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)" ;
                                                    # install git, just in case user doesnt have it already
                                                    brew install git ;
                                                    # install mvn, just in case user doesnt have it already
                                                    brew install mvn ;
                                                    # install node, just in case user doesnt have it already
                                                    brew install node ;
                                                    # install npm, just in case user doesnt have it already
                                                    brew install npm ;
                                                    # install java, just in case user doesnt have it already
                                                    brew install java;
                                                    # install figlet, just in case user doesnt have it already
                                                    brew install figlet ;
                                                    # install wipeclean, just in case user doesnt have it already
                                                    npm install wipeclean -g ;
                                                    # clone the repo into a new folder
                                                    git clone http://github.com/qRX53/Q/ QLANGUPDATEFOLDERTEMP;
                                                    # install cloc, just in case user doesnt have it already
                                                    brew install cloc ;\s
                                                    # use the cloc command to verify that it's the correct repo, and then cd into the directory
                                                    cloc QLANGUPDATEFOLDERTEMP ; cd QLANGUPDATEFOLDERTEMP ;
                                                    # assemble the jarfile (with dependencies)
                                                    mvn clean compile assembly:single ;
                                                    # install trash, just in case user doesnt have it already
                                                    brew install trash ;\s
                                                    # move the old Q jarfile into the trash.
                                                    sudo trash ~/.q/Q.jar ;
                                                    # change into the target folder, and then move the new jarfile into the home dir
                                                    cd target ; ls ; mv Q-1.0-jar-with-dependencies.jar ~/ ;
                                                    # cd to the home dir, make the .q folder if there isnt one already
                                                    cd ; ls ; sudo mkdir -p .q ;
                                                    # move the new jarfile into the .q folder, and rename it.
                                                    sudo mv Q-1.0-jar-with-dependencies.jar ~/.q/Q.jar ;
                                                    # cd to the .q fodler
                                                    cd .q ;
                                                    # nonessential
                                                    ls ; cd ;
                                                    # move the cloned repo to the trash
                                                    trash QLANGUPDATEFOLDERTEMP ;
                                                    # neat little cls animation
                                                    wipeclean ;
                                                                                                        
                                                    # add the q cli command to the zshrc file
                                                    echo "alias q='java -jar ~/.q/Q.jar'" > ~/.zshrc
                                                                                                        
                                                    # same for bashrc file, in case user uses bash instead of zsh
                                                    echo "alias q='java -jar ~/.q/Q.jar'" > ~/.bashrc
                                                                                                        
                                                    # set color to green
                                                    echo -e "${GREEN}"
                                                                                                        
                                                    # create ansi 'success' text
                                                    figlet "Success!"
                                                                                                        
                                                    # leave green coloration.
                                                    echo -e "${NC}"
                                                                                                        
                                                    echo -e "Run 'q -v' to verify installation"
                                                    # simple as.
                                                    """);
                                            fw.close();

                                        } else if (next.equals("-p") || next.equals("--print")) {
                                            System.out.println("""
                                                    #!/bin/bash
                                                                                                        
                                                    # define silly colors for figlet
                                                    GREEN='\\033[0;32m'
                                                    NC='\\033[0m'
                                                                                                        
                                                    # set color to green
                                                    echo -e "\\n\\n\\n\\n\\n\\n\\n\\n\\n\\n${GREEN}"
                                                                                                        
                                                    echo -e "Beginning install process. This will take a while, and will require sudo access. Please allow up to 5 minutes"
                                                                                                        
                                                    # leave green coloration.
                                                    echo -e "${NC}"
                                                                                                        
                                                    sleep 35 ;
                                                                                                        
                                                    # install brew, just in case user doesnt have it already
                                                    # shellcheck disable=SC2164
                                                    cd ; /bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)" ;
                                                    # install git, just in case user doesnt have it already
                                                    brew install git ;
                                                    # install mvn, just in case user doesnt have it already
                                                    brew install mvn ;
                                                    # install node, just in case user doesnt have it already
                                                    brew install node ;
                                                    # install npm, just in case user doesnt have it already
                                                    brew install npm ;
                                                    # install java, just in case user doesnt have it already
                                                    brew install java;
                                                    # install figlet, just in case user doesnt have it already
                                                    brew install figlet ;
                                                    # install wipeclean, just in case user doesnt have it already
                                                    npm install wipeclean -g ;
                                                    # clone the repo into a new folder
                                                    git clone http://github.com/qRX53/Q/ QLANGUPDATEFOLDERTEMP;
                                                    # install cloc, just in case user doesnt have it already
                                                    brew install cloc ;\s
                                                    # use the cloc command to verify that it's the correct repo, and then cd into the directory
                                                    cloc QLANGUPDATEFOLDERTEMP ; cd QLANGUPDATEFOLDERTEMP ;
                                                    # assemble the jarfile (with dependencies)
                                                    mvn clean compile assembly:single ;
                                                    # install trash, just in case user doesnt have it already
                                                    brew install trash ;\s
                                                    # move the old Q jarfile into the trash.
                                                    sudo trash ~/.q/Q.jar ;
                                                    # change into the target folder, and then move the new jarfile into the home dir
                                                    cd target ; ls ; mv Q-1.0-jar-with-dependencies.jar ~/ ;
                                                    # cd to the home dir, make the .q folder if there isnt one already
                                                    cd ; ls ; sudo mkdir -p .q ;
                                                    # move the new jarfile into the .q folder, and rename it.
                                                    sudo mv Q-1.0-jar-with-dependencies.jar ~/.q/Q.jar ;
                                                    # cd to the .q fodler
                                                    cd .q ;
                                                    # nonessential
                                                    ls ; cd ;
                                                    # move the cloned repo to the trash
                                                    trash QLANGUPDATEFOLDERTEMP ;
                                                    # neat little cls animation
                                                    wipeclean ;
                                                                                                        
                                                    # add the q cli command to the zshrc file
                                                    echo "alias q='java -jar ~/.q/Q.jar'" > ~/.zshrc
                                                                                                        
                                                    # same for bashrc file, in case user uses bash instead of zsh
                                                    echo "alias q='java -jar ~/.q/Q.jar'" > ~/.bashrc
                                                                                                        
                                                    # set color to green
                                                    echo -e "${GREEN}"
                                                                                                        
                                                    # create ansi 'success' text
                                                    figlet "Success!"
                                                                                                        
                                                    # leave green coloration.
                                                    echo -e "${NC}"
                                                                                                        
                                                    echo -e "Run 'q -v' to verify installation"
                                                    # simple as.
                                                    """);
                                        } else {
                                            System.out.println(Chalk.on("This command requires a flag.\nTry `uscript -p`").bgRed());
                                        }
                                    }
                                    case "readme" -> {
                                        if (next.equals("-p") || next.equals("--public")) {
                                            System.out.println(Chalk.on("https://github.com/QRX53/q-public#this-is-the-public-version-of-the-language-so-that-i-dont-have-to-sign-in-on-github-every-time-because-the-personal-access-token-thing-is-stupid-this-wont-be-updated-as-often-only-when-i-need-a-public-copy").bgYellow());
                                        } else {
                                            System.out.println(Chalk.on("https://github.com/QRX53/Q#readme").bgYellow());
                                        }
                                    }
                                    case "" -> System.out.println();
                                    case "cls" ->
                                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                    default ->
                                            System.out.println(Chalk.on("[ERROR] Unknown input field '" + ary[i] + "'.").bgRed());
                                }

                            }
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }

                } else if (args[0].equals("--update") || args[0].equals("-u")) {
                    int percent = 0;
                    String cmd = "/bin/bash -c \"$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)\" ; brew install git ; brew install mvn ; brew install node ; brew install npm ; npm install wipeclean -g ; git clone http://github.com/qRX53/Q/ ; brew install cloc ; cloc Q ; cd Q ; mvn clean compile assembly:single ; brew install trash ; sudo trash ~/.q/Q.jar ; cd target ; ls ; mv Q-1.0-jar-with-dependencies.jar ~/ ; cd ; ls ; sudo mkdir -p .q ; sudo mv Q-1.0-jar-with-dependencies.jar ~/.q/Q.jar ; cd .q ; ls ; cd ; trash Q ; wipeclean ; echo Success!";

                    String[] cmds = cmd.split(" ; ");

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

                            if (percent == 60) {
                                System.out.println("Updating... 60% complete. Please allow extra time.");
                                continue;
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
                System.out.println("\n\nTo run a file, execute: `q <file>.q`, or enter `q --help` for assistance.");
                System.exit(0);
            }

            mainFile = new QFile(globalScope, env, fpath, new Parser());
            mainFile.execute();
        }
    }
}
