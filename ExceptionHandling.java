public class ArrayDivision {
    public static void main(String[] args) {
        int[] numerator = {10, 20, 30, 40};
        int[] denominator = {2, 0, 5, 10};

        for (int i = 0; i < numerator.length; i++) {
            try {
                int result = numerator[i] / denominator[i];
                System.out.println("Result[" + i + "] = " + result);
            } 
            catch (ArithmeticException e) {
                System.out.println("Error: Division by zero at index " + i);
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Array index out of range!");
            }
        }

        System.out.println("Program completed successfully.");
    }
}
