package com.xworkz.runner;

import com.xworkz.overloading.Library;

public class LibraryRunner {
    public static void main(String[] args) {
        Library.issueBook("B101");
        System.out.println("--------------------------------------------");
        Library.issueBook("B102","bob@gmail.com");
        System.out.println("--------------------------------------------");
        Library.returnBook("B200");
        System.out.println("--------------------------------------------");
        Library.returnBook("B202","Alice@gmail.com");
        System.out.println("--------------------------------------------");
        Library.searchBook("Karvalo");
        System.out.println("--------------------------------------------");
        Library.searchBook("Karvalo","K P Tejaswi");

    }
}
