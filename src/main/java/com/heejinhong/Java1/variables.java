package com.heejinhong.Java1;

public class variables {
    public static void main(String[] args){
        sumOfTwoInt();
        sumOfTwoDouble();
        sumOfIntAndDouble();
        divideByBiggerInt();
        divideByBiggerDouble();
        castingDoubleToInt();
        calculateHeightWithFinalInt();
        cafeOrder();
    }
    /* Write a program that declares 2 integer variables, assigns an integer to each,
        and adds them together. Assign the sum to a variable. Print out the result.*/
    public static void sumOfTwoInt(){
        int a = 10;
        int b = 2;
        int sumAB = a + b;
        System.out.println(sumAB);
    }

    /*Write a program that declares 2 double variables, assigns a number to each,
    and adds them together. Assign the sum to a variable. Print out the result.*/
    public static void sumOfTwoDouble(){
        double c = 12;
        double d = 10;
        double sumCD = c + d;
        System.out.println(sumCD);
    }

    /*Write a program that declares an integer variable and a double variable,
    assigns numbers to each, and adds them together. Assign the sum to a variable.
    Print out the result. What variable type must the sum be? */
    public static void sumOfIntAndDouble(){
        int e = 1;
        double f = 10.4;
        double sumEF = e + f;
        System.out.println(sumEF);
    }

    /* Write a program that declares 2 integer variables, assigns an integer to each,
    and divides the larger number by the smaller number. Assign the result to a
    variable. Print out the result. Now change the larger number to a decimal. What
    happens? What corrections are needed? */
    public static void divideByBiggerInt(){
        int g = 4;
        int h = 6;
        int val;
        if(g > h){
            val = g/h;
            System.out.println(val);
            g = (int) 0.5;
        }
        else{
            val = h/g;
            System.out.println(val);
            h = (int) 0.5;
        }
    }

    /*Write a program that declares 2 double variables, assigns a number to each,
    and divides the larger by the smaller. Assign the result to a variable. Print out
    the result. Now, cast the result to an integer. Print out the result again. */
    public static void divideByBiggerDouble(){
        double i = 9.1;
        double j = 8.2;
        double valIJ;
        if(i>j){
            valIJ = i/j;
        }
        else{
            valIJ = j/i;
        }
        System.out.println(valIJ);
        int intval = (int) valIJ;
        System.out.println(intval);
    }

    /* Write a program that declares 2 integer variables, x, and y, and assign 5 to x
    and 6 to y. Declare a variable q and assign y/x to it and print q. Now, cast y
    to a double and assign to q. Print q again.*/
    public static void castingDoubleToInt(){
        int x = 5;
        int y = 6;
        double q = y/x;
        System.out.println(q);
        q = (double) y;
        System.out.println(q);
    }

    /*Write a program that declares a named constant and uses it in a calculation.
    Print the result.*/
    public static void calculateHeightWithFinalInt(){
        final int height = 60;
        double height_cm = height*2.54;
        System.out.println("Height in cm: " + height_cm);
    }

    /*Write a program where you create 3 variables that represent products at a cafe.
    The products could be beverages like coffee, cappuccino, espresso, green tea, etc.
    Assign prices to each product. Create 2 more variables called subtotal and
    totalSale and complete an “order” for 3 items of the first product, 4 items of
    the second product, and 2 items of the third product. Add them all together to
    calculate the subtotal. Create a constant called SALES_TAX and add sales tax to
    the subtotal to obtain the totalSale amount. Be sure to format the results to 2
    decimal places.*/
    public static void cafeOrder(){
        double latte = 4.99;
        double greenTea = 2.99;
        double hotChocolate = 3.99;
        double subtotal;
        double totalSale;
        subtotal = 3*latte + 4*greenTea + 2*hotChocolate;
        final double SALES_TAX = 0.08;
        totalSale = subtotal*SALES_TAX + subtotal;
        System.out.printf("Total Sale is: %.2f", totalSale);
    }

}

