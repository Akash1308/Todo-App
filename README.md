# Todo App

## 📝 Description
A simple Todo application built with **Spring Boot** that allows users to manage their tasks efficiently. The app provides CRUD (Create, Read, Update, Delete) functionalities for tasks and uses **Thymeleaf** for the front-end rendering.

## 🛠️ Tech Stack
- **Spring Boot**
- **Spring Web** (for building REST APIs and MVC)
- **Spring Data JPA** (for database interactions)
- **PostgreSQL** (as the database)
- **Lombok** (to reduce boilerplate code)
- **Thymeleaf** (for rendering UI templates)

## 🚀 Features
- Add new tasks
- View all tasks
- Delete tasks
- Mark tasks as completed

## 📦 Setup & Installation
### Prerequisites:
- Java 21 or later
- Maven
- PostgreSQL (running and configured)

### Steps to Run the Project:
1. **Clone the Repository:**
   ```sh
   git clone https://github.com/yourusername/todo-app.git
   cd todo-app
   ```
2. **Configure Database:**
   - Update `application.properties` in `src/main/resources` with your PostgreSQL credentials:
     ```properties
     spring.datasource.url=jdbc:postgresql://localhost:5432/todo_db
     spring.datasource.username=your_username
     spring.datasource.password=your_password
     ```
3. **Build and Run:**
   ```sh
   mvn spring-boot:run
   ```
4. **Access the App:**
   - Open browser and go to: [http://localhost:8080](http://localhost:8080)

## 📂 Project Structure
```
├── src/main/java/com/example/todo
│   ├── controller       # Handles web requests
│   ├── model            # Defines entity classes
│   ├── repository       # Handles database operations
│   ├── service          # Business logic implementation
│   ├── TodoApp.java     # Main Spring Boot Application
├── src/main/resources
│   ├── templates/       # Thymeleaf HTML templates
│   ├── static/          # CSS, JS, and images
│   ├── application.properties  # Configuration file
├── pom.xml              # Maven dependencies
```

## 📖 API Endpoints
| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/tasks` | Get all tasks |
| POST | `/tasks` | Add a new task |
| DELETE | `/tasks/{id}` | Delete a task |


---
### 🎯 Contributing
Contributions are welcome! Feel free to fork this repo and submit a pull request. 😊


