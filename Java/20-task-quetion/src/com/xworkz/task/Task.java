package com.xworkz.task;

import lombok.*;

import java.util.Comparator;

@AllArgsConstructor
@ToString
@Getter
@Setter
@NoArgsConstructor

public class Task implements Comparable<Task> {
    private String name;
    private int priority;
    private String deadline;

    @Override
    public int compareTo(Task o) {
        return Integer.compare(this.priority, o.priority);
    }
    public static Comparator<Task> deadlineComparator = Comparator.comparing(Task::getDeadline);
}
