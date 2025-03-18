/*
Create a class Bill with below attributes:

billNo- int
name - String
typeOfConnection - String
billAmount - double
status – boolean

where billNo is the bill number, name is the name of the customer, typeOfConnection is the type of the connection
(prepaid, postpaid), billAmount is the bill amount and status is whether the bill is paid or not (if paid then value is TRUE
else value is FALSE).

The above attributes should be private, write getters, setters and parameterized constructor as required.

Create class Solution with main method.
Implement two static methods - findBillWithMaxBillAmountBasedOnStatus and getCountWithTypeOfConnection in Solution class.

findBillWithMaxBillAmountBasedOnStatus method:
-----------------------------------------------------
This method will take an array of Bill objects and a boolean parameter as parameters.
The method will return bill object array in ascending order of their bill number from the array of Bill objects whose bill
amount is maximum in the array with the status attribute that matches with the input parameter.

If no Bill with the given status is present in the array of Bill objects, then the method should return null.

getCountWithTypeOfConnection method:
-----------------------------------------------------
This method will take two input parameters - array of Bill objects and string parameter ( for type of connection).
The method will return the count of bills from array of bill objects for the given type of connection.
If no bill with the given type of connection is present in the array of bill objects, then the method should return 0.


Note :

Two bill object can have the same bill amount.
All the searches should be case insensitive.

The above mentioned static methods should be called from the main method.

For findBillWithMaxBillAmountBasedOnStatus method - The main method should print the billNo followed by # and name from the
returned Bill object array if the returned value is not null.

If the returned value is null then it should print "There are no bill with the given status".

For getCountWithTypeOfConnection method - The main method should print the count of bills as it is, if the returned value is
greater than 0,  otherwise it should print "There are no bills with given type of connection".

Before calling these static methods in main, use Scanner to read the number of object and objects to read the values of Bill
objects referring attributes in the above mentioned attribute sequence.

Next, read the value for status and typeOfConnection.


Consider below sample input and output:
Input:

4
111
Aman Mittal
Prepaid
914.25
true
222
Rekha Kumar
Prepaid
1425.75
false
333
Samyra Gupta
Prepaid
1305.00
true
444
Mohit Saxena
Postpaid
1300.50
false
false
Prepaid

Output:

222#Rekha Kumar
3
*************************************************************************************
 */
package Java_IPA;

import java.util.Arrays;
import java.util.Scanner;

public class BillProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();sc.nextLine();
        Bill[] arr = new Bill[n];

        for (int i = 0; i < arr.length; i++) {
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            double d = sc.nextDouble();sc.nextLine();
            boolean e = sc.nextBoolean();sc.nextLine();

            arr[i] = new Bill(a,b,c,d,e);
        }
        boolean status = sc.nextBoolean();sc.nextLine();
        String type = sc.nextLine();

        Bill[] ans = findBillWithMaxBillAmountBasedOnStatus(arr,status);
        if (ans!=null) {
            for (int i=0;i< ans.length;i++) {
                System.out.println(ans[i].getBillNo() + "#" +ans[i].getName());
            }
        }
        else {
            System.out.println("There are no bill with the given status");
        }

        int res = getCountWithTypeOfConnection(arr,type);
        if (res > 0) {
            System.out.println(res);
        }
        else {
            System.out.println("There are no bills with given type of connection");
        }
    }
    public static int getCountWithTypeOfConnection(Bill[] arr,String type) {
        int count = 0;
        for (int i=0;i< arr.length;i++) {
            if (arr[i].getTypeOfConnection().equalsIgnoreCase(type)) {
                count++;
            }
        }
        return count;
    }
    public static Bill[] findBillWithMaxBillAmountBasedOnStatus(Bill[] arr,boolean status) {

        double maxBill = arr[0].getBillAmount();
        for (int i=0;i<arr.length;i++) {
            if (arr[i].getBillAmount() > maxBill) {
                maxBill = arr[i].getBillAmount();
            }
        }

        Bill[] bills = new Bill[0];
        for (int i=0;i<arr.length;i++) {
            if (arr[i].isStatus() == status && arr[i].getBillAmount()==maxBill) {
                bills = Arrays.copyOf(bills,bills.length+1);
                bills[bills.length-1] = arr[i];
            }
        }

        if (bills.length > 0) {
            for (int i=0;i<bills.length-1;i++) {
                for (int j=i+1;j<bills.length;j++) {
                    if (bills[i].getBillNo() > bills[j].getBillNo()) {
                        Bill b = arr[i];
                        arr[i] = arr[j];
                        arr[j] = b;
                    }
                }
            }
            return bills;
        }
        return null;
    }
}
class Bill {
    int billNo;
    String name;
    String typeOfConnection;
    double billAmount;
    boolean status;

    public int getBillNo() {
        return billNo;
    }

    public void setBillNo(int billNo) {
        this.billNo = billNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeOfConnection() {
        return typeOfConnection;
    }

    public void setTypeOfConnection(String typeOfConnection) {
        this.typeOfConnection = typeOfConnection;
    }

    public double getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Bill(int billNo, String name, String typeOfConnection, double billAmount, boolean status) {
        this.billNo = billNo;
        this.name = name;
        this.typeOfConnection = typeOfConnection;
        this.billAmount = billAmount;
        this.status = status;
    }
}
