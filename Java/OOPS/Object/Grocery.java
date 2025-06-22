package com.xworkz.Object;

public class Grocery {
    public String groceryName="Rice";
    public String purchasedFrom="General Store";
    public double quantityInKg=10.5;
    public double price=550;
    public String buyerName="Armann";

    public Grocery()
    {
        System.out.println("Running in no arg constructer");
    }
    public static void groceryInfo()
    {
        System.out.println("CReated method for a class Grocery");
    }


}
