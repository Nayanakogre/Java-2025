package com.xworkz.meeting.dto;

import com.xworkz.meeting.constant.Host;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;
@Setter
@Getter
@EqualsAndHashCode
@ToString

public class MeetingDetailsDto {
    private Host host;
    private int noOfParticipants;
    private String platform;
    private boolean isOnline;
    private LocalDate date;
    private LocalTime time;


}
