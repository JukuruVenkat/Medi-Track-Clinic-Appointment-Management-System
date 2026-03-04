package com.venkat.meditrack.service;

import com.venkat.meditrack.entity.Doctor;
import com.venkat.meditrack.interfaces.Searchable;
import com.venkat.meditrack.util.DataStore;

import java.util.List;
import java.util.stream.Collectors;

public class DoctorService implements Searchable<Doctor> {

    private DataStore<Doctor> doctorStore = new DataStore<>();

    public void addDoctor(Doctor doctor) {
        doctorStore.add(doctor);
    }

    public List<Doctor> getAll() {
        return doctorStore.getAll();
    }

    @Override
    public List<Doctor> searchByName(String name) {
        return doctorStore.getAll()
                .stream()
                .filter(d -> d.getName().equalsIgnoreCase(name))
                .collect(Collectors.toList());
    }

    @Override
    public Doctor searchById(int id) {
        return doctorStore.getAll()
                .stream()
                .filter(d -> d.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Doctor> searchByAge(int age) {
        return doctorStore.getAll()
                .stream()
                .filter(d -> d.getAge() == age)
                .collect(Collectors.toList());
    }
}

