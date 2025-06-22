package com.xworkz.cafe.runner;

import com.xworkz.cafe.constant.*;
import com.xworkz.cafe.dto.CafeCoffeDayDto;
import com.xworkz.cafe.repository.CafeCoffeDayRepo;
import com.xworkz.cafe.repository.CafeCoffeRepoImpl;
import com.xworkz.cafe.service.CafeCoffeeDayService;
import com.xworkz.cafe.service.CafeCoffeeDayServiceImpl;

import java.time.LocalDate;
import java.time.LocalTime;

public class ApplicationRunner {
    public static void main(String[] args) {
        CafeCoffeDayDto cafeCoffeDayDto=new CafeCoffeDayDto();
                cafeCoffeDayDto.setOwner("V.G. Siddhartha");
                cafeCoffeDayDto.setCeo("John Doe");
                cafeCoffeDayDto.setFullName("Cafe Coffee Day");
                cafeCoffeDayDto.setCountry("India");
                cafeCoffeDayDto.setHeadQuatras("Bengaluru");
                cafeCoffeDayDto.setNoOfbranches(2000);
                cafeCoffeDayDto.setNoOfCountriesToHaveBranch(5);
                cafeCoffeDayDto.setMultinational(true);
                cafeCoffeDayDto.setAveragePrice(150);
                cafeCoffeDayDto.setPhoneNo(1234567890L);
                cafeCoffeDayDto.setId(101);
                cafeCoffeDayDto.setStartDate(LocalDate.of(1996, 7, 1));
                cafeCoffeDayDto.setMeetingDate(LocalDate.of(2025, 4, 15));
                cafeCoffeDayDto.setMeetingTime(LocalTime.of(10, 30));
                cafeCoffeDayDto.setNewBranchOpeningDate(LocalDate.of(2025, 5, 20));
                cafeCoffeDayDto.setNewBranchOpeningTime(LocalTime.of(9, 0));
                cafeCoffeDayDto.setCoffeeVariety(CoffeeVariety.BLACK_COFFEE);
                cafeCoffeDayDto.setCountriesToHaveBranch(CountriesToHaveBranch.CANADA);
                cafeCoffeDayDto.setLocationInBengaluru(LocationInBengaluru.JAYANAGARA);
                cafeCoffeDayDto.setLocationInIndia(LocationInIndia.BENGALURU);
                cafeCoffeDayDto.setSnacks(Snacks.BROWNIE);


        CafeCoffeDayDto cafeCoffeDayDto1=new CafeCoffeDayDto();
            cafeCoffeDayDto1.setId(1);
            cafeCoffeDayDto1.setOwner("V.G. Siddhartha");
            cafeCoffeDayDto1.setCeo("John Doe");
            cafeCoffeDayDto1.setFullName("Cafe Coffee Day");
            cafeCoffeDayDto1.setCountry("India");
            cafeCoffeDayDto1.setHeadQuatras("Bengaluru");
            cafeCoffeDayDto1.setNoOfbranches(2000);
            cafeCoffeDayDto1.setNoOfCountriesToHaveBranch(5);
            cafeCoffeDayDto1.setMultinational(true);
            cafeCoffeDayDto1.setAveragePrice(150);
            cafeCoffeDayDto1.setPhoneNo(1234567890L);
            cafeCoffeDayDto1.setId(101);
            cafeCoffeDayDto1.setStartDate(LocalDate.of(1996, 7, 1));
            cafeCoffeDayDto1.setMeetingDate(LocalDate.of(2025, 4, 15));
            cafeCoffeDayDto1.setMeetingTime(LocalTime.of(10, 30));
            cafeCoffeDayDto1.setNewBranchOpeningDate(LocalDate.of(2025, 5, 20));
            cafeCoffeDayDto1.setNewBranchOpeningTime(LocalTime.of(9, 0));
            cafeCoffeDayDto1.setCoffeeVariety(CoffeeVariety.BLACK_COFFEE);
            cafeCoffeDayDto1.setCountriesToHaveBranch(CountriesToHaveBranch.CANADA);
            cafeCoffeDayDto1.setLocationInBengaluru(LocationInBengaluru.JAYANAGARA);
            cafeCoffeDayDto1.setLocationInIndia(LocationInIndia.BENGALURU);
            cafeCoffeDayDto1.setSnacks(Snacks.BROWNIE);


        CafeCoffeDayDto cafeCoffeDayDto2=new CafeCoffeDayDto();
        cafeCoffeDayDto2.setOwner("V.G. Siddhartha");
        cafeCoffeDayDto2.setCeo("John Doe");
        cafeCoffeDayDto2.setFullName("Cafe Coffee Day");
        cafeCoffeDayDto2.setCountry("India");
        cafeCoffeDayDto2.setHeadQuatras("Bengaluru");
        cafeCoffeDayDto2.setNoOfbranches(2000);
        cafeCoffeDayDto2.setNoOfCountriesToHaveBranch(5);
        cafeCoffeDayDto2.setMultinational(true);
        cafeCoffeDayDto2.setAveragePrice(150);
        cafeCoffeDayDto2.setPhoneNo(1234567890L);
        cafeCoffeDayDto2.setId(101);
        cafeCoffeDayDto2.setStartDate(LocalDate.of(1996, 7, 1));
        cafeCoffeDayDto2.setMeetingDate(LocalDate.of(2025, 4, 15));
        cafeCoffeDayDto2.setMeetingTime(LocalTime.of(10, 30));
        cafeCoffeDayDto2.setNewBranchOpeningDate(LocalDate.of(2025, 5, 20));
        cafeCoffeDayDto2.setNewBranchOpeningTime(LocalTime.of(9, 0));
        cafeCoffeDayDto2.setCoffeeVariety(CoffeeVariety.FILTER_COFFE);
        cafeCoffeDayDto.setCountriesToHaveBranch(CountriesToHaveBranch.CANADA);
        cafeCoffeDayDto.setLocationInBengaluru(LocationInBengaluru.JAYANAGARA);
        cafeCoffeDayDto.setLocationInIndia(LocationInIndia.BENGALURU);
        cafeCoffeDayDto.setSnacks(Snacks.BROWNIE);

        CafeCoffeDayDto cafeCoffeDayDto3 = new CafeCoffeDayDto(
                "Pranav Desai", "Amit Verma", "Cafe Aroma", "India", "Mumbai",
                1500, 3, true, 180.0, 9876543210L, 103,
                LocalDate.of(2000, 5, 15), LocalDate.of(2025, 6, 20), LocalTime.of(11, 45),
                LocalDate.of(2025, 7, 10), LocalTime.of(8, 30),
                Snacks.CHEESE_CAKE, LocationInBengaluru.ELECTRONIC_CITY, LocationInIndia.MUMBAI,
                CountriesToHaveBranch.UK, CoffeeVariety.FILTER_COFFE
        );

        CafeCoffeDayDto cafeCoffeDayDto4 = new CafeCoffeDayDto(
                "Piyush Sharma", "Sneha Kapoor", "Brew Haven", "India", "Delhi",
                1800, 4, true, 200.0, 8765432109L, 104,
                LocalDate.of(1998, 3, 10), LocalDate.of(2025, 8, 25), LocalTime.of(9, 15),
                LocalDate.of(2025, 9, 5), LocalTime.of(7, 45),
                Snacks.CUP_CAKE, LocationInBengaluru.RR_NAGAR, LocationInIndia.DELHI,
                CountriesToHaveBranch.UK, CoffeeVariety.AMERICANO
        );

        CafeCoffeDayDto cafeCoffeDayDto5 = new CafeCoffeDayDto(
                "Pavan Reddy", "Divya Nair", "Bean Bliss", "India", "Hyderabad",
                2100, 6, true, 220.0, 7654321098L, 105,
                LocalDate.of(1995, 8, 5), LocalDate.of(2025, 10, 30), LocalTime.of(14, 00),
                LocalDate.of(2025, 11, 15), LocalTime.of(10, 00),
                Snacks.NIPPAT, LocationInBengaluru.RAJAJI_NAGAR, LocationInIndia.LUKNOW,
                CountriesToHaveBranch.USA, CoffeeVariety.MOCHA
        );
        CafeCoffeDayDto cafeCoffeDayDto6 = new CafeCoffeDayDto();




        CafeCoffeDayRepo cafeCoffeDayRepo=new CafeCoffeRepoImpl();
        CafeCoffeeDayService cafeCoffeeDayService=new CafeCoffeeDayServiceImpl();
        cafeCoffeeDayService.validate(cafeCoffeDayDto);
        cafeCoffeeDayService.validate(cafeCoffeDayDto1);
        cafeCoffeeDayService.validate(cafeCoffeDayDto2);
        cafeCoffeeDayService.validate(cafeCoffeDayDto3);
        cafeCoffeeDayService.validate(cafeCoffeDayDto4);
        cafeCoffeeDayService.validate(cafeCoffeDayDto5);
        cafeCoffeeDayService.validate(cafeCoffeDayDto6);

        cafeCoffeeDayService.updateDateById(1,LocalTime.now());
        cafeCoffeeDayService.updatePhoneById(1,9008389622L);
        cafeCoffeeDayService.updateOwnerById(1,"Sahana");
        cafeCoffeeDayService.updatePriceById(1,76);

        cafeCoffeeDayService.delete(cafeCoffeDayDto);
    }
}
