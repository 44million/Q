package core.libs.puddle;

import core.libs.utils.QLibrary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class PServer extends QLibrary {
    private ServerSocket serverSocket;
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;

    public void start(int port) throws IOException {
        serverSocket = new ServerSocket(port);
        clientSocket = serverSocket.accept();
        out = new PrintWriter(clientSocket.getOutputStream(), true);
        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        String greeting = in.readLine();
        if ("Server".equals(greeting)) {
            out.println("Server");
        } else {
            out.println("Unrecognized");
        }
    }

    public void stop() throws IOException {
        in.close();
        out.close();
        clientSocket.close();
        serverSocket.close();
    }

    @Override
    public String getName() {
        return "q.puddle";
    }

    @Override
    public void init() {
        try {
            this.start(8000);
        } catch (IOException e) {
            System.out.println("[ERROR] " + e.getMessage());
        }
    }
}