package com.xworkz.runner;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ReverseSortIntegers {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(10);
        integers.add(5);
        integers.add(15);
        integers.add(20);
        integers.add(1);

        System.out.println("Integers before sorting:");
        integers.forEach(System.out::println);

        // Sort integers in reverse order using a comparator
        integers.sort(Comparator.reverseOrder());

        System.out.println("\nIntegers sorted in reverse order:");
        integers.forEach(System.out::println);
    }
}
