package IPA_15;
/* Count the words in a sentence which are start with vowel.
 *
 * Input: Arijit is student of MCA
 * Output: 3
 *
 * Input: Sara plays tennis
 * Output: No such words
 */
import java.util.Scanner;

public class Count_Vowel_Words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        String[] arr = str.split(" ");

        for (int i = 0; i < arr.length; i++) {
            char d = arr[i].charAt(0);
            if(d=='a' || d=='e' || d=='i' || d=='o' || d=='u' || d=='A' || d=='E' || d=='I' || d=='O' || d=='U')
            {
                count++;
            }
        }
        if (count > 0) {
            System.out.println(count);
        }
        else {
            System.out.println("No such words");
        }
    }
}
