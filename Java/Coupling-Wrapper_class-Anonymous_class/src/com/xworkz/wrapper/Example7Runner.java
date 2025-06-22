package com.xworkz.wrapper;

import org.omg.CORBA.DynAnyPackage.InvalidValue;

public class Example7Runner {
    public static void main(String[] args) throws InvalidValue {
        throw new InvalidValue("Its a invalid value exception");
    }
}
