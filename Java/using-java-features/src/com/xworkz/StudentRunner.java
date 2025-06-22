package com.xworkz;

import java.util.ArrayList;
import java.util.List;

public class StudentRunner {
    public static void main(String[] args) {
        List<StudentDto> studentDtos = new ArrayList<>();
        studentDtos.add(new StudentDto("Guru Prasad",101,"AMC College Of Enineering","CS&E",24));
        studentDtos.add(new StudentDto("Sahana P",102,"DYNS COllege Of Enginnering","CS&E",22));
        studentDtos.add(new StudentDto("Amogha S Hegde",103,"NMIT ","CS&E",24));
        studentDtos.add(new StudentDto("Kiran A R",104,"UBDT College Of Enginnering","Mech",24));
        studentDtos.add(new StudentDto("Reeba Mathews",105,"Malnad College Of Engineering","IS&E",22));
        StudentImpl student=new StudentImpl();
        student.save(new StudentDto("Guru Prasad",101,"AMC College Of Enineering","CS&E",24));

        System.out.println(student.search(101));

    }

}
