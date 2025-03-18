package IPA_15;

/* Marge two strings using comma

Input:
Arijit,Ghosh
Pop:Mom

Output:
Arijit, Ghosh, Pop:Mom
*/

import java.util.*;
public class Marge_2_String_Using_Comma
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String p1 = sc.nextLine();
        String[] s1 = p1.split(",");
        String p2 = sc.nextLine();
        String[] s2 = p2.split(",");
        for(int i=0 ;i<s2.length; i++)
        {
            s1 = Arrays.copyOf(s1,s1.length+1);
            s1[s1.length-1] = s2[i];
        }
        String n = Arrays.toString(s1); //Output - [jf, jef,ejh]
        String k = n.substring(1, n.length()-1); // substring is used to make substrings of bigger strings like here
                                                // - we are removing the square brackets [ ]
        System.out.println(k);
    }
}
