import java.util.Scanner;

public class CheckEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");

        if (sc.hasNextInt()) {
            int number = sc.nextInt();

            if (number % 2 == 0) {
                System.out.println("The number is even.");
            } else {
                System.out.println("The number is odd.");
            }
        } else {
            System.out.println("Please enter a valid integer.");
        }

        sc.close();
    }
}
