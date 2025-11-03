class DownloadFile extends Thread {
    public void run() {
        System.out.println("Downloading file...");
    }
}

class PlayMusic extends Thread {
    public void run() {
        System.out.println("Playing music...");
    }
}

public class PlayMusicDownloadFile {
    public static void main(String[] args) {
        DownloadFile d = new DownloadFile();
        PlayMusic m = new PlayMusic();
        d.start();
        m.start();
    }
}
