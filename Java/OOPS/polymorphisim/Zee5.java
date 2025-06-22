//-> declare 3 static variables
//-> declare 3 instance variables
//-> declare 2 static methods
//-> declare 2 instance methods
//-> assign the values for static variables inside the instance methods
//-> assign the values for the instance variables inside the static methods
//-> achieve method chaining with 2 methods static and non-static
//-> declare 2 constructor
//-> achieve constructor chaining,
//        -> invoke static method in constructor
//-> invoke non static method in constructor

package com.xworkz.polymorphisim;

public class Zee5 {

    //declaration of 3 static variables
    public static String nameOfApp;
    public static String typeOfApp;
    public static double sizeInMb;

    //declaration of 3 instance variables
    public String ownedBy;
    public String genere;
    public double subscriptionPrice;

    //declaration 2 static method
    public static void appNameInfo()
    {
        //a staticmethod can not invoke a instance variable
//        ownedBy="Zee Network";
//        genere="Entainment";
//        subscriptionPrice=800;
        System.out.println("Running in static method 1");
        //a static method not invoke non static method
        //subscriptionInfo();

    }
    public static void appTypeInfo()
    {
        System.out.println("Running in static method 2");
    }

    //declaration of 2 non static method

    public void ownerInfo()
    {
        nameOfApp="Zee5";
        System.out.println(nameOfApp);
        typeOfApp="Android";
        System.out.println(typeOfApp);
        System.out.println("Running in instance method 1");
        Zee5.appTypeInfo();
    }
    public void subscriptionInfo()
    {
        sizeInMb=90.90;
        System.out.println(sizeInMb);
        System.out.println("Running in instance method 2");
    }


    //constructer creation
    public Zee5(String nameOfApp)
    {
        this.nameOfApp=nameOfApp;
        System.out.println(nameOfApp);
        //calling a static method in constructer
        Zee5.appTypeInfo();
    }
    public Zee5(double subscriptionPrice)
    {
        this.subscriptionPrice=subscriptionPrice;
        //a constructer never invoke instance method
        this.ownerInfo();
    }



}
