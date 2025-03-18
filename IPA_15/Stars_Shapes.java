package IPA_15;

import java.util.Scanner;

public class Stars_Shapes {
    public static void main(String[] args) {
        int a=0,b=0;
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] arr = s.toCharArray();
        for (char c : arr) {
            if (c == '*') {
                a++;
            }
            if (c == '#') {
                b++;
            }
        }
        System.out.println(a-b);
    }
}
