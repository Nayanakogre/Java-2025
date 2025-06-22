package com.xworkz.job.runner;

import com.xworkz.job.dto.JobPortalDetailsDto;
import com.xworkz.job.repositary.JobPortalRepositaryImpl;
import com.xworkz.job.repositary.JobPortalRepository;
import com.xworkz.job.service.JobPortalDetailsService;
import com.xworkz.job.service.JobPortalDetailsServiceImp;

import java.time.LocalDate;

public class ApplicationRunner {
    public static void main(String[] args) {
        JobPortalDetailsDto jobPortalDetailsDto=new JobPortalDetailsDto();
        jobPortalDetailsDto.setApplicantName("Nayana");
        jobPortalDetailsDto.setJobPosted(LocalDate.now());
        jobPortalDetailsDto.setNoOfOpenings(150);
        jobPortalDetailsDto.setPotralName("LinkedIn");
        jobPortalDetailsDto.setGrudated(true);
        jobPortalDetailsDto.setAge(22);
        jobPortalDetailsDto.setLastDayOfApply(LocalDate.now());
        jobPortalDetailsDto.setJobSector("IT");

        JobPortalRepository jobPortalRepository = new JobPortalRepositaryImpl();
        JobPortalDetailsService jobPortalDetailsService=
                new JobPortalDetailsServiceImp(jobPortalRepository);
        jobPortalDetailsService.validation(jobPortalDetailsDto);
    }
}
