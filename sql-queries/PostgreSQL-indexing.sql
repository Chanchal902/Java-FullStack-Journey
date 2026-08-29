--create a table 'Emp'
CREATE TABLE Emp
(
    id     INT PRIMARY KEY NOT NULL UNIQUE,
    name   VARCHAR(40)     NOT NULL,
    salary VARCHAR(40)     NOT NULL CHECK (salary:: numeric > 0
) );

-- To know the constraint name
\d
Emp;

-- insert values into 'Emp' table
INSERT INTO Emp(id, name, salary)
VALUES (1, 'Chanchal Rani', 15000),
       (2, 'Harshh Sinha', 20000),
       (3, 'Raina', 12000),
       (4, 'Iram Fatima', 15600);
SELECT *
FROM Emp;

-- create index
CREATE INDEX idx ON Emp (name);
EXPLAIN
SELECT *
FROM Emp
WHERE name = 'Raina';
CREATE INDEX idx_hash ON Emp USING HASH(name);
EXPLAIN
SELECT *
FROM Emp
WHERE name = 'Harshh Sinha';