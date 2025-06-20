package com.xworkz.runner;

import com.xworkz.task.Person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PersonRunner {
    public static void main(String[] args) {


        List<Person> people = Arrays.asList(
                new Person("Darshan", 35),
                new Person("Anusha", 28),
                new Person("Bhavana", 30),
                new Person("Chandan", 28)
        );

        System.out.println("Original list:");
        people.forEach(System.out::println);

        // Sort using Comparable (by age)
        List<Person> sortedByAge = people.stream()
                .sorted() // uses compareTo
                .collect(Collectors.toList());

        System.out.println("\nSorted by age (Comparable via stream):");
        sortedByAge.forEach(System.out::println);

        // Sort by name using stream
        List<Person> sortedByName = people.stream()
                .sorted(Person.nameComparator)
                .collect(Collectors.toList());

        System.out.println("\nSorted by name (Comparator via stream):");
        sortedByName.forEach(System.out::println);

        // Sort by age using stream and lambda
        List<Person> sortedByAgeAgain = people.stream()
                .sorted(Comparator.comparingInt(Person::getAge))
                .collect(Collectors.toList());

        System.out.println("\nSorted by age again (Comparator via stream):");
        sortedByAgeAgain.forEach(System.out::println);
    }
}
