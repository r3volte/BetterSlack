package Sandbox;

import java.io.IOException;
import java.net.Socket;

public class Client {
    private Socket socket;


    public void connectToServer(String ip, int port) throws IOException {

        socket = new Socket(ip, port);
    }
}
