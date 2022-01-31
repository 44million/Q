package xxl;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenFactory;
import org.antlr.v4.runtime.Token;
import xxl.XXLang.etc.Installer;
import xxl.XXLang.etc.Parser;
import xxl.XXLang.etc.lang;

import java.io.File;
import java.io.FileWriter;
import java.sql.Time;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import static com.ibm.icu.text.PluralRules.Operand.f;
import static xxl.XXLang.etc.lang.lst;

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

            lang.FileUtil n = new lang.FileUtil(path);
            FileWriter f = new FileWriter(output);

            f.write("compgen at: [<" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss")) + "> src:[<" + new File(path).getAbsolutePath() + ">]\n\n");
            lang.genComp(n.getCharCount(), output, f);
            f.write("compgen finished at: <" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss")) + ">\t[(\"" + output.getAbsolutePath() + "\")]\n");
            f.close();

            Parser parser = new Parser(CharStreams.fromFileName(path));
            lst.addAll(parser.parse(false));

        } catch (Exception e) {

            String err = "[FATAL] " + e.getMessage();
            if (e.getMessage().startsWith("src\\main\\xxl\\") || e.getMessage().startsWith("C:") || e.getMessage().endsWith(".x")) {
                err += " (File not found)";
            }
            System.out.println(err);
        }
    }
}
