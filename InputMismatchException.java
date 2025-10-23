import java.util.*;

public class ExceptionExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();  // may cause InputMismatchException

            System.out.print("Enter second number: ");
            int b = sc.nextInt();  // may cause InputMismatchException

            int result = a / b;    // may cause ArithmeticException
            System.out.println("Result: " + result);

        } catch (InputMismatchException e) {
            System.out.println("Please enter only numbers!");
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        } finally {
            System.out.println("Program finished.");
        }
    }
}