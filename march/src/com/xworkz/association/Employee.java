package com.xworkz.association;

public class Employee {
    public Country country;
    public String empId;
    public long phoneNo;

    @Override
    public String toString() {
        return "Employee{" +
                "country=" + country +
                ", empId='" + empId + '\'' +
                ", phoneNo=" + phoneNo +
                '}';
    }
}
