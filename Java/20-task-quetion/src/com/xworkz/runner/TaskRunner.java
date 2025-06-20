package com.xworkz.runner;

import com.xworkz.task.Task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TaskRunner {
    public static void main(String[] args) {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Task 1", 3, "2025-05-10"));
        tasks.add(new Task("Task 2", 1, "2025-04-25"));
        tasks.add(new Task("Task 3", 2, "2025-05-05"));
        tasks.add(new Task("Task 4", 1, "2025-05-01"));

        System.out.println("Tasks before sorting:");
        tasks.forEach(System.out::println);

        Collections.sort(tasks);
        System.out.println("\nTasks sorted by priority (using Comparable):");
        tasks.forEach(System.out::println);

        tasks.sort(Task.deadlineComparator);
        System.out.println("\nTasks sorted by deadline (using Comparator):");
        tasks.forEach(System.out::println);
    }
}
