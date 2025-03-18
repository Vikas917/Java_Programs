// aabbbcc = a2b3c2
// abbccc = a1b2c3

package IPA_15;

import java.util.Scanner;

public class CharRepeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        int i = 0, count = 0;
        char ch = str.charAt(i);

        for (int j=0;j < str.length();j++) {
            if (str.charAt(j) == ch) {
                count++;
            }
            else {
                System.out.print(ch + "" + count);
                ch = str.charAt(j);
                count = 0;
                j--;
            }

            if (ch == str.charAt(str.length()-1) && j == str.length()-1) {
                System.out.print(ch + "" + count);
            }
        }
    }
}
