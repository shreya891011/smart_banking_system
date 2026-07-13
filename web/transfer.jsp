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

    <title>Transfer Money | Smart Banking System</title>

    <link rel="stylesheet" href="css/style.css">

    <link rel="stylesheet"
          href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css">

    <script src="js/validation.js"></script>

</head>

<body>

<!-- ================= NAVBAR ================= -->

<div class="navbar">

    <div class="logo">

        🏦 Smart Banking

    </div>

    <div class="user">

        Welcome,

        <b><%=customer.getName()%></b>

    </div>

</div>

<!-- ================= PAGE ================= -->

<div class="transaction-container">

    <div class="transaction-grid">

        <!-- LEFT PANEL -->

        <div class="info-panel">

            <h2>

                <i class="fa-solid fa-user"></i>

                Account Details

            </h2>

            <hr>

            <br>

            <p>

                <strong>Account Holder</strong><br>

                <%=customer.getName()%>

            </p>

            <br>

            <p>

                <strong>Account Number</strong><br>

                <%=customer.getAccountNo()%>

            </p>

            <br>

            <p>

                <strong>Account Type</strong><br>

                <%=customer.getAccountType()%>

            </p>

            <div class="balance-display">

                <h4>

                    Available Balance

                </h4>

                <h1>

                    ₹ <%=String.format("%,.2f",customer.getBalance())%>

                </h1>

            </div>

        </div>

        <!-- RIGHT PANEL -->

        <div class="transaction-form">

            <h2>

                <i class="fa-solid fa-right-left"></i>

                Transfer Money

            </h2>

            <form action="TransferServlet"
                  method="post"
                  onsubmit="return validateTransfer()">

                <div class="input-field">

                    <i class="fa-solid fa-building-columns"></i>

                    <input
                        type="text"
                        name="receiver"
                        placeholder="Receiver Account Number"
                        required>

                </div>

                <div class="input-field">

                    <i class="fa-solid fa-indian-rupee-sign"></i>

                    <input
                        type="number"
                        id="amount"
                        name="amount"
                        placeholder="Transfer Amount"
                        min="1"
                        step="0.01"
                        required>

                </div>

                <button
                    type="submit"
                    class="btn btn-blue">

                    <i class="fa-solid fa-paper-plane"></i>

                    Transfer Money

                </button>

            </form>

            <br>

            <a
                href="dashboard.jsp"
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