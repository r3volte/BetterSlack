package Sandbox;

public class ThreadOne implements Runnable {

    private final String name;
    Server server = new Server();

    public ThreadOne(String name) {
        this.name = name;
    }


    public void run() {
    }
}
