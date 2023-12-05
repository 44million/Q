package main;

import com.github.tomaslanger.chalk.Chalk;
import org.jetbrains.annotations.NotNull;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;
import qlang.core.internal.Environment;
import qlang.core.internal.Log;
import qlang.core.internal.Parser;
import qlang.core.internal.QYaml;
import qlang.core.lang.Util;
import qlang.runtime.errors.Problem;

import java.io.*;
import java.util.*;

import static main.Runfile.*;

/**
 * The CommandLine class contains all of Q's flag recognition, and other CLI tools.
 */
public class CommandLine {

    /**
     * Default constructor.
     */
    public CommandLine() {

    }

    private String printoff(String cmd, String shorthand, String msg, String options, String required) {

        return String.format("""
                Usage: q %s | %s
                
                Options and Additional Flags:
                    %s
                    Options Required: %s
                    
                Purpose:
                    %s
                """, cmd, shorthand, options, required, msg);
    }

    public String minfo(String cmd) {
        if (matches(cmd, "--env", "-e")) {
            System.out.println(printoff("--env", "-e", "Create a virtual environment to execute short Q snippets in the terminal.", "None", "No"));
        } else if (matches(cmd, "--projectinfo", "-pi")) {
            System.out.println(printoff("--projectinfo", "-pi", "Print information about a Q generated project. Reads from the q.yaml file.", "<folder-name> : The name of the folder to get information about.", "All"));
        } else if (matches(cmd, "--releasenotesdetailed", "-rnd")) {
            System.out.println(printoff("--releasenotesdetailed", "-rnd", "Print detailed release notes about the current Q version (" + Environment.global.shver + ")", "None", "No"));
        } else if (matches(cmd, "--releasenotes", "-rn")) {
            System.out.println(printoff("--releasenotes", "-rn", "Get quick palletable notes about the current Q release version (" + Environment.global.shver + ")", "None", "No"));
        } else if (matches(cmd, "--run", "-r")) {
            System.out.println(printoff("--run", "-r", "Q's built in run command to run either Q projects, or loose Q files.", "<file-name> | <folder-name> : The File/Folder to attempt to interpret and run.", "Either"));
        } else if (matches(cmd, "--runblind", "-rb")) {
            System.out.println(printoff("--runblind", "-rb", "Flag to run a loose Q file with no security, or optimization checks.\nDirectly parses the contents of the file given.", "<file-name> : The File to run", "All"));
        } else if (matches(cmd, "--help", "-h")) {
            System.out.println(printoff("--help", "-h", "Prints a collection of useful Q commands to a help menu.", "None", "No"));
        } else if (matches(cmd, "--create", "-c")) {
            System.out.println(printoff("--create",
                    "-c",
                    "Built in command to generate a new Q project.\nGenerates a sample file, a YAML settings file, and a file directory.\nAccepts several different arguments for additional flag (--type), including:\n\tConsole, AWT, single-file, Crate.",
                    "<project-name>, (--sign) | (-s),\n\t(--type) <type> | (-t) <type>,\n\t(--mainfile) <path-to-mainfile> | (-mf) <path-to-mainfile>",
                    "Some: <project-name>"));
        } else if (matches(cmd, "--executable", "-ex")) {
            System.out.println(printoff("--executable", "-ex", "Entirely non-functional. Do Not Use.", "<folder-name>", "All"));
        } else if (matches(cmd, "--info", "-i")) {
            System.out.println(printoff("--info", "-i", "This flag returns several key and important details regarding Q's current installation.", "None", "No"));
        } else if (matches(cmd, "--killall", "-ka")) {
            System.out.println(printoff("--killall", "-ka", "End all running Q processes.", "None", "No"));
        } else if (matches(cmd, "--terminal", "-t")) {
            System.out.println(printoff("--terminal", "-t", "Currently non-functional. Very similar to the `--env` flag.", "None", "No"));
        } else if (matches(cmd, "--version", "-v")) {
            System.out.println(printoff("--version", "-v", "Returns the current Q version. Useful to check installation status.", "None", "No"));
        } else if (matches(cmd, "--interact", "-in")) {
            System.out.println(printoff("--interact", "-in", "Create a new Q interactive shell, useful for Java-side debugging.", "None", "No"));
        } else if (matches(cmd, "--update", "-u")) {
            System.out.println(printoff("--update", "-u", "Currently non-functional, but in theory will run Q's update script.", "None", "No"));
        } else if (matches(cmd, "--moreinfo", "-mi")) {
            System.out.println(printoff("--moreinfo", "-mi", "Print detailed information about each of Q's flags.", "--<flag> | -<shorthand>", "Either"));
        } else {
            System.out.println("'" + cmd + "' is unknown by Q's interpreting system, are you sure q is the right command for that flag?");
        }
        return "";
    }

