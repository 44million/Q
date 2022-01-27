package xxl.XXLang.etc;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;

import static xxl.XXLang.etc.lang.response;

public class BasicHTTPHandler implements HttpHandler {

    @Override
    public void handle(HttpExchange he) throws IOException {
        he.sendResponseHeaders(200, response.length());
        OutputStream os = he.getResponseBody();
        os.write(response.getBytes());
        os.close();
    }

}
