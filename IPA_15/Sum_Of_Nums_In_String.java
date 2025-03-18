package IPA_15;
/* Input : 123Arijit1998Arijit10

 * Process :
 * -----------
 * Array : [123, Arijit, 1998, Arijit, 10]
 * Now you should sum up the position of that array where numbers are stored.
 * 123 + 1998 = 2121
 *
 * Output :
 * --------------
 * 2131
 */
public class Sum_Of_Nums_In_String {
    public static void main(String[] args) {
        String str = "123Arijit1998Arijit10";
        int num = 0, sum = 0;

        for (int i=0;i<str.length();i++) {
            if (Character.isDigit(str.charAt(i))) {
                num = num * 10 + Integer.parseInt(String.valueOf(str.charAt(i)));
            }
            else if (num != 0) {
                sum += num;
                num  = 0;
            }
        }
        
        if (num  > 0) {
            sum += num;
        }
        System.out.println(sum);
    }
}
