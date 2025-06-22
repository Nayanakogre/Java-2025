package com.xworkz.inheritence.multilevel;

public class President {
    public String name;
    public int age;
    public int term;

    @Override
    public String toString()
    {
        return "Name :" +this.name +" " +"Age :" +this.age +"  " +"Term" +this.term;
    }

}
