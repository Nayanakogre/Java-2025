package com.xworkz.voter.runner;

import com.xworkz.voter.dto.UserDetailsDto;
import com.xworkz.voter.service.UserDetailsService;
import com.xworkz.voter.service.UserDetailsServiceImp;

public class ApplicationRunner {
    public static void main(String[] args)
    {
        UserDetailsDto userDetailsDto=new UserDetailsDto();
        userDetailsDto.setAdharNo(98676453432l);
        userDetailsDto.setUserName("Abisheik");
        userDetailsDto.setAdress("Bengaluru");
        userDetailsDto.setAge(22);
        userDetailsDto.setEmail("jggfgd@gmail.com");
        userDetailsDto.setVoterNo(6534332l);
        userDetailsDto.setPanNo(75443232132l);
        userDetailsDto.setMobileNo(7664543l);


        UserDetailsService userDetailsService=new UserDetailsServiceImp();
        userDetailsService.validate(null);
    }
}
