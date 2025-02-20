//Task 19-02-2025
//3. Declare a array of type String
//1. dipslay the length of the given array
//2. reverse the array
//3. display the duplicate elements in a given array

package com.xworkz.array;

public class Bird {
    static String[] birdNames={"Horn Bill","Humming Bird","Acrot","Penguin","Swan","Sparrow","Humming Bird"};


    public static void length()
    {
        System.out.println(birdNames.length);
    }
    public static void reverse()
    {
        for(int index= birdNames.length-1;index>=0;index--)
        {
            System.out.println(birdNames[index]);
        }
    }
    public static void duplicate()
    {
        for(int i=0;i<birdNames.length;i++)
        {
            for(int j=i+1;j< birdNames.length;j++)
            {
                if(birdNames[i]==birdNames[j])
                {
                    System.out.println(birdNames[i]);
                }
            }
        }
    }

}
