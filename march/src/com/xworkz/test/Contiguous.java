package com.xworkz.test;

import java.util.Scanner;

public class Contiguous {
    public static int maxSum(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum;

        for (int i = 0; i < arr.length; i++) {
            currentSum = 0;
            for (int j = i+1; j < arr.length; j++) {  // Fixed condition
                currentSum += arr[j];
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] arr = new int[number];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(maxSum(arr));
        scanner.close();
    }
}
