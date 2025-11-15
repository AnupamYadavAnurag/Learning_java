// Real-World Encapsulation Program: Bank Account

class BankAccount {
    // Private data members (hidden from outside)
    private String accountHolder;
    private double balance;

    // Constructor
    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Getter for balance (read-only)
    public double getBalance() {
        return balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }
}

public class BankDemo {
    public static void main(String[] args) {

        BankAccount account = new BankAccount("Anupam Yadav", 5000);

        // Using methods to access and change data
        account.deposit(2000);        // deposit
        account.withdraw(1500);       // withdraw

        System.out.println("Final Balance: " + account.getBalance());
    }
}
