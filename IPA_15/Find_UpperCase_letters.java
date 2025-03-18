package IPA_15;

import java.util.Scanner;

public class Find_UpperCase_letters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "The quicker Brown Fox jumps over the lazy dog";
        String[] arr = str.split(" ");
        int count = 0;
        String largest = "";

        for (int i = 0;i<arr.length;i++) {
            if (arr[i].length() > largest.length()) {
                largest = arr[i];
            }
        }
        System.out.println(largest);


//        for (int i = 0;i<arr.length;i++) {
//            if (Character.isUpperCase(arr[i].charAt(0))) {
//                count++;
//                System.out.print(" " + arr[i]);
//            }
//        }

        //OR

//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i].charAt(0)>='A' && arr[i].charAt(0)<='Z')
//            {
//                System.out.println(arr[i]);
//            }
//        }
//        System.out.println();
//        System.out.println("The Uppercase Letters are: "  + count);
    }
}
