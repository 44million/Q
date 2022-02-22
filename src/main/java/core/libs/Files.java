package core.libs;

import core.interp.QParser;
import core.lang.q.QValue;
import core.libs.utils.QLibrary;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Files extends QLibrary {


    public static QValue absPath(QParser.ObjFunctionCallExpressionContext ctx) {
        String q = ctx
                .exprList()
                .expression(0)
                .getText()
                .replace("\"", "");

        if (q == null) {
            System.out.println("[ERROR] Method 'files.absPath(:str)' accepts one argument, the file, or directory in question.");
            return QValue.NULL;
        }

        Path dbpath = Paths.get(q);

        if (!dbpath.toFile().exists()) {
            System.out.println("[ERROR] Cannot find file '" + dbpath.toAbsolutePath() + "'");
        }

        return new QValue(dbpath.toAbsolutePath());
    }

    public static QValue canRead(String path) {
        File file = new File(path);

        return new QValue(java.nio.file.Files.isReadable(file.toPath()));
    }

    public static void delete(QParser.ObjFunctionCallExpressionContext ctx) {
        if (ctx.exprList().expression(0) == null) {
            System.out.println("[ERROR] Function 'paths.delete(:str)' needs a string argument.");
        }

        String path = ctx.exprList().expression(0).getText();
        try {
            java.nio.file.Files.delete(new File(path).toPath());
        } catch (Exception e) {

            String err = e.getMessage();

            if (e instanceof FileNotFoundException) {
                err += " (File not found)";
            }

            System.out.println("[FATAL] " + err);
            System.exit(0);
        }
    }

    public static QValue size(String path) {

        File file = new File(path);
        try {
            return new QValue(java.nio.file.Files.size(file.toPath()));
        } catch (IOException e) {
            return new QValue(0);
        }

    }

    @Override
    public String getName() {
        return "q.Files";
    }

    @Override
    public void init() {

    }

}
