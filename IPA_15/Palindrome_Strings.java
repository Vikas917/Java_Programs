package IPA_15;
/* Find the palindrome words from the sentence and print them and also count
 *
 * Input:
 * ----------------
 * My name is nitin and I can speak malayalam
 *
 * Output:
 * ----------------
 * nitin
 * I
 * malayalam
 * 3
 */
import java.util.Arrays;
import java.util.Scanner;

public class Palindrome_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] pals = findPalindrome(str);

        if (pals != null) {
            System.out.println("The palindrome strings are : ");
            for (int i=0;i< pals.length;i++) {
                System.out.println(pals[i]);
            }
            System.out.println(pals.length);
        }
        else {
            System.out.println("No palindrome strings");
        }
    }
    public static boolean isPalindrome(String str) {
        boolean check = true;
        for (int i=0;i<str.length();i++) {
            if (str.charAt(i) != str.charAt(str.length()-1-i)) {
                check = false;
                break;
            }
        }
        return check;
    }
    public static String[] findPalindrome(String s) {
        String[] arr = s.split(" ");
        String[] pal = new String[0];
        for (int i = 0; i < arr.length; i++) {
            if (isPalindrome(arr[i])) {
                pal = Arrays.copyOf(pal, pal.length + 1);
                pal[pal.length - 1] = arr[i];
            }
        }
        if (pal.length > 0) {
            return pal;
        }
        return null;
    }
}
