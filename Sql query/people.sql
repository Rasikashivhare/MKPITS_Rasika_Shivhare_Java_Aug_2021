write a query to create a table people

CREATE TABLE People(id int NOT NULL AUTO_INCREMENT,
name varchar(45) NOT NULL,
occupation varchar(35) NOT NULL,
age int,
PRIMARY KEY (id)
);

1. If we want to store single records for all fields,

INSERT INTO People (id, name, occupation, age)
VALUES (101, 'Peter', 'Engineer', 32);