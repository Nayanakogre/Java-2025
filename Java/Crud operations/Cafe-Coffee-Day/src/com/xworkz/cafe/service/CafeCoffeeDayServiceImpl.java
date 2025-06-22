package com.xworkz.cafe.service;

import com.xworkz.cafe.dto.CafeCoffeDayDto;
import com.xworkz.cafe.repository.CafeCoffeDayRepo;
import com.xworkz.cafe.repository.CafeCoffeRepoImpl;

import java.time.LocalTime;

public class CafeCoffeeDayServiceImpl implements CafeCoffeeDayService {
    private CafeCoffeDayRepo cafeCoffeDayRepo = new CafeCoffeRepoImpl();


    @Override
    public boolean validate(CafeCoffeDayDto cafeCoffeDayDto) {
        if (cafeCoffeDayDto != null) {
            System.out.println("Validation Passed. Calling save()");
            return cafeCoffeDayRepo.save(cafeCoffeDayDto);
        }
        System.out.println("Validation Failed");
        return false;
    }


    @Override
    public boolean save(CafeCoffeDayDto cafeCoffeDayDto) {
        if (validate(cafeCoffeDayDto)) {
            return cafeCoffeDayRepo.save(cafeCoffeDayDto);
        }
        return false;
    }

    @Override
    public CafeCoffeDayDto[] read() {
        return cafeCoffeDayRepo.read();
    }

    @Override
    public boolean updateOwnerById(int id, String owner) {
        return cafeCoffeDayRepo.updateOwnerById(id, owner);
    }

    @Override
    public boolean updateDateById(int id, LocalTime meetingTime) {
        return cafeCoffeDayRepo.updateDateById(id, meetingTime);
    }

    @Override
    public boolean updatePhoneById(int id, long phone) {
        return cafeCoffeDayRepo.updatePhoneById(id, phone);
    }

    @Override
    public boolean updatePriceById(int id, double price) {
        return cafeCoffeDayRepo.updatePriceById(id, price);
    }

    @Override
    public boolean delete(CafeCoffeDayDto cafeCoffeDayDto) {
        return cafeCoffeDayRepo.delete(cafeCoffeDayDto);
    }
}