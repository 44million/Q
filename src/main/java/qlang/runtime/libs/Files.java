package qlang.runtime.libs;

import qlang.runtime.errors.Problem;
import qlang.core.interp.QParser;
import qlang.core.lang.Q.Value;
import qlang.runtime.libs.util.QLibrary;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Files extends QLibrary {


    public static Value absPath(QParser.ObjFunctionCallExpressionContext ctx) {

        if (ctx.exprList().expression(0) == null) {
            throw new Problem("Function 'files::absPath(:str)' accepts one argument, the file, or directory in question.");
        }

        String q = ctx
                .exprList()
                .expression(0)
                .getText()
                .replace("\"", "");

        Path dbpath = Paths.get(q);

        if (!dbpath.toFile().exists()) {
           throw new Problem("File or directory '" + q + "' does not exist.");
        }

        return new Value(dbpath.toAbsolutePath());
    }

    public static void delete(QParser.ObjFunctionCallExpressionContext ctx) {
        if (ctx.exprList().expression(0) == null) {
            throw new Problem("Function 'files::delete(:str)' accepts one argument, the file, or directory in question.");
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

    public static Value size(String path) {

        File file = new File(path);
        try {
            return new Value(java.nio.file.Files.size(file.toPath()));
        } catch (IOException e) {
            return new Value(0);
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
