import java.io.*;

public class FileRead {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("data.txt");
            BufferedReader br = new BufferedReader(file);
            System.out.println(br.readLine());
            br.close();
        } catch (IOException e) {
            System.out.println("Error: File not found!");
        } finally {
            System.out.println("File process completed.");
        }
    }
}
