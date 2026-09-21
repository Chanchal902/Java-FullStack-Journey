#  Java Full-Stack Development Repository

[![Java](https://img.shields.io/badge/Java-17%2B-orange?logo=openjdk)](https://www.oracle.com/java/)
[![Servlet](https://img.shields.io/badge/Servlets-Jakarta%2FJavaEE-blue)](https://jakarta.ee/)
[![Database](https://img.shields.io/badge/Database-PostgreSQL%2FSQL-4169E1?logo=postgresql)](https://www.postgresql.org/)
[![Build](https://img.shields.io/badge/Build-Maven-C71A36?logo=apachemaven)](https://maven.apache.org/)

Welcome to my **Java Full-Stack Engineering** repository! This repository showcases my technical competency, structured learning progress, hands-on implementation of Core Java, Relational Database optimization (PostgreSQL), JDBC connectivity, and backend Web Application development (Servlets & JSP).

Designed specifically to demonstrate production-ready coding practices, clean design patterns, and solid backend software architecture for **Full-Stack / Backend Engineering** roles.

---

## 📌 Technical Summary & Core Skills

* **Core Backend Language:** Java 17+ (OOPs, Exception Handling, Collections, Stream API, Lambda Expressions, Records)
* **Web & Enterprise Technologies:** Servlets, JSP (JavaServer Pages), Request Dispatching, Session Management, HTML5
* **Database & Persistence:** PostgreSQL, SQL Optimization (Joins, Indexing, Subqueries, Aggregation), JDBC Driver Integration
* **Data Management & Transactions:** Parameterized Queries (`PreparedStatement`), JDBC Transactions (Commit/Rollback), Batch Processing, Stored Procedures (`CallableStatement`)
* **Build & Version Control:** Apache Maven (`pom.xml`), Git, GitHub

---

## 🛠️ Practical Projects & Portfolio

### 1. 🏦 Mini BankApp CLI Application
* **Description:** Command-line banking system demonstrating strict Object-Oriented Principles, Encapsulation, and Custom Exception Architecture.
* **Technical Highlights:**
  * Implemented secure balance operations (Deposit, Withdraw, Audit) with custom runtime exceptions (`InsufficientBalanceException`).
  * Enforced encapsulation and abstraction for business logic separation.
* **Key Skills:** Core Java, OOP Design Patterns, Robust Exception Handling.

### 2. 📊 High-Performance Data Filter System
* **Description:** In-memory data transformation and processing system utilizing modern Java features for rapid evaluation.
* **Technical Highlights:**
  * Utilized **Java 16+ Records** (`Product`) for immutable, concise data modeling.
  * Leveraged **Java Stream API** for dynamic filtering (`.filter()`), mapping (`.map()`), and aggregate list collection (`.toList()`).
* **Key Skills:** Java Stream API, Functional Programming, Lambda Expressions, Java Records.

---

## 📂 Project Architecture

```text
Java-FullStack-Journey/
├── .gitattributes
├── .gitignore
├── pom.xml
├── README.md
├── sql-queries/
│   ├── Basic-Queries.sql
│   ├── DDL-Command.sql
│   ├── DDL-Command-Demo.sql
│   ├── DML-Command.sql
│   ├── PostgreSQL-AggregateFunction.sql
│   ├── PostgreSQL-CLAUSES.sql
│   ├── PostgreSQL-CONSTRAINTS.sql
│   ├── PostgreSQL-indexing.sql
│   ├── PostgreSQL-JOINS.sql
│   ├── PostgreSQL-Operator.sql
│   ├── PostgreSQL-queries.sql
│   └── PostgreSQL-subqueries.sql
└── src/
    └── main/
        ├── java/
        │   ├── arrays/
        │   ├── basics/
        │   ├── collectionsframework/
        │   ├── controlflow/
        │   ├── jdbc/
        │   ├── methods/
        │   ├── oopsbasics/
        │   ├── servlets/
        │   ├── strings/
        │   └── userinput/
        └── webapp/
            ├── WEB-INF/
            │   └── web.xml
            ├── demo.html
            ├── index.html
            ├── index.jsp
            ├── login.html
            └── result.jsp
```