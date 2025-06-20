package com.xworkz.clone;

import java.io.File;

public class CloneDemoRunner {
    public static void main(String[] args) throws CloneNotSupportedException {
        CloneDemo orginal=new CloneDemo("Abisheik","abi@gmail.com",23);
        orginal.setAge(24);
        Cloneable clone=orginal.clone();
        orginal.setAge(21);

        System.out.println(orginal);

        System.out.println(clone);
    }

}
