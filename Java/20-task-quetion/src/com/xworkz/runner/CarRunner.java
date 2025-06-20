package com.xworkz.runner;

import com.xworkz.task.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarRunner {
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Toyota", 2015));
        carList.add(new Car("Honda", 2012));
        carList.add(new Car("Ford", 2018));
        carList.add(new Car("BMW", 2010));

        System.out.println("Before sorting:");
        for (Car car : carList) {
            System.out.println(car);
        }

        Collections.sort(carList);  // Uses compareTo method

        System.out.println("\nAfter sorting by year:");
        for (Car car : carList) {
            System.out.println(car);
        }
    }
}
