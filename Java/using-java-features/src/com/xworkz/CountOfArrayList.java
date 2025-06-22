package com.xworkz;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CountOfArrayList {
    public static void main(String[] args) {
        List<Integer> num=new ArrayList<>();
        num.add(10);
        num.add(20);
        num.add(49);
        num.add(65);
        num.add(90);
        num.add(2);
        num.add(44);
        num.add(3);

        long count=num.stream().reduce(0,(a,b)->a+b);

        System.out.println(count);

    }
}
