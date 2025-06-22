package com.xworkz.interfaceex;

public class EarthRunner implements Earth{
    @Override
    public void spin() {
        System.out.println("Spinning in Earth");
    }

    @Override
    public void sunRise() {
        System.out.println("Sun Rise in Earth");
    }

    @Override
    public void sunSet() {
        System.out.println("Sun set in Earth");
    }

    @Override
    public void rotate() {
        System.out.println("Rotate in Earth");
    }

    @Override
    public void winding() {
        System.out.println("Winding in Earth");
    }

    public static void main(String[] args) {
        Earth earth=new EarthRunner();
        earth.winding();
        earth.sunRise();
        earth.sunSet();
        earth.spin();
        earth.rotate();
    }
}
