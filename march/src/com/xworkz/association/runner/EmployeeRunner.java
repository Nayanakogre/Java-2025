package com.xworkz.association.runner;

import com.xworkz.association.Employee;
import com.xworkz.association.ex2.*;

public class EmployeeRunner {
    public static void main(String[] args) {
        Employee employee=new Employee();
        employee.phoneNo=8765342l;
        employee.empId="E456";
        System.out.println(employee);
        Address address=new Address();
        address.Country="India";
        address.houseNo=23;
        System.out.println(address);
        Adhar adhar=new Adhar(address);
        adhar.name="yash";
        adhar.adharNo=876753423243l;
        System.out.println(adhar);
        Pan pan=new Pan();
        pan.name="Shushruth";
        pan.panNo=66542424l;
        VoterId voterId=new VoterId();
        voterId.name="Mallesh";
        voterId.voterId=6765342l;
        System.out.println(voterId);
        Passport passport=new Passport();
        passport.name="Nayana K J";
        passport.passportNo=67543454654757l;


                 
    }
}
