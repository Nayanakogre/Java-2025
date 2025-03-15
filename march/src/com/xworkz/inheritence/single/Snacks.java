package com.xworkz.inheritence.single;

import java.lang.ref.PhantomReference;

public class Snacks {

    protected String snackName;
    protected double price;
    protected boolean isSweety;

    //creating constructer
    public Snacks()
    {
        //constructer chaining in same class
        this("Rasagulla");
        System.out.println("Running in no-arg constructer");
    }
    public Snacks(String snacks)
    {
        //constructer chining in same class
        this(25,true);
        this.snackName=snackName;
        System.out.println("Running in 1-arg constrtor");
        System.out.println(snackName);

    }
    public Snacks(double price,boolean isSweety)
    {
        this.price=price;
        this.isSweety=isSweety;
        System.out.println("Running in 2 arg constructer");
        System.out.println(price);
        System.out.println(isSweety);
    }

    public static void eat(String snackName)
    {
        System.out.println("Ruunning in 1 'String' arg method");
        //method chaining
        Snacks.eat(100);
    }
    public static void eat(int price)
    {
        System.out.println("Running in 1 'int' arg method");
        //method chainaing
        Snacks.eat("Chakkuli",50);
    }
    public static void eat(String snackName,int price)
    {
        System.out.println("Running 2 arg method");
    }

    //method over-riding
    public void sweet()
    {
        System.out.println("Running in sweet method");
    }
    public void spice()
    {
        System.out.println("Running in spice method");
    }
    public void dessert()
    {
        System.out.println("Running in dessert method");
    }
    public void breakfast()
    {
        System.out.println("Running in breakfast method");
    }



}
