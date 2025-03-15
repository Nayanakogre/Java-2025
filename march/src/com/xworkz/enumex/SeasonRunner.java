package com.xworkz.enumex;

import java.util.Scanner;

public class SeasonRunner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enetr the Tempreture :");
        int tempreture=scanner.nextInt();
        if (Season.SUMMER.getTempreture()==tempreture) {
            System.out.println("Summer");
        }
        else if(Season.RAINY.getTempreture()==tempreture)
        {
            System.out.println("Rainy");
        }
        else if(Season.WINTER.getTempreture()==tempreture)
        {
            System.out.println("Winter");
        }
        else if (Season.SPRING.getTempreture()==tempreture)
        {
            System.out.println("Spring");
        }
        else if(Season.AUTOMON.getTempreture()==tempreture)
        {
            System.out.println("Automon");
        }

    }
}
