package com.xworkz.association.runner;

import com.xworkz.association.*;

import java.awt.peer.LabelPeer;

public class PersonRunner {
    public static void main(String[] args) {
        Person person=new Person();
        person.nameOfPerson="Sahana";
        person.personAge=22;
        System.out.println(person);
        Laptop laptop=new Laptop();
        laptop.osVersion=11;
        laptop.relesedYear=2020;
        Company company=new Company();
        company.companyName="MicroSoft";
        company.companyid="C101";
        System.out.println(company);
        Employee employee=new Employee();
        employee.empId="E101";
        employee.phoneNo=780986756l;
        System.out.println(employee);
        Country country=new Country();
        country.countryName="NetherLand";
        country.countryCode=34;
        System.out.println(country);
        Adress adress=new Adress();
        adress.houseNo=67;
        adress.StreetLine="6A";
        System.out.println(adress);

    }
}
