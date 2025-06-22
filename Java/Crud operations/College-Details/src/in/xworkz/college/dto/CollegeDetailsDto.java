package in.xworkz.college.dto;

import in.xworkz.college.constant.UserDetails;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class CollegeDetailsDto {
    private UserDetails collegeName;
    private String collegeCode;
    private UserDetails location;
    private int establishedYear;
    private int numberOfStudents;
    private String university;
    private String principalName;
    private String contactNumber;
    private String email;
    private String website;

    public void setLocation(UserDetails userDetails) {
    }
}
