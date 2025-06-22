package com.xworkz.chaining;

public class Fruit {

    public static void apple()
    {
        System.out.println("Running in apple method");
        Fruit.banana();
    }
    public static void banana()
    {
        System.out.println("Running in banana method");
        Fruit.orange();
    }
    public static void orange()
    {
        System.out.println("Running in orange method");
        Fruit.guava();
    }
    public static void guava()
    {
        System.out.println("Running in guava method");
        Fruit.watermelon();
    }
    public static void watermelon()
    {
        System.out.println("Running in watermelon method");
        Fruit.pineapple();
    }
    public static void pineapple()
    {
        System.out.println("Running in apple method");
    }
}
