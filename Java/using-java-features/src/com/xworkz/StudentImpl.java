package com.xworkz;

import java.util.ArrayList;
import java.util.List;

public class StudentImpl {


    List<StudentDto> studentDtos = new ArrayList<>();

    public void save(StudentDto student) {

        boolean add = studentDtos.stream().anyMatch(p -> p.getId() == student.getId());
        if (!add) {
            studentDtos.add(student);
            System.out.println("Element added succesfully");
        } else {
            System.out.println("Its duplicate value");
        }
    }

    public StudentDto search(int id) {
         return studentDtos.stream().filter(p->p.getId()==id).findFirst().orElse(null);
    }

}



