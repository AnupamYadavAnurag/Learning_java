class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class ATMExample {
    public static void main(String[] args) {
        double balance = 2000.0;
        double withdraw = 3000.0;

        try {
            if (withdraw > balance) {
                throw new InsufficientFundsException("Insufficient funds! Withdrawal denied.");
            }
            balance -= withdraw;
            System.out.println("Withdrawal successful. Remaining balance: ₹" + balance);
        } 
        catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        } 
        finally {
            System.out.println("Thank you for using the ATM.");
        }
    }
}
