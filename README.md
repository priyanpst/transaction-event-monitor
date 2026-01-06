# 📡 Event-Driven Transaction Monitor

A robust service demonstrating the integration of **Apache Kafka** for high-speed messaging and **MySQL** for persistent auditing. 

### ⚙️ How it works:
1. **Producer:** External services publish transaction events to the `transactions-topic`.
2. **Consumer:** This service listens to the topic, processes the JSON payload, and persists it into a MySQL audit table.
3. **Resilience:** Configured with specific consumer groups to ensure exactly-once processing (or at-least-once depending on business rules).

### 🛠 Tech Stack:
- Java 21, Spring Boot 3, Spring Kafka, Spring Data JPA, MySQL.
