package com.xworkz.association.runner;

import com.xworkz.association.Moon;
import com.xworkz.association.Sun;

public class SolarSystemRunner {
    public static void main(String[] args) {
        Sun sun=new Sun();
        sun.setSunName("Sunny");
        sun.getSunName();
//        Sun sun1=new Sun();
//        sun1.setSunName("Sunny");
//        sun1.getSunName();

//        System.out.println(sun.equals(sun1));

        Moon moon=new Moon();
        moon.setMoonName("Moony");
        moon.getMoonName();

        Moon moon1=new Moon();
        moon1.setMoonName("Moonyy");
        moon1.getMoonName();

//        System.out.println(moon.equals(moon1));



        SolarSystem solarSystem = new SolarSystem();
        solarSystem.setSun(sun);
        solarSystem.getSun();
        solarSystem.setMoon(moon);
        solarSystem.getSun();

        SolarSystem solarSystem1 = new SolarSystem();
        solarSystem1.setSun(sun);
        solarSystem1.getSun();
        solarSystem1.setMoon(moon);
        solarSystem1.getSun();
        System.out.println(solarSystem.equals(solarSystem1));


    }
}
