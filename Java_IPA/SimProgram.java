/*
Create class Sim2 with below attributes:

id - int
company - String
balance - int
ratePerSecond - double
circle - String

Create class Solution and implement static method "matchAndSort" in the Solution class.

This method will take array of Sim objects, search_circle String and search_rate double as parameters.
And will return another Sim array where the search_circle matches with the circle parameter of the original Sim array and
the search_rate double is greater than the original array of Sim object's ratePerSecond attribute which is also sorted by
means of balance attribute in descending order.

Write necessary getters and setters.

Before calling "matchAndSort" method in the main method, read values for four Sim objects referring the attributes in above
sequence along with a String search_circle and a double search_rate. Then call the "matchAndSort" method and write logic in
main method to print the id's of the result obtained.

Input
--------------------------
1
jio
430
1.32
mumbai
2
idea
320
2.26
mumbai
3
airtel
500
2.54
mumbai
4
vodafone
640
3.21
mumbai
mumbai
3.4

Output
--------------------------
4
3
1
2
 */
package Java_IPA;

import java.util.Arrays;
import java.util.Scanner;

public class SimProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sim[] arr = new Sim[4];

        for (int i = 0; i < 4; i++) {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();sc.nextLine();
            double d = sc.nextDouble();sc.nextLine();
            String e = sc.nextLine();

            arr[i] = new Sim(a,b,c,d,e);
        }
        String scircle = sc.nextLine();
        double srate = sc.nextDouble();sc.nextLine();

        Sim[] res = matchAndSort(arr,scircle,srate);
        if (res != null) {
            for (int i=0;i<res.length;i++) {
                System.out.println(res[i].getId());
            }
        }
        else {
            System.out.println("Not found");
        }
    }
    public static Sim[] matchAndSort(Sim[] arr, String sc,double sr) {
        Sim[] sims = new Sim[0];
        for (int i=0;i< arr.length;i++) {
            if (arr[i].getCircle().equalsIgnoreCase(sc) && sr > arr[i].getRatePerSecond() ) {
                sims = Arrays.copyOf(sims,sims.length+1);
                sims[sims.length-1] = arr[i];
            }
        }
        for (int i=0;i<sims.length-1;i++) {
            for (int j=i+1;j<sims.length;j++) {
                if (sims[i].getBalance() < sims[j].getBalance()) {
                    Sim s = sims[i];
                    sims[i] = sims[j];
                    sims[j] = s;
                }
            }
        }
        if (sims.length > 0) {
            return sims;
        }
        else {
            return null;
        }
    }
}
class Sim{
    int id;
    String company;
    int balance;
    double ratePerSecond;
    String circle;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public double getRatePerSecond() {
        return ratePerSecond;
    }

    public void setRatePerSecond(double ratePerSecond) {
        this.ratePerSecond = ratePerSecond;
    }

    public String getCircle() {
        return circle;
    }

    public void setCircle(String circle) {
        this.circle = circle;
    }

    public Sim(int id, String company, int balance, double ratePerSecond, String circle) {
        this.id = id;
        this.company = company;
        this.balance = balance;
        this.ratePerSecond = ratePerSecond;
        this.circle = circle;
    }
}