import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");

        if (sc.hasNextInt()) {
            int age = sc.nextInt();

            if (age >= 18) {
                System.out.println("You are eligible to vote.");
            } else if (age >= 0) {
                System.out.println("You are not eligible to vote.");
            } else {
                System.out.println("Age cannot be negative.");
            }
        } else {
            System.out.println("Please enter a valid age.");
        }

        sc.close();
    }
}
