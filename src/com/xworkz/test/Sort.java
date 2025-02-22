package com.xworkz.test;

public class Sort {
    public static void main(String[] args) {
        int[] num = {2, 9, 3, 5, 7, 8, 4};
        System.out.println("Before Sorting");
        for(int unsort:num)
        {

            System.out.print(unsort+" ");
        }
        System.out.println();
        System.out.println("Before Sorting");
        for (int i = 0; i < num.length; i++) {
            for (int j = i+1; j < num.length; j++) {
                int temp=0;
                if(num[j]<num[i])
                {
                    temp=num[i];
                    num[i]=num[j];
                    num[j]=temp;
                }
            }
            System.out.print(num[i]+" ");
        }
    }
}




