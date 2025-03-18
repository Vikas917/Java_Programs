package IPA_15;
/* Check a number is perfect or not

 * Input : 6
 * Output : Perfect Number
 *
 * Explaination
 * --------------------------
 * The divisors of 6 = 1,2,3. 1+2+3 = 6
 * Sum of the factors is equal to the given number. So this is perfect
 *
 * Input : 8
 * Output : Not Perfect Number
 *
 * Explaination
 * -------------------------
 * Factors of 8 = 1,2,4, but 1+2+4 = 7 not equal to 8.
 */
public class Perfect_Number {
    public static void main(String[] args) {
        int num = 7,sum = 0;
        for (int i=1;i<num;i++) {
            if ((num % i) == 0) {
                sum += i;
            }
        }
        if (num == sum) {
            System.out.println(num + " is a perfect number");
        }
        else {
            System.out.println(num + " is not perfect number");
        }
    }
    public static boolean isPerfect(int n)
    {
        int sum = 0;
        for (int i = 1; i < n; i++)
        {
            if(n % i == 0)
            {
                sum += i;
            }
        }
        if(sum == n)
        {
            return true;
        }
        return false;
    }
}
