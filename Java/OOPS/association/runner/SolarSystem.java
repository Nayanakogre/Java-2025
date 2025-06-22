package com.xworkz.association.runner;

import com.xworkz.association.Moon;
import com.xworkz.association.Sun;


public class SolarSystem {
    Sun sun;
    Moon moon;
    private int planets;

    public void setSun(Sun sun)
    {
        this.sun=sun;
    }
    public Sun getSun()
    {
        return sun;
    }
    public void setMoon(Moon moon)
    {
        this.moon=moon;
    }
    public Moon getMoon()
    {
        return moon;
    }
//    public void setPlanets(int planets)
//    {
//        this.planets=planets;
//    }
//    public int getPlanets()
//    {
//        return planets;
//    }

    @Override
    public boolean equals(Object obj)
    {
        if(obj==null)
        {
            return false;
        }
        if(this==obj)
        {
            return true;
        }
        if(!(obj instanceof SolarSystem))
            return false;
        SolarSystem s=(SolarSystem) obj;
//        System.out.println("===sun=="+(this.sun.equals(s.sun)));
//        System.out.println("moon:"+this.moon.equals(s.moon) );
        if(!(this.getSun()!=null &&this.getSun().equals(s.getSun()) && this.getMoon()!=null &&this.getMoon().equals(s.getMoon()) ))
        {
            return false;
        }
        return true;
    }
}
