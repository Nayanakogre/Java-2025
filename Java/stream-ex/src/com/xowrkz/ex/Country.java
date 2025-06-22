package com.xowrkz.ex;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Country {
    public static void main(String[] args) {
        List<String> countries=new ArrayList<String>();
        countries.add("India");
        countries.add("Finland");
        countries.add("Netherland");
        countries.add("Maldvies");
        countries.add("Maynmar");
        countries.add("Bhutan");
        countries.add("        Switzerland");
        countries.add("south africa");
        countries.add("newzland");
        countries.add("sri lanka");
        List<Integer> number=new ArrayList<Integer>();

        long con=countries.stream().map(f->f.length()==10).collect(Collectors.counting());
        System.out.println(con);
        List collect=countries.stream().map(String::toLowerCase).collect(Collectors.toList());
        System.out.println(collect);
        List format=countries.stream().map(String::format).collect(Collectors.toList());
        System.out.println(format);
        List hash=countries.stream().map(String::hashCode).collect(Collectors.toList());
        System.out.println(hash);
        List getBytes=countries.stream().map(String::getBytes).collect(Collectors.toList());
        System.out.println(getBytes);
        List intern=countries.stream().map(String::intern).collect(Collectors.toList());
        System.out.println(intern);
        //List intern1=countries.stream().map(m->m.intern()).collect(Collectors.toList());
        List new1=countries.stream().map(String::new).collect(Collectors.toList());
        System.out.println(new1);
        List empty=countries.stream().map(String::isEmpty).collect(Collectors.toList());
        System.out.println(empty);
        List charArray=countries.stream().map(String::toCharArray).collect(Collectors.toList());
        System.out.println(charArray);
        List trim=countries.stream().map(String::trim).collect(Collectors.toList());
        System.out.println(trim);
       List join= countries.stream().map(String::join).collect(Collectors.toList());
        System.out.println(join);
        List value=countries.stream().map(String::valueOf).collect(Collectors.toList());
        System.out.println(value);
        Optional.of("ttr");
        LocalDateTime.now();

        ArrayList

    }
}
