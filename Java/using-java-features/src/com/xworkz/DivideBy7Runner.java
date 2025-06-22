package com.xworkz;

import java.util.Scanner;

public class DivideBy7Runner {
    public static void main(String[] args) {
        DivideBy7 num=n->n%7==0;
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        if(num.check(number))
        {
            System.out.println("Its divisible by 7");
        }
        else {
            System.out.println("Its not divisible by 7");
        }
    }
}
