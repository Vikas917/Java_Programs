/*
Find total interest of an amount.

Create a class Account with following attributes :
id - int
balance - double
interestRate - double

Take another integer as number of year.
After that calculate total interest using formula:

Percentage = interestRate * 100 / time
Total Interest = Percentage + interestRate
 */
package Java_IPA;

import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        Account acc = new Account(a,b,c);

        int year = sc.nextInt();

        double in = calculateTotalInterest(acc,year);
        System.out.println(in);
    }
    public static double calculateTotalInterest(Account acc,int year) {
        double percentage = ((acc.getInterestRate() * 100) / year);

        return percentage + acc.getInterestRate();
    }
}
class Account {
    int id;
    double balance;
    double interestRate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public Account(int id, double balance, double interestRate) {
        this.id = id;
        this.balance = balance;
        this.interestRate = interestRate;
    }
}