<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.Customer"%>

<%
    Customer customer = (Customer) session.getAttribute("customer");

    if (customer == null) {
        response.sendRedirect("login.jsp");
        return;
    }
%>

<!DOCTYPE html>
<html>
<head>

    <meta charset="UTF-8">

    <title>Withdraw Money | Smart Banking System</title>

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
        Welcome, <b><%= customer.getName()%></b>
    </div>

</div>


<div class="transaction-container">

    <div class="transaction-grid">

        <div class="info-panel">

            <h2>
                <i class="fa-solid fa-user"></i>
                Account Details
            </h2>

            <hr><br>

            <p>
                <strong>Account Number :</strong><br>
                <%= customer.getAccountNo()%>
            </p>

            <br>

            <p>
                <strong>Account Type :</strong><br>
                <%= customer.getAccountType()%>
            </p>

            <br>

            <p>
                <strong>Customer :</strong><br>
                <%= customer.getName()%>
            </p>

            <div class="balance-display">

                <h4>Current Balance</h4>

                <h1>
                    ₹ <%= String.format("%,.2f", customer.getBalance())%>
                </h1>

            </div>

        </div>
        <div class="transaction-form">

            <h2>

                <i class="fa-solid fa-wallet"></i>

                Withdraw Money

            </h2>

            <form action="WithdrawServlet"
                  method="post"
                  onsubmit="return validateAmount()">

                <input
                    type="number"
                    id="amount"
                    name="amount"
                    placeholder="Enter Withdraw Amount"
                    min="1"
                    step="0.01"
                    required>

                <button
                    type="submit"
                    class="btn btn-orange">

                    <i class="fa-solid fa-money-bill-transfer"></i>

                    Withdraw Money

                </button>

            </form>

            <br>

            <a href="dashboard.jsp"
               class="back-dashboard">

                <i class="fa-solid fa-arrow-left"></i>

                Back to Dashboard

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