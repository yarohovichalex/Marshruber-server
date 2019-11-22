-- CREATE DATABASE marshuber;
USE marshuber;
DROP TABLE rider;
DROP TABLE driver;
DROP TABLE route;
CREATE TABLE route (id INT AUTO_INCREMENT, name VARCHAR(60), PRIMARY KEY(id));
CREATE TABLE rider (id INT AUTO_INCREMENT, name VARCHAR(60), phone INT, route_id INT, PRIMARY KEY(id), FOREIGN KEY(route_id) REFERENCES route(id));
CREATE TABLE driver (id INT AUTO_INCREMENT, name VARCHAR(60), phone INT, car_number VARCHAR(10), route_id INT, PRIMARY KEY(id), FOREIGN KEY(route_id) REFERENCES route(id));