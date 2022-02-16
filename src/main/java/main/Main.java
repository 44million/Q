package main;

import core.etc.Parser;
import core.lang.lang;
import org.antlr.v4.runtime.CharStreams;

import java.io.File;
import java.util.Scanner;

import static core.lang.lang.lst;

public class Main {

    public static void main(String[] args) {

        try {

            String path = "src/main/QFiles/Main.x";

            File output = new File(path.replaceAll("\\.x", ".comp"));

            if (!output.exists()) {
                try {
                    output.createNewFile();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }

            Parser parser = new Parser(CharStreams.fromFileName(path));
            lst.addAll(parser.parse(false));

            lang.write(path, output);

        } catch (Exception e) {

            String err = "[FATAL] " + e.getMessage();
            if (e.getMessage().startsWith("src\\main\\xxl\\") || e.getMessage().startsWith("C:") || e.getMessage().endsWith(".x")) {
                err += " (File not found)";
            }

            if (e.getMessage().endsWith("closed") || e.getMessage().contains("missing ';' at 'class'") || e.getMessage().contains("missing Identifier at ')'")) {
                err = "";
            }

            System.out.println(err);
        }
    }
}
