package com.xworkz.job.repositary;

import com.xworkz.job.dto.JobPortalDetailsDto;

public class JobPortalRepositaryImpl implements JobPortalRepository {

    @Override
    public boolean save(JobPortalDetailsDto jobPortalDetailsDto) {
        System.out.println("Running in JobPortalRepositaryImpl");
        return false;
    }
}
