package xxl;

import org.antlr.v4.runtime.*;
import xxl.XXLang.etc.*;
import xxl.XXLang.etc.Parser;

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
