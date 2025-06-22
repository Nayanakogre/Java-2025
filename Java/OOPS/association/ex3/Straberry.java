package com.xworkz.association.ex3;

public class Straberry {
    public Cake cake;
    public Jam jam;
    public int quantity;
    public String color;

    @Override
    public String toString() {
        return "Straberry{" +
                "cake=" + cake +
                ", jam=" + jam +
                ", quantity=" + quantity +
                ", color='" + color + '\'' +
                '}';
    }
}
