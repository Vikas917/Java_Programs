/*
Create a class BankAccount with the following attributes:

accountNumber - int
accountHolderName - String
balance - double

Write getters, setters and parameterized constructor in the above mentioned attribute sequence as required.

Create a class Solution with the main method.

Implement two static methods - withdraw and deposit in Solution class.

withdraw method:
------------------------------------------
This method will take two input parameters - array of BankAccount objects and the account number (int) from which withdrawal
should be done.
The method will check if the account number is present in the array of BankAccount objects.
If present, the method will then check if the balance is sufficient to withdraw the requested amount (double). If yes, it will
deduct the amount from the account balance and return the updated balance.
If the account number is not present or the balance is not sufficient, the method should return -1.

deposit method:
--------------------------------------------
This method will take two input parameters - array of BankAccount objects and the account number (int) in which deposit should
be done.
The method will check if the account number is present in the array of BankAccount objects.
If present, it will add the deposit amount (double) to the account balance and return the updated balance.
If the account number is not present, the method should return -1.

These above mentioned static methods should be called from the main method.

For withdraw method - The main method should print the updated balance if the returned value is greater than or equal to 0, or
it should print "Sorry - Insufficient balance" if the returned value is -1, or it should print "Sorry - Account not found" if
the returned value is -2.

For deposit method - The main method should print the updated balance if the returned value is greater than or equal to 0, or
it should print "Sorry - Account not found" if the returned value is -1.

Before calling these static methods in main, a parameterized constructor in the above mentioned attribute sequence as required.

Input
------------------------
1001
Alice
5000.0
1002
Bob
10000.0
1003
Charlie
15000.0
1002
5000.0
1001
10000.0

Output
---------------------------
5000.0
15000.0
 */
package Java_IPA;
/*
import java.util.Scanner;

public class BankAccountProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount[] arr = new BankAccount[3];

        for (int i = 0; i < 3; i++) {
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            double c = sc.nextDouble();sc.nextLine();

            arr[i] = new BankAccount(a,b,c);
        }
        int WaccNo = sc.nextInt();
        sc.nextLine();
        double ans = withdrawAmount(arr,WaccNo);
        if (ans >= 0) {
            System.out.println(ans);
        }
        else if (ans == -1) {
            System.out.println("Sorry - Insufficient Balance");
        }
        else {
            System.out.println("Sorry - Account not found");
        }

        int DaccNo = sc.nextInt();sc.nextLine();
        double res = depositAmount(arr,DaccNo);
        if (res > 0){
            System.out.println(res);
        }
        else {
            System.out.println("Sorry - Account not found");
        }

    }
    public static double withdrawAmount(BankAccount[] arr, int accNo) {
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<arr.length;i++) {
            if (arr[i].getAccountNumber() == accNo) {
                double withdrawAmount = sc.nextDouble();sc.nextLine();
                if (withdrawAmount <= arr[i].getBalance()) {
                    double updateBalance = arr[i].getBalance() - withdrawAmount;
                    return updateBalance;
                }
                else {
                    return -1;
                }
            }
        }
        return -2;
    }

    public static double depositAmount(BankAccount[] arr, int accNo) {
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<arr.length;i++) {
            if (arr[i].getAccountNumber() == accNo) {
                double depositAmount = sc.nextDouble();
                sc.nextLine();
                depositAmount = arr[i].getBalance() + depositAmount;
                return depositAmount;
                }
        }
        return -1;
    }

}
class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
}
*/

class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    // Parameterized constructor
    public BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Getters
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    // Setters
    public void setBalance(double balance) {
        this.balance = balance;
    }
}

class Solution {

    // Method to withdraw amount
    public static double withdraw(BankAccount[] accounts, int accountNumber, double amount) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                if (account.getBalance() >= amount) {
                    account.setBalance(account.getBalance() - amount);
                    return account.getBalance();
                } else {
                    return -1;  // Insufficient balance
                }
            }
        }
        return -2;  // Account not found
    }

    // Method to deposit amount
    public static double deposit(BankAccount[] accounts, int accountNumber, double amount) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                account.setBalance(account.getBalance() + amount);
                return account.getBalance();
            }
        }
        return -1;  // Account not found
    }

    public static void main(String[] args) {
        // Create BankAccount objects
        BankAccount[] accounts = new BankAccount[3];
        accounts[0] = new BankAccount(1001, "Alice", 5000.0);
        accounts[1] = new BankAccount(1002, "Bob", 10000.0);
        accounts[2] = new BankAccount(1003, "Charlie", 15000.0);

        // Perform a deposit of 5000 to Bob's account (1002)
        double depositResult = deposit(accounts, 1002, 5000.0);
        if (depositResult >= 0) {
            System.out.println(depositResult);  // Expected 15000.0 after deposit
        } else {
            System.out.println("Sorry - Account not found");
        }

        // Perform a withdrawal of 10000 from Alice's account (1001)
        double withdrawResult = withdraw(accounts, 1001, 10000.0);
        if (withdrawResult >= 0) {
            System.out.println(withdrawResult);  // Expected 5000.0 after withdrawal
        } else if (withdrawResult == -1) {
            System.out.println("Sorry - Insufficient balance");
        } else if (withdrawResult == -2) {
            System.out.println("Sorry - Account not found");
        }
    }
}

