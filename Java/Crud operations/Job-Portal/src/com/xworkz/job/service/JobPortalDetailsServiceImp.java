package com.xworkz.job.service;

import com.xworkz.job.dto.JobPortalDetailsDto;
//import com.xworkz.job.repositary.JobPortalRepositary;
import com.xworkz.job.repositary.JobPortalRepositaryImpl;
import com.xworkz.job.repositary.JobPortalRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class JobPortalDetailsServiceImp implements JobPortalDetailsService{
    private JobPortalRepository jobPortalRepository;
    @Override
    public boolean validation(JobPortalDetailsDto jobPortalDetailsDto) {

        if(jobPortalDetailsDto!=null)
        {
            if(jobPortalDetailsDto.getPotralName().equalsIgnoreCase("LinkedIn"))
            {
                System.out.println("Running in LinkedIn");
            }
            else if(jobPortalDetailsDto.getPotralName().equalsIgnoreCase("Naukari"))
            {
                System.out.println("Running in Naukari");
            }
            else if(jobPortalDetailsDto.getPotralName().equalsIgnoreCase("Unstop"))
            {
                System.out.println("Running in Unstop");
            }
            else if(jobPortalDetailsDto.getPotralName().equalsIgnoreCase("LinkedIn"))
            {
                System.out.println("Running in LinkedIn");
            }
            if(jobPortalDetailsDto.getPotralName().equalsIgnoreCase("software Development"))
            {
                System.out.println("Its a development job");
            }
            else if(jobPortalDetailsDto.getPotralName().equalsIgnoreCase("software Tester"))
            {
                System.out.println("Its a Testing job");
            }
            else if(jobPortalDetailsDto.getPotralName().equalsIgnoreCase("Cluod Engineer"))
            {
                System.out.println("Its a cloud  job");
            }
            else if(jobPortalDetailsDto.getPotralName().equalsIgnoreCase("Bussiness Associate"))
            {
                System.out.println("Its a Human resource job");
            }
            if(jobPortalDetailsDto.getAge()>18)
            {
                System.out.println("Applicant is eligible to apply job");
            }
            if(jobPortalDetailsDto.getNoOfOpenings() <= 100)
            {
                System.out.println("no of openings are below ");
            }
           else if(jobPortalDetailsDto.getNoOfOpenings() >100)
            {
                System.out.println("Its a mass hiring");
            }
            if(jobPortalDetailsDto.isGrudated()==true)
            {
                System.out.println("Yess  graduated");
            }
            if(jobPortalDetailsDto.isGrudated()==false)
            {
                System.out.println("Not graduated");
            }
            if(jobPortalDetailsDto.isGrudated()==true)
            {
                System.out.println("Eligible for applying job");
            }
            jobPortalRepository.save(jobPortalDetailsDto);
return true;

        }
        return false;
    }
}
