package com.healthcare.app;

import com.healthcare.model.Patient;
import com.healthcare.model.Appointment;
import com.healthcare.service.PatientService;
import com.healthcare.service.AppointmentService;

import java.time.LocalDateTime;

public class HealthcareManagementSystemApp {
    public static void main(String[] args) {
        // Create sample patients
        Patient patient1 = new Patient("John", "Doe", "john.doe@example.com", "1234567890");
        Patient patient2 = new Patient("Jane", "Smith", "jane.smith@example.com", "9876543210");

        // Create sample appointments
        Appointment appointment1 = new Appointment(LocalDateTime.now(), "Routine Checkup", patient1);
        Appointment appointment2 = new Appointment(LocalDateTime.now().plusDays(1), "Dental Cleaning", patient2);

        // Initialize services
        PatientService patientService = new PatientService();
        AppointmentService appointmentService = new AppointmentService();

        // Add patients to service
        patientService.addPatient(patient1);
        patientService.addPatient(patient2);

        // Add appointments to service
        appointmentService.addAppointment(appointment1);
        appointmentService.addAppointment(appointment2);

        // Display patients
        System.out.println("All Patients:");
        for (Patient patient : patientService.getAllPatients()) {
            System.out.println(patient.getFirstName() + " " + patient.getLastName());
        }

        // Display appointments
        System.out.println("\nAll Appointments:");
        for (Appointment appointment : appointmentService.getAllAppointments()) {
            System.out.println("Patient: " + appointment.getPatient().getFirstName() + " " +
                               appointment.getPatient().getLastName() +
                               ", Date: " + appointment.getDateTime() +
                               ", Reason: " + appointment.getReason());
        }
    }
}
