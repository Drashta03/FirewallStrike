# LogFury

**LogFury** is a Java-based event logging system designed to capture and store events in a MySQL database. It provides a robust solution for tracking system errors, user actions, or other significant events, with an optional simple UI for viewing logged events.

## Features

- **Event Logging**: Seamlessly log events into a MySQL database.
- **Simple UI**: (Optional) View and manage logs using a basic user interface.
- **Scalable**: Easily extend or modify to fit specific needs.

## Prerequisites

- **Java**: Version 8 or higher.
- **MySQL**: A running MySQL database instance.
- **MySQL Connector**: Ensure you have the `mysql-connector-java-x.x.x.jar` file added to your project.

## Setup

### Step 1: Database Configuration

Create a MySQL database and table to store the logs.

```sql
CREATE DATABASE event_db;

USE event_db;

CREATE TABLE events (
    id INT AUTO_INCREMENT PRIMARY KEY,
    timestamp DATETIME NOT NULL,
    event_description VARCHAR(255) NOT NULL
);
