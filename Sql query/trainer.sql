MySQL UPDATE Query

create table trainer(id int auto_increment not null, email varchar(50), course_name varchar(20), primary
key)
This query will update the email id of Java course 

UPDATE trainer
SET email = 'mike@tutorialandexamples.com'
WHERE course_name = 'Java';

then verify it.

SELECT * FROM trainer;