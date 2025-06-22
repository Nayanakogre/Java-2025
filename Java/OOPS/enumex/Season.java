package com.xworkz.enumex;

import java.util.Scanner;

public enum Season {

    SUMMER(35),
    RAINY(30),
    WINTER(20),
    SPRING(22),
    AUTOMON(28);

    public final double tempreture;

    Season(double tempreture) {
        this.tempreture = tempreture;
    }

    public double getTempreture() {
        return tempreture;
    }
}









