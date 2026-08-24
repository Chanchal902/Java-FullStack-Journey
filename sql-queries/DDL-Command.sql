CREATE
DATABASE s_details;
--TABLE 1: Student
CREATE TABLE Student_table
(
    S_id          INT PRIMARY KEY,
    Student_name  VARCHAR(20),
    Student_roll  INT,
    Student_email VARCHAR(40)
);
INSERT INTO Student_table(S_id, Student_name, Student_roll, Student_email)
VALUES (101, 'Chanchal Rani', 478, 'chanchal@gmail.com'),
       (102, 'Harshh Sinha', 123, 'harsh@gmail.com'),
       (103, 'Rini Sarkar', 205, 'rini@gmail.com'),
       (104, 'Iram Fatima', 468, 'iram23@gmail.com'),
       (105, 'Suraj Singh', 501, 'suraj11singh@gmail.com'),
       (106, 'Pinki Bera', 505, 'pinki@gmail.com');

SELECT *
FROM Student_table;

--Table 2: Course
CREATE TABLE Course_table
(
    C_id          INT PRIMARY KEY,
    Course_name   VARCHAR(40),
    Course_price  INT,
    Course_credit INT
);
INSERT INTO Course_table(C_id, Course_name, Course_price, Course_credit)
VALUES (111, 'Computer Fundamentals', 4000, 2),
       (112, 'Electronics Advance Concept', 6000, 4),
       (113, 'Learn Arts', 1000, 1);
SELECT *
FROM Course_table;
