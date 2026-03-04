package com.venkat.meditrack.service;

import com.venkat.meditrack.entity.Patient;
import com.venkat.meditrack.interfaces.Searchable;
import com.venkat.meditrack.util.DataStore;

import java.util.List;
import java.util.stream.Collectors;

public class PatientService implements Searchable<Patient> {

    private DataStore<Patient> patientStore = new DataStore<>();

    public void addPatient(Patient patient) {
        patientStore.add(patient);
    }

    public List<Patient> getAll() {
        return patientStore.getAll();
    }

    @Override
    public List<Patient> searchByName(String name) {
        return patientStore.getAll()
                .stream()
                .filter(p -> p.getName().equalsIgnoreCase(name))
                .collect(Collectors.toList());
    }

    @Override
    public Patient searchById(int id) {
        return patientStore.getAll()
                .stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Patient> searchByAge(int age) {
        return patientStore.getAll()
                .stream()
                .filter(p -> p.getAge() == age)
                .collect(Collectors.toList());
    }
}