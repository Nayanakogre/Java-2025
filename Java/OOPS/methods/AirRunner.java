package com.xworkz.methods;

public class AirRunner {
    public static void main(String[] args) {
    Air air=new Air();
        System.out.println("Temperature: " + air.temperature);
        System.out.println("Pressure: " + air.pressure);
        System.out.println("Humidity: " + air.humidity);
        System.out.println("Density: " + air.density);
        System.out.println("Velocity: " + air.velocity);
        System.out.println("Viscosity: " + air.viscosity);
        System.out.println("Pollutant Level: " + air.pollutantLevel);
        System.out.println(air);
    }
}
