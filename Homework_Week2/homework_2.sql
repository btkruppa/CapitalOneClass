
Select * From chinook."Employee";

Select * from chinook."Employee" where "LastName" = 'King';

Select * from chinook."Employee" where "FirstName" = 'Andrew' and "ReportsTo" is Null;

Select * from chinook."Album" ORDER BY "Title" DESC;

Select * from chinook."Customer" ORDER BY "City" ASC;

INSERT INTO chinook."Genre" ("GenreId", "Name") VALUES (60, 'Country');

INSERT INTO chinook."Genre" ("GenreId", "Name") VALUES (55, 'Bollywood');


INSERT INTO chinook."Employee" ("EmployeeId", "LastName", "FirstName", "Title", 
"ReportsTo", "BirthDate", "HireDate", "Address", "City", "State", "Country", 
"PostalCode", "Phone", "Fax", "Email") 
VALUES (345678, 'Smith', 'Kevin', 'Accountant', null, 
'1962-02-18 00:00:00', '1990-08-18 00:00:00', 'Ridgewood Terrace', 
'Glen Allen', 'VA', 'US', 23060, 555-555-5555, 
777-777-7777, 'email@company123.com');


INSERT INTO chinook."Employee" ("EmployeeId", "LastName", "FirstName", "Title", 
"ReportsTo", "BirthDate", "HireDate", "Address", "City", "State", "Country", 
"PostalCode", "Phone", "Fax", "Email") 
VALUES (234567, 'Harris', 'Mari', 'Customer Services', null, 
'1980-01-10 00:00:00', '2005-07-01 00:00:00', 'Westbriar Drive', 
'Richmond', 'VA', 'US', 23238, 888-222-3333, 
999-999-999, 'email@company123.com');

INSERT INTO chinook."Customer" ("CustomerId", "FirstName", "LastName", "Company", 
"Address", "City", "State", "Country", "PostalCode", "Phone", "Fax", "Email", "SupportRepId") 
VALUES (111111, 'Jake', 'Atkins', 'CompanyABC', 'Palace Court', 
'Richmond', 'VA', 'US', 
'23238', 888-999-7777, 111-111-1111,'email@companyabc.com', 234567);

INSERT INTO chinook."Customer" ("CustomerId", "FirstName", "LastName", "Company", 
"Address", "City", "State", "Country", "PostalCode", "Phone", "Fax", "Email", "SupportRepId") 
VALUES (34567890, 'Maggie', 'Smith', 'Company456', 'Semmes Ave', 
'Richmond', 'VA', 'US', 
'23238', 111-333-8888, 222-222-4444,'email@company456.com', 234567);

UPDATE chinook."Customer" SET "LastName" = 'Walter' WHERE "FirstName" = 'Aaron' 
AND "LastName" = 'Mitchell' ;

UPDATE chinook."Customer" SET "FirstName" = 'Robert' WHERE "FirstName" = 'Aaron' 
AND "LastName" = 'Mitchell' ;

UPDATE chinook."Artist" SET "Name" = 'CCR' WHERE "Name" = 'Creedence Clearwater Revival';

Select * From chinook."Invoice" where "BillingAddress" like 'T%';

Select * From chinook."Invoice" where "Total" Between 15 and 40;

Select * From chinook."Employee" where "HireDate" Between '2003-06-01 00:00:00' 
and '2004-03-01 00:00:00';

Delete From chinook."Customer" where "FirstName" = 'Robert' And "LastName" = 'Walter';

Select cust."FirstName", cust."LastName", inv."InvoiceId"
From chinook."Customer" cust
Inner join chinook."Invoice" inv on inv."CustomerId" = cust."CustomerId"

Select cust."FirstName", cust."LastName", inv."InvoiceId", inv."Total", cust."CustomerId"
From chinook."Customer" cust
Left outer join chinook."Invoice" inv on inv."CustomerId" = cust."CustomerId"

Select art."Name", alb."Title"
From chinook."Artist" art
Right join chinook."Album" alb on art."ArtistId" = alb."ArtistId"


Select *
From chinook."Album" alb
Cross join chinook."Artist" art order by art."Name" asc 

Select e1."ReportsTo", e2."EmployeeId"
From chinook."Employee" e1
Inner join chinook."Employee" e2 on e1."EmployeeId" = e2."ReportsTo";

CREATE INDEX album_index
ON chinook."Album" ("Title");






































