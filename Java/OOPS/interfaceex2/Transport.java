package com.xworkz.interfaceex2;

public interface Transport {
    String vechicleDetails="avhggfd";
    int vehicleNo=1234;
    String vehicleName="Car";
    String owner="Nayana";

    public void ownerDetails();
    public void vechicleDetails();
    public void engineDetails();
    public void modelDeatils();
    public void fuleDetails();

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
    default void manufacturerDetails()
    {
        System.out.println("Running Vechicle");
    }
    default void vechicleCompanyDeatails()
    {
        System.out.println("Running Vechicle");
    }
    default void vechicleSpareManufacturerDetails()
    {
        System.out.println("Running Vechicle");
    }


}
