package com.xworkz.job.dto;

import com.xworkz.job.constants.JobRole;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;
@Getter
@Setter
@EqualsAndHashCode

public class JobPortalDetailsDto {
    private String potralName;
    private JobRole jobRole;
    private String jobSector;
    private int noOfOpenings;
    private LocalDate jobPosted;
    private LocalDate lastDayOfApply;
    private String applicantName;
    private int age;
    private boolean isGrudated;



}
