package com.xworkz;

import java.util.Scanner;

public class OddEvenCheckRunner {
    public static void main(String[] args) {
        OddEvenCheck isEven = n -> n % 2 == 0;
        OddEvenCheck isOdd = n -> n % 2 != 0;

        Scanner scn=new Scanner(System.in);
        System.out.println("Enter a number to check odd or even");
        int number=scn.nextInt();
        if (isEven.check(number)) {
            System.out.println("Even number");
        } else if (isOdd.check(number)) {
            System.out.println("Odd Number");
        }
    }
}
