package com.xworkz.task;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Book implements Comparable<Book>{
    private String title;
    private String author;
    private int year;


    @Override
    public int compareTo(Book o) {
        return this.title.compareToIgnoreCase(o.title);
    }
}
