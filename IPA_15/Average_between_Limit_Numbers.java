package IPA_15;
/* Find average of a number array between two limit numbers (except the two numbers)
 * Input
 * ---------------
 *  5
    1
    2
    3
    4
    5
 *  1
 *  4
 *
 * Output
 * ---------------
 * 2
 */
import java.util.Scanner;

public class Average_between_Limit_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int low = sc.nextInt();
        int up = sc.nextInt();

        int lowerIndex = index(arr, low);

        int upperIndex = index(arr, up);
        if(upperIndex==0)
        {
            System.out.println("Index not found");
        }
        int sum=0, count=0;
        if(upperIndex>0 && lowerIndex+1<upperIndex)
        {
            for(int i=lowerIndex+1; i<upperIndex; i++)
            {
                System.out.println(arr[i]);
                sum = sum+arr[i];
                count++;
            }
            System.out.println(sum/count);
        }

    }

    public static int index(int[] arr, int num)
    {
        for(int i =0; i<arr.length; i++)
        {
            if(arr[i]==num)
            {
                return i;
            }
        }
        return 0;
    }
}
