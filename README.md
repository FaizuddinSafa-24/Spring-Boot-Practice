# Spring Boot Practice

A collection of small Spring Boot projects used to practice REST APIs, CRUD operations, persistence, and request processing patterns.

## Repository Overview

This repository contains multiple independent Spring Boot applications.  
Each folder is a standalone Maven project with its own `pom.xml` and Maven Wrapper.

| Module | Purpose | Example Endpoint |
| --- | --- | --- |
| `api` | Basic REST endpoint returning sample tasks | `GET /api/tasks` |
| `taskapi/taskapi` | Simple task API returning string tasks | `GET /api/tasks` |
| `crudapi` | CRUD task API using Spring Data JPA + H2 | `GET /crudapi/tasks/` |
| `task` | Task CRUD API with JPA + H2 + Actuator | `GET /task/tasks/` |
| `taskpsql` | Task CRUD API configured for PostgreSQL | `GET /task/tasks/` |
| `chatsummarize` | Chat ingestion/formatting endpoint | `POST /chatsummarize/chat/chatsummarize/process-raw` |

## Tech Stack

- Java 21
- Spring Boot (4.x in current modules)
- Spring Web MVC
- Spring Data JPA (selected modules)
- H2 / PostgreSQL (module dependent)
- Maven + Maven Wrapper

## Prerequisites

- JDK 21+
- Git
- PostgreSQL (only for `taskpsql`)

## Run an Application

Choose a module and run it from its directory:

```bash
cd <module-folder>
./mvnw spring-boot:run
```

Examples:

```bash
cd api && ./mvnw spring-boot:run
cd crudapi && ./mvnw spring-boot:run
cd taskpsql && ./mvnw spring-boot:run
```

## Run Tests

```bash
cd <module-folder>
./mvnw test
```

## Notes

- Modules are independent and can be started/tested separately.
- `taskpsql` expects a local PostgreSQL database named `taskdb` with matching credentials in its `application.properties`.