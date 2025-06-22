package com.xworkz.meeting.repository;

import com.xworkz.meeting.dto.MeetingDetailsDto;

public interface MeetingDetailsRepository {
    boolean save(MeetingDetailsDto meetingDetailsDto);
    MeetingDetailsDto[] read();

    //CRUD -/> create, read, update, delete

}
