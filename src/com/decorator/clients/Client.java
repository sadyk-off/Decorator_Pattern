package com.decorator.clients;

import com.decorator.mobileOperator.MobileOperator;

public class Client {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private float balance;
    private MobileOperator tariffOfMobileOperator;

    public Client(String firstName, String lastName, String phone, MobileOperator tariffOfMobileOperator) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phone;
        this.tariffOfMobileOperator = tariffOfMobileOperator;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phone) {
        this.phoneNumber = phone;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public MobileOperator getTariffOfMobileOperator() {
        return tariffOfMobileOperator;
    }

    public void setTariffOfMobileOperator(MobileOperator tariffOfMobileOperator) {
        this.tariffOfMobileOperator = tariffOfMobileOperator;
    }
}
