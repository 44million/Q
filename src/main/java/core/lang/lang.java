package core.lang;

import core.etc.Parser;
import core.etc.Scope;
import core.libs.WebServer;
import core.libs.Window;
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
    public static EvalVisitor visitor = new EvalVisitor(scope, functions);
    public static String response = "Hello World!";
    public static List<File> parsed = new ArrayList<>();
    public static List<QClass> classes = new ArrayList<>();
    public static List<Token> lst = new ArrayList<>();
    public static List<Window> wins = new ArrayList<>();
    public static List<Window.XComponent> comps = new ArrayList<>();
    public static List<CFunction> funcs = new ArrayList<>();
    public static List<WebServer> webs = new ArrayList<>();
    public static HashMap<String, File> files = new HashMap<>();
    public static Parser parser = new Parser();

    public static String getTextFromGithub(String link) {
        URL Url = null;
        try {
            Url = new URL(link);
        } catch (MalformedURLException e1) {
            System.out.println("[FATAL] " + e1.getMessage());
        }
        HttpURLConnection Http = null;
        try {
            Http = (HttpURLConnection) Url.openConnection();
        } catch (IOException e1) {
            System.out.println("[FATAL] " + e1.getMessage());
        }
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
            Response = GetStringFromStream(Stream);
        } catch (IOException e) {
            System.out.println("[FATAL] " + e.getMessage());
        }
        return Response;
    }

    private static String GetStringFromStream(InputStream Stream) throws IOException {
        if (Stream != null) {
            Writer Writer = new StringWriter();

            char[] Buffer = new char[2048];
            try {
                Reader Reader = new BufferedReader(new InputStreamReader(Stream, StandardCharsets.UTF_8));
                int counter;
                while ((counter = Reader.read(Buffer)) != -1) {
                    Writer.write(Buffer, 0, counter);
                }
            } finally {
                Stream.close();
            }
            return Writer.toString();
        } else {
            return "No Contents";
        }
    }

    public static void parse(String s) {
        try {
            parser.parse(false);
        } catch (Exception e) {
            System.out.println(e.getMessage());
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

    public static WebServer getWebByName(int name) {

        for (WebServer xc : webs) {
            if (xc.port == (name)) {
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

    public static Window.XComponent getCompByName(String comp) {

        for (Window.XComponent xcomp : comps) {
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

    public static String getRandom(String[] array) {
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
    }

    public static void genComp(long n, File f, FileWriter w) {

        String[] nn = new String[]{
                "0", "1"
        };

        long cntr = 0;
        long con = 1;

        while (cntr < n) {
            try {
                String s = "@" + getRandom(nn) + "\t$";

                if (con == 3) {
                    s += "\t$";
                } else if (con == 6) {
                    s += "\n@";
                    con = 0;
                }

                w.write(s);
                cntr++;
                con++;
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
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
