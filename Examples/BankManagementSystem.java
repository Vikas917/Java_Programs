package Examples;

import java.util.*;

public class BankManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User[] users = new User[1];
        System.out.println("----------Welcome to the Bank Management System----------");
        while (true) {
            System.out.println("Enter your choice - \n(1) Create Account \n(2) Deposit Money \n(3) Withdraw Money \n(4) View Account \n(5) Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    users = createAccount();
                    break;
                case 2:
                    depositMoney(users);
                    break;
                case 3:
                    withdrawMoney(users);
                    break;
                case 4:
                    showAccountDetails(users);
                    break;
                case 5:
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid Choice. Please try again");
            }
        }
    }
    public static User[] createAccount() {
        Scanner sc = new Scanner(System.in);
        User[] user = new User[1];
        for (int j=0;j<1;j++) {
            System.out.println("Enter your SSNID - ");
            int a = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter your Name - ");
            String b = sc.nextLine();
            System.out.println("Enter your Email - ");
            String c = sc.nextLine();
            System.out.println("Enter your Address - ");
            String d = sc.nextLine();
            System.out.println("Enter your Contact Number -");
            int e = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter your Aadhar Card Number -");
            int f = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter your PANCard Number - ");
            String g= sc.nextLine();
            System.out.println("Enter your Account Number - ");
            int h = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter your initial deposit Amount -");
            double i = sc.nextDouble();

            user[j] = new User(a,b,c,d,e,f,g,h,i);
        }
        System.out.println("Account Created Successfully");
        return user;
    }

    public static void depositMoney(User[] user) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your account number : ");
        int accNum = sc.nextInt();
        for (User i : user) {
            if (i.getAccountNumber() == accNum) {
                System.out.println("Enter Deposit Money : ");
                double money = sc.nextDouble();
                i.setInitialAmount(i.getInitialAmount() + money);
                System.out.println("Your account balance is " + i.getInitialAmount());
            }
            else {
                System.out.println("Please enter correct Account Details");
            }
        }

    }

    public static void withdrawMoney(User[] user) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your account number : ");
        int accNum = sc.nextInt();
        for (User i : user) {
            if (i.getAccountNumber() == accNum) {
                System.out.println("Enter Withdrawal Money : ");
                double money = sc.nextDouble();
                i.setInitialAmount(i.getInitialAmount() - money);
                System.out.println("Your account balance is " + i.getInitialAmount());
            }
            else {
                System.out.println("Please enter correct Account Details");
            }
        }
    }

    public static void showAccountDetails(User[] user) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your account number : ");
        int accNum = sc.nextInt();
        for (User i : user) {
            if (i.getAccountNumber() == accNum) {
                System.out.println("Your SSNID is " + i.getSsnid());
                System.out.println("Your Name is " + i.getName());
                System.out.println("Your Email is " + i.getEmail());
                System.out.println("Your Address is " + i.getAddress());
                System.out.println("Your Contact Number is " + i.getContactNumber());
                System.out.println("Your AadharCard Number is " + i.getAadharCard());
                System.out.println("Your PANCard Number is " + i.getPanCard());
                System.out.println("Your Account Number is " + i.getAccountNumber());
                System.out.println("Your Account Balance is " + i.getInitialAmount());
            }
            else {
                System.out.println("Please enter correct Account Details");
            }
        }
    }
}

class User {
    int accountNumber, aadharCard, ssnid, contactNumber;
    String name, panCard, address, email;
    double initialAmount;

    public User(int ssnid, String name, String email, String address, int contactNumber, int aadharCard, String panCard, int accountNumber, double initialAmount) {
        this.ssnid = ssnid;
        this.name = name;
        this.accountNumber = accountNumber;
        this.aadharCard = aadharCard;
        this.contactNumber = contactNumber;
        this.panCard = panCard;
        this.address = address;
        this.email = email;
        this.initialAmount = initialAmount;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAadharCard() {
        return aadharCard;
    }

    public void setAadharCard(int aadharCard) {
        this.aadharCard = aadharCard;
    }

    public int getSsnid() {
        return ssnid;
    }

    public void setSsnid(int ssnid) {
        this.ssnid = ssnid;
    }

    public int getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPanCard() {
        return panCard;
    }

    public void setPanCard(String panCard) {
        this.panCard = panCard;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getInitialAmount() {
        return initialAmount;
    }

    public void setInitialAmount(double initialAmount) {
        this.initialAmount = initialAmount;
    }
}
