<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>

<meta charset="UTF-8">

<title>Create Account | Smart Banking System</title>

<link rel="stylesheet" href="css/style.css">

<link rel="stylesheet"
href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css">

<script src="js/validation.js"></script>

</head>

<body>

<div class="navbar">

<div class="logo">

Smart Banking

</div>

<div class="user">

Create Your Account

</div>

</div>

<div class="page">

<div class="card" style="width:650px;">

<h2>Create New Account</h2>

<p>Fill in your details to open a new account.</p>

<form action="RegisterServlet"
method="post"
onsubmit="return validateRegister()">

<div class="two-column">

<div class="form-group">

<label>Full Name</label>

<div class="input-field">

<i class="fa-solid fa-user"></i>

<input
type="text"
name="name"
placeholder="Enter Full Name"
required>

</div>

</div>

<div class="form-group">

<label>Email</label>

<div class="input-field">

<i class="fa-solid fa-envelope"></i>

<input
type="email"
name="email"
placeholder="Enter Email"
required>

</div>

</div>

<div class="form-group">

<label>Phone</label>

<div class="input-field">

<i class="fa-solid fa-phone"></i>

<input
type="text"
name="phone"
placeholder="Enter Phone Number"
required>

</div>

</div>

<div class="form-group">

<label>Account Type</label>

<div class="input-field">

<i class="fa-solid fa-building-columns"></i>

<select name="accountType">

<option>Savings</option>

<option>Current</option>

</select>

</div>

</div>

</div>

<div class="form-group">

<label>Address</label>

<div class="input-field">

<i class="fa-solid fa-location-dot"></i>

<input
type="text"
name="address"
placeholder="Enter Address"
required>

</div>

</div>

<div class="form-group">

<label>Password</label>

<div class="input-field">

<i class="fa-solid fa-lock"></i>

<input
type="password"
id="password"
name="password"
placeholder="Create Password"
required>

</div>

</div>

<div class="form-group">

<label>Initial Deposit</label>

<div class="input-field">

<i class="fa-solid fa-indian-rupee-sign"></i>

<input
type="number"
name="balance"
placeholder="Enter Initial Deposit"
required>

</div>

</div>

<button class="btn">

<i class="fa-solid fa-user-plus"></i>

Create Account

</button>

</form>

<div class="link">

Already have an account?

<a href="login.jsp">

Login

</a>

</div>

</div>

</div>

<footer>

© 2026 Smart Banking System

<br>

Developed by <b>Shreya Lathi</b>

</footer>

</body>

</html>