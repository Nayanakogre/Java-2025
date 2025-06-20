package com.xworkz.ex;

import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Runner2 {
    public static void main(String[] args) {
        AnoExample anoExample=(a)->{
            System.out.println(a+" Lambda Expression");
        };
        anoExample.greet(10);
        Consumer consumer=(t)->{
            System.out.println(t+ "Consumer ");
        };
        consumer.accept("nayana");

        Supplier supplier=()->{
            System.out.println("Supplier");
            return new String("value") ;
        };
        supplier.get();
        System.out.println("---------------------------------------");
        UnaryOperator unaryOperator=(u)->{
            System.out.println(u+" Unary operator");
            return new String("unary");
        };
        unaryOperator.apply("house");
    }
}
