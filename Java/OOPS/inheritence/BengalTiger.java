package com.xworkz.inheritence;

public class BengalTiger extends Tiger{
    public BengalTiger()
    {
        super.animal_name="Benagl Tiger";
        super.habitate="Deep Forest";
        super.food_culture="meat Based";
        super.is_endgered=true;

    }
    public void bengalTigerDetails()
    {
        System.out.println(super.animal_name);
        System.out.println(super.habitate);
        System.out.println(super.food_culture);
        System.out.println(super.is_endgered);
    }
}
