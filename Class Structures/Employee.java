/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.car_rental_system;

/**
 *
 * @author kaleb
 */
// =========================
// Employee.java
// =========================
public class Employee {

    private int empId;
    private String fName;
    private String lName;
    private double salary;
    private String emailAddress;

    private String houseNumber;
    private String city;
    private String country;

    // Default Constructor
    public Employee() {
        
    }

    // Parameterized Constructor
    public Employee(int empId, String fName, String lName, double salary,
                    String emailAddress, String houseNumber,
                    String city, String country) {

        this.empId = empId;
        this.fName = fName;
        this.lName = lName;
        this.salary = salary;
        this.emailAddress = emailAddress;
        this.houseNumber = houseNumber;
        this.city = city;
        this.country = country;
    }

    // Getters and Setters
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}