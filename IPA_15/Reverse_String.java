package IPA_15;

public class Reverse_String {
    public static void main(String[] args) {
        String str = "vikas";

//        for (int i=str.length()-1;i>=0;i--) {
//            System.out.print(str.charAt(i) + "");
//        }

        String newStr = "";
        for (int i=0;i<str.length();i++) {
            newStr = str.charAt(i) + newStr;
        }
        System.out.println(newStr);
    }
}
