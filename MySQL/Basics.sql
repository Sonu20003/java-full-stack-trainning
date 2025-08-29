SELECT VERSION();

SELECT NOW() AS "Date-time", CURRENT_DATE AS "Current date";

SELECT SIN(PI()/4), (4+5)*5, 10+20;

SHOW TABLES;

SELECT USER() AS "User", CURTIME() AS "Time";

INSERT INTO employees VALUES (1001, "Eugene", "Crabs", "Owner", "crabs@bikiniBeach.com"),
									(1002, "Spongebob", "Squarepant", "Chef", "SBob@bikiniBeach.com"),
									(1003, "Partick", "Star", "Chef", "starPat@bikiniBeach.com"),
									(1004, "Sandy", "Squaril", "Manager", "sandySq@bikiniBeach.com");

SELECT * FROM employees;

DELETE FROM employees WHERE First_name = "Sonu";


CREATE TABLE cars (id INT PRIMARY KEY AUTO_INCREMENT, NAME VARCHAR(255), price INTEGER);

INSERT INTO cars (NAME, price) VALUES ('Audi', 52642);
INSERT INTO cars (NAME, price) VALUES ('Mercedes', 57212);
INSERT INTO cars (NAME, price) VALUES ('Skoda', 90000);
INSERT INTO cars (NAME, price) VALUES ('Volva', 350000);
INSERT INTO cars (NAME, price) VALUES ('Bentley', 210000);
INSERT INTO cars (NAME, price) VALUES ('Citroen', 46783);
INSERT INTO cars (NAME, price) VALUES ('Hummer', 64532);
INSERT INTO cars (NAME, price) VALUES ('Volkswagen', 216000);
INSERT INTO cars (NAME, price) VALUES ('Tata', 150038);


SELECT * FROM cars;
