package Java_Basics;//  Ternary operator is used as a single line replacement for if-then-else statements and acts upon three operands.

//Syntax: 

//       <condition> ? <value if condition is true> : < value if condition is false> 

public class TernaryOperator {
   public static void main(String args[]) {
       int numOne = 10;
       int numTwo = 5;
       int min = (numOne < numTwo) ? numOne : numTwo;
       System.out.println(min); //Output will be 5
   }
   //Here, first the condition (numOne < numTwo) is evaluated. The result is false and hence, min will be assigned the value numTwo.
}

// void main(){
//     System.out.println("dhb");
// }