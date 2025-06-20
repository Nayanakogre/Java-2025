package com.xworkz.runner;

import com.xworkz.task.Movie;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MovieRunner {
    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("KGF Chapter 1", 8.5, 2018));
        movies.add(new Movie("KGF Chapter 2", 8.7, 2022));
        movies.add(new Movie("Ugramm", 8.1, 2023));
        movies.add(new Movie("Kantara", 8.7, 2022));
        movies.add(new Movie("Lava Kusha", 7.5, 1963));
        movies.add(new Movie("Ondanondu Kaladalli", 8.1, 1978));

        System.out.println("Before sorting:");
        movies.forEach(System.out::println);

        List<Movie> sortedMovies = movies.stream()
                .sorted(Comparator
                        .comparingDouble(Movie::getRating).reversed()
                        .thenComparingInt(Movie::getYear))
                .collect(Collectors.toList());

        System.out.println("\nAfter sorting using stream (by rating desc, then year asc):");
        sortedMovies.forEach(System.out::println);
    }
    }

