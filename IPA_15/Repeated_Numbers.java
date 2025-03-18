package IPA_15;

// a2b3c2 = aabbbcc
// a1b2c3 = abbccc

import java.util.Scanner;

public class Repeated_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        for (int i=0;i<str.length();i++) {
            if (Character.isAlphabetic(str.charAt(i))) {
                System.out.print(str.charAt(i));
            }
            else if (Character.isDigit(str.charAt(i))) {
                int x = Integer.parseInt(String.valueOf(str.charAt(i)));
                for (int j=1;j<x;j++) {
                    System.out.print(str.charAt(i-1));
                }
            }
        }
    }
}

