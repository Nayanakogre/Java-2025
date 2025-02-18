package com.xworkz.runner;

import com.xworkz.overloading.Payment;

public class PaymentRunner {
    public static void main(String[] args) {
        Payment.payment();
        Payment.payment("online");
        Payment.payment(8754l);
        Payment.payment(345);
        Payment.payment("offline","Arjun");
        Payment.payment(345.7,843);
        Payment.payment(345.7,843,"Apporva");
        Payment.payment("arjun","Sushas","11-12-2024");
        Payment.payment(693,984543l,"Amulya");
        Payment.payment("online",10000.9,765l,890);
        Payment.payment(678,8776665l);
        Payment.payment(678,5667.98);
        Payment.payment("online",678.9,876756l,890);
        Payment.payment(8653422l,"25-06-24");
        Payment.payment(900.0,89);




    }
}
