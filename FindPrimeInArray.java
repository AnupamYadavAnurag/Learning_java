public class FindPrimeInArray {
    public static void main(String[] args) {
        int[] arr = {5, 7, 9, 11, 15};

        System.out.println("Prime numbers in the array:");

        for (int n : arr) {
            int count = 0;

            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    count++;
                }
            }

            if (count == 2) { // only divisible by 1 and itself
                System.out.println(n);
            }
        }
    }
}
