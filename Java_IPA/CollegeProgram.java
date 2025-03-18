/*
Create a class College with the below attributes.

 id-int
 name -String
 contactNo-int
 address-String
 pinCode-int



Write the getters and setters and parametrized constructor in the above  mentioned sequence as required.

Create the class Solution with the main method.

Implement the two static methods:

 1.findCollegeWithMaximumPincode

 2.searchCollegeByAddress



findCollegeWithMaximumPincode method:

   Create the Static method in the Solution Class. This method will take array of the College objects and return the
College object having maximum pincode if found else return null if not found.

   for this method ,main method will print College object with maximum pincode if the returned value is not null.if the returned
value is null , then the main method will print "No college found with mentioned attribute".

searchCollegeByAddress method:

   Create the Static method in the Solution Class.

This method will take array of College objects as input and address as  input and return College object having the mentioned address
if found else return null if not found.

   for this method main method will print College object details as it is ,if the returned value is not null.if the returned value is null then ,
main method will print "No college found with mentioned attribute".




***************************************************************************

input 1:

4
109
ACT
2500256
mumbai
695001
107
MCE
2500254
malapuram
612354
113
CTE
2500252
chennai
623145
102
SCT
2500255
AP
523641
AP



OUTPUT1:

id-109

name-ACT

contactNo-2500256

address-mumbai

pincode-695001

id-102

name-SCT

contactNo-2500255

address-AP

pincode-523641







INPUT2:

4
111
MJT
2500251
Calicut
401235
105
MET
2500256
kochi
668745
115
IIT
2500262
banglore
569874
110
ACT
2500263
delhi
687945
delhi


output2:

id-110

name-ACT

contactNo-2500263

address-delhi

pincode-687945

id-110

name-ACT

contactNo-2500263

address-delhi

pincode-687945
 */
package Java_IPA;

import java.util.Scanner;

public class CollegeProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();sc.nextLine();
        College[] arr = new College[n];

        for (int i = 0; i < arr.length; i++) {
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();
            sc.nextLine();
            String d = sc.nextLine();
            int e = sc.nextInt();
            sc.nextLine();

            arr[i] = new College(a,b,c,d,e);
        }
        String address = sc.nextLine();

        College ans = findCollegeWithMaximumPincode(arr);
        if (ans!=null) {
            System.out.println("id - " + ans.getId());
            System.out.println("name - " + ans.getName());
            System.out.println("ContactNo - " + ans.getContactNo());
            System.out.println("address - " + ans.getAddress());
            System.out.println("pinCode - " + ans.getPinCode());
        }
        else {
            System.out.println("No college found with mentioned attribute");
        }

        College res = searchCollegeByAddress(arr,address);
        if (res!=null) {
            System.out.println("id - " + res.getId());
            System.out.println("name - " + res.getName());
            System.out.println("ContactNo - " + res.getContactNo());
            System.out.println("address - " + res.getAddress());
            System.out.println("pinCode - " + res.getPinCode());
        }
        else {
            System.out.println("No college found with mentioned attribute");
        }
    }
    public static College findCollegeWithMaximumPincode(College[] arr) {
        int max = 0;
        for (int i=0;i< arr.length;i++) {
            if (arr[i].getPinCode()  > max) {
                max = arr[i].getPinCode();
            }
        }
        for (int i=0;i< arr.length;i++) {
            if (arr[i].getPinCode() ==  max) {
                return arr[i];
            }
        }
        return null;

        // In single for loop

//        College college = null;
//        int max = Integer.MIN_VALUE;
//        for (int i=0;i< arr.length;i++) {
//            if (arr[i].getPinCode()  > max) {
//                max = arr[i].getPinCode();
//                college = arr[i];
//            }
//        }
//        return college;
    }
    public static College searchCollegeByAddress(College[] arr,String address) {
        for (int i=0;i<arr.length;i++) {
            if(arr[i].getAddress().equalsIgnoreCase(address)) {
                return arr[i];
            }
        }
        return null;
    }

}
class College {
    int id;
    String name;
    int contactNo;
    String address;
    int pinCode;

    public College(int id, String name, int contactNo, String address, int pinCode) {
        this.id = id;
        this.name = name;
        this.contactNo = contactNo;
        this.address = address;
        this.pinCode = pinCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getContactNo() {
        return contactNo;
    }

    public void setContactNo(int contactNo) {
        this.contactNo = contactNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }
}
