package Examples;
import java.util.ArrayList;

class Banking {
    private String accountNumber;
    private String customerName;
    private double balance = 0;
    private double overdraftLimit = 500; // Overdraft limit
    private String pin;
    private ArrayList<String> transactionHistory = new ArrayList<>();
    private int failedAttempts = 0;
    private boolean isLocked = false;

    // Constructor
    Banking(String accountNumber, String customerName, String pin) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.pin = pin;
    }

    // Validate Pin
    boolean validatePin(String enteredPin) {
        if (isLocked) {
            System.out.println("Account is locked due to too many failed attempts.");
            return false;
        }

        if (!this.pin.equals(enteredPin)) {
            failedAttempts++;
            if (failedAttempts >= 3) {
                isLocked = true;
                System.out.println("Account locked after 3 failed attempts.");
            } else {
                System.out.println("Invalid PIN. Attempts left: " + (3 - failedAttempts));
            }
            return false;
        }

        failedAttempts = 0; // Reset failed attempts on successful login
        return true;
    }

    // Deposit amount
    void depositAmount(double amount) {
        this.balance += amount;
        transactionHistory.add("Deposited: " + amount);
        System.out.println(amount + " has been credited into your account");
    }

    // Withdraw amount
    void withdrawAmount(double amount) {
        if (this.balance + overdraftLimit < amount) {
            System.out.println("Insufficient funds, even with overdraft limit.");
        } else {
            this.balance -= amount;
            transactionHistory.add("Withdrew: " + amount);
            System.out.println(amount + " has been debited from your account");
        }
    }

    // Show balance
    void showBalance() {
        System.out.println("Your current balance is: " + this.balance);
    }

    // Show account details
    void showAccountDetails() {
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Customer Name: " + this.customerName);
        System.out.println("Balance: " + this.balance);
    }

    // Transaction history
    void showTransactionHistory() {
        System.out.println("Transaction History:");
        for (String transaction : transactionHistory) {
            System.out.println(transaction);
        }
    }

    // Interest calculation
    void calculateInterest(double interestRate, int years) {
        double interest = this.balance * (interestRate / 100) * years;
        this.balance += interest;
        transactionHistory.add("Interest of " + interest + " added.");
        System.out.println("Interest of " + interest + " has been added to your account.");
    }
}

public class BankingExample {
    public static void main(String[] args) {
        // Create a new banking account with account number, customer name, and PIN
        Banking bank = new Banking("123456789", "John Doe", "1234");

        // Authenticate with the correct PIN
        if (bank.validatePin("1234")) {
            // Perform transactions
            bank.depositAmount(1000.00);
            bank.showBalance();
            bank.withdrawAmount(400);
            bank.showBalance();
            bank.withdrawAmount(2000);
            bank.showBalance();

            // Show transaction history
            bank.showTransactionHistory();

            // Calculate interest
            bank.calculateInterest(5, 2); // 5% interest for 2 years
            bank.showBalance();

            // Show account details
            bank.showAccountDetails();
        }

        // Attempt with wrong PIN multiple times to lock the account
        bank.validatePin("1111");
        bank.validatePin("2222");
        bank.validatePin("3333"); // This will lock the account

        bank.validatePin("1234");
        bank.showBalance();
        bank.validatePin("1234");

    }
}
