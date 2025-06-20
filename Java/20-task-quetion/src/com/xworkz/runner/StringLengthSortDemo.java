package com.xworkz.runner;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StringLengthSortDemo {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("apple");
        strings.add("banana");
        strings.add("kiwi");
        strings.add("grape");

        System.out.println("Strings before sorting:");
        strings.forEach(System.out::println);

        // Sort strings by length using a custom comparator
        strings.sort(Comparator.comparingInt(String::length));

        System.out.println("\nStrings sorted by length:");
        strings.forEach(System.out::println);
    }
}

