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

    // Getters
    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public String getReason() {
        return reason;
    }

    public Patient getPatient() {
        return patient;
    }

    // Setters
    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}
