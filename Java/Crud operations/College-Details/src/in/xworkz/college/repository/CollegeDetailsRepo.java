package in.xworkz.college.repository;

import in.xworkz.college.dto.CollegeDetailsDto;

public interface CollegeDetailsRepo {
    void admission(CollegeDetailsDto dto);
    void updatePrincipal(CollegeDetailsDto dto);
    void displayDetails(CollegeDetailsDto dto);
    void changeWebsite(CollegeDetailsDto dto);
    void start(CollegeDetailsDto dto);
}
