package in.xworkz.exception.custom;

import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionExample {
    public static void main(String[] args) {
        try {
            fileFound();

        }catch (IOException e)
        {
            System.out.println("IOException Happended");
        }
finally {
            System.out.println("Running in finally");
            System.out.println("Check the file name its present or not");
        }
    }
    public static void fileFound()
    {
        FileReader fileReader=new FileReader("Abc.txt");
        throw new IOException("File not found");
    }
}
