package qlang.core.lang;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.ParserRuleContext;
import org.jetbrains.annotations.NotNull;
import qlang.core.internal.Environment;
import qlang.core.internal.Parser;
import qlang.runtime.errors.Problem;
import qlang.runtime.libs.AWT.AWT;
import qlang.runtime.libs.WebServer;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.*;

/*
    Misc file, full of stuff I may or may not even need anymore
 */

public class Util {

    public static String updateScript =
            """
                    #!/bin/bash
                                        
                    # define silly colors for figlet
                    GREEN='\\033[0;32m'
                    NC='\\033[0m'
                    ALIASQ='alias q'
                    clear
                    # set color to green
                    echo -e "\\n\\n\\n\\n\\n\\n\\n\\n\\n\\n${GREEN}"
                                        
                    echo "Beginning install process. This will take a while, and will require sudo access. Please allow up to 5 minutes"
                                        
                    # leave green coloration.
                    echo "${NC}"
                                        
                    sleep 7
                                        
                    # install brew, just in case user doesnt have it already
                    # shellcheck disable=SC2164
                    cd
                    /bin/bash -c "$(curl -fsSL -s https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
                    # install git, just in case user doesnt have it already
                    brew install -q git
                    # install mvn, just in case user doesnt have it already
                    brew install mvn -q
                    # install node, just in case user doesnt have it already
                    brew install node -q
                    # install npm, just in case user doesnt have it already
                    brew install npm -q
                    # install java, just in case user doesnt have it already
                    brew install java -q
                    # install figlet, just in case user doesnt have it already
                    brew install figlet -q
                    # clone the repo into a new folder
                    git clone http://github.com/qRX53/Q/ QLANGUPDATEFOLDERTEMP &>/dev/null
                    cd QLANGUPDATEFOLDERTEMP || exit
                    # assemble the jarfile (with dependencies)
                    mvn clean compile assembly:single -q
                    # install trash, just in case user doesnt have it already
                    brew install trash -q
                    # move the old Q jarfile into the trash.
                    sudo trash ~/.q/Q.jar
                    # change into the target folder, and then move the new jarfile into the home dir
                    cd target || exit
                    mv Q-1.0-jar-with-dependencies.jar ~/
                    # cd to the home dir, make the .q folder if there isnt one already
                    cd || exit
                    sudo mkdir -p .q
                    # move the new jarfile into the .q folder, and rename it.
                    sudo mv Q-1.0-jar-with-dependencies.jar ~/.q/Q.jar
                    # move the cloned repo to the trash
                    trash QLANGUPDATEFOLDERTEMP
                    # clear the console
                    clear
                                        
                    if ! sudo grep -q "${ALIASQ}" "$~/.zshrc"; then
                      # shellcheck disable=SC2024
                      sudo echo "alias q='java -jar ~/.q/Q.jar'" >>~/.zshrc
                    fi
                                        
                    if ! sudo grep -q "${ALIASQ}" "$~/.bashrc"; then
                      # shellcheck disable=SC2024
                      sudo echo "alias q='java -jar ~/.q/Q.jar'" >>~/.bashrc
                    fi
                                        
                    clear
                                        
                    # set color to green
                    echo "${GREEN}"
                                        
                    # create ansi 'success' text
                    figlet "Success!"
                                        
                    # leave green coloration.
                    echo "${NC}"
                                        
                    echo "Run 'q -v' to verify installation"
                    # simple as.
                                        
                    """;

