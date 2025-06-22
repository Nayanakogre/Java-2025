package com.xworkz;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntPredicate;

public class OddEven {
    public static void main(String[] args) {
        IntPredicate isEven = num -> num % 2 == 0;
        IntPredicate isOdd = num -> num % 2 != 0;

        int number = 7;
        System.out.println(number + " is even? " + isEven.test(number));
        System.out.println(number + " is odd? " + isOdd.test(number));
    }


}
