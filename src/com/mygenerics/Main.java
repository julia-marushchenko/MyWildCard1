/**
 *  Java program to use wildcard with creating a method.
 */

package com.mygenerics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Creating lists with different types.
        ArrayList<Long> stringList = new ArrayList<>(Arrays.asList(11L, 12L, 13L));
        ArrayList<Integer> integerList = new ArrayList<>(Arrays.asList(1, 2, 3));

        // Calling method wildCardDemo() for ArrayList of strings.
        wildCardDemo(stringList);
        
        // Calling method wildCardDemo() for ArrayList of integers.
        wildCardDemo(integerList);
    }

    // Method to print elements of lists with wildcard type.
    static void wildCardDemo(List<? extends Number> list) {
        for (Object o : list) {
            System.out.println("The item is: " + o);
        }
    }
}
