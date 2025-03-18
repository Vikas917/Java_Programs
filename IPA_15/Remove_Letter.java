package IPA_15;
/* Remove a character from a string
 * Input
 * --------------
 * Arijit
 * i
 * Output
 * ---------------
 * Arjt
 */
public class Remove_Letter {
    public static void main(String[] args) {
        String str = "Arijit";
        String  ch = "i";

        String newStr = str.replace(ch,"");

        System.out.println(newStr);
    }
}
