--Create Employee Table
CREATE TABLE Employee
(
    id      INT PRIMARY KEY,
    name    VARCHAR(50),
    gender  VARCHAR(20),
    age     INT,
    salary  VARCHAR(60),
    company VARCHAR(60)
);
INSERT INTO Employee(id, name, gender, age, salary, company)
VALUES (101, 'Chanchal Rani', 'Female', 25, 84000, 'google'),
       (102, 'Harshh Sinha', 'Male', 25, 80000, 'sangam txt'),
       (103, 'Iram Fatima', 'Female', 23, 40000, 'TCS'),
       (104, 'Rini Sarkar', 'Female', 27, 56000, 'keventers'),
       (105, 'Ankit Kumar', 'Male', 25, 89000, 'LTI Mindtree'),
       (106, 'Jitin', 'Male', 32, 102200, 'google'),
       (107, 'Rajiv Singh', 'Male', 36, 50000, 'microsoft'),
       (108, 'Rajiv Shah', 'Male', 43, 360000, 'microsoft'),
       (109, 'Ranjeet Mandal', 'Male', 52, 360000, 'google'),
       (110, 'Riya jha', 'Female', 56, 120000, 'google'),
       (111, 'Rriya', 'Female', 60, 100000, 'google');

SELECT *
FROM Employee;

-- using operators
SELECT *
FROM Employee
WHERE company = 'google';
SELECT *
FROM Employee
WHERE age < 25;
SELECT *
FROM Employee
WHERE age > 50;
SELECT *
FROM Employee
WHERE age <= 25;
SELECT *
FROM Employee
WHERE age >= 50;
SELECT *
FROM Employee
WHERE company != 'microsoft';
SELECT *
FROM Employee
WHERE company <> 'microsoft';
SELECT *
FROM Employee
WHERE company LIKE 'm%';
SELECT *
FROM Employee
WHERE company LIKE '_S';
SELECT *
FROM Employee
WHERE company LIKE '%e';
SELECT *
FROM Employee
WHERE company LIKE '_i';
SELECT *
FROM Employee
WHERE company ILIKE 'M%';
SELECT *
FROM Employee
WHERE age = 25
  AND company = 'LTI Mindtree';
SELECT *
FROM Employee
WHERE age > 30
   OR gender = 'Female';
SELECT *
FROM Employee
WHERE company IN ('keventers', 'TCS');
SELECT *
FROM Employee
WHERE age BETWEEN 40 AND 60;
SELECT *
FROM Employee
WHERE company IS NULL;
SELECT *
FROM Employee
WHERE company NOT LIKE 'm%';
SELECT *
FROM Employee
WHERE age NOT IN (25, 27);
SELECT *
FROM Employee
WHERE company NOT ILIKE '%EE';


