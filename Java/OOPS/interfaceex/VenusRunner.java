package com.xworkz.interfaceex;

public class VenusRunner implements Venus {

    @Override
    public void spin() {
        System.out.println("Spinning in Venus");
    }

    @Override
    public void sunRise() {
        System.out.println("Sun Rise in Venus");
    }

    @Override
    public void sunSet() {
        System.out.println("Sun set in Venus");
    }

    @Override
    public void rotate() {
        System.out.println("Rotate in Venus");
    }

    @Override
    public void winding() {
        System.out.println("Winding in Venus");
    }

    public static void main(String[] args) {
        Venus venus=new VenusRunner();
        venus.winding();
        venus.sunRise();
        venus.sunSet();
        venus.rotate();
        venus.spin();
    }
}
