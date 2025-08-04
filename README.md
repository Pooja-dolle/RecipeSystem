# 🍲 Recipe Mangement System API

This is a simple Spring Boot REST API project for managing and searching recipes. It allows users to create, fetch, search (by name), and delete all recipes. 
Recipes include a name, ingredients, and instructions.

---

## 🚀 Features

- Create new recipes
- Get all recipes
- Search recipes by name (case-insensitive)
- Delete all recipes

---

## 🛠️ Tech Stack

- Java 17+
- Spring Boot
- Spring Data JPA
- Hibernate
- PostgresSQL Database
- Maven

---
## ⚙️ How to Run

**1. Clone the repository**

cd "/c/Program Files/PostgreSQL/17/bin"
./pg_ctl.exe start -D "/c/PostgresData" -l logfile
./psql.exe -U postgres

**2. For Connect Database**

\c recipe(database_name)

**3. Build and run the application**

../mvnw spring-boot:run

**4. Access the API**

Base URL: http://localhost:8080/api/recipes

---

## 📁 Project Structure

```plaintext
RecipeShow/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/
│       │       └── example/
│       │           └── RecipeShow/
│       │               ├── RecipeShowApplication.java     
│       │               ├── RecipeEntity.java              
│       │               ├── RecipeRepository.java          
│       │               ├── RecipeService.java             
│       │               └── RecipeController.java          
│       └── resources/
│           ├── application.properties                     
│           └── static/                                    
├── pom.xml                                               
└── README.md
```

# 📸 Output(Screenshot)

<img width="1617" height="835" alt="backend_output" src="https://github.com/user-attachments/assets/e6a44d82-ccc1-458c-8ae6-6cd9407b8e86" />

---

<img width="1871" height="862" alt="Final scensortOfoutput" src="https://github.com/user-attachments/assets/ddd99325-8e57-4cf1-b94f-180f5a14f7ca" />

---

