package in.xworkz.atm.service;

import in.xworkz.atm.dto.AtmTrancationDto;
import in.xworkz.atm.repository.AtmTransactionRepo;
import in.xworkz.atm.repository.AtmTransactionRepoImpl;

public class AtmTransactionServiceImplementation implements AtmTransactionService
{
    private AtmTransactionRepo repo = new AtmTransactionRepoImpl();

    @Override
    public void deposit(AtmTrancationDto dto) {
        repo.deposit(dto);
    }

    @Override
    public void withdraw(AtmTrancationDto dto) {
        repo.withdraw(dto);
    }

    @Override
    public void checkBalance(AtmTrancationDto dto) {
        repo.checkBalance(dto);
    }

    @Override
    public void changePin(AtmTrancationDto dto) {
        repo.changePin(dto);
    }

    @Override
    public void start(AtmTrancationDto dto) {
        repo.start(dto);
    }
}
