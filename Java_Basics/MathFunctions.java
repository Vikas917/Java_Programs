package Java_Basics;

public class MathFunctions {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        System.out.println(Math.max(a, b));
        System.out.println(Math.min(a, b));

        //System.out.println(Math.abs(a, b)); // Abs function is not applicable for Integer Values
        System.out.println(Math.abs(-5.7));

        System.out.println(Math.pow(a, b));
        System.out.println(Math.sqrt(a));
    }
}
