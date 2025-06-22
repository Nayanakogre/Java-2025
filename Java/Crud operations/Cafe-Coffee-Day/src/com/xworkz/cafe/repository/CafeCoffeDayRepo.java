package com.xworkz.cafe.repository;

import com.xworkz.cafe.dto.CafeCoffeDayDto;

import java.time.LocalTime;

public interface CafeCoffeDayRepo {
    boolean save(CafeCoffeDayDto cafeCoffeDayDto);
    CafeCoffeDayDto[] read();
    boolean updateOwnerById(int id, String owner);
    boolean updateDateById(int id, LocalTime meetingTime);
    boolean updatePhoneById(int id,Long PhoneNo);



    boolean updatePriceById(int id, double price);
    boolean delete(CafeCoffeDayDto cafeCoffeDayDto);


}
