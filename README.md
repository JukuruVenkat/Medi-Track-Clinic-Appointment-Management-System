# MediTrack - Clinic & Appointment Management System

MediTrack is a modular, object-oriented Clinic & Appointment Management System implemented in Core Java. The system models patients, doctors, appointments, and billing; demonstrating strong OOP design, SOLID principles, and standard Java features.
## 🏗 Project Structure
```
com.venkat.meditrack
│
├── Main.java
├── constants/
├── entity/
├── interfaces/
├── service/
├── util/
├── exception/
└── test/
```

## Features
* **Layered Architecture:** Clear separation of domain entities, business services, and utilities.
* **Advanced OOP:** Features deep cloning for patient records, immutable bill summaries, and enum-driven status tracking.
* **Design Patterns:** Implements Singleton (`IdGenerator`), Factory (`BillFactory`), and Strategy (`BillingStrategy`) patterns.
* **Generic Data Structures:** Custom `DataStore<T>` for type-safe, reusable storage.
* **Java Streams API:** Advanced querying and analytics for doctor appointments and patient filtering.

## Setup Instructions
Please refer to `docs/Setup_Instructions.md` for detailed steps on configuring the JDK and environment variable.

## Usage & Execution
The project contains two entry points:
1.  **Main Application (Interactive Menu):** Run `com.venkat.meditrack.Main` to launch the interactive console application.
2.  **Manual Test Runner:** Run `com.venkat.meditrack.test.TestRunner` to execute a predefined, programmatic test sequence without manual inputs.

### Sample Run Output
```text
=== Welcome to MediTrack System ===

1.Add Doctor 2.Add Patient 3.Book 4.Analytics 5.Exit
1
Doctor added successfully! ID: 1

1.Add Doctor 2.Add Patient 3.Book 4.Analytics 5.Exit
2
Patient added successfully! ID: 2

1.Add Doctor 2.Add Patient 3.Book 4.Analytics 5.Exit
3
Appointment booked successfully.
```
---

## 🧠 Features Implemented

✔ Encapsulation  
✔ Inheritance  
✔ Polymorphism  
✔ Abstraction  
✔ Deep vs Shallow Copy  
✔ Immutable Class  
✔ Enums  
✔ Singleton Pattern  
✔ Strategy Pattern  
✔ Factory Pattern  
✔ Custom Exceptions  
✔ Exception Chaining  
✔ Generics  
✔ Thread-safe Booking  
✔ TimerTask Reminder  
✔ Streams Analytics  
✔ CSV Read/Write  

---

## 👨‍💻 Author
Jukuru Venkat