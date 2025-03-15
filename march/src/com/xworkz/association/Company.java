package com.xworkz.association;

public class Company {
    public Employee employee;
    public String companyid;
    public String companyName;

    @Override
    public String toString() {
        return "Company{" +
                "employee=" + employee +
                ", companyid='" + companyid + '\'' +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
