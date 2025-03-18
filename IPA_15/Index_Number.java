package IPA_15;

public class Index_Number {
    public static void main(String[] args) {
        String str = "CaRroT";
        char c = 'r';  // Use single quotes for char
        int ind  = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) { //  OR    if(str.contains(String.valueOf(c))
                System.out.println(i);
                ind++;
                break;
            }
        }
        if (ind == 0) {
            System.out.println("Not Found");
        }
    }
}
