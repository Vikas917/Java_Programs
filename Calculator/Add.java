package Calculator;
public class Add {
    public static void main(String[] args) {
        int a = 55;
        int b = 10;
        int temp;
        System.out.println("Addition: "+ (a+b));
        System.out.println("Substraction: "+ (a-b));
        System.out.println("MUltition: "+ (a*b));
        System.out.println("Division: "+ (float)(a/b));
        System.out.println("Modulo: "+ (a%b));

        temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);
    }
}
