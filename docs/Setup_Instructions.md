# Setup Instructions — MediTrack

## Step 1: Install JDK

Download from:
https://www.oracle.com/java/technologies/javase-downloads.html

Install JDK 17 or higher.

---

## Step 2: Configure Environment Variable

### Windows

```dtd
1. Open System Properties
2. Advanced → Environment Variables
3. Add new System Variable:

Name: JAVA_HOME
Value: C:\Program Files\Java\jdk-17

4. Edit PATH → Add:

%JAVA_HOME%\bin

```

---

## Step 3: Verify Installation

Open Command Prompt:
```dtd
java -version
javac -version
```


You should see version output.

---

## Step 4: Clone Project

```dtd
git clone https://github.com/JukuruVenkat/Medi-Track-Clinic-Appointment-Management-System.git
```

---

## Step 5: Compile
```dtd
javac com/venkat/meditrack/Main.java
```

---

## Step 6: Run

```dtd
java com.venkat.meditrack.Main
```

---

## Recommended IDE

```dtd
- IntelliJ IDEA
- Eclipse
- VS Code (Java Extension Pack)
```

