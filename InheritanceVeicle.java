// Parent Class
class Vehicle {
    void run() {
        System.out.println("Vehicle is running...");
    }
}

// Child Class (inherits Vehicle)
class Car extends Vehicle {
    void musicSystem() {
        System.out.println("Car has a music system");
    }
}

// Another Child Class
class Bike extends Vehicle {
    void helmetRequired() {
        System.out.println("Bike requires helmet");
    }
}

public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        c.run();          // Inherited from Vehicle
        c.musicSystem();  // Car's own method

        Bike b = new Bike();
        b.run();          // Inherited from Vehicle
        b.helmetRequired(); // Bike's own method
    }
}
