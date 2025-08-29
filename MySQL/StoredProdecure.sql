#Stored Procedure

/*A stored procedure is a set of Structured Query Language (SQL) statements with an 
assigned name, which are stored in a relational database management system (RDBMS) 
as a group, so it can be reused and shared by multiple programs.

Stored procedures can access or modify data in a database, but it is not tied to a 
specific database or object, which offers a number of advantages.
*/

-- Normally Queries are not saved
-- If you want to save any query on the database server for execution later, one way 
-- to do it is to use a stored procedure.

USE classicmodels;

SELECT 
    customerName, 
    city, 
    state, 
    postalCode, 
    country
FROM
    customers
ORDER BY customerName;

/*The following CREATE PROCEDURE statement creates a new stored procedure that 
 wraps the query above: */

-- Create Stored Procedure


delimiter $$

CREATE PROCEDURE getMyCustomers() 
BEGIN

SELECT 
    customerName, 
    city, 
    state, 
    postalCode, 
    country
FROM
    customers
ORDER BY customerName;

END $$

delimiter ;


-- Invoke stored procedure

CALL getMyCustomers();

SELECT *  FROM employees;
SELECT * FROM offices;


SELECT e.employeeNumber,CONCAT(lastName,' ',firstName),
		email, jobTitle, ofc.city,ofc.country
		 FROM employees e 
			INNER JOIN offices ofc
			ON e.officeCode=ofc.officeCode;
			

delimiter $$
CREATE PROCEDURE getMyEmployees() 
BEGIN

SELECT e.employeeNumber,CONCAT(lastName,' ',firstName),
		email, jobTitle, ofc.city,ofc.country
		FROM employees e 
		INNER JOIN offices ofc
		ON e.officeCode=ofc.officeCode;

END $$
delimiter ;

getMyCustomers();


-- 
/* IN parameters
IN is the default mode. When you define an IN parameter in a stored procedure, 
the calling program has to pass an argument to the stored procedure.*/

-- stored procedure that finds all offices that locate in a country 
-- specified by the input parameter countryName:

delimiter //
CREATE PROCEDURE getOfficeByCountry1(IN counterName VARCHAR(255)) 
BEGIN

SELECT * FROM offices WHERE country = countryName;

END //
delimiter ;

CALL getOfficeByCountry1('France');



/*OUT parameters
The value of an OUT parameter can be changed inside the stored procedure 
and its new value is passed back to the calling program.

Notice that the stored procedure cannot access the initial value of the 
OUT parameter when it starts.*/

-- stored procedure returns the number of orders by order status.

delimiter $$
CREATE PROCEDURE GetOrderCountByStatus (
	IN orderStatus VARCHAR(25),
	OUT total INT
)
BEGIN
	SELECT COUNT(orderNumber)
	INTO total
	FROM orders
	WHERE STATUS = orderStatus;
END $$

delimiter ;

SELECT * FROM orders ORDER BY status;

CALL GetOrderCountByStatus('Shipped', @total);
SELECT @total AS TotalShipped;

CALL GetOrderCountByStatus('Cancelled', @total);
SELECT @total AS TotalCancelled;

CALL GetOrderCountByStatus('In Process', @total);
SELECT @total AS InProcess;

CALL GetOrderCountByStatus('Disputed', @total);
SELECT @total AS Dispute;

/*
 The stored procedure SetCounter() accepts one INOUT parameter ( counter ) 
 and one IN parameter ( inc ). 
 It increases the counter ( counter ) by the value specified by the inc parameter.*/
 
delimiter $$
CREATE PROCEDURE setCounter (
	INOUT counter INT,
	IN inc INT
)
BEGIN
	SET counter = counter * inc;
END $$

delimiter ;

SET @counter = 1;
CALL setCounter(@counter, 1); -- 1
SELECT @counter AS num;
CALL setCounter(@counter, 1); -- 1
SELECT @counter AS num; 
CALL setCounter(@counter, 5); -- 5
SELECT @counter AS num; 
CALL setCounter(@counter, 10); -- 50
SELECT @counter AS num; 



-- Listing Stored Procedures

-- Shows all stored procedures in the current MySQL server:
SHOW PROCEDURE STATUS;

-- lists all stored procedures in the sample database classicmodels:
SHOW PROCEDURE STATUS WHERE db = 'classicmodels';