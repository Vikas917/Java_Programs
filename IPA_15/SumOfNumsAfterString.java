package IPA_15;

public class SumOfNumsAfterString {
    public static void main(String[] args) {
        String str = "ab12cd34";
        System.out.println(SumOfNums(str));
    }
    public static int SumOfNums(String str) {
        int sum = 0, count = 0;
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                count++;
            } else if (Character.isDigit(c)) {
                sum+=count;
            }
        }
        return sum;
    }
}
