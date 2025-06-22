package com.xworkz.meeting.runner;

import com.xworkz.meeting.constant.Host;
import com.xworkz.meeting.dto.MeetingDetailsDto;
import com.xworkz.meeting.repository.MeetingDetailsRepository;
import com.xworkz.meeting.repository.MeetingDetailsRepositoryImpl;
import com.xworkz.meeting.service.MeetingDetailsService;
import com.xworkz.meeting.service.MeetingDetailsServiceImpl;

import java.time.LocalDate;
import java.time.LocalTime;

public class ApplicationRunner {
    public static void main(String[] args) {
        //Host host= Host.valueOf("Nayana");
        MeetingDetailsDto meetingDetailsDto=new MeetingDetailsDto();
        meetingDetailsDto.setDate(LocalDate.now());
        meetingDetailsDto.setTime(LocalTime.now());
        meetingDetailsDto.setHost(Host.HOST);
        meetingDetailsDto.setNoOfParticipants(12);
        meetingDetailsDto.setPlatform("Google Meet");
        meetingDetailsDto.setOnline(true);
        MeetingDetailsRepository meetingDetailsRepository=new MeetingDetailsRepositoryImpl();
        MeetingDetailsService meetingDetailsService=
                new MeetingDetailsServiceImpl(meetingDetailsRepository);
        meetingDetailsService.validate(meetingDetailsDto);
        meetingDetailsService.read();

    }
}
