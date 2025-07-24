# 👨‍💼 Employee CRUD Application

A full-stack Spring Boot web application that allows users to manage employee records with Create, Read, Update, and Delete (CRUD) functionalities. The app includes a responsive front-end (HTML + CSS), backend RESTful endpoints, and MySQL database integration.

---

## ✨ Features

### 🧑‍💻 User Features:
- **Create New Employee:** Enter and save employee details.
- **Search Employee:** Search by Employee ID and view results.
- **Update Employee Info:** Modify name, department, or salary.
- **Delete Employee:** Remove employee using ID.
- **View All Employees:** Display all records in a table format.

### 🌐 Frontend:
- Clean and responsive UI using HTML and CSS.
- Each operation has its own dedicated page.
- Styled form inputs and tables for improved user experience.

### 🛠️ Backend:
- Built using Spring Boot.
- Uses Spring MVC for routing and controller logic.
- Spring Data JPA for database operations.
- MySQL used as the persistent data store.

---

## 📸 Screenshots

- Home Page
  
  <img width="1920" height="845" alt="Screenshot (531)" src="https://github.com/user-attachments/assets/6f646244-44fe-4409-88fa-40551b7c4258" />

- Create Page

  <img width="1920" height="835" alt="Screenshot (533)" src="https://github.com/user-attachments/assets/69cca44c-ba53-414a-b1fa-b7fe919864fd" />

- Search Page

  <img width="1920" height="830" alt="Screenshot (534)" src="https://github.com/user-attachments/assets/6e62e418-d806-477a-b519-017b965b54c3" />

- Update Page

  <img width="1920" height="787" alt="Screenshot (535)" src="https://github.com/user-attachments/assets/f09fc3c3-95cf-4eea-a259-62f888e2349d" />

- Delete Page

  <img width="1920" height="744" alt="Screenshot (536)" src="https://github.com/user-attachments/assets/150c94a0-bf73-4547-bedf-7fa9e2246521" />

- View All Page

  <img width="1920" height="848" alt="Screenshot (532)" src="https://github.com/user-attachments/assets/52e45706-b87e-41d5-bf0b-1904eeead2fc" />

---

## 🧪 Endpoint Summary

Each HTML page connects to these controller endpoints:

| Function         | URL           | Description                             |
|------------------|---------------|-----------------------------------------|
| Home Page        | `/`           | Main page with operation links          |
| Create           | `/createPage` | Shows form to add a new employee        |
| Create Submit    | `/create`     | POST method to save employee            |
| Search           | `/searchPage` | Search employee by ID                   |
| Search Submit    | `/search`     | GET method to display employee details  |
| Update           | `/updatePage` | Update employee form                    |
| Update Submit    | `/update`     | POST method to update employee          |
| Delete           | `/deletePage` | Delete employee form                    |
| Delete Submit    | `/delete`     | GET method to delete by ID              |
| View All         | `/viewAll`    | List all employees                      |

---

## 🧰 Technologies Used

| Layer       | Technology                     |
|-------------|--------------------------------|
| Frontend    | HTML, CSS                      |
| Backend     | Java, Spring Boot, Spring MVC  |
| Persistence | Spring Data JPA                |
| Database    | MySQL                          |
| Build Tool  | Maven                          |
| IDE         | Eclipse / IntelliJ             |

---

## 🏗️ Database Schema

**Table:** `Employee`

| Column     | Type    | Description               |
|------------|---------|---------------------------|
| `id`       | Long    | Primary Key               |
| `name`     | String  | Employee Name             |
| `department`| String | Department Name           |
| `salary`   | Integer | Monthly Salary            |

---

## 🏃‍♂️ How to Run the Project

### 📦 Prerequisites

- Java 17+
- Maven
- MySQL installed and running
- Eclipse or IntelliJ IDE

---

### ⚙️ Database Setup

1. Create the database in MySQL:
   ```sql
   CREATE DATABASE emp_crud;
2. Configure your DB credentials in src/main/resources/application.properties:
    ```
       spring.application.name=crud.employee
       spring.datasource.url=jdbc:mysql://localhost:3306/emp_crud
       spring.datasource.username=YOUR_DB_USERNAME
       spring.datasource.password=YOUR_DB_PASSWORD
       spring.jpa.hibernate.ddl-auto=update

---

### 🚀 Run Instructions

# Step 1: Clone the repo
git clone https://github.com/your-username/employee-crud-app.git
cd employee-crud-app

# Step 2: Build the project
mvn clean install

# Step 3: Run the application
mvn spring-boot:run

