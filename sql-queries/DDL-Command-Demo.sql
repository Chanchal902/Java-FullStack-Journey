-- creating a table
CREATE TABLE p_details
(
    Name         VARCHAR(80),
    City         VARCHAR(80),
    Phone_Number VARCHAR(20),
    Age          INT
);
INSERT INTO p_details(Name, City, Phone_Number, Age)
VALUES ('Chanchal Rani', 'Bhagalpur', 7456923512, 21),
       ('Ankit Kumar', 'Bhuvaneshwar', 7004562312, 25),
       ('Harshh Sinha', 'Bhilwara', 8536121201, 21),
       ('Rini Sarkar', 'Kolkata', 7664112031, 20),
       ('Pritam Anand', 'Sukshena', 8336021451, 31),
       ('Neha Sharma', 'Katihar', 6335221019, 18),
       ('Richa Devi', 'New Town', 7549313245, 56),
       ('Amit Mishra', 'Bhagalpur', 8002312265, 63),
       ('Iram Fatima', 'Chhatabad', 6331555422, 82),
       ('Kushaid', 'Jharkhand', 8331662451, 12);
SELECT *
FROM p_details;

-- using DDL commands : Alter , Drop , Truncate

ALTER TABLE p_details
DROP
COLUMN phone_number;
SELECT *
FROM p_details;

ALTER TABLE p_details
    ADD gender VARCHAR(20);
SELECT *
FROM p_details;

ALTER TABLE p_details
ALTER
COLUMN city TYPE VARCHAR(40);
SELECT *
FROM p_details;

TRUNCATE TABLE course_table;




