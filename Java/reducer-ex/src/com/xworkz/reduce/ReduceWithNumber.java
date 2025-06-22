package com.xworkz.reduce;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ReduceWithNumber {
    public static void main(String[] args) {
       Stream<Integer> number= Stream.of(1,2,2,3,4,6,7,8,9);
        //System.out.println(number.reduce(0,(a,b)->a+b));
        //System.out.println(number.reduce(Integer.MIN_VALUE, (a, b) -> Math.max(a, b)));
        //System.out.println(number.reduce(Integer.MAX_VALUE, (a, b) -> Math.min(a, b)));

        Optional max=number.reduce(Integer::max);

            if(max.isPresent())
            {
                System.out.println(max);
            }
            Optional min=number.reduce(Integer::min);

            if(min.isPresent())
            {
                System.out.println(min);
            }
        Optional sum=number.reduce(Integer::sum);
        if(sum.isPresent())
        {
            System.out.println(sum.get());
        }

       // System.out.println(number.reduce(Integer::sum));
    }
}
