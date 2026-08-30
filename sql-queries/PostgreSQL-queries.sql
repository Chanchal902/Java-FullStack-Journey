-- create a database
CREATE
DATABASE dbs;

-- create a table 'information'

CREATE TABLE information
(
    id    INT PRIMARY KEY    NOT NULL,
    name  VARCHAR(40)        NOT NULL,
    job   CHAR(20)           NOT NULL,
    age   INT                NOT NULL,
    phone VARCHAR(20) UNIQUE NOT NULL
);

-- insert values into 'information'
INSERT INTO information (id, name, job, age, phone)
VALUES (1, 'Chanchal Rani', 'Engineer', 23, 7004239949),
       (2, 'Harshh Sinha', 'Textile Engineer', 23, 7549684875),
       (3, 'Ankit Kumar', 'professor', 26, 8324596754),
       (4, 'Iram Kushaid Shamim', 'Business Woman', 27, 6331245689),
       (5, 'Rajib Thakur', 'Army General', 62, 7456002312),
       (6, 'Isha Kashyap', 'Housewife', 59, 6004596678),
       (7, 'Riya Raj', 'Architecture', 46, 9331669024),
       (8, 'Ankush Raj', 'Teacher', 55, 6234001236),
       (9, 'Arsh Khureja', 'Student', 18, 9234512636),
       (10, 'Krishre', 'Student', 12, 6342123612);

SELECT *
FROM information;

ALTER TABLE information
    ADD gender VARCHAR(20);

ALTER TABLE information
DROP
gender;

UPDATE information
SET age = 13
WHERE name = 'Krishre';

SELECT *
FROM information
WHERE job = 'Student';

SELECT *
FROM information
WHERE age > 55;

SELECT *
FROM information
WHERE job <> 'professor';

SELECT *
FROM information
WHERE name LIKE 'K%';

SELECT DISTINCT name, job
FROM information;

SELECT COUNT(DISTINCT job)
FROM information;

SELECT *
FROM information
ORDER BY age desc;

SELECT *
FROM information LIMIT 5;

SELECT *
FROM information LIMIT 4
OFFSET 5;

SELECT MIN(age)
FROM information;

SELECT MAX(age) AS Maximun_Age
FROM information;

\d
information;