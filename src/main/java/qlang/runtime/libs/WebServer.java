package qlang.runtime.libs;

import com.sun.net.httpserver.HttpServer;
import qlang.core.internal.Environment;
import qlang.runtime.errors.Problem;
import qlang.runtime.libs.util.HTTP;
import qlang.runtime.libs.util.QLibrary;

import java.io.IOException;
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
        } catch (IOException e) {
            throw new Problem(e.getMessage());
        }
    }

    public void update() {
        server.stop(0);
        try {
            server = HttpServer.create(new InetSocketAddress(port), 0);
            server.createContext("/", new HTTP());
            server.setExecutor(null);
            server.start();
        } catch (IOException e) {
            throw new Problem(e);
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
