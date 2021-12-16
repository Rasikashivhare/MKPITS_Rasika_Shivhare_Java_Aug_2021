MYSQL SEQUENCES

//1.The Following query will create table and after that it will insert few rows in this table where it is not required to give record ID because it is 
auto incremented by MySQL
CREATE TABLE INSECT(ID INT UNSIGNED NOT NULL AUTO_INCREMENT,PRIMARY KEY(ID),NAME VARCHAR(30) NOT NULL,
DATE DATE NOT NULL,ORIGIN VARCHAR(30) NOT NULL);

INSERT INTO INSECT(ID,NAME,DATE,ORIGIN) VALUES
(NULL,'HOUSEFLY','2001-09-10','KITCHEN'),
(NULL,'MILLIPEDE','2001-09-10','DRIVEWAY'),
(NULL,'GRASSHOPPER','2001-09-10','FRONT YARD');

//2.The following Query shows how to renumber the id values in the table using this technique.
ALTER TABLE INSECT DROP ID;

ALTER TABLE INSECT ADD ID INT UNSIGNED NOT NULL AUTO_INCREMENT FIRST,
ADD PRIMARY KEY(ID);

//3.The following program is an example which shows how MySQL will start the sequence from 100.
CREATE TABLE INSECT1(ID INT UNSIGNED NOT NULL AUTO_INCREMENT = 100,PRIMARY KEY (ID),NAME VARCHAR(30) NOT NULL,DATE DATE NOT NULL,
ORIGIN VARCHAR(30) NOT NULL);