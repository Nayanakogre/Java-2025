package com.xworkz.cafe.service;

import com.xworkz.cafe.dto.CafeCoffeDayDto;

import java.time.LocalTime;

public interface CafeCoffeeDayService {
    boolean validate(CafeCoffeDayDto cafeCoffeDayDto);
    boolean save(CafeCoffeDayDto cafeCoffeDayDto);
    CafeCoffeDayDto[] read();
    boolean updateOwnerById(int id, String owner);
    boolean updateDateById(int id, LocalTime meetingTime);
    boolean updatePhoneById(int id, long phone);
    boolean updatePriceById(int id, double price);
    boolean delete(CafeCoffeDayDto cafeCoffeDayDto);
}

