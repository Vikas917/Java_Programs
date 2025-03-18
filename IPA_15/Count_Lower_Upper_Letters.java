package IPA_15;

import java.util.Scanner;

public class Count_Lower_Upper_Letters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int Lower_Count = 0;
        int Upper_Count = 0;

//        for (int i = 0; i < str.length(); i++)
//        {
//            if(Character.isLetter(str.charAt(i)) && Character.isLowerCase(str.charAt(i)))
//            {
//                Lower_Count++;
//            }
//            else if (Character.isLetter(str.charAt(i)) && Character.isUpperCase(str.charAt(i)))
//            {
//                Upper_Count++;
//            }
//        }
//        System.out.println("Count of Lowercase letters is " + Lower_Count + " & Count of Uppercase letters is " + Upper_Count);

        // Alternative Method using array creation
       // -----------------------------------------------------
        char[] arr;
        arr = str.toCharArray();
        //   Other process to create character array

      for(int i=0; i<str.length(); i++)
        {
            arr[i] = str.charAt(i);
        }
        //
        for(int i=0; i<arr.length;i++)
        {
            if(Character.isLowerCase(arr[i]))
            {
                Lower_Count++;
            }
        }
        if(Lower_Count==0)
        {
            System.out.println("No lower case available in string");
        }
        else
        {
            System.out.println(Lower_Count);
        }
    }
}
