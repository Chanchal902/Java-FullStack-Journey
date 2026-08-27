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

-- using aggregate function
SELECT MIN(salary::numeric)
FROM Employee;
SELECT MIN(age)
FROM Employee;
SELECT MAX(salary::numeric)
FROM Employee;
SELECT MIN(salary::numeric) AS Lowest_salary
FROM Employee;
SELECT MAX(salary::numeric) AS Highest_salary
FROM Employee;
SELECT COUNT(gender)
FROM Employee;
SELECT COUNT(name)
FROM Employee
WHERE company = 'google';
SELECT SUM(salary::numeric)
FROM Employee
WHERE company = 'microsoft';
SELECT AVG(salary::numeric)
FROM Employee;
SELECT AVG(salary::numeric) ::NUMERIC(10,2)
FROM Employee;
SELECT COUNT(id), age
FROM Employee
GROUP BY age
HAVING COUNT(id) < 3;