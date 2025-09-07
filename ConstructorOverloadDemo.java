class Student {
    String name;
    int roll;

    // No-arg constructor
    Student() {
        name = "Unknown";
        roll = 0;
    }

    // Parameterized constructor
    Student(String n, int r) {
        name = n;
        roll = r;
    }

    void display() {
        System.out.println("Name: " + name + ", Roll: " + roll);
    }
}

public class ConstructorOverloadDemo {
    public static void main(String[] args) {
        Student s1 = new Student();                // calls no-arg constructor
        Student s2 = new Student("Anupam", 101);   // calls parameterized constructor

        s1.display();
        s2.display();
    }
}
