package qlang.core.internal;

import org.antlr.v4.runtime.ParserRuleContext;
import org.jetbrains.annotations.NotNull;
import qlang.core.lang.Environment;
import qlang.core.lang.Visitor;
import qlang.runtime.STDLibs.AWT.QWinKit;
import qlang.runtime.STDLibs.io.QWebServer;
import qlang.runtime.errors.Problem;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

import static java.nio.file.Files.walk;

/*
    Misc file, full of stuff I may or may not even need anymore
 */

public class Utilities {

    /**
     * The script to install Q, also used to update Q. OUTDATED.
     */
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

    /**
     * This method will execute a terminal command, also non functional.
     *
     * @param cmd The command to execute.
     */
    public static void execute(String cmd) {
        String result = null;
        try (InputStream inputStream = Runtime.getRuntime().exec(cmd).getInputStream();
             Scanner s = new Scanner(inputStream).useDelimiter("\\A")) {
            result = s.hasNext() ? s.next() : null;
        } catch (IOException e) {
            throw new Problem(e);
        }
    }

    /**
     * I honest to god don't know what this does. It returns the visitors scope's parent's parent's parent's scope's value for `sore`.
     * I forgot what the sore field does.
     *
     * @param otherB The other boolean
     * @param v      The visitor to get the sore field from
     * @return Return whether or not the visitor is sore.
     */
    public static boolean getOrDefault(boolean otherB, Visitor v) {
        try {
            return v.scope.parent().parent().parent().sore;
        } catch (Exception e) {
            return otherB;
        }
    }

    /**
     * Get all the files from a folder and then parse all of them. Made so Q can import entire folders at a time.
     *
     * @param folder The folder to go through
     */
    public static void lpFolder(@NotNull File folder) {
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

    /**
     * This method will get text from a link, used for HTTP library.
     *
     * @param link The link to get the text from.
     * @return The retrieved web text.
     */
    public static String getTextFromLink(String link) {
        URL url;
        try {
            url = new URL(link);
        } catch (MalformedURLException e1) {
            throw new Problem(e1.getMessage());
        }
        HttpURLConnection http;
        try {
            http = (HttpURLConnection) url.openConnection();
        } catch (IOException e1) {
            throw new Problem(e1);
        }
        assert http != null;
        Map<String, List<String>> headerMapMap = http.getHeaderFields();

        for (String header : headerMapMap.get(null)) {
            if (header.contains(" 302 ") || header.contains(" 301 ")) {
                link = headerMapMap.get("Location").get(0);
                try {
                    url = new URL(link);
                } catch (MalformedURLException e) {
                    throw new Problem(e);
                }
                try {
                    http = (HttpURLConnection) url.openConnection();
                } catch (IOException e) {
                    throw new Problem(e);
                }
                headerMapMap = http.getHeaderFields();
            }
        }
        InputStream Stream = null;
        try {
            Stream = http.getInputStream();
        } catch (IOException e) {
            throw new Problem(e);
        }
        String Response = null;
        try {
            Response = getStringFromStream(Stream);
        } catch (IOException e) {
            throw new Problem(e);
        }
        return Response;
    }

    /**
     * Method to retrieve a previously created webserver object by it's name.
     *
     * @param name The name of the webserver variable.
     * @return The returned WebServer object.
     */
    public static QWebServer getWebByName(String name) {
        return Environment.global.webs.getOrDefault(name, null);
    }

    /**
     * Register a new library to Q. This means the library has been imported, and Q won't throw an error when trying to use it's methods or classes.
     *
     * @param text      The name of the library
     * @param formatted Whether or not the library has had '.q.' removed from the beginning of the name
     */
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

    /**
     * Get a random String. Not my code, this is from stack overflow
     *
     * @return The randomized string.
     */
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

    /**
     * This method gets a String from an input stream. Useful when retrieving webpages, as it returns a Stream, which is decoded by this method.
     *
     * @param stream The input stream in question.
     * @return The string from the stream.
     * @throws IOException Throws an exception in case the stream is null or invalid.
     */
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

    /**
     * Try and resolve a local import by checking the current directories for the library file.
     *
     * @param lib The import in question.
     */
    public static void resolveImport(String lib) {

        File file = new File(System.getProperty("user.dir") + "/" + lib + ".u");

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

            if (lib.equals("System")) {
                return;
            }

            throw new Problem("Could not parse " + lib + ".u (the file may not exist or be in the wrong format)");
        }

    }

    /**
     * This method attempts to get an AWT window object by it's name from Q's Environment file.
     *
     * @param name The window variable's name, what to look for.
     * @return Returns the QWinKit java object to perform operations on the window.
     */
    public static QWinKit getWinByName(String name) {

        for (QWinKit xc : Environment.global.wins) {
            if (xc.realName.equals(name)) {
                return xc;
            }
        }
        return null;
    }

