package com.xworkz.interfaceex2;

public class Bike implements Transport{
    String bikeDetails="avhggfd";
    int bikeNo=1234;
    String bikeName="Car";
    String owner="Nayana";
    @Override
    public void ownerDetails() {
        System.out.println("Running in Bike");
    }

    @Override
    public void vechicleDetails() {
        System.out.println("Running in Bike");
    }

    @Override
    public void engineDetails() {
        System.out.println("Running in Bike");
    }

    @Override
    public void modelDeatils() {
        System.out.println("Running in Bike");
    }

    @Override
    public void fuleDetails() {
        System.out.println("Running in Bike");
    }

    @Override
    public void manufacturerDetails() {
        System.out.println("Running in Bike");
    }

    @Override
    public void vechicleCompanyDeatails() {
        System.out.println("Running in Bike");
    }

    @Override
    public void vechicleSpareManufacturerDetails() {
        System.out.println("Running in Bike");
    }
    public static  void registrationDetails()
    {
        System.out.println("Running Vechicle");
    }
    public static void licienceDetails()
    {
        System.out.println("Running Vechicle");
    }
    public static void seatingDeatils()
    {
        System.out.println("Running Vechicle");
    }
    public static  void serviceDetails()
    {
        System.out.println("Running Vechicle");
    }
}
