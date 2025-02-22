package com.xworkz.test;

public class Vowels {
    public static void main(String[] args) {


        String sentence = "Hello how are you";
        int vowelsCount=0;
        int consonetCount=0;
        for (int i = 0; i < sentence.length();i++)
        {
            char ch=sentence.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='I'||ch=='U')
            {
                vowelsCount++;
            }
            else {
                consonetCount++;
            }
        }
        System.out.println("Count Of vowels :"+vowelsCount);
        System.out.println("Count Of Consonet :"+consonetCount);
    }
}