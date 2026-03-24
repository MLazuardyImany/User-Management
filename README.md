# User Management API

This project is a simple REST API for managing user data. It provides basic operations such as creating, retrieving, updating, and deleting users.

## Tech Stack

* Java Spring Boot
* MySQL
* JPA (Hibernate)

## Features

* Create user
* Get all users
* Get user by ID
* Update user
* Delete user

## API Endpoints

### Create User

POST /api/users

Request body:

```
{
  "username": "string",
  "password": "string",
  "role": "string"
}
```

### Get All Users

GET /api/users

### Get User by ID

GET /api/users/{id}

### Update User

PUT /api/users/{id}

### Delete User

DELETE /api/users/{id}

## How to Run

1. Create a database named `user_db` in MySQL
2. Update database credentials in `application.properties`
3. Run the application

```
mvn spring-boot:run
```

4. The API will be available at:

```
http://localhost:8080
```

## Testing

You can test the API using tools like Postman.

## Notes

This project is built as a basic backend practice to understand how REST APIs work using Spring Boot. It can be extended with authentication, validation, and other features depending on requirements.
