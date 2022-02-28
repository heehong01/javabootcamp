package com.heejinhong.Java1;

import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        arrayIntofThree();
        int[] array = new int[]{13,5,7,68,2};
        System.out.println(middleValue(array));
        arrayCopy();
        arraylength();
        arrayfiveloop();
        arrayfivemult();
        arrayexceptmiddle();
        stringswap();
        intArraySort();
        arrayMultType();
    }
    /*Write a program that creates an array of integers with a length of 3. Assign the values 1, 2,
    and 3 to the indexes. Print out each array element.*/
    public static void arrayIntofThree(){
        int[] arraythree = new int[]{1, 2, 3};
        for(int x:arraythree){
            System.out.println(x);
        }
    }

    /*Write a program that returns the middle element in an array. Give the following values to the
    integer array: {13, 5, 7, 68, 2} and produce the following output: 7*/
    public static int middleValue(int [] array){
        int midlength;
        int length = array.length;
        if(length % 2 == 0){
            midlength = length/2 - 1;
        }
        else{
            midlength = length/2;
        }
        return array[midlength];
    }

    /*Write a program that creates an array of String type and initializes it with the strings
    “red”, “green”, “blue” and “yellow”. Print out the array length. Make a copy using the clone( )
     method. Use the Arrays.toString( ) method on the new array to verify that the original array was
     copied.*/
    public static void arrayCopy(){
        String[] colors = new String[]{"red", "green", "blue", "yellow"};
        System.out.println(colors.length);
        String[] cloneColors = colors.clone();
        System.out.println(Arrays.toString(cloneColors));
    }

    /*Write a program that creates an integer array with 5 elements (i.e., numbers). The numbers can be
    any integers.  Print out the value at the first index and the last index using length - 1 as the index.
    Now try printing the value at index = length ( e.g., myArray[myArray.length ] ).  Notice the type of
    exception which is produced. Now try to assign a value to the array index 5. You should get the same
    type of exception.*/
    public static void arraylength(){
        int[] array = new int[]{12, 32, 123, 54, 127};
        System.out.printf("first index %d\n", array[0]);
        System.out.printf("last index %d\n", array[array.length - 1]);
        //System.out.printf("printing value at length %d\n", array[array.length]);
        //System.out.printf("printing value at index 5 %d\n", array[5]);
    }

    /*Write a program where you create an integer array with a length of 5. Loop through the array and
    assign the value of the loop control variable (e.g., i) to the corresponding index in the array.*/
    public static void arrayfiveloop(){
        int[] array = new int[5];
        for(int i = 0; i < array.length; i++){
            array[i] = i;
        }
    }

    /*Write a program where you create an integer array of 5 numbers. Loop through the array and assign the
    value of the loop control variable multiplied by 2 to the corresponding index in the array.*/
    public static void arrayfivemult(){
        int[] array = new int[5];
        for(int i = 0; i < array.length; i++){
            array[i] = i*2;
        }
    }

    /*Write a program where you create an array of 5 elements. Loop through the array and print the value
    of each element, except for the middle (index 2) element.*/
    public static void arrayexceptmiddle(){
        int[] array = new int[]{53,23,56,42,153};
        for(int i = 0; i < array.length; i++){
            if(i == 2){
                continue;
            }
            System.out.println(array[i]);
        }
    }

    /*Write a program that creates a String array of 5 elements and swaps the first element with the middle
     element without creating a new array.*/
    public static void stringswap(){
        String[] array = new String[]{"hello", "good bye", "yolo", "fomo", "hiya"};
        String temp = array[0];
        array[0]=array[2];
        array[2]=temp;
    }


    /*Write a program to sort the following int array in ascending order: {4, 2, 9, 13, 1, 0}. Print the array in ascending order, print the smallest and the largest element of the array. The output will look like the following:
    Array in ascending order: 0, 1, 2, 4, 9, 13

    The smallest number is 0

    The biggest number is 13*/
    public static void intArraySort(){
        int[] array = new int[]{4, 2, 9, 13, 1, 0};
        int counter = 0;
        int temp;
        for(int i = 0; i < array.length; i++){
            for(int j = 1; j < array.length; j++){
                if(array[i] > array[j]){
                    counter++;
                }
            }
            temp = array[counter];
            array[counter] = array[i];
            array[i] = temp;
            counter = 0;
        }
        //Arrays.sort(array); using the Arrays.sort() method to sort
        System.out.println(Arrays.toString(array));
    }


    /*Create an array that includes an integer, 3 strings, and 1 double. Print the array.*/
    public static void arrayMultType(){
        Object[] array = new Object[]{1, "String 1", "string 2", "String 3", 2.9};
        System.out.println(Arrays.toString(array));
    }
}
