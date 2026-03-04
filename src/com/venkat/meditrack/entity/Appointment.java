package com.venkat.meditrack.entity;

import java.time.LocalDate;

public class Appointment extends MedicalEntity implements Cloneable {

    private Doctor doctor;
    private Patient patient;
    private LocalDate date;
    private AppointmentStatus status;

    public Appointment(int id, Doctor doctor, Patient patient, LocalDate date) {
        this.id = id;
        this.doctor = doctor;
        this.patient = patient;
        this.date = date;
        this.status = AppointmentStatus.CONFIRMED;
    }

    public void cancel() { status = AppointmentStatus.CANCELLED; }

    public Doctor getDoctor() { return doctor; }
    public Patient getPatient() { return patient; }
    public AppointmentStatus getStatus() { return status; }

    @Override
    public Appointment clone() {
        return new Appointment(id, doctor, patient.clone(), date);
    }

    @Override
    public String getDetails() {
        return "Appointment " + id + " | Doctor: " +
                doctor.getName() + " | Patient: " +
                patient.getName() + " | Status: " + status;
    }
}