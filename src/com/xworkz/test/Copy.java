package com.xworkz.test;

public class Copy {

    public static void main(String[] args) {
        int[] num = {2, 9, 3, 5, 7, 8, 4};
        System.out.println("orginal Array :");
        for(int original:num)
        {
            System.out.print(original+" ");
        }
        System.out.println();
        System.out.println("Duplicate Array :");
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                if (num[i] == num[j]) {

                    System.out.print(num[j] +" ");
                }

            }

        }
    }
}

