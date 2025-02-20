package com.xworkz.runner;

import com.xworkz.Object.Grocery;

public class GroceryRunner {
    public static void main(String[] args) {
        System.out.println("Running in main method");
        System.out.println("------------------------------------------");
        Grocery.groceryInfo();
        System.out.println("------------------------------------------");
        Grocery grocery=new Grocery();
        System.out.println("------------------------------------------");
        Grocery grocery1=new Grocery();
        System.out.println("------------------------------------------");
        Grocery grocery2=new Grocery();
        System.out.println("------------------------------------------");

        System.out.println("Running in Constructer 1 :");
        System.out.println(grocery.groceryName);
        System.out.println(grocery.purchasedFrom);
        System.out.println(grocery.buyerName);
        System.out.println(grocery.price);
        System.out.println(grocery.quantityInKg);
        System.out.println("------------------------------------------");

        System.out.println("Running in Constructer 2 :");
        System.out.println(grocery1.groceryName);
        System.out.println(grocery1.purchasedFrom);
        System.out.println(grocery1.buyerName);
        System.out.println(grocery1.price);
        System.out.println(grocery1.quantityInKg);
        System.out.println("------------------------------------------");

        System.out.println("Running in Constructer 3 :");
        System.out.println(grocery2.groceryName);
        System.out.println(grocery2.purchasedFrom);
        System.out.println(grocery2.buyerName);
        System.out.println(grocery2.price);
        System.out.println(grocery2.quantityInKg);

    }
}
