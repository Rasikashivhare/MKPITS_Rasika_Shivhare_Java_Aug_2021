MYSQL REGULAR EXPRESSION

Consider we have a table called People and it is having a field called NAME −
//1.Query to find all the NAMES starting with 'st' −

SELECT NAME FROM PEOPLE WHERE NAME REGEXP '^ST';

//2.Query to find records from Employees3 table whose town is starting with 'par'.
SELECT * FROM EMPLOYEES3 WHERE TOWN REGEXP '^PAR';

//3.Query to find those Employeees3 whose name starts with 'b'.
SELECT * FROM EMPLOYEES3 WHERE NAME REGEXP '^B';

//4.Query to find all the names ending with 'ER' −
SELECT PRODNAME FROM ORDERS WHERE PRODNAME REGEXP 'ER$';

//5.Query to find employees3 whose town name ends with 'don'.
SELECT TOWN FROM EMPLOYEES3 WHERE TOWN REGEXP 'DON$';

//6.Query to find employees3 whose name ends with 'ry'.
SELECT NAME FROM EMPLOYEES3 WHERE NAME REGEXP 'RY$';

//7.Query to find all the names, which contain 'ISH' −
SELECT * FROM PERSON_TBL WHERE FIRST_NAME REGEXP 'ISH';

//8.Query to find employee records whose name contains 'ro'.
SELECT * FROM EMPLOYEES3 WHERE NAME REGEXP 'RO';

//9.Query to find employee record whose name starts with 'e' and ends with 'na'.
SELECT * FROM EMPLOYEES3 WHERE NAME REGEXP '^E' AND NAME REGEXP 'NA$';

//10.Query to find all the names starting with a vowel and ending with 'ET' −
SELECT * FROM OFFICERS WHERE OFFICER_NAME REGEXP '^A' OR OFFICER_NAME REGEXP '^E' AND OFFICER_NAME REGEXP 'ET$';

