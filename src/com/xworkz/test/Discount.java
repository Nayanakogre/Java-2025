package com.xworkz.test;

public class Discount {
    public static void main(String[] args) {
        boolean isMemeber=true;
        boolean coupon=false;
        if(coupon==true || isMemeber==true)
        {
            System.out.println("Yess is this person is eligible for discount");
        }
        else {
            System.out.println("Noo this person is not eligible for discount");
        }
    }
}
