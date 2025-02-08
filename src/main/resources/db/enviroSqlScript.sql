CREATE DATABASE IF NOT EXISTS enviro365_db;
USE enviro365_db;

-- Waste category table
CREATE TABLE IF NOT EXISTS waste_category (
    id INT PRIMARY KEY AUTO_INCREMENT,
    category_name VARCHAR(100) NOT NULL UNIQUE,
    description VARCHAR(1000) NOT NULL,
    common_examples VARCHAR(1000)

);

-- Disposal guidelines table
CREATE TABLE IF NOT EXISTS disposal_guidelines (
    id INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(200) NOT NULL,
    description VARCHAR(1000) NOT NULL,
    waste_category_id INT NOT NULL,
    instructions VARCHAR(1000) NOT NULL,

);

--  Recycling tips table
CREATE TABLE IF NOT EXISTS recycling_tips (
    id INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(200) NOT NULL UNIQUE,
    description VARCHAR(1000) NOT NULL,
    waste_category_id INT NOT NULL,
    environmental_impact_rating VARCHAR(255) NOT NULL,
);