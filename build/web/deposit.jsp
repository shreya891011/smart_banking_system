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

<title>Deposit Money</title>

<link rel="stylesheet" href="css/style.css">

<link rel="stylesheet"
href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css">

<script src="js/validation.js"></script>

</head>

<body>

<div class="navbar">

<div class="logo">? Smart Banking</div>

<div class="user"><%=customer.getName()%></div>

</div>

<div class="transaction-container">

<div class="transaction-grid">

<div class="info-panel">

<h2>Account Summary</h2>

<p><b>Account No:</b> <%=customer.getAccountNo()%></p>

<p><b>Account Type:</b> <%=customer.getAccountType()%></p>

<div class="balance-display">

<h4>Current Balance</h4>

<h1>? <%=String.format("%,.2f",customer.getBalance())%></h1>

</div>

</div>

<div class="transaction-form">

<h2>? Deposit Money</h2>

<form action="DepositServlet"
method="post"
onsubmit="return validateAmount()">

<input
type="number"
id="amount"
name="amount"
placeholder="Enter Deposit Amount"
required>

<button class="btn btn-green">

Deposit Money

</button>

</form>

<a class="back-dashboard"
href="dashboard.jsp">

? Back to Dashboard

</a>

</div>

</div>

</div>

<footer>

© 2026 Smart Banking System

</footer>

</body>

</html>