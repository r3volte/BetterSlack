package Sandbox;

import javax.swing.*;
import java.io.IOException;
import java.net.ConnectException;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {

        Client client = new Client();

    try{
        client.connectToServer("192.168.1.74",55555);

    }catch (ConnectException e){
        JOptionPane.showMessageDialog(null,"Server is not running ! Please try later");
    }

        Thread.sleep(2000);
    }

}