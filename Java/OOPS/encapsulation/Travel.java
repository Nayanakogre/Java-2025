package com.xworkz.encapsulation;

public class Travel {
    private String travelDestnation;
    private int intDays;
    private String modeOfTransport;
    private int noOfTravellers;
    private double cost;
    private String styaingLocation;
    private int noOfLocationstoVisit;
    private String travellingCountry;
    private boolean isSoloTravelling;
    private boolean isBudegetFriendly;

    @Override
    public String toString() {
        return "Travel{" +
                "travelDestnation='" + travelDestnation + '\'' +
                ", intDays=" + intDays +
                ", modeOfTransport='" + modeOfTransport + '\'' +
                ", noOfTravellers=" + noOfTravellers +
                ", cost=" + cost +
                ", styaingLocation='" + styaingLocation + '\'' +
                ", noOfLocationstoVisit=" + noOfLocationstoVisit +
                ", travellingCountry='" + travellingCountry + '\'' +
                ", isSoloTravelling=" + isSoloTravelling +
                ", isBudegetFriendly=" + isBudegetFriendly +
                '}';
    }

    public Travel()
    {
        System.out.println("Running no arg constructer");
    }

    public Travel(String travelDestnation,
                  int intDays, String modeOfTransport,
                  int noOfTravellers, double cost, String styaingLocation,
                  int noOfLocationstoVisit, String travellingCountry,
                  boolean isSoloTravelling, boolean isBudegetFriendly)
    {
        this.travelDestnation = travelDestnation;
        this.intDays = intDays;
        this.modeOfTransport = modeOfTransport;
        this.noOfTravellers = noOfTravellers;
        this.cost = cost;
        this.styaingLocation = styaingLocation;
        this.noOfLocationstoVisit = noOfLocationstoVisit;
        this.travellingCountry = travellingCountry;
        this.isSoloTravelling = isSoloTravelling;
        this.isBudegetFriendly = isBudegetFriendly;
        System.out.println("Running in all arg constructer");
    }
    public void setTravelDestnation(String travelDestnation)
    {
        this.travelDestnation=travelDestnation;
    }
    public String getTravelDestnation()
    {
        return travelDestnation;
    }

    public void setIntDays(int intDays) {
        this.intDays = intDays;
    }

    public int getIntDays() {
        return intDays;
    }
    public void setModeOfTransport(String modeOfTransport)
    {
        this.modeOfTransport=modeOfTransport;
    }
    public String getModeOfTransport()
    {
        return modeOfTransport;
    }
    public void setNoOfTravellers(int noOfTravellers)
    {
        this.noOfTravellers=noOfTravellers;
    }
    public int getNoOfTravellers()
    {
        return noOfTravellers;
    }
    public void setCost(double cost)
    {
        this.cost=cost;
    }
    public double getCost()
    {
        return cost;
    }
    public void setStyaingLocation(String styaingLocation)
    {
        this.styaingLocation=styaingLocation;
    }
    public String getStyaingLocation()
    {
        return styaingLocation;
    }
    public void setNoOfLocationstoVisit(int noOfLocationstoVisit)
    {
        this.noOfLocationstoVisit=noOfLocationstoVisit;
    }
    public int getNoOfLocationstoVisit()
    {
        return noOfLocationstoVisit;
    }
    public void setTravellingCountry(String travellingCountry)
    {
        this.travellingCountry=travellingCountry;
    }
    public String getTravellingCountry()
    {
        return travellingCountry;
    }
    public void setSoloTravelling(boolean isSoloTravelling)
    {
        this.isSoloTravelling=isSoloTravelling;
    }
    public boolean getSoloTravelling()
    {
        return isSoloTravelling;
    }
    public void setBudegetFriendly(boolean isBudegetFriendly)
    {
        this.isBudegetFriendly=isBudegetFriendly;
    }
    public boolean isBudegetFriendly()
    {
        return isBudegetFriendly;
    }
}

