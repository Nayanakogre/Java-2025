package com.xworkz.test;

public class ReverseArray {
    static String[] names={"Anubhav","Abisheik","Arun","ankith","Arathi"};

    public static void main(String[] args) {
        {
             for(int i= names.length-1;i>=0;i--)
             {
                 System.out.println(names[i]);
             }

        }
    }
}
