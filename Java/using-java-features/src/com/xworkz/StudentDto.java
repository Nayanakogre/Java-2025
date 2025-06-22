package com.xworkz;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
@NoArgsConstructor

public class StudentDto {
    private String name;
    private int id;
    private String collegeName;
    private String branch;
    private int age;

}
