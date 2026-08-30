# Java Full-Stack Learning Journey

Welcome to my Java Full-Stack Development repository! This repository tracks my daily coding progress, practice projects, and backend learning path.

---

##  Tech Stack & Tools
* **Language:** Java (JDK 17+)
* **Database:** PostgreSQL
* **IDE & Tools:** IntelliJ IDEA, pgAdmin / psql
* **Version Control:** Git & GitHub

---

##  Progress Tracker

### Week 1: Core Java Foundations
* **Day 1:** Setup, Variables & Data Types
* **Day 2:** User Input Handling
* **Day 3:** Control Flow (If-Else, Loops, Fibonacci)
* **Day 4:** Methods & Method Overloading
* **Day 5:** Arrays (1D & 2D Arrays, Max Value)
* **Day 6:** Strings & String Manipulation
* **Day 7:** OOPs Basics (Classes, Objects, Constructors) & Review

### Week 2: Object-Oriented Programming & Exception Handling
* **Day 8-10:** Encapsulation, Inheritance & Polymorphism (Method Overriding, `super` keyword)
* **Day 11-12:** Abstraction (Abstract Classes & Interfaces)
* **Day 13:** Exception Handling & Custom Exceptions
* **Day 14:** **Capstone Project:** BankApp CLI Application

### Week 3: Java Collection Framework & Java 8+ Features
* **Day 15-17:** Java Collection Framework (`ArrayList`, `LinkedList`, `HashSet`, `LinkedHashSet`, `TreeSet`, `HashMap`, `LinkedHashMap`, `TreeMap`)
* **Day 18-19:** Functional Interfaces & Lambda Expressions
* **Day 20:** Java 16+ Records (`StudentRecord`) & Stream API Basics (`filter`, `map`, `collect`)
* **Day 21:** **Mini Project:** DataFilterSystem

### Week 4: Relational Databases & PostgreSQL Mastery
* **Day 22:** DDL Commands & Table Schema Creation (`DDL-Command.sql`)
* **Day 23:** DDL Demonstrations & DML CRUD Operations (`DDL-Command-Demo.sql`, `DML-Command.sql`)
* **Day 24:** Basic SQL Queries & PostgreSQL Operators (`Basic-Queries.sql`, `PostgreSQL-Operator.sql`)
* **Day 25:** Aggregate Functions & SQL Clauses (`PostgreSQL-AggregateFunction.sql`, `PostgreSQL-CLAUSES.sql`)
* **Day 26:** Relational Joins (`PostgreSQL-JOINS.sql`)
* **Day 27:** Constraints, Subqueries & Indexing Optimization (`PostgreSQL-CONSTRAINTS.sql`, `PostgreSQL-subqueries.sql`, `PostgreSQL-indexing.sql`)
* **Day 28:** Advanced SQL Practice & Query Analysis (`PostgreSQL-queries.sql`)

---

##  Projects

### 🏦 Mini BankApp CLI (Week 2)
A text-based banking application built in Java to demonstrate core Object-Oriented Programming (OOPs) concepts and Custom Exception Handling.
* **Key Features:** Account management (Balance check, Deposit, Withdraw) with custom `InsufficientBalanceException`.
* **Concepts Applied:** Encapsulation, Abstraction, Inheritance, Polymorphism, and Exception Handling.

### 📊 DataFilterSystem (Week 3)
A data processing system using Java Stream API and Records to filter, transform, and aggregate product data efficiently.
* **Key Features:**
  * Used Java **Record** (`Product`) for concise data modeling.
  * Category-based data filtering using `.filter()`.
  * Data transformation and string manipulations using `.map()`.
  * Clean output collection using `.toList()` and `forEach`.
* **Concepts Applied:** Java Collections, Record Classes, Functional Interfaces, Lambda Expressions, and Stream API Pipelines.

---

##  Repository Structure

```text
Java-Full-Stack-Journey/
├── .gitignore
├── .gitattributes
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
    ├── arrays/
    │   ├── Array_2D.java
    │   └── SmaxArraysDemo.java
    ├── basics/
    │   ├── DataTypesDemo.java
    │   └── VariablesDemo.java
    ├── collectionsframework/
    │   ├── ArrayListDemo.java
    │   ├── DataFilterSystem.java
    │   ├── FunctionalInterfaceDemo.java
    │   ├── HashMapDemo.java
    │   ├── HashSetDemo.java
    │   ├── LambdaExpressionDemo.java
    │   ├── LinkedHashMapDemo.java
    │   ├── LinkedHashSetDemo.java
    │   ├── LinkedListDemo.java
    │   ├── StreamDemo.java
    │   ├── StudentRecord.java
    │   ├── TreeMapDemo.java
    │   └── TreeSetDemo.java
    ├── controlflow/
    │   ├── ConditionalsDemo.java
    │   ├── FibonacciForLoop.java
    │   └── LoopsDemo.java
    ├── methods/
    │   ├── CalculatorDemo.java
    │   ├── MethodOverloadingDemo.java
    │   └── MethodsDemo.java
    ├── oopsbasics/
    │   ├── AbstractClassDemo.java
    │   ├── AccessModifiersDemo.java
    │   ├── ConstructorDemo.java
    │   ├── CustomClassDemo.java
    │   ├── CustomExceptionClassDemo.java
    │   ├── EncapsulationDemo.java
    │   ├── ExceptionHandlingDemo.java
    │   ├── ExceptionsDemo.java
    │   ├── InheritanceDemo.java
    │   ├── InterfacePracticeDemo.java
    │   ├── InterfacesDemo.java
    │   ├── MethodOverridingDemo.java
    │   ├── PolymorphismDemo.java
    │   ├── ProjectCLI.java
    │   └── SuperDemo.java
    ├── strings/
    │   ├── ReverseStringDemo.java
    │   └── StringMethods.java
    └── userinput/
        └── UserInput.java