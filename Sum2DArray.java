import java.util.Scanner;

public class Sum2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input for rows and columns
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];
        int sum = 0;

        // Step 2: Input elements
        System.out.println("Enter elements of the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
                sum += arr[i][j];  // add to sum while taking input
            }
        }

        // Step 3: Print array
        System.out.println("\nThe 2D array is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // Step 4: Print sum
        System.out.println("\nSum of all elements = " + sum);

        sc.close();
    }
}
