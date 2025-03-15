//hotstar
//-> 5 methods and achieve method overloading

package com.xworkz.polymorphisim;

public class HotStar {

    //declaration of instance variables
    public String name;
    public double sizeInMb;
    public String owndedBy;
    public String userName;
    public double subscriptionPrice;

    //instance method
    public void hotStarDetails()
    {
        System.out.println("Running in no-arg instance method");
    }
    //instance method overloading
    public void hotStarDetails(String name)
    {
        System.out.println("Running in in one-arg instance method");
        this.name=name;
        System.out.println(name);
    }
    public void hotStarDetails(double sizeInMb)
    {
        System.out.println("Running in in one-arg instance method");
        this.sizeInMb=sizeInMb;
        System.out.println(sizeInMb);
    }
    public void hotStarDetails(String name,String owndedBy)
    {
        System.out.println("Running in in 2-arg instance method");
        this.name=name;
        this.owndedBy=owndedBy;
        System.out.println(name);
        System.out.println(owndedBy);
    }
    public void hotStarDetails(String name,double sizeInMb,String owndedBy,String userName,double subscriptionPrice)
    {
        System.out.println("Running in in 5-arg instance method");
        this.name=name;
        this.sizeInMb=sizeInMb;
        this.owndedBy=owndedBy;
        this.userName=userName;
        this.subscriptionPrice=subscriptionPrice;
        System.out.println(name);
        System.out.println(sizeInMb);
        System.out.println(owndedBy);
        System.out.println(userName);
        System.out.println(subscriptionPrice);
    }


}
