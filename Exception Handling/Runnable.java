class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread via Runnable running...");
    }
}

public class Runnable {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable());
        t.start();
    }
}
