package core.libs;

import com.sun.net.httpserver.HttpServer;
import core.etc.Environment;
import core.libs.util.HTTP;
import core.libs.util.QLibrary;

import java.net.InetSocketAddress;

public class WebServer extends QLibrary {

    public int port;
    public String id;
    private HttpServer server;

    public WebServer(int port, String id) {
        this.port = port;
        this.id = id;
    }

    @Override
    public void init() {
        try {
            server = HttpServer.create(new InetSocketAddress(port), 0);
            server.createContext("/", new HTTP());
            server.setExecutor(null);
            server.start();
        } catch (Exception e) {
            System.out.println("[ERROR] " + e.getMessage());
        }
    }

    public void stop() {
        server.stop(0);
    }

    public void setText(String s) {
        Environment.global.response = s;
    }

    public String getName() {
        return "q.http";
    }
}
