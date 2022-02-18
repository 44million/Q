package core.lang;

import core.etc.Parser;
import core.etc.Scope;
import core.lang.q.QClass;
import core.libs.AWT.QComponent;
import core.libs.AWT.Window;
import core.libs.MediaPlayer;
import core.libs.WebServer;
import org.antlr.v4.runtime.Token;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class lang {

    public static Map<String, Function> functions = Collections.emptyMap();
    public static Scope scope = new Scope();
    public static Visitor visitor = new Visitor(scope, functions);
    public static String response = "Hello World!";
    public static List<File> parsed = new ArrayList<>();
    public static List<QClass> classes = new ArrayList<>();
    public static List<Token> lst = new ArrayList<>();
    public static List<Window> wins = new ArrayList<>();
    public static List<QComponent> comps = new ArrayList<>();
    public static List<CFunction> funcs = new ArrayList<>();
    public static List<WebServer> webs = new ArrayList<>();
    public static HashMap<String, File> files = new HashMap<>();
    public static Parser parser = new Parser();
    public static List<String> allowedLibs = new ArrayList<>();
    public static List<MediaPlayer> players = new ArrayList<>();
    public static List<core.libs.utils.List> lists = new ArrayList<>();
    public static boolean main = false;

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

        for (WebServer w : lang.webs) {
            if (w.id.equals(name)) {
                return w;
            }
        }
        return null;
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

                lang.FileUtil n = new lang.FileUtil(path);
                FileWriter f = new FileWriter(output);

                f.append("Total CharCount: ").append(String.valueOf(n.getCharCount())).append("\n");

                int cntr = 1;
                for (Token t : lst) {
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

        for (File f : lang.parsed) {
            if (f.getPath().equals(file.getPath())) {
                return;
            }
        }

        lang.parsed.add(file);

        Parser parser = new Parser(file);
        try {
            lang.lst.addAll(parser.parse(false));
        } catch (Exception e) {

            if (imp.equals("System")) {
                return;
            }

            System.out.println("Import not resolved: " + imp);
        }

    }

    public static QClass getClassByName(String name) {

        for (QClass xc : classes) {
            if (xc.name.equals(name)) {
                return xc;
            }
        }
        return null;
    }

    public static MediaPlayer getPlayerByName(String name) {

        for (MediaPlayer xc : players) {
            if (xc.id.equals(name)) {
                return xc;
            }
        }
        return null;
    }

    public static core.libs.utils.List getListByName(String name) {

        for (core.libs.utils.List xc : lists) {
            if (Objects.equals(xc.id, name)) {
                return xc;
            }
        }
        return null;
    }

    public static CFunction getFuncByName(String name) {

        for (CFunction xc : funcs) {
            if (xc.name.equals(name)) {
                return xc;
            }
        }
        return null;
    }

    public static QComponent getCompByName(String comp) {

        for (QComponent xcomp : comps) {
            if (xcomp.name.equals(comp)) {
                return xcomp;
            }
        }
        return null;
    }

    public static Window getWinByName(String name) {

        for (Window xc : wins) {
            if (xc.realName.equals(name)) {
                return xc;
            }
        }
        return null;
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
