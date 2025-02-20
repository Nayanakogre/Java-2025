package com.xworkz.runner;

import com.xworkz.Object.Car;

public class CarRunner {
    public static void main(String[] args) {
        System.out.println("Running in main method");
        System.out.println("----------------------------------");
        Car.car();
        System.out.println("---------------------------------------");
        Car car=new Car();
        System.out.println("----------------------------------------");
        Car car1=new Car();
        System.out.println("------------------------------------------");
        Car car2=new Car();
        System.out.println("------------------------------------------");

        System.out.println("Running in Constructer 1 :");
        System.out.println(car.CarName);
        System.out.println(car.priceInK);
        System.out.println(car.fuelType);
        System.out.println(car.color);
        System.out.println(car.type);
        System.out.println("------------------------------------------");

        System.out.println("Running in Constructer 2 :");
        System.out.println(car1.CarName);
        System.out.println(car1.priceInK);
        System.out.println(car1.fuelType);
        System.out.println(car1.color);
        System.out.println(car1.type);
        System.out.println("------------------------------------------");

        System.out.println("Running in Constructer 3 :");
        System.out.println(car2.CarName);
        System.out.println(car2.priceInK);
        System.out.println(car2.fuelType);
        System.out.println(car2.color);
        System.out.println(car2.type);


    }
}
