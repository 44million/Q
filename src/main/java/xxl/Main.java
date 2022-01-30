package xxl;

import org.antlr.v4.runtime.CharStreams;
import xxl.XXLang.etc.Installer;
import xxl.XXLang.etc.Parser;

public class Main {

    public static void main(String[] args) {

        try {

//            Installer s = new Installer();
//            s.install();

            Parser parser = new Parser(CharStreams.fromFileName("src/main/xxl/Main.x".trim()));
            parser.parse();
        } catch (Exception e) {

            String err = "[FATAL] " + e.getMessage();
            if (e.getMessage().startsWith("src\\main\\xxl\\") || e.getMessage().startsWith("C:") || e.getMessage().endsWith(".x")) {
                err += " (File not found)";
            }
            System.out.println(err);
        }
    }
}
