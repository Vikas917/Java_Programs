/*
Create a class Fruits with below attributes as private
● int fruitId
● String fruitName
● int price
● int rating

Write getters, setters and parameterized constructor in the abovementioned attribute
sequence as required.

Create class Solution with main method

Implement One static method-

● findMaximumPriceByRating

findMaximumPriceByRating in the solution class.
This method will take array of Fruit objects, int paramater and returns the maximum priced fruit
object from array of Fruit objects whichever has rating greater than the rating
(rating parameter passed). This method should be called from main method.

Write code to perform following tasks:

1. Take necessary input variable and call findMaximumPriceByRating.

For this method- The main method should print the fruitId from returned object. As if the
returned value is not null, or it should print "No such Fruit".

Note:- Before calling this static method, use Scanner object to read thevalues of four Fruits
objects. No two Fruits will have same price. All thesearches should be case insensitive.
Consider below sample input and output to test your code.


Input
-------------------
555
Apple
200
5
777
Orange
150
4
333
Banana
100
4
888
Avocado
250
4
3

Output
-----------------
888
 */
package Java_IPA;

import java.util.Scanner;

public class FruitProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fruits[] arr = new Fruits[4];

        for (int i = 0; i < 4; i++) {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();sc.nextLine();
            int d = sc.nextInt();sc.nextLine();

            arr[i] = new Fruits(a,b,c,d);
        }
        int rating = sc.nextInt();sc.nextLine();
        int res = findMaximumPriceByRating(arr,rating);
        if (res > 0) {
            System.out.println(res);
        }
        else {
            System.out.println("No such Fruit");
        }
    }
    public static int findMaximumPriceByRating(Fruits[] arr, int rating) {
        int maxPrice = 0;
        int fruitId = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getRating() > rating && arr[i].getPrice() > maxPrice) {
                maxPrice = arr[i].getPrice();
                fruitId = arr[i].getFruitId();
            }
        }
        return Math.max(fruitId, 0);

    }
}
class Fruits {
    int fruitId;
    String fruitName;
    int price;
    int rating;

    public int getFruitId() {
        return fruitId;
    }

    public void setFruitId(int fruitId) {
        this.fruitId = fruitId;
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Fruits(int fruitId, String fruitName, int price, int rating) {
        this.fruitId = fruitId;
        this.fruitName = fruitName;
        this.price = price;
        this.rating = rating;
    }
}
