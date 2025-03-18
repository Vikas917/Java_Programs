package IPA_15;

/*
 * You are given a string S consisting of lowercase letters. Your task is to remove all the consecutive duplicates from
 * the string and output the result. For example, if the input string is "abbcddeff", the output should be "abcdef".
 *
 * Input: abbcddeff
 * Output: abcdef
 */

public class Remove2Cons_Letters {
    public static void main(String[] args) {
        String str = "abbcddeff";
        String newStr = "";
        char ch = '\0';

        for (int i=0;i<str.length();i++) {
            if (str.charAt(i) != ch) {
                ch = str.charAt(i);
                newStr += ch;
            }
        }

        System.out.println(newStr);
    }
}
