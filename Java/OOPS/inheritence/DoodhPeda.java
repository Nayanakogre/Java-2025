package com.xworkz.inheritence;

public class DoodhPeda extends Peda{
    public DoodhPeda()
    {
        super.sweetName="Dood Peda";
        super.isTasty=true;
        super.pricePerKg=1000;
    }
    public  void doodhPedadetails()
    {
        System.out.println(super.sweetName);
        System.out.println(super.isTasty);
        System.out.println(super.pricePerKg);
    }
}
