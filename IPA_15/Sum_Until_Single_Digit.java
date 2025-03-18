package IPA_15;

import java.util.Scanner;

public class Sum_Until_Single_Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 195;

//        if (num >= 1 && num <= 9) {
//            System.out.println(num);
//        }
//        else {
//            int sum = Sum(num);
//            System.out.println(sum);
//        }

        while (true) {
            if (num >= 1 && num <= 9) {
                System.out.println("Result: " + num);
                break;
            } else {
                int one = num % 10;  // Get the last digit
                int two = num / 10;  // Remove the last digit
                    num = one + two;     // Sum the digits
            }
        }
    }
    public static int Sum(int num)
    {
        int div = num;
        int sum = 0;
        while(div>0)
        {
            int rem = div % 10;
            sum += rem;
            div = div/10;
        }
        if(sum>9)
        {
            return Sum(sum);
        }
        return sum;
    }
}
