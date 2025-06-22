package com.xworkz.objectmethods;

import java.util.Objects;

public class Student {
    private String name;
    private String usn;
    private String course;
    private boolean isIndian;
    private int age;
    Object[] dog={78,"hhjf"};

    @Override
    public String toString()
    {
        return "Name :"+this.name +" "
                +"USN :"+this.usn +" "
                +"Course :"+this.course +" "
                +"Is Indian :"+this.isIndian +" "
                +"Age :"+this.age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsn() {
        return usn;
    }

    public void setUsn(String usn) {
        this.usn = usn;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public boolean isIndian() {
        return isIndian;
    }

    public void setIndian(boolean indian) {
        isIndian = indian;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public Student()
    {
        System.out.println("Running in non arg Constructer");
    }

    @Override
    public boolean equals(Object obj) {

        if(obj==null)
            return false;

        if(this==obj)
            return true;

        if(!(obj instanceof Student))

            return false;
        Student s=(Student) obj;


        if(!(this.getName().equals(s.getName()) &&
                this.getAge()==s.getAge() &&
                this.getCourse().equals(s.getCourse())&&
                this.getUsn().equals(s.getUsn()) &&
                this.isIndian()==s.isIndian())
        )

            return false;


        return true;


    }
    @Override
    public int hashCode()
    {
        return Objects.hash(56,"ghfgf");
    }
}
