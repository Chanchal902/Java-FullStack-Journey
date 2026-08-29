--create a table 'Emp'
CREATE TABLE Emp
(
    id     INT PRIMARY KEY NOT NULL UNIQUE,
    name   VARCHAR(40)     NOT NULL,
    salary VARCHAR(40)     NOT NULL CHECK (salary:: numeric > 0
) );

-- insert values into 'Emp' table
INSERT INTO Emp(id, name, salary)
VALUES (1, 'Chanchal Rani', 15000),
       (2, 'Harshh Sinha', 20000),
       (3, 'Raina', 12000),
       (4, 'Iram Fatima', 15600);
SELECT *
FROM Emp;

--create another table 'department'
CREATE TABLE department
(
    E_id INT references Emp (id),
    id   INT PRIMARY KEY,
    Dept VARCHAR(40) NOT NULL
);

--insert values into 'department'
INSERT INTO department(E_id, id, Dept)
VALUES (1, 101, 'Computer_Architecture');
    (2 , 102 , 'Electronics')
    ,
(3,103,'Model_Design');

-- To know the constraint name
\d
Emp;
\d
department;

ALTER TABLE Emp DROP CONSTRAINT emp_salary_check;