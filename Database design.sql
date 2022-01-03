SHOW DATABASES;
CREATE DATABASE booking_system;
USE booking_system;
CREATE TABLE film(
   id INT PRIMARY KEY AUTO_INCREMENT,
   name VARCHAR(45) NOT NULL UNIQUE,
   length_min INT NOT NULL
);
CREATE TABLE customer(
   id INT PRIMARY KEY AUTO_INCREMENT,
   first_name VARCHAR(45),
   last_name VARCHAR(45),
   email VARCHAR(45) NOT NULL UNIQUE
);
CREATE TABLE room(
   id INT PRIMARY KEY AUTO_INCREMENT,
   name VARCHAR(45),
   no_seats INT NOT NULL
);
CREATE TABLE screening(
   id INT PRIMARY KEY AUTO_INCREMENT,
   film_id INT NOT NULL,
   room_id INT NOT NULL,
   start_time DATETIME NOT NULL,
   FOREIGN KEY (film_id) REFERENCES film(id),
   FOREIGN KEY (room_id) REFERENCES room(id)
);
CREATE TABLE seats(
   id INT PRIMARY KEY AUTO_INCREMENT,
   row1 CHAR(1) NOT NULL,
   number INT NOT NULL,
   room_id INT NOT NULL,
   FOREIGN KEY (room_id) REFERENCES room(id)
);
CREATE TABLE booking(
   id INT PRIMARY KEY AUTO_INCREMENT,
   screening_id INT NOT NULL,
   customer_id INT NOT NULL,
   FOREIGN KEY (screening_id) REFERENCES screening(id),
   FOREIGN KEY (customer_id) REFERENCES customer(id)
);
CREATE TABLE reserved_seats(
   id INT PRIMARY KEY AUTO_INCREMENT,
   booking_id INT NOT NULL,
   seat_id INT NOT NULL,
   FOREIGN KEY (booking_id) REFERENCES booking(id),
   FOREIGN KEY (seat_id) REFERENCES seats(id)
);
SHOW TABLES;
SELECT*FROM customer;
DESCRIBE reserved_seats;


