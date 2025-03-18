package Java_Basics;
/*
 You will now have a look at some of the bitwise operators and how they work.

Bitwise OR(|)

It returns bit by bit OR of the input values. If either of the bits is 1, then it gives 1, else it gives 0. 

     E.g. - The output of 10 | 5 is 15.

                        1010
                    OR  0101
                       -------
                        1111

 

Bitwise AND(&) 
It returns bit by bit AND of the input values. If both the bits are 1, then it gives 1, else it gives 0.

       E.g. - The output of 10 & 5 is 0.

                            1010
                       AND  0101
                           -------
                            0000



Left shift operator(<<)

It takes two operators and left shifts the bits of the first operand. The second operand decides the number of places to shift. It fills 0 on voids left as a result. 

E.g. - The output of 10<<1 is 20 if the numbers are stored in 32 bit system.

              10 is represented as 00000000 00000000 00000000 00001010.

              After left shifting by 1 bit, the result becomes 00000000 00000000 00000000 000010100 which is 20.

             The 0 that is highlighted is present because of the void.

             Similarly, the output of 10<<2 is 40.

 

Signed Right shift operator(>>)

It takes two operators and right shifts the bits of the first operand. The second operand decides the number of places to shift. It fills 0 on voids left as a result if the first operand is positive else it fills 1.

     E.g. -

             Example of positive number

             The output of 10>>1 is 5.

              10 is represented as 00000000 00000000 00000000 00001010.

              After right shifting by 1 bit, the result becomes 00000000 00000000 00000000 00000101 which is 5.

 

             Example of negative number

             The output of -10>>1 is -5.

             -10 is represented as 11111111 11111111 11111111 11110110.

             After right shifting by 1 bit, the result becomes 11111111 11111111 11111111 11111011 which is -5.


Unsigned Right shift operator(>>>) -

     It takes two operators and right shifts the bits of the first operand. The second operand decides the number of places to shift. It fills       0 on voids left as a result.

     E.g. -

             Example of positive number

             The output of 10>>>1 is 5.

              10 is represented as 00000000 00000000 00000000 00001010.

              After right shifting by 1 bit, the result becomes 00000000 00000000 00000000 00000101 which is 5.

 

             Example of negative number

             The output of -10>>>1 is 214783643.

             -10 is represented as 11111111 11111111 11111111 11110110.

             After right shifting by 1 bit, the result becomes 01111111 11111111 11111111 11111011 which is 214783643.

 
 */


public class BitwiseOperators {
    public static void main(String[] args) {
        System.out.println(10>>>1);
        // Shift operator (<< and >>) is used to move the left operands value by
		// the number of bits specified.
		int a = 10;
		int b = 20;
		System.out.println(a << 2); // left-shift operator moves the value to
									// the left side
		System.out.println(b >> 3); // right-shift operator moves the value to
									// the right side

		// Unsigned right shift operator(>>>)
		System.out.println(a >> 2);
		System.out.println(a >>> 2);
		// works in the same way for positive numbers

		int c = -1;
		System.out.println(c >> 2);
		System.out.println(c >>> 2);

		// There is no unsigned left shift operator(<<<). The below line leads
		// to an error
		// System.out.println(a<<<2);

		// Bitwise operators are used to perform manipulation of individual bits

		// Logical OR(||) does not check second condition if first is true
		// Bitwise OR(|) always checks both conditions even if first condition
		// is true or false
		System.out.println(a | b);

		// Logical AND(&&) does not check second condition if first is false
		// Bitwise AND(&) checks both conditions even if first condition is true
		// or false
		System.out.println(a & b);
    }
}
