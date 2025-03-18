package IPA_15;

public class Even_Check {
    public static void main(String[] args) {
        String str = "15646431684";
        int count = 0;

        for (int i = 0;i<str.length();i++) {
            if ((Integer.parseInt(String.valueOf(str.charAt(i))) % 2) == 0) {
                count++;
            }
        }
        if (count > 3) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}
