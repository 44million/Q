package core.libs.util;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import core.etc.Environment;
import core.interp.QParser;

import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

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
            System.out.println(e.getMessage());
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

    @Override
    public void handle(HttpExchange he) throws IOException {
        he.sendResponseHeaders(200, Environment.global.response.length());
        OutputStream os = he.getResponseBody();
        os.write(Environment.global.response.getBytes());
        os.close();
    }

}
