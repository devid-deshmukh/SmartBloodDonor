# 🩸 Smart Blood Donation & Patient Matching Portal

## 💡 Project Overview

This is a modern, full-stack blood bank management portal designed for hospitals and administrators to efficiently manage blood inventory, connect patients with available donors, and handle urgent requests.

The key innovation is the **Smart Donor-Patient Matching Algorithm** which uses blood group, proximity (city/pincode), and donor availability to find the best match quickly.

### Key Features
* **Smart Matching:** Filters donors by blood group, geographic proximity, and last donation date.
* **SOS Broadcast System:** Allows hospital admins to trigger urgent blood requests which are simulated to be sent via queued SMS/Email (see logs for output).
* **Digital Donor Card:** Generates a downloadable, QR-coded PDF card upon donor registration.
* **Inventory Management:** Tracks units by type and expiry date, issuing **Low Stock** and **Expiry Warnings**.
* **Role-Based Access:** Separate dashboards for **ADMIN**, **HOSPITAL**, and **DONOR**.

---

## 💻 Technology Stack

| Component | Technology | Description |
| :--- | :--- | :--- |
| **Backend/API** | **Java 17 (Spring Boot)** | Handles all business logic, security (JWT), and database interaction (JPA). |
| **Database** | **MySQL 8.0** | Relational database used for persistent storage of all profiles, inventory, and requests. |
| **Frontend/UI** | **React (Create React App)** | Modern single-page application (SPA) providing the user interface. |
| **Security** | **JSON Web Tokens (JWT)** | Used for secure, stateless authentication and authorization. |

---

## 🛠️ Local Setup and Run Instructions

Follow these steps to set up and run the application on your local machine.

### Prerequisites
* **Java 17** or higher
* **Maven** (for the backend)
* **Node.js & npm** (for the frontend)
* **MySQL Server** (Running locally on default port 3306 or via Docker)

### Step 1: Database Setup

1.  Start your local MySQL server.
2.  Open your MySQL Workbench or command line client.
3.  Create the database:
    ```sql
    CREATE DATABASE smartblooddb;
    ```
4.  **Import Schema:** Execute the commands found in `sql/schema.sql` (containing all `CREATE TABLE` and sample `INSERT` statements) against the new `smartblooddb`.

### Step 2: Backend (Spring Boot) Setup

1.  Navigate to the project root directory (`SmartBloodDonor`).
2.  Open the `src/main/resources/application.properties` file and update your database credentials:
    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/smartblooddb
    spring.datasource.username=YOUR_MYSQL_USER
    spring.datasource.password=YOUR_MYSQL_PASSWORD
    # Set a secret key for JWT signing
    jwt.secret=your_strong_secret_key_here
    ```
3.  Build the project using Maven:
    ```bash
    mvn clean install
    ```
4.  Run the application (it will start on **http://localhost:8080**):
    ```bash
    java -jar target/smart-blood-0.0.1-SNAPSHOT.jar
    # OR run directly from IntelliJ IDEA
    ```

### Step 3: Frontend (React) Setup

1.  Navigate to the frontend directory:
    ```bash
    cd frontend
    ```
2.  Install dependencies:
    ```bash
    npm install
    ```
3.  Start the React development server (it will open at **http://localhost:3000**):
    ```bash
    npm start
    ```

---

## 🧪 Demonstration Steps 



1.  **Server Startup:** IntelliJ console output confirming the server started successfully on port 8080.
2.  **Hospital Login:** Log in as a Hospital user.
3.  **Create Urgent Request:** Navigate to the "Hospital Request" form and submit a CRITICAL request for a rare blood type (e.g., O-). *(This demonstrates Input/Output)*
4.  **Check Logs:** Show the backend console/log output confirming the **SOS Broadcast Stub** triggered SMS/Email notifications to matched donors.
5.  **Donor Matching:** Show the **Matching Donor List** screen, emphasizing how the algorithm prioritized donors based on proximity and last donation date.
6.  **Inventory Alerts:** Navigate to the **Inventory Dashboard** and show the section displaying the **LOW STOCK ALERT** and **EXPIRY WARNING** warnings.

---

## 👤 Team & Contact

* **Developed by:** [Devid Deshmukh]
* **Contact:** [23071230@ycce.in]
