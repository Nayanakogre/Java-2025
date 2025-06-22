package com.xworkz.voter.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDetailsDto {

    private String userName;
    private   long mobileNo;
    private long adharNo;
    private long voterNo;
    private long panNo;
    private String adress;
    private int age;
    private String email;
}
