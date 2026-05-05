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
// Vehicle.java
// =========================
// =========================
// Vehicle.java
// =========================
public class Vehicle {

    private int vehId;
    private String model;
    private String plateNo;
    private int mileAge;
    private double dailyPrice;
    private String condition;

    // Default Constructor
    public Vehicle() {
    }

    // Parameterized Constructor
    public Vehicle(int vehId, String model, String plateNo,
                   int mileAge, double dailyPrice,
                   String condition) {

        this.vehId = vehId;
        this.model = model;
        this.plateNo = plateNo;
        this.mileAge = mileAge;
        this.dailyPrice = dailyPrice;
        this.condition = condition;
    }

    // Getters and Setters
    public int getVehId() {
        return vehId;
    }

    public void setVehId(int vehId) {
        this.vehId = vehId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPlateNo() {
        return plateNo;
    }

    public void setPlateNo(String plateNo) {
        this.plateNo = plateNo;
    }

    public int getMileAge() {
        return mileAge;
    }

    public void setMileAge(int mileAge) {
        this.mileAge = mileAge;
    }

    public double getDailyPrice() {
        return dailyPrice;
    }

    public void setDailyPrice(double dailyPrice) {
        this.dailyPrice = dailyPrice;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }
}