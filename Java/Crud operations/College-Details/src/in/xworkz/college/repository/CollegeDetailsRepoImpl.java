package in.xworkz.college.repository;

import in.xworkz.college.dto.CollegeDetailsDto;
import in.xworkz.college.util.CollegeDetailsUtil;

public class CollegeDetailsRepoImpl implements CollegeDetailsRepo{
    @Override
    public void admission(CollegeDetailsDto dto) {
        CollegeDetailsUtil.admission(dto);
    }

    @Override
    public void updatePrincipal(CollegeDetailsDto dto) {
        CollegeDetailsUtil.updatePrincipal(dto);
    }

    @Override
    public void displayDetails(CollegeDetailsDto dto) {
        CollegeDetailsUtil.displayDetails(dto);
    }

    @Override
    public void changeWebsite(CollegeDetailsDto dto) {
        CollegeDetailsUtil.changeWebsite(dto);
    }

    @Override
    public void start(CollegeDetailsDto dto) {
        CollegeDetailsUtil.start(dto);
    }
}

