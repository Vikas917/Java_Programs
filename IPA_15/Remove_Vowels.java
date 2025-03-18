package IPA_15;

import java.util.Scanner;

public class Remove_Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(remove_dup(str));

        System.out.println(remove_Duplicates_Using_Dict(str));
    }
    public static String remove_dup(String str) {
        String newStr = "";
        for (int i= 0;i<str.length();i++) {
            if (Character.isLetter(str.charAt(i))) {
                if (str.charAt(i) == 'a' || str.charAt(i) == 'A' || str.charAt(i) == 'e' || str.charAt(i) == 'E' ||
                        str.charAt(i) == 'i' || str.charAt(i) == 'I' || str.charAt(i) == 'o' || str.charAt(i) == 'O' ||
                        str.charAt(i) == 'u' || str.charAt(i) == 'U') {
                    newStr += "";
                }
                else {
                    newStr += str.charAt(i);
                }
            }
        }
        return newStr;
    }

    public static String remove_Duplicates_Using_Dict(String str) {
        String newStr = "";
        char[] dic = {'A','a','E','e','I','i','O','o','U','u'};
        for (int i=0;i<str.length();i++) {
            int cnt = 0;
            for (int j=0;j<dic.length;j++){
                if (str.charAt(i) == dic[j]) {
                    cnt++;
                }
            }
            if (cnt == 0) {
                newStr += str.charAt(i);
            }
        }
        return newStr;
    }
}
