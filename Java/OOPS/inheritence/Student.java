package com.xworkz.inheritence;

public class Student implements School,College{

    @Override
    public void study() {
        System.out.println("Study method!");
    }
}


//Take a class implementing 3 interfaces.
//Have 5 methods in each interface.
//Create objects / instances for each interface and call respective methods.