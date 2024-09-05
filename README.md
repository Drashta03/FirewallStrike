# Firewall Strike

A robust Java-based Web Application Firewall (WAF) testing tool designed to identify security vulnerabilities and assess the effectiveness of WAFs.

## Overview

**Firewall Strike** is a tool for penetration testers and security analysts to simulate attacks and evaluate the security of web applications protected by WAFs. This tool allows users to log and analyze security events triggered by potential exploits.

## Components

- **`FirewallStrike.java`**: Main file to run the tool.
- **`LogViewer.java`**: (Optional) Provides a simple UI to view logs.

## Prerequisites

- Java 8 or higher
- MySQL database
- MySQL Connector JAR (`mysql-connector-java-x.x.x.jar`)

## Setup

1. **Database Setup**:
   - Create a MySQL database and table using the following SQL commands:
     ```sql
     CREATE DATABASE firewall_strike_db;

     USE firewall_strike_db;

     CREATE TABLE events (
         id INT AUTO_INCREMENT PRIMARY KEY,
         timestamp DATETIME NOT NULL,
         event_description VARCHAR(255) NOT NULL
     );
     ```

2. **Download MySQL Connector**:
   - Download the MySQL Connector JAR from [MySQL's official website](https://dev.mysql.com/downloads/connector/j/).
   - Add the JAR to your Java project's build path.

3. **Update Configuration**:
   - Replace placeholders in `FirewallStrike.java` with your MySQL database credentials and URL.

## Installation

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/yourusername/FirewallStrike.git
   cd FirewallStrike
