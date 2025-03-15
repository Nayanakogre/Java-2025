package com.xworkz.association.ex3;

public class Plant {
    public Straberry straberry;
    public double height;
    public int lifeSpan;

    @Override
    public String toString() {
        return "Plant{" +
                "straberry=" + straberry +
                ", height=" + height +
                ", lifeSpan=" + lifeSpan +
                '}';
    }
}
