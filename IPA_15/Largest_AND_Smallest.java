package IPA_15;

import java.util.Scanner;

public class Largest_AND_Smallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of integers: " );
        int n = sc.nextInt();
        int[] a = new int[n];


        System.out.println("Enter the" + n + "number of integers: ");
        for (int i=0;i<a.length;i++) {
            System.out.println("Enter Integer " + (i+1) + ":");
            a[i] = sc.nextInt();
        }
        int max = a[0];
        int min = a[0];
        for (int i=1;i<a.length;i++) {
            if (a[i] > max) {
                max = a[i];
            } else if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("Smallest Integer : " + min);
        System.out.println("largest Integer : " + max);
    }
}
