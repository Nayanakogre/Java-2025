package com.xworkz.objectmethods;

public class StudentRunner {
    public static void main(String[] args) {
        Student student=new Student();
        student.setName("Amogha");
        student.setUsn("4NM21CS401");
        student.setCourse("Engineering");
        student.setAge(24);
        student.setIndian(true);

        Student student1=new Student();
        student1.setName("Amogha");
        student1.setUsn("4NM21CS401");
        student1.setCourse("Engineering");
        student1.setAge(24);
        student1.setIndian(true);

        Student student2=new Student();
        student2.setName("Adarsha");
        student2.setUsn("4NM20CS401");
        student2.setCourse("Engineering");
        student2.setAge(25);
        student2.setIndian(true);

        Student student3=new Student();
        student3.setName("Adarsha");
        student3.setUsn("4NM20CS401");
        student3.setCourse("Engineering");
        student3.setAge(25);
        student3.setIndian(true);

        Student student4=new Student();
        student4.setName("Adarsha");
        student4.setUsn("4NM20CS401");
        student4.setCourse("Engineering");
        student4.setAge(25);
        student4.setIndian(true);

        Student student5=new Student();
        student5.setName("Amogha");
        student5.setUsn("4NM21CS401");
        student5.setCourse("Engineering");
        student5.setAge(24);
        student5.setIndian(true);

        System.out.println(student.equals(student1));
        System.out.println(student.equals(student2));
        System.out.println(student.equals(student3));
        System.out.println(student3.equals(student4));
        System.out.println(student.equals(student5));
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
        System.out.println(student3.hashCode());
        System.out.println(student4.hashCode());
        System.out.println(student.hashCode());

    }
}
