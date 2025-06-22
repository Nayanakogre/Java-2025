package com.xworkz.runner;

import com.xworkz.constructer.Olymics;

import java.util.Scanner;


public class OlymicRunner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Olymics olymics=new Olymics();
        System.out.println("--------------------------------------------------------");
        Olymics olymics1=new Olymics(scanner.nextLine());
        System.out.println(olymics1.establishedYear);
        System.out.println(olymics1.duration);
        System.out.println(olymics1.hostingCountry);
        System.out.println(olymics1.noOfCountries);
        System.out.println(olymics1.hostingPlace);
        System.out.println(olymics1.nextHostingCountry);
        System.out.println(olymics1.occurEvey);
        System.out.println(olymics1.totalGames);
        System.out.println(olymics1.year);
        System.out.println(olymics1.topWinngCountry);
        System.out.println("--------------------------------------------------------------");
        //Olymics olymics2=new Olymics("Los Angles");
//        Olymics olymics5=new Olymics(scanner.nextLine());
//        System.out.println(olymics5.hostingPlace);
//        Olymics olymics3=new Olymics(22);
    }
}
