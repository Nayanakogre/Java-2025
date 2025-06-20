package com.xworkz.task;

import lombok.*;


import java.util.Comparator;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class Song implements Comparable<Song> {
        private String title;
        private double duration;

        @Override
        public int compareTo(Song o) {
            return Double.compare(this.duration, o.duration);
        }
        public static Comparator<Song> titleComparator = Comparator.comparing(Song::getTitle);
    }
