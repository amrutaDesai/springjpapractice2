create database db_example;
show databases;
create user 'springuser'@'localhost' identified by 'ThePassword';
grant all on db_example.* to 'springuser'@'localhost';

select now();

SHOW Tables;

select * from course;
select * from topic