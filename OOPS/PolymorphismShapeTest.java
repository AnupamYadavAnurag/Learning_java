class Shape {
    void area() {
        System.out.println("Calculating area...");
    }
}

class Circle extends Shape {
    @Override
    void area() {
        System.out.println("Area of Circle = πr²");
    }
}

class Rectangle extends Shape {
    @Override
    void area() {
        System.out.println("Area of Rectangle = length × breadth");
    }
}

class Triangle extends Shape {
    @Override
    void area() {
        System.out.println("Area of Triangle = 1/2 × base × height");
    }
}

public class PolymorphismShapeTest {
    public static void main(String[] args) {
        Shape s;

        s = new Circle();
        s.area();

        s = new Rectangle();
        s.area();

        s = new Triangle();
        s.area();
    }
}
