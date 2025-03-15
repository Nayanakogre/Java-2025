package com.xworkz.association;

public class Person {
    public Laptop laptop;
    public String nameOfPerson;
    public int personAge;

    @Override
    public String toString() {
        return "Person{" +
                "laptop=" + laptop +
                ", nameOfPerson='" + nameOfPerson + '\'' +
                ", personAge=" + personAge +
                '}';
    }
}
