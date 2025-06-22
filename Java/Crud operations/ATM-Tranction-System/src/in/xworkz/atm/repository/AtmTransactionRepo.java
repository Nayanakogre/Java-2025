package in.xworkz.atm.repository;

import in.xworkz.atm.dto.AtmTrancationDto;

public interface AtmTransactionRepo {
    void deposit(AtmTrancationDto dto);
    void withdraw(AtmTrancationDto dto);
    void checkBalance(AtmTrancationDto dto);
    void changePin(AtmTrancationDto dto);
    void start(AtmTrancationDto dto);
}
