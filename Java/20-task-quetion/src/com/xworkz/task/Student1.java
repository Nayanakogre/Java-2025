package com.xworkz.task;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
@NoArgsConstructor

public class Student1 implements Comparable<Student1> {
    private String name;
    private int rollNumber;
    private int marks;



    @Override
    public int compareTo(Student1 o) {
        return Integer.compare(this.rollNumber, o.rollNumber);
    }
}
