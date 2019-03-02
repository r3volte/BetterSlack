public class ThreadOne implements Runnable {

    private final String name;

    public ThreadOne(String name) {
        this.name = name;
    }


    public void run() {
        System.out.println("Hello from " + name);
    }
}
