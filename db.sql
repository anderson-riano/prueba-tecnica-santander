CREATE DATABASE IF NOT EXISTS prueba_tecnica_santander;

USE prueba_tecnica_santander;

CREATE TABLE product (
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    precio INTEGER NOT NULL
);