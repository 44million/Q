package xxl;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import xxl.XXLang.etc.Parser;
import xxl.XXLang.etc.lang;

public class Main {

    public static void main(String[] args) {

        try {
            lang.resolveImport("System");

            CharStream path = CharStreams.fromFileName("xxl/src/main/xxl/Main.x".trim());

            Parser parser = new Parser(path);
            parser.parse();
        } catch (Exception e) {

            String err = "[FATAL] " + e.getMessage();

            if (e.getMessage().startsWith("src\\main\\xxl\\") || e.getMessage().startsWith("C:")) {
                err += " (File not found)";
            }

            System.out.println(err);
        }
    }
}
