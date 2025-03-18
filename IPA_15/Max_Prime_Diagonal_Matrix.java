package IPA_15;
/* 12 4 8
    5 7 6
    4 8 13

    Maxumum prime of the 2 diagonals 13
*/
import java.util.Arrays;
import java.util.Scanner;

public class Max_Prime_Diagonal_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows & columns : ");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int[] diag1 = new int[n];
        int[] diag2 = new int[n];

        for (int i=0;i< n;i++) {
            for (int j=0;j<n;j++) {
                arr[i][j] = sc.nextInt();
                if (i == j) {
                    diag1[i] = arr[i][j];
                }
            }
        }
        for (int i=0;i< n;i++) {
            for (int j = n-1; j >= 0; j--) {
                if (i == (n-1-j)) {
                    diag2[i] = arr[i][j];
                }
            }
        }
        System.out.println(Arrays.toString(diag1));
        System.out.println(Arrays.toString(diag2));

        int[] res = new int[diag1.length + diag2.length];
        System.arraycopy(diag1,0,res,0,diag1.length);
        System.arraycopy(diag2,0,res,diag1.length,diag2.length);
        System.out.println(Arrays.toString(res));

        int[] prime = new int[0];
        for (int i=0;i< res.length;i++) {
            int check = 0;
            for (int j=2;j<res[i];j++) {
                if (res[i] % j == 0) {
                    check++;
                }
            }
            if (check  == 0) {
                prime = Arrays.copyOf(prime,prime.length+1);
                prime[prime.length-1]=res[i];
            }
        }
        System.out.println(Arrays.toString(prime));

        int max = 0;
        for (int i=0;i< prime.length;i++) {
            if (prime[i] > max) {
                max = prime[i];
            }
        }
        System.out.println("The maximum prime number of 2 diagonals is : " + max);
    }
}
