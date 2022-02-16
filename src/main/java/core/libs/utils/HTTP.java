package core.libs.utils;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import core.lang.lang;

import java.io.IOException;
import java.io.OutputStream;

public class HTTP implements HttpHandler {

    @Override
    public void handle(HttpExchange he) throws IOException {
        he.sendResponseHeaders(200, lang.response.length());
        OutputStream os = he.getResponseBody();
        os.write(lang.response.getBytes());
        os.close();
    }

}
