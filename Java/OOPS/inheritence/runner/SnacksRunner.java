package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.single.MasalaPuri;
import com.xworkz.inheritence.single.Snacks;

public class SnacksRunner {
    public static void main(String[] args) {
        Snacks snacks = new Snacks();
        snacks.breakfast();
        snacks.dessert();
        snacks.spice();
        snacks.sweet();
        snacks.eat("Pani puri");
        System.out.println("--------------------------------------------");
        MasalaPuri masalaPuri = new MasalaPuri();
        //upcasting
        snacks=masalaPuri;
        System.out.println(snacks);
        System.out.println("--------------------------------------------");
        //downcasting
        if (masalaPuri instanceof Snacks) {
            System.out.println("yes its instance");
            masalaPuri = (MasalaPuri) snacks;
        } else {
            System.out.println("Not an instnace");
        }


    }
}
