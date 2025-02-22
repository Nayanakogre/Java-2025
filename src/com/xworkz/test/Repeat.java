package com.xworkz.test;

public class Repeat {
    public static void main(String[] args)
        {

            char[] letters={'a','b','c','d','e','f','g','a','b'};
            System.out.println("Repeated Characters are :");
            for(int i=0;i<letters.length;i++)
            {
                for(int j=i+1;j< letters.length;j++)
                {
                    if(letters[i]==letters[j])
                    {
                        System.out.print(letters[i] +" ");
                    }
                }
            }
        }
    }
