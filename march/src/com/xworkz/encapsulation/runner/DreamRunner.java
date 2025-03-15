package com.xworkz.encapsulation.runner;

import com.xworkz.encapsulation.Dream;

public class DreamRunner {
    public static void main(String[] args) {
        Dream dream=new Dream();
        dream.setDreamJob("Devops Engineer");
        dream.setDreamFood("Home Food");
        dream.setDreamTrip("Antlatica");
        dream.setDreamHobby("WildLife Photography");
        dream.setDreamCar("Tesla ");
        dream.setDreamPlace("Himalaya");
        dream.setDreamAdeventure("Scuba Diving");
        dream.setDreamDishTocook("Cakes");
        dream.setDreamHouse("Bunglow");
        dream.setDreamSkill(" Instrumental music ");

        System.out.println(dream.getDreamJob());
        System.out.println(dream.getDreamFood());
        System.out.println(dream.getDreamTrip());
        System.out.println(dream.getDreamHobby());
        System.out.println(dream.getDreamCar());
        System.out.println(dream.getDreamPlace());
        System.out.println(dream.getDreamAdeventure());
        System.out.println(dream.getDreamDishTocook());
        System.out.println(dream.getDreamHouse());
        System.out.println(dream.getDreamSkill());

        System.out.println(dream);
    }
}
