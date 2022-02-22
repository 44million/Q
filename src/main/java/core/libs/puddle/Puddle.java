package core.libs.puddle;

import core.interp.QParser;
import core.libs.utils.QLibrary;

import java.io.IOException;
import java.net.UnknownHostException;

import static junit.framework.Assert.assertEquals;

public class Puddle extends QLibrary {

    private final String ip;
    private final int port;

    public Puddle(String ip, int port) {
        this.port = port;
        this.ip = ip;
    }

    public static void start(QParser.ObjFunctionCallExpressionContext ctx) {
        int i = Integer.parseInt(ctx.exprList().expression(1).getText());
        String ip = ctx.exprList()
                .expression(0)
                .getText()
                .replace("\"", "");

        try {
            ServerConnector.run(ip, i);
        } catch (IOException | InterruptedException e) {
            System.out.println("[FATAL] " + e.getMessage());
            System.exit(0);
        }
    }

    @Override
    public String getName() {
        return "q.puddle";
    }

    @Override
    public void init() {
        try {
            PClient client = new PClient();
            client.startConnection(ip, port);
            String response = client.sendMessage("Server Response");
            assertEquals("Hello World", response);
        } catch (Exception e) {

            if (e instanceof UnknownHostException) {
                System.out.println("[FATAL] Host not found: " + e);
                System.exit(0);
            }

            System.out.println("[FATAL] " + e.getMessage());
            System.exit(0);
        }

    }

}
