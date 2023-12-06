package qlang.runtime.STDLibs.io;

import com.sun.net.httpserver.HttpServer;
import qlang.core.lang.Environment;
import qlang.runtime.STDLibs.util.QHTTPx;
import qlang.runtime.STDLibs.util.QLibrary;
import qlang.runtime.errors.Problem;

import java.io.IOException;
import java.net.InetSocketAddress;

/*
    WebServer library, needs a rewrite, though it is functional,
    and can load html/css/js files onto a localhost server.
 */

public class QWebServer extends QLibrary {

    public int port;
    public String id;
    private HttpServer server;

    /**
     * @param port The HTTP port to save
     * @param id   The identifier of the Webserver variable
     */
    public QWebServer(int port, String id) {
        this.port = port;
        this.id = id;
    }

    @Override
    public void init() {
        try {
            server = HttpServer.create(new InetSocketAddress(port), 0);
            server.createContext("/", new QHTTPx());
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
            server.createContext("/", new QHTTPx());
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
