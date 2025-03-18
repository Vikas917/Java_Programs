package IPA_15;

/* Find first letter of each word in a string
    Input : Kalyani Govt. Eng. College
    Output : KGEC
*/

public class First_Letter_Of_Each_Word {
    public static void main(String[] args) {
        String s = "Kalyani";
        String[] arr = s.split(" ");

//        for (int i = 0;i<arr.length;i++) {
//                System.out.print(arr[i].charAt(i));
//        }

//        String s = "";
//        s = s + str.charAt(0);
//        for (int i = 0; i < str.length(); i++) {
//            if(str.charAt(i)==' ')
//            {
//                s = s + str.charAt(i+1);
//            }
//        }
//        System.out.println(s);


        //   Last Letter of each word
        String ans = "";
        for (int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i)==' ')
            {
                if(Character.isAlphabetic(s.charAt(i-1)))
                {
                    ans = ans + s.charAt(i-1);
                }
            }
            else if(i==s.length()-1 && Character.isAlphabetic(s.charAt(i)))
            {
                ans = ans + s.charAt(i);
            }
        }
        System.out.println(ans);
    }
}
