package com.xworkz.interfaceex2;

public interface Browser {
    public static final String browserName="Google";
    int yearEstblished=2000;
    String founder="Larry page and Sergey brin";
    String ceo="Sundar Picchai";


    //abstact method

    public void browserDetails();
    public void browserVersionDetails();
    public void browserSpeed();
    public void broserActivity();

    public static void browserAdress()
    {
        System.out.println("Running in browser");
    }
    public static void browserUsers()
    {
        System.out.println("Running in browser users");
    }
    public static void browserWorking()
    {
        System.out.println("Running in browser working");
    }

    default void runningInternet()
    {
        System.out.println("Running in runningInternet");
    }
    default void fonderDetails()
    {
        System.out.println("Running in fonderDetails()");
    }



}
