
import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    private Socket socket;
    private PrintWriter output;
    BufferedReader writter;
    String sendMessage;
    private static final String EXIT_KEYWORD = "exit";

    public void connectToServer(String ip, int port) throws IOException {

        socket = new Socket(ip, port);
        writter = new BufferedReader(new InputStreamReader(System.in));
        output = new PrintWriter(socket.getOutputStream(), true);
        while (true) {
            sendMessage = writter.readLine();
            if (sendMessage.toLowerCase().equals(EXIT_KEYWORD)) {
                break;
            }
            output.println(sendMessage);
        }

    }
}
