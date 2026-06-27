# Spring Security - Basic Authentication

A simple Spring Boot project demonstrating Basic Authentication using Spring Security and PostgreSQL.

## Features

- Basic Authentication with Spring Security
- User authentication using `UserDetailsService`
- Password encryption using `BCryptPasswordEncoder`
- Custom `AuthenticationManager` and `DaoAuthenticationProvider`
- User data stored in PostgreSQL using Spring Data JPA
- Protected REST endpoint

## Tech Stack

- Java 21
- Spring Boot
- Spring Security
- Spring Data JPA
- PostgreSQL
- Maven

## Authentication Flow

```
Client Request
      ↓
SecurityFilterChain
      ↓
BasicAuthenticationFilter
      ↓
AuthenticationManager
      ↓
DaoAuthenticationProvider
      ↓
UserDetailsService
      ↓
PostgreSQL Database
      ↓
Authentication Success
```

## API

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/check` | Protected endpoint requiring Basic Authentication |

## Learning Outcomes

- Spring Security authentication flow
- `SecurityFilterChain` configuration
- `AuthenticationManager` and `DaoAuthenticationProvider`
- Custom `UserDetailsService`
- Password hashing with BCrypt
- Database-backed authentication using PostgreSQL
