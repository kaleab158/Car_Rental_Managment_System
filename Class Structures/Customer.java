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
// Customer.java
// =========================
// =========================
// Customer.java
// =========================
public class Customer {

    private int cusId;
    private String fName;
    private String lName;
    private String contactNo;

    private String city;
    private String country;
    private String houseNo;

    // Default Constructor
    public Customer() {
    }

    // Parameterized Constructor
    public Customer(int cusId, String fName, String lName,
                    String contactNo, String city,
                    String country, String houseNo) {

        this.cusId = cusId;
        this.fName = fName;
        this.lName = lName;
        this.contactNo = contactNo;
        this.city = city;
        this.country = country;
        this.houseNo = houseNo;
    }

    // Getters and Setters
    public int getCusId() {
        return cusId;
    }

    public void setCusId(int cusId) {
        this.cusId = cusId;
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

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
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

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }
}