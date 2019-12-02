# siegen_spring_boot_demo
Demo for basic example of Spring boot web service

Install Mysql

change user and password based on your MYSQL in the spring-boot-first-web-application/src/main/resources/application.properties

Create Table: 

CREATE TABLE cus_tbl(  
   id INT NOT NULL AUTO_INCREMENT,  
   user VARCHAR(100) NOT NULL,  
   descr VARCHAR(100) NOT NULL
);

Insert Data in the table: 

INSERT INTO Todoo (id, user, descr) value (1, "faisal", "Learn Spring MVC");
