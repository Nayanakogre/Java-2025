package com.xworkz.test;

public class ArrayBoundException {
    public static void main(String[] args)
    {
        String[] names = {"Anubhav", "Abisheik", "Arun", "ankith", "Arathi"};
        for (int i = 0; i <= names.length; i++)
        {
            System.out.println(names[i]);
        }
    }
}
