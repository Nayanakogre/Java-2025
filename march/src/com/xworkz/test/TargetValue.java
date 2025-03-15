package com.xworkz.test;

public class TargetValue {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };


        int search=2;
        boolean found=false;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++) {
                if (search == arr[i][j]) {
                    found = true;
                    break;
                }
            }
            if(found)
                break;
            }
        if(found==true)
        {
            System.out.println("true");
        }
        else {
            System.out.println(false);
        }

        }

    }

