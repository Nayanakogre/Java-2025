package com.xworkz.inheritence.constrchaining;

public class RegistrationDetails extends College {
    public RegistrationDetails()
    {
        super();
        //super is not really necessary it will by itself
        System.out.println("Running in Registartion class");
    }
}
