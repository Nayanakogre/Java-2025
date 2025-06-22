package com.xworkz.association.ex3;

public class SourceOfFruit {
    public Tree tree;
    public Plant plant;
    public String locatation;
    public String countryGrow;

    @Override
    public String toString() {
        return "SourceOfFruit{" +
                "tree=" + tree +
                ", plant=" + plant +
                ", locatation='" + locatation + '\'' +
                ", countryGrow='" + countryGrow + '\'' +
                '}';
    }
}
