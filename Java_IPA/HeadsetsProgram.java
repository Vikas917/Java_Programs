/*
Create a class HeadSets with below attributes:

headsetName - String
brand-String
price - int
available- boolean

The above attributes should be private, write getters, setters and parameterized constructor as required.

Create class Solution with main method.
Implement two static methods - findTotalPriceForGivenBrand and findAvailableHeadsetWithSecondMinPrice in Solution class.

findTotalPriceForGivenBrand method:
--------------------------------------
The method will return the total price of Headsets from array of Headset objects for the given brand(String parameter passed).
If no Headsets with the given brand is present in the array of Headsets objects, then the method should return 0.

findAvailableHeadsetWithSecondMinPrice method:
-----------------------------------------------
This method will take array of Headset objects as an input parameter and returns the available Headset object with the
second lowest/minimum price from the given array of objects.

If no Headsets with the above condition is present in the array of Headsets objects, then the method should return null.

Note :
No two Headsets will have the same price.
All the searches should be case insensitive.

The above mentioned static methods should be called from the main method.

For findTotalPriceForGivenBrand method - The main method should print the returned total price as it is if the returned
value is greater than 0 or it should print "No Headsets available with the given brand".
Eg: 4500
where 4500 is the total Headsets price

For findAvailableHeadsetWithSecondMinPrice method - The main method should print the headsetsName and price from the
returned Headsets object if the returned value is not null.
If the returned value is null then it should print "No Headsets available".

Eg:Logitech Wired
1500
where Logitech Wired is the headsetName and 1500 is the price

Before calling these static methods in main, use Scanner object to read the values of four Headset objects referring
attributes in the above mentioned attribute sequence.
Next, read the value of String parameter for capturing brand.

Consider below sample input and output:

Input1:
----------------
boAt BassHeads
boAt
1220
true
Over Ear Wired
boAt
549
true
In Ear with Mic
JBL
450
true
Buds 2 Neo
RealMe
500
true
boAt

Output:
---------------
1769
Buds 2 Neo
500


Input2:
--------------------
boAt BassHeads
boAt
1220
false
Over Ear Wired
boAt
1549
false
In Ear with Mic
JBL
450
false
Buds 2 Neo
RealMe
500
false
boAt

Output:
--------------
2769
No Headsets available
--------------------------------------------------
 */
package Java_IPA;

import java.util.Arrays;
import java.util.Scanner;

public class HeadsetsProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HeadSets[] arr = new HeadSets[4];

        for (int i = 0; i < arr.length; i++) {
            String a = sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();
            sc.nextLine();
            boolean d = sc.nextBoolean();
            sc.nextLine();

            arr[i] = new HeadSets(a,b,c,d);
        }
        String brand = sc.nextLine();
        sc.close();
        int ans = findTotalPriceForGivenBrand(arr,brand);
        if (ans  > 0) {
            System.out.println(ans);
        }
        else {
            System.out.println("No Headsets available with the given brand");
        }

        HeadSets res = findAvailableHeadsetWithSecondMinPrice(arr);
        if (res!=null) {
            System.out.println(res.getHeadsetName());
            System.out.println(res.getPrice());
        }
        else {
            System.out.println("No Headsets available");
        }

    }
    public static int findTotalPriceForGivenBrand(HeadSets[] arr,String brand) {
        int sum = 0;
        for (int i=0;i<arr.length;i++) {
            if (arr[i].getBrand().equalsIgnoreCase(brand)) {
                sum += arr[i].getPrice();
            }
        }
        return sum;
    }

    public static HeadSets findAvailableHeadsetWithSecondMinPrice(HeadSets[] arr) {

        for (int i=0;i<arr.length-1;i++) {
            for (int j=i+1;j<arr.length;j++) {
                if (arr[i].getPrice() > arr[j].getPrice()) {
                    HeadSets h = arr[i];
                    arr[i]  = arr[j];
                    arr[j] = h;
                }
            }
        }
        if (arr[1].isAvailable()){
            return arr[1];
        }
        else {
            return null;
        }

//        int k = 0,cnt = 0;
//        for (int i=0;i<arr.length;i++) {
//            if (arr[i].isAvailable()) {
//                cnt++;
//            }
//        }
//        HeadSets[] headSets = new HeadSets[cnt];
//        for (int i=0;i<arr.length;i++) {
//            if (arr[i].isAvailable()) {
//                headSets[k] = arr[i];
//                k++;
//            }
//        }
//        for (int i=0;i<headSets.length-1;i++) {
//            for (int j=i+1;j<headSets.length;j++) {
//                if (arr[i].getPrice() > arr[j].getPrice()) {
//                    HeadSets h = arr[i];
//                    arr[i]  = arr[j];
//                    arr[j] = h;
//                }
//            }
//        }
//        if (cnt > 0){
//            return headSets[1];
//        }
//        else {
//            return null;
//        }


//        for (int i=1;i<arr.length-1;i++) {
//            if (arr[0].getPrice() < arr[i].getPrice()) {
//                headSets = Arrays.copyOf(headSets,headSets.length+1);
//                headSets[headSets.length-1] = arr[i];
//                break;
//            }
//        }
//        for (int i=0;i<arr.length-1;i++) {
//            if (headSets[0].getPrice() == arr[i].getPrice()) {
//                headSets = Arrays.copyOf(headSets,headSets.length+1);
//                headSets[headSets.length-1] = arr[i];
//            }
//        }
//        if (headSets.length  > 0) {
//            return headSets;
//        }
//        else {
//            return null;
//        }
    }
}
class HeadSets {
    String headsetName;
    String brand;
    int price;
    boolean available;

    public String getHeadsetName() {
        return headsetName;
    }

    public void setHeadsetName(String headsetName) {
        this.headsetName = headsetName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public HeadSets(String headsetName, String brand, int price, boolean available) {
        this.headsetName = headsetName;
        this.brand = brand;
        this.price = price;
        this.available = available;
    }
}
