package IPA_15;

/* Minimum Ascii valued character in a String */
// arijit = a
public class Min_ASCII_Value_Character {
    public static void main(String[] args) {
        String str = "zrijitt";
        char ch = str.charAt(0);

        for (int i=0;i<str.length();i++) {
            for (int j=0;j<=i;j++) {
                if (ch > str.charAt(j)) {
                    ch = str.charAt(j);
                }
            }
        }
        System.out.println(ch);
    }
}
