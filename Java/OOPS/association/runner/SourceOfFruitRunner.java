package com.xworkz.association.runner;

import com.xworkz.association.ex3.*;

public class SourceOfFruitRunner {
    public static void main(String[] args) {
        SourceOfFruit sourceOfFruit=new SourceOfFruit();
        sourceOfFruit.countryGrow="India";
        sourceOfFruit.locatation="Feild";

        Tree tree=new Tree();
        tree.ageOfTree=20;
        tree.heightOfTree=7;
        System.out.println(tree);

        Apple apple=new Apple();
        apple.color="Red";
        apple.quantity=1;
        System.out.println(apple);

        Mango mango=new Mango();
        mango.variety="Raspuri";
        mango.quantity=2;
        System.out.println(mango);

        Juice juice=new Juice();
        juice.price=50;
        juice.quantity=2;

        Plant plant=new Plant();
        plant.height=5;
        plant.lifeSpan=1;
        System.out.println(plant);

        Straberry straberry=new Straberry();
        straberry.color="red";
        straberry.quantity=5;

        System.out.println(straberry);

        Cake cake=new Cake();
        cake.flavoor="StraBeryy";
        cake.quantity=1;
        System.out.println(cake);

        Jam jam=new Jam();
        jam.brand="Lion";
        jam.price=100;
        System.out.println(jam);



    }
}
