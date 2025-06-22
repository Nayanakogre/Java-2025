package com.xworkz.constructer;

public class Olymics {
    public int establishedYear;
    public int year;
    public String hostingCountry;
    public String hostingPlace;
    public int duration;
    public int noOfCountries;
    public String topWinngCountry;
    public int totalGames;
    public String nextHostingCountry;
    public int occurEvey;
    public String[] countries;


    public Olymics()
    {
        System.out.println("Running in 0 -arg constructer");
    }
    public Olymics(int establishedYear,int occurEvey,String hostingCountry,String hostingPlace,int duration,
                   String topWinngCountry,int totalGames,int year,String nextHostingCountry,int noOfCountries)
    {
        System.out.println("Running in 10 -arg constructer");
        this.year=year;
        this.duration=duration;
        this.establishedYear=establishedYear;
        this.hostingPlace=hostingPlace;
        this.nextHostingCountry=nextHostingCountry;
        this.noOfCountries=noOfCountries;
        this.topWinngCountry=topWinngCountry;
        this.occurEvey=occurEvey;
        this.totalGames=totalGames;
        this.hostingCountry=hostingCountry;


    }
    public Olymics(String hostingPlace)
    {

        this(1876,4);
        System.out.println("Running in 1- String -arg constructer");
        this.hostingPlace=hostingPlace;
    }
    public Olymics(int establishedYear,int occurEvey)
    {
        this("China",100,2024);
        System.out.println("Running in 2 -arg constructer");
        this.establishedYear=establishedYear;
        this.occurEvey=occurEvey;
    }
    public Olymics(String topWinngCountry,int totalGames,int year)
    {
        this(100);
        System.out.println("Running in 3 -arg constructer");
        this.topWinngCountry=topWinngCountry;
        this.totalGames=totalGames;
        this.year=year;
    }
//    public Olymics(int totalGames)
//    {
//        System.out.println("Running in 1- int -arg constructer");
//        this.totalGames=totalGames;
//
//    }
    public Olymics(int size)
    {
        this.countries=new String[size];
        System.out.println(countries.length);
    }

}
