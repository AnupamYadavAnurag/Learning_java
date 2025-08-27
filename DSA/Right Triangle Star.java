public class RightTrianglePattern {
    public static void main(String[] args) {
        int rows = 5;  // You can change this to generate more or fewer rows
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
