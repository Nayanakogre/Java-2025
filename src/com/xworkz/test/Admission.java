package com.xworkz.test;

public class Admission {
    public static void main(String[] args) {
        float gpa=3.5f;
        boolean hasReleventWorkExpirence=true;
        if(gpa>=3.5f || hasReleventWorkExpirence==true)
        {
            System.out.println("Eligible for admission");
        }
        else {
            System.out.println("Not Eligible for admission");
        }

    }
}
