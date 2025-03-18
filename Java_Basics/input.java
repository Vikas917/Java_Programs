package Java_Basics;

import java.util.*;
 class input
{
    public static void main(String args[])
    {
        //int a,b,c;
        try(Scanner sc = new Scanner(System.in)){
        System.out.println("Enter 2 numbers:");
        // a=sc.nextInt();
        // b=sc.nextInt();
        // c=a+b;
        // System.out.println("Sum is "+c);

        // float d = sc.nextFloat();
        // long  e = sc.nextLong();
        // char f = sc.next().charAt(0);
        // boolean g = sc.nextBoolean();
        // double h = sc.nextDouble();
        // short  i = sc.nextShort();

        String j = sc.next(); //It will show output "Tony" only if input is "Tony Stark".
        //String k = sc.nextLine();  //It will show output "Tony Stark" only if input is "Tony Stark".
        
        System.out.println(j);
        //System.out.println(k);
    }
}
}
