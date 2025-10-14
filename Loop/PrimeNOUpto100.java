public class PrimeNOUpto100 {
    public static void main(String[] args) {

        System.out.println("Prime numbers from 1 to 100 are:");

        for (int num = 2; num <= 100; num++) {  // start from 2
            int count = 0;

            // check divisibility
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }

            // prime number has exactly 2 divisors
            if (count == 2) {
                System.out.print(num + " ");
            }
        }
    }
}
