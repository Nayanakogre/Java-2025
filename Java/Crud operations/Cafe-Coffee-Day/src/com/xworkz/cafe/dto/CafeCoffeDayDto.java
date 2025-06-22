package com.xworkz.cafe.dto;

import com.xworkz.cafe.constant.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;
@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class CafeCoffeDayDto {
    private String owner;
    private String ceo;
    private String fullName;
    private String country;
    private String headQuatras;

    private int noOfbranches;
    private int noOfCountriesToHaveBranch;
    private boolean isMultinational;
    private double averagePrice;
    private long phoneNo;
    private int id;

    private LocalDate startDate;
    private LocalDate meetingDate;
    private LocalTime meetingTime;
    private LocalDate newBranchOpeningDate;
    private LocalTime newBranchOpeningTime;

    private Snacks snacks;
    private LocationInBengaluru locationInBengaluru;
    private LocationInIndia locationInIndia;
    private CountriesToHaveBranch countriesToHaveBranch;
    private CoffeeVariety coffeeVariety;


}
