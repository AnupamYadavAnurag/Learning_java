public class AdjacentSwap {
    public static void main(String[] args) {
        int arr[] = {5, 10, 15, 20, 25};

        // Swapping adjacent elements
        for (int i = 0; i < arr.length - 1; i++) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }

        // Print final array
        System.out.println("After Adjacent Swaps:");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
