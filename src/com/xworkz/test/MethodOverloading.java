package com.xworkz.test;

public class MethodOverloading {

    public static void main(String[] args) {
        MethodOverloading.fruit();
        System.out.println("--------------------------------------");
        MethodOverloading.fruit("Apple");
        System.out.println("--------------------------------------");
        MethodOverloading.fruit("Orange",1);
        System.out.println("--------------------------------------");
        MethodOverloading.fruit("Banana","Yellow");
        System.out.println("--------------------------------------");
        MethodOverloading.fruit("Banana","Yellow",1);
        System.out.println("--------------------------------------");
        MethodOverloading.fruit(1,"grape");
        System.out.println("--------------------------------------");
        MethodOverloading.fruit(2,"Guava","Green");



    }
    public static void fruit()
    {
        System.out.println("Running in no parameter method ");
    }
    public static void fruit(String fruitName)
    {
        System.out.println("Running in 1 parameter method ");
        System.out.println(fruitName);
    }
    public static void fruit(String fruitName,int quanitity)
    {
        System.out.println("Running in 2 parameter method ");
        System.out.println(fruitName);
        System.out.println(quanitity);
    }
    public static void fruit(int quanitity,String fruitName)
    {
        System.out.println("Running in 2 parameter method ");
        System.out.println(fruitName);
        System.out.println(quanitity);
    }
    public static void fruit(int quanitity,String fruitName,String fruitColor)
    {
        System.out.println("Running in 3 parameter method ");
        System.out.println(fruitName);
        System.out.println(quanitity);
        System.out.println(fruitColor);
    }
    public static void fruit(String fruitName,String fruitColor)
    {
        System.out.println("Running in 2 parameter method ");
        System.out.println(fruitName);
        System.out.println(fruitColor);

    }
    public static void fruit(String fruitName,String fruitColor,int quanitity)
    {
        System.out.println("Running in 2 parameter method ");
        System.out.println(fruitName);
        System.out.println(fruitColor);
        System.out.println(quanitity);

    }

}
