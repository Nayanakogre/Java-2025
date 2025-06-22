package com.xworkz.association.ex2;

public class Adhar {
    public Address adress;
    public String name;
    public long adharNo;

    public Adhar(Address adress)
    {
        this.adress=adress;
    }
    @Override
    public String toString() {
        return "Adhar{" +
                "adress=" + adress +
                ", name='" + name + '\'' +
                ", adharNo=" + adharNo +
                '}';
    }
}
