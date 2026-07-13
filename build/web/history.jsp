<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import="java.sql.ResultSet"%>
<%@page import="dao.TransactionDAO"%>
<%@page import="model.Customer"%>

<%
Customer customer=(Customer)session.getAttribute("customer");

if(customer==null){

response.sendRedirect("login.jsp");

return;

}

TransactionDAO dao=new TransactionDAO();

ResultSet rs=dao.getTransactions(customer.getAccountNo());

%>

<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">

<title>Transaction History</title>

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

<%=customer.getName()%>

</div>

</div>

<div class="history-wrapper">

<div class="history-header">

<div>

<h2>

<i class="fa-solid fa-clock-rotate-left"></i>

Transaction History

</h2>

<p>

View all your banking activities

</p>

</div>

</div>

<div class="history-card">

<table class="history-table">

<tr>

<th>Date</th>

<th>Transaction</th>

<th>Amount</th>

<th>Balance</th>

</tr>

<%

boolean found=false;

while(rs.next()){

found=true;

String type=rs.getString("transaction_type");

%>

<tr>

<td>

<%=rs.getTimestamp("transaction_date")%>

</td>

<td>

<%

if(type.equalsIgnoreCase("Deposit")){

%>

<span class="deposit-color">

Deposit

</span>

<%

}else if(type.equalsIgnoreCase("Withdraw")){

%>

<span class="withdraw-color">

Withdraw

</span>

<%

}else if(type.equalsIgnoreCase("Transfer")){

%>

<span class="transfer-color">

Transfer

</span>

<%

}else{

%>

<span class="receive-color">

Received

</span>

<%

}

%>

</td>

<td>

₹ <%=String.format("%,.2f",rs.getDouble("amount"))%>

</td>

<td>

₹ <%=String.format("%,.2f",rs.getDouble("balance_after"))%>

</td>

</tr>

<%

}

if(!found){

%>

<tr>

<td colspan="4">

<div class="no-record">

No Transactions Found

</div>

</td>

</tr>

<%

}

%>

</table>

<a
href="dashboard.jsp"
class="back-btn">

<i class="fa-solid fa-arrow-left"></i>

Back to Dashboard

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