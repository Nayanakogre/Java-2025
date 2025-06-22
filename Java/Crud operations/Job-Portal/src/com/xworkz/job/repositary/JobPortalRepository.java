package com.xworkz.job.repositary;

import com.xworkz.job.dto.JobPortalDetailsDto;

public interface JobPortalRepository {
    boolean save(JobPortalDetailsDto jobPortalDetailsDto);
}
