package xxl.XXLang.etc;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class lang {

    public static Map<String, Function> functions = Collections.emptyMap();
    public static Scope scope = new Scope();
    public static EvalVisitor visitor = new EvalVisitor(scope, functions);
    public static String response = "Hello World!";
    public static List<File> parsed = new ArrayList<>();
    public static List<XClass> classes = new ArrayList<>();

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
            parser.parse();
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

}
