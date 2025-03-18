package Java_Basics;

import java.util.Scanner;
//  Exception class has 3 methods :-
//                                     (1) String toString()
//                                     (2) String getMessage()
//                                     (3) void printStackTrace()



//  Custom Exception - Exception made by the User
class NegativeRadiusException extends Exception {
    @Override
    public String toString() {
        return "Please Give Positive Radius";
    }
    @Override
    public String getMessage() {
        return "Please Give Positive Radius";
    }
}


public class ExceptionHandling {

    static double divide(int radius) throws NegativeRadiusException {
        if (radius < 0) {
            throw new NegativeRadiusException();
        }
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {

        try {
            double ar = divide(-1);
            System.out.println(ar);
        } catch (NegativeRadiusException e) {
            System.out.println(e);
        }

//        int a;
//        Scanner sc = new Scanner(System.in);
//        a = sc.nextInt();
//        if (a < 10) {
//            try {
//                //throw new MyException();
//                throw new ArithmeticException("This is an exception");
//            }
//            catch (Exception e) {
//                System.out.println(e.getMessage());

//                System.out.println(e.toString());
//                System.out.println(e);
//                e.printStackTrace();
//            }
//        }
//        try {
//            int result = 10 / 0;  // This will cause an ArithmeticException
//        } catch (ArithmeticException e) {
//            e.printStackTrace();   // Prints the exception and the stack trace
//        }

//        int a = 6;
//        int b = 0;
//        int marks[] = {90,95,98};
//
//        try {
//            System.out.println("Start of the Program");
//            try {
//                System.out.println(a/b);
//            } catch (ArithmeticException e) {
//                System.out.println("ArithmeticException Divide by 0");
//                System.out.println(e);
//            }
//            try {
//                System.out.println(marks[5]);
//            } catch (ArrayIndexOutOfBoundsException e) {
//                System.out.println("ArrayIndexOutOfBoundsException");
//                System.out.println(e);
//            }
//        }
//        catch (Exception e) {
//            System.out.println("Unexpected Error");
//            System.out.println(e);
//        }
//        System.out.println("End of the program");
    }
}
