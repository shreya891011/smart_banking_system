<%@page import="model.Customer"%>

<%
Customer customer=(Customer)session.getAttribute("customer");

if(customer==null){

response.sendRedirect("login.jsp");

return;

}
%>

<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">

<title>Dashboard</title>

<link rel="stylesheet" href="css/style.css">

<link rel="stylesheet"
href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css">

</head>

<body>

<div class="navbar">

<div class="logo">

Smart Banking

</div>

<div class="user">

Welcome,

<b><%=customer.getName()%></b>

</div>

</div>

<div class="dashboard">

<div class="welcome-card">

<div>

<h1>

Hello,

<%=customer.getName()%> 

</h1>

<p>

Welcome back to Smart Banking.

Manage your account securely.

</p>

</div>

<i class="fa-solid fa-building-columns"
style="font-size:70px;opacity:.3;"></i>

</div>

<div class="dashboard-grid">

<div class="profile-card">

<h2>

Profile Information

</h2>

<table class="profile-table">

<tr>

<td>Account Number</td>

<td><%=customer.getAccountNo()%></td>

</tr>

<tr>

<td>Account Type</td>

<td><%=customer.getAccountType()%></td>

</tr>

<tr>

<td>Email</td>

<td><%=customer.getEmail()%></td>

</tr>

<tr>

<td>Phone</td>

<td><%=customer.getPhone()%></td>

</tr>

<tr>

<td>Address</td>

<td><%=customer.getAddress()%></td>

</tr>

</table>

</div>

<div class="balance-box">

<h4>

Available Balance

</h4>

<h1>

? <%=String.format("%,.2f",customer.getBalance())%>

</h1>

</div>

</div>

<div class="stats">

<div class="stat">

<h2>24/7</h2>

<p>Secure Banking</p>

</div>

<div class="stat">

<h2>100%</h2>

<p>Safe Transactions</p>

</div>

<div class="stat">

<h2>Online</h2>

<p>Account Access</p>

</div>

</div>

<div class="action-grid">

<a href="deposit.jsp" class="action deposit">

<i class="fa-solid fa-money-bill-wave"></i>

<h3>Deposit</h3>

<p>Add Money</p>

</a>

<a href="withdraw.jsp" class="action withdraw">

<i class="fa-solid fa-wallet"></i>

<h3>Withdraw</h3>

<p>Withdraw Funds</p>

</a>

<a href="transfer.jsp" class="action transfer">

<i class="fa-solid fa-right-left"></i>

<h3>Transfer</h3>

<p>Transfer Money</p>

</a>

<a href="history.jsp" class="action history">

<i class="fa-solid fa-clock-rotate-left"></i>

<h3>History</h3>

<p>View Transactions</p>

</a>

<a href="LogoutServlet" class="action logout">

<i class="fa-solid fa-right-from-bracket"></i>

<h3>Logout</h3>

<p>Sign Out</p>

</a>

</div>

</div>

<footer>

© 2026 Smart Banking System

<br>

Developed by <b>Shreya Lathi</b>

</footer>

</body>

</html>