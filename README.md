README Documentation for Digital Library Book Management System
📖 Project Overview
The Digital Library Book Management System is a RESTful API built using Spring Boot and MySQL to help librarians efficiently manage books. This system enables users to add, update, search, delete, and view books while maintaining their availability status.

📌 Features
✅ Add a book with title, author, genre, and availability status
✅ View all books
✅ Search for a book by ID or Title
✅ Update book details (title, author, genre, status)
✅ Delete a book record
✅ Data validation and exception handling
✅ Well-structured, modular, and scalable code

🛠️ Tech Stack
Backend: Spring Boot (Java), Spring Data JPA

Database: MySQL

Validation: Jakarta Validation API

Build Tool: Maven

Testing: Postman

🚀 Getting Started
🔹 Prerequisites
Before running the project, ensure you have the following installed:

Java 17+

Maven 3+

MySQL Server

Postman (for API testing)

🔹 Clone the Repository

git clone https://github.com/PavanGoud547/Digital-Library-Book-Management-System.git
cd Digital-Library-Book-Management-System

🔹 Database Setup
Create a MySQL Database

CREATE DATABASE digital_library;
Update application.properties in src/main/resources

properties
spring.datasource.url=jdbc:mysql://localhost:3306/digital_library
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

🔹 Build & Run the Application

mvn clean install
mvn spring-boot:run
OR

./mvnw spring-boot:run
📝 API Endpoints & Testing
Once the server is running, use Postman or cURL to test the API.

📌 1. Add a Book
POST http://localhost:9990/api/books
Request Body (JSON)

{
  "title": "The Pragmatic Programmer",
  "author": "Andrew Hunt",
  "genre": "Programming",
  "status": "AVAILABLE"
}
📌 2. Get All Books
GET http://localhost:9990/api/books

📌 3. Get Book by ID
GET http://localhost:9990/api/books/1

📌 4. Search Book by Title
GET http://localhost:9990/api/books/search?title=The Pragmatic Programmer

📌 5. Update Book
PUT http://localhost:9990/api/books/1
Request Body (JSON)

{
  "title": "The Pragmatic Programmer - Updated",
  "author": "Andrew Hunt",
  "genre": "Software Engineering",
  "status": "CHECKED_OUT"
}
📌 6. Delete a Book
DELETE http://localhost:9990/api/books/1

🎯 Assumptions
Book IDs are unique and auto-generated.

Availability status can only be "AVAILABLE" or "CHECKED_OUT".

Title & Author are required and cannot be empty.

🔍 Challenges & Improvements
Challenges Faced
Handling database constraints efficiently.

Ensuring proper validation and exception handling.

Managing different status updates while preventing inconsistent data.

Future Enhancements
Implement a frontend (React.js)

Add User Authentication (JWT)

Support Bulk Book Upload via CSV

Implement Role-based Access Control (RBAC)

📜 License
This project is open-source under the MIT License.

📩 Contact
For queries, contact Your Name at pavankumarp547@gmail.com.

