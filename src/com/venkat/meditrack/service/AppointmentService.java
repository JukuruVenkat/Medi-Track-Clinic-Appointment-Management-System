package com.venkat.meditrack.service;

import com.airtribe.meditrack.entity.*;
import com.venkat.meditrack.entity.Appointment;
import com.venkat.meditrack.entity.Doctor;
import com.venkat.meditrack.entity.Patient;
import com.venkat.meditrack.exception.AppointmentNotFoundException;
import com.venkat.meditrack.util.DataStore;
import com.venkat.meditrack.util.IdGenerator;

import java.time.LocalDate;
import java.util.stream.Collectors;

public class AppointmentService {

    private DataStore<Appointment> store = new DataStore<>();

    public synchronized Appointment createAppointment(Doctor doctor, Patient patient) {
        Appointment appointment = new Appointment(
                IdGenerator.getInstance().generateId(),
                doctor, patient, LocalDate.now()
        );
        store.add(appointment);
        return appointment;
    }

    public void cancel(int id) {
        Appointment a = store.getAll().stream()
                .filter(ap -> ap.getId() == id)
                .findFirst()
                .orElseThrow(() -> new AppointmentNotFoundException("Not found"));
        a.cancel();
    }

    public void analytics() {
        store.getAll().stream()
                .collect(Collectors.groupingBy(
                        a -> a.getDoctor().getName(),
                        Collectors.counting()
                ))
                .forEach((doc, count) ->
                        System.out.println(doc + " -> " + count));
    }
}