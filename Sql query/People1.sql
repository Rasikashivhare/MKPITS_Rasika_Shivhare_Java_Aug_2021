create a table "People"

CREATE TABLE People(id int NOT NULL AUTO_INCREMENT,
name varchar(45) NOT NULL,
occupation varchar(35) NOT NULL,
age int,
PRIMARY KEY (id)
);

 for multiple records, 

INSERT INTO People VALUES
(102, 'Joseph', 'Developer', 30),
(103, 'Mike', 'Leader', 28),
(104, 'Stephen', 'Scientist', 45);

the below syntax is used to show the records

mysql> SELECT * FROM People;