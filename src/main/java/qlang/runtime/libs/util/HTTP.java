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

/*
    http library, needs rewrite
 */

public class HTTP implements HttpHandler {

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

    @Override
    public void handle(HttpExchange he) throws IOException {
        he.sendResponseHeaders(200, Environment.global.response.length());
        OutputStream os = he.getResponseBody();
        os.write(Environment.global.response.getBytes());
        os.close();
    }

}
