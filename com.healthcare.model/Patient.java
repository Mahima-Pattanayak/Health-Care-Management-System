package com.healthcare.model;

public class Patient {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;

    // Constructor
    public Patient(String firstName, String lastName, String email, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
}
