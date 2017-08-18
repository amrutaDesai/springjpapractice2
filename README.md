# springjpapractice2
Spring boot jpa, mysql, maven


Build and run

Configurations

Open the application.properties file and set configurations as stated in the file.

Prerequisites

Java 8
Maven > 3.0

Database config :-

 create database db_example;
 show databases;
 create user 'springuser'@'localhost' identified by 'ThePassword';
 grant all on db_example.* to 'springuser'@'localhost';

Import as Existing Maven Project and run it as Spring Boot App.

Usage

Run the application and go on http://localhost:8080/

Use the following urls to invoke controllers methods and see the interactions with the database:
I have tried to hit the URLs with POSTMAN tool of chrome,

1) create topic :- Create a new topic
 URL :-   
    http://localhost:8080/addTopics (POST method)
 Header :- 
    content-Type = "application/json"
 Body :-    
    {
        "name": "T1",
        "description": "Topic 1",
        "id": "1"
    }
    
  (Likewise many topics can be added)  

2) Get Topic :- 
 URL :- http://localhost:8080/topics/1

3) Get all topics :-
 URL :- http://localhost:8080/topics

4) Add Course :- 
 URL :-  
    http://localhost:8080/topics/1/courses
 Header :- 
    content-Type = "application/json"
 Body :- 
    {
     "name": "Course 4",
     "description": "Course Des 4",
     "topic": {
     "name": "Topic 1",
     "description": "Topic 1",
     "id": "T1"
     },
     "id": "C4"
     }
 (Likewise many topics can be added)  
 
 5)Get Course Details :- 
 URL :-
    http://localhost:8080/topics/1/courses/C4
    
 6) Update Course :-
  URL :- 
    http://localhost:8080/topics/1/courses/C4
  Header :- 
    content-Type = "application/json"
  Body :- 
     {
            "id": "C2",
            "name": "Course 2 updated",
            "description": "Course Des 2 updated",
            "topic": {
                "id": "1",
                "name": "T1",
                "description": "Topic 1"
            }
        }      
  8) Delete Course :- 
  URL :-
    http://localhost:8080/topics/2/courses/C2
    
  9) Get all courses :- 
  URl :- 
    http://localhost:8080/topics/2/courses
    

                   
