package main;

import core.etc.Environment;
import core.etc.Parser;
import core.lang.util;
import org.antlr.v4.runtime.CharStreams;

import java.io.File;

public class Main {

    @SuppressWarnings("all")
    public static void main(String[] args) {

        File input = null;
        util.addAll();

        if (args.length >= 1) {

            util.get(args, input);

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
                Environment.global.lst.addAll(parser.parse(false));

                util.write(input.getAbsolutePath(), new File(input.getAbsolutePath().replaceAll("\\.x", ".comp")));

            } catch (Exception e) {

                String err = "[FATAL] " + e.getMessage();
                if (e.getMessage().endsWith(".x")) {
                    err += " (File not found)";
                }

                System.err.println(err);
                System.exit(0);
            }
        }
    }
}
