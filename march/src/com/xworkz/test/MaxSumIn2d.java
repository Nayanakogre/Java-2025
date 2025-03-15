package com.xworkz.test;

public class MaxSumIn2d {
    public static void main(String[] args) {


        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int maxSum=Integer.MIN_VALUE;
        int currentsum=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++) {

                int k;
                for (k = i + 1; i < arr.length; k++) {
                    currentsum += arr[i][j];
                }
                if (currentsum > maxSum)
                {
                maxSum=currentsum;
                }
            }
        }
    }
}
