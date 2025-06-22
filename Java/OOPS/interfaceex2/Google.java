package com.xworkz.interfaceex2;

public class Google implements Browser{
    public static final String browserName="Google";
    int yearEstblished=2000;
    String founder="Larry page and Sergey brin";
    String ceo="Sundar Picchai";
    @Override
    public void browserDetails() {
        System.out.println("Implemeted in Google");
    }

    @Override
    public void browserVersionDetails() {
        System.out.println("Implemeted in Google");
    }

    @Override
    public void browserSpeed() {
        System.out.println("Implemeted in Google");
    }

    @Override
    public void broserActivity() {
        System.out.println("Implemeted in Google");
    }

    @Override
    public void runningInternet() {
        System.out.println("Implemeted in Google");
    }

    @Override
    public void fonderDetails() {
        System.out.println("Implemeted in Google");
    }
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
}
