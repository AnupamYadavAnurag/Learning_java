class Person {
    void behave() {
        System.out.println("Person behaves normally.");
    }
}

class Student extends Person {
    @Override
    void behave() {
        System.out.println("Student behaves by studying.");
    }
}

class Teacher extends Person {
    @Override
    void behave() {
        System.out.println("Teacher behaves by teaching.");
    }
}

class Friend extends Person {
    @Override
    void behave() {
        System.out.println("Friend behaves by joking and chatting.");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Person p;

        p = new Student();  // Polymorphism
        p.behave();

        p = new Teacher();  // Polymorphism
        p.behave();

        p = new Friend();   // Polymorphism
        p.behave();
    }
}
