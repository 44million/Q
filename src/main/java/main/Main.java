package main;

import core.etc.Parser;
import core.lang.lang;
import mod.core.Visitor;
import org.antlr.v4.runtime.CharStreams;

import java.io.File;

import static core.lang.lang.lst;

public class Main {

    public static void main(String[] args) {

        File input;

        Visitor vis = new Visitor();
        vis.visit("src/main/QFiles/Main.qmod", true);

        if (args.length >= 1) {
            int counter = 0;
            for (String cmd : args) {

                if (cmd.equals("--setpath") || cmd.equals("-p")) {
                    input = new File(args[++counter]);
                }
                counter++;
            }

        } else {

            input = new File("src/main/QFiles/Main.x");

            try {

                if (!new File(input.getAbsolutePath().replaceAll("\\.x", ".comp")).exists()) {
                    try {
                        new File(input.getAbsolutePath().replaceAll("\\.x", ".comp")).createNewFile();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }

                Parser parser = new Parser(CharStreams.fromFileName(input.getAbsolutePath()));
                lst.addAll(parser.parse(false));

                lang.write(input.getAbsolutePath(), new File(input.getAbsolutePath().replaceAll("\\.x", ".comp")));

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
}
