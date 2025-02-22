package com.xworkz.test;

public class MaxMin {
    static int[] number={1,2,3,4,5,6,7,8,9,10};
    public static void main(String[] args) {
        MaxMin.max();
        MaxMin.min();
    }
    public static void max()
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++)
        {
            if(number[i]>max)
            {
              max=number[i];
            }
        }
        System.out.println("Max :"+max);
    }

    public static void min()
    {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<number.length;i++)
        {
            if(number[i]<min)
            {
                min=number[i];
            }
        }
        System.out.println("Min :"+min);
    }
}
