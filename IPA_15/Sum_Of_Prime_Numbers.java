package IPA_15;

public class Sum_Of_Prime_Numbers {
    public static void main(String[] args) {
        String str = "2345678910";
        int sum = 0;
        for (int i=0;i<str.length();i++) {
            int num = Integer.parseInt(String.valueOf(str.charAt(i)));
            if (isPrime(str.charAt(i))) {
                sum += num;
            }
        }
        System.out.println("Sum of Prime digits: " + sum);
    }
    public static boolean isPrime(char str) {
        int n = Integer.parseInt(String.valueOf(str));
        if(n<2)
        {
            return false;
        }
        for (int i = 2; i < n; i++)
        {
            if(n % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}
