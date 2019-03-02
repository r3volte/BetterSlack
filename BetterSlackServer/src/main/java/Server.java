import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

public class Server {

    private ServerSocket serverSocket;
    private Socket socket;
    private BufferedReader input;
    private static final String EXIT_KEYWORD = "exit";

    public void startServer(int port) throws IOException {

        serverSocket = new ServerSocket(port);
        JOptionPane.showMessageDialog(null, "Server is running");
        socket = serverSocket.accept();
        JOptionPane.showMessageDialog(null, "Client has been connected");

        input = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        while(!socket.isClosed()) {
            String receivedMessage = "";

            try {
                receivedMessage = input.readLine();
            } catch(SocketException ex) {
                System.out.println("Client has been disconnected");
                break;
            }

            if(receivedMessage.toLowerCase().equals(EXIT_KEYWORD)) {
                break;
            }

            System.out.println(receivedMessage);
        }
    }
}
