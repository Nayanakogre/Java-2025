package com.xworkz.association.ex2;

public class VoterId {
    public Address address;
    public String name;
    public long voterId;

    @Override
    public String toString() {
        return "VoterId{" +
                "address=" + address +
                ", name='" + name + '\'' +
                ", voterId=" + voterId +
                '}';
    }
}
