package in.xworkz.exception;

import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        try {
            System.out.println("---------------------try entry-------------");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            System.out.println("Enter a String");
        } catch (Throwable e) {
            System.out.println("---------------------catch entry-------------");
            e.printStackTrace();

        }
    }
}
