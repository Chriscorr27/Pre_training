SHOW DATABASES;
CREATE DATABASE ISS;
USE ISS;
SHOW TABLES;
CREATE TABLE USER(
user_name varchar(255) NOT NULL UNIQUE,
name varchar(255),
gender varchar(255),
password varchar(255),
PRIMARY KEY (user_name)
);
DESCRIBE user;  
INSERT INTO user
VALUES ("chris27", "chris correia", "male", "pass123");
INSERT INTO user
VALUES ("ryan12", "ryan correia", "male", "ryan123");
INSERT INTO user
VALUES ("sajol12", "sajol rebello", "male", "sajol123");
INSERT INTO user
VALUES ("sania27", "sania correia", "female", "sania123");
select * from user; 
select name,gender from user
where user_name='chris27' and password='pass123';
update user
set name='chris'
where user_name='chris27';
select name,gender from user
where user_name='chris27' and password='pass123';
delete from user 
where user_name='sania27';
select * from user;