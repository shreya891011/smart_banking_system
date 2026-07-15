# 🏦 Smart Banking System

A secure **Java-based Smart Banking System** developed using **Java, JSP, Servlets, JDBC, MySQL, HTML, CSS, and JavaScript**. The application allows users to register, log in securely, manage their bank accounts, perform transactions, and view transaction history through a simple and user-friendly web interface.

---

## 🚀 Features

### 👤 User Authentication
- User Registration
- Secure Login
- Logout
- Session Management
- Login restricted after **3 incorrect PIN/Password attempts**
- Automatic account locking after 3 failed login attempts

### 💳 Account Management
- Create New Bank Account
- Generate Unique Account Number
- View Customer Details
- Check Account Balance

### 💰 Banking Operations
- Deposit Money
- Withdraw Money
- Transfer Money Between Accounts
- Real-time Balance Update

### 📜 Transaction Management
- Transaction History
- Date & Time of Transactions
- Deposit Records
- Withdrawal Records
- Transfer Records

### ⚠️ Exception Handling
- Invalid Login Credentials
- Insufficient Balance
- Account Lock Protection
- Invalid Transaction Handling
- Database Exception Handling

---

# 🛠️ Tech Stack

## Frontend
- HTML5
- CSS3
- JavaScript
- JSP

## Backend
- Java
- Servlets
- JDBC

## Database
- MySQL

## Tools
- NetBeans IDE 8.0
- Apache Tomcat
- MySQL Workbench
- Git & GitHub

---

# 📂 Project Structure

```
SmartBankingSystem
│
├── Web Pages
│   ├── dashboard.jsp
│   ├── deposit.jsp
│   ├── history.jsp
│   ├── index.html
│   ├── login.jsp
│   ├── register.jsp
│   ├── transfer.jsp
│   ├── withdraw.jsp
│   ├── css/
│   └── js/
│
├── Source Packages
│
├── dao
│   ├── CustomerDAO.java
│   └── TransactionDAO.java
│
├── database
│   ├── DBConnection.java
│   └── TestConnection.java
│
├── model
│   ├── Customer.java
│   ├── BankAccount.java
│   ├── SavingsAccount.java
│   └── CurrentAccount.java
│
└── servlet
    ├── LoginServlet.java
    ├── RegisterServlet.java
    ├── DepositServlet.java
    ├── WithdrawServlet.java
    ├── TransferServlet.java
    └── LogoutServlet.java
```

---

# 🗄️ Database

### Database Name

```
bankdb
```

---

## Customers Table

| Column | Data Type |
|---------|-----------|
| id | INT |
| account_no | VARCHAR(20) |
| name | VARCHAR(100) |
| email | VARCHAR(100) |
| phone | VARCHAR(15) |
| address | VARCHAR(255) |
| password | VARCHAR(100) |
| account_type | VARCHAR(20) |
| balance | DOUBLE |
| failed_attempts | INT |
| account_status | VARCHAR(20) |
| created_at | TIMESTAMP |

---

## Transactions Table

| Column | Data Type |
|---------|-----------|
| id | INT |
| account_no | VARCHAR(20) |
| transaction_type | VARCHAR(20) |
| amount | DOUBLE |
| balance_after | DOUBLE |
| transaction_date | TIMESTAMP |

---

# 🔒 Security Features

- User Authentication
- Session Management
- JDBC Prepared Statements
- Login Lock after 3 Incorrect PIN Attempts
- Failed Login Attempt Tracking
- SQL Injection Prevention
- Exception Handling

---

# 🎯 Object-Oriented Programming Concepts

✔ Classes & Objects

✔ Encapsulation

✔ Inheritance

✔ Constructors

✔ Method Overriding

✔ Exception Handling

✔ Packages

✔ JDBC Connectivity

---

# 🔄 System Workflow

```
User Registration
        │
        ▼
Login
        │
        ▼
Dashboard
        │
 ┌──────┼────────┐
 │      │        │
 ▼      ▼        ▼
Deposit Withdraw Transfer
        │
        ▼
Update Balance
        │
        ▼
Transaction History
        │
        ▼
Logout
```

---

# 💡 Future Enhancements

- Admin Dashboard
- Unlock Locked Accounts
- Forgot Password
- Email Notifications
- OTP Verification
- Interest Calculation
- Mini Statement Download
- PDF Reports
- Mobile Responsive Design
- Password Encryption using BCrypt

---

# 📚 Learning Outcomes

This project enhanced my understanding of:

- Java Programming
- Object-Oriented Programming (OOP)
- JSP & Servlets
- JDBC Connectivity
- MySQL Database
- CRUD Operations
- Session Management
- Banking Transaction Logic
- Exception Handling
- MVC Architecture
- Frontend & Backend Integration

---

# 👩‍💻 Author

**Shreya Lathi**

Computer Science Engineering Student

---

## ⭐ Support

If you found this project useful, consider giving it a ⭐ on GitHub.
