package main;

import core.etc.Parser;
import core.lang.lang;
import org.antlr.v4.runtime.CharStreams;

import java.io.File;

import static core.lang.lang.lst;

public class Main {

    public static void main(String[] args) {

        try {

            if (!new File("src/main/QFiles/Main.x".replaceAll("\\.x", ".comp")).exists()) {
                try {
                    new File("src/main/QFiles/Main.x".replaceAll("\\.x", ".comp")).createNewFile();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }

            Parser parser = new Parser(CharStreams.fromFileName("src/main/QFiles/Main.x"));
            lst.addAll(parser.parse(false));

            lang.write("src/main/QFiles/Main.x", new File("src/main/QFiles/Main.x".replaceAll("\\.x", ".comp")));

        } catch (Exception e) {

            String err = "[FATAL] " + e.getMessage();
            if (e.getMessage().startsWith("src\\main\\Q\\") || e.getMessage().startsWith("C:") || e.getMessage().endsWith(".x")) {
                err += " (File not found)";
            }

            System.out.println(err);
            System.exit(0);
        }
    }
}
