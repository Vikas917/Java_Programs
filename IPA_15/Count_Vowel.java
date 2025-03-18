package IPA_15;

import java.util.Scanner;

public class Count_Vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int vowels = 0, consonents = 0, num = 0;

        for (int i= 0;i<str.length();i++) {
            if (Character.isLetter(str.charAt(i))) {
                    if (str.charAt(i) == 'a' || str.charAt(i) == 'A' || str.charAt(i) == 'e' || str.charAt(i) == 'E' ||
                            str.charAt(i) == 'i' || str.charAt(i) == 'I' || str.charAt(i) == 'o' || str.charAt(i) == '0' ||
                            str.charAt(i) == 'u' || str.charAt(i) == 'U') {
                        vowels++;
                    }
                    else if (str.charAt(i) == ' ') {
                    }
                    else {
                        consonents++;
                    }
                }
            else if (Character.isDigit(str.charAt(i))) {
                num++;
            }
        }
        System.out.println("Vowels : "+ vowels);
        System.out.println("Consonants : "+ consonents);
        System.out.println("Numbers : "+ num);
    }
}
