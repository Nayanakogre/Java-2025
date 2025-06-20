package com.xworkz.runner;

import com.xworkz.task.City;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CityRunner {
    public static void main(String[] args) {

            // Creating a list of City objects
            List<City> cities = new ArrayList<>();
            cities.add(new City("Bangalore", 8443675));
            cities.add(new City("Mysore", 922000));
            cities.add(new City("Hubli", 943000));
            cities.add(new City("Chennai", 4646732));

            System.out.println("Cities before sorting:");
            cities.forEach(System.out::println);

            // Sorting the list by population using a Comparator
            Collections.sort(cities, Comparator.comparingInt(City::getPopulation));

            System.out.println("\nCities after sorting by population:");
            cities.forEach(System.out::println);
        }
    }

