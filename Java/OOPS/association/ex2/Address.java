package com.xworkz.association.ex2;

public class Address {
    public String Country;
    public int houseNo;

    @Override
    public String toString() {
        return "Address{" +
                "Country='" + Country + '\'' +
                ", houseNo=" + houseNo +
                '}';
    }
}
