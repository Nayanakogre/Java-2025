package com.xworkz.runner;

import com.xworkz.task.Song;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SongRunner {
    public static void main(String[] args) {
        List<Song> songs = new ArrayList<>();
        songs.add(new Song("Song A", 3.5));
        songs.add(new Song("Song C", 4.0));
        songs.add(new Song("Song B", 2.8));
        songs.add(new Song("Song D", 3.2));

        System.out.println("Songs before sorting:");
        songs.forEach(System.out::println);

        // Sort songs by duration (using Comparable)
        Collections.sort(songs);
        System.out.println("\nSongs sorted by duration (using Comparable):");
        songs.forEach(System.out::println);

        // Sort songs by title (using Comparator)
        songs.sort(Song.titleComparator);
        System.out.println("\nSongs sorted by title (using Comparator):");
        songs.forEach(System.out::println);
    }
}
