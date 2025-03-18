/*
Create a class called BankAccount with the following attributes:

accountNumber (String)
accountHolderName (String)
balance (double)

Write getters, setters, and a parameterized constructor for the class.

Create a static method transferFunds in a separate class called BankUtils. The method should take four parameters:

fromAccount (BankAccount)
toAccount (BankAccount)
amount (double)
transactionCode (String)

The method should transfer the specified amount from the fromAccount to the toAccount,
and return a Transaction object containing the transactionCode, the amount
transferred, and the timestamp of the transaction. If the fromAccount has insufficient
balance, the method should throw an InsufficientBalanceException with an appropriate error message.

Create a class called Transaction with the following attributes:

transactionCode (String)
amount (double)
timestamp (String)

Write getters and a parameterized constructor for the class.

Create an InsufficientBalanceException class that extends the Exception class.
The exception should have a constructor that takes a message as a parameter.

In the main method, create two BankAccount objects, transfer some funds between
them using the transferFunds method, and print the transaction details to the console. Handle any exceptions.

Sample Input:

Account 1:
Account Number: 12345
Account Holder Name: John
Balance: 5000.0

Account 2:
Account Number: 67890
Account Holder Name: Jane
Balance: 10000.0

Transfer Details:
Amount: 2000.0
Transaction Code: T0001

Sample Output:

Before Transfer:
Account 1: John - 12345 - 5000.0
Account 2: Jane - 67890 - 10000.0

After Transfer:
Account 1: John - 12345 - 3000.0
Account 2: Jane - 67890 - 12000.0

Transaction Details:
Transaction Code: T0001
Amount Transferred: 2000.0
Timestamp: 2023-04-01 10:30:00
 */
package Java_IPA;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class BankingProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccounts[] arr = new BankAccounts[2];

        for (int i=0;i< arr.length;i++) {
            System.out.println("Account "+(i+1)+":");
            System.out.print("Account Number: ");
            String a = sc.nextLine();
            System.out.print("Account Holder Name: ");
            String b = sc.nextLine();
            System.out.print("Balance: ");
            double c = sc.nextDouble();sc.nextLine();
            arr[i] = new BankAccounts(a,b,c);
            System.out.println();
        }

        System.out.println("Transfer Details:");
        System.out.print("Amount: ");
        double amount = sc.nextDouble();sc.nextLine();
        System.out.print("Transaction Code: ");
        String tran = sc.nextLine();
        System.out.println();

        BankUtils bankUtils = new BankUtils(arr[0],arr[1],amount,tran);
        System.out.println("Before Transfer:");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println("Account "+(i+1)+": "+arr[i].getAccountHolderName()+" - "+arr[i].getAccountNumber()+" - "+arr[i].getBalance());
        }

        double[] ans = transferFunds(bankUtils);
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String fTimeStamp = sdf.format(timestamp);

        Transaction t = new Transaction(tran,amount,fTimeStamp);
        System.out.println();

        if(ans!=null)
        {
            System.out.println("After Transfer:");
            for (int i = 0; i < ans.length; i++)
            {
                System.out.println("Account "+(i+1)+": "+arr[i].getAccountHolderName()+" - "+arr[i].getAccountNumber()+" - "+ans[i]);
            }
            System.out.println();
            System.out.println("Transaction Details:");
            System.out.println("Transaction Code: "+t.getTransactionCode());
            System.out.println("Amount Transferred: "+t.getAmount());
            System.out.println("Timestamp: "+t.getTimestamp());
        }
        else
        {
            System.out.println("Insufficient Balance in Account 1");
            System.out.println("Transaction Code: "+t.getTransactionCode());
            System.out.println("Timestamp: "+t.getTimestamp());
        }

    }

    public static double[] transferFunds(BankUtils arr) {
        if (arr.fromAccount.getBalance() > arr.getAmount()) {
            double amount1 = arr.fromAccount.getBalance() - arr.getAmount();
            double amount2 = arr.toAccount.getBalance() - arr.getAmount();
            double[] amount = {amount1,amount2};
            return amount;
        }
        return null;
    }
}
class BankAccounts {
    String accountNumber;
    String accountHolderName;
    double balance;

    public BankAccounts(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
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
}

class BankUtils {
    BankAccounts fromAccount;
    BankAccounts toAccount;
    double amount;
    String transactionCode;

    public BankAccounts getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(BankAccounts fromAccount) {
        this.fromAccount = fromAccount;
    }

    public BankAccounts getToAccount() {
        return toAccount;
    }

    public void setToAccount(BankAccounts toAccount) {
        this.toAccount = toAccount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getTransactionCode() {
        return transactionCode;
    }

    public void setTransactionCode(String transactionCode) {
        this.transactionCode = transactionCode;
    }

    public BankUtils(BankAccounts fromAccount, BankAccounts toAccount, double amount, String transactionCode) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.amount = amount;
        this.transactionCode = transactionCode;
    }
}

class Transaction {
    String transactionCode;
    double amount;
    String timestamp;

    public String getTransactionCode() {
        return transactionCode;
    }

    public void setTransactionCode(String transactionCode) {
        this.transactionCode = transactionCode;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public Transaction(String transactionCode, double amount, String timestamp) {
        this.transactionCode = transactionCode;
        this.amount = amount;
        this.timestamp = timestamp;
    }
}