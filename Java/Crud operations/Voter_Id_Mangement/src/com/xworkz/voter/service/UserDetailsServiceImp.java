package com.xworkz.voter.service;

import com.xworkz.voter.dto.UserDetailsDto;

public class UserDetailsServiceImp implements UserDetailsService{
    @Override
    public boolean validate(UserDetailsDto userDetailsDto) {
        if((userDetailsDto!=null)) {

            System.out.println(userDetailsDto.getUserName());
            System.out.println(userDetailsDto.getMobileNo());
            System.out.println(userDetailsDto.getAdress());
            System.out.println(userDetailsDto.getAdharNo());
            System.out.println(userDetailsDto.getAge());
            System.out.println(userDetailsDto.getEmail());
            System.out.println(userDetailsDto.getPanNo());
            System.out.println(userDetailsDto.getVoterNo());
            return  true;

        }
        else {
            System.out.println("The user details are null");
        }
        return false;

    }
}
