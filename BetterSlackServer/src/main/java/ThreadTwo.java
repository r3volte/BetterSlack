public class ThreadTwo implements Runnable {

    private final String name;

    public ThreadTwo(String name) {
        this.name = name;
    }


    public void run() {
        System.out.println("Hello from " + name);
    }
}
