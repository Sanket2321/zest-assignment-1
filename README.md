# 📂 Project Structure

```text
employee-mangement-system
├── HELP.md
├── README.md
├── mvnw
├── mvnw.cmd
├── pom.xml
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── task
│   │   │           ├── EmployeeMangementSystemApplication.java
│   │   │           ├── controllers
│   │   │           │   └── EmployeeController.java
│   │   │           ├── entities
│   │   │           │   └── Employee.java
│   │   │           ├── exceptions
│   │   │           │   └── ResourceNotFoundException.java
│   │   │           ├── payloads
│   │   │           │   └── EmployeeDTO.java
│   │   │           ├── repositories
│   │   │           │   └── EmployeeRepository.java
│   │   │           └── services
│   │   │               ├── EmployeeService.java
│   │   │               └── impl
│   │   │                   └── EmployeeServiceImpl.java
│   │   └── resources
│   │       └── application.properties
│   └── test
│       └── java
│           └── com
│               └── task
│                   └── EmployeeMangementSystemApplicationTests.java
└── target
    ├── classes
    │   ├── application.properties
    │   └── com
    │       └── task
    │           ├── EmployeeMangementSystemApplication.class
    │           ├── controllers
    │           │   └── EmployeeController.class
    │           ├── entities
    │           │   └── Employee.class
    │           ├── exceptions
    │           │   └── ResourceNotFoundException.class
    │           ├── payloads
    │           │   └── EmployeeDTO.class
    │           ├── repositories
    │           │   └── EmployeeRepository.class
    │           └── services
    │               ├── EmployeeService.class
    │               └── impl
    │                   └── EmployeeServiceImpl.class
    └── test-classes
        └── com
            └── task
                └── EmployeeMangementSystemApplicationTests.class

spring-jwt-user-management
├── README.md
├── mvnw
├── mvnw.cmd
├── pom.xml
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── task
│   │   │           ├── EmployeeMangementSystemApplication.java
│   │   │           ├── controllers
│   │   │           │   └── EmployeeController.java
│   │   │           ├── entities
│   │   │           │   └── Employee.java
│   │   │           ├── exceptions
│   │   │           │   └── ResourceNotFoundException.java
│   │   │           ├── payloads
│   │   │           │   └── EmployeeDTO.java
│   │   │           ├── repositories
│   │   │           │   └── EmployeeRepository.java
│   │   │           ├── services
│   │   │           │   ├── EmployeeService.java
│   │   │           │   └── impl
│   │   │           │       └── EmployeeServiceImpl.java
│   │   │           └── springJwt
│   │   │               ├── SpringJwtApplication.java
│   │   │               ├── config
│   │   │               │   ├── CustomLogoutHandler.java
│   │   │               │   └── SecurityConfig.java
│   │   │               ├── controller
│   │   │               │   ├── AuthenticationController.java
│   │   │               │   └── DemoController.java
│   │   │               ├── filter
│   │   │               │   └── JwtAuthenticationFilter.java
│   │   │               ├── model
│   │   │               │   ├── AuthenticationResponse.java
│   │   │               │   ├── Role.java
│   │   │               │   ├── Token.java
│   │   │               │   └── User.java
│   │   │               ├── repository
│   │   │               │   ├── TokenRepository.java
│   │   │               │   └── UserRepository.java
│   │   │               └── service
│   │   │                   ├── AuthenticationService.java
│   │   │                   ├── JwtService.java
│   │   │                   └── UserDetailsServiceImp.java
│   └── resources
│       ├── application.properties
│       └── application.yml
└── test
    └── java
        └── com
            └── task
                ├── EmployeeMangementSystemApplicationTests.java
                └── springJwt
                    └── SpringJwtApplicationTests.java
