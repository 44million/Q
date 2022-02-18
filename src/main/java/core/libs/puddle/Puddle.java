package core.libs.puddle;

import core.libs.utils.QLibrary;
import java.net.*;

import static junit.framework.Assert.assertEquals;

public class Puddle extends QLibrary {

    private String ip;
    private int port;

    @Override
    public String getName() {
        return "q.puddle";
    }

    public Puddle(String ip, int port) {
        this.port = port;
        this.ip = ip;
    }

    @Override
    public void init() {
        try {
            GreetClient client = new GreetClient();
            client.startConnection(ip, port);
            String response = client.sendMessage("Server Response");
            assertEquals("Hello World", response);
        } catch (Exception e) {
            System.out.println("[FATAL] " + e.getMessage());
            System.exit(0);
        }

    }
}
