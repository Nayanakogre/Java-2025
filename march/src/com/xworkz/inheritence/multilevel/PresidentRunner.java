package com.xworkz.inheritence.multilevel;

public class PresidentRunner {
    public static void main(String[] args) {
        President president=new President();
        president.name="Drupadi Marmu";
        president.term=5;
        president.age=65;
        PrimeMinister primeMinister=new PrimeMinister();
        primeMinister.nameOfPM="Narendra Modi";
        primeMinister.party="BJP";
        primeMinister.electedYear=2024;
        Minsister minsister=new Minsister();
        minsister.nameOfMinister="Jai Shankar";
        minsister.post="Foreign Minsistry";
        minsister.mpDivision="Gujarath";
        System.out.println(president);
        System.out.println(primeMinister);
        System.out.println(minsister);
    }
}
