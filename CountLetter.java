import java.util.Scanner;  // Scanner class use kiya input lene ke liye

class Count_Letter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // User se sentence input lena
        System.out.println("Enter a sentence");
        String s = sc.nextLine();  

        int len = s.length();  // string ki length (kitne characters hain)
        int count = 0;         // counter variable

        // har character check karna
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);  // ith character nikaala
            if (c == 'A' || c == 'a') { // agar 'A' ya 'a' hai
                count++;  // count increase kar do
            }
        }

        // Final output
        System.out.println("No of letter a = " + count);     
    }
}
