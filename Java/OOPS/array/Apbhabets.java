//Task 19-02-2025

//2. Declare a array of type char

//1. find the number of vowels and consonents
//2. display the array length
//3. search if given char is present in array or not
//4. reverse the given array





package com.xworkz.array;

public class Apbhabets {
    public static char alphas[]={'a','b','c','d','e','f','g','h','i','j','k','l'};

    public static void vowelConsonantCount() {
        int vowelsCount = 0, consonantCount = 0;

        for (char ch : alphas) {
            ch = Character.toLowerCase(ch);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelsCount++;
            } else {
                consonantCount++;
            }
        }
        System.out.println("Count of vowels: " + vowelsCount);
        System.out.println("Count of consonants: " + consonantCount);
    }
    public static void length()
    {
        System.out.println("The Length of the array of type char"+alphas.length);
    }
    public static void searchChar()
    {

        for(int index=0;index<alphas.length;index++)
        {
            if(alphas[index]=='c')
            {
                System.out.println("Yes seached char "+alphas[index] +" is present");
            }
        }
    }
    public static void revere()
    {
        System.out.println("Reverse of an array :");
        for(int index=alphas.length-1;index>=0;index--)
        {
            System.out.println(alphas[index]);
        }
    }

}
