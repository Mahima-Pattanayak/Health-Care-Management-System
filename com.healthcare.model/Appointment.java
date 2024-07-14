package com.healthcare.model;

import java.time.LocalDateTime;

public class Appointment {
    private LocalDateTime dateTime;
    private String reason;
    private Patient patient;

    // Constructor
    public Appointment(LocalDateTime dateTime, String reason, Patient patient) {
        this.dateTime = dateTime;
        this.reason = reason;
        this.patient = patient;
    }

    // Getters and Setters
    // Implement as needed
}
