package com.xworkz;

import java.util.ArrayList;
import java.util.List;

public class Target {
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
        int target = 90;

        boolean exists = num.stream()
                .anyMatch(n -> n == target);
        System.out.println(exists +" yes found");
    }
}
