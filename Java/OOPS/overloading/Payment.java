package com.xworkz.overloading;

import java.sql.SQLOutput;

public class Payment {
    public static void payment() {
        System.out.println(" parameter-0");
    }

    public static void payment(String modeOfPayment) {
        System.out.println(" parameter-1-string");
        System.out.println("Mode of Payment :" + modeOfPayment);

    }

    public static void payment(double ammount) {
        System.out.println(" parameter-1-double");
        System.out.println("Ammount :" + ammount);
    }

    public static void payment(long cardnumber) {
        System.out.println(" parameter-1-long");
        System.out.println("Card number" + cardnumber);
    }

    public static void payment(int cvvNo) {
        System.out.println(" parameter-1-int");
        System.out.println("CVV Number" + cvvNo);
    }

    public static void payment(String modeOfPayment, String name) {
        System.out.println(" parameter-2-string,string");
        System.out.println("Mode of Payment :" + modeOfPayment);
        System.out.println("Name of the custumer :" + name);
    }

    public static void payment(String modeOfPayment, String name, String date) {
        System.out.println(" parameter-3-string,string,string");
        System.out.println("Mode of Payment :" + modeOfPayment);
        System.out.println("Name of the custumer :" + name);
        System.out.println("Date of payment :" + date);
    }

    public static void payment(double ammount, int cvvNo) {
        System.out.println(" parameter-2-double,int");
        System.out.println("Ammount :" + ammount);
        System.out.println("CVV Number" + cvvNo);
    }

    public static void payment(double ammount, int cvvNo, String name) {
        System.out.println(" parameter-3-double,int,String");
        System.out.println("Ammount :" + ammount);
        System.out.println("CVV Number" + cvvNo);
        System.out.println("Name of the custumer :" + name);
    }

    public static void payment(double ammount, int cvvNo, String date, String name) {
        System.out.println(" parameter-4-double,int,string,string");
        System.out.println("Ammount :" + ammount);
        System.out.println("CVV Number" + cvvNo);
        System.out.println("Date of payment :" + date);
        System.out.println("Name of the custumer :" + name);
    }

    public static void payment(int cvvNo, double ammount) {
        System.out.println(" parameter-2-int,double");
        System.out.println("CVV Number" + cvvNo);
        System.out.println("Ammount :" + ammount);
    }

    public static void payment(int cvvNo, double ammount, String name) {
        System.out.println(" parameter-2-int,double");
        System.out.println("CVV Number" + cvvNo);
        System.out.println("Ammount :" + ammount);
        System.out.println("Name of the custumer :" + name);
    }

    public static void payment(String modeOfPayment, double ammount,
                               long cardnumber, int cvvNo) {
        System.out.println(" parameter-4-string,double,long,int");
        System.out.println("Mode of Payment :" + modeOfPayment);
        System.out.println("Ammount :" + ammount);
        System.out.println("Card number" + cardnumber);
        System.out.println("CVV Number" + cvvNo);
    }

    public static void payment(int cvvNo, long cardnumber) {
        System.out.println(" parameter-2-int,long");
        System.out.println("CVV Number" + cvvNo);
        System.out.println("Card number" + cardnumber);
    }

    public static void payment(int cvvNo, long cardnumber, double ammount) {
        System.out.println(" parameter-2-int,long");
        System.out.println("CVV Number" + cvvNo);
        System.out.println("Card number" + cardnumber);
        System.out.println("Ammount :" + ammount);
    }

    public static void payment(long cardnumber, String exp) {
        System.out.println(" parameter-2-long,String");
        System.out.println("Card number" + cardnumber);
        System.out.println("Expiry date" + exp);

    }
}












