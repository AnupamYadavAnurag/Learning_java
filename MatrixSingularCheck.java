import java.util.Scanner;

public class MatrixSingularCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n (size of square matrix): ");
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        System.out.println("Enter matrix elements row by row:");
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j] = sc.nextInt();
            }
        }
        double det = determinant(mat, n);
        System.out.println("Determinant = " + det);
        if (Math.abs(det) < 1e-9) System.out.println("Matrix is SINGULAR");
        else System.out.println("Matrix is NON-SINGULAR");
        sc.close();
    }

    // Recursive determinant (works for small n)
    static double determinant(int[][] a, int n) {
        if (n == 1) return a[0][0];
        if (n == 2) return a[0][0]*a[1][1] - a[0][1]*a[1][0];

        double det = 0;
        for (int col = 0; col < n; col++) {
            int[][] sub = getSubmatrix(a, 0, col, n);
            det += (col % 2 == 0 ? 1 : -1) * a[0][col] * determinant(sub, n-1);
        }
        return det;
    }

    static int[][] getSubmatrix(int[][] a, int skipRow, int skipCol, int n) {
        int[][] sub = new int[n-1][n-1];
        int r = 0;
        for (int i=0;i<n;i++){
            if (i == skipRow) continue;
            int c = 0;
            for (int j=0;j<n;j++){
                if (j == skipCol) continue;
                sub[r][c++] = a[i][j];
            }
            r++;
        }
        return sub;
    }
}
