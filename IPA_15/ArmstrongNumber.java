/*Write a Java program to check if a given number is an Armstrong number or not.

Here's an example of the expected input and output:

Input number: 153
Output: "Yes, the number is an Armstrong number."

*/
package IPA_15;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Number: ");
//        int n = sc.nextInt();
//        int sum = 0, temp = n;
//        int count  = String.valueOf(n).length();
//
//        while (temp > 0) {
//            int digit = temp % 10;
//            sum  += (int) Math.pow(digit,count);
//            temp /= 10;
//        }

        String num = sc.nextLine();
        int sum = 0;

        for (int i = 0; i < num.length(); i++) {
            sum+= (int) Math.pow(Integer.parseInt(String.valueOf(num.charAt(i))),num.length());
        }
        int n = Integer.parseInt(num);
        if (n == sum) {
            System.out.println("Yes, the number is an Armstrong number.");
        }
        else {
            System.out.println("No, the number is not an Armstrong number.");
        }
    }
}
