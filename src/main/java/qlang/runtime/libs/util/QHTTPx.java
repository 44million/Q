package qlang.runtime.libs.util;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import qlang.core.internal.Environment;
import qlang.core.interp.QParser;
import qlang.runtime.errors.Problem;
import qlang.runtime.errors.Tip;

import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Q's native HTTP library, needs a significant re-write, it's very poorly made.
 */
public class QHTTPx implements HttpHandler {

    /**
     * The GET method for Q's HTTP library
     *
     * @param ctx       The ExpressionContext, which turns into the link to try and GET.
     */
    public static void get(QParser.ObjFunctionCallExpressionContext ctx) {
        String link = ctx.exprList().expression(0)
                .getText()
                .replace("\"", "");

        try {
            URL url = new URL(link);

            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setDoOutput(true);

        } catch (Exception e) {
            throw new Problem(e, new Tip("Make sure the address is correct, and active."));
        }
    }

    /**
     *
     * @param ctx       the ExpressionContext, which is turned into a String, which turns into a address to try and post to
     */
    public static void post(QParser.ObjFunctionCallExpressionContext ctx) {
        String link = ctx.exprList().expression(0)
                .getText()
                .replace("\"", "");

        try {
            URL url = new URL(link);

            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("POST");
            con.setDoOutput(true);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     *
     * @param ctx       The ExpressionContext, which again, turns into a link for Q to try and put to.
     */
    public static void put(QParser.ObjFunctionCallExpressionContext ctx) {
        String link = ctx.exprList().expression(0)
                .getText()
                .replace("\"", "");

        try {
            URL url = new URL(link);

            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("PUT");
            con.setDoOutput(true);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     *
     * @param ctx       The ExpressionContext, which again, turns into a link for Q to try and delete.
     */
    public static void delete(QParser.ObjFunctionCallExpressionContext ctx) {
        String link = ctx.exprList().expression(0)
                .getText()
                .replace("\"", "");

        try {
            URL url = new URL(link);

            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("DELETE");
            con.setDoOutput(true);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     *
     * @param ctx       The ExpressionContext, which again, turns into a link for Q to try and HEAD.
     */
    public static void head(QParser.ObjFunctionCallExpressionContext ctx) {
        String link = ctx.exprList().expression(0)
                .getText()
                .replace("\"", "");

        try {
            URL url = new URL(link);

            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("HEAD");
            con.setDoOutput(true);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     *
     * @param ctx       The ExpressionContext, which again, turns into a link for Q to get options.
     */
    public static void options(QParser.ObjFunctionCallExpressionContext ctx) {
        String link = ctx.exprList().expression(0)
                .getText()
                .replace("\"", "");

        try {
            URL url = new URL(link);

            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("OPTIONS");
            con.setDoOutput(true);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     *
     * @param ctx       The ExpressionContext, which again, turns into a link for Q to try and trace.
     */
    public static void trace(QParser.ObjFunctionCallExpressionContext ctx) {
        String link = ctx.exprList().expression(0)
                .getText()
                .replace("\"", "");

        try {
            URL url = new URL(link);

            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("TRACE");
            con.setDoOutput(true);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     *
     * @param he       The HttpExchange variable, which will try and write content to a Q webserver.
     */
    @Override
    public void handle(HttpExchange he) throws IOException {
        he.sendResponseHeaders(200, Environment.global.response.length());
        OutputStream os = he.getResponseBody();
        os.write(Environment.global.response.getBytes());
        os.close();
    }

}
