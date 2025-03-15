package com.xworkz.methods;

public class BuldingRunner {
    public static void main(String[] args) {
        Building building = new Building();
        building.floors = 1;
        building.rooms = 10;
        building.height = 50.5;
        building.area = 2500.0;
        building.address = "123 Main Street";
        building.yearBuilt = 2005;
        building.material = "Concrete";
        building.hasElevator = true;
        building.hasParking = true;
        building.numberOfWindows = 20;
        building.isResidential = true;
        building.electricityUsage = 1500.75;
        building.waterUsage = 500.25;
        building.hasFireSafety = true;
        building.buildingType = "Apartment";
        System.out.println("Floors: " + building.floors);
        System.out.println("Rooms: " + building.rooms);
        System.out.println("Height: " + building.height);
        System.out.println("Area: " + building.area);
        System.out.println("Address: " + building.address);
        System.out.println("Year Built: " + building.yearBuilt);
        System.out.println("Material: " + building.material);
        System.out.println("Has Elevator: " + building.hasElevator);
        System.out.println("Has Parking: " + building.hasParking);
        System.out.println("Number of Windows: " + building.numberOfWindows);
        System.out.println("Is Residential: " + building.isResidential);
        System.out.println("Electricity Usage: " + building.electricityUsage);
        System.out.println("Water Usage: " + building.waterUsage);
        System.out.println("Has Fire Safety: " + building.hasFireSafety);
        System.out.println("Building Type: " + building.buildingType);
        System.out.println(building);

    }
}

