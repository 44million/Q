package qlang.runtime.libs;

import qlang.core.interp.QParser;
import qlang.core.lang.Q.Value;
import qlang.runtime.errors.Problem;
import qlang.runtime.libs.util.QLibrary;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
    Built in Q files library, has a couple of built in functions and such. Needs a solid rewrite.
*/

public class QFiles extends QLibrary {


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

            System.err.println("[FATAL] " + err);
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
