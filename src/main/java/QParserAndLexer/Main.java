package QParserAndLexer;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;
import Q.QLang.etc.Parser;
import Q.QLang.lang.lang;

import java.io.File;
import java.io.FileWriter;

import static Q.QLang.lang.lang.lst;

public class Main {

    public static void main(String[] args) {

        try {

//            Installer s = new Installer();
//            s.install();

            String path = "src/main/QFiles/Main.x".trim();

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

            new Thread(() -> {
                try {

                    lang.FileUtil n = new lang.FileUtil(path);
                    FileWriter f = new FileWriter(output);

                    f.append("Total CharCount: ").append(String.valueOf(n.getCharCount())).append("\n");

                    int cntr = 1;
                    for (Token t : lst) {
                        f.append(t.toString()).append(" ");

                        if (cntr == 3) {
                            cntr = 0;
                            f.append("\n");
                        }
                        cntr++;
                    }

                    f.close();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }).start();

        } catch (Exception e) {

            String err = "[FATAL] " + e.getMessage();
            if (e.getMessage().startsWith("src\\main\\xxl\\") || e.getMessage().startsWith("C:") || e.getMessage().endsWith(".x")) {
                err += " (File not found)";
            }
            System.out.println(err);
        }
    }
}
