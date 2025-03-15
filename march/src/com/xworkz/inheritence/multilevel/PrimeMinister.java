package com.xworkz.inheritence.multilevel;

public class PrimeMinister {
    public String nameOfPM;
    public String party;
    public int electedYear;

    @Override
    public String toString() {
        return "Name Of PM :" +this.nameOfPM +" " +"Party :" +this.party +" "+"Elected Year :"+this.electedYear;
    }
}
