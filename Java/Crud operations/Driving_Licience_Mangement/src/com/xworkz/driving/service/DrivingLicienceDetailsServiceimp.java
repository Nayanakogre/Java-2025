package com.xworkz.driving.service;

import com.xworkz.driving.dto.DrivingLicienceDetailsDto;

public class DrivingLicienceDetailsServiceimp implements DrivingLicienceDetailsService {
    @Override
    public boolean validation(DrivingLicienceDetailsDto drivingLicienceDetailsDto) {
        if (drivingLicienceDetailsDto != null) {
            if (drivingLicienceDetailsDto.getDrivingLicienceHolder().length() > 2) {
                System.out.println("Name is valid");
            } if  (drivingLicienceDetailsDto.getVechicle().length() > 2) {
                System.out.println("Vechicle is valid");
            } if  (drivingLicienceDetailsDto.getAge() >= 18) {
                System.out.println("Valid age to have drivon liciece ");
            } if (drivingLicienceDetailsDto.getNationality().equalsIgnoreCase("Indian")) {
                System.out.println("Valid Nationality");
            }
                if (drivingLicienceDetailsDto.getLicienceNo().length() > 4) {
                    System.out.println("Valid driving licience");
                }
                return true;
            }

            return false;
        }
    }



