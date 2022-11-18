package main;

import com.github.tomaslanger.chalk.Chalk;
import org.jetbrains.annotations.NotNull;
import qlang.core.internal.Environment;
import qlang.core.internal.Parser;
import qlang.core.internal.Scope;
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
                if (args.length == 1) {
                    System.out.println(Chalk.on("No QFile provided! Try this, `q --run <file>.q`").bgBlue());
                    System.exit(0);
                } else {
                    fpath = args[1];
                }
            } else if (args[0].equals("--runblind") || args[0].equals("-rb")) {

                if (args.length == 1) {
                    System.out.println(Chalk.on("No QFile provided! Try this, `q --runblind <file>.q`").bgBlue());
                    System.exit(0);
                }

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
                        \t\tThe [interact] screen has more advanced flag options.
                        """);
                System.exit(0);
            } else if (args[0].equals("-i") || args[0].equals("--info")) {
                try {
                    System.out.printf("""
                            Version: %s
                            Build: %s
                            Host: %s
                            QJar Directory: %s
                            Running: %s
                            Size: %s
                            %n""", Environment.global.qversion, Environment.global, System.getProperty("user.dir"), System.getProperty("user.home") + "/.q/", false, (java.nio.file.Files.size(new File(System.getProperty("user.home") + "/.q/" + "Q.jar").toPath()) / 1000000) + "mb");
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
                System.out.printf("""
                        Version: %s
                        Installation status: \u2705\n
                        """, Environment.global.qversion);
                System.exit(0);
            } else if (args[0].equals("--interact") || args[0].equals("-in")) {
                System.out.println("Q build: "
                        + Runfile.class.hashCode()
                        + "\nShell version: "
                        + Environment.global.shver
                        + "\n`h` or `help` for help page, `q` or `quit` to exit the interactive shell\n");
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
                            // ????????
                            // work please
                            int nint = i;
                            nint++;
                            String next;
                            String nextnext;
                            try {
                                next = ary[nint];
                            } catch (Exception e) {
                                next = "";
                            }
                            try {
                                nextnext = ary[nint + 1];
                            } catch (Exception e) {
                                nextnext = "";
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
                                            filetree [-m <file>, --makefile <file>] [-p, --print]: Generate Q compiler file tree.
                                            sinfo [-j, --java] [-q, --q]: System Info
                                            sysloc: System location
                                            github [-p, --public]: Github Repo return value
                                            uscript [-m, --makefile] [-p, --print]: update script permanent
                                            readme [-p, --public]: GH README permalink
                                            cls: Clear console
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
                                    if (next.equals("-j") || next.equals("--java")) {
                                        System.out.println(
                                                "ANTLR Version: 4.10.1" +
                                                        "\nQ build: "
                                                        + Runfile.class.hashCode()
                                                        + "\nJava version: " + System.getProperty("java.version")
                                                        + "\nJRuntime: " + System.getProperty("java.runtime.version") + "\n"
                                                        + "");
                                    } else if (next.equals("-q") || next.equals("--q")) {
                                        System.out.println(
                                                "\nQ Version: " + Environment.global.qversion
                                                        + "\nQ System Location: " + System.getProperty("user.home") + "/.q/"
                                                        + "\nQ Shell version: " + Environment.global.shver
                                                        + "\nInstallation status: perfect :)\n"
                                                        + "");
                                    } else {
                                        System.out.println(
                                                "ANTLR Version: 4.10.1\nQ build version: "
                                                        + Runfile.class.hashCode()
                                                        + "\nQ Version: " + Environment.global.qversion
                                                        + "\nQ System Location: " + System.getProperty("user.home") + "/.q/"
                                                        + "\nQ Shell version: " + Environment.global.shver
                                                        + "\nInstallation status: perfect :)\n"
                                                        + "Java version: " + System.getProperty("java.version")
                                                        + "\nJRuntime: " + System.getProperty("java.runtime.version") + "\n"
                                                        + "");
                                    }
                                }
                                case "filetree" -> {
                                    if (next.equals("-p") || next.equals("--print")) {
                                        System.out.println("""
                                                /qlang::Folder 611.1 kB
                                                ├─ /core::Folder 584.1 kB
                                                │  ├─ /internal::Folder 37.4 kB
                                                │  │  ├─ CompilerFileTree::JavaFile 4.0 kB
                                                │  │  ├─ Environment::JavaFile 2.7 kB
                                                │  │  ├─ NameSpace::JavaFile 381 B
                                                │  │  ├─ Parser::JavaFile 14.9 kB
                                                │  │  ├─ Q::LexFile 7.0 kB
                                                │  │  └─ Scope::JavaFile 2.3 kB
                                                │  ├─ /interp::Folder 412.8 kB
                                                │  │  ├─ Q::InterpreterFile 20.4 kB
                                                │  │  ├─ Q::TokenInputFile 1.2 kB
                                                │  │  ├─ QBaseListener::JavaFile 28.7 kB
                                                │  │  ├─ QBaseVisitor::JavaFile 21.1 kB
                                                │  │  ├─ QLexer::InterpreterFile 21.5 kB
                                                │  │  ├─ QLexer::JavaFile 43.7 kB
                                                │  │  ├─ QLexer::TokenInputFile 1.2 kB
                                                │  │  ├─ QListener::JavaFile 31.3 kB
                                                │  │  ├─ QParser::JavaFile 225.4 kB
                                                │  │  ├─ QVisitor::JavaFile 18.2 kB
                                                │  │  └─ README.md 103 B
                                                │  ├─ /lang::Folder 127.7 kB
                                                │  │  ├─ /Q::Folder 9.2 kB
                                                │  │  │  ├─ QClass::JavaFile 2.7 kB
                                                │  │  │  ├─ QFile::JavaFile 3.2 kB
                                                │  │  │  └─ Value::JavaFile 3.3 kB
                                                │  │  ├─ Function::JavaFile 5.7 kB
                                                │  │  ├─ NativeFunctionLoader::JavaFile 27.8 kB
                                                │  │  ├─ Util::JavaFile 15.7 kB
                                                │  │  └─ Visitor::JavaFile 69.3 kB
                                                ├─ /runtime::Folder 20.8 kB
                                                │  ├─ /errors::Folder 2.0 kB
                                                │  │  ├─ Problem::JavaFile 1.4 kB
                                                │  │  ├─ RVal::JavaFile 160 B
                                                │  │  └─ Tip::JavaFile 416 B
                                                │  └─ /libs::Folder 18.8 kB
                                                │     ├─ /AWT::Folder 1.8 kB
                                                │     │  └─ AWT::JavaFile 1.8 kB
                                                │     ├─ /util::Folder 4.6 kB
                                                │     │  ├─ HTTP::JavaFile 4.3 kB
                                                │     │  └─ QLibrary::JavaFile 291 B
                                                │     ├─ Files::JavaFile 2.2 kB
                                                │     ├─ Math::JavaFile 3.2 kB
                                                │     ├─ OS::JavaFile 1.1 kB
                                                │     ├─ QRandom::JavaFile 793 B
                                                │     ├─ Qio::JavaFile 1.8 kB
                                                │     ├─ Time::JavaFile 1.9 kB
                                                │     └─ WebServer::JavaFile 1.5 kB
                                                """);
                                    } else if (next.equals("-m") || next.equals("--makefile")) {
                                        if (nextnext.equals(null)) {
                                            System.out.println(Chalk.on("Cannot run `filetree -m <file>` without file name.").bgRed());
                                        } else {
                                            File f = new File(nextnext);
                                            try {
                                                if (!f.exists()) {
                                                    f.createNewFile();
                                                }
                                                FileWriter fw = new FileWriter(f);
                                                fw.write("/qlang::Folder 611.1 kB\n" +
                                                        "├─ /core::Folder 584.1 kB\n" +
                                                        "│  ├─ /internal::Folder 37.4 kB\n" +
                                                        "│  │  ├─ CompilerFileTree::JavaFile 4.0 kB\n" +
                                                        "│  │  ├─ Environment::JavaFile 2.7 kB\n" +
                                                        "│  │  ├─ NameSpace::JavaFile 381 B\n" +
                                                        "│  │  ├─ Parser::JavaFile 14.9 kB\n" +
                                                        "│  │  ├─ Q::LexFile 7.0 kB\n" +
                                                        "│  │  └─ Scope::JavaFile 2.3 kB\n" +
                                                        "│  ├─ /interp::Folder 412.8 kB\n" +
                                                        "│  │  ├─ Q::InterpreterFile 20.4 kB\n" +
                                                        "│  │  ├─ Q::TokenInputFile 1.2 kB\n" +
                                                        "│  │  ├─ QBaseListener::JavaFile 28.7 kB\n" +
                                                        "│  │  ├─ QBaseVisitor::JavaFile 21.1 kB\n" +
                                                        "│  │  ├─ QLexer::InterpreterFile 21.5 kB\n" +
                                                        "│  │  ├─ QLexer::JavaFile 43.7 kB\n" +
                                                        "│  │  ├─ QLexer::TokenInputFile 1.2 kB\n" +
                                                        "│  │  ├─ QListener::JavaFile 31.3 kB\n" +
                                                        "│  │  ├─ QParser::JavaFile 225.4 kB\n" +
                                                        "│  │  ├─ QVisitor::JavaFile 18.2 kB\n" +
                                                        "│  │  └─ README.md 103 B\n" +
                                                        "│  ├─ /lang::Folder 127.7 kB\n" +
                                                        "│  │  ├─ /Q::Folder 9.2 kB\n" +
                                                        "│  │  │  ├─ QClass::JavaFile 2.7 kB\n" +
                                                        "│  │  │  ├─ QFile::JavaFile 3.2 kB\n" +
                                                        "│  │  │  └─ Value::JavaFile 3.3 kB\n" +
                                                        "│  │  ├─ Function::JavaFile 5.7 kB\n" +
                                                        "│  │  ├─ NativeFunctionLoader::JavaFile 27.8 kB\n" +
                                                        "│  │  ├─ Util::JavaFile 15.7 kB\n" +
                                                        "│  │  └─ Visitor::JavaFile 69.3 kB\n" +
                                                        "├─ /runtime::Folder 20.8 kB\n" +
                                                        "│  ├─ /errors::Folder 2.0 kB\n" +
                                                        "│  │  ├─ Problem::JavaFile 1.4 kB\n" +
                                                        "│  │  ├─ RVal::JavaFile 160 B\n" +
                                                        "│  │  └─ Tip::JavaFile 416 B\n" +
                                                        "│  └─ /libs::Folder 18.8 kB\n" +
                                                        "│     ├─ /AWT::Folder 1.8 kB\n" +
                                                        "│     │  └─ AWT::JavaFile 1.8 kB\n" +
                                                        "│     ├─ /util::Folder 4.6 kB\n" +
                                                        "│     │  ├─ HTTP::JavaFile 4.3 kB\n" +
                                                        "│     │  └─ QLibrary::JavaFile 291 B\n" +
                                                        "│     ├─ Files::JavaFile 2.2 kB\n" +
                                                        "│     ├─ Math::JavaFile 3.2 kB\n" +
                                                        "│     ├─ OS::JavaFile 1.1 kB\n" +
                                                        "│     ├─ QRandom::JavaFile 793 B\n" +
                                                        "│     ├─ Qio::JavaFile 1.8 kB\n" +
                                                        "│     ├─ Time::JavaFile 1.9 kB\n" +
                                                        "│     └─ WebServer::JavaFile 1.5 kB");
                                                fw.close();
                                            } catch (Exception e) {
                                                throw new Problem(e);
                                            }
                                        }
                                    } else {
                                        System.out.println(Chalk.on("'filetree' Usage:\nfiletree [-p, --print] [-m <file>, --makefile <file>]").bgRed());
                                    }
                                }
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
                                        File newf;

                                        if (!nextnext.equals("")) {
                                            newf = new File(nextnext);
                                        } else {
                                            newf = new File("install.sh");
                                        }

                                        if (!newf.exists()) {
                                            newf.createNewFile();
                                        }

                                        FileWriter fw = new FileWriter(newf);
                                        fw.write(Util.updateScript);
                                        fw.close();
                                        System.out.println(Chalk.on("Successfully written to [" + newf.getName() + "].\nPlease remember you will have to run `chmod a+x " + newf.getName() + "` in order to execute").bgYellow());
                                    } else if (next.equals("-p") || next.equals("--print")) {
                                        System.out.println(Util.updateScript);
                                    } else {
                                        System.out.println(Chalk.on("'uscript' Usage:\nuscript [-p] [--print] [-m someFile] [--makefile someFile]\n").bgRed());
                                    }
                                }
                                case "readme" -> {
                                    if (next.equals("-p") || next.equals("--public")) {
                                        System.out.println(Chalk.on("https://github.com/QRX53/q-public#this-is-the-public-version-of-the-language-so-that-i-dont-have-to-sign-in-on-github-every-time-because-the-personal-access-token-thing-is-stupid-this-wont-be-updated-as-often-only-when-i-need-a-public-copy").bgYellow());
                                    } else {
                                        System.out.println(Chalk.on("https://github.com/QRX53/Q#readme").bgYellow());
                                    }
                                }
                                case "cls" ->
                                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                default -> {
                                    continue;
                                }
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
            System.out.printf("Q version %s: \u2705\n", Environment.global.qversion);
            System.out.println("\n\nTo run a file, execute: `q <file>.q`, or enter `q --help` for assistance.");
            System.exit(0);
        }

        mainFile = new QFile(globalScope, env, fpath, new Parser());
        mainFile.execute();

    }
}
