package com.xworkz.association;

public class Laptop {
    @Override
    public String toString() {
        return "Laptop{" +
                "company=" + company +
                ", osVersion=" + osVersion +
                ", relesedYear=" + relesedYear +
                '}';
    }

    public Company company;
    public int osVersion;
    public int relesedYear;


}
