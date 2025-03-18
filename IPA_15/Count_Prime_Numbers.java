package IPA_15;

import java.util.Scanner;

public class Count_Prime_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        int count = 0;
        for (int i=0;i<num.length();i++) {
            int number = Integer.parseInt(String.valueOf(num.charAt(i)));

            if (isPrime(number)) {
                count++;
            }
        }
        System.out.println(count);
    }
    public static boolean isPrime(int num) {
        boolean flag = false;
        if (num > 1) {
            for (int i = 2;i < num+1; i++) {
                if (num % i == 0){
                    break;
                }
                else {
                    flag = true;
                }
            }
        }
        return flag;
    }
}
