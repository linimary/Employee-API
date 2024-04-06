# Employee API

This RESTful API provides endpoints for managing employee data, including retrieving, adding, updating, and deleting employee records. The API is secured using Spring Security to ensure proper authentication and authorization.

## Features
- Retrieve Employees: Get a list of all employees or retrieve a specific employee by ID.
- Add Employee: Add a new employee to the database.
- Update Employee: Update an existing employee's information.
- Delete Employee: Delete an employee from the database.

## Technologies Used

- Framework: Spring Boot
- Database: Hibernate ORM with MySQL
- Security: Spring Security
- API Documentation: Swagger UI
- Build Tool: Maven

## Security

The API is secured using Spring Security to ensure proper authentication and authorization. Employee access levels are defined as follows:

- EMPLOYEE: Read-only access to employee information.
- MANAGER: Can add and update employees.
- ADMIN: Full access to all employee operations.

## Getting Started

To get started with the Employee API, follow these steps:

1. Clone the Repository: git clone https://github.com/linimary/employee-api.git
2. Navigate to the Project Directory: cd employee-api
3. Build the Project: mvn clean install
4. Run the Application: mvn spring-boot:run
5. Access the API Documentation: Open your web browser and go to http://localhost:8080/swagger-ui.html to view and interact with the API endpoints.

## API Endpoints

![employee-api](https://github.com/linimary/Employee-API/assets/125043957/8638c096-35da-4606-a9a4-d6e0cd6ac52e)
