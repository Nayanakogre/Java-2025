package com.xworkz.test;

import java.util.Scanner;

public class Miss
{
    public static int missingNumber(int[] arr)
    {
        int n=arr.length+1;
        int sum1=0;
        for(int i=0;i<arr.length;i++)
        {
            sum1=sum1+arr[i];
        }
        int sum2=n*(n+1)/2;
        return sum2-sum1;

    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        int[] arr=new int[number];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scanner.nextInt();
        }
        System.out.println(missingNumber(arr));
    }
}

