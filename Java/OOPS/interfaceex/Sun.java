package com.xworkz.interfaceex;

public class Sun implements Mercury,Venus,Earth{
    @Override
    public void spin() {
        System.out.println("Planets are spiing");
    }

    @Override
    public void sunRise() {
        System.out.println("Sun rise");
    }

    @Override
    public void sunSet() {
        System.out.println("Sun set");
    }

    @Override
    public void rotate() {
        System.out.println("rotation");
    }

    @Override
    public void winding() {
        System.out.println("Its winding");
    }
}
