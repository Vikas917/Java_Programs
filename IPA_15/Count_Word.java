package IPA_15;

/* Count number of word in a string
*Note : Always ignore the spaces if more than 1 space given between two word

Sample Input : 1
------------------------
Kalyani Goverment Engineering College

Process
---------------------------
[Kalyani, Goverment, Engineering, College]

Output
---------------------------
Number of word : 4
*************************************
Sample Input : 2
------------------------
Kalyani Goverment  Engineering College

Process
---------------------------
[Kalyani, Goverment, , Engineering, College]

Output
---------------------------
Number of word : 4
*/

import java.util.Scanner;

public class Count_Word {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//
//        int count = 0;
//        String[] arr = str.split(" ");
//
//        for (int i=0;i< arr.length;i++) {
//            if (arr[i] != "") {
//                count++;
//            }
//        }
//        System.out.println(count);


/* Input : Home, Sweet Home
           Home
 * Output : Number of that word present in the sentence : 2
 *
 * Process
 * ----------
 * The word Home present in the sentence 2 times
 */
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        String s = sc.nextLine();
        String ch = "";
        int count = 0;
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length(); j++)
            {
                if(Character.isLetter(arr[i].charAt(j)))
                {
                    ch = ch + arr[i].charAt(j);
                }
            }

            if(ch.equals(s))
            {
                count++;
            }
            ch = "";
        }
        System.out.println("Number of " + s +  " present in the Sentence : "+count);
    }
}
