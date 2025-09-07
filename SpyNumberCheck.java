import java.util.Scanner;

public class SpyNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0, product = 1;
        int temp = num;

        while (temp > 0) {
            int digit = temp % 10;   // last digit
            sum += digit;           // add digit
            product *= digit;       // multiply digit
            temp /= 10;             // remove last digit
        }

        if (sum == product) {
            System.out.println(num + " is a Spy Number.");
        } else {
            System.out.println(num + " is Not a Spy Number.");
        }
    }
}
