// Parent Class
class Animal {
    void eat() {
        System.out.println("Animals eat food.");
    }
}

// Child Class 1
class Mammal extends Animal {
    void warmBlooded() {
        System.out.println("Mammals are warm-blooded.");
    }
}

// Child Class 2
class Dog extends Mammal {
    void bark() {
        System.out.println("Dog barks.");
    }
}

// Main Class
public class InheritanceExample2 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();         // from Animal
        d.warmBlooded(); // from Mammal
        d.bark();        // own method
    }
}
