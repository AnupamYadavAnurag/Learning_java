interface Printer {
    void print();
}

interface ScannerDevice {
    void scan();
}

// Class implements multiple interfaces
class MultiFunctionMachine implements Printer, ScannerDevice {
    public void print() {
        System.out.println("Printing document...");
    }
    public void scan() {
        System.out.println("Scanning document...");
    }
}

public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        MultiFunctionMachine m = new MultiFunctionMachine();
        m.print();
        m.scan();
    }
}
