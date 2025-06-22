package com.xworkz.set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SetWithHashSet {
    public static void main(String[] args) {


        Set<String> sweets = new HashSet<String>();
        sweets.add("rasgulla");
        sweets.add("peda");
        sweets.add("Doodh peda");
        sweets.add("carrot halva");
        sweets.add("payasa");
        sweets.add("holige");
        sweets.add("mysore pak");
        Set<String> sweets1 = new HashSet<String>();
        sweets1.add("rasgulla");
        sweets1.add("peda");
        sweets1.add("Doodh peda");
        sweets1.add("carrot halva");
        sweets1.add("payasa");
        sweets1.add("holige");
        sweets1.add("mysore pak");

        System.out.println(sweets);
        System.out.println(sweets.contains("rasgulla"));
        System.out.println(sweets.size());
        System.out.println(sweets.isEmpty());
        System.out.println(sweets.addAll(sweets1));

        System.out.println(sweets.hashCode());

        System.out.println(sweets.remove("rasgulla"));
        System.out.println(sweets);
        System.out.println("Stram");
        Stream<String> stream=sweets.stream();
        List getElemts =stream.map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(getElemts);
        List skip= stream.skip(2).collect(Collectors.toList());
        System.out.println(skip);
        List limit=stream.limit(3).collect(Collectors.toList());
        List filter=stream.filter(p->p.length()>10).collect(Collectors.toList());
        System.out.println(filter);
        List sort=stream.sorted().collect(Collectors.toList());
        System.out.println(sort);

    }
}
