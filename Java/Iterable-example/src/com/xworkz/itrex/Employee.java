package com.xworkz.itrex;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Employee {
    public static void main(String[] args) {
        List<String> employeeName=new LinkedList<>();
        employeeName.add("Adi");
        employeeName.add("Siddarth");
        employeeName.add("Akash");
        employeeName.add("Meera");
        employeeName.add("Deepika");
        employeeName.add("radika");
        employeeName.add("Shashi kumar");
        employeeName.add("Balaji");
        employeeName.add("puneeth");
        employeeName.add("sainith");

        Iterator<String> iterator=employeeName.iterator();
        while (iterator.hasNext())
        {
            String names=iterator.next();
            System.out.println(names);
        }
    }
}
