package com.xworkz.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Runner {
    public static void main(String[] args) {
        List<UserDetails> details=new ArrayList<UserDetails>();
        details.add(new UserDetails("nayana",6.0,43,24));
        details.add(new UserDetails("sahana",5.1,56.8,24));
        details.add(new UserDetails("meghana",5.2,50,24));
        details.add(new UserDetails("bindu",5.3,69,24));
        details.add(new UserDetails("madhu",5.4,70,24));
        details.add(new UserDetails("brunda",5.5,65,24));
        System.out.println(details);

        List<UserDetails> height=details.stream().sorted(Comparator.comparing(UserDetails::getHeight)).collect(Collectors.toList());
        //List<UserDetails>weight=details.stream().sorted(Comparator.comparing(UserDetails::getWeight)).collect(Collectors.toList());
        //height.stream().sorted(Comparator.comparing())
        System.out.println(height);
        //System.out.println(weight);
        }

    }

