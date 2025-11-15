// Real-World Encapsulation Program: Car

class Car {
    // Private data (hidden)
    private int speed;

    // Getter for speed
    public int getSpeed() {
        return speed;
    }

    // Method to increase speed
    public void accelerate(int value) {
        if (value > 0) {
            speed += value;
            System.out.println("Accelerated by " + value + " km/h");
        } else {
            System.out.println("Invalid acceleration!");
        }
    }

    // Method to decrease speed
    public void brake(int value) {
        if (value > 0 && value <= speed) {
            speed -= value;
            System.out.println("Braked by " + value + " km/h");
        } else {
            System.out.println("Invalid brake value!");
        }
    }
}

public class EncapsulationCarDemo {
    public static void main(String[] args) {

        Car car = new Car();

        car.accelerate(30);   // increase speed
        car.accelerate(20);   // increase more
        car.brake(10);        // decrease speed

        System.out.println("Current Speed: " + car.getSpeed() + " km/h");
    }
}
