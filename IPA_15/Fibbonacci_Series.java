package IPA_15;

import java.util.Scanner;

public class Fibbonacci_Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        int num = 20;
        for (int i = 0; i < num; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        //printFib(n);
    }
    public static int fibonacci ( int num){
        if (num == 0) {
            return 0;
        } else if (num == 1) {
            return 1;
        } else {
            return fibonacci(num - 1) + fibonacci(num - 2);
        }
    }
}
//        int i = 0;
//        int k = 1;
//        System.out.print(i+" ");
//        while(k<n) {
//            System.out.print(k + " ");
//            int p = k;
//            k = k + i;
//            i = p;
//        }
        // Function to print fibonacci series
//        static void printFib(int n) {
//            if (n < 1) {
//                System.out.println("Invalid Number of terms");
//                return;
//            }
//
//            // When number of terms is greater than 0
//            int prev1 = 1;
//            int prev2 = 0;
//
//            System.out.print(prev2 + " ");
//
//            // If n is 1, then we do not need to proceed further
//            if (n == 1)
//                return;
//
//            System.out.print(prev1 + " ");
//
//            // Print 3rd number onwards using the recursive formula
//            for (int i = 3; i <= n; i++) {
//                int curr = prev1 + prev2;
//                prev2 = prev1;
//                prev1 = curr;
//                System.out.print(curr + " ");
//            }
//        }





