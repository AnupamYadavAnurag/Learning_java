// Parent Class
class Car {
    void fuelType() {
        System.out.println("Car runs on fuel.");
    }
}

// Child Class
class ElectricCar extends Car {
    void battery() {
        System.out.println("ElectricCar uses battery.");
    }
}

// Main Class
public class InheritanceExample1 {
    public static void main(String[] args) {
        ElectricCar obj = new ElectricCar();
        obj.fuelType();   // inherited method
        obj.battery();
    }
}
