package IPA_15;

import java.util.Scanner;

public class Reversing_Only_Odd_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num  = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("Cannot Reverse Even Number");
        }
        else {
            int rev  = 0;
            while (num > 0) {
                int rem = num % 10;
                rev = rev*10 + rem;
                num = num / 10;
            }
            System.out.println(rev);
        }
    }
}
