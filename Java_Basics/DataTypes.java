//import javax.xml.crypto.Data;
package Java_Basics;
public class DataTypes {
    public static void main(String[] args) {
        int myNum = 5;               // Integer (whole number)
        float myFloatNum = 5.99f;    // Floating point number
        char myLetter = 'D';         // Character
        boolean myBool = true;       // Boolean
        String myText = "Hello";     // String

        System.out.println(myNum);
        System.out.println(myFloatNum);
        System.out.println(myLetter);
        System.out.println(myBool);
        System.out.println(myText);

        //Data types are divided into two groups:

        //Primitive data types - includes byte, short, int, long, float, double, boolean and char.

        //Non-primitive data types - such as String, Arrays and Classes


        /*
         Primitive Data Types - 

        A primitive data type specifies the size and type of variable values, and it has no additional methods.

        There are eight primitive data types in Java:

        Data Type	       Size	                 Description
    (1) byte	          1 byte	      Stores whole numbers from -128 to 127
    (2) short	          2 bytes	      Stores whole numbers from -32,768 to 32,767
    (3) int	              4 bytes	      Stores whole numbers from -2,147,483,648 to 2,147,483,647
    (4) long	          8 bytes	      Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
    (5) float	          4 bytes	      Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
    (6) double	          8 bytes	      Stores fractional numbers. Sufficient for storing 15 decimal digits
    (7) boolean	          1 bit	          Stores true or false values
    (8) char	          2 bytes	      Stores a single character/letter or ASCII values


    //Non-Primitive Data Types -
                                Non-primitive data types are called reference types because they refer to objects.

    The main difference between primitive and non-primitive data types are:

(1) Primitive types are predefined (already defined) in Java. Non-primitive types are created by the programmer and is not defined by Java (except for String).
(2) Non-primitive types can be used to call methods to perform certain operations, while primitive types cannot.
(3) A primitive type always has a value, while non-primitive types can be null.
(4) A primitive type starts with a lowercase letter, while non-primitive types starts with an uppercase letter.

         */
    }
}
