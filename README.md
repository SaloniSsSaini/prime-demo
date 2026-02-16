# 🚀 PrimeTrade Backend Assignment
**Candidate:** Saloni Saini  
**Role:** Backend Developer Intern Assignment  

---

# 🧠 Assignment Objective

The goal of this assignment was to design and implement a **secure, scalable REST API** with:

- JWT-based authentication
- Role-based access
- CRUD operations
- Proper project structure
- API documentation
- Frontend-ready backend

---

# 🪜 Step-by-Step Implementation Journey

## ✅ Step 1 — Project Setup

First, I initialized a Spring Boot project using:

- Spring Boot 3.2.5
- Java 17
- Maven

Added core dependencies:

- Spring Web
- Spring Security
- Spring Data JPA
- Validation
- JWT (jjwt)
- Swagger OpenAPI
- Lombok

---

## ✅ Step 2 — Database Configuration

Configured **H2 in-memory database** for quick development and testing.

**application.properties**

```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.jpa.hibernate.ddl-auto=update
spring.h2.console.enabled=true
✔ Enables fast local testing
✔ No external DB required

✅ Step 3 — User Module Design
Created user domain:

User entity

Role enum (USER, ADMIN)

UserRepository

Features implemented:
Unique email validation

BCrypt password hashing

JPA entity mapping

✅ Step 4 — Authentication System
Implemented secure authentication flow.

Register Flow
User submits name/email/password

Password hashed using BCrypt

User saved to DB

JWT token generated

Token returned in response

Login Flow
User submits email/password

Password verified

JWT token generated

Token returned

✅ Step 5 — JWT Security Implementation
Implemented full JWT pipeline:

JwtUtil → token generation & validation

JwtFilter → request interception

SecurityConfig → stateless security

Security Features
Stateless authentication

Token-based authorization

Password hashing

CSRF disabled for APIs

CORS enabled

✅ Step 6 — Protected Task Module
Created secondary entity Task with full CRUD.

Implemented APIs
GET /api/v1/tasks

POST /api/v1/tasks

DELETE /api/v1/tasks/{id}

⚠️ All endpoints are JWT protected.

✅ Step 7 — API Versioning
All endpoints are versioned:

/api/v1/...
✔ Future-proof design
✔ Backward compatibility ready

✅ Step 8 — Validation & Error Handling
Implemented:

Request validation

Global exception handling

Proper HTTP status codes

Ensures production-level API behavior.

✅ Step 9 — Swagger Documentation
Integrated OpenAPI Swagger UI.

📍 Access at:

http://localhost:8080/swagger-ui.html
This allows:

Live API testing

Request/response visibility

Easy reviewer testing

✅ Step 10 — Security Testing
Verified complete JWT flow:

✔ Register → token generated
✔ Login → token generated
✔ Protected API without token → blocked
✔ Protected API with token → success

🛠️ Tech Stack
Layer	Technology
Language	Java 17
Framework	Spring Boot 3
Security	Spring Security + JWT
Database	H2
ORM	Spring Data JPA
Docs	Swagger
Build	Maven
🔑 API Reference
Auth APIs
Register
POST /api/v1/auth/register
Login
POST /api/v1/auth/login
Task APIs (Protected)
⚠️ Requires header:

Authorization: Bearer <token>
Endpoints:

GET /api/v1/tasks

POST /api/v1/tasks

DELETE /api/v1/tasks/{id}

▶️ How to Run the Project
Prerequisites
Java 17+

Maven

Steps
git clone <your-repo-url>
cd prime-demo
mvn clean install
mvn spring-boot:run
Server starts at:

http://localhost:8080
🗄️ Database Access
H2 Console:

http://localhost:8080/h2-console
JDBC URL:

jdbc:h2:mem:testdb
📈 Scalability Considerations
The system is designed keeping scalability in mind:

Stateless JWT authentication

Layered architecture

Easy DB migration (MySQL/Postgres)

Microservice-ready structure

Docker-ready

Redis caching can be added

Horizontal scaling friendly

🔮 Future Enhancements
Refresh tokens

Role-based endpoint restrictions

Redis caching

Docker deployment

Unit tests

Production database migration

Rate limiting

👩‍💻 Author
Saloni Saini
