package com.heejinhong.Java1;


public class operatorsAndNumbers {
    public static void main(String[] args){
        /*Write the following integers in binary notation. Do not use any Java functions or
        online conversion applications to calculate the answer as this will hinder the
        learning process and your understanding of the concept. However, you may check your
        answers using Java methods.
        1 -> 1
        8 -> 1000
            8/2 = 4 R 0
            4/2 = 2 R 0
            2/2 = 1 R 0
            1/2 = 0 R 1
        33 -> 100001
            33/2 = 16 R 1
            16/2 = 8 R 0
            8/2 = 4 R 0
            4/2 = 2 R 0
            2/2 = 1 R 0
            1/2 = 0 R 1
        78 -> 1001110
            78/2 = 39 R 0
            39/2 = 19 R 1
            19/2 = 9 R 1
            9/2 = 4 R 1
            4/2 = 2 R 0
            2/2 = 1 R 0
            1/2 = 0 R 1
        787 -> 1100010011
            787/2 = 393 R 1
            393/2 = 196 R 1
            196/2 = 98 R 0
            98/2 = 49 R 0
            49/2 = 24 R 1
            24/2 = 12 R 0
            12/2 = 6 R 0
            6/2 = 3 R 0
            3/2 = 1 R 1
            1/2 = 0 R 1
        33,987 -> 1000010011000011
            33987/2 = 16993 R 1
            16993/2 = 8496 R 1
            8496/2 = 4248 R 0
            4248/2 = 2124 R 0
            2124/2 = 1062 R 0
            1062/2 = 531 R 0
            531/2 = 265 R 1
            265/2 = 132 R 1
            132/2 = 66 R 0
            66/2 = 33 R 0
            33/2 = 16 R 1
            16/2 = 8 R 0
            8/2 = 4 R 0
            4/2 = 2 R 0
            2/2 = 1 R 0
            1/2 = 0 R 1
        */

        /*Convert the following binary numbers to decimal notation. Do not use any Java
        functions or online conversion applications to calculate the answer as this will
        hinder the learning process and your understanding of the concept. However, you may
        check your answers using Java methods.
        0010 -> 2
            = 0*2^3 + 0*2^2 + 1*2^1 + 0*2^0
            = 0 + 0 + 2 + 0
            = 2
        1001 -> 9
            = 1*2^3 + 0*2^2 + 0*2^1 + 1*2^0
            = 8 + 0 + 0 + 1
            = 9
        0011 0100 -> 52
            = 0*2^7 + 0*2^6 + 1*2^5 + 1*2^4 + 0*2^3 + 1*2^2 + 0*2^1 + 0*2^0
            = 0 + 0 + 32 + 16 + 0 + 4 + 0 + 0
            = 52
        0111 0010 -> 114
            = 0*2^7 + 1*2^6 + 1*2^5 + 1*2^4 + 0*2^3 + 0*2^2 + 1*2^1 + 0*2^0
            = 0 + 64 + 32 + 16 + 0 + 0 + 2 + 0
            = 114
        0010 0001 1111 -> 543
            = 0*2^11 + 0*2^10 + 1*2^9 + 0*2^8 + 0*2^7 + 0*2^6 + 0*2^5 + 1*2^4 + 1*2^3 + 1*2^2 + 1*2^1 + 1*2^0
            = 0 + 0 + 512 + 0 + 0 + 0 + 0 + 16 + 8 + 4 + 2 + 1
            = 543
        0010 1100 0110 0111 -> 11367
            = 0*2^15 + 0*2^14 + 1*2^13 + 0*2^12 + 1*2^11 + 1*2^10 + 0*2^9 + 0*2^8 + 0*2^7 + 1*2^6 + 1*2^5 + 0*2^4 + 0*2^3 + 1*2^2 + 1*2^1 + 1*2^0
            = 0 + 0 + 8192 + 0 + 2048 + 1024 + 0 + 0 + 0 + 64 + 32 + 0 + 0 + 4 + 2 + 1
            = 11367
        */

        /*Write a program that declares an integer a variable x and assigns the value 2 to
        it and prints out the binary string version of the number
        ( Integer.toBinaryString(x) ). Now, use the left shift operator (<<) to shift by 1
        and assign the result to x. Before printing the results, write a comment with the
        predicted decimal value and binary string. Now, print out x in decimal form and in
        binary notation.
        Do the preceding exercise with the following values:

        9
        17
        88 */

        int x = 2;
        System.out.println(Integer.toBinaryString(x));
        x = x << 1; //Should be the binary value of 1??
        System.out.println("New value of x is: " + x);
        System.out.println("Binary value of new x is: " + Integer.toBinaryString(x));



        /*Write a program that declares a variable x and assigns 150 to it and prints out
        the binary string version of the number. Now use the right shift operator (>>) to
        shift by 2 and assign the result to x. Write a comment indicating what you
        anticipate the decimal and binary values to be. Now print the value of x and the
        binary string.
        Do the preceding exercise with the following values:

        225
        1555
        32456*/


        /*Write a program that declares 3 int variables x, y, and z. Assign 7 to x and 17 to
        y. Write a comment that indicates what you predict will be the result of the
        bitwise & operation on x and y. Now use the bitwise & operator to derive the
        decimal and binary values and assign the result to z.
        Now, with the preceding values, use the bitwise | operator to calculate the “or”
        value between x and y. As before, write a comment that indicates what you predict
        the values to be before printing them out.
        */


        /*Write a program that declares an integer variable, assigns a number, and uses a
        postfix increment operator to increase the value. Print the value before and after
        the increment operator.
        */

        /*Write a program that demonstrates at least 3 ways to increment a variable by 1 and
        does this multiple times. Assign a value to an integer variable, print it, increment
        by 1, print it again, increment by 1, and then print again.
        */

        /*Write a program that declares 2 integer variables, x, and y, and then assigns 5 to
        x and 8 to y. Create another variable sum and assign the value of ++x added to y and
        print the result. Notice the value of the sum (should be 14). Now change the
        increment operator to postfix (x++) and re-run the program. Notice what the value of
        sum is. The first configuration incremented x and then calculated the sum while the
        second configuration calculated the sum and then incremented x.
        */

    }

}