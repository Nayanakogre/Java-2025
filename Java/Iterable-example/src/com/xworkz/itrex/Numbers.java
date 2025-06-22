package com.xworkz.itrex;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class Numbers {
    public static void main(String[] args) {
        Collection<Integer> number1=new ArrayList<Integer>();
        number1.add(1);
        number1.add(2);
        number1.add(3);
        number1.add(4);
        number1.add(5);
        number1.add(6);
        number1.add(7);
        System.out.println("Collection 1"+number1);
        Collection<Integer> number2=new LinkedList<>();
        number2.add(11);
        number2.add(12);
        number2.add(13);
        number2.add(14);
        number2.add(78);
        number2.addAll(number1);
        System.out.println("Collection 2"+number2);





    }
}
