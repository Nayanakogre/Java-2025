package com.xworkz.association.ex2;

public class Passport {
    public Address address;
    public String name;
    public long passportNo;

    @Override
    public String toString() {
        return "Passport{" +
                "address=" + address +
                ", name='" + name + '\'' +
                ", passportNo=" + passportNo +
                '}';
    }
}
