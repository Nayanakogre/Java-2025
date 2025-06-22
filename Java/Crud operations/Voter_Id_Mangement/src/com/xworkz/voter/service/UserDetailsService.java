package com.xworkz.voter.service;

import com.xworkz.voter.dto.UserDetailsDto;

public interface UserDetailsService {
    boolean validate(UserDetailsDto userDetailsDto);

}
