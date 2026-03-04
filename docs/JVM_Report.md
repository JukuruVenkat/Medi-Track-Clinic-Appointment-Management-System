# JVM Report — MediTrack

## 1️⃣ Class Loader

The Class Loader subsystem loads .class files into memory.

Phases:
- Loading
- Linking
    - Verification
    - Preparation
    - Resolution
- Initialization

Types:
- Bootstrap ClassLoader
- Extension ClassLoader
- Application ClassLoader

In MediTrack:
All entity, service, and util classes are loaded by the Application ClassLoader.

---

## 2️⃣ Runtime Data Areas

### Heap
Stores objects and instance variables.
Example:
Doctor, Patient, Appointment objects are created in heap memory.

### Stack
Each thread has its own stack.
Stores:
- Local variables
- Method calls
- Partial results

### Method Area
Stores:
- Class metadata
- Static variables
- Method bytecode

Example:
Constants.TAX_RATE is stored here.

### PC Register
Each thread has its own Program Counter Register.
It keeps track of the currently executing instruction.

---

## 3️⃣ Execution Engine

The Execution Engine executes bytecode.

Components:
- Interpreter
- JIT Compiler
- Garbage Collector

---

## 4️⃣ JIT Compiler vs Interpreter

Interpreter:
Executes bytecode line-by-line.

JIT Compiler:
Compiles frequently executed bytecode into native machine code.

Benefit:
Improves performance significantly.

In MediTrack:
Frequently called service methods benefit from JIT optimization.

---

## 5️⃣ Write Once, Run Anywhere

Java bytecode runs on any machine with JVM installed.
Platform independence is achieved via JVM abstraction.