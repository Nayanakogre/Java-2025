package com.xworkz.meeting.service;

import com.xworkz.meeting.dto.MeetingDetailsDto;
import com.xworkz.meeting.repository.MeetingDetailsRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor

public class MeetingDetailsServiceImpl implements MeetingDetailsService{
    private MeetingDetailsRepository meetingDetailsRepository;
    @Override
    public boolean validate(MeetingDetailsDto meetingDetailsDto) {
        if(meetingDetailsDto!=null && meetingDetailsRepository!=null)
        {
            meetingDetailsRepository.save(meetingDetailsDto);
            System.out.println( meetingDetailsDto.getDate());
            System.out.println(meetingDetailsDto.getTime());
            System.out.println(meetingDetailsDto.getNoOfParticipants());
            System.out.println(meetingDetailsDto.getPlatform());


            return  true;
        }
        return false;
    }

    @Override
    public void read() {
        MeetingDetailsDto[] dtos = meetingDetailsRepository.read();
        for(MeetingDetailsDto dto:dtos){
            System.out.println(dto);
        }
    }

    //
}
