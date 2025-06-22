package in.xworkz.college.service;

import in.xworkz.college.dto.CollegeDetailsDto;

public interface CollegeDetailsService {
    void admission(CollegeDetailsDto dto);
    void updatePrincipal(CollegeDetailsDto dto);
    void displayDetails(CollegeDetailsDto dto);
    void changeWebsite(CollegeDetailsDto dto);
    void start(CollegeDetailsDto dto);
}
