package com.xworkz.inheritence;

public class SweetRunner {
    public static void main(String[] args) {
        Peda peda=new Peda();
        peda.sweetName="Dhood Peda";
        peda.pricePerKg=550;
        peda.isTasty=true;
        peda.sweetDetails();
        System.out.println("-------------------------------------------");
        DoodhPeda doodhPeda=new DoodhPeda();
        doodhPeda.doodhPedadetails();
        //downcating
        Sweet sweet1=new DoodhPeda();
        sweet1.sweetName="Doodh Peda";
        sweet1.isTasty=true;
        sweet1.pricePerKg=600;
        sweet1.sweetDetails();
        System.out.println("-------------------------------------------");

        Sweet sweet2=new Peda();
        sweet2.sweetName="Doodh Peda";
        sweet2.isTasty=true;
        sweet2.pricePerKg=600;
        sweet2.sweetDetails();
        System.out.println("-------------------------------------------");

        Sweet sweet3=new CarrotHalva();
        sweet3.sweetName="Carror halva";
        sweet3.isTasty=true;
        sweet3.pricePerKg=600;
        sweet3.sweetDetails();
        Peda peda1=new DoodhPeda();
    }
}
