package com.heejinhong.InClass;

import java.sql.SQLOutput;
import java.util.function.*;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Hello";
        String suppliedString = supplier.get();
        System.out.println(suppliedString);

        Supplier<Integer> supplier2 = () -> 34;
        Integer integer = supplier2.get();
        System.out.println(integer);

        Consumer<Integer> myConsumer = x -> System.out.println(x);
        myConsumer.accept(341);
        BiConsumer<Integer, String> biConsumer
                = (x,y) -> System.out.println(x + " " + y);
        biConsumer.accept(45, "Joanna");

        Function<Integer, String> function
                = x -> x.toString();
        String apply = function.apply(24);
        System.out.println(apply);

        Predicate<Integer> predicate = x -> x > 10;
        boolean test = predicate.test(43);
        System.out.println(test);

    }

}
