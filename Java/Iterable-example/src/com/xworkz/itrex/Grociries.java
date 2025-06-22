package com.xworkz.itrex;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Grociries {
    public static void main(String[] args) {
        List<String> grociries=new LinkedList<>();
        grociries.add("Milk");
        grociries.add("vegetable");
        grociries.add("Pulses");
        grociries.add("wheat flour");
        grociries.add("Rice");
        grociries.add("Dry spicies");
        grociries.add("Red chilli");
        grociries.add("Cocunut oil");
        grociries.add("Mustard seeds");

        Iterator<String> iterator=grociries.iterator();
        while (iterator.hasNext())
        {
            String items=iterator.next();
            System.out.println(items);
        }
    }
}
