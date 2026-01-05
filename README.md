# Student Management System

A backend **Student Management System** built using **Spring Boot**, **Spring Data JPA**, and **MySQL**. The application exposes RESTful APIs to manage students with support for **partial updates (PATCH)** and full CRUD operations. APIs are tested using **Postman** and the project follows standard Maven-based Spring Boot structure.

---

## 🚀 Features

* Create, read, update, and delete students (CRUD)
* **Partial updates using PATCH** (update only provided fields)
* RESTful API design (GET, POST, PUT, PATCH, DELETE)
* Database persistence using **JPA/Hibernate**
* Auto-generated primary keys
* API testing with **Postman**

---

## 🧰 Tech Stack

* **Backend:** Java, Spring Boot
* **ORM:** Spring Data JPA (Hibernate)
* **Database:** MySQL
* **Build Tool:** Maven
* **API Testing:** Postman
* **Version Control:** Git & GitHub

---

## 📁 Project Structure

```
studentManagementSystem
├── src
│   ├── main
│   │   ├── java/com/example/studentManagementSystem
│   │   │   ├── controller
│   │   │   ├── service
│   │   │   ├── repository
│   │   │   └── model
│   │   └── resources
│   │       └── application.properties
├── pom.xml
└── README.md
```

---

## 🔗 API Endpoints

### ➤ Create Student

* **POST** `/students`

### ➤ Get All Students

* **GET** `/allstudents`

### ➤ Get Student by ID

* **GET** `/students/{id}`

### ➤ Update Student (Full Update)

* **PUT** `/allupdate/{id}`

### ➤ Update Student (Partial Update)

* **PATCH** `/update/{id}`

### ➤ Delete Student

* **DELETE** `/delete/{id}`

---

## 🧪 Testing with Postman

* All APIs were tested using **Postman**
* PATCH requests update only specific fields without overwriting existing data


## 🧠 Key Learnings

* Implementing safe partial updates
* Understanding JPA entity lifecycle
* Auto-increment ID behavior in databases
* REST API best practices

---

## 📌 Future Enhancements

* Add validation and exception handling
* Introduce DTOs for request/response mapping
* Add authentication and authorization
* Dockerize the application
* CI/CD pipeline integration

---

## 👩‍💻 Author

**Jahnavi Arthamuri**
Software Engineering Student
GitHub: [https://github.com/Jahnavi987-A](https://github.com/Jahnavi987-A)

---

## 📜 License

This project is for educational purposes.
