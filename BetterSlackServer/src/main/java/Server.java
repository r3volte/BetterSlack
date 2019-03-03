import javax.swing.*;
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
        JOptionPane.showMessageDialog(null,"Server is running");
        online = true;

        acceptingThread = new Thread(() -> {
            while (online) {
                Socket clientSocket = null;
                try {
                    clientSocket = serverSocket.accept();
                } catch (IOException e) {
                    online = false;
                    JOptionPane.showMessageDialog(null,"Server is running");
                    break;
                }
                connecedClients.add(clientSocket);
                System.out.println("Client has been connected. " +
                        "Users online: " + connecedClients.size());
            }
            JOptionPane.showMessageDialog(null,"Server has been disconnected");
        });
        acceptingThread.start();
    }
}
