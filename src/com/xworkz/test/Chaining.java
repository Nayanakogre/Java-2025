package com.xworkz.test;

public class Chaining {
    public static void main(String[] args) {
        Chaining.father();

    }
    public static void father()
    {
        System.out.println("Running in Father method");
        Chaining.mother();
    }
    public static void mother()
    {
        System.out.println("Running in mother method");
        Chaining.brother();
    }
    public static void brother()
    {
        System.out.println("Running in brother method");
        Chaining.sister();
    }
    public static void sister()
    {
        System.out.println("Running in sister method");
    }

}
