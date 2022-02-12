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

            String path = System.getProperty("user.dir") + "/src/main/QFiles/Main.x";

            System.out.println(new File(path).exists());
            System.out.println(new File(path).canRead());

            System.out.println(path);

            Parser parser = new Parser(path);
            lst.addAll(parser.parse(false));

            File output = new File(path.replaceAll("\\.x", ".qlang"));

            if (!output.exists()) {
                try {
                    output.createNewFile();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }

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
            String err = "[ERROR] " + e.getMessage();

            if (err.endsWith(".x")) {
                err += " (file not found)";
            }

            System.out.println(err);
        }
    }

    public static void alt(String[] args) {

        try {

//            Installer s = new Installer();
//            s.install();

            String path = "";

            if (args.length >= 1) {
                Path currentRelativePath = Paths.get("");
                String s = currentRelativePath.toAbsolutePath().toString();
                path = s + "/" + args[0];
            } else {
                try {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter the path to your file now:\n");
                    sc.next();
                    path = sc.nextLine();
                    path = path.trim();
                    sc.close();
                } catch (Exception e) {
                    if (e.getMessage().contains("closed")) {
                        System.out.print("");
                    } else {
                        System.out.println(e.getMessage());
                    }
                }
            }

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

            String finalPath = path;
            new Thread(() -> {
                try {

                    lang.FileUtil n = new lang.FileUtil(finalPath);
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

            System.out.println("\n\n\n\n\n\n");

        } catch (Exception e) {

            String err = "[FATAL] " + e.getMessage();
            if (e.getMessage().startsWith("src\\main\\xxl\\") || e.getMessage().startsWith("C:") || e.getMessage().endsWith(".x")) {
                err += " (File not found)";
            }

            if (e.getMessage().endsWith("closed")) {
                err = "";
            }

            System.out.println(err);
        }
    }
}
