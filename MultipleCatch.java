try {
    int[] arr = {1, 2, 3};
    System.out.println(arr[5]);
} catch (ArithmeticException e) {
    System.out.println("Arithmetic Error!");
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Array Index Error!");
}
