package com.CyberDimon.Chapter8;

import java.util.Scanner;

public class MyArrays {

    private static Scanner scanner= new Scanner(System.in);
    public static void main(String[] args) {

        int[] myIntArray = new int[25];
        int[] myIntegers = getIntegers(5);

        for(int i = 0; i<myIntegers.length; i++) {
            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
        }

        System.out.println("Average is: " + getAverage(myIntegers));

        //printArray(myIntArray);

        //int[] myIntArray = new int[10];
        //int[] myIntArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //double[] myDoubleArray = new double[10];
        //System.out.println(myIntArray[9]);
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for(int i=0; i<values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static void printArray(int[] array) {
        for(int i=0; i<array.length; i++) {
            //array[i] = i*10;
            System.out.println("Element " + i + " is: " + array[i]);
        }
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for(int i=0; i<array.length; i++) {
            sum += array[i];
        }
        return ( (double) sum / (double) array.length);
    }
}