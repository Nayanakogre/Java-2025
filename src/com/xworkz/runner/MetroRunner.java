package com.xworkz.runner;

import com.xworkz.Object.Metro;

public class MetroRunner {
    public static void main(String[] args) {
        Metro metro=new Metro();
        System.out.println("--------------------------------------------");
        Metro metro1=new Metro();
        System.out.println("--------------------------------------------");
        Metro metro2=new Metro();
        System.out.println("--------------------------------------------");
        Metro metro3=new Metro();
        System.out.println("--------------------------------------------");
        Metro metro4=new Metro();
        System.out.println("--------------------------------------------");
        Metro metro5=new Metro();
        System.out.println("--------------------------------------------");
        Metro metro6=new Metro();
        System.out.println("--------------------------------------------");
        Metro metro7=new Metro();
        System.out.println("--------------------------------------------");
        Metro metro8=new Metro();
        System.out.println("--------------------------------------------");
        Metro metro9=new Metro();
        System.out.println("--------------------------------------------");

        metro.metroInfo();
        System.out.println("--------------------------------------------");
        metro.metroInfo1();
        System.out.println("--------------------------------------------");
        metro.metroInfo2();
        System.out.println("--------------------------------------------");
        metro.metroInfo3();
        System.out.println("--------------------------------------------");
        metro.metroInfo4();
        System.out.println("--------------------------------------------");

        System.out.println(metro.route);
        System.out.println(metro.metroName);
        System.out.println(metro.numberOfCoaches);
        System.out.println(metro.farePerKm);
        System.out.println(metro.driverName);
        System.out.println("--------------------------------------------");
    }
}
