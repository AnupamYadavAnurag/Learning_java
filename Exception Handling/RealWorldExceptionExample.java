import java.util.InputMismatchException;
import java.util.Scanner;

public class RealWorldExceptionExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Input from user
            System.out.print("Enter total amount: ");
            double total = sc.nextDouble(); // may throw InputMismatchException

            System.out.print("Enter number of people to split the bill: ");
            int people = sc.nextInt(); // may throw InputMismatchException

            // Division (may throw ArithmeticException if people = 0)
            double share = total / people;

            System.out.println("Each person should pay: ₹" + share);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter only numbers.");
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero. Number of people must be greater than 0.");
        } finally {
            System.out.println("Thank you for using the Bill Splitter App!");
            sc.close();
        }
    }
}
