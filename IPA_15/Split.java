package IPA_15;

import java.util.Scanner;

public class Split {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ISBN: ");
        String isbn = sc.nextLine();
        String[] data = ExtractElement(isbn);
        if(data!=null)
        {
            int i=0;
            System.out.println("GSI Prefix: "+data[i++]);
            System.out.println("Group Identifier: "+data[i++]);
            System.out.println("Publisher Code: "+data[i++]);
            System.out.println("Item Number: "+data[i++]);
            System.out.println("Check Digit: "+data[i++]);
        }
    }
    public static String[] ExtractElement(String data)
    {
        String[] num = data.split("-");
        if(num.length==5)
        {
            return num;
        }
        return null;
    }
}
