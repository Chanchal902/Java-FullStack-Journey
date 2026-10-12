<h1 align="center">Java Full-Stack Journey</h1>

<p align="center">
My learning repository for Java backend development.<br>
Code is organised by topic and updated as I learn.
</p>

<p align="center">
<img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java">
<img src="https://img.shields.io/badge/PostgreSQL-316192?style=for-the-badge&logo=postgresql&logoColor=white" alt="PostgreSQL">
<img src="https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white" alt="Maven">
<img src="https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=git&logoColor=white" alt="Git">
<img src="https://img.shields.io/badge/IntelliJ_IDEA-000000?style=for-the-badge&logo=intellijidea&logoColor=white" alt="IntelliJ IDEA">
</p>

---

## Topics covered

| Topic | What I practiced | Folder |
|---|---|---|
| Core Java | basics, control flow, methods, arrays, strings, user input | `basics`, `controlflow`, `methods`, `arrays`, `strings`, `userinput` |
| OOP | classes, inheritance, abstraction, encapsulation, custom exceptions | `oopsbasics` |
| Collections and Streams | Collections Framework, records, Stream API | `collectionsframework` |
| PostgreSQL | DDL, DML, joins, subqueries, aggregates, constraints, indexing | `sql-queries` |
| JDBC | Statement, PreparedStatement, CallableStatement, transactions, batch processing | `jdbc` |
| Servlets | handling HTTP requests and responses, session tracking | `servlets` |

## Projects

### Mini BankApp
A command-line banking application in Java.
- Abstract `BankAccount` class with private fields and getters
- `SavingsAccount` subclass and a custom `InsufficientBalanceException`
- Menu: check balance, deposit, withdraw, exit, with input validation

Code: `oopsbasics/ProjectCLI.java`

### Data Filter System
Filters a list of products using a Java record and the Stream API.
- Filtering by category and price
- Sorting with `Comparator` and mapping to names with `map`

Code: `collectionsframework/DataFilterSystem.java`

## Repository structure
- `src/main/java/`: Java code, one package per topic
- `src/main/webapp/`: web files for Servlet practice
- `sql-queries/`: PostgreSQL practice queries
- `pom.xml`: Maven configuration

## Currently learning
Hibernate (see [Hibernate-practice](https://github.com/Chanchal902/Hibernate-practice)), then JSP and Spring Boot.

## Tech
Java 16+ (records and `Stream.toList()`), PostgreSQL, JDBC, Servlets, Maven, Git