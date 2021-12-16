HANDLING DUPLICATES IN MYSQL

The following example does not error out and at the same time it will not insert duplicate records as well.
INSERT IGNORE INTO PERSON_TBL(LAST_NAME,FIRST_NAME) VALUES('JAY','THOMAS');

INSERT IGNORE INTO PERSON_TBL(LAST_NAME,FIRST_NAME) VALUES('JAY','THOMAS');//THE DUPLICATE DATA IS NOT ALLOWED IN THIS TABLE.
If the record is a duplicate, then the IGNORE keyword tells MySQL to discard it silently without generating an error.

//2.Use the REPLACE command rather than the INSERT command. If the record is new, it is inserted just as with INSERT. If it is a duplicate, 
the new record replaces the old one.

REPLACE INTO PERSON_TBL(LAST_NAME,FIRST_NAME) VALUES('AJAY','KUMAR');

REPLACE INTO PERSON_TBL(LAST_NAME,FIRST_NAME) VALUES('AJAY','KUMAR');//it is a duplicate,the new record replaces the old one.

//3.Query to count duplicate records with first_name and last_name in a table.
SELECT COUNT(*) AS REPITITIONS,LAST_NAME,FIRST_NAME 
FROM PERSON_TBL 
GROUP BY LAST_NAME,FIRST_NAME
HAVING REPITITIONS>1;

//4.You can use the DISTINCT command along with the SELECT statement to find out unique records available in a table.
SELECT DISTINCT LAST_NAME,FIRST_NAME
FROM PERSON_TBL 
ORDER BY LAST_NAME;

                                         OR
//5.An alternative to the DISTINCT command is to add a GROUP BY clause that names the columns you are selecting. This has the effect of removing 
duplicates and selecting only the unique combinations of values in the specified columns.
SELECT LAST_NAME,FIRST_NAME
FROM PERSON_TBL 
GROUP BY(LAST_NAME,FIRST_NAME);

//6.If you have duplicate records in a table and you want to remove all the duplicate records from that table, then follow the procedure 
given below.

CREATE TABLE TEMP SELECT LAST_NAME,FIRST_NAME,GENDER
FROM PERSON_TBL;

DROP TABLE PERSON_TBL;
ALTER TABLE TEMP RENAME TO PERSON_TBL;