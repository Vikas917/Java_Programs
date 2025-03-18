package IPA_15;

public class Unique_Characters {
    public static void main(String[] args) {
        String str = "apple";
        String temp = "";

        for (int i=0;i<str.length();i++) {
            if (!temp.contains(Character.toString(str.charAt(i)))) {
                temp += str.charAt(i);
            }
        }
        System.out.println(temp);
    }
}
