package com.xworkz.wrapper;

import com.sun.corba.se.spi.activation.NoSuchEndPoint;

public class Example10Runner {
    public static void main(String[] args) throws NoSuchEndPoint {


        throw new NoSuchEndPoint("No such end point exception");
    }
}
