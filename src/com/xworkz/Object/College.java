//1. create a 10 classes
//1. 15 instance per class
//2. declare a 5 instance variables and 5 instance methods
//3. display all properties


package com.xworkz.Object;

public class College {
    public String collegeName = "SMP";
    public String location = "Sagara";
    public int numberOfDepartments = 10;
    public int numberOfStudents = 2000;
    public double area = 50000.5;

    public College() {
        System.out.println("Running in no arg constructor :");
    }
    public void collegeInfo() {
        System.out.println("Running in instance method 1 :");
    }
    public void collegeInfo1() {
        System.out.println("Running in instance method 1 :");
    }
    public void collegeInfo2() {
        System.out.println("Running in instance method 1 :");
    }
    public void collegeInfo3() {
        System.out.println("Running in instance method 1 :");
    }
    public void collegeInfo4() {
        System.out.println("Running in instance method 1 :");
    }
}
