package in.xworkz.atm.service;


import in.xworkz.atm.dto.AtmTrancationDto;

public interface AtmTransactionService {
    void deposit(AtmTrancationDto dto);
    void withdraw(AtmTrancationDto dto);
    void checkBalance(AtmTrancationDto dto);
    void changePin(AtmTrancationDto dto);
    void start(AtmTrancationDto dto);
}
