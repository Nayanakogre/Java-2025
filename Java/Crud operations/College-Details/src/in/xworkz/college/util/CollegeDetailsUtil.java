package in.xworkz.college.util;

import in.xworkz.college.dto.CollegeDetailsDto;

public class CollegeDetailsUtil {
    private CollegeDetailsUtil() {
        System.out.println("Private constructor - Utility class");
    }

    public static void admission(CollegeDetailsDto dto) {
        System.out.println("Processing admission for: " + dto.getCollegeName());
    }

    public static void updatePrincipal(CollegeDetailsDto dto) {
        dto.setPrincipalName("Updated Principal");
        System.out.println("Principal updated to: " + dto.getPrincipalName());
    }

    public static void displayDetails(CollegeDetailsDto dto) {
        System.out.println("College Details: " + dto);
    }

    public static void changeWebsite(CollegeDetailsDto dto) {
        dto.setWebsite("www.updated-college.com");
        System.out.println("Website changed to: " + dto.getWebsite());
    }

    public static void start(CollegeDetailsDto dto) {
        System.out.println("Starting college services for: " + dto.getCollegeName());
    }
}
