CREATE DATABASE firewall_strike_db;

USE firewall_strike_db;

CREATE TABLE events (
    id INT AUTO_INCREMENT PRIMARY KEY,
    timestamp DATETIME NOT NULL,
    event_description VARCHAR(255) NOT NULL
);
