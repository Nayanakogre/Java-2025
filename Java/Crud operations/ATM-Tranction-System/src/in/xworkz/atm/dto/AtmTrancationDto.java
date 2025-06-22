package in.xworkz.atm.dto;

import in.xworkz.atm.constant.UserDeatils;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@ToString

public class AtmTrancationDto {
    private String name;
    private String cardNo;
    private int pin;
    private double balance;
    private String accountType;
    private String bankName;
    private String branch;
    private String ifscCode;
    private String phoneNumber;
    private String email;
    private UserDeatils userDeatils;
}
