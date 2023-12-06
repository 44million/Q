package qlang.runtime.STDLibs.io;

import qlang.core.internal.Log;
import qlang.core.interpreter.QParser;
import qlang.core.lang.Q.Value;
import qlang.runtime.STDLibs.util.QLibrary;
import qlang.runtime.errors.Problem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
    Built in Q files library, has a couple of built in functions and such. Needs a solid rewrite.
*/

public class QFiles extends QLibrary {

    /**
     * @param ctx The ExpressionContext Variable.
     */
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

            Log.log(Log.Severity.FATAL, err);
            System.exit(0);
        }
    }

    /**
     * @param path The path to find the size of
     * @return Returns the size of the given path as a Q Value Variable.
     */
    public static Value size(String path) {

        File file = new File(path);
        try {
            return new Value(java.nio.file.Files.size(file.toPath()));
        } catch (IOException e) {
            return new Value(0);
        }

    }

    /**
     * @return Name     Return the Q package as a String, in this case 'q.Files'
     */
    @Override
    public String getName() {
        return "q.Files";
    }

    @Override
    public void init() {

    }

}