    public final static void clearConsole() {
        try {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows")) {
                Runtime.getRuntime().exec("cls");
            } else {
                Runtime.getRuntime().exec("clear");
            }
        } catch (final Exception e) {
            throw new Problem(e);
        }
    }

    public static String execute(String cmd) {
        String result = null;
        try (InputStream inputStream = Runtime.getRuntime().exec(cmd).getInputStream();
             Scanner s = new Scanner(inputStream).useDelimiter("\\A")) {
            result = s.hasNext() ? s.next() : null;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static boolean getOrDefault(boolean otherB, Visitor v) {
        try {
            return v.scope.parent().parent().parent().sore;
        } catch (Exception e) {
            return otherB;
        }
    }

    public static void lpFolder(File folder) {
        for (File fileEntry : Objects.requireNonNull(folder.listFiles())) {
            if (fileEntry.isDirectory()) {
                lpFolder(fileEntry);
            } else {
                try {
                    String content = Files.readString(fileEntry.toPath(), StandardCharsets.US_ASCII);
                    new Parser().fromText(content).parse();
                } catch (IOException e) {
                    throw new Problem(e);
                }
            }
        }
    }

    // enable Q CLI. With this enabled, then all the standard flags and commands will apply.
    public static void eqcli(String @NotNull [] args) {
        int counter = 0;
        for (String cmd : args) {

            switch (cmd) {
                case "--setpath", "-p" -> {
                    File input = new File(args[++counter]);
                    try {

                        if (!new File(input.getAbsolutePath().replaceAll("\\.q", ".comp")).exists()) {
                            try {
                                new File(input.getAbsolutePath().replaceAll("\\.q", ".comp")).createNewFile();
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                        }

                        Parser parser = new Parser(CharStreams.fromFileName(input.getAbsolutePath()));
                        Environment.global.lst.addAll(parser.parse(false));

                    } catch (Exception e) {

                        String err = "[FATAL] " + e.getMessage();
                        if (e.getMessage().startsWith("src\\main\\Q\\") || e.getMessage().startsWith("C:") || e.getMessage().endsWith(".q")) {
                            err += " (File not found)";
                        }

                        System.out.println(err);
                        System.exit(0);
                    }
                }
                case "--help", "-h" -> System.out.println("""
                        Help Menu
                        ---------
                        cmd: [--setpath/-p] Sets the path to the file to execute.
                        cmd: [--help/-h] Sends this help menu
                        cmd: [--fromtext/-t] Executes the given text as if it were a file
                        """);
                case "" -> counter++;
            }
        }
    }

    public static String getTextFromGithub(String link) {
        URL url;
        try {
            url = new URL(link);
        } catch (MalformedURLException e1) {
            throw new Problem(e1.getMessage());
        }
        HttpURLConnection http = null;
        try {
            assert url != null;
            http = (HttpURLConnection) url.openConnection();
        } catch (IOException e1) {
            System.out.println("[FATAL] " + e1.getMessage());
        }
        assert http != null;
        Map<String, List<String>> headerMapMap = http.getHeaderFields();

        for (String header : headerMapMap.get(null)) {
            if (header.contains(" 302 ") || header.contains(" 301 ")) {
                link = headerMapMap.get("Location").get(0);
                try {
                    url = new URL(link);
                } catch (MalformedURLException e) {
                    System.out.println("[FATAL] " + e.getMessage());
                }
                try {
                    http = (HttpURLConnection) url.openConnection();
                } catch (IOException e) {
                    System.out.println("[FATAL] " + e.getMessage());
                }
                headerMapMap = http.getHeaderFields();
            }
        }
        InputStream Stream = null;
        try {
            Stream = http.getInputStream();
        } catch (IOException e) {
            System.out.println("[FATAL] " + e.getMessage());
        }
        String Response = null;
        try {
            Response = getStringFromStream(Stream);
        } catch (IOException e) {
            System.out.println("[FATAL] " + e.getMessage());
        }
        return Response;
    }

    public static WebServer getWebByName(String name) {
        return Environment.global.webs.getOrDefault(name, null);
    }

    public static void register(String text, boolean formatted) {
        if (formatted) {
            if (Environment.global.allowedLibs.contains(text)) {
                return;
            }
            Environment.global.allowedLibs.add(text);

        } else {
            String lib = text.replaceFirst("\\.q\\.", "");
            if (Environment.global.allowedLibs.contains(lib)) {
                return;
            }
            Environment.global.allowedLibs.add(lib);
        }
    }

    // straight from stackoverflow
    public static String string() {
        final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 18) { // length of the random string.
            int index = (int) (rnd.nextFloat() * alphabet.length());
            salt.append(alphabet.charAt(index));
        }
        return salt.toString();

    }

    private static String getStringFromStream(InputStream stream) throws IOException {
        if (stream != null) {
            Writer Writer = new StringWriter();

            char[] buffer = new char[2048];
            try (stream) {
                Reader Reader = new BufferedReader(new InputStreamReader(stream, StandardCharsets.UTF_8));
                int counter;
                while ((counter = Reader.read(buffer)) != -1) {
                    Writer.write(buffer, 0, counter);
                }
            }
            return Writer.toString();
        } else {
            return "No Contents";
        }
    }

    public static void resolveImport(String imp) {

        File file = new File(System.getProperty("user.dir") + "/" + imp + ".u");

        for (File f : Environment.global.parsed) {
            if (f.getPath().equals(file.getPath())) {
                return;
            }
        }

        Environment.global.parsed.add(file);

        Parser parser = new Parser(file);
        try {
            Environment.global.lst.addAll(parser.parse(false));
        } catch (Exception e) {

            if (imp.equals("System")) {
                return;
            }

            throw new Problem("Could not parse " + imp + ".u (the file may not exist or be in the wrong format)");
        }

    }

    public static AWT getWinByName(String name) {

        for (AWT xc : Environment.global.wins) {
            if (xc.realName.equals(name)) {
                return xc;
            }
        }
        return null;
    }

    // suppress warnings because this code is phenomenally bad
    @SuppressWarnings("all")
    public static void check(String p, String t2, ParserRuleContext ctx, boolean namespaceImport, String c, String namespace) {
        if ((p.equals(".std") || p.equals("std")) && namespace.equals("standard")) {
            return;
        }

        if (namespaceImport || Environment.global.allowedLibs.contains(p)) {
            return;
        } else {
            throw new Problem("Cannot reference '" + t2 + "', as the package has not been imported. The library can be found at: 'q." + t2 + "'", ctx, c);
        }
    }

    public static void check(String p, String t2, ParserRuleContext ctx, String c, String namespace) {
        if ((p.equals(".std") || p.equals("std")) && namespace.equals("standard")) {
            return;
        }

        if (Environment.global.allowedLibs.contains(p)) {
            return;
        } else {
            throw new Problem("Cannot reference '" + t2 + "', as the package has not been imported. The library can be found at: 'q." + t2 + "'", ctx, c);
        }
    }

    public static String replaceLast(String text, String regex, String replacement) {
        return text.replaceFirst("(?s)" + regex + "(?!.*?" + regex + ")", replacement);
    }

    public static String execCmd(String cmd) {
        String result = null;
        try (InputStream inputStream = Runtime.getRuntime().exec(cmd).getInputStream();
             Scanner s = new Scanner(inputStream).useDelimiter("\\A")) {
            result = s.hasNext() ? s.next() : null;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static class FileUtil {
        static BufferedReader reader = null;

        public FileUtil(String filePath) throws FileNotFoundException {
            File file = new File(filePath);
            FileInputStream fileStream = new FileInputStream(file);
            InputStreamReader input = new InputStreamReader(fileStream);
            reader = new BufferedReader(input);
        }

        public long getCharCount() throws IOException {
            long charCount = 0;
            String data;
            while ((data = reader.readLine()) != null) {
                charCount += data.length();
            }
            return charCount;
        }
    }

}