    /**
     * This method Gets input from the console, and appends it to a StringBuilder.
     *
     * @return      Return the built StringBuilder, likely for use by the Q interpreter for block code.
     */
    @NotNull
    private static StringBuilder getStringBuilder() {
        StringBuilder total = new StringBuilder();
        String input = "";

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (!Objects.equals(input, "\n")) {
            try {
                input = reader.readLine();
                total.append(input);
            } catch (IOException e) {
                //e.printStackTrace();
                throw new Problem(e);
            }
        }
        return total;
    }

    /**
     *
     * @param input         The input string to match against the other two strings.
     * @param lookFor       The main string to look for, ie "--version".
     * @param shorthand     The shorthand of the string to look for, ie "-v".
     * @return boolean      Returns the result of whether the string contains the flag, or shorthand.
     */
    private boolean matches(String input, String lookFor, String shorthand) {
        return lookFor.equals(input) || shorthand.equals(input);
    }

    /**
     * Basic method to return Q's help menu. Useful to keep it here for easy editing later down the road.
     *
     * @return String       Returns the String containing the help menu. Returned instead of printed in case I need it elsewhere.
     */
    public String helpMenu() {
        return ("""
                Usage:
                --FlagName (-shorthand) <Options> | Description of flag.
                                                            
                Flags:
                --env (-e) | Create a virtual environment to run short Q snippets directly in the terminal.
                --create (-c) (--sign, -s) (--type <type> (-t)) | Creates a new Q project.
                --runblind (-rb) <file> | Run the file given with no security checks.
                --run <file> (-r) | Run a file. Same as `q <file>.q`.
                --projectinfo (-pi) <project> | Print information from a project Qyaml file.
                --info (-i) | Returns Q version, host, build, dir, and more.
                --killall (-ka) | Kills Q processes.
                --terminal (-t) | Allows you to enter your code in the terminal directly, rather than a file.
                --help (-h) | Returns this menu.
                --version (-v) | Get the Q version. Good for checking installation status.
                --interact (-in) | interact with the Q CLI.
                --releasenotes (-rn) | Returns the release notes for the current Q version.
                --releasenotesdetailed (-rnd) | Returns the detailed version of the current Q versions release notes
                                                 
                The [interact] screen has more advanced flag options.
                        """);
    }

