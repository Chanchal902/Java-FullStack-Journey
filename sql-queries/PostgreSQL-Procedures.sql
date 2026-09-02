CREATE TABLE person
(
    id   INT,
    name VARCHAR(40) NOT NULL,
    city VARCHAR(40) NOT NULL
);

CREATE PROCEDURE structure(p_name VARCHAR (40), p_city VARCHAR (40))
    LANGUAGE plpgsql
AS $$
BEGIN
INSERT INTO person(name, city)
VALUES (p_name, p_city);
END;
$$;

CALL structure('Chanchal Rani' , 'sabour');
CALL structure('Harshh Sinha' , 'Bhagalpur');

SELECT *
FROM person;

