package com.xworkz.interfaceex2;

import com.xworkz.test.Vehicle;

public class Car implements Transport {

    String carDetails="avhggfd";
    int carNo=1234;
    String carName="Car";
    String car="Nayana";

    @Override
    public void ownerDetails() {
        System.out.println("Running in car");
    }

    @Override
    public void vechicleDetails() {
        System.out.println("Running in car");
    }

    @Override
    public void engineDetails() {
        System.out.println("Running in car");
    }

    @Override
    public void modelDeatils() {
        System.out.println("Running in car");
    }

    @Override
    public void fuleDetails() {
        System.out.println("Running in car");
    }

    @Override
    public void manufacturerDetails() {
        System.out.println("Running in car");
    }

    @Override
    public void vechicleCompanyDeatails() {
        System.out.println("Running in car");
    }

    @Override
    public void vechicleSpareManufacturerDetails() {
        System.out.println("Running in car");
    }
    public static  void registrationDetails()
    {
        System.out.println("Running Car ");
    }
    public static void licienceDetails()
    {
        System.out.println("Running Car");
    }
    public static void seatingDeatils()
    {
        System.out.println("Running Car");
    }
    public static  void serviceDetails()
    {
        System.out.println("Running Car");
    }
}
