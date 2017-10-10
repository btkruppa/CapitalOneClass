set schema 'chinook';

--2.1
select * from "Employee";
select * from "Employee" where "LastName" = 'King';
select * from "Employee" where "FirstName" = 'Andrew' and "ReportsTo" is null;

---2.2
select * from "Album" order by "Title";
select "FirstName" from "Customer" order by "City" asc; 

--2.3
INSERT INTO "Genre" ("GenreId", "Name") VALUES
(26, 'Funk'),
(27, 'Country');

INSERT INTO "Employee" ("EmployeeId", "LastName", "FirstName", "Title", "ReportsTo", "BirthDate", "HireDate", "Address", "City", "State", "Country", "PostalCode", "Phone", "Fax", "Email") VALUES
(9, 'Mark', 'Jones', 'IT Staff',6,'1972/4/9', '2004/4/4', '253 W Main St', 'Waverly', 'IA', 'USA', '23443', '804-543-6533', '804-982-3334', 'mark.chinookcorp.com'),
(10, 'LeBron', 'James','IT Staff', 6,'1984/3/9', '2001/2/4', '423 Withering Pines Cir', 'Independence', 'OH', 'USA', '39013', '324-923-0432', '324-844-0908', 'lebron@chinookcorp.com');

INSERT INTO "Customer" ("CustomerId", "FirstName", "LastName", "Company", "Address", "City", "State", "Country", "PostalCode", "Phone", "Fax", "Email", "SupportRepId") VALUES 
(60, 'Lois', 'Burke', null, '426 Pine St', 'Mobile', 'AL', 'USA', '29455', '211-987-0122', '211-090-4387', 'loisburke@yahoo.com', 5);
(61, 'Doris', 'Donaldson', null, '922 Orchard St', 'St. Louis', 'MO', 'USA', '64909', '211-987-0122', '211-390-4387', 'tripled@gmail.com', 5);

--2.4
UPDATE "Customer"
SET "FirstName"= 'Robert',"LastName"='Walter'
WHERE "FirstName"= 'Aaron'  AND  "LastName"='Mitchell';

UPDATE "Artist" 
SET "Name" = 'CCR'
WHERE "Name" = 'Creedence Clearwater Revival';

--2.5
SELECT * FROM "Invoice" WHERE "BillingAddress" LIKE 'T%';

--2.6 BETWEEN
SELECT * FROM "Invoice" WHERE "Total" > 15 AND "Total" < 50;

SELECT * FROM "Employee" WHERE "HireDate"> '2003/6/1'  and "HireDate"< '2004/3/1' ;

--2.7 DELETE
--FIRST DELETE CUSTOMER RECORD FROM INVOICE LINE TABLE TO RESOLVE FOREIGN KEY CONSTRAINT IN INVOICE LINE Table
DELETE FROM "InvoiceLine" where "InvoiceId" IN (
select "InvoiceId" FROM "Invoice" where "CustomerId" IN (select "CustomerId" from "Customer" where "FirstName" = 'Robert' and "LastName" = 'Walter'));

-- NOW REMOVE INVOICE RECORDS FROM INVOICE TABLE FOR THE CUSTOMER
DELETE FROM "Invoice" where "CustomerId" IN (select "CustomerId" from "Customer" where "FirstName" = 'Robert' and "LastName" = 'Walter');

--FINALLY DELETE RECORD FROM CUSTOMER TABLE 
DELETE FROM "Customer" where "FirstName" = 'Robert' and "LastName" = 'Walter';

-- Alternatively we could have drop key contraints


--7.1 INNER
SELECT "Customer"."FirstName", "Customer"."LastName", "Invoice"."InvoiceId"
	FROM "Customer", "Invoice" where "Customer"."CustomerId" = "Invoice"."CustomerId";

--7.2 OUTER
SELECT a."CustomerId", a."FirstName", a."LastName", b."InvoiceId", b."Total" 
	FROM "Customer" AS a FULL OUTER JOIN "Invoice" as b ON a."CustomerId"=b."CustomerId";

--7.3 RIGHT
SELECT a."Name", b."Title" FROM "Album" AS a RIGHT JOIN "Artist" AS b ON a."ArtistId"=b."ArtistId";

--7.4 CROSS
SELECT * FROM  "Artist" AS a CROSS JOIN "Album" AS b ORDER BY a."Name" asc;

--7.5 SELF
SELECT * FROM "Employee" a JOIN "Employee" b ON a."ReportsTo" = b."ReportsTo";

--8.1 Clustered Indexes
CREATE INDEX idx_name ON "Customer"("FirstName","LastName");

