package IPA_15;

/* Input: "Hello@123World456"

Process:
Array: ["Hello", "@", "123", "World", "456"]
Now you should concatenate all the strings in the array and multiply it with the sum of the position of that array where
numbers are stored.
Sum of positions of numbers in the array = 3 + 5 = 8
Concatenated string = "Hello@123World456"
Result = 8 * "Hello@123World456" = "Hello@123World456Hello@123World456Hello@123World456Hello@123World456Hello@123World456
Hello@123World456Hello@123World456Hello@123World456"

Output:
"Hello@123World456Hello@123World456Hello@123World456Hello@123World456Hello@123World456Hello@123World456Hello@123World456
Hello@123World456"


Input String: "Hello@123World456"

As the program processes the string:
                                     *   It first encounters "Hello" and stores it in ch.
                                     *   When it reaches "@", it adds "Hello" to arr and resets ch.
                                     *  It then processes "123", adding it to num.
                                     *  When it encounters "W", it checks that num is not empty:
                                     *  At this point, num contains "123".
                                     *    The program adds "123" to arr, and then it executes num = "" to reset for any subsequent digits.
*/

import java.util.Arrays;
import java.util.Scanner;

public class Repeat_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s =  sc.nextLine();
        String[] arr = new String[0];
        String ch = "", num = "", sign = "";

        for (int i=0;i<s.length();i++) {
            if (Character.isAlphabetic(s.charAt(i))) {
                ch += s.charAt(i);

                if (num != "") {
                    arr = Arrays.copyOf(arr, arr.length + 1);
                    arr[arr.length - 1] = num;
                    num = "";
                    //If num were not reset, it would still contain the previous digits when the program encounters new digits later on.
                    // This could lead to incorrect behavior, where the new digits are concatenated with the old ones. Here’s what would happen without resetting:

                    //If the input string was "Hello@123World456", and if num were not reset, then upon processing "456",
                    // the num variable would incorrectly accumulate the values, resulting in a value like "123456" instead of just "678".
                }
                else if (sign != "") {
                    arr = Arrays.copyOf(arr, arr.length + 1);
                    arr[arr.length - 1] = sign;
                    sign = "";
                }
            }
            else if (Character.isDigit(s.charAt(i))) {
                num += s.charAt(i);
                if (ch != "") {
                    arr = Arrays.copyOf(arr, arr.length + 1);
                    arr[arr.length - 1] = ch;
                    ch = "";
                } else if (sign != "") {
                    arr = Arrays.copyOf(arr, arr.length + 1);
                    arr[arr.length - 1] = sign;
                    sign = "";
                }
            }
            else
            {
                sign += s.charAt(i);
                if(ch!="")
                {
                    arr = Arrays.copyOf(arr,arr.length+1);
                    arr[arr.length-1] = ch;
                    ch = "";
                }
                else if(num!="")
                {
                    arr = Arrays.copyOf(arr,arr.length+1);
                    arr[arr.length-1] = num;
                    num = "";
                }

            }
        }
        if(num!="")
        {
            arr = Arrays.copyOf(arr,arr.length+1);
            arr[arr.length-1] = num;
            num = "";
        }
        else if(ch!="")
        {
            arr = Arrays.copyOf(arr,arr.length+1);
            arr[arr.length-1] = ch;
            ch = "";
        }
        else
        {
            arr = Arrays.copyOf(arr,arr.length+1);
            arr[arr.length-1] = sign;
            sign = "";
        }


        String ar = Arrays.toString(arr);
        System.out.println("The Array Conversion :" + ar);

        int pos = 0;

        for (int i=0;i<arr.length;i++) {
            if (Character.isDigit(arr[i].charAt(0))) {
                pos += i;
            }
        }

        for (int j = 0;j < pos;j++) {
            System.out.print(s);
        }
    }
}

















//        String input = "Hello@123World456";
//        String[] parts = input.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)"); // Split between digits and non-digits
//        StringBuilder concatenatedString = new StringBuilder();
//        int sumOfPositions = 0;
//
//        // Loop through the array and process parts
//        for (int i = 0; i < parts.length; i++) {
//            concatenatedString.append(parts[i]);
//            // Check if the part is a number
//            if (parts[i].matches("\\d+")) {
//                sumOfPositions += (i + 1); // Store the position (1-based index)
//            }
//        }
//
//        // Get the final concatenated string
//        String resultString = concatenatedString.toString();
//
//        // Multiply the concatenated string by the sum of positions
//        StringBuilder finalResult = new StringBuilder();
//        for (int i = 0; i < sumOfPositions; i++) {
//            finalResult.append(resultString);
//        }
//
//        // Output the final result
//        System.out.println(finalResult.toString());


