# Enterprise Microservices Stack

Scalable microservices-based Employee Management System built with Spring Boot, Spring Cloud, Kafka, Eureka, Config Server, and Docker for enterprise-grade deployment and observability.

---

## Project Overview

This project demonstrates a complete microservices architecture for an Employee Management System with department and employee modules. It showcases:

- Scalability & modularity with independent services  
- Asynchronous communication using Kafka  
- Centralized configuration management using Spring Cloud Config  
- Service discovery with Eureka  
- Observability & distributed tracing using Zipkin  
- Containerized deployment using Docker & Docker Compose  

---

## Microservices Architecture

| Service                   | Responsibility                                |
|----------------------------|-----------------------------------------------|
| Employee Service           | Manage employee data, CRUD operations       |
| Department Service         | Manage department data, CRUD operations     |
| Config Server              | Centralized configuration management        |
| Eureka Server              | Service discovery for dynamic registration  |
| API Gateway (Optional)     | Single entry point for all microservices    |
| Kafka                      | Event-driven async communication            |
| Zipkin                     | Distributed tracing and observability      |

---

## Features

- CRUD APIs for Employee and Department management  
- Asynchronous messaging using Kafka  
- Centralized configuration with Spring Cloud Config  
- Service discovery & load balancing with Eureka  
- Tracing & monitoring using Zipkin  
- Containerized deployment with Docker and Docker Compose  

---

## Tech Stack

- Java 17, Spring Boot 3.5.5, Spring Cloud  
- Apache Kafka  
- Spring Cloud Config  
- Eureka  
- Zipkin, Micrometer  
- Docker, Docker Compose  
- Git, GitHub  

---

## Getting Started

### Prerequisites
- Java 17  
- Maven 3.8+  
- Docker & Docker Compose  

### Run Locally
1. Clone the repository:
```cmd
git clone https://github.com/Boominathan00github/spring-boot-microservices-stack.git
cd enterprise-microservices-stack
