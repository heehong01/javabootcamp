package com.heejinhong.InClass;

import java.util.function.IntPredicate;

public class Main {
    public static void main(String[] args) {
        Calculator multiply = (x,y ) -> x * y;
        Calculator add = (x, y) -> x + y;
        int multipliedResult = multiply.calculate(1, 3);
        int addedResult = add.calculate(2, 3);
        System.out.println(multipliedResult);
        System.out.println(addedResult);
        myMethod((x,y)->x+y, (x,y)->x*y);

        IntPredicate predicate = x -> x < 10;
        boolean test = predicate.test(15);
        System.out.println(test);
    }

    public static void myMethod(Calculator m , Calculator d ){
        int int1 = m.calculate(4,5);
        int int2 = d.calculate(3, 4);
        System.out.println(int1 + " " + int2);
    }
}

@FunctionalInterface
interface Calculator {
    int calculate(int x, int y);
}
