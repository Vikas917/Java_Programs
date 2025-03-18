package IPA_15;
/* Remove duplicate characters in a string
 *
 * Input : Arijit Ghosh
 * Output : Arijt Ghos
 */

public class Remove_Duplicate_String {
    public static void main(String[] args) {
        String str = "Arijit Singh";
        String newStr = "";
        int i,j;

        for ( i=0;i<str.length();i++) {
            for ( j=0;j<i;j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    break;
                }
            }
            if (i == j) {
                newStr += str.charAt(i);
            }
        }
        System.out.println(newStr);
    }
}
