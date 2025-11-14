class MathOps {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        MathOps m = new MathOps();
        System.out.println(m.add(2, 3));       // 5
        System.out.println(m.add(2, 3, 4));   // 9
    }
}
