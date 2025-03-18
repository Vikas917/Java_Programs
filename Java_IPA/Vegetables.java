/*
Create a class Vegetable with below attributes:

VegetableId - int
VegetableName - String
Price - int
Rating - int

The above attributes should be private, write getters, setters and parameterized constructor as required.

Create class Solution with main method.
Implement two static methods - findMinimumPriceByRating in Solution class.

findMinimumPriceByRating method:
-----------------------------------------------
The method will return minimum price object from array of vegetable objects, whichever by rating greater than given rating.
If no vegetable with the above condition is present in the array of vegetable object, then the mothod return null.

Note :
No vegetable has the same price.
All the searches should be case insensitive.

The above mentioned static methods should be called from the main method.

For findMinimumPriceByRating method - The main method should print the id of vegetable object or it should print
"No such Vegetables".

Eg: 1002
where 1002 is the id whose price is lowest

Before calling these static methods in main, use Scanner object to read the values of four Vegetable objects referring
attributes in the above mentioned attribute sequence.
Next, read the value of int parameter for rating.

Consider below sample input and output:

Input1
---------------------------
1001
Carrot
90
5
1002
Tomato
40
4
1003
Bectroot
80
4
1004
Onion
78
3
2

Output1
-------------------------------
1002
=====================================================================================
Input2
---------------------------
1001
Carrot
90
5
1002
Tomato
40
4
1003
Bectroot
80
4
1004
Onion
78
3
7

Output2
----------------------------
No such Vegetables
 */
package Java_IPA;

import java.util.Arrays;
import java.util.Scanner;

public class Vegetables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vegetable[] arr = new Vegetable[4];

        for (int i = 0; i < arr.length; i++) {
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();
            sc.nextLine();
            int d = sc.nextInt();
            sc.nextLine();

            arr[i] = new Vegetable(a,b,c,d);
        }
        int rating = sc.nextInt();sc.nextLine();

        Vegetable res = findMinimumPriceByRating(arr,rating);

        if (res!=null) {
            System.out.println(res.getVegetableId());
        }
        else {
            System.out.println("No such Vegetables");
        }

    }
    public static Vegetable findMinimumPriceByRating(Vegetable[] arr,int rating) {
        int[] veggies = new int[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].getRating()>rating)
            {
                veggies = Arrays.copyOf(veggies, veggies.length+1);
                veggies[veggies.length-1] = arr[i].getPrice();
                Arrays.sort(veggies);
            }
        }
        if(veggies.length>0)
        {
            for (int i = 0; i < arr.length; i++) {
                if(arr[i].getPrice()==veggies[0])
                {
                    return arr[i];
                }
            }
        }
        return null;
    }
}
class Vegetable {
    int VegetableId;
    String VegetableName;
    int Price;
    int Rating;

    public Vegetable(int vegetableId, String vegetableName, int price, int rating) {
        VegetableId = vegetableId;
        VegetableName = vegetableName;
        Price = price;
        Rating = rating;
    }

    public void setVegetableId(int vegetableId) {
        VegetableId = vegetableId;
    }

    public void setVegetableName(String vegetableName) {
        VegetableName = vegetableName;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public void setRating(int rating) {
        Rating = rating;
    }

    public int getVegetableId() {
        return VegetableId;
    }

    public String getVegetableName() {
        return VegetableName;
    }

    public int getPrice() {
        return Price;
    }

    public int getRating() {
        return Rating;
    }
}


