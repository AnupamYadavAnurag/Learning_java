import java.util.Scanner;

public class SingularMatrixCheck {
    // Function to calculate determinant of 2x2 matrix
    static int determinant2x2(int[][] mat) {
        return (mat[0][0] * mat[1][1]) - (mat[0][1] * mat[1][0]);
    }

    // Function to calculate determinant of 3x3 matrix
    static int determinant3x3(int[][] mat) {
        int det = mat[0][0] * (mat[1][1] * mat[2][2] - mat[1][2] * mat[2][1])
                - mat[0][1] * (mat[1][0] * mat[2][2] - mat[1][2] * mat[2][0])
                + mat[0][2] * (mat[1][0] * mat[2][1] - mat[1][1] * mat[2][0]);
        return det;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of square matrix
        System.out.print("Enter size of square matrix (2 or 3): ");
        int n = sc.nextInt();

        int[][] mat = new int[n][n];

        // Input elements
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int det = 0;
        if (n == 2) {
            det = determinant2x2(mat);
        } else if (n == 3) {
            det = determinant3x3(mat);
        } else {
            System.out.println("Only 2x2 or 3x3 supported here.");
            return;
        }

        // Check if singular
        if (det == 0) {
            System.out.println("Matrix is Singular.");
        } else {
            System.out.println("Matrix is Non-Singular.");
        }
    }
}
