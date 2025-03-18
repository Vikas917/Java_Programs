/*
Create a class MobileDetails with the below attributes:

MobileId – int
Price - int
Brand – String
isFlagShip – boolean

The above attributes should be private, write getters, setters and parameterized constructor as required.

Create class MobileDetails with main method.

Implement two static methods – getTotalPrice() and getSecondMin() in MobileDetails class.

getTotalPrice method:
----------------------------------------
This method will take two int input parameters which take object array and string brand. The method will return the total
price of mobiles of that brand.

If no mobile with the given brand is present in the array of MobileDetails objects, then the method should return 0.

getSecondMin method:
----------------------------------------
This method will take object array which will return the second minimum price from the array and name of that mobile brand.

The above mentioned static methods should be called from the main method.

For getTotalPrice method: The main method should print the total price as it is, if the returned
value is not null, or it should print “There are no mobile with given brand”.

Before calling these static methods in main, use Scanner object to read the values of five objects referring attributes
in the above mentioned attribute sequence.

Input :
---------------------------------------
101
25000
Samsung
True
102
19000
Redmi
False
103
28000
Nokia
True
104
25000
Realme
False
105
40000
Samsung
True
Samsung

Output :
-----------------------------------------
65000
Samsung : 25000
Realme : 25000
 */
package Java_IPA;

import java.util.Arrays;
import java.util.Scanner;

public class MobileProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mobile[] arr = new Mobile[5];

        for (int i = 0; i < arr.length; i++) {
            int a = sc.nextInt();
            sc.nextLine();
            int b = sc.nextInt();
            sc.nextLine();
            String c = sc.nextLine();
            boolean d = sc.nextBoolean();
            sc.nextLine();

            arr[i] = new Mobile(a,b,c,d);
        }
        String brand = sc.nextLine();

        int ans = getTotalPrice(arr,brand);
        if (ans > 0) {
            System.out.println(ans);
        }
        else {
            System.out.println("There are no mobile with given brand");
        }

        Mobile[] res = getSecondMin(arr);
        if (res!= null) {
            for (int i=0;i< res.length;i++) {
                System.out.println(res[i].getBrand() + ":" + res[i].getPrice());
            }
        }
    }
    public static int getTotalPrice(Mobile[] arr,String brand) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].getBrand().equalsIgnoreCase(brand))
            {
                sum += arr[i].getPrice();
            }
        }
        if(sum>0)
        {
            return sum;
        }
        return 0;
    }
    public static Mobile[] getSecondMin(Mobile[] arr) {
        Mobile[] mobiles = new Mobile[0];

        //Sorting the array based on pricing
        for (int i=0;i< arr.length-1;i++) {
            for (int j = i+1;j<arr.length;j++) {
                if (arr[i].getPrice()  > arr[j].getPrice()) {
                    Mobile m = arr[i];
                    arr[i] = arr[j];
                    arr[j] = m;
                }
            }
        }
        //Finding out the second Minimum Price
        for (int i=1;i< arr.length;i++){
            if (arr[0].getPrice() < arr[i].getPrice()) {
                mobiles = Arrays.copyOf(mobiles,mobiles.length+1);
                mobiles[mobiles.length-1] = arr[i];
                break; //If we found then break the loop
            }
        }
        //If similar second minimum found then add them in new array
        for (int i=0;i< arr.length;i++) {
            if (arr[i].getPrice() == mobiles[0].getPrice() && arr[i].getMobileId() != mobiles[0].getMobileId()) {
                mobiles = Arrays.copyOf(mobiles,mobiles.length+1);
                mobiles[mobiles.length-1] = arr[i];
            }
        }

        if (mobiles.length > 0) {
            return mobiles;
        }
        else {
            return null;
        }
    }

}
class Mobile {
    int MobileId;
    int Price;
    String Brand;
    boolean isFlagShip;

    public int getMobileId() {
        return MobileId;
    }

    public void setMobileId(int mobileId) {
        MobileId = mobileId;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public boolean isFlagShip() {
        return isFlagShip;
    }

    public void setFlagShip(boolean flagShip) {
        isFlagShip = flagShip;
    }

    public Mobile(int mobileId, int price, String brand, boolean isFlagShip) {
        MobileId = mobileId;
        Price = price;
        Brand = brand;
        this.isFlagShip = isFlagShip;
    }
}