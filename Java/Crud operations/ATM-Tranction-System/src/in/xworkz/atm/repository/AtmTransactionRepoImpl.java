package in.xworkz.atm.repository;

import in.xworkz.atm.dto.AtmTrancationDto;
import in.xworkz.atm.util.AtmTransactionUtil;

public class AtmTransactionRepoImpl implements AtmTransactionRepo{
    @Override
    public void deposit(AtmTrancationDto dto) {
        AtmTransactionUtil.deposit(dto);
    }

    @Override
    public void withdraw(AtmTrancationDto dto) {
        AtmTransactionUtil.withdraw(dto);
    }

    @Override
    public void checkBalance(AtmTrancationDto dto) {
        AtmTransactionUtil.checkBalance(dto);
    }

    @Override
    public void changePin(AtmTrancationDto dto) {
        AtmTransactionUtil.changePin(dto);
    }

    @Override
    public void start(AtmTrancationDto dto) {
        AtmTransactionUtil.start(dto);
    }
}
