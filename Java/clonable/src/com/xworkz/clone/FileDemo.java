package com.xworkz.clone;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {

String name="one.txt";
String info="two.txt";
        File file = new File(name);
        file.createNewFile();
        File file1 = new File(info);
        file.createNewFile();
       // file.delete();
        System.out.println(file.getParentFile());
        System.out.println(file.getParent());
        System.out.println(file);
        System.out.println(file.isHidden());
        System.out.println(file.canExecute());
        System.out.println(file.exists());
        System.out.println(file.getName());
        System.out.println(file.compareTo(file));
        file.
    }
}
