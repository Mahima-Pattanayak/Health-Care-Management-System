package com.healthcare.service;

import com.healthcare.model.Patient;
import java.util.ArrayList;
import java.util.List;

public class PatientService {
    private List<Patient> patients = new ArrayList<>();

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public List<Patient> getAllPatients() {
        return patients;
    }
}