package Calculator;
import java.util.*;
class prg {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter a number: ");
            int n = sc.nextInt();
            if (n % 5 == 0 && n % 11 == 0) {
                System.out.println("BOTH");
            } else if (n % 5 == 0 || n % 11 == 0) {
                System.out.println("ONE");
            } else {
                System.out.println("NONE");
            }
        } finally {
            // Always close the Scanner in the finally block to ensure it gets closed even if an exception occurs.
            sc.close();
        }
    }
}
