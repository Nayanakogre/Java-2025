//Task 18-02-2025
//1. Create a Library class.
//Overload the issueBook and returnBook methods:
//Issue Book: The system should allow borrowing a book. The issueBook method should support:
//Borrowing a physical book (requires a book ID).
//Borrowing a digital book (requires a book ID and user?s email).
//Return Book: The system should allow returning a book. The returnBook method should support:
//Returning a physical book (requires a book ID).
//Returning a digital book (requires a book ID and user?s email).
//Search Book: The system should support searching for books either by book title or by author name.
//Searching by title (using just the book title).
//Searching by author (using the author's name).


package com.xworkz.overloading;

public class Library {

    public static void issueBook(String bookId)
    {
        System.out.println("Running in 1 parameter of-String");
        System.out.println("Book Id :"+bookId);
    }
    public static void issueBook(String bookId,String userEmail)
    {
        System.out.println("Running in 2 parameter of-String,String");
        System.out.println("Book Id :"+bookId);
        System.out.println("Usee Email :"+userEmail);
    }
    public static void returnBook(String bookId)
    {
        System.out.println("Running in 1 parameter of-String");
        System.out.println("Book Id :"+bookId);
    }
    public static void returnBook(String bookId,String userEmail)
    {
        System.out.println("Running in 2 parameter of-String,String");
        System.out.println("Book Id :"+bookId);
        System.out.println("Usee Email :"+userEmail);
    }
    public static void searchBook(String bookTitle)
    {
        System.out.println("Running in 1 parameter of-String");
        System.out.println("Book Title :"+bookTitle);
    }
    public static void searchBook(String bookTitle,String authorName)
    {
        System.out.println("Running in 2 parameter of-String,String");
        System.out.println("Author Name :"+authorName);
        System.out.println("Book Title :"+bookTitle);
    }


}
