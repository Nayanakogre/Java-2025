


package com.xworkz.meeting.repository;

import com.xworkz.meeting.dto.MeetingDetailsDto;

public class MeetingDetailsRepositoryImpl implements MeetingDetailsRepository{
    MeetingDetailsDto[] dto=new MeetingDetailsDto[5];
    int index=0;
    @Override
    public boolean save(MeetingDetailsDto meetingDetailsDto) {
        if(dto!=null && meetingDetailsDto!=null) {
            if (this.index < this.dto.length) {
                dto[index] = meetingDetailsDto;
                index++;
                System.out.println("saved successfully");
            } else {
                System.out.println("Array is full");
            }
        }
            else {
            System.out.println("give them properrly");
            return true;
        }


        return false;
    }

//

    @Override
    public MeetingDetailsDto[] read() {
      return dto;
    }

}
