package com.venkat.meditrack.entity;

public class Person extends MedicalEntity {

    private String name;
    private int age;
    private String contact;

    public Person(int id, String name, int age, String contact) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.contact = contact;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getContact() { return contact; }

    @Override
    public String getDetails() {
        return id + " - " + name + " - Age: " + age;
    }
}