package Q.QLang.lang;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;

public class HTTP implements HttpHandler {

    @Override
    public void handle(HttpExchange he) {
        try {
            he.sendResponseHeaders(200, lang.response.length());
            OutputStream os = he.getResponseBody();
            os.write(lang.response.getBytes());
            os.close();
        } catch (Exception e) {
            System.out.println(e.getMessage() + " in http file");
        }
    }

}
