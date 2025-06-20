package com.xworkz.task;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
@NoArgsConstructor


   public class Car implements Comparable<Car> {
        private String name;
        private int year;

        @Override
        public int compareTo(Car o) {
            return Integer.compare(this.year, o.year);
        }
    }
