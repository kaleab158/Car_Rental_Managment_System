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
// Payment.java
// =========================
// =========================
// Payment.java
// =========================
public class Payment {

    private int payId;
    private int transacId;
    private double amount;
    private String method;
    private String payDate;

    private Reservation reservation;

    // Default Constructor
    public Payment() {
    }

    // Parameterized Constructor
    public Payment(int payId, int transacId,
                   double amount, String method,
                   String payDate, Reservation reservation) {

        this.payId = payId;
        this.transacId = transacId;
        this.amount = amount;
        this.method = method;
        this.payDate = payDate;
        this.reservation = reservation;
    }

    // Getters and Setters
    public int getPayId() {
        return payId;
    }

    public void setPayId(int payId) {
        this.payId = payId;
    }

    public int getTransacId() {
        return transacId;
    }

    public void setTransacId(int transacId) {
        this.transacId = transacId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getPayDate() {
        return payDate;
    }

    public void setPayDate(String payDate) {
        this.payDate = payDate;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }
}