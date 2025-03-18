package IPA_15;

import java.util.Scanner;

public class Sum_Of_Even_Digits_In_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 5, 20, 8, 13};
        int sum = 0;
        for (int i=0;i< arr.length;i++) {
           if (arr[i] % 2 == 0) {
               sum += arr[i];
           }
        }
        System.out.println(sum);
    }
}
