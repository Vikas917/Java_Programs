package IPA_15;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_Names_Alphabetically {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = new String[3];
        String name = "";

        for (int i = 0; i < str.length; i++) {
            str[i] = sc.nextLine();
        }
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));

        for (int i=0;i<str.length;i++) {
            for (int j=i+1;j< str.length;j++) {
                if (str[i].compareTo(str[j]) > 0) {
                    name = str[i];
                    str[i] = str[j];
                    str[j] = name;
                }
            }
        }
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
    }
}
