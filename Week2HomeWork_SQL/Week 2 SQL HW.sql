set schema 'chinook';
--2.1 SELECT
--Task – Select all records from the Employee table

SELECT * FROM "Employee";

--Task – Select all records from the Employee table where last name is King.

SELECT * FROM "Employee"  WHERE "LastName" = 'King';

--Task – Select all records from the Employee table where first name is Andrew and REPORTSTO is NULL.

SELECT * FROM "Employee"  WHERE "FirstName" = 'Andrew' and "ReportsTo" IS NULL;

--2.2 ORDER BY
--Task – Select all albums in Album table and sort result set in descending order by title.

SELECT * FROM "Album" ORDER BY "Title" desc;

--Task – Select first name from Customer and sort result set in ascending order by city

SELECT "FirstName" FROM "Customer" order BY "City" asc

--2.3 INSERT INTO
--Task – Insert two new records into Genre table

INSERT INTO "Genre" ("GenreId", "Name") VALUES
(26, 'folk'),
(27, 'bluegrass');

--Task – Insert two new records into Employee table

INSERT INTO "Employee" ("EmployeeId", "LastName", "FirstName", "Title", "ReportsTo", "BirthDate", "HireDate", "Address", "City", "State", "Country", "PostalCode", "Phone", "Fax", "Email") VALUES
(9, 'Islam', 'Imrana', 'Vice President',1,'1940/10/7', '2005/8/14', '15000 Capital One Drive', 'Richmond', 'VA', 'USA', '23238', '+1 (804) 284-9482', '+1 (804) 428-3457', 'iislam@chinookcorp.com'),
(10, 'Wonder', 'Woman','President', 1,'1910/10/7', '2005/8/14', '15000 Capital One Drive', 'Richmond', 'VA', 'USA', '23238', '+1 (804) 284-7777', '+1 (804) 428-7777', 'wwoman@chinookcorp.com');

--Task – Insert two new records into Customer table

INSERT INTO "Customer" ("CustomerId", "FirstName", "LastName", "Company", "Address", "City", "State", "Country", "PostalCode", "Phone", "Fax", "Email", "SupportRepId") VALUES 
(60, N'Imrana', N'Islam', N'Apple Inc.', N'1 Infinite Loop', N'Cupertino', N'CA', N'USA', N'95014', N'+1 (408) 996-7777', N'+1 (408) 996-4444', N'iislam@apple.com', 3);
(61, N'Nusaira', N'Ferdous', N'Apple Inc.', N'1 Infinite Loop', N'Cupertino', N'CA', N'USA', N'95014', N'+1 (408) 222-7777', N'+1 (408) 999-4444', N'nferdous@apple.com', 3);


--2.4 UPDATE
--Task – Update Aaron Mitchell in Customer table to Robert Walter

UPDATE "Customer"
SET "FirstName"= 'Robert' ,"LastName"='Walter'
WHERE "FirstName"= 'Aaron'  AND  "LastName"='Mitchell';

--Task – Update name of artist in the Artist table “Creedence Clearwater Revival” to “CCR”

UPDATE "Artist" 
SET "Name" = 'CCR'
WHERE "Name" = 'Creedence Clearwater Revival';

--2.5 LIKE
--Task – Select all invoices with a billing address like “T%”

SELECT * FROM "Invoice" WHERE "BillingAddress" LIKE 'T%';

--2.6 BETWEEN
--Task – Select all invoices that have a total between 15 and 50

SELECT * FROM "Invoice" WHERE "Total">15  AND "Total"<50;

--Task – Select all employees hired between 1st of June 2003 and 1st of March 2004

SELECT * FROM "Employee" WHERE "HireDate"> '2003/6/1'  and "HireDate"< '2004/3/1' ;

--2.7 DELETE
--Task – Delete a record in Customer table where the name is Robert Walter (There may be constraints that rely on this, find out how to resolve them).

ALTER TABLE "Invoice"	
	DROP CONSTRAINT "FK_InvoiceCustomerId",
	ADD CONSTRAINT "FK_InvoiceCustomerId" FOREIGN KEY ("CustomerId") REFERENCES "Customer"("CustomerId")
	ON DELETE CASCADE;

ALTER TABLE "InvoiceLine"
	DROP CONSTRAINT "FK_InvoiceLineInvoiceId",
	ADD CONSTRAINT "FK_InvoiceLineInvoiceId" FOREIGN KEY ("InvoiceId") REFERENCES "Invoice" ("InvoiceId")
	ON DELETE CASCADE;	

DELETE FROM "Customer" WHERE "FirstName" = 'Robert'  and "LastName" = 'Walter';	

--7.0 JOINS
--In this section you will be working with combing various tables through the use of joins. You will work with outer, inner, right, left, cross, and self joins.
--7.1 INNER
--Task – Create an inner join that joins customers and orders and specifies the name of the customer and the invoiceId.

SELECT cust."CustomerId", inv."InvoiceId" 
	FROM "Customer" AS cust JOIN "Invoice" as inv ON (cust."CustomerId"=inv."CustomerId");

--7.2 OUTER
--Task – Create an outer join that joins the customer and invoice table, specifying the CustomerId, firstname, lastname, invoiceId, and total.

SELECT cust."CustomerId", cust."FirstName", cust."LastName", inv."InvoiceId", inv."Total" 
	FROM "Customer" AS cust FULL OUTER JOIN "Invoice" as inv ON cust."CustomerId"=inv."CustomerId";

--7.3 RIGHT
--Task – Create a right join that joins album and artist specifying artist name and title.

SELECT art."Name", alb."Title" FROM "Album" AS alb RIGHT JOIN "Artist" AS art ON alb."ArtistId"=art."ArtistId";

--7.4 CROSS
--Task – Create a cross join that joins album and artist and sorts by artist name in ascending order.

SELECT * FROM  "Artist" AS art CROSS JOIN "Album" AS alb ORDER BY art."Name" asc;

--7.5 SELF
--Task – Perform a self-join on the employee table, joining on the reportsto column.

SELECT * FROM "Employee" a JOIN "Employee" b ON a."ReportsTo" = b."ReportsTo";

--8.0 Indexes
--In this section you will be creating Indexes on various tables. Indexes can speed up performance of reading data.
--8.1 Clustered Indexes
--Task – Create a clustered index on of table of your choice

CREATE INDEX idx_name ON "Customer"("FirstName","LastName");




