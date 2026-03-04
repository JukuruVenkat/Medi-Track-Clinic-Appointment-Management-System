# Design Decisions — MediTrack

## 1️⃣ Layered Architecture

We separated:
- entity → domain models
- service → business logic
- util → reusable utilities
- interfaces → abstraction contracts
- exception → custom exceptions

This improves maintainability and scalability.

---

## 2️⃣ Why Singleton (IdGenerator)?

Ensures:
- Only one ID generator instance
- Thread-safe ID generation
- Centralized control

---

## 3️⃣ Why Strategy Pattern (Billing)?

Different billing behaviors:
- Standard billing
- Discount billing

Instead of using conditionals, behavior is injected dynamically.

Benefits:
- Open/Closed Principle
- Extensibility

---

## 4️⃣ Why Factory Pattern?

Encapsulates object creation.
Main class does not directly instantiate billing strategies.

Promotes loose coupling.

---

## 5️⃣ Why Immutable BillSummary?

Immutable objects:
- Are thread-safe
- Prevent accidental modification
- Improve reliability

---

## 6️⃣ Why Custom Exceptions?

Provides:
- Domain clarity
- Cleaner error handling
- Separation of business and system errors

---

## 7️⃣ Why Generics (DataStore<T>)?

Allows:
- Type safety
- Code reuse
- Avoid casting

---

## 8️⃣ Why Enums?

Prevents:
- Magic strings
- Invalid states
- Typographical errors

---

## 9️⃣ Why Streams?

Used for:
- Filtering
- Grouping
- Analytics

Improves readability and functional style.

---

## 🔟 Why Synchronization?

Appointment booking is synchronized to avoid race conditions in concurrent environments.