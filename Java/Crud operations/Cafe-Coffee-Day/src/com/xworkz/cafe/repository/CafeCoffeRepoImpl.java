package com.xworkz.cafe.repository;

import com.xworkz.cafe.dto.CafeCoffeDayDto;

import java.time.LocalTime;

public class CafeCoffeRepoImpl implements CafeCoffeDayRepo {
    private CafeCoffeDayDto[] dto = new CafeCoffeDayDto[5];
    private int index = 0;

    @Override
    public boolean save(CafeCoffeDayDto cafeCoffeDayDto) {
        if (cafeCoffeDayDto == null) {
            System.out.println("Give a valid DTO object");
            return false;
        }
        if (index < dto.length) {
            dto[index] = cafeCoffeDayDto;
            index++;
            System.out.println("Saved successfully!");
            return true;
        } else {
            System.out.println("Array is full!");
            return false;
        }
    }

    @Override
    public CafeCoffeDayDto[] read() {
        return dto;
    }

    @Override
    public boolean updateOwnerById(int id, String owner) {
        for (int i = 0; i < index; i++) {
            if (dto[i] != null && dto[i].getId() == id) {
                dto[i].setOwner(owner);
                System.out.println("Owner updated successfully!");
                return true;
            }
        }
        System.out.println("ID not found. Update failed.");
        return false;
    }

    @Override
    public boolean updateDateById(int id, LocalTime meetingTime) {
        for (int i = 0; i < index; i++) {
            if (dto[i] != null && dto[i].getId() == id) {
                dto[i].setMeetingTime(meetingTime);
                System.out.println("Meeting time updated successfully!");
                return true;
            }
        }
        System.out.println("ID not found. Update failed.");
        return false;
    }

    @Override
    public boolean updatePhoneById(int id,Long PhoneNo) {
        for (int i = 0; i < index; i++) {
            if (dto[i] != null && dto[i].getId() == id) {
                dto[i].setPhoneNo(876654543);
                System.out.println("Phone number updated successfully!");
                return true;
            }
        }
        System.out.println("ID not found. Update failed.");
        return false;
    }

    @Override
    public boolean updatePriceById(int id, double price) {
        for (int i = 0; i < index; i++) {
            if (dto[i] != null && dto[i].getId() == id) {
                dto[i].setAveragePrice(price);
                System.out.println("Price updated successfully!");
                return true;
            }
        }
        System.out.println("ID not found. Update failed.");
        return false;
    }

    @Override
    public boolean delete(CafeCoffeDayDto cafeCoffeDayDto) {
        for (int i = 0; i < index; i++) {
            if (dto[i] != null && dto[i].equals(cafeCoffeDayDto)) {
                for (int j = i; j < index - 1; j++) {
                    dto[j] = dto[j + 1]; // Shift elements left
                }
                dto[index - 1] = null; // Set last position to null
                index--; // Decrease index
                System.out.println("Record deleted successfully!");
                return true;
            }
        }
        System.out.println("Record not found. Deletion failed.");
        return false;
    }
}
