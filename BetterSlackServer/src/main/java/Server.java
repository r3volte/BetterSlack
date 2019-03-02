import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {

    private ServerSocket serverSocket;
    List<Socket> connecedClients = new ArrayList<Socket>();
    private boolean online;
    Thread acceptingThread;

    public boolean isOnline() {
        return online;
    }

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
                connecedClients.add(clientSocket);
                System.out.println("Client has been connected. " +
                        "Users online: " + connecedClients.size());
            }
            System.out.println("Server has been disconnected");
        });
        acceptingThread.start();
    }
}
