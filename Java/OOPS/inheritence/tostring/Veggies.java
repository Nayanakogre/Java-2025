package com.xworkz.inheritence.tostring;

public class Veggies {
    public String veggieName;
    public double price;
    public int quantity;

    public Veggies(String veggieName)
    {
        this.veggieName=veggieName;
        System.out.println(veggieName);
        System.out.println("Running in 1 arg constructer ");

    }
    public Veggies(String veggieName, double price)
    {

        this.veggieName=veggieName;
        this.price=price;
        System.out.println(veggieName);
        System.out.println(price);
        System.out.println("Running 2 arg constructer ");
    }

   @Override
    public String toString() {
        return "Veggie name :" +this.veggieName;
    }
}
