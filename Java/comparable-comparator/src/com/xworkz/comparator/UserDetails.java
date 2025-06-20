package com.xworkz.comparator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString


public class UserDetails implements Comparable<UserDetails> {
    private String Username;
    private double weight;
    private double height;
    private int age;


    @Override
    public int compareTo(UserDetails o) {
        if (this.height == o.height) {
            return 0;
        } else if (this.height > o.height) {
            return -1;
        } else {
            return 1;
        }


    }
}