    /**
     * The exec method runs through all of Q's flags, and matches the input against them.
     * Once a flag is matched, it will execute said flag's properties.
     *
     * @param args      The command line arguments, ie the flags or other info.
     * @param fpath     The filepath to execute from, useful from the main RunFile.
     * @return          Returns the filepath, as it may be altered by a flag before being run by the Q Interpreter.
     */
    public String exec(String[] args, String fpath) {

        String zero = "";

        if (args.length >= 1) {
            zero = args[0];
        }

        if (args.length >= 1) {
            if (args.length == 1 && !args[0].startsWith("-")) {
                if (new File(args[0]).isDirectory()) {
                    File yamlfile = new File(args[0] + "/q.yaml");
                    try {
                        InputStream inputStream = new FileInputStream(yamlfile);
                        Yaml yaml = new Yaml(new Constructor(QYaml.class));

                        QYaml qy = yaml.load(inputStream);
                        fpath = qy.getHomedir();
                    } catch (Exception e) {
                        throw new Problem(e);
                    }
                } else {
                    fpath = args[0];
                }
            } else if (matches(zero, "--env", "-e")) {
                StringBuilder b = new StringBuilder();
                Scanner scanner = new Scanner(System.in);
                while (!Objects.equals(scanner.next(), "--q")) {
                    System.out.println(">> ");
                    b.append(scanner.nextLine()).append("\n");
                }
                scanner.close();
                Parser.execBlock(b.toString());
                System.exit(0);
            } else if (matches(zero, "--projectinfo", "-pi")) {
                if (args.length == 1) {
                    Log.log(Log.Severity.FATAL, "No project provided for `--projectinfo` argument");
                    System.exit(-1);
                }

                File projectFolder = new File(args[1]);
                if (!projectFolder.exists()) {
                    Log.log(Log.Severity.FATAL, "Project folder does not exist: " + projectFolder.getAbsolutePath());
                    System.exit(-1);
                }
                if (!projectFolder.isDirectory()) {
                    Log.log(Log.Severity.FATAL, "Project folder is not a directory: " + projectFolder.getAbsolutePath());
                    System.exit(-1);
                }

                File yamlfile = new File(projectFolder.getPath() + File.separator + "q.yaml");

                if (!yamlfile.exists()) {
                    Log.log(Log.Severity.FATAL, "Project yaml info file does not exist: " + yamlfile.getAbsolutePath());
                    System.exit(-1);
                }

                try {
                    String str = getYamlInfo(yamlfile, projectFolder);

                    System.out.println(Chalk.on(str).bgBlue());
                    System.exit(0);

                } catch (Exception e) {
                    throw new Problem(e);
                }

            } else if (matches(zero, "--releasenotesdetailed", "-rnd")) {

                System.out.println(Environment.global.releaseNotesDetailed);
                System.exit(0);

            } else if (matches(zero, "--releasenotes", "-rn")) {

                System.out.println(Environment.global.releaseNotes);
                System.exit(0);

            } else if (matches(zero, "--run", "-r")) {
                if (args.length == 1) {
                    System.out.println(Chalk.on("No QFile provided! Try this, `q --run <file>.q`").bgBlue());
                    System.exit(0);
                } else {
                    if (new File(args[1]).isDirectory()) {
                        File yamlfile = new File(args[1] + "/q.yaml");
                        try {
                            InputStream inputStream = new FileInputStream(yamlfile);
                            Yaml yaml = new Yaml(new Constructor(QYaml.class));

                            QYaml qy = yaml.load(inputStream);
                            fpath = qy.getHomedir();
                        } catch (Exception e) {
                            throw new Problem(e);
                        }
                    } else {
                        fpath = args[1];
                    }
                }
            } else if (matches(zero, "--runblind", "-rb")) {

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
            } else if (matches(zero, "--help", "-h")) {
                System.out.println(this.helpMenu());
                System.exit(0);
            }  else if (matches(zero, "--moreinfo", "-mi")) {
                for (int i = 1; i < args.length; i++) {
                    minfo(args[i]);
                }
            } else if (matches(zero, "--create", "-c")) {
                if (args.length == 1) {
                    Log.log(Log.Severity.FATAL, "`q --create <projectName>` requires field <projectName>");
                    System.exit(-1);
                }

                String projectName = args[1];
                // maybe add more to do with this later, awt projects and such
                String ptype = "console";
                String author = "Anonymous";
                String ppath = "/main.q";

                if (args.length > 2) {
                    for (int i = 0; i < args.length; i++) {
                        switch (args[i]) {
                            case "--sign", "-s" -> author = System.getProperty("user.name");
                            case "--type", "-t" -> {
                                try {
                                    int ix = i;
                                    ptype = args[ix++];
                                } catch (Exception e) {

                                    StringBuilder errStrSquiggle = new StringBuilder();
                                    long size = Arrays.toString(args).toCharArray().length;

                                    for (long xe = 0; xe < size; xe++) {
                                        errStrSquiggle.append("^");
                                    }

                                    throw new Problem(String.format("""
                                            \n
                                            [FATAL] Invalid value for --type. Valid values are:
                                            console
                                            awt
                                            single-file
                                            crate
                                                                                
                                            See '%s'
                                                 %s Invalid expression for --type.
                                                 Try like this: 'q --create project -t console'
                                            """, Arrays.toString(args), errStrSquiggle.toString()));
                                }
                            }
                            case "--mainfile", "-mf" -> {
                                try {
                                    int ix = i;
                                    ppath = args[ix++];
                                } catch (Exception e) {
                                    System.out.println(Chalk.on("[ERROR] No `mainfile` attribute specified for `q --create <project> --mainfile <FILE>`").bgRed());
                                }
                            }
                        }
                    }
                }

                String yaml =
                        String.format("""
                                ---
                                # This file was automatically created by the q --create flag.
                                # Changing these values may impact the way that Q runs the project
                                # DO NOT change the value names, as this will break q's project system.
                                name: "%s"
                                type: "%s"
                                version: "0.0.1"
                                # If you would like this to be automatically filled, use the `--sign (-s)` flag
                                author: "%s"
                                homedir: "%s"
                                """, projectName, ptype, author, projectName + "/src/main.q");

                File homedir = new File(projectName + "/src");

                if (!homedir.exists()) {
                    homedir.mkdirs();
                }

                File project = new File(projectName + "/src" + ppath);

                if (!project.exists()) {
                    try {
                        project.createNewFile();
                    } catch (IOException e) {
                        throw new Problem(e);
                    }
                }

                File printer = getFile(projectName);

                try {
                    FileWriter writer = getFileWriter(printer, """
                            #import <q.std>;
                                                        
                            pub async fn print(str):
                                std::coutln(str);
                            end
                            """);
                    writer.close();
                } catch (Exception e) {
                    throw new Problem(e);
                }

                try {
                    FileWriter pro = getFileWriter(project, String.format("""
                            #import %s.src.objs.Printer;
                                                        
                            // This file was automatically created by the q --create flag.
                            class Main {
                                                        
                                fn main(args):
                                    print("Hello, World!");
                                end
                                                        
                            }
                            """, projectName.replaceFirst("/", "")));
                    pro.close();
                } catch (IOException e) {
                    throw new Problem(e);
                }

                File yamlfile = new File(projectName + "/" + "q.yaml");

                if (!yamlfile.exists()) {
                    try {
                        yamlfile.createNewFile();
                    } catch (Exception e) {
                        throw new Problem(e);
                    }
                }

                FileWriter fw;
                try {
                    fw = new FileWriter(yamlfile);
                    fw.write(yaml);
                    fw.close();
                } catch (Exception e) {
                    throw new Problem(e);
                }

                System.out.println(Chalk.on("Created project '" + projectName + "' successfully"));
                System.exit(0);

            } else if (matches(zero, "--executable", "-ex")) {

                if (args.length == 1) {
                    Log.log(Log.Severity.FATAL, "`q --executable <executable>` requires field <executable>");
                    System.exit(-1);
                }

                File exe = new File(args[1]);
                if (!exe.exists()) {
                    throw new Problem("Folder '" + args[1] + "' does not exist");
                }

                if (!exe.isDirectory()) {
                    Log.log(Log.Severity.FATAL, "Cannot generate executable from file, only a verified Q project.\nTry `q --create project`");
                    System.exit(-1);
                }

                System.out.println(Chalk.on("Generating executable '" + args[1] + "'"));

                try {
                    Util.copyDirectory(exe.getPath(), System.getProperty("user.home") + "/.q/");
                    File executable = new File(exe.getName() + ".sh");
                    if (!executable.exists()) {
                        executable.createNewFile();
                    }

                    FileWriter fw = getFileWriter(executable, "#!/bin/zsh\n\njava -jar ~/.q/Q.jar --run " + exe.getAbsolutePath() + "/src/main.q");
                    fw.close();
                    executable.setExecutable(true);
                } catch (IOException e) {
                    throw new Problem(e.getMessage());
                }

            } else if (matches(zero, "--info", "-i")) {
                System.out.printf("""
                        Version: %s
                        Build: %s
                        Host: %s
                        QJar Directory: %s
                        Running: %s
                        Size: %s
                        %n""", Environment.global.qversion, Environment.global, System.getProperty("user.dir"), System.getProperty("user.home") + "/.q/", false, "191" + "mb");
                System.exit(0);
            } else if (matches(zero, "--killall", "-ka")) {
                System.exit(-1);
            } else if (matches(zero, "--terminal", "-t")) {
                StringBuilder total = getStringBuilder();
                Parser par = new Parser().fromText(total.toString());
                try {
                    par.parse();
                } catch (IOException e) {
                    //e.printStackTrace();
                    throw new Problem(e);
                }
            } else if (matches(zero, "--version", "-v")) {
                System.out.printf("""
                        Version: %s
                        Installation status: ✅
                                                
                        """, Environment.global.qversion);
                System.exit(0);
            } else if (matches(zero, "--interact", "-in")) {
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

                        String[] ary = new String[1];

                        if (total.contains(" ")) {
                            ary = total.split(" ");
                        } else {
                            ary[0] = total;
                        }

                        for (int i = 0; i < ary.length; i++) {
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
                                            sinfo [-j, --java]? [-q, --q]?: System Info
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
                                                        + "\nJRuntime: " + System.getProperty("java.runtime.version") + "\n");
                                    } else if (next.equals("-q") || next.equals("--q")) {
                                        System.out.println(
                                                "\nQ Version: " + Environment.global.qversion
                                                        + "\nQ System Location: " + System.getProperty("user.home") + "/.q/"
                                                        + "\nQ Shell version: " + Environment.global.shver
                                                        + "\nInstallation status: perfect :)\n");
                                    } else {
                                        System.out.println(
                                                "ANTLR Version: 4.10.1\nQ build version: "
                                                        + Runfile.class.hashCode()
                                                        + "\nQ Version: " + Environment.global.qversion
                                                        + "\nQ System Location: " + System.getProperty("user.home") + "/.q/"
                                                        + "\nQ Shell version: " + Environment.global.shver
                                                        + "\nInstallation status: perfect :)\n"
                                                        + "Java version: " + System.getProperty("java.version")
                                                        + "\nJRuntime: " + System.getProperty("java.runtime.version") + "\n");
                                    }
                                }
                                case "filetree" -> {
                                    if (next.equals("-p") || next.equals("--print")) {
                                        System.out.println("""
                                                <OUTDATED>:
                                                                                                
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
                                        if (nextnext == null) {
                                            System.out.println(Chalk.on("Cannot run `filetree -m <file>` without file name.").bgRed());
                                        } else {
                                            File f = new File(nextnext);
                                            try {
                                                if (!f.exists()) {
                                                    f.createNewFile();
                                                }
                                                FileWriter fw = getFileWriter(f);
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

                                        if (!nextnext.isEmpty()) {
                                            newf = new File(nextnext);
                                        } else {
                                            newf = new File("install.sh");
                                        }

                                        if (!newf.exists()) {
                                            newf.createNewFile();
                                        }

                                        FileWriter fw = getFileWriter(newf, Util.updateScript);
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
                                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                default -> {
                                }
                            }

                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }

            } else if (matches(zero, "--update", "-u")) {
                Log.log(Log.Severity.WARNING, "This flag is not fully completed.");
                System.exit(0);
            } else if (zero.startsWith("-")) {
                System.out.println("Flag not recognized '" + args[0] + "'. Run q --help for more.");
                System.exit(0);
            }
        } else {
            System.out.println(Chalk.on(String.format("Q Release %s: ✅\n", Environment.global.qversion)).bgGreen());
            System.out.println(Chalk.on("\nTo get started run `q --help`.").bgGreen());
            System.exit(0);
        }
        return fpath;
    }

}
