package in.xworkz.exception;

import java.util.Scanner;

public class Example11 extends Exception {
    public static void main(String[] args) {
        try {
            System.out.println("---------------------try entry-------------");
            Scanner scanner = new Scanner(System.in);
            scanner.close();
            scanner.next();
        } catch (Throwable e) {
            System.out.println("---------------------catch entry-------------");
            e.printStackTrace();
        }
    }
}
