/*
Create a class Beach with the below attributes:

beachId - int
beachName - String
beachRating - int
beachCost - int

Write getters, setters and parameterized constructor in the above mentioned attribute sequence as required.

Create class Solution with the main method.
Implement two static methods - findLeastRatingWithName in Solution class.

findLeastRatingWithName method:
-----------------------------------
This method will take three input parameters - array of Beach objects and string parameter and a int parameter. The method
will return the minimum rating attribute from beach objects whose name is matched with string parameter and whose amount
is greater than the int parameter. If no data found of beach objects, then the method should return 0.

Note : All the searches should be case insensitive.

These above mentioned static methods should be called from the main method.
For findLeastRatingWithName method - The main method should print the least rating from the beach array. If return 0, then
you should print "No beach found".

Input ->
1001
Puri
3
8600
1002
Digha
5
6200
1003
Digha
3
4000
1004
Digha
4
5500
digha
5000

Output ->
4
 */
package Java_IPA;

import java.util.Arrays;
import java.util.Scanner;

public class TouristProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tourist[] arr = new Tourist[4];

        for (int i = 0; i < arr.length; i++) {
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();
            sc.nextLine();
            int d = sc.nextInt();
            sc.nextLine();

            arr[i] = new Tourist(a,b,c,d);
        }
        String bn = sc.nextLine();
        int bc = sc.nextInt();sc.nextLine();

        int ans = findLeastRatingWithName(arr,bn,bc);
        if (ans > 0) {
            System.out.println(ans);
        }
        else {
            System.out.println("No beach found");
        }
    }
    public static int findLeastRatingWithName(Tourist[] arr, String beachName, int beachCost) {
        int[] tourists = new int[0];

        for (int i=0;i<arr.length;i++) {
            if (arr[i].getBeachName().equalsIgnoreCase(beachName) && arr[i].getBeachCost() > beachCost) {
                tourists = Arrays.copyOf(tourists,tourists.length+1);
                tourists[tourists.length-1] = arr[i].getBeachRating();
                Arrays.sort(tourists);
            }
        }
        if (tourists.length > 0) {
            return tourists[0];
        }
        return 0;
    }
}
class Tourist {
    int beachId;
    String beachName;
    int beachRating;
    int beachCost;

    public int getBeachId() {
        return beachId;
    }

    public void setBeachId(int beachId) {
        this.beachId = beachId;
    }

    public String getBeachName() {
        return beachName;
    }

    public void setBeachName(String beachName) {
        this.beachName = beachName;
    }

    public int getBeachRating() {
        return beachRating;
    }

    public void setBeachRating(int beachRating) {
        this.beachRating = beachRating;
    }

    public int getBeachCost() {
        return beachCost;
    }

    public void setBeachCost(int beachCost) {
        this.beachCost = beachCost;
    }

    public Tourist(int beachId, String beachName, int beachRating, int beachCost) {
        this.beachId = beachId;
        this.beachName = beachName;
        this.beachRating = beachRating;
        this.beachCost = beachCost;
    }
}
