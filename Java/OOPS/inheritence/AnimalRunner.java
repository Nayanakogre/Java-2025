package com.xworkz.inheritence;

public class AnimalRunner {
    public static void main(String[] args) {
        GirCow girCow = new GirCow();
        girCow.animalDetails();

        Animal a1 = new Cow();
        a1.animalDetails();

        //Cow c1 = new Animal();
        //upcasting of classes in inheritence is not possible

        BengalTiger bengalTiger=new BengalTiger();
        bengalTiger.bengalTigerDetails();
        //downcasting
        Animal animal=new Cow();
        animal.animal_name="Cow";
        animal.is_endgered=false;
        animal.habitate="Man Made";
        animal.food_culture="plant based";
        animal.animalDetails();
        System.out.println("----------------------------------");

        Animal animal1=new Tiger();
        animal1.animal_name="Tiger";
        animal1.is_endgered=true;
        animal1.habitate="deep forest";
        animal1.food_culture="meat based";
        animal1.animalDetails();
        System.out.println("----------------------------------");

        Animal animal2=new GirCow();
        animal2.animal_name="Cow";
        animal2.is_endgered=false;
        animal2.habitate="Man Made";
        animal2.food_culture="plant based";
        animal2.animalDetails();
        System.out.println("----------------------------------");

        Animal animal3=new BengalTiger();
        animal3.animal_name=" Bengal Tiger";
        animal3.is_endgered=true;
        animal3.habitate="deep forest";
        animal3.food_culture="meat based";
        animal3.animalDetails();
        System.out.println("----------------------------------");

        Cow cow=new GirCow();
        cow.animal_name="Cow";
        cow.is_endgered=false;
        cow.habitate="Man Made";
        cow.food_culture="plant based";
        cow.animalDetails();
        System.out.println("----------------------------------");

        Tiger tiger=new BengalTiger();
        tiger.animal_name="Tiger";
        tiger.is_endgered=true;
        tiger.habitate="deep forest";
        tiger.food_culture="meat based";
        tiger.animalDetails();
        System.out.println("----------------------------------");

    }
}
