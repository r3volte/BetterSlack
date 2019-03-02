import java.io.IOException;
import java.net.SocketException;

public class Main {


    public static void main(String[] args) throws IOException {

        Server server = new Server();
        Thread t1 = new Thread(new ThreadOne("One"));
        Thread t2 = new Thread(new ThreadTwo("Two"));

        t1.start();
        t2.start();

        try {
            server.startServer(55555);
        }catch (SocketException e){

        }
    }
}
