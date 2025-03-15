package com.xworkz.association;

public class Country {
    @Override
    public String toString() {
        return "Country{" +
                "adress=" + adress +
                ", countryName='" + countryName + '\'' +
                ", countryCode=" + countryCode +
                '}';
    }

    public Adress adress;
    public String countryName;
    public int countryCode;


}
