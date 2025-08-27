import java.util.Scanner;

public class RectangleStarPattern {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Ask user for the number of rows
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        
        // Ask user for the number of columns
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();
        
        // Generate the rectangle pattern using nested loops
        for (int i = 0; i < rows; i++) {           // Outer loop for rows
            for (int j = 0; j < cols; j++) {       // Inner loop for columns
                System.out.print("*");             // Print star without a newline
            }
            System.out.println();                   // Move to the next line after each row
        }

        // Close the scanner
        scanner.close();
    }
}
