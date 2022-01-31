package xxl;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenFactory;
import org.antlr.v4.runtime.Token;
import xxl.XXLang.etc.Installer;
import xxl.XXLang.etc.Parser;
import xxl.XXLang.etc.lang;

import java.io.File;
import java.io.FileWriter;
import java.util.List;

import static com.ibm.icu.text.PluralRules.Operand.f;
import static xxl.XXLang.etc.lang.lst;

public class Main {

    public static void main(String[] args) {

        try {

//            Installer s = new Installer();
//            s.install();

            String path = "src/main/xxl/Main.x".trim();

            Parser parser = new Parser(CharStreams.fromFileName(path));
            lst.addAll(parser.parse(false));

            File output = new File(path.replaceAll("\\.x", ".comp"));

            if (!output.exists()) {
                try {
                    output.createNewFile();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }

            FileWriter f = new FileWriter(output);

            for (Token t : lst) {
                f.write(t.getText());
            }
            f.close();

        } catch (Exception e) {

            String err = "[FATAL] " + e.getMessage();
            if (e.getMessage().startsWith("src\\main\\xxl\\") || e.getMessage().startsWith("C:") || e.getMessage().endsWith(".x")) {
                err += " (File not found)";
            }
            System.out.println(err);
        }
    }
}
