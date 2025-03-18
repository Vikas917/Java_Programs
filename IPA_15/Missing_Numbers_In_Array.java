package IPA_15;

import java.util.Arrays;
import java.util.Scanner;

public class Missing_Numbers_In_Array {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        int[] arr = {1,3 ,4,7,8,10};
        int[] mna = new int[0];
        int last_num = arr[arr.length-1];
        int index = 0;

        // Loop from the first number to the last number in the array
//        for (int i=arr[0];i<=last_num;i++) {
//            if (i != arr[index]) {
//                mna = Arrays.copyOf(mna,mna.length+1);
//                mna[mna.length-1] = i;
        //            }
//            else {
//                index++;
//            }
//        }
        for (int i=0;i<arr.length-1;i++) {
            int k = arr[i];

            while (k+1 != arr[i+1]) {
                mna = Arrays.copyOf(mna,mna.length+1);
                mna[mna.length-1] = (k+1);
                k++;
            }
        }


        System.out.println(Arrays.toString(mna));
    }
}
