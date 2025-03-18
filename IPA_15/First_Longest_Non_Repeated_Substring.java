package IPA_15;

// Find the first non repeated character substring
//Arijit = Arij

public class First_Longest_Non_Repeated_Substring {
    public static void main(String[] args) {
        String str = "Arijit";
        String newStr = "";
        int count = 0;

        for (int i = 0;i < str.length();i++) {
            for (int j = 0;j <= i;j++) {
                if (i == j) {
                    newStr += str.charAt(i);
                }
                else if (str.charAt(i) == str.charAt(j)) {
                    count++;
                    break;
                }
            }
            if (count > 0) {
                break;
            }
        }
        System.out.println(newStr);
    }
}
