package com.xworkz.association.ex3;

public class Tree {
    public Mango mango;
    public Apple apple;
    public int ageOfTree;
    public double heightOfTree;

    @Override
    public String toString() {
        return "Tree{" +
                "mango=" + mango +
                ", apple=" + apple +
                ", ageOfTree=" + ageOfTree +
                ", heightOfTree=" + heightOfTree +
                '}';
    }
}
