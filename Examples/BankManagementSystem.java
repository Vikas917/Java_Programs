package Examples;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BankManagementSystem {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        User[] users = new User[1];

        while (true) {
            System.out.println("\n------------Welcome to the Bank Management System------------\n");
            System.out.println("Enter Your Choice - \n(1) Create Account \n(2) Deposit Money \n(3) Withdraw Money \n(4) Check Balance \n(5) Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    users = CreateAccount(sc);
                    break;
                case 2:
                    depositMoney(users, sc);
                    break;
                case 3:
                    withdrawMoney(users, sc);
                    break;
                case 4:
                    checkBalance(users, sc);
                    break;
                case 5:
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }

    public static User[] CreateAccount(Scanner sc) {
        User[] users = new User[1];

        for (int i = 0; i < 1; i++) {
            int a;
            while (true) {
                System.out.println("Enter your 7-digit SSNID:");
                if (sc.hasNextInt()) {
                    a = sc.nextInt();
                    if (String.valueOf(a).length() == 7) {
                        break;
                    }
                }
                System.out.println("Invalid SSN. Please enter a valid 7-digit number.");
                sc.nextLine();
            }

            System.out.println("Enter your Name (Max 50 chars): ");
            sc.nextLine(); // Clear buffer
            String b = sc.nextLine();
            if (b.length() > 50) {
                b = b.substring(0, 50);
            }

            String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
            Pattern p = Pattern.compile(emailRegex);
            String c;
            while (true) {
                System.out.println("Enter your Email: ");
                c = sc.nextLine();
                Matcher m = p.matcher(c);
                if (m.matches()) {
                    System.out.println("Valid Email Address");
                    break;
                } else {
                    System.out.println("Invalid Email Address");
                }
            }

            System.out.println("Enter your Address (Max 100 chars): ");
            String d = sc.nextLine();
            if (d.length() > 100) {
                d = d.substring(0, 100);
            }

            int e;
            while (true) {
                System.out.println("Enter your 10-digit Contact Number: ");
                if (sc.hasNextInt()) {
                    e = sc.nextInt();
                    if (String.valueOf(e).length() == 10) {
                        break;
                    }
                }
                System.out.println("Invalid Contact Number.");
                sc.nextLine();
            }

            long f;
            while (true) {
                System.out.println("Enter your 12-digit Aadhar Card Number: ");
                if (sc.hasNextLong()) {
                    f = sc.nextLong();
                    if (String.valueOf(f).length() == 12) {
                        break;
                    }
                }
                System.out.println("Invalid Aadhar Card Number.");
                sc.nextLine();
            }

            String regex = "^[A-Z]{5}[0-9]{4}[A-Z]$";
            Pattern pattern = Pattern.compile(regex);
            String g;
            while (true) {
                System.out.println("Enter your PAN Card details: ");
                sc.nextLine();
                g = sc.nextLine();
                Matcher matcher = pattern.matcher(g);
                if (matcher.matches()) {
                    System.out.println("Valid PAN Card Number.");
                    break;
                } else {
                    System.out.println("Invalid PAN Card Number.");
                }
            }

            long h;
            while (true) {
                System.out.println("Enter your Account Number (Max 20 digits): ");
                if (sc.hasNextLong()) {
                    h = sc.nextLong();
                    if (String.valueOf(h).length() <= 20) {
                        break;
                    }
                }
                System.out.println("Invalid Account Number.");
                sc.nextLine();
            }

            double j;
            while (true) {
                System.out.println("Enter your Initial Deposit Amount: ");
                if (sc.hasNextDouble()) {
                    j = sc.nextDouble();
                    sc.nextLine();
                    break;
                } else {
                    System.out.println("Invalid Amount");
                    sc.nextLine();
                }
            }

            users[i] = new User(String.valueOf(a), b, c, d, String.valueOf(e), String.valueOf(f), g, String.valueOf(h), j);
            System.out.println("Account created Successfully");
        }

        return users;
    }

    public static void depositMoney(User[] users, Scanner sc) {
        System.out.println("Enter your Account Number:");
        String AccNumber = sc.next();

        boolean accountFound = false;
        for (User i : users) {
            if (i.getAccountNumber().equals(AccNumber)) {
                accountFound = true;
                System.out.println("Enter the deposit amount: ");
                double Money = sc.nextDouble();
                i.setInitialDepositAmount(Money + i.getInitialDepositAmount());
                System.out.println("Current Balance: " + i.getInitialDepositAmount());
                break;
            }
        }
        if (!accountFound) {
            System.out.println("Please Enter Correct Account Details");
        }
    }

    public static void withdrawMoney(User[] users, Scanner sc) {
        System.out.println("Enter your Account Number:");
        String AccNumber = sc.next();

        boolean accountFound = false;
        for (User i : users) {
            if (i.getAccountNumber().equals(AccNumber)) {
                accountFound = true;
                if (i.getInitialDepositAmount() < 500) {
                    System.out.println("Minimum balance should be 500");
                } else {
                    System.out.println("Enter the withdrawal amount: ");
                    double Money = sc.nextDouble();
                    if (Money > i.getInitialDepositAmount()) {
                        System.out.println("Insufficient Balance");
                    } else {
                        i.setInitialDepositAmount(i.getInitialDepositAmount() - Money);
                        System.out.println("Current Balance: " + i.getInitialDepositAmount());
                    }
                }
                break;
            }
        }
        if (!accountFound) {
            System.out.println("Please Enter Correct Account Details");
        }
    }

    public static void checkBalance(User[] users, Scanner sc) {
        System.out.println("Enter your Account Number:");
        String AccNumber = sc.next();

        boolean accountFound = false;
        for (User i : users) {
            if (i.getAccountNumber().equals(AccNumber)) {
                accountFound = true;
                System.out.println("Current Balance: " + i.getInitialDepositAmount());
                break;
            }
        }
        if (!accountFound) {
            System.out.println("Please Enter Correct Account Details");
        }
    }
}

class User {
    String SSNID, Name, Email, Address, PANCard, ContactNumber, AccountNumber, AadharCard;
    double InitialDepositAmount;

    public User(String SSNID, String Name, String Email, String Address, String ContactNumber, String AadharCard, String PANCard, String AccountNumber, double InitialDepositAmount) {
        this.SSNID = SSNID;
        this.Name = Name;
        this.Email = Email;
        this.Address = Address;
        this.ContactNumber = ContactNumber;
        this.AadharCard = AadharCard;
        this.PANCard = PANCard;
        this.AccountNumber = AccountNumber;
        this.InitialDepositAmount = InitialDepositAmount;
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public double getInitialDepositAmount() {
        return InitialDepositAmount;
    }

    public void setInitialDepositAmount(double InitialDepositAmount) {
        this.InitialDepositAmount = InitialDepositAmount;
    }
}
