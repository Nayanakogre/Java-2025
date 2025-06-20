package com.xworkz.task;

import lombok.*;

import java.util.Comparator;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Person implements Comparable<Person> {
    public static Comparator<? super Person> nameComparator;
    private String name;
    private int age;

    @Override
    public int compareTo(Person o) {
        return Integer.compare(this.age, o.age);
    }
}
