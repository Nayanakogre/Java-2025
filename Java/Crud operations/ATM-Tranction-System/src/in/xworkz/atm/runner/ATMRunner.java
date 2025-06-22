package in.xworkz.atm.runner;

import in.xworkz.atm.constant.UserDeatils;
import in.xworkz.atm.dto.AtmTrancationDto;
import in.xworkz.atm.service.AtmTransactionService;
import in.xworkz.atm.service.AtmTransactionServiceImplementation;

public class ATMRunner {
    public static void main(String[] args) {
        AtmTrancationDto dto = new AtmTrancationDto();
        dto.setName("Nayana K J");
        dto.setUserDeatils(UserDeatils.CARD_NO);
        dto.setPin(1234);
        dto.setBankName("SBI");
        dto.setBranch("Anadapuram");

        dto.setBalance(10000.0);
        dto.setPhoneNumber("9876543210");
        dto.setIfscCode("SBIN0001234");
        dto.setEmail("nayana@example.com");

        AtmTransactionService service = new AtmTransactionServiceImplementation();

        service.start(dto);
        service.deposit(dto);
        service.withdraw(dto);
        service.checkBalance(dto);
        service.changePin(dto);
    }
    }

