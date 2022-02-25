package com.heejinhong.Java1;

public class loops {

    /*Write a program that uses a for-loop to loop through the numbers 1-10 and prints out each number.*/
    public static void countToTen(){
        for(int counter = 1; counter < 11; counter++) {
            System.out.println(counter);
        }
    }

    /*Write a program that uses a while loop to loop through the numbers 0-100 in increments of 10 and prints out each number.*/
    public static void countToOneHundred() {
        int counter = 0;
        while (counter < 101) {
            System.out.println(counter);
            counter += 10;
        }
    }

    /*Write a program that uses a do-while-loop to loop through the numbers 1-10 and prints out each number.*/
    public static void countToTenDoWhile() {
        int number = 0;
        do {
            System.out.println(number);
            number++;
        }
        while (number < 101);
    }

        /*Write a program that uses a for-loop to loop through the numbers 1-100. Print out each number
        if is a multiple of 5, but do not print out any numbers between 25 and 75. Use the “continue” statement to accomplish this.*/
    public static void oneToOneHundredForLoop() {
        for (int i = 1; i < 101; i++) {
            if (i > 25 && i < 75) {
                continue;
            } else if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }

        /*Write a program that uses a for-loop to loop through the numbers 1-100. Print out each number if is a multiple of 5,
        but do not print out any numbers greater than 50. Use the “break” keyword to accomplish this.*/
    public static void multipleOfFive() {
        for (int i = 1; i < 101; i++) {
            if (i > 50) {
                break;
            } else if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }

        /*Write a program that uses nested for-loops to output the following:
        Week 1:

        Day 1

        Day 2

        Day 3

        Day 4

        Day 5

        Week 2:

        Day 1

        Day 2

        Day 3

        Day 4

        Day 5*/
    public static void weekday() {
        for (int i = 1; i < 3; i++) {
            System.out.printf("Week %d:\n\n", i);
            for (int j = 1; j < 6; j++) {
                System.out.printf("Day %d\n\n", j);
            }
        }
    }

    /*Write a program that returns all the available palindromes within 10 and 200. The following output will be produced:
     11, 22, 33, 44, 55, 66, 77, 88, 99, 101, 111, 121, 131, 141, 151, 161, 171, 181, 191,*/
    public static void palindromes() {
        int reversedNum = 0, x = 0;
        for (int i = 10; i < 201; i++) {
            x = i;
            while (x != 0) {
                reversedNum = reversedNum * 10 + x % 10;
                x /= 10;
            }
            if (i == reversedNum) {
                System.out.printf("%d, ", i);
            }
            reversedNum = 0;
        }
        System.out.println();
    }

    /*Write a program that prints the Fibonacci Sequence from 0 to 50. The following output will be produced: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34,*/
    public static void fibonacci() {
        int num = 0, numNext = num + 1, temp;
        while (num < 51) {
            System.out.printf("%d, ", num);
            temp = numNext;
            numNext += num;
            num = temp;
        }
        System.out.println();
    }

        /*Write a program that nests a for-loop inside another. Print out the inner and outer variable (e.g., i or j)
        in the inner loop (e.g., System.out.println("Inner loop: i: " + i + ", j: " + j);).*/
    public static void nestedForLoop() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Inner loop i : %d, j: %d\n", i, j);
            }
        }
    }

}
