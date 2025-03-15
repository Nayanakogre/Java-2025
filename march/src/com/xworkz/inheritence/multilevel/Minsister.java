package com.xworkz.inheritence.multilevel;

public class Minsister {
    public String nameOfMinister;
    public String mpDivision;
    public String post;

    @Override
    public String toString()
    {
        return "Name Of President :" +this.nameOfMinister +" "
                +"M P Division :" +this.mpDivision +" "
                +"Post :" +this.post ;
    }
}
