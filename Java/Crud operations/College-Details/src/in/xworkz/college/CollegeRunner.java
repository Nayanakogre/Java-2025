package in.xworkz.college;

import in.xworkz.college.constant.UserDetails;
import in.xworkz.college.dto.CollegeDetailsDto;
import in.xworkz.college.service.CollegeDetailsService;
import in.xworkz.college.service.CollegeDetailsServiceImpl;

public class CollegeRunner {
    public static void main(String[] args) {
        CollegeDetailsDto dto = new CollegeDetailsDto();
        dto.setCollegeName(UserDetails.UBDT_COLLEGE_ENGINEERING);
        dto.setCollegeCode("XW123");
        dto.setLocation(UserDetails.UBDT_COLLEGE_ENGINEERING);
        dto.setEstablishedYear(2010);
        dto.setNumberOfStudents(1500);
        dto.setUniversity("VTU");
        dto.setPrincipalName("Dr. Arjun");
        dto.setContactNumber("9876543210");
        dto.setEmail("info@xworkz.com");
        dto.setWebsite("www.xworkz.com");


        CollegeDetailsService service = new CollegeDetailsServiceImpl();
        service.admission(dto);
        service.updatePrincipal(dto);
        service.displayDetails(dto);
        service.changeWebsite(dto);
        service.start(dto);
    }
    }

