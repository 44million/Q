package core.lang;

import core.etc.Environment;
import core.etc.Parser;
import core.lang.q.QValue;
import core.libs.AWT.QComponent;
import core.libs.AWT.Window;
import core.libs.GTP;
import core.libs.IO;
import core.libs.Listener;
import core.libs.WebServer;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class util {

    public static void get(String[] args, File input) {
        int counter = 0;
        for (String cmd : args) {

            switch (cmd) {
                case "--setpath", "-p" -> {
                    input = new File(args[++counter]);
                    try {

                        if (!new File(input.getAbsolutePath().replaceAll("\\.x", ".comp")).exists()) {
                            try {
                                new File(input.getAbsolutePath().replaceAll("\\.x", ".comp")).createNewFile();
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                        }

                        Parser parser = new Parser(CharStreams.fromFileName(input.getAbsolutePath()));
                        Environment.global.lst.addAll(parser.parse(false));

                        util.write(input.getAbsolutePath(), new File(input.getAbsolutePath().replaceAll("\\.x", ".comp")));

                    } catch (Exception e) {

                        String err = "[FATAL] " + e.getMessage();
                        if (e.getMessage().startsWith("src\\main\\Q\\") || e.getMessage().startsWith("C:") || e.getMessage().endsWith(".x")) {
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
        URL Url = null;
        try {
            Url = new URL(link);
        } catch (MalformedURLException e1) {
            System.out.println("[FATAL] " + e1.getMessage());
        }
        HttpURLConnection Http = null;
        try {
            assert Url != null;
            Http = (HttpURLConnection) Url.openConnection();
        } catch (IOException e1) {
            System.out.println("[FATAL] " + e1.getMessage());
        }
        assert Http != null;
        Map<String, List<String>> Header = Http.getHeaderFields();

        for (String header : Header.get(null)) {
            if (header.contains(" 302 ") || header.contains(" 301 ")) {
                link = Header.get("Location").get(0);
                try {
                    Url = new URL(link);
                } catch (MalformedURLException e) {
                    System.out.println("[FATAL] " + e.getMessage());
                }
                try {
                    Http = (HttpURLConnection) Url.openConnection();
                } catch (IOException e) {
                    System.out.println("[FATAL] " + e.getMessage());
                }
                Header = Http.getHeaderFields();
            }
        }
        InputStream Stream = null;
        try {
            Stream = Http.getInputStream();
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

        for (WebServer w : Environment.global.webs) {
            if (w.id.equals(name)) {
                return w;
            }
        }
        return null;
    }

    public static QValue parse(String text) {
        if (text.equals(".q.Windows")) {

            if (Environment.global.allowedLibs.contains("windows")) {
                return QValue.VOID;
            }

            Environment.global.allowedLibs.add("windows");
            return QValue.VOID;
        } else if (text.equals(".q.http")) {

            if (Environment.global.allowedLibs.contains("http")) {
                return QValue.VOID;
            }

            Environment.global.allowedLibs.add("http");
            return QValue.VOID;
        } else if (text.equals(".q.Files")) {

            if (Environment.global.allowedLibs.contains("files")) {
                return QValue.VOID;
            }

            Environment.global.allowedLibs.add("files");
            return QValue.VOID;
        } else if (text.equals(".q.Math")) {

            if (Environment.global.allowedLibs.contains("math")) {
                return QValue.VOID;
            }

            Environment.global.allowedLibs.add("math");
            new core.libs.Math().init();
            return QValue.VOID;
        } else if (text.equals(".q.Audio")) {

            if (Environment.global.allowedLibs.contains("audio")) {
                return QValue.VOID;
            }

            Environment.global.allowedLibs.add("audio");
            return QValue.VOID;
        } else if (text.equals(".q.Random")) {

            if (Environment.global.allowedLibs.contains("random")) {
                return QValue.VOID;
            }

            Environment.global.allowedLibs.add("random");
            new core.libs.QRandom().init();
            return QValue.VOID;
        } else if (text.equals(".q.Time")) {

            if (Environment.global.allowedLibs.contains("time")) {
                return QValue.VOID;
            }

            Environment.global.allowedLibs.add("time");
            new core.libs.Time().init();
            return QValue.VOID;
        } else if (text.equals(".q.Console")) {

            if (Environment.global.allowedLibs.contains("console")) {
                return QValue.VOID;
            }

            Environment.global.allowedLibs.add("console");
            return QValue.VOID;
        } else if (text.equals(".q.puddle")) {

            if (Environment.global.allowedLibs.contains("puddle")) {
                return QValue.VOID;
            }

            Environment.global.allowedLibs.add("puddle");
            return QValue.VOID;
        } else if (text.equals(".q.gtp")) {

            if (Environment.global.allowedLibs.contains("gtp")) {
                return QValue.VOID;
            }

            Environment.global.allowedLibs.add("gtp");
            new GTP().init();
            return QValue.VOID;

        } else if (text.equals(".q.Listener")) {

            if (Environment.global.allowedLibs.contains("listener")) {
                return QValue.VOID;
            }

            Environment.global.allowedLibs.add("listener");
            new Listener().init();
            return QValue.VOID;
        } else if (text.equals(".q.io")) {

            if (Environment.global.allowedLibs.contains("io")) {
                return QValue.VOID;
            }

            Environment.global.allowedLibs.add("io");
            new IO().init();
            return QValue.VOID;
        }
        return QValue.VOID;
    }

    // straight from stackoverflow
    public static String getSaltString() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 18) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }

    public static void addAll() {

        Environment.global.allLibs.add("listener");
        Environment.global.allLibs.add("puddle");
        Environment.global.allLibs.add("console");
        Environment.global.allLibs.add("time");
        Environment.global.allLibs.add("random");
        Environment.global.allLibs.add("math");
        Environment.global.allLibs.add("files");
        Environment.global.allLibs.add("http");
        Environment.global.allLibs.add("windows");
        Environment.global.allLibs.add("audio");
        Environment.global.allLibs.add("io");
        Environment.global.allLibs.add("gtp");

    }

    private static String getStringFromStream(InputStream Stream) throws IOException {
        if (Stream != null) {
            Writer Writer = new StringWriter();

            char[] Buffer = new char[2048];
            try (Stream) {
                Reader Reader = new BufferedReader(new InputStreamReader(Stream, StandardCharsets.UTF_8));
                int counter;
                while ((counter = Reader.read(Buffer)) != -1) {
                    Writer.write(Buffer, 0, counter);
                }
            }
            return Writer.toString();
        } else {
            return "No Contents";
        }
    }

    public static void write(String path, File output) {
        new Thread(() -> {
            try {

                util.FileUtil n = new util.FileUtil(path);
                FileWriter f = new FileWriter(output);

                f.append("Total CharCount: ").append(String.valueOf(n.getCharCount())).append("\n");

                int cntr = 1;
                for (Token t : Environment.global.lst) {
                    f.append(t.toString()).append(" ");

                    if (cntr == 3) {
                        cntr = 0;
                        f.append("\n");
                    }
                    cntr++;
                }

                f.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }).start();
    }

    public static void resolveImport(String imp) {

        File file = new File(System.getProperty("user.dir") + "/" + imp + ".l");

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

            System.out.println("Import not resolved: " + imp);
        }

    }

    public static QComponent getCompByName(String comp) {

        for (QComponent xcomp : Environment.global.comps) {
            if (xcomp.name.equals(comp)) {
                return xcomp;
            }
        }
        return null;
    }

    public static Window getWinByName(String name) {

        for (Window xc : Environment.global.wins) {
            if (xc.realName.equals(name)) {
                return xc;
            }
        }
        return null;
    }

    public static void check(String p, String t2) {
        if (!Environment.global.allowedLibs.contains(p)) {
            System.out.printf("[FATAL] Cannot invoke '%s' subfunctions, as the package has not been imported.\nThe library can be found at: 'q.%s'\n", t2, t2);
            System.exit(0);
        }
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
