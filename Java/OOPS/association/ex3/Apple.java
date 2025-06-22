package com.xworkz.association.ex3;

public class Apple {

    public Juice juice;
    public String color;
    public int quantity;

    @Override
    public String toString() {
        return "Apple{" +
                "juice=" + juice +
                ", color='" + color + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
