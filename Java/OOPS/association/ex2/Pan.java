package com.xworkz.association.ex2;

public class Pan {
    public Address address;

    @Override
    public String toString() {
        return "Pan{" +
                "address=" + address +
                ", name='" + name + '\'' +
                ", panNo=" + panNo +
                '}';
    }

    public String name;
    public long panNo;




}
