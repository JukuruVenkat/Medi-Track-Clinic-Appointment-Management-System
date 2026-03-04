package com.venkat.meditrack;

import com.airtribe.meditrack.entity.*;
import com.airtribe.meditrack.service.*;
import com.airtribe.meditrack.util.*;
import com.venkat.meditrack.entity.Doctor;
import com.venkat.meditrack.entity.Patient;
import com.venkat.meditrack.entity.Specialization;
import com.venkat.meditrack.service.AppointmentService;
import com.venkat.meditrack.service.DoctorService;
import com.venkat.meditrack.service.PatientService;
import com.venkat.meditrack.util.IdGenerator;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DoctorService doctorService = new DoctorService();
        PatientService patientService = new PatientService();
        AppointmentService appointmentService = new AppointmentService();

        while (true) {
            System.out.println("\n1.Add Doctor 2.Add Patient 3.Book 4.Analytics 5.Exit");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1 -> {
                    Doctor d = new Doctor(
                            IdGenerator.getInstance().generateId(),
                            "Dr Sharma", 45, "999",
                            Specialization.CARDIOLOGIST, 500);
                    doctorService.addDoctor(d);
                }

                case 2 -> {
                    Patient p = new Patient(
                            IdGenerator.getInstance().generateId(),
                            "Ravi", 30, "888", "None");
                    patientService.addPatient(p);
                }

                case 3 -> {

                    if (doctorService.getAll().isEmpty() ||
                            patientService.getAll().isEmpty()) {

                        System.out.println(
                                "Please add at least one doctor and one patient first."
                        );
                        break;
                    }

                    Doctor doctor = doctorService.getAll().get(0);
                    Patient patient = patientService.getAll().get(0);

                    try {
                        appointmentService.createAppointment(doctor, patient);
                        System.out.println("Appointment booked successfully.");
                    } catch (Exception e) {
                        System.out.println("Error booking appointment: " + e.getMessage());
                    }
                }

                case 4 -> appointmentService.analytics();

                case 5 -> System.exit(0);
            }
        }
    }
}