package com.xworkz.interfaceex;

public class MercuryRunner implements Mercury{




    @Override
    public void spin() {
        System.out.println("Spinning in Mercury");
    }

    @Override
    public void sunRise() {
        System.out.println("Sun Rise in Mercury");
    }

    @Override
    public void sunSet() {
        System.out.println("Sun set in Mercury");
    }

    @Override
    public void rotate() {
        System.out.println("Rotate in Mercury");
    }

    @Override
    public void winding() {
        System.out.println("Winding in Mercury");
    }
    public static void main(String[] args) {
        Mercury mercury=new MercuryRunner();
        mercury.sunSet();
        mercury.sunRise();
        mercury.spin();
        mercury.winding();
        mercury.rotate();
}
}
