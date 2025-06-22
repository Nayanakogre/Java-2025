package com.xworkz.methods;

public class HealthRunner {
    public static void main(String[] args) {
        Health health = new Health(98.6, 72, 120,
                98.0, 90.5, 180.2,
                22.5, 16, 60.0, false,
                false, "Good");
        health.healthDetails();
        System.out.println(health);

    }
}
