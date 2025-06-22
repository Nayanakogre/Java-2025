package com.xworkz.encapsulation.runner;

import com.xworkz.encapsulation.Travel;

public class TravelRunner {
    public static void main(String[] args) {
        Travel travel=new Travel();
        travel.setNoOfTravellers(10);
        travel.setSoloTravelling(false);
        travel.setTravelDestnation("paris");
        travel.setIntDays(30);
        travel.setNoOfTravellers(2);
        travel.setModeOfTransport("flight");
        travel.setCost(400000);
        travel.setBudegetFriendly(true);
        travel.setTravellingCountry("Netherland");
        travel.setStyaingLocation("Hotel");
        System.out.println(travel.getNoOfTravellers());
        System.out.println(travel.getModeOfTransport());
        System.out.println(travel.getSoloTravelling());
        System.out.println(travel.getTravelDestnation());
        System.out.println(travel.getCost());
        System.out.println(travel.getIntDays());
        System.out.println(travel.getNoOfLocationstoVisit());
        System.out.println(travel.getStyaingLocation());
        System.out.println(travel.isBudegetFriendly());
        System.out.println(travel.getTravellingCountry());
        System.out.println(travel);


    }
}
