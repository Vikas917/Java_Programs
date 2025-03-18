package Calculator;
import java.util.*;
 class sum
{
    public static void main(String args[])
    {
        int i,sum=0,a;
        try(Scanner sc = new Scanner(System.in)){
        //System.out.println("Enter 2 numbers:");
        a=sc.nextInt();
        for(i=1;i<=a;i++)
        {
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
}
        