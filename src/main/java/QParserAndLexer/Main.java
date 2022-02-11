package QParserAndLexer;

import Q.QLang.etc.Parser;
import Q.QLang.lang.lang;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

import java.io.File;
import java.io.FileWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import static Q.QLang.lang.lang.lst;

public class Main {

    public static void main(String[] args) {

        try {

            Parser parser = new Parser(CharStreams.fromFileName("src/main/QFiles/Main.x"));
            lst.addAll(parser.parse(false));

        } catch (Exception e) {

            String err = "[FATAL] " + e.getMessage();
            if (e.getMessage().startsWith("src\\main\\xxl\\") || e.getMessage().startsWith("C:") || e.getMessage().endsWith(".x")) {
                err += " (File not found)";
            }

            if (e.getMessage().endsWith("closed")) {
                err = "";
            }

            System.out.println(err + " err in main thread");
        }
    }
}
