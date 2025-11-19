
// Parent Class
class Vehicle {
    void move() {
        System.out.println("Vehicle is moving.");
    }
}

// Child Class 1
class Bike extends Vehicle {
    void wheels() {
        System.out.println("Bike has 2 wheels.");
    }
}

// Child Class 2
class Car2 extends Vehicle {
    void wheels() {
        System.out.println("Car has 4 wheels.");
    }
}

// Main Class
public class InheritanceExample3 {
    public static void main(String[] args) {
        Bike b = new Bike();
        Car2 c = new Car2();

        b.move();
        b.wheels();

        c.move();
        c.wheels();
    }
}
