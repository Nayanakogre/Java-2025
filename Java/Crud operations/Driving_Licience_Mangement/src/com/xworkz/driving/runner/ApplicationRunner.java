package com.xworkz.driving.runner;

import com.xworkz.driving.dto.DrivingLicienceDetailsDto;
import com.xworkz.driving.service.DrivingLicienceDetailsService;
import com.xworkz.driving.service.DrivingLicienceDetailsServiceimp;

public class ApplicationRunner {
    public static void main(String[] args) {
        DrivingLicienceDetailsDto drivingLicienceDetailsDto=
                new DrivingLicienceDetailsDto();

        drivingLicienceDetailsDto.setLicienceNo("664hg876");
        drivingLicienceDetailsDto.setDrivingLicienceHolder("nayana");
        drivingLicienceDetailsDto.setAge(22);
        drivingLicienceDetailsDto.setVechicle("Car");
        drivingLicienceDetailsDto.setNationality("Indian");
        DrivingLicienceDetailsService drivingLicienceDetailsService=
                new DrivingLicienceDetailsServiceimp();
        drivingLicienceDetailsService.validation(drivingLicienceDetailsDto);


    }
}
