package com.xworkz.driving.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@EqualsAndHashCode

public class DrivingLicienceDetailsDto {
    private String drivingLicienceHolder;
    private String vechicle;
    private int age;
    private String licienceNo;
    private String nationality;

}
