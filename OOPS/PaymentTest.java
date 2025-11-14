class Payment {
    void pay() {
        System.out.println("Payment in general.");
    }
}

class UPI extends Payment {
    @Override
    void pay() {
        System.out.println("Payment through UPI (QR scan).");
    }
}

class Card extends Payment {
    @Override
    void pay() {
        System.out.println("Payment through Debit/Credit card.");
    }
}

class Wallet extends Payment {
    @Override
    void pay() {
        System.out.println("Payment through Wallet balance.");
    }
}

public class PaymentTest {
    public static void main(String[] args) {
        Payment p;

        p = new UPI();
        p.pay();

        p = new Card();
        p.pay();

        p = new Wallet();
        p.pay();
    }
}
