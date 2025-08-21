dfimport java.util.Scanner;

public class CheckPositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        
        if (sc.hasNextDouble()) {
            double number = sc.nextDouble();

            if (number > 0) {
                System.out.println("The number is positive.");
            } else if (number < 0) {
                System.out.println("The number is negative.");
            } else {
                System.out.println("The number is zero.");
            }
        } else {
            System.out.println("Please enter a valid number.");
        }

        sc.close();
    }
}