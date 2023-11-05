CREATE DATABASE IF NOT EXISTS users;
USE users;

CREATE TABLE IF NOT EXISTS User (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL
);

INSERT INTO User (username, email) VALUES
    ('User1', 'user1@example.com'),
    ('User2', 'user2@example.com'),
    ('User3', 'user3@example.com'),
    ('User4', 'user4@example.com'),
    ('User5', 'user5@example.com'),
    ('User6', 'user6@example.com'),
    ('User7', 'user7@example.com'),
    ('User8', 'user8@example.com'),
    ('User9', 'user9@example.com'),
    ('User10', 'user10@example.com');

select * from user;