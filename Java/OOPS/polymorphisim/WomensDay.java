package com.xworkz.polymorphisim;

public class WomensDay {
    //properties
    public String day;

    //no argument constructor
    // all argument constructor

    //instance methods
    public void getEventDetails(){
        System.out.println("even details are:");
        getEventDetails(200);
    }
    //method overloading
    public void getEventDetails(String day){
        System.out.println("even details are:"+day);
    }
    public void getEventDetails(int price){
        System.out.println("even details are:"+price);
    }

}
