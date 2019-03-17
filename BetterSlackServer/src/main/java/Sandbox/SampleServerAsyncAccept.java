package sandbox;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class SampleServerAsyncAccept {
    private ServerSocket serverSocket;
    private List<Socket> connectedClients = new ArrayList<Socket>();
    private boolean online;
    private Thread acceptingThread;

    private static final String EXIT_KEYWORD = "exit";

    public void startServer(int port) throws IOException {
        serverSocket = new ServerSocket(port);
        System.out.println("Server is running...");
        online = true;

        acceptingThread = new Thread(() -> {
            while (online) {
                Socket clientSocket = null;
                try {
                    clientSocket = serverSocket.accept();
                } catch (IOException e) {
                    online = false;
                    System.out.println("Server has been disconnected");
                    break;
                }
                connectedClients.add(clientSocket);
                System.out.println("Client has been connected. " +
                        "Users online: " + connectedClients.size());
            }
            System.out.println("Server has been disconnected");
        });
        acceptingThread.start();
    }

    public void shutdown() {
        online = false;
    }

    public boolean isOnline() {
        return online;
    }
}
