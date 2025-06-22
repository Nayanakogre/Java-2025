package com.xworkz.methods;

public class Building {
    int floors;
    int rooms;
    double height;
    double area;
    String address;
    int yearBuilt;
    String material;
    boolean hasElevator;
    boolean hasParking;
    int numberOfWindows;
    boolean isResidential;
    double electricityUsage;
    double waterUsage;
    boolean hasFireSafety;
    String buildingType;

    @Override
    public String toString() {
        return "Bulding{" +
                "floors=" + floors +
                ", rooms=" + rooms +
                ", height=" + height +
                ", area=" + area +
                ", address='" + address + '\'' +
                ", yearBuilt=" + yearBuilt +
                ", material='" + material + '\'' +
                ", hasElevator=" + hasElevator +
                ", hasParking=" + hasParking +
                ", numberOfWindows=" + numberOfWindows +
                ", isResidential=" + isResidential +
                ", electricityUsage=" + electricityUsage +
                ", waterUsage=" + waterUsage +
                ", hasFireSafety=" + hasFireSafety +
                ", buildingType='" + buildingType + '\'' +
                '}';
    }
        public Building()
        {
            System.out.println("Runnig in no arg aconstructer ");
        }
    }

