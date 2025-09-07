// First Interface
interface A {
    void methodA();
}

// Second Interface extends First Interface
interface B extends A {
    void methodB();
}

// Class implementing Interface B (automatically A bhi implement ho jayega)
class MyClass implements B {
    public void methodA() {
        System.out.println("This is Method A");
    }

    public void methodB() {
        System.out.println("This is Method B");
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.methodA(); // from Interface A
        obj.methodB(); // from Interface B
    }
}
