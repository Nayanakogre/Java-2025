package in.xworkz.college.service;

import in.xworkz.college.dto.CollegeDetailsDto;
import in.xworkz.college.repository.CollegeDetailsRepo;
import in.xworkz.college.repository.CollegeDetailsRepoImpl;

public class CollegeDetailsServiceImpl implements CollegeDetailsService
{
    private CollegeDetailsRepo repo = new CollegeDetailsRepoImpl();

    @Override
    public void admission(CollegeDetailsDto dto) {
        repo.admission(dto);
    }

    @Override
    public void updatePrincipal(CollegeDetailsDto dto) {
        repo.updatePrincipal(dto);
    }

    @Override
    public void displayDetails(CollegeDetailsDto dto) {
        repo.displayDetails(dto);
    }

    @Override
    public void changeWebsite(CollegeDetailsDto dto) {
        repo.changeWebsite(dto);
    }

    @Override
    public void start(CollegeDetailsDto dto) {
        repo.start(dto);
    }
}

