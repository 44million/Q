package xxl;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;
import xxl.XXLang.etc.Parser;
import xxl.XXLang.lang.lang;
import xxl.XXLang.libs.Window;

import java.io.File;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static xxl.XXLang.lang.lang.lst;

public class Main {

    public static void main(String[] args) {

        try {

//            Installer s = new Installer();
//            s.install();

            String path = "src/main/xxl/Main.x".trim();

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
                        f.append(String.valueOf(t.getType())).append(" ");

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

            for (Window w : lang.wins) {
                System.out.println(w.name + " <--");
            }

        } catch (Exception e) {

            String err = "[FATAL] " + e.getMessage();
            if (e.getMessage().startsWith("src\\main\\xxl\\") || e.getMessage().startsWith("C:") || e.getMessage().endsWith(".x")) {
                err += " (File not found)";
            }
            System.out.println(err);
        }
    }
}
