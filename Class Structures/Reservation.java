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
// Reservation.java
// =========================
// =========================
// Reservation.java
// =========================
public class Reservation {

    private int resId;
    private String reservationDate;
    private String pickupDate;
    private String cancelDate;
    private String pickupLocation;
    private double amount;

    private Customer customer;
    private Vehicle vehicle;
    

    // Default Constructor
    public Reservation() {
    }

    // Parameterized Constructor
    public Reservation(int resId, String reservationDate,
                       String pickupDate, String cancelDate,
                       String pickupLocation, double amount
                       
                       ) {

        this.resId = resId;
        this.reservationDate = reservationDate;
        this.pickupDate = pickupDate;
        this.cancelDate = cancelDate;
        this.pickupLocation = pickupLocation;
        this.amount = amount;
        this.customer = customer;
        this.vehicle = vehicle;
        
    }

    // Getters and Setters
    public int getResId() {
        return resId;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }

    public String getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(String reservationDate) {
        this.reservationDate = reservationDate;
    }

    public String getPickupDate() {
        return pickupDate;
    }

    public void setPickupDate(String pickupDate) {
        this.pickupDate = pickupDate;
    }

    public String getCancelDate() {
        return cancelDate;
    }

    public void setCancelDate(String cancelDate) {
        this.cancelDate = cancelDate;
    }

    public String getPickupLocation() {
        return pickupLocation;
    }

    public void setPickupLocation(String pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

}