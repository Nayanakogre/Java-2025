package com.xworkz.test;

import java.util.Scanner;

class MissingNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        int[] arr=new int[number];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scanner.nextInt();
        }

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
