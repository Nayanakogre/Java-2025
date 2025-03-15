package com.xworkz.test;

import java.util.Scanner;

public class Greater
{
    public static boolean findNextGreater(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int nextGreater = -1;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    nextGreater = arr[j];
                    break;
                }
            }
            System.out.print(nextGreater + " ");
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        int[] arr=new int[number];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scanner.nextInt();
        }
        System.out.println(findNextGreater(arr));
    }
}


