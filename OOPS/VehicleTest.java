class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car starts with a push button.");
    }
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike starts with a self-start or kick.");
    }
}

class ElectricScooter extends Vehicle {
    @Override
    void start() {
        System.out.println("Electric scooter starts by pressing the power button.");
    }
}

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle v;

        v = new Car(); 
        v.start();

        v = new Bike();
        v.start();

        v = new ElectricScooter();
        v.start();
    }
}
