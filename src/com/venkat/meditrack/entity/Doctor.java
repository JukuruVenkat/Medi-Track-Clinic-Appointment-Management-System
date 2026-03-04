package com.venkat.meditrack.entity;

public class Doctor extends Person {

    private Specialization specialization;
    private double consultationFee;

    public Doctor(int id, String name, int age, String contact,
                  Specialization specialization, double fee) {
        super(id, name, age, contact);
        this.specialization = specialization;
        this.consultationFee = fee;
    }

    public Specialization getSpecialization() { return specialization; }
    public double getConsultationFee() { return consultationFee; }

    @Override
    public String getDetails() {
        return super.getDetails() + " - " + specialization;
    }
}