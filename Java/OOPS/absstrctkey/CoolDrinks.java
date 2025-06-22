package com.xworkz.absstrctkey;

public abstract class  CoolDrinks {
    public String drinkName;
    public double cost;
    public CoolDrinks()
    {

    }
    public CoolDrinks(double cost)
    {
        this.cost=cost;
        System.out.println(cost);
        System.out.println("Ruuning in no arg constructer");
    }
    public  void drink()
    {
        System.out.println("Ruuning in drink method");
        drinkName="Mango juice";
        System.out.println(drinkName);
    }
    public static void sip()
    {
        System.out.println("Running in sip method ");


    }
    public abstract void drinkJuice();

}
