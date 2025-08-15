##Project Structure 
employee-management-jwt/
├── mvnw
├── mvnw.cmd
├── pom.xml
├── README.md
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── task
│   │   │           ├── EmployeeManagementApplication.java       # Main Spring Boot entry point
│   │   │
│   │   │           ├── controllers                              # REST Controllers
│   │   │           │   ├── EmployeeController.java              # Employee CRUD endpoints
│   │   │           │   ├── AuthenticationController.java        # User registration & login
│   │   │           │   └── DemoController.java                   # Example secured endpoint
│   │   │
│   │   │           ├── entities                                 # JPA Entities
│   │   │           │   ├── Employee.java                        # Employee data model
│   │   │           │   ├── User.java                            # User entity for authentication
│   │   │           │   ├── Role.java                            # Enum for user roles
│   │   │           │   └── Token.java                           # Stores JWT tokens
│   │   │
│   │   │           ├── payloads                                 # DTOs
│   │   │           │   └── EmployeeDTO.java                     # Data Transfer Object for Employee
│   │   │
│   │   │           ├── repositories                             # Spring Data JPA Repositories
│   │   │           │   ├── EmployeeRepository.java              # Employee persistence
│   │   │           │   ├── UserRepository.java                  # User persistence
│   │   │           │   └── TokenRepository.java                 # Token persistence
│   │   │
│   │   │           ├── services                                 # Business Logic Layer
│   │   │           │   ├── EmployeeService.java                 # Employee service interface
│   │   │           │   ├── impl                                 # Service Implementations
│   │   │           │   │   └── EmployeeServiceImpl.java
│   │   │           │
│   │   │           ├── springJwt                                # Authentication & Security
│   │   │           │   ├── config                               # Security configuration
│   │   │           │   │   ├── SecurityConfig.java
│   │   │           │   │   └── CustomLogoutHandler.java
│   │   │           │   ├── filter                               # JWT Token Filter
│   │   │           │   │   └── JwtAuthenticationFilter.java
│   │   │           │   ├── service                              # Auth services
│   │   │           │   │   ├── AuthenticationService.java
│   │   │           │   │   ├── JwtService.java
│   │   │           │   │   └── UserDetailsServiceImp.java
│   │   │           │
│   │   │           ├── exceptions                               # Custom Exceptions
│   │   │           │   └── ResourceNotFoundException.java
│   │   │
│   │   │           └── util                                     # Utilities (if needed)
│   │   │
│   │   └── resources
│   │       ├── application.properties                           # MySQL, JWT, and app config
│   │       └── application.yml                                  # Optional YAML config
│   │
│   └── test
│       └── java
│           └── com
│               └── task
│                   ├── EmployeeManagementApplicationTests.java
│                   └── springJwt
│                       └── SpringJwtApplicationTests.java
