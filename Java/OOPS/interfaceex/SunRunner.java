package com.xworkz.interfaceex;

public class SunRunner {
    public static void main(String[] args) {


        Mercury mercury = new Sun();
        mercury.rotate();
        mercury.spin();
        mercury.sunRise();
        mercury.sunSet();
        mercury.winding();
        System.out.println("----------------------------------");
//
//        Venus venus = new Sun();
//        venus.rotate();
//        venus.spin();
//        venus.sunRise();
//        venus.sunSet();
//        venus.winding();
//        System.out.println("----------------------------------");
//
//        Earth earth = new Sun();
//        earth.rotate();
//        earth.spin();
//        earth.sunRise();
//        earth.sunSet();
//        earth.winding();

        Mercury mercury1=new MercuryRunner();
        mercury1.rotate();
        mercury1.spin();
        mercury1.sunRise();
        mercury1.sunSet();
        mercury1.winding();
        System.out.println("----------------------------------");

        Venus venus1=new VenusRunner();
        venus1.rotate();
        venus1.spin();
        venus1.sunRise();
        venus1.sunSet();
        venus1.winding();
        System.out.println("----------------------------------");

        Earth earth1=new EarthRunner();
        earth1.rotate();
        earth1.spin();
        earth1.sunRise();
        earth1.sunSet();
        earth1.winding();


    }
}
