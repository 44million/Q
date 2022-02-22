package core.libs.utils;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import core.interp.QParser;
import core.lang.lang;

import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class HTTP implements HttpHandler {

    @Override
    public void handle(HttpExchange he) throws IOException {
        he.sendResponseHeaders(200, lang.response.length());
        OutputStream os = he.getResponseBody();
        os.write(lang.response.getBytes());
        os.close();
    }

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

}
