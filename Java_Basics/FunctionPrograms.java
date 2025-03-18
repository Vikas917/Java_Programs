package Java_Basics;

public class FunctionPrograms {
    public static int Factorial(int n){
        int fact = 1;
        for(int i = n; i >= 1; i--) {
            fact *= i;
        }
        return fact;
    }
    public static int Fibonacci(int num) {
        if(num == 0){
            return 0;
        }
        else if(num == 1) {
            return 1;
        }
        else{
            return Fibonacci(num - 1) + Fibonacci(num - 2); //Fibonacci Series using Recursion
        }
    }
    public static void CircleFunction(double r){
        double pi = 3.14;
        double area = pi * r * r;
        System.out.println("Area of Cicle is: " + area);

        double circumference = 2 * Math.PI * r;
        System.out.println("Circumference of circle is: " + circumference);
        return;

    }
    public static int OddSumFunction(int num){
        int sum = 0;
        for(int i = 1; i <= num; i++) {  // Start from 1 and include num
            if(i % 2 != 0) {  // Check if the number is odd
                sum += i;
            }
        }
        return sum;
    }
    public static int findGCD(int n1, int n2) {
        while(n2 != 0) {
            int temp = n2;
            n2 = n1 % n2;
            n1 = temp;
        }
        return n1;
    }
    public static void main(String[] args) {
        int f = Factorial(5);
        System.out.println("Factorial of %d is " + f);

        int num = 5;
        for(int i = 1; i <= num; i++) {
            System.out.println(Fibonacci(i));
        }

        CircleFunction(4.0);

        System.out.println(OddSumFunction(5));

        System.out.println(findGCD(56, 98));
    }
}
