package xxl.XXLang.lang;

import org.antlr.v4.runtime.Token;
import xxl.XXLang.etc.Parser;
import xxl.XXLang.etc.Scope;
import xxl.XXLang.libs.Window;

import java.io.*;
import java.util.*;

public class lang {

    public static Map<String, Function> functions = Collections.emptyMap();
    public static Scope scope = new Scope();
    public static EvalVisitor visitor = new EvalVisitor(scope, functions);
    public static String response = "Hello World!";
    public static List<File> parsed = new ArrayList<>();
    public static List<XClass> classes = new ArrayList<>();
    public static List<Token> lst = new ArrayList<>();
    public static List<Window> wins = new ArrayList<>();
    public static List<Window.XComponent> comps = new ArrayList<>();

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

    public static XClass getClassByName(String name) {

        for (XClass xc : classes) {
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
            if (xc.name.equals(name)) {
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

        String[] nn = new String[] {
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
