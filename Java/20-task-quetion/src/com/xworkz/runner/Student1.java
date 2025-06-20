package com.xworkz.runner;

import com.xworkz.task.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student1 {

        public static void main(String[] args) {
            List<Student> students = new ArrayList<>();
            students.add(new Student("Anu", 103, 88));
            students.add(new Student("Ravi", 101, 92));
            students.add(new Student("Megha", 105, 76));
            students.add(new Student("Vikas", 102, 92));

            System.out.println("Before sorting:");
            students.forEach(System.out::println);

            Collections.sort(students);
            System.out.println("\nSorted by roll number (Comparable):");
            students.forEach(System.out::println);

            students.sort(Student.marksComparator);
            System.out.println("\nSorted by marks (Comparator):");
            students.forEach(System.out::println);
        }
    }
}
