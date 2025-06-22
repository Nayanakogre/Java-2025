package in.xworkz.atm.util;

import in.xworkz.atm.dto.AtmTrancationDto;

public class AtmTransactionUtil {
    private AtmTransactionUtil() {
        System.out.println("ATM Transaction Util Initialized");
    }

    public static void deposit(AtmTrancationDto dto) {
        double depositAmount = 2000.0;
        dto.setBalance(dto.getBalance() + depositAmount);
        System.out.println("Deposited: " + depositAmount + ", New Balance: " + dto.getBalance());
    }

    public static void withdraw(AtmTrancationDto dto) {
        double withdrawAmount = 1500.0;
        if (dto.getBalance() >= withdrawAmount) {
            dto.setBalance(dto.getBalance() - withdrawAmount);
            System.out.println("Withdrawn: " + withdrawAmount + ", New Balance: " + dto.getBalance());
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public static void checkBalance(AtmTrancationDto dto) {
        System.out.println("Current Balance: " + dto.getBalance());
    }

    public static void changePin(AtmTrancationDto dto) {
        int newPin = 4321;
        dto.setPin(newPin);
        System.out.println("PIN changed successfully to: " + newPin);
    }

    public static void start(AtmTrancationDto dto) {
        System.out.println("Welcome " + dto.getName() + ", Your card number is: " + dto.getUserDeatils());
    }
}
