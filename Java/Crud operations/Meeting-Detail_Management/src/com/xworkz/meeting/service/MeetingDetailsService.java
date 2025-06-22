package com.xworkz.meeting.service;

import com.xworkz.meeting.dto.MeetingDetailsDto;

public interface MeetingDetailsService {
    boolean validate(MeetingDetailsDto meetingDetailsDto);

    void read();
    //CRUD -/> create, read, update, delete
}
