package com.xworkz;

import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to this Application");
        String messege;
        while (true) {
            messege = scanner.nextLine();

               switch (messege) {
                case "Hello":
                    System.out.println("Hello, How are you");
                    break;
                case "Fine You":
                    System.out.println("Fine,how is your day");
                    break;
                case "Good":
                    System.out.println("Amazing");
                    break;
                default:
                    System.out.println("Thank you for using this Application,Visit Again");
            }

        }
    }
}


