package com.xworkz.runner;

import com.xworkz.task.Book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookRunner {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Java Programming", "James", 2015));
        books.add(new Book("Algorithms", "Robert", 2010));
        books.add(new Book("Data Structures", "Sara", 2012));

        Collections.sort(books); // sorts by title

        for (Book b : books) {
            System.out.println(b);
        }
    }
}
