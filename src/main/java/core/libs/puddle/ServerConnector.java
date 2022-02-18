package core.libs.puddle;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerConnector {

    public static void run(String ip, int port) throws IOException, InterruptedException {
        // server code.
        ServerSocket serverSocket = new ServerSocket(8082);
        Thread serverThread = new Thread(() -> {
            while (true) {
                try {
                    Socket connection = serverSocket.accept();

                    try (
                            BufferedReader serverReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                            Writer serverWriter = new BufferedWriter(new OutputStreamWriter(connection.getOutputStream()))
                    ) {
                        serverWriter.write("Puddle ping success for: " + serverReader.readLine() + "\n");
                        serverWriter.flush();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (Throwable t) {
                    t.printStackTrace();
                    throw t;
                }
            }
        });
        serverThread.setDaemon(true);
        serverThread.start();

        // client code.
        Socket clientSocket = new Socket(ip, port);
        try (
                Writer clientWriter = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
                BufferedReader clientReader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))
        ) {
            clientWriter.write(ip + "\n");
            clientWriter.flush();
            String response = clientReader.readLine();

            System.out.println(response);
        }
    }
}