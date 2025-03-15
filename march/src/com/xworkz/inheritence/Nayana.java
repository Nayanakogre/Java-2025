package com.xworkz.inheritence;

public class Nayana extends com.xworkz.inheritence.BirthDay {
    public String name;
    public int age;
    private int birthYear;
    private String Month;
    protected double height;
    protected double weight;
    String education;
    String placeOfBirth;

    //accessing  from BirthDay and assiging values
    public Nayana()
    {
        this.BirthYearB=2002;
        this.BirthMonthB="March";
//        this.BirthDayB="thursday";
//        this.placeOfBirthB="Sagara";
        this.ageB=23;
        this.genderB="Female";
        this.birthtTimeB="1:30PM";
        this.nationalityOfPersonB="Indian";
        this.BirthDayDetails();
    }

}
