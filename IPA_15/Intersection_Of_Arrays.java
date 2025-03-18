package IPA_15;

import java.util.Arrays;
import java.util.Scanner;

public class Intersection_Of_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] set1 = new int[4];
        int[] set2 = new int[5];
        int[] intersection = new int[0];
        System.out.println("Set 1 :");
        for (int i = 0; i < set1.length; i++) {
            System.out.print((i+1)+" : ");
            set1[i] = sc.nextInt();
        }
        System.out.println("Set 2 :");
        for (int i = 0; i < set2.length; i++) {
            System.out.print((i+1)+" : ");
            set2[i] = sc.nextInt();
        }
        for (int i = 0; i < set1.length; i++) {
            for (int j = 0; j < set2.length; j++) {
                if(set1[i]==set2[j])
                {
                    intersection = Arrays.copyOf(intersection, intersection.length+1);
                    intersection[intersection.length-1] = set1[i];
                }
            }
        }
        System.out.println("The intersection of the two sets : "+Arrays.toString(intersection));
//        int[] a = {1,2,3,4};
//        int[] b = {3,4,5,6,7};
//        int[] c = new int[0];
//        for (int i=0;i<a.length;i++) {
//            for (int j =0;j< b.length;j++) {
//                if (a[i] == b[j]) {
//                    c = Arrays.copyOf(c,c.length+1);
//                    c[c.length-1] = a[i];
//                }
//            }
//        }
//        System.out.println(Arrays.toString(c));
//        for (int i =0;i<c.length;i++) {
//            System.out.print(" " + c[i]);
//        }
    }
}
