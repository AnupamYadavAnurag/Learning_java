import java.util.Scanner;
public class StringSorting {   // no space in class name
  public static void main(String[] args) {
    String temp;
    Scanner s = new Scanner(System.in);
    System.out.print("Enter number of names you want to enter:");
    int n = s.nextInt();              // reads integer but leaves newline
    String names[] = new String[n];   // create array to hold names
    System.out.println("Enter all the names:");
    s.nextLine();                      // <-- ADD THIS to consume leftover newline
    for(int i = 0; i < n; i++) {
      names[i] = s.nextLine();        // read each name (full line)
    }
    // bubble sort: compare and swap adjacent elements
    for (int i = 0; i < n-1; i++) {
      for (int j = 0; j < n-1-i; j++) {
        if (names[j].compareTo(names[j+1]) > 0) { // lexicographic compare
          temp = names[j];
          names[j] = names[j+1];
          names[j+1] = temp;
        }
      }
    }
    System.out.print("Names in Sorted Order:");
    for (int i = 0; i < n ; i++) {
      System.out.print(names[i] + ","); // better: avoid trailing comma
    }
    s.close();
  }
}