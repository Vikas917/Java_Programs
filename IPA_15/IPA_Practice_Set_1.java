package IPA_15;

import java.util.*;
public class IPA_Practice_Set_1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] word = null;
        word = s.split(" ");
        for(int i=0; i<word.length; i++)
        {
            System.out.println(word[i]);
        }
    }
}
