package com.xworkz.runner;

import com.xworkz.task.Student;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StudentRunner {

        public static void main(String[] args) {


            List<Student> students = Arrays.asList(
                    new Student("Alice", 3.6),
                    new Student("Bob", 3.9),
                    new Student("Charlie", 3.2)
            );

            List<Student> sortedStudents = students.stream()
                    .sorted(Comparator.comparingDouble(Student::getGpa).reversed())
                    .collect(Collectors.toList());

            sortedStudents.forEach(System.out::println);
        }
    }


