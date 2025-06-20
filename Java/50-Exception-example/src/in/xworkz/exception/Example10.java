package in.xworkz.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Example10 extends IOException {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            reader.readLine();
        } catch (IOException e) {
            //System.out.println("I/O error occurred");
            e.printStackTrace();
        }
    }
}