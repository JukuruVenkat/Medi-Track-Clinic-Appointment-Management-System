package com.venkat.meditrack.entity;

public class Patient extends Person implements Cloneable {

    private String medicalHistory;

    public Patient(int id, String name, int age, String contact, String history) {
        super(id, name, age, contact);
        this.medicalHistory = history;
    }

    public String getMedicalHistory() { return medicalHistory; }

    @Override
    public Patient clone() {
        return new Patient(id, getName(), getAge(), getContact(), medicalHistory);
    }

    @Override
    public String getDetails() {
        return super.getDetails() + " - History: " + medicalHistory;
    }
}