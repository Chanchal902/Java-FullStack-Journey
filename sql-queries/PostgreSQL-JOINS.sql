-- create "users" table
CREATE TABLE users
(
    id         INT PRIMARY KEY,
    user_name  VARCHAR(40),
    product_id INT,
    price      VARCHAR(40)
);

--inserting values into users table
INSERT INTO users(id, user_name, product_id, price)
VALUES (101, 'Harshh Sinha', 23, 1299),
       (102, 'Chanchal Rani', 24, 645),
       (103, 'Iram Kushaid Shamim', 25, 1999),
       (104, 'Rini Sarkar', 26, 323),
       (105, 'Kushaid Shamim', 27, 4999);

-- create another table "product_info"
CREATE TABLE product_info
(
    product_id INT,
    brand      VARCHAR(40),
    category   VARCHAR(40)
);

-- insert values into product_info table
INSERT INTO product_info(product_id, brand, category)
VALUES (56, 'myntra', 'clothing'),
       (25, 'nykaa', 'skin care'),
       (17, 'amazon', 'electronics'),
       (26, 'myntra', 'footwear'),
       (76, 'nykaa', 'makeup'),
       (01, 'flipkart', 'clothing'),
       (23, 'nykaa', 'skin care + hair care'),
       (99, 'amazon', 'accessiories');

-- JOINS
SELECT user_name, price, brand
FROM users
         INNER JOIN product_info ON product_info.product_id = users.product_id;

--left join
SELECT id, price, brand
FROM users
         LEFT JOIN product_info ON users.product_id = product_info.product_id;

-- right join or right outer join
SELECT user_name, price, brand, category
FROM users
         RIGHT JOIN product_info ON users.product_id = product_info.product_id;

SELECT user_name, price, brand, category
FROM users
         RIGHT OUTER JOIN product_info ON users.product_id = product_info.product_id;

-- full join or full outer join
SELECT user_name, price, brand
FROM users
         FULL JOIN product_info ON product_info.product_id = users.product_id;

SELECT user_name, price, brand
FROM users
         FULL OUTER JOIN product_info ON product_info.product_id = users.product_id;

SELECT user_name, brand, category
FROM users
         FULL JOIN product_info ON users.id = product_info.product_id;
-- no common record

-- cross join
SELECT id, brand, category
FROM users
         CROSS JOIN product_info;