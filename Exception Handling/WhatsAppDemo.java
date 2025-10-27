class Sender {
    synchronized void sendMessage(String msg) {
        System.out.println("Sending: " + msg);
        try {
            Thread.sleep(1000); // simulating time delay
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println(msg + " sent successfully!");
    }
}

class SenderThread extends Thread {
    private String msg;
    Sender sender;

    SenderThread(String m, Sender obj) {
        msg = m;
        sender = obj;
    }

    public void run() {
        sender.sendMessage(msg);
    }
}

public class WhatsAppDemo {
    public static void main(String[] args) {
        Sender sender = new Sender();

        SenderThread t1 = new SenderThread("Hello Anupam!", sender);
        SenderThread t2 = new SenderThread("How are you?", sender);

        t1.start();
        t2.start();
    }
}
