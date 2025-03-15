package com.xworkz.inheritence.single;

public class MasalaPuri extends Snacks {
    public MasalaPuri()
    {
        //constructer chainaining in diffrent class
        super("MasalaPuri");
        System.out.println("Running in Masala puri class");
    }
    @Override
    public void sweet()
    {
        System.out.println("Running in overided sweet method");
        System.out.println("Rasgulla is sweet");
    }

    @Override
    public void spice()
    {
        System.out.println("Running in overided spice method");
        System.out.println("Masala puri is spicy");
    }
    @Override
    public void dessert()
    {
        System.out.println("Running in  overrided dessert method");
        System.out.println("Ice cream is a dessert");
    }

    @Override
    public void breakfast()
    {
        System.out.println("Running in overrided breakfast method");
        System.out.println("Idli is breakfast");
    }

}