    /**
     * This method checks if a library has been imported. If it has, then it will continue, if not, it'll try and look for it, and throw an error.
     *
     * @param lib             The library to check import status on.
     * @param libNoChanges    The library name a second time, this one isn't changed by anything, and is only used to print.
     * @param ctx             The current ParserRuleContext, used to throw the error accurately.
     * @param namespaceImport The namespace import of the project, to see if the namespace the library is in is automatically imported (namespaces are non functional.).
     * @param className       The name of the class where the error occured.
     * @param namespace       The namespace of the current file.
     */
    @SuppressWarnings("all")
    public static void check(String lib, String libNoChanges, ParserRuleContext ctx, boolean namespaceImport, String className, String
            namespace) {
        if ((lib.equals(".std") || lib.equals("std")) && namespace.equals("standard")) {
            return;
        }

        if (namespaceImport || Environment.global.allowedLibs.contains(lib)) {
            return;
        } else {
            throw new Problem("Cannot reference '" + libNoChanges + "', as the package has not been imported. The library can be found at: 'q." + libNoChanges + "'", ctx, className);
        }
    }

    /**
     * Very similar to {@see qlang.core.internal.Util#check()} just with different parameters
     *
     * @param lib          The library to check import status on.
     * @param libUnchanged The library name a second time, this one isn't changed by anything, and is only used to print.
     * @param ctx          The current ParserRuleContext, used to throw the error accurately.
     * @param className    The name of the class where the error occured.
     * @param namespace    The namespace of the current file.
     */
    @SuppressWarnings("all")
    public static void check(String lib, String libUnchanged, ParserRuleContext ctx, String className, String namespace) {
        if ((lib.equals(".std") || lib.equals("std")) && namespace.equals("standard")) {
            return;
        }

        if (Environment.global.allowedLibs.contains(lib)) {
            return;
        } else {
            throw new Problem("Cannot reference '" + libUnchanged + "', as the package has not been imported. The library can be found at: 'q." + libUnchanged + "'", ctx, className);
        }
    }

    /**
     * General use method to replace the last instance of a regex expression in a string with something else.
     *
     * @param text        The text to check contents of.
     * @param regex       The regex to look for.
     * @param replacement The replacement text.
     * @return The final product after replacement.
     */
    public static String replaceLast(String text, String regex, String replacement) {
        return text.replaceFirst("(?s)" + regex + "(?!.*?" + regex + ")", replacement);
    }

    /**
     * This method executes a terminal command. I have several of these methods. Like many others, this method is not functional.
     *
     * @param cmd The command to execute
     * @return The return value of the executed command.
     */
    public static String execCmd(String cmd) {
        String result = null;
        try (InputStream inputStream = Runtime.getRuntime().exec(cmd).getInputStream();
             Scanner s = new Scanner(inputStream).useDelimiter("\\A")) {
            result = s.hasNext() ? s.next() : null;
        } catch (IOException e) {
            // e.printStackTrace();
            throw new Problem(e);
        }
        return result;
    }

    /**
     * Copy a directory to another location. I do not believe this is my code.
     *
     * @param sourceDirectoryLocation      The source directory is the directory to copy.
     * @param destinationDirectoryLocation The desired destination to copy the first directory to.
     * @throws IOException Throws an IOException in case the file operation goes badly.
     */
    public static void copyDirectory(String sourceDirectoryLocation, String destinationDirectoryLocation)
            throws IOException {
        walk(Paths.get(sourceDirectoryLocation))
                .forEach(source -> {
                    Path destination = Paths.get(destinationDirectoryLocation, source.toString()
                            .substring(sourceDirectoryLocation.length()));
                    try {
                        Files.copy(source, destination);
                    } catch (IOException e) {
                        throw new Problem(e.getMessage());
                    }
                });
    }

    /**
     * FileUtil class, only used for Q side operations for the most part.
     */
    public static class FileUtil {
        static BufferedReader reader = null;

        /**
         * Constructor with the filepath and such.
         *
         * @param filePath The path of the file to get info about.
         * @throws FileNotFoundException Throws this in case the file doesn't exist
         */
        public FileUtil(String filePath) throws FileNotFoundException {
            File file = new File(filePath);
            FileInputStream fileStream = new FileInputStream(file);
            InputStreamReader input = new InputStreamReader(fileStream);
            reader = new BufferedReader(input);
        }

        /**
         * Get the character count of any given file.
         *
         * @return A long containing the character count.
         * @throws IOException Throws an io exception in case the reader cannot read the lines of the file.
         */
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
