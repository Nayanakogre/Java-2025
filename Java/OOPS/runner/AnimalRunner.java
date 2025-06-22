package com.xworkz.runner;

import com.xworkz.array.Animal;

public class AnimalRunner {
    public static void main(String[] args) {
        System.out.println("Running in method");
        Animal.animalCount();
        Animal.animalSearch();
        Animal.occurence();
    }
}
