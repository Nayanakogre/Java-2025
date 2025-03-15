package com.xworkz.association.ex3;

public class Mango {
    public Juice juice;
    public String variety;
    public int quantity;

    @Override
    public String toString() {
        return "Mango{" +
                "juice=" + juice +
                ", variety='" + variety + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
