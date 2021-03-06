package com.engeto.ifloop;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static int INVALID_INPUT = -1;
    /**
     * Read one integer. If given input cannot be converted to integer,
     * prints error and return -1;
     * @return Integer read or -1 if invalid input entered
     */
    public static int safeReadInt() {
        int result = INVALID_INPUT;
        String inputText = scanner.nextLine();
        try {
            result = Integer.parseInt(inputText);
        } catch (NumberFormatException ex) {
            System.err.println("Zadal jsi text, který nelze převést na celé číslo: "+inputText);
        }
        return result;
    }
    /**
     * Example of use of {@link Main#safeReadInt()}
     *
     * Read one integer from input and print it to output
     * @return integer from input
     */
    public static void readOneIntFromInputAndPrintIt() {
        System.out.println("Zadej číslo: ");
        int input = safeReadInt();
        System.out.println("Zadal jsi: "+input);
    }
    /**
     * Read integers from input and print them until negative
     * input.
     */
    public static void readIntsFromInputAndPrintItUntilNegative() {
        int input1;
        do {
        System.out.println("Zadej číslo: ");
        input1 = safeReadInt();
        if (input1 >= 0)
        System.out.println("Zadal jsi: " + input1);
    } while (input1 >= 0);
         }
    /**
     * Sum all input numbers (negative number terminates reading) and return result.
     * @return Sum of input numbers.
     */
    public static int sumAllInputUntilNegative() {
        int sum = 0;
        int input2;
        do{
            System.out.println("Zadej číslo: ");
            input2 = safeReadInt();
            sum = sum + input2;
        }  while (input2 >= 0);
        return sum;
    }
    /**
     * Store all input numbers in ArrayList (negative number terminates reading)
     * @return ArrayList of read values (terminating negative value is included)
     */
    public static ArrayList storeAllInputInArrayListUntilNegative() {

        ArrayList<Integer> result = new ArrayList<>();
        int i = 0;
        while (i >= 0) {
            System.out.println("Zadej číslo: ");
            i = safeReadInt();
            result.add(i);
        }
        return result;
    }
    /**
     * Print all integers from given list.
     * @param list List of integers to print.
     */
    public static void printAllIntegersFromList(ArrayList<Integer> list) {
        ArrayList<Integer> copyOfList = new ArrayList<Integer>(storeAllInputInArrayListUntilNegative());

        for (int i : copyOfList) {
            System.out.println(i);
        }
    }
    public static Integer sumAllIntegersFromList(ArrayList<Integer> list) {
<<<<<<< HEAD
        ArrayList<Integer> copyOfList2 = new ArrayList<Integer>(storeAllInputInArrayListUntilNegative());
        Integer sum1 = 0;
        for (int i : copyOfList2) {
=======

        Integer sum1 = 0;
        for (int i : list) {
>>>>>>> 06ee1e6 (Initial commit)
            sum1 = sum1 + i;
        }
        return sum1;
    }

    public static void main(String[] args) {
        // Example
        System.out.println("--- Example - read and print one number ---");
        readOneIntFromInputAndPrintIt();
        // ---
        System.out.println("--- Task 1 - read and print until negative ---");
        readIntsFromInputAndPrintItUntilNegative();
        // ---
        System.out.println("--- Task 2 - sum all until negative ---");
        System.out.println("Celkový součet je: " + sumAllInputUntilNegative());;
        // ---
        System.out.println("--- Task 3 - read to list until negative ---");
        ArrayList<Integer> list = storeAllInputInArrayListUntilNegative();
        System.out.println(list);
        // ---
        System.out.println("--- Task 4 - print all from list ---");
        printAllIntegersFromList(list);
        // ---
        System.out.println("--- Task 5 - sum all from list ---");
        System.out.println("Celkový součet je: " + sumAllIntegersFromList(list));
    }
}

