# Spring-Boot-Study-Project

# 🚀 Spring Boot MySQL CRUD API

This is a simple CRUD (Create, Read, Update, Delete) RESTful API built using **Spring Boot** and **MySQL** as part of our study and practice in backend development with Java. The project demonstrates basic operations to manage Employee records in a database.

---

## 📋 Project Overview

In this project, we have implemented a fully functional backend API to perform CRUD operations on employee data. The main objectives were:

- 🎯 Understand the fundamentals of **Spring Boot** and how it simplifies Java web development.
- 🗄️ Learn to connect Spring Boot applications with a **MySQL** database using **Spring Data JPA** and **Hibernate ORM**.
- 🔧 Implement REST API endpoints following standard HTTP methods (GET, POST, PUT, DELETE).
- 🛠️ Practice exception handling and proper API response design.
- ⚙️ Configure application properties for database connectivity.
- 📊 Observe how Hibernate manages SQL queries and entity persistence.

This hands-on project helped us grasp the lifecycle of a web request and response, and the integration between Java applications and relational databases.

---

## ✨ Features Implemented

| ✅ Feature        | Description                          |
|------------------|------------------------------------|
| ➕ Create         | Add new employee records via `POST` requests.   |
| 🔍 Read           | Retrieve all employees or a single employee by ID using `GET` requests. |
| ✏️ Update         | Modify employee data via `PUT` requests.        |
| 🗑️ Delete         | Remove employee records via `DELETE` requests.  |

---

## 🛠️ Technologies Used

- ☕ Java 23
- 🌱 Spring Boot 3.4.5
- 📚 Spring Data JPA
- 🐘 Hibernate ORM
- 🐬 MySQL Database
- 📦 Maven Build Tool

---
## 🔥 CRUD Operations Endpoints


| HTTP Method | Endpoint          | Description           |
| ----------- | ----------------- | --------------------- |
| GET         | `/employees`      | Get all employees     |
| GET         | `/employees/{id}` | Get employee by ID    |
| POST        | `/employees`      | Create a new employee |
| PUT         | `/employees/{id}` | Update employee by ID |
| DELETE      | `/employees/{id}` | Delete employee by ID |

