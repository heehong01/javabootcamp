package com.heejinhong.InClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class WeekThreeFridayChallengeExercise {
    public static void main(String[] args) {
        Integer[] myArray = {3, 9, 8, 5, 4};
        for (Integer i : myArray) {
            System.out.println(i);
        }

        //ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(3, 9, 8, 5, 4));
        List<Integer> intList = Arrays.asList(3, 9, 8, 5, 4);
        System.out.println("Lambda Refactor:");
        intList.forEach(i -> System.out.println(i));
        System.out.println("Stream version:");
        //intList.forEach(System.out::println
        intList.stream().filter(n-> n%2 ==0).forEach(System.out::println);

        //ITERATOR VERSION
        //Iterator itr = myList.iterator();

    }


}
