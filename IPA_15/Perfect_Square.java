package IPA_15;
//4,9,16,25,36,49,64 are perfect squares
public class Perfect_Square {
    public static void main(String[] args) {
        int num = 5;
        double sqrt = Math.sqrt(num);

        if ((int)sqrt == sqrt) {
            System.out.println(num + " is perfect square");
        }
        else {
            System.out.println(num + " is not perfect square");
        }
    }
}
